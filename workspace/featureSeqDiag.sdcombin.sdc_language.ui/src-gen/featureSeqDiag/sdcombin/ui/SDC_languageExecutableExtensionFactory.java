/*
 * generated by Xtext
 */
package featureSeqDiag.sdcombin.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import featureSeqDiag.sdcombin.ui.internal.SDC_languageActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class SDC_languageExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return SDC_languageActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return SDC_languageActivator.getInstance().getInjector(SDC_languageActivator.FEATURESEQDIAG_SDCOMBIN_SDC_LANGUAGE);
	}
	
}