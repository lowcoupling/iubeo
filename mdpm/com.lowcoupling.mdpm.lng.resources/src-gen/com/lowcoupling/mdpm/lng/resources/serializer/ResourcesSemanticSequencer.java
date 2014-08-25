package com.lowcoupling.mdpm.lng.resources.serializer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

import com.google.inject.Inject;
import com.lowcoupling.mdpm.lng.resources.resources.Resource;
import com.lowcoupling.mdpm.lng.resources.resources.ResourceGroup;
import com.lowcoupling.mdpm.lng.resources.resources.Resources;
import com.lowcoupling.mdpm.lng.resources.resources.ResourcesPackage;
import com.lowcoupling.mdpm.lng.resources.services.ResourcesGrammarAccess;

@SuppressWarnings("all")
public class ResourcesSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ResourcesGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ResourcesPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ResourcesPackage.RESOURCE:
				if(context == grammarAccess.getResourceRule()) {
					sequence_Resource(context, (Resource) semanticObject); 
					return; 
				}
				else break;
			case ResourcesPackage.RESOURCE_GROUP:
				if(context == grammarAccess.getResourceGroupRule()) {
					sequence_ResourceGroup(context, (ResourceGroup) semanticObject); 
					return; 
				}
				else break;
			case ResourcesPackage.RESOURCES:
				if(context == grammarAccess.getResourcesRule()) {
					sequence_Resources(context, (Resources) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID id=ID cost=INT costLabel=STRING? type=STRING)
	 */
	protected void sequence_ResourceGroup(EObject context, ResourceGroup semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=[ResourceGroup|ID])
	 */
	protected void sequence_Resource(EObject context, Resource semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ResourcesPackage.Literals.RESOURCE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ResourcesPackage.Literals.RESOURCE__NAME));
			if(transientValues.isValueTransient(semanticObject, ResourcesPackage.Literals.RESOURCE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ResourcesPackage.Literals.RESOURCE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getResourceAccess().getTypeResourceGroupIDTerminalRuleCall_4_0_1(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (resourceGroups+=ResourceGroup* resources+=Resource*)
	 */
	protected void sequence_Resources(EObject context, Resources semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
