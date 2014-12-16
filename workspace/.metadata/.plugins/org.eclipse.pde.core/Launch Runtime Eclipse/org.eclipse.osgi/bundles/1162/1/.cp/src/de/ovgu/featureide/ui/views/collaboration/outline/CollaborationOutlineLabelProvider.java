/* FeatureIDE - A Framework for Feature-Oriented Software Development
 * Copyright (C) 2005-2013  FeatureIDE team, University of Magdeburg, Germany
 *
 * This file is part of FeatureIDE.
 * 
 * FeatureIDE is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * FeatureIDE is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with FeatureIDE.  If not, see <http://www.gnu.org/licenses/>.
 *
 * See http://www.fosd.de/featureide/ for further information.
 */
package de.ovgu.featureide.ui.views.collaboration.outline;

import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.TreeItem;

import de.ovgu.featureide.core.fstmodel.FSTClass;
import de.ovgu.featureide.core.fstmodel.FSTFeature;
import de.ovgu.featureide.core.fstmodel.FSTField;
import de.ovgu.featureide.core.fstmodel.FSTMethod;
import de.ovgu.featureide.core.fstmodel.FSTRole;
import de.ovgu.featureide.core.fstmodel.RoleElement;
import de.ovgu.featureide.core.fstmodel.preprocessor.FSTDirective;
import de.ovgu.featureide.ui.views.collaboration.GUIDefaults;

/**
 * Provides labels and images for Collaboration outline
 * 
 * @author Jan Wedding
 * @author Melanie Pflaume
 */
public class CollaborationOutlineLabelProvider extends OutlineLabelProvider implements GUIDefaults {

	@Override
	public void addListener(ILabelProviderListener listener) {}

	@Override
	public void dispose() {}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {}

	@Override
	public Image getImage(Object element) {
		if (element instanceof RoleElement) {
			RoleElement fstModelElement = (RoleElement)element;
			if (fstModelElement instanceof FSTField) {
				FSTField field = (FSTField)fstModelElement;
				if (field.isPrivate())
					return IMAGE_FIELD_PRIVATE;
				else if (field.isProtected())
					return IMAGE_FIELD_PROTECTED;
				else if (field.isPublic())
					return IMAGE_FIELD_PUBLIC;
				else 
					return IMAGE_FIELD_DEFAULT;
			} else if (fstModelElement instanceof FSTMethod) {
				FSTMethod method = (FSTMethod)fstModelElement;
				if (method.isPrivate())			
					return IMAGE_METHODE_PRIVATE;
				else if (method.isProtected())
					return IMAGE_METHODE_PROTECTED;
				else if (method.isPublic())
					return IMAGE_METHODE_PUBLIC;
				else 
					return IMAGE_METHODE_DEFAULT;
			}
		} else if (element instanceof FSTClass) {
			return IMAGE_CLASS;
		}
		return null;
	}

	@Override
	public String getText(Object element) {
		if (element instanceof  FSTClass) {
			FSTClass fstclass = (FSTClass) element;
			String toAppend = ""; 
			for (FSTRole r : fstclass.getRoles()) {
				if (!r.getDirectives().isEmpty()) {
					return fstclass.getName();
				}
				if (r.getFile().equals(file)) {
					toAppend = " - " + r.getFeature().getName();
				}
			}
			return fstclass.getName() + toAppend;
		}
		
		if (element instanceof FSTMethod)
			return ((FSTMethod)element).getFullName();
		
		if (element instanceof FSTField)
			return ((FSTField)element).getFullName();
		
		if (element instanceof FSTFeature)
			return ((FSTFeature)element).getName();
		
		if (element instanceof FSTRole)
			return ((FSTRole)element).getFeature().getName();
		
		if (element instanceof FSTDirective) {
			return ((FSTDirective)element).toString();
		}
		
		if (element instanceof String)
			return (String) element;
		
		return "";
	}
	
	
	public void colorizeItems(TreeItem[] treeItems) {
		for (int i = 0; i < treeItems.length; i++) {
			if (treeItems[i].getData() instanceof RoleElement) {
				setForeground(treeItems[i]);
			} else if (treeItems[i].getData() instanceof FSTRole) {
				if (((FSTRole) treeItems[i].getData()).getFile().equals(file)) {
					// get old Font and simply make it bold
					treeItems[i].setFont(new Font(treeItems[i].getDisplay(),
									treeItems[i].getFont().getFontData()[0]
											.getName(), treeItems[i].getFont()
											.getFontData()[0].getHeight(),
									SWT.BOLD));
					
				} else {
					treeItems[i].setFont(new Font(treeItems[i].getDisplay(),
						treeItems[i].getFont().getFontData()[0].getName(), 
						treeItems[i].getFont().getFontData()[0].getHeight(),
									0));
				}
			}
			if (treeItems[i].getItems().length > 0) {
				colorizeItems(treeItems[i].getItems());
			}
		}
	}

