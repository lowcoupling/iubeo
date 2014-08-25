package com.lowcoupling.mdpm.lng.pbs.serializer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;

import com.google.inject.Inject;
import com.lowcoupling.mdpm.lng.pbs.pBS.PBSPackage;
import com.lowcoupling.mdpm.lng.pbs.pBS.Part;
import com.lowcoupling.mdpm.lng.pbs.pBS.Product;
import com.lowcoupling.mdpm.lng.pbs.services.PBSGrammarAccess;

@SuppressWarnings("all")
public class PBSSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private PBSGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == PBSPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case PBSPackage.PART:
				if(context == grammarAccess.getPartRule()) {
					sequence_Part(context, (Part) semanticObject); 
					return; 
				}
				else break;
			case PBSPackage.PRODUCT:
				if(context == grammarAccess.getPBSRule() ||
				   context == grammarAccess.getProductRule()) {
					sequence_Product(context, (Product) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (description=ML_COMMENT? name=ID parts+=Part*)
	 */
	protected void sequence_Part(EObject context, Part semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (description=ML_COMMENT? name=ID parts+=Part*)
	 */
	protected void sequence_Product(EObject context, Product semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
