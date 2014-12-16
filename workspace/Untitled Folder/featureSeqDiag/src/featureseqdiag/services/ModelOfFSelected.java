/**
 * 
 */
package featureseqdiag.services;

import java.util.ArrayList;

/**
 * @author O. EL ABED
 * @author R. AHMAD
 *
 */
public class ModelOfFSelected {

	private String featureName;
	ArrayList<ModelOfFSelected> child; 
	private Boolean isRoot;
	private Boolean isAbstract;
	
	/**
	 * 
	 */
	public ModelOfFSelected(String name) {
		this.featureName=name;
		this.child= null;
		this.isRoot= false;
		this.isAbstract= false;
		
	}

	/**
	 * @param featureName
	 * @param child
	 */
	public ModelOfFSelected(String featureName,
			ArrayList<ModelOfFSelected> child) {
		this.featureName = featureName;
		this.child = child;
	}

	/**
	 * @return the featureName
	 */
	public String getFeatureName() {
		return featureName;
	}

	/**
	 * @param featureName the featureName to set
	 */
	public void setFeatureName(String featureName) {
		this.featureName = featureName;
	}

	/**
	 * @return the child
	 */
	public ArrayList<ModelOfFSelected> getChild() {
		return child;
	}

	/**
	 * @param child the child to set
	 */
	public void setChild(ArrayList<ModelOfFSelected> child) {
		this.child = child;
	}

	/**
	 * @return the isRoot
	 */
	public Boolean getIsRoot() {
		return isRoot;
	}

	/**
	 * @param isRoot the isRoot to set
	 */
	public void setIsRoot(Boolean isRoot) {
		
		this.isRoot = isRoot;
	}

	/**
	 * @return the isAbstract
	 */
	public Boolean getIsAbstract() {
		return isAbstract;
	}

	/**
	 * @param isAbstract the isAbstract to set
	 */
	public void setIsAbstract(Boolean isAbstract) {
		this.isAbstract = isAbstract;
	}
	
	/**
	 * @return the researched feature 
	 */
	
	public ModelOfFSelected isModelOfFSelected(String Name) {
		ModelOfFSelected exist = null;

		if (this.getFeatureName().equals(Name)) {
			exist = this;
		} else {
			if (this.child != null) {

				for (int i = 0; i < child.size(); i++) {
					exist = child.get(i).isModelOfFSelected(Name);
					if (exist != null) {
						break;
					}
				}
			}

		}
	
		
	return exist;	
	}
	
	

	
}