	public void setForeground(TreeItem item) {
		RoleElement element = (RoleElement) item.getData();
		
		for (FSTRole role : element.getRole().getFSTClass().getRoles()) {
			if (!role.getFile().equals(file)) {
				continue;
			}
			if (element instanceof FSTMethod) {
				for (FSTMethod method : role.getMethods()) {
					if (method.comparesTo(element)) {
						item.setForeground(item.getDisplay()
								.getSystemColor(SWT.DEFAULT));
						return;
					}
				}
			}
			if (element instanceof FSTField) {
				for (FSTField field : role.getFields()) {
					if (field.comparesTo(element)) {
						item.setForeground(item.getDisplay()
								.getSystemColor(SWT.DEFAULT));
						return;
					}
				}
			}
		}
		item.setForeground(item.getDisplay().getSystemColor(SWT.COLOR_GRAY));
	}
	
	public String getLabelProvName(){
		return "Collaboration Outline";
	}

	@Override
	public int getOutlineType() {
		return OutlineLabelProvider.OUTLINE_CODE;
	}
	

//	/**
//	 * This method only updates the root and colors
//	 * @return <code>false</code> if the content needs to be replaced
//	 */
//	private boolean refreshContent(IFile iFile2) {
//		if (iFile2 != null && iFile != null) {
//			/** only set the colors of the tree if the content is the same **/
//			TreeItem[] items = viewer.getTree().getItems();
//			if (iFile2.getName().equals(iFile.getName()) && items.length > 0) {
//				TreeItem item = items[0];
//				if (item != null) {
//					if (item.getData() instanceof FSTClass) {
//						if (!hasSameClass((FSTClass) item.getData(), iFile2)) {
//							return false;
//						}
//						iFile = iFile2;
//						String toAppend = " - Composed class"; 
//						for (FSTRole r : ((FSTClass)item.getData()).getRoles()) {
//							if (!r.getDirectives().isEmpty()) {
//								toAppend =  "";
//								break;
//							}
//							if (r.getFile().equals(iFile)) {
//								toAppend = " - " + r.getFeature().getName();
//								break;
//							}
//						}
//						item.setText(((FSTClass)item.getData()).getName()+toAppend);
//						clabel.colorizeItems(viewer.getTree().getItems());
//						return true;
//					}
//				}
//			}
//		}
//		return false;
//	}

//	/**
//	 * @return <code>true</code> if the new input does not change the old content.
//	 */
//	private boolean hasSameClass(FSTClass Class, IFile iFile2) {
//		if (!iFile2.getProject().equals(iFile.getProject())) {
//			return false;
//		}
//		if (isBuildFile(iFile2.getParent(), 
//				CorePlugin.getFeatureProject(iFile2).getBuildFolder())) {
//			return true;
//		}
//		if (isBuildFile(iFile.getParent(), 
//				CorePlugin.getFeatureProject(iFile).getBuildFolder())) {
//			return true;
//		}
//		
//		if (iFile2.equals(iFile)) {
//			return true;
//		}
//		boolean i = false;
//		boolean j = false;
//		for (FSTRole role : Class.getRoles()) {
//			if (role.getFile().equals(iFile)) {
//				i = true;
//			} else if (role.getFile().equals(iFile2)) {
//				j = true;
//			}
//		}
//		return j && i;
//	}

//	/**
//	 * @param parent
//	 * @param buildFolder
//	 * @return <code>true</code> if the build folder contains the given folder
//	 */
//	private boolean isBuildFile(IContainer parent, IFolder buildFolder) {
//		if (parent == null) {
//			return false;
//		}
//		if (parent instanceof IFolder) {
//			if (parent.equals(buildFolder)) {
//				return true;
//			}
//			return isBuildFile(parent.getParent(), buildFolder);
//		}
//		return false;
//	}
	

}
