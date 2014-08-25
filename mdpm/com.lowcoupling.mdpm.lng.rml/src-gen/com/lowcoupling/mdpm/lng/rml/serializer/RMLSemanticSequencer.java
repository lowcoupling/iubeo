package com.lowcoupling.mdpm.lng.rml.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.lowcoupling.mdpm.lng.rml.rML.Model;
import com.lowcoupling.mdpm.lng.rml.rML.REQPackage;
import com.lowcoupling.mdpm.lng.rml.rML.REQRequirement;
import com.lowcoupling.mdpm.lng.rml.rML.RMLPackage;
import com.lowcoupling.mdpm.lng.rml.services.RMLGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class RMLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RMLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == RMLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case RMLPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case RMLPackage.REQ_PACKAGE:
				if(context == grammarAccess.getREQNodeRule() ||
				   context == grammarAccess.getREQPackageRule()) {
					sequence_REQPackage(context, (REQPackage) semanticObject); 
					return; 
				}
				else break;
			case RMLPackage.REQ_REQUIREMENT:
				if(context == grammarAccess.getREQNodeRule() ||
				   context == grammarAccess.getREQRequirementRule()) {
					sequence_REQRequirement(context, (REQRequirement) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     packages+=REQPackage*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID package+=REQPackage? requirements+=REQRequirement*)
	 */
	protected void sequence_REQPackage(EObject context, REQPackage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID text=STRING)
	 */
	protected void sequence_REQRequirement(EObject context, REQRequirement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RMLPackage.Literals.REQ_NODE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RMLPackage.Literals.REQ_NODE__NAME));
			if(transientValues.isValueTransient(semanticObject, RMLPackage.Literals.REQ_REQUIREMENT__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RMLPackage.Literals.REQ_REQUIREMENT__TEXT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getREQRequirementAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getREQRequirementAccess().getTextSTRINGTerminalRuleCall_2_0(), semanticObject.getText());
		feeder.finish();
	}
}
