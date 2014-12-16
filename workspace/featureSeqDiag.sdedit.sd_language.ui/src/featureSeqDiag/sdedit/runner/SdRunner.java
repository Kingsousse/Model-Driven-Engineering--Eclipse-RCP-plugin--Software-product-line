package featureSeqDiag.sdedit.runner;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import featureSeqDiag.sdedit.SD_languageStandaloneSetupGenerated;
import featureSeqDiag.sdedit.sD_language.SDEditModel;

public class SdRunner {

	public static SDEditModel ParseSDProgram(String uri) {

		new SD_languageStandaloneSetupGenerated()
				.createInjectorAndDoEMFRegistration();
		ResourceSet resourceSet = new ResourceSetImpl();

		File profileUrl = new File(uri);
		java.net.URI javaURI = profileUrl.toURI();
		URI emfURI = URI.createURI(javaURI.toString());

		// Resource resource =
		// resourceSet.getResource(URI.createURI(uri,true),true);
		Resource resource = resourceSet.getResource(emfURI, true);

		EObject eobject = resource.getContents().get(0); // récupération de la
															// racine de l'arbre
															// syntaxique du
															// programme

		SDEditModel SequProgramme = (SDEditModel) eobject;

		return SequProgramme;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
