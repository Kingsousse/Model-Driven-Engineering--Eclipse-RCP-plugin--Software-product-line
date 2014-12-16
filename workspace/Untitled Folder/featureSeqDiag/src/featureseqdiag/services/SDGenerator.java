/**
 * 
 */
package featureseqdiag.services;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.common.util.EList;

import runnerSD.SdelRunner;
import sdcombin.sDCLang.Contexte;
import sdcombin.sDCLang.SequenceProg;
import sdedit.sDELang.SDEditModel;
import sdedit.sDELang.SDEditObj;

/**
 * @author O. EL ABED
 * @author R. AHMAD
 * 
 */
public class SDGenerator {

	/**
	 * 
	 */
	public static String pathFeatures = "";
	private static String SDFileName;
	public static String separator = "";
	private static String errorResponse = "";
	public static HashMap<String, String> sdlist;

	public static String unifyingSDfile(SequenceProg Sc, String SDF, String sep) {

		SDFileName = SDF;
		separator = sep;
		String sdFinal = "";

		// Create Liste of file .sdel associated with Feature
		// error = listSDFileManager();

		if (errorResponse != "") {
			// Traitement du fichier sdedit
			sdFinal += "# Error to generate " + SDFileName + "\n";
			sdFinal += errorResponse;
		}
			sdFinal += ObjectInitSD();
			sdFinal += "\n";
			sdFinal += combineDiagElement(Sc.getContexte());
			

		// Fin Traitement du fichier sdedit

		return sdFinal;

	}

	public static String searchSDFile(String name) {

		String pathFetSdel = "";
		File featDir = new File(pathFeatures);
		File[] listDirFeatsFile = featDir.listFiles();
		String[] listDirFeats = featDir.list();

		int i;
		for (i = 0; i < listDirFeats.length; i++) {
			if (listDirFeatsFile[i].isDirectory()
					&& name.equals(listDirFeats[i])) {

				File featjDir = listDirFeatsFile[i];

				// If the directory of feature is NOT Empty
				if (featjDir.list().length != 0) {

					int k;
					for (k = 0; k < featjDir.list().length; k++) {
						// If the directory of feature contain an ".sdel"
						// file
						if ((featjDir.list())[k].endsWith(".sdel")) {
							pathFetSdel = pathFeatures + separator
									+ listDirFeats[i] + separator
									+ (featjDir.list())[k];
							break;
						}

					}
					// If the directory of feature have NOT an ".sdel" file
					if (k == featjDir.list().length) {
						errorResponse += "# "
								+ listDirFeats[i]
								+ " Directory can NOT FOUND sdedit '.sdel' File in\n";

					}

				}
				// If the directory of feature is Empty
				else {
					errorResponse += "# " + listDirFeats[i]
							+ " Directory is empty\n";
				}
				break;
			}
		}

		return pathFetSdel;
	}

	public static void setSDLists(ModelOfFSelected M){
		
		if(!M.getIsAbstract()){
			sdlist.put(M.getFeatureName(),searchSDFile(M.getFeatureName()));
		}
		
		if (M.child != null) {
			for (int i = 0; i < M.child.size(); i++) {
				setSDLists(M.child.get(i));
			}
		}
		
	}
	
	public static void restartLists() {
		sdlist = new HashMap<String, String>();
	}

	private static String ObjectInitSD() {

		String resultObj = "";
		HashMap<String, SDEditObj> objectlist = new HashMap<String, SDEditObj>();

		Set<String> listKeys = sdlist.keySet();
		Iterator<String> iterateur = listKeys.iterator();

		while (iterateur.hasNext()) {
			String key = iterateur.next();
			SDEditModel sdi = SdelRunner.ParseSDELProgram(sdlist.get(key));
			for (int i = 0; i < sdi.getElements().size(); i++) {

				if (sdi.getElements().get(i) instanceof SDEditObj) {
					SDEditObj sdObj = (SDEditObj) sdi.getElements().get(i);

					if (!objectlist.containsKey(sdObj.getObjName().getName())) {
						objectlist.put(sdObj.getObjName().getName(), sdObj);
						resultObj += searchLine(sdlist.get(key), sdObj
								.getObjName().getName())
								+ "\n";
					}
				}
			}
		}

		return resultObj;
	}

	private static String searchLine(String filepath, String objligne) {
		String line = null;
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(filepath));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			while ((line = br.readLine()) != null) {
				if (line.indexOf(objligne) != -1) {
					break;
				}

			}

