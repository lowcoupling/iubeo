/*
 * generated by Xtext
 */
package com.lowcoupling.mdpm.lng.pbs.validation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;

public class AbstractPBSValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(com.lowcoupling.mdpm.lng.pbs.pBS.PBSPackage.eINSTANCE);
		return result;
	}
}
