/*
* generated by Xtext
*/
package sdcombin;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class SDCLangUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return sdcombin.ui.internal.SDCLangActivator.getInstance().getInjector("sdcombin.SDCLang");
	}
	
}
