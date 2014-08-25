package com.lowcoupling.mdpm.lng.wbs.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.lowcoupling.mdpm.lng.wbs.services.WBSGrammarAccess;
import com.lowcoupling.mdpm.lng.wbs.wBS.RequirementImport;
import com.lowcoupling.mdpm.lng.wbs.wBS.WBSActivity;
import com.lowcoupling.mdpm.lng.wbs.wBS.WBSDeliverable;
import com.lowcoupling.mdpm.lng.wbs.wBS.WBSPackage;
import com.lowcoupling.mdpm.lng.wbs.wBS.WBSProgram;
import com.lowcoupling.mdpm.lng.wbs.wBS.WBSProject;
import com.lowcoupling.mdpm.lng.wbs.wBS.WBSWorkPackage;
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
public class WBSSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private WBSGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == WBSPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case WBSPackage.REQUIREMENT_IMPORT:
				if(context == grammarAccess.getRequirementImportRule()) {
					sequence_RequirementImport(context, (RequirementImport) semanticObject); 
					return; 
				}
				else break;
			case WBSPackage.WBS_ACTIVITY:
				if(context == grammarAccess.getWBSActivityRule() ||
				   context == grammarAccess.getWBSNodeRule()) {
					sequence_WBSActivity(context, (WBSActivity) semanticObject); 
					return; 
				}
				else break;
			case WBSPackage.WBS_DELIVERABLE:
				if(context == grammarAccess.getWBSDeliverableRule() ||
				   context == grammarAccess.getWBSNodeRule()) {
					sequence_WBSDeliverable(context, (WBSDeliverable) semanticObject); 
					return; 
				}
				else break;
			case WBSPackage.WBS_PROGRAM:
				if(context == grammarAccess.getWBSRule() ||
				   context == grammarAccess.getWBSProgramRule()) {
					sequence_WBSProgram(context, (WBSProgram) semanticObject); 
					return; 
				}
				else break;
			case WBSPackage.WBS_PROJECT:
				if(context == grammarAccess.getWBSRule() ||
				   context == grammarAccess.getWBSProjectRule()) {
					sequence_WBSProject(context, (WBSProject) semanticObject); 
					return; 
				}
				else break;
			case WBSPackage.WBS_WORK_PACKAGE:
				if(context == grammarAccess.getWBSNodeRule() ||
				   context == grammarAccess.getWBSWorkPackageRule()) {
					sequence_WBSWorkPackage(context, (WBSWorkPackage) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     importURI=STRING
	 */
	protected void sequence_RequirementImport(EObject context, RequirementImport semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, WBSPackage.Literals.REQUIREMENT_IMPORT__IMPORT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WBSPackage.Literals.REQUIREMENT_IMPORT__IMPORT_URI));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRequirementImportAccess().getImportURISTRINGTerminalRuleCall_1_0(), semanticObject.getImportURI());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (description=ML_COMMENT? name=ID (wbsNodes+=WBSNode* requirements+=[REQNode|QualifiedName]?)?)
	 */
	protected void sequence_WBSActivity(EObject context, WBSActivity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (description=ML_COMMENT? name=ID (wbsNodes+=WBSNode* requirements+=[REQNode|QualifiedName]?)?)
	 */
	protected void sequence_WBSDeliverable(EObject context, WBSDeliverable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (description=ML_COMMENT? name=ID requirementsModel+=RequirementImport* projects+=WBSProject* requirements+=[REQNode|QualifiedName]?)
	 */
	protected void sequence_WBSProgram(EObject context, WBSProgram semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (description=ML_COMMENT? name=ID requirementsModel+=RequirementImport* wbsNodes+=WBSNode* requirements+=[REQNode|QualifiedName]?)
	 */
	protected void sequence_WBSProject(EObject context, WBSProject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (description=ML_COMMENT? name=ID (wbsNodes+=WBSNode* requirements+=[REQNode|QualifiedName]?)?)
	 */
	protected void sequence_WBSWorkPackage(EObject context, WBSWorkPackage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