			br.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return line;
	}

	private static String combineDiagElement(EList<Contexte> seqContext) {
		String resultComb = "";

		if (!CombinationCleaner.M.getIsAbstract()) {
			if (sdlist.containsKey(CombinationCleaner.M.getFeatureName())) {
				resultComb += getTextFeatSDCombined(sdlist
						.get(CombinationCleaner.M.getFeatureName()));
			}
		}

		for (int i = 0; i < seqContext.size(); i++) {
			if (seqContext.get(i).getObjof() != null) {
				int k;
				for (k = 0; k < CombinationCleaner.mlist.size(); k++) {
					if (CombinationCleaner.mlist.get(k).getFeatureName()
							.equals(seqContext.get(i).getObjof().getName())) {
						resultComb = getlinkedFeatureFileSDWithSeq(CombinationCleaner.mlist
								.get(k));
						break;
					}
				}

				// if sequnece liste != null
				if (seqContext.get(i).getSequence() != null) {

					int j;
					for (j = 0; j < seqContext.get(i).getSequence().getObjofR()
							.size(); j++) {

						int h;
						for (h = 0; h < CombinationCleaner.mlist.size(); h++) {
							if (CombinationCleaner.mlist
									.get(h)
									.getFeatureName()
									.equals(seqContext.get(i).getSequence()
											.getObjofR().get(j).getName())) {
								resultComb += getlinkedFeatureFileSDWithSeq(CombinationCleaner.mlist
										.get(h));
								break;
							}
						}
					}
				}
			}

			// si Alternative !=null
			if (seqContext.get(i).getAlternative() != null) {
				if ((seqContext.get(i).getAlternative().getContexteELSE() != null)
						|| (seqContext.get(i).getAlternative().getContexteIF() != null)) {

					String rpif = "";
					String rpelse = "";

					// ecrire les itération des IF
					if (seqContext.get(i).getAlternative().getContexteIF() != null) {

						rpif += combineDiagElement(seqContext.get(i)
								.getAlternative().getContexteIF());
					}
					// ecrire les else
					if (seqContext.get(i).getAlternative().getContexteELSE() != null) {
						rpelse += combineDiagElement(seqContext.get(i)
								.getAlternative().getContexteELSE());
					}

					if (!rpif.equals("") || !rpelse.equals("")) {

						// ecrire la condition de l'alt
						resultComb += "[c:alt "
								+ seqContext.get(i).getAlternative()
										.getConditionAlt().getCondition()
								+ "]\n";
						resultComb += rpif;
						resultComb += " --[else]\n";
						resultComb += rpelse;
						resultComb += "[/c]\n";

					}
				}

			}

			// si Loop != null
			if (seqContext.get(i).getLoop() != null) {
				String looprp = "";
				looprp += combineDiagElement(seqContext.get(i).getLoop()
						.getContexte());

				if (!looprp.equals("")) {

					// ecrire la condition de l'alt
					resultComb += "[c:loop "
							+ seqContext.get(i).getLoop().getCondition()
									.getCondition() + "]\n";
					resultComb += looprp;
					resultComb += "[/c]\n";

				}

			}

			// si Option != null
			if (seqContext.get(i).getOption() != null) {
				String optprp = "";
				optprp += combineDiagElement(seqContext.get(i).getOption()
						.getContexte());

				if (!optprp.equals("")) {
					// ecrire la condition de l'alt
					resultComb += "[c:opt "
							+ seqContext.get(i).getOption().getConditionOpt()
									.getCondition() + "]\n";
					resultComb += optprp;
					resultComb += "[/c]\n";

				}

			}
		}
		return resultComb;
	}

	private static String getlinkedFeatureFileSDWithSeq(ModelOfFSelected M) {
		String result = "";

		if (!M.getIsAbstract()) {
			if (sdlist.containsKey(M.getFeatureName())) {
				result += getTextFeatSDCombined(sdlist.get(M.getFeatureName()));
			}
		}

		if (M.getChild() != null) {
			for (int i = 0; i < M.getChild().size(); i++) {
				result += getlinkedFeatureFileSDWithSeq(M.getChild().get(i));
			}
		}

		return result;
	}

	private static String getTextFeatSDCombined(String pathFile) {
		String result = "";

		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(pathFile));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			String line = "";
			line = br.readLine();
			while ((line != null) && (line.isEmpty() || line.equals(" "))) {
				line = br.readLine();
			}
			while ((line != null) && !line.isEmpty() && !line.equals(" ")) {
				line = br.readLine();
			}
			while ((line != null) && (line.isEmpty() || line.equals(" "))) {
				line = br.readLine();
			}
			while ((line != null) && !line.isEmpty() && !line.equals(" ")) {
				result += line + "\n";
				line = br.readLine();
			}

			br.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}

}