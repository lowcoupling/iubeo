package com.lowcoupling.mdpm.lng.plan.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.lowcoupling.mdpm.lng.plan.plan.Activity;
import com.lowcoupling.mdpm.lng.plan.plan.ActivityGroup;
import com.lowcoupling.mdpm.lng.plan.plan.Assumption;
import com.lowcoupling.mdpm.lng.plan.plan.CheckPoint;
import com.lowcoupling.mdpm.lng.plan.plan.Constraint;
import com.lowcoupling.mdpm.lng.plan.plan.PlanImport;
import com.lowcoupling.mdpm.lng.plan.plan.PlanPackage;
import com.lowcoupling.mdpm.lng.plan.plan.Program;
import com.lowcoupling.mdpm.lng.plan.plan.Project;
import com.lowcoupling.mdpm.lng.plan.plan.ResourceInvolvement;
import com.lowcoupling.mdpm.lng.plan.plan.ResourcesImport;
import com.lowcoupling.mdpm.lng.plan.plan.WBSImport;
import com.lowcoupling.mdpm.lng.plan.services.PlanGrammarAccess;
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
public class PlanSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private PlanGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == PlanPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case PlanPackage.ACTIVITY:
				if(context == grammarAccess.getActivityRule() ||
				   context == grammarAccess.getActivityElementRule()) {
					sequence_Activity(context, (Activity) semanticObject); 
					return; 
				}
				else break;
			case PlanPackage.ACTIVITY_GROUP:
				if(context == grammarAccess.getActivityElementRule() ||
				   context == grammarAccess.getActivityGroupRule()) {
					sequence_ActivityGroup(context, (ActivityGroup) semanticObject); 
					return; 
				}
				else break;
			case PlanPackage.ASSUMPTION:
				if(context == grammarAccess.getAssumptionRule()) {
					sequence_Assumption(context, (Assumption) semanticObject); 
					return; 
				}
				else break;
			case PlanPackage.CHECK_POINT:
				if(context == grammarAccess.getActivityElementRule() ||
				   context == grammarAccess.getCheckPointRule()) {
					sequence_CheckPoint(context, (CheckPoint) semanticObject); 
					return; 
				}
				else break;
			case PlanPackage.CONSTRAINT:
				if(context == grammarAccess.getConstraintRule()) {
					sequence_Constraint(context, (Constraint) semanticObject); 
					return; 
				}
				else break;
			case PlanPackage.PLAN_IMPORT:
				if(context == grammarAccess.getPlanImportRule()) {
					sequence_PlanImport(context, (PlanImport) semanticObject); 
					return; 
				}
				else break;
			case PlanPackage.PROGRAM:
				if(context == grammarAccess.getProgramRule()) {
					sequence_Program(context, (Program) semanticObject); 
					return; 
				}
				else break;
			case PlanPackage.PROJECT:
				if(context == grammarAccess.getProjectRule()) {
					sequence_Project(context, (Project) semanticObject); 
					return; 
				}
				else break;
			case PlanPackage.RESOURCE_INVOLVEMENT:
				if(context == grammarAccess.getResourceInvolvementRule()) {
					sequence_ResourceInvolvement(context, (ResourceInvolvement) semanticObject); 
					return; 
				}
				else break;
			case PlanPackage.RESOURCES_IMPORT:
				if(context == grammarAccess.getResourcesImportRule()) {
					sequence_ResourcesImport(context, (ResourcesImport) semanticObject); 
					return; 
				}
				else break;
			case PlanPackage.WBS_IMPORT:
				if(context == grammarAccess.getWBSImportRule()) {
					sequence_WBSImport(context, (WBSImport) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         description=ML_COMMENT? 
	 *         name=ID 
	 *         longName=STRING? 
	 *         wbsActivity+=[WBSNode|QualifiedName]* 
	 *         dependencies+=[ActivityElement|QualifiedName]* 
	 *         activities+=ActivityElement*
	 *     )
	 */
	protected void sequence_ActivityGroup(EObject context, ActivityGroup semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         description=ML_COMMENT? 
	 *         name=ID 
	 *         longName=STRING? 
	 *         involvedResources+=ResourceInvolvement* 
	 *         wbsActivity+=[WBSNode|QualifiedName]* 
	 *         (start=STRING | (after=[ActivityElement|QualifiedName] offset=INT)) 
	 *         (end=STRING | duration=INT) 
	 *         completeness=INT 
	 *         dependencies+=[ActivityElement|QualifiedName]*
	 *     )
	 */
	protected void sequence_Activity(EObject context, Activity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_Assumption(EObject context, Assumption semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PlanPackage.Literals.ASSUMPTION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PlanPackage.Literals.ASSUMPTION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAssumptionAccess().getValueSTRINGTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         description=ML_COMMENT? 
	 *         name=ID 
	 *         longName=STRING? 
	 *         wbsDeliverable+=[WBSDeliverable|QualifiedName]* 
	 *         (end=STRING | (after=[ActivityElement|QualifiedName] offset=INT)) 
	 *         completeness=INT 
	 *         dependencies+=[ActivityElement|QualifiedName]*
	 *     )
	 */
	protected void sequence_CheckPoint(EObject context, CheckPoint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_Constraint(EObject context, Constraint semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PlanPackage.Literals.CONSTRAINT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PlanPackage.Literals.CONSTRAINT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConstraintAccess().getValueSTRINGTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     importURI=STRING
	 */
	protected void sequence_PlanImport(EObject context, PlanImport semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PlanPackage.Literals.PLAN_IMPORT__IMPORT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PlanPackage.Literals.PLAN_IMPORT__IMPORT_URI));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPlanImportAccess().getImportURISTRINGTerminalRuleCall_1_0(), semanticObject.getImportURI());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             description=ML_COMMENT? 
	 *             name=ID 
	 *             longName=STRING? 
	 *             plans+=PlanImport* 
	 *             referencedProjects+=[Project|QualifiedName]* 
	 *             projects+=Project*
	 *         ) | 
	 *         projects+=Project
	 *     )
	 */
	protected void sequence_Program(EObject context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         description=ML_COMMENT? 
	 *         name=ID 
	 *         longName=STRING? 
	 *         (wbs=WBSImport wbsProject=[WBSProject|QualifiedName])? 
	 *         resources=ResourcesImport? 
	 *         plans+=PlanImport* 
	 *         assumptions+=Assumption* 
	 *         constraints+=Constraint* 
	 *         activities+=ActivityElement*
	 *     )
	 */
	protected void sequence_Project(EObject context, Project semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (resource=[Resource|ID] occupation=INT? responsibility=Responsibility?)
	 */
	protected void sequence_ResourceInvolvement(EObject context, ResourceInvolvement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     importURI=STRING
	 */
	protected void sequence_ResourcesImport(EObject context, ResourcesImport semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PlanPackage.Literals.RESOURCES_IMPORT__IMPORT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PlanPackage.Literals.RESOURCES_IMPORT__IMPORT_URI));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getResourcesImportAccess().getImportURISTRINGTerminalRuleCall_1_0(), semanticObject.getImportURI());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     importURI=STRING
	 */
	protected void sequence_WBSImport(EObject context, WBSImport semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PlanPackage.Literals.WBS_IMPORT__IMPORT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PlanPackage.Literals.WBS_IMPORT__IMPORT_URI));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWBSImportAccess().getImportURISTRINGTerminalRuleCall_1_0(), semanticObject.getImportURI());
		feeder.finish();
	}
}
