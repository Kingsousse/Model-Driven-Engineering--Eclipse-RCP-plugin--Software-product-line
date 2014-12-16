/**
 * 
 */
package featureseqdiag;

import org.osgi.framework.BundleContext;

import de.ovgu.featureide.core.CorePlugin;
import de.ovgu.featureide.fm.core.AbstractCorePlugin;

/**
 * @author O. EL ABED 
 * @author R. AHMAD
 *
 */
public class FeatureSDCorePlugin extends AbstractCorePlugin {

	public static final String PLUGIN_ID = "featureSeqDiag";

	public static final String BUILDER_PROBLEM_MARKER = CorePlugin.PLUGIN_ID
			+ ".builderProblemMarker";
	
	private static FeatureSDCorePlugin plugin;
	
	@Override
	public String getID() {
		return PLUGIN_ID;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	public static FeatureSDCorePlugin getDefault() {
		return plugin;
	}

}
