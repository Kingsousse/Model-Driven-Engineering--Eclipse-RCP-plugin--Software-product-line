package featureSeqDiag.sdcombin.runner;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import featureSeqDiag.sdcombin.SDC_languageStandaloneSetupGenerated;
import featureSeqDiag.sdcombin.sDC_language.SequenceProg;

public class SdcRunner {

	
	public static SequenceProg ParseSDCProgram(String uri){

    	new SDC_languageStandaloneSetupGenerated().createInjectorAndDoEMFRegistration();
        ResourceSet resourceSet = new ResourceSetImpl();
        
        File profileUrl = new File(uri);
        java.net.URI javaURI = profileUrl.toURI();
        URI emfURI = URI.createURI(javaURI.toString());
        
        //Resource resource = resourceSet.getResource(URI.createURI(uri,true),true);
        Resource resource = resourceSet.getResource(emfURI,true);
        
        
        EObject eobject = resource.getContents().get(0); // récupération de la racine de l'arbre syntaxique du programme
        
        SequenceProg SequProgramme = (SequenceProg) eobject;
               
        return SequProgramme;
    }
	public static void main(String[] args) {
		

	}

}
