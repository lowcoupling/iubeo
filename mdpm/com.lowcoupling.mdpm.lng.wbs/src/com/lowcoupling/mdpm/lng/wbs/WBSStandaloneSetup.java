
package com.lowcoupling.mdpm.lng.wbs;


/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class WBSStandaloneSetup extends WBSStandaloneSetupGenerated{

	public static void doSetup() {
		new WBSStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

