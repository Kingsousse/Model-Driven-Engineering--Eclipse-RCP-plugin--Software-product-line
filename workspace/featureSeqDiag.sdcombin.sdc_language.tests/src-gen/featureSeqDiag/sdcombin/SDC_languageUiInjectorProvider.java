/*
* generated by Xtext
*/
package featureSeqDiag.sdcombin;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class SDC_languageUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return featureSeqDiag.sdcombin.ui.internal.SDC_languageActivator.getInstance().getInjector("featureSeqDiag.sdcombin.SDC_language");
	}
	
}
