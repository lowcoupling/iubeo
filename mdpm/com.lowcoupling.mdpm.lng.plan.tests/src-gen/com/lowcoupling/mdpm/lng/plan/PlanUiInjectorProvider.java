/*
* generated by Xtext
*/
package com.lowcoupling.mdpm.lng.plan;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class PlanUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return com.lowcoupling.mdpm.lng.plan.ui.internal.PlanActivator.getInstance().getInjector("com.lowcoupling.mdpm.lng.plan.Plan");
	}
	
}