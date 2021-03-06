/**
 * 
 */
package featureseqdiag;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;

import runner.SdclRunner;
import sdcombin.sDCLang.SequenceProg;
import de.ovgu.featureide.core.IFeatureProject;
import de.ovgu.featureide.core.builder.ComposerExtensionClass;
import de.ovgu.featureide.fm.core.Feature;
import de.ovgu.featureide.fm.core.configuration.Configuration;
import de.ovgu.featureide.fm.core.configuration.ConfigurationReader;
import featureseqdiag.services.CombinationCleaner;
import featureseqdiag.services.SDGenerator;

/**
 * @author O. EL ABED
 * @author R. AHMAD
 * 
 */
public class FeatureSDComposer extends ComposerExtensionClass {

	/**
	 * 
	 */
	// public FeatureSDComposer() {
	// // TODO Auto-generated constructor stub
	// }

	private static String separator = "/";

	private static String result = "SDGenerated";

	private HashMap<String, Feature> selectedFeatures;

	private ArrayList<String> erreurs;

	@Override
	public boolean initialize(IFeatureProject project) {
		if (System.getProperty("os.name").contains("Windows")) {
			separator = "\\";
		}
		boolean supSuccess = super.initialize(project);
		selectedFeatures = new HashMap<>();
		erreurs = new ArrayList<>();
		if (supSuccess == false) {
			return false;
		} else {
			return true;
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.ovgu.featureide.core.builder.IComposerExtensionClass#performFullBuild
	 * (org.eclipse.core.resources.IFile)
	 */
	@Override
	public void performFullBuild(IFile config) {

		if (config == null) {
			erreurs.add("Can't read the file!");
			return;
		}

		assert (featureProject != null) : "Invalid project given";

		final String configPath = config.getRawLocation().toOSString();
		final String outputPath = featureProject.getBuildPath();

		if (configPath == null || outputPath == null)
			return;

		Configuration configuration = new Configuration(
				featureProject.getFeatureModel());
		ConfigurationReader reader = new ConfigurationReader(configuration);

		try {
			reader.readFromFile(config);
		} catch (CoreException e) {
			FeatureSDCorePlugin.getDefault().logInfo("Debug");
		} catch (IOException e) {
			FeatureSDCorePlugin.getDefault().logInfo("Debug");
		}

		for (Feature feature : configuration.getSelectedFeatures()) {
			selectedFeatures.put(feature.getName(), feature);
			System.out.println(feature.getName());
		}

		IProject p = featureProject.getProject();

		if (p != null) {

			String configname = featureProject.getCurrentConfiguration()
					.getName();
			String spconfig[] = configname.split(".config");

			String path = featureProject.getBuildFolder().getLocationURI()
					.getPath();
			File root = new File(path).getParentFile();
			File dir = new File(root.getAbsolutePath() + separator + result);

			//
			//
			if (dir.exists()) {
				DeleteDir(dir);
			}
			//
			if ((dir.mkdirs()) == true) {
				// // On prend le fichier SysCombin.sdcl créer par l'utilsateur
				// // qui contient la combinaison et l'enchainement entre les
				// features
				//
				String cheminFeature = root.getAbsolutePath() + separator
						+ "features";
				String featureRootName = configuration.getFeatureModel()
						.getRoot().getName();
				File featureRoot = new File(cheminFeature + separator
						+ featureRootName);
				File fileSysCombin = new File(featureRoot + separator
						+ "SysCombin.sdcl");

				assert (fileSysCombin.exists()) : "File SysCombin.sdcl not found! ";

				Feature fRoot = configuration.getFeatureModel().getRoot();
				SequenceProg sysComb = SdclRunner
						.ParseSDCLProgram(fileSysCombin.getAbsolutePath());
				FileWriter newSysCombFile = null;
				SDGenerator.pathFeatures=root.getAbsolutePath() + separator + "features";
				SDGenerator.separator=separator;
				try {

					newSysCombFile = new FileWriter(root.getAbsolutePath()
							+ separator + result + separator + spconfig[0]
							+ "_config_" + "SysCombin.sdcl");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				String sOut = CombinationCleaner.CleanSysComb(sysComb,
						selectedFeatures, fRoot);
				// Writing the new newSysCombFile.sdcl after cleaning
				try {
					newSysCombFile.write(sOut);
					newSysCombFile.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				// writing the Final Sequence diagramme
				// Parsing the new Sys combine file  
//				File newConfSysCombFile = new File(root.getAbsolutePath()
//						+ separator + result + separator + spconfig[0]
//						+ "_config_" + "SysCombin.sdcl");
//
//				SequenceProg cleanedSysComb = SdclRunner
//						.ParseSDCLProgram(newConfSysCombFile.getAbsolutePath());
//				
				
				

				// Creat Filewriter for SDFinalFile
				FileWriter FinalSDFile = null;
				try {

					FinalSDFile = new FileWriter(root.getAbsolutePath()
							+ separator + result + separator + spconfig[0]
							+ "_config_" + "FinalSD.sdel");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				String sdeOut = SDGenerator.unifyingSDfile(sysComb,					
						spconfig[0] + "_config_" + "FinalSD.sdel", separator);
				// Writing the new newSysCombFile.sdcl after cleaning
				try {
					FinalSDFile.write(sdeOut);
					FinalSDFile.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				// End of Writing File

			}

		}

	}

	private static void DeleteDir(File r) {
		if (r.isDirectory()) {
			DeleteAll(r);
		}
		r.delete();
	}

	private static void DeleteAll(File r) {
		File[] fileList = r.listFiles();
		for (int i = 0; i < fileList.length; i++) {
			if (fileList[i].isDirectory()) {
				DeleteAll(fileList[i]);
				fileList[i].delete();
			} else {
				fileList[i].delete();
			}
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.ovgu.featureide.core.builder.IComposerExtensionClass#
	 * getGenerationMechanism()
	 */
	@Override
	public Mechanism getGenerationMechanism() {

		return null;
	}

}
