/**
 * 
 */
package featureseqdiag.services;

import java.util.ArrayList;
import java.util.HashMap;

import org.eclipse.emf.common.util.EList;

import de.ovgu.featureide.fm.core.Feature;
import featureSeqDiag.sdcombin.sDC_language.Contexte;
import featureSeqDiag.sdcombin.sDC_language.SequenceProg;

/**
 * @author O. EL ABED
 * @author R. AHMAD
 * 
 */
public class CombinationCleaner {

	public static ArrayList<ModelOfFSelected> mlist = new ArrayList<ModelOfFSelected>();
	
	public static ModelOfFSelected M;
	
	public static ModelOfFSelected tryWithConf(Feature feat,
			HashMap<String, Feature> listFeatSelcted) {

		// Si le feature parcouru est le root, càd le premeier élement
		if (feat.isRoot()) {

			ModelOfFSelected mOFS = new ModelOfFSelected(feat.getName());
			ArrayList<ModelOfFSelected> listChild = new ArrayList<ModelOfFSelected>();

			if (feat.isAbstract()) {
				mOFS.setIsAbstract(true);
			}
			if (feat.hasChildren() == true) {

				for (int i = 0; i < feat.getChildrenCount(); i++) {

					ModelOfFSelected M = tryWithConf(feat.getChildren().get(i),
							listFeatSelcted);

					if (M != null) {

						listChild.add(M);

					}
				}
				if (!listChild.isEmpty()) {
					mOFS.setChild(listChild);
				} else {
					mOFS.setChild(null);
				}

			}
			return mOFS;
		}
		// Pour les autre cas que les root
		else {
			// le feature est de type "hidden"
			if (feat.isHidden()) {
				return null;
			} else {
				// le feature n'est pas hidden
				if (feat.isAbstract()) {
					// le feature est abstract
					if (feat.hasChildren()) {
						// le feature a des enfants
						ArrayList<ModelOfFSelected> listChild = new ArrayList<ModelOfFSelected>();
						for (int i = 0; i < feat.getChildrenCount(); i++) {
							ModelOfFSelected M = tryWithConf(feat.getChildren()
									.get(i), listFeatSelcted);

							if (M != null) {
								listChild.add(M);
							}
						}
						if (listChild.size() != 0) {
							ModelOfFSelected mOFS = new ModelOfFSelected(
									feat.getName());
							mOFS.setIsAbstract(true);
							mOFS.setChild(listChild);
							return mOFS;
						} else {
							// pas d'enfant selectionné et absract
							return null;
						}

					} else {
						// pas d'enfant et absract
						return null;
					}
				} else {
					// le feature n'est pas absract
					if (listFeatSelcted.containsKey(feat.getName())) {
						// le feature est selectionne dans config
						ModelOfFSelected mOFS = new ModelOfFSelected(
								feat.getName());
						if (feat.hasChildren()) {
							// le feature a des enfants

							ArrayList<ModelOfFSelected> listChild = new ArrayList<ModelOfFSelected>();

							for (int i = 0; i < feat.getChildrenCount(); i++) {

								ModelOfFSelected M = tryWithConf(feat
										.getChildren().get(i), listFeatSelcted);

								if (M != null) {
									listChild.add(M);
								}
							}

							if (listChild.size() != 0) {
								mOFS.setChild(listChild);
							}

						}

						return mOFS;

					} else {
						// il n'est pas selectionné dans le config
						return null;
					}
				}

			}

		}

	}

	public static String getlinkedFeatureName(ModelOfFSelected M) {
		// Méthode qui retourne une la partie feature dans le fichier de
		// combinaison sdc
		// feature{
		// f1
		// f2
		// ...
		// }

		if (M.getChild() != null) {
			String rpc = "";
			for (int i = 0; i < M.getChild().size(); i++) {
				rpc += getlinkedFeatureName(M.getChild().get(i));
			}
			return rpc;
		} else {

			return M.getFeatureName() + "\n";
		}

	}

	public static String getlinkedFeatureNameWithSeq(ModelOfFSelected M) {
		// méthode à utiliser pour
		// seq f1 seq f2 seq ...seq fn
		// Combinaison{
		// .....
		// }
		if (M.getChild() != null) {
			String rpc = "";
			if(M.getChild().size() == 1){
				rpc += getlinkedFeatureNameWithSeq(M.getChild().get(0));
			}else{
				for (int i = 0; i < M.getChild().size(); i++) {
					if(i != M.getChild().size()-1){
						rpc += "alt [ \""+  M.getChild().get(i).getFeatureName() +"\" ] {\n";
						rpc += getlinkedFeatureNameWithSeq(M.getChild().get(i));
						rpc += " else \n";
					}else{
						rpc += getlinkedFeatureNameWithSeq(M.getChild().get(i));
						for(int j = 0; j < i; j++)
						rpc += "\n}\n";
					}
						
				}
			}
			return rpc;

		} else {
			return M.getFeatureName() + "\n";

		}

	}

	private static String ContexteGenerator(EList<Contexte> seqContext) {
		String ctx = "";
		for (int i = 0; i < seqContext.size(); i++) {
			boolean deletedF = false;

			
			// si Feature != null
			if (seqContext.get(i).getObjof() != null) {
				if (seqContext.get(i).getObjof().getName().length() > 1){
				int k;
				for (k = 0; k < mlist.size(); k++) {
					if (mlist.get(k).getFeatureName()
							.equals(seqContext.get(i).getObjof().getName())) {
						ctx = getlinkedFeatureNameWithSeq(mlist.get(k));
						break;
					}
				}

				if (k == mlist.size()) {
					deletedF = true;
				}

				// if sequnece liste != null
				if (seqContext.get(i).getSequence() != null) {
					Boolean seqchar=false;
					
					if (deletedF == false) {
						ctx += " seq \n";
						seqchar=true;
					}
					int j;
					for (j = 0; j < seqContext.get(i).getSequence().getObjofR()
							.size(); j++) {

						int h;
						for (h = 0; h < mlist.size(); h++) {
							if (mlist
									.get(h)
									.getFeatureName()
									.equals(seqContext.get(i).getSequence()
											.getObjofR().get(j).getName())) {
								if(!seqchar){
									ctx += " seq \n";
								}
								ctx += getlinkedFeatureNameWithSeq(mlist.get(h));
								seqchar=false;
								break;
							}
						}
						if (h == mlist.size()) {
							deletedF = true;
						}

					}
				}
				
			}
				continue;
			}
			

			// si Alternative !=null
			if (seqContext.get(i).getAlternative() != null) {

				if ((seqContext.get(i).getAlternative().getContexteELSE() == null)
						&& (seqContext.get(i).getAlternative().getContexteIF() == null)) {
					deletedF = true;
				} else {
					String rpif = "";
					String rpelse = "";

					// ecrire les itération des IF
					if (seqContext.get(i).getAlternative().getContexteIF() != null) {

						rpif += ContexteGenerator(seqContext.get(i)
								.getAlternative().getContexteIF());
					}
					// ecrire les else
					if (seqContext.get(i).getAlternative().getContexteELSE() != null) {
						rpelse += ContexteGenerator(seqContext.get(i)
								.getAlternative().getContexteELSE());
					}

					if (rpif.equals("") && rpelse.equals("")) {
						deletedF = true;
					} else {
						// ecrire la condition de l'alt
						ctx += "alt [\""
								+ seqContext.get(i).getAlternative()
										.getConditionAlt().getCondition()
								+ "\"] {\n";
						ctx += rpif;
						ctx += " else \n";
						ctx += rpelse;
						ctx += "\n}\n";

					}
				}
				continue;
			}
			

			// // si Loop != null
			if (seqContext.get(i).getLoop() != null) {
				String looprp = "";
				looprp += ContexteGenerator(seqContext.get(i).getLoop()
						.getContexte());

				if (looprp.equals("")) {
					deletedF = true;
				} else {
					// ecrire la condition de l'alt
					ctx += "loop [\""
							+ seqContext.get(i).getLoop().getCondition()
									.getCondition() + "\"] {\n";
					ctx += looprp;
					ctx += "\n}\n";

				}
				continue;
			}
			// // si Option != null
			if (seqContext.get(i).getOption() != null) {
				String optprp = "";
				optprp += ContexteGenerator(seqContext.get(i).getOption()
						.getContexte());

				if (optprp.equals("")) {
					deletedF = true;
				} else {
					// ecrire la condition de l'alt
					ctx += "opt [\""
							+ seqContext.get(i).getOption().getConditionOpt()
									.getCondition() + "\"] {\n";
					ctx += optprp;
					ctx += "\n}\n";

				}
				continue;
			}
		///
			
		}
		return ctx;
	}

	public static String CleanSysComb(SequenceProg seqProg,
			HashMap<String, Feature> selectedFeatures, Feature featureroot) {

		ArrayList<ModelOfFSelected> plist = new ArrayList<ModelOfFSelected>();
		M = null;
		M = tryWithConf(featureroot, selectedFeatures);
		
		//set the root feature in the sdTreelist 
		SDGenerator.restartLists();
		if (!M.getIsAbstract()) {
			String pathFetsd="";
			pathFetsd = SDGenerator.searchSDFile(M.getFeatureName());
			if (pathFetsd != "") {
				SDGenerator.sdlist.put(M.getFeatureName(),pathFetsd);
			}
			
		}

		String sOut = "";
		String newligne = System.getProperty("line.separator");
	
		// Début de construction du nouveau fichier SDC
		sOut += "Features {\n";
		// //ajouterles features selectionnées
		
		for (int i = 0; i < seqProg.getFeatures().size(); i++) {
			ModelOfFSelected Mi = M.isModelOfFSelected(seqProg.getFeatures()
					.get(i).getName());
			
			if (Mi != null && !Mi.getFeatureName().equals(M.getFeatureName())) {
				plist.add(Mi);
				SDGenerator.setSDLists(Mi);
			}
		}
		
		mlist = null;
		mlist = plist;

		for (int i = 0; i < plist.size(); i++) {

			sOut += getlinkedFeatureName(plist.get(i));
		}

		// fin d'ajout des feature
		sOut += "}\n";
		sOut += newligne;
		sOut += "Combination {\n";
		// ajouter la combinaison

		// on utilise la fonction
		sOut += ContexteGenerator(seqProg.getContexte());

		// //fin de génerer la combinaison
		sOut += "}\n";
		return sOut;

	}

}
