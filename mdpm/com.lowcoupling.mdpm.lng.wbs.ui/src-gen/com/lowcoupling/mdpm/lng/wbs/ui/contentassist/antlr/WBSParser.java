/*
* generated by Xtext
*/
package com.lowcoupling.mdpm.lng.wbs.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import com.lowcoupling.mdpm.lng.wbs.services.WBSGrammarAccess;

public class WBSParser extends AbstractContentAssistParser {
	
	@Inject
	private WBSGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected com.lowcoupling.mdpm.lng.wbs.ui.contentassist.antlr.internal.InternalWBSParser createParser() {
		com.lowcoupling.mdpm.lng.wbs.ui.contentassist.antlr.internal.InternalWBSParser result = new com.lowcoupling.mdpm.lng.wbs.ui.contentassist.antlr.internal.InternalWBSParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getWBSAccess().getAlternatives(), "rule__WBS__Alternatives");
					put(grammarAccess.getWBSNodeAccess().getAlternatives(), "rule__WBSNode__Alternatives");
					put(grammarAccess.getWBSActivityAccess().getAlternatives_3(), "rule__WBSActivity__Alternatives_3");
					put(grammarAccess.getWBSWorkPackageAccess().getAlternatives_3(), "rule__WBSWorkPackage__Alternatives_3");
					put(grammarAccess.getWBSDeliverableAccess().getAlternatives_3(), "rule__WBSDeliverable__Alternatives_3");
					put(grammarAccess.getWBSProgramAccess().getGroup(), "rule__WBSProgram__Group__0");
					put(grammarAccess.getWBSProgramAccess().getGroup_4(), "rule__WBSProgram__Group_4__0");
					put(grammarAccess.getWBSProgramAccess().getGroup_6(), "rule__WBSProgram__Group_6__0");
					put(grammarAccess.getWBSProgramAccess().getGroup_6_2(), "rule__WBSProgram__Group_6_2__0");
					put(grammarAccess.getWBSProjectAccess().getGroup(), "rule__WBSProject__Group__0");
					put(grammarAccess.getWBSProjectAccess().getGroup_4(), "rule__WBSProject__Group_4__0");
					put(grammarAccess.getWBSProjectAccess().getGroup_6(), "rule__WBSProject__Group_6__0");
					put(grammarAccess.getWBSProjectAccess().getGroup_6_2(), "rule__WBSProject__Group_6_2__0");
					put(grammarAccess.getWBSActivityAccess().getGroup(), "rule__WBSActivity__Group__0");
					put(grammarAccess.getWBSActivityAccess().getGroup_3_0(), "rule__WBSActivity__Group_3_0__0");
					put(grammarAccess.getWBSActivityAccess().getGroup_3_0_2(), "rule__WBSActivity__Group_3_0_2__0");
					put(grammarAccess.getWBSActivityAccess().getGroup_3_0_2_2(), "rule__WBSActivity__Group_3_0_2_2__0");
					put(grammarAccess.getWBSWorkPackageAccess().getGroup(), "rule__WBSWorkPackage__Group__0");
					put(grammarAccess.getWBSWorkPackageAccess().getGroup_3_0(), "rule__WBSWorkPackage__Group_3_0__0");
					put(grammarAccess.getWBSWorkPackageAccess().getGroup_3_0_2(), "rule__WBSWorkPackage__Group_3_0_2__0");
					put(grammarAccess.getWBSWorkPackageAccess().getGroup_3_0_2_2(), "rule__WBSWorkPackage__Group_3_0_2_2__0");
					put(grammarAccess.getWBSDeliverableAccess().getGroup(), "rule__WBSDeliverable__Group__0");
					put(grammarAccess.getWBSDeliverableAccess().getGroup_3_0(), "rule__WBSDeliverable__Group_3_0__0");
					put(grammarAccess.getWBSDeliverableAccess().getGroup_3_0_2(), "rule__WBSDeliverable__Group_3_0_2__0");
					put(grammarAccess.getWBSDeliverableAccess().getGroup_3_0_2_2(), "rule__WBSDeliverable__Group_3_0_2_2__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getRequirementImportAccess().getGroup(), "rule__RequirementImport__Group__0");
					put(grammarAccess.getWBSProgramAccess().getDescriptionAssignment_0(), "rule__WBSProgram__DescriptionAssignment_0");
					put(grammarAccess.getWBSProgramAccess().getNameAssignment_2(), "rule__WBSProgram__NameAssignment_2");
					put(grammarAccess.getWBSProgramAccess().getRequirementsModelAssignment_4_0(), "rule__WBSProgram__RequirementsModelAssignment_4_0");
					put(grammarAccess.getWBSProgramAccess().getProjectsAssignment_5(), "rule__WBSProgram__ProjectsAssignment_5");
					put(grammarAccess.getWBSProgramAccess().getRequirementsAssignment_6_2_0(), "rule__WBSProgram__RequirementsAssignment_6_2_0");
					put(grammarAccess.getWBSProjectAccess().getDescriptionAssignment_0(), "rule__WBSProject__DescriptionAssignment_0");
					put(grammarAccess.getWBSProjectAccess().getNameAssignment_2(), "rule__WBSProject__NameAssignment_2");
					put(grammarAccess.getWBSProjectAccess().getRequirementsModelAssignment_4_0(), "rule__WBSProject__RequirementsModelAssignment_4_0");
					put(grammarAccess.getWBSProjectAccess().getWbsNodesAssignment_5(), "rule__WBSProject__WbsNodesAssignment_5");
					put(grammarAccess.getWBSProjectAccess().getRequirementsAssignment_6_2_0(), "rule__WBSProject__RequirementsAssignment_6_2_0");
					put(grammarAccess.getWBSActivityAccess().getDescriptionAssignment_0(), "rule__WBSActivity__DescriptionAssignment_0");
					put(grammarAccess.getWBSActivityAccess().getNameAssignment_2(), "rule__WBSActivity__NameAssignment_2");
					put(grammarAccess.getWBSActivityAccess().getWbsNodesAssignment_3_0_1(), "rule__WBSActivity__WbsNodesAssignment_3_0_1");
					put(grammarAccess.getWBSActivityAccess().getRequirementsAssignment_3_0_2_2_0(), "rule__WBSActivity__RequirementsAssignment_3_0_2_2_0");
					put(grammarAccess.getWBSWorkPackageAccess().getDescriptionAssignment_0(), "rule__WBSWorkPackage__DescriptionAssignment_0");
					put(grammarAccess.getWBSWorkPackageAccess().getNameAssignment_2(), "rule__WBSWorkPackage__NameAssignment_2");
					put(grammarAccess.getWBSWorkPackageAccess().getWbsNodesAssignment_3_0_1(), "rule__WBSWorkPackage__WbsNodesAssignment_3_0_1");
					put(grammarAccess.getWBSWorkPackageAccess().getRequirementsAssignment_3_0_2_2_0(), "rule__WBSWorkPackage__RequirementsAssignment_3_0_2_2_0");
					put(grammarAccess.getWBSDeliverableAccess().getDescriptionAssignment_0(), "rule__WBSDeliverable__DescriptionAssignment_0");
					put(grammarAccess.getWBSDeliverableAccess().getNameAssignment_2(), "rule__WBSDeliverable__NameAssignment_2");
					put(grammarAccess.getWBSDeliverableAccess().getWbsNodesAssignment_3_0_1(), "rule__WBSDeliverable__WbsNodesAssignment_3_0_1");
					put(grammarAccess.getWBSDeliverableAccess().getRequirementsAssignment_3_0_2_2_0(), "rule__WBSDeliverable__RequirementsAssignment_3_0_2_2_0");
					put(grammarAccess.getRequirementImportAccess().getImportURIAssignment_1(), "rule__RequirementImport__ImportURIAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			com.lowcoupling.mdpm.lng.wbs.ui.contentassist.antlr.internal.InternalWBSParser typedParser = (com.lowcoupling.mdpm.lng.wbs.ui.contentassist.antlr.internal.InternalWBSParser) parser;
			typedParser.entryRuleWBS();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_SL_COMMENT" };
	}
	
	public WBSGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(WBSGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}