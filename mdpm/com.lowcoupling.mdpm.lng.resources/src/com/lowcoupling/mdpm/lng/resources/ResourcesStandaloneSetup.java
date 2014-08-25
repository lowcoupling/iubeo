
package com.lowcoupling.mdpm.lng.resources;


/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ResourcesStandaloneSetup extends ResourcesStandaloneSetupGenerated{

	public static void doSetup() {
		new ResourcesStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

