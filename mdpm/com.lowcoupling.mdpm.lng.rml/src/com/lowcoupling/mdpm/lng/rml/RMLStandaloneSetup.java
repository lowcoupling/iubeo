/*
* generated by Xtext
*/
package com.lowcoupling.mdpm.lng.rml;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class RMLStandaloneSetup extends RMLStandaloneSetupGenerated{

	public static void doSetup() {
		new RMLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

