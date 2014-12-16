/*
 * generated by Xtext
 */
package sdcombin.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import sdcombin.ui.internal.SDCLangActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class SDCLangExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return SDCLangActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return SDCLangActivator.getInstance().getInjector(SDCLangActivator.SDCOMBIN_SDCLANG);
	}
	
}