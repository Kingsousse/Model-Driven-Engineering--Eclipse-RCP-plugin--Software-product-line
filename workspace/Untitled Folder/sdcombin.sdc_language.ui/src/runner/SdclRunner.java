package runner;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import sdcombin.SDCLangStandaloneSetupGenerated;
import sdcombin.sDCLang.SequenceProg;



public class SdclRunner {
	
	 public static SequenceProg ParseSDCLProgram(String uri){

	    	new SDCLangStandaloneSetupGenerated().createInjectorAndDoEMFRegistration();
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
	    
	    public static void main(String[] args){
	    	
	    	SequenceProg st = ParseSDCLProgram("/users/nfs/Etu6/3303726/workspace/featureSDGenerator.sdcombin_lang.ui/src/run/root.sdcl");
	    	
	    	//Statemachine st = ParseLtsProgram("src/test.lts");
	    	
	    	String result = st.getFeatures().get(1).getName();
	    	System.out.println(result);
	    	
	    }

}
