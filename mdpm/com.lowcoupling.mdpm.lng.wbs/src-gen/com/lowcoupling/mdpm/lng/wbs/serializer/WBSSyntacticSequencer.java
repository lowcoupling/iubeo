package com.lowcoupling.mdpm.lng.wbs.serializer;

import com.google.inject.Inject;
import com.lowcoupling.mdpm.lng.wbs.services.WBSGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class WBSSyntacticSequencer extends AbstractSyntacticSequencer {

	protected WBSGrammarAccess grammarAccess;
	protected AbstractElementAlias match_WBSActivity_ENDLINETerminalRuleCall_3_1_or___OPENCURLYTerminalRuleCall_3_0_0___RequirementsKeyword_3_0_2_0_OPENCURLYTerminalRuleCall_3_0_2_1_CLOSEDCURLYTerminalRuleCall_3_0_2_3__q_CLOSEDCURLYTerminalRuleCall_3_0_3__;
	protected AbstractElementAlias match_WBSActivity___RequirementsKeyword_3_0_2_0_OPENCURLYTerminalRuleCall_3_0_2_1_CLOSEDCURLYTerminalRuleCall_3_0_2_3__q;
	protected AbstractElementAlias match_WBSDeliverable_ENDLINETerminalRuleCall_3_1_or___OPENCURLYTerminalRuleCall_3_0_0___RequirementsKeyword_3_0_2_0_OPENCURLYTerminalRuleCall_3_0_2_1_CLOSEDCURLYTerminalRuleCall_3_0_2_3__q_CLOSEDCURLYTerminalRuleCall_3_0_3__;
	protected AbstractElementAlias match_WBSDeliverable___RequirementsKeyword_3_0_2_0_OPENCURLYTerminalRuleCall_3_0_2_1_CLOSEDCURLYTerminalRuleCall_3_0_2_3__q;
	protected AbstractElementAlias match_WBSProgram___RequirementsKeyword_6_0_OPENCURLYTerminalRuleCall_6_1_CLOSEDCURLYTerminalRuleCall_6_3__q;
	protected AbstractElementAlias match_WBSProject___RequirementsKeyword_6_0_OPENCURLYTerminalRuleCall_6_1_CLOSEDCURLYTerminalRuleCall_6_3__q;
	protected AbstractElementAlias match_WBSWorkPackage_ENDLINETerminalRuleCall_3_1_or___OPENCURLYTerminalRuleCall_3_0_0___RequirementsKeyword_3_0_2_0_OPENCURLYTerminalRuleCall_3_0_2_1_CLOSEDCURLYTerminalRuleCall_3_0_2_3__q_CLOSEDCURLYTerminalRuleCall_3_0_3__;
	protected AbstractElementAlias match_WBSWorkPackage___RequirementsKeyword_3_0_2_0_OPENCURLYTerminalRuleCall_3_0_2_1_CLOSEDCURLYTerminalRuleCall_3_0_2_3__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (WBSGrammarAccess) access;
		match_WBSActivity_ENDLINETerminalRuleCall_3_1_or___OPENCURLYTerminalRuleCall_3_0_0___RequirementsKeyword_3_0_2_0_OPENCURLYTerminalRuleCall_3_0_2_1_CLOSEDCURLYTerminalRuleCall_3_0_2_3__q_CLOSEDCURLYTerminalRuleCall_3_0_3__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getWBSActivityAccess().getOPENCURLYTerminalRuleCall_3_0_0()), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getWBSActivityAccess().getRequirementsKeyword_3_0_2_0()), new TokenAlias(false, false, grammarAccess.getWBSActivityAccess().getOPENCURLYTerminalRuleCall_3_0_2_1()), new TokenAlias(false, false, grammarAccess.getWBSActivityAccess().getCLOSEDCURLYTerminalRuleCall_3_0_2_3())), new TokenAlias(false, false, grammarAccess.getWBSActivityAccess().getCLOSEDCURLYTerminalRuleCall_3_0_3())), new TokenAlias(false, false, grammarAccess.getWBSActivityAccess().getENDLINETerminalRuleCall_3_1()));
		match_WBSActivity___RequirementsKeyword_3_0_2_0_OPENCURLYTerminalRuleCall_3_0_2_1_CLOSEDCURLYTerminalRuleCall_3_0_2_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getWBSActivityAccess().getRequirementsKeyword_3_0_2_0()), new TokenAlias(false, false, grammarAccess.getWBSActivityAccess().getOPENCURLYTerminalRuleCall_3_0_2_1()), new TokenAlias(false, false, grammarAccess.getWBSActivityAccess().getCLOSEDCURLYTerminalRuleCall_3_0_2_3()));
		match_WBSDeliverable_ENDLINETerminalRuleCall_3_1_or___OPENCURLYTerminalRuleCall_3_0_0___RequirementsKeyword_3_0_2_0_OPENCURLYTerminalRuleCall_3_0_2_1_CLOSEDCURLYTerminalRuleCall_3_0_2_3__q_CLOSEDCURLYTerminalRuleCall_3_0_3__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getWBSDeliverableAccess().getOPENCURLYTerminalRuleCall_3_0_0()), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getWBSDeliverableAccess().getRequirementsKeyword_3_0_2_0()), new TokenAlias(false, false, grammarAccess.getWBSDeliverableAccess().getOPENCURLYTerminalRuleCall_3_0_2_1()), new TokenAlias(false, false, grammarAccess.getWBSDeliverableAccess().getCLOSEDCURLYTerminalRuleCall_3_0_2_3())), new TokenAlias(false, false, grammarAccess.getWBSDeliverableAccess().getCLOSEDCURLYTerminalRuleCall_3_0_3())), new TokenAlias(false, false, grammarAccess.getWBSDeliverableAccess().getENDLINETerminalRuleCall_3_1()));
		match_WBSDeliverable___RequirementsKeyword_3_0_2_0_OPENCURLYTerminalRuleCall_3_0_2_1_CLOSEDCURLYTerminalRuleCall_3_0_2_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getWBSDeliverableAccess().getRequirementsKeyword_3_0_2_0()), new TokenAlias(false, false, grammarAccess.getWBSDeliverableAccess().getOPENCURLYTerminalRuleCall_3_0_2_1()), new TokenAlias(false, false, grammarAccess.getWBSDeliverableAccess().getCLOSEDCURLYTerminalRuleCall_3_0_2_3()));
		match_WBSProgram___RequirementsKeyword_6_0_OPENCURLYTerminalRuleCall_6_1_CLOSEDCURLYTerminalRuleCall_6_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getWBSProgramAccess().getRequirementsKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getWBSProgramAccess().getOPENCURLYTerminalRuleCall_6_1()), new TokenAlias(false, false, grammarAccess.getWBSProgramAccess().getCLOSEDCURLYTerminalRuleCall_6_3()));
		match_WBSProject___RequirementsKeyword_6_0_OPENCURLYTerminalRuleCall_6_1_CLOSEDCURLYTerminalRuleCall_6_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getWBSProjectAccess().getRequirementsKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getWBSProjectAccess().getOPENCURLYTerminalRuleCall_6_1()), new TokenAlias(false, false, grammarAccess.getWBSProjectAccess().getCLOSEDCURLYTerminalRuleCall_6_3()));
		match_WBSWorkPackage_ENDLINETerminalRuleCall_3_1_or___OPENCURLYTerminalRuleCall_3_0_0___RequirementsKeyword_3_0_2_0_OPENCURLYTerminalRuleCall_3_0_2_1_CLOSEDCURLYTerminalRuleCall_3_0_2_3__q_CLOSEDCURLYTerminalRuleCall_3_0_3__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getWBSWorkPackageAccess().getOPENCURLYTerminalRuleCall_3_0_0()), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getWBSWorkPackageAccess().getRequirementsKeyword_3_0_2_0()), new TokenAlias(false, false, grammarAccess.getWBSWorkPackageAccess().getOPENCURLYTerminalRuleCall_3_0_2_1()), new TokenAlias(false, false, grammarAccess.getWBSWorkPackageAccess().getCLOSEDCURLYTerminalRuleCall_3_0_2_3())), new TokenAlias(false, false, grammarAccess.getWBSWorkPackageAccess().getCLOSEDCURLYTerminalRuleCall_3_0_3())), new TokenAlias(false, false, grammarAccess.getWBSWorkPackageAccess().getENDLINETerminalRuleCall_3_1()));
		match_WBSWorkPackage___RequirementsKeyword_3_0_2_0_OPENCURLYTerminalRuleCall_3_0_2_1_CLOSEDCURLYTerminalRuleCall_3_0_2_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getWBSWorkPackageAccess().getRequirementsKeyword_3_0_2_0()), new TokenAlias(false, false, grammarAccess.getWBSWorkPackageAccess().getOPENCURLYTerminalRuleCall_3_0_2_1()), new TokenAlias(false, false, grammarAccess.getWBSWorkPackageAccess().getCLOSEDCURLYTerminalRuleCall_3_0_2_3()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getCLOSEDCURLYRule())
			return getCLOSEDCURLYToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getENDLINERule())
			return getENDLINEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getOPENCURLYRule())
			return getOPENCURLYToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal CLOSEDCURLY :
	 * 	'}'
	 * ;
	 */
	protected String getCLOSEDCURLYToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "}";
	}
	
	/**
	 * terminal ENDLINE :';';
	 */
	protected String getENDLINEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ";";
	}
	
	/**
	 * terminal OPENCURLY :
	 * 	'{'
	 * ;
	 */
	protected String getOPENCURLYToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "{";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_WBSActivity_ENDLINETerminalRuleCall_3_1_or___OPENCURLYTerminalRuleCall_3_0_0___RequirementsKeyword_3_0_2_0_OPENCURLYTerminalRuleCall_3_0_2_1_CLOSEDCURLYTerminalRuleCall_3_0_2_3__q_CLOSEDCURLYTerminalRuleCall_3_0_3__.equals(syntax))
				emit_WBSActivity_ENDLINETerminalRuleCall_3_1_or___OPENCURLYTerminalRuleCall_3_0_0___RequirementsKeyword_3_0_2_0_OPENCURLYTerminalRuleCall_3_0_2_1_CLOSEDCURLYTerminalRuleCall_3_0_2_3__q_CLOSEDCURLYTerminalRuleCall_3_0_3__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_WBSActivity___RequirementsKeyword_3_0_2_0_OPENCURLYTerminalRuleCall_3_0_2_1_CLOSEDCURLYTerminalRuleCall_3_0_2_3__q.equals(syntax))
				emit_WBSActivity___RequirementsKeyword_3_0_2_0_OPENCURLYTerminalRuleCall_3_0_2_1_CLOSEDCURLYTerminalRuleCall_3_0_2_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_WBSDeliverable_ENDLINETerminalRuleCall_3_1_or___OPENCURLYTerminalRuleCall_3_0_0___RequirementsKeyword_3_0_2_0_OPENCURLYTerminalRuleCall_3_0_2_1_CLOSEDCURLYTerminalRuleCall_3_0_2_3__q_CLOSEDCURLYTerminalRuleCall_3_0_3__.equals(syntax))
				emit_WBSDeliverable_ENDLINETerminalRuleCall_3_1_or___OPENCURLYTerminalRuleCall_3_0_0___RequirementsKeyword_3_0_2_0_OPENCURLYTerminalRuleCall_3_0_2_1_CLOSEDCURLYTerminalRuleCall_3_0_2_3__q_CLOSEDCURLYTerminalRuleCall_3_0_3__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_WBSDeliverable___RequirementsKeyword_3_0_2_0_OPENCURLYTerminalRuleCall_3_0_2_1_CLOSEDCURLYTerminalRuleCall_3_0_2_3__q.equals(syntax))
				emit_WBSDeliverable___RequirementsKeyword_3_0_2_0_OPENCURLYTerminalRuleCall_3_0_2_1_CLOSEDCURLYTerminalRuleCall_3_0_2_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_WBSProgram___RequirementsKeyword_6_0_OPENCURLYTerminalRuleCall_6_1_CLOSEDCURLYTerminalRuleCall_6_3__q.equals(syntax))
				emit_WBSProgram___RequirementsKeyword_6_0_OPENCURLYTerminalRuleCall_6_1_CLOSEDCURLYTerminalRuleCall_6_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_WBSProject___RequirementsKeyword_6_0_OPENCURLYTerminalRuleCall_6_1_CLOSEDCURLYTerminalRuleCall_6_3__q.equals(syntax))
				emit_WBSProject___RequirementsKeyword_6_0_OPENCURLYTerminalRuleCall_6_1_CLOSEDCURLYTerminalRuleCall_6_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_WBSWorkPackage_ENDLINETerminalRuleCall_3_1_or___OPENCURLYTerminalRuleCall_3_0_0___RequirementsKeyword_3_0_2_0_OPENCURLYTerminalRuleCall_3_0_2_1_CLOSEDCURLYTerminalRuleCall_3_0_2_3__q_CLOSEDCURLYTerminalRuleCall_3_0_3__.equals(syntax))
				emit_WBSWorkPackage_ENDLINETerminalRuleCall_3_1_or___OPENCURLYTerminalRuleCall_3_0_0___RequirementsKeyword_3_0_2_0_OPENCURLYTerminalRuleCall_3_0_2_1_CLOSEDCURLYTerminalRuleCall_3_0_2_3__q_CLOSEDCURLYTerminalRuleCall_3_0_3__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_WBSWorkPackage___RequirementsKeyword_3_0_2_0_OPENCURLYTerminalRuleCall_3_0_2_1_CLOSEDCURLYTerminalRuleCall_3_0_2_3__q.equals(syntax))
				emit_WBSWorkPackage___RequirementsKeyword_3_0_2_0_OPENCURLYTerminalRuleCall_3_0_2_1_CLOSEDCURLYTerminalRuleCall_3_0_2_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ENDLINE | (OPENCURLY ('requirements' OPENCURLY CLOSEDCURLY)? CLOSEDCURLY)
	 */
	protected void emit_WBSActivity_ENDLINETerminalRuleCall_3_1_or___OPENCURLYTerminalRuleCall_3_0_0___RequirementsKeyword_3_0_2_0_OPENCURLYTerminalRuleCall_3_0_2_1_CLOSEDCURLYTerminalRuleCall_3_0_2_3__q_CLOSEDCURLYTerminalRuleCall_3_0_3__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('requirements' OPENCURLY CLOSEDCURLY)?
	 */
	protected void emit_WBSActivity___RequirementsKeyword_3_0_2_0_OPENCURLYTerminalRuleCall_3_0_2_1_CLOSEDCURLYTerminalRuleCall_3_0_2_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (OPENCURLY ('requirements' OPENCURLY CLOSEDCURLY)? CLOSEDCURLY) | ENDLINE
	 */
	protected void emit_WBSDeliverable_ENDLINETerminalRuleCall_3_1_or___OPENCURLYTerminalRuleCall_3_0_0___RequirementsKeyword_3_0_2_0_OPENCURLYTerminalRuleCall_3_0_2_1_CLOSEDCURLYTerminalRuleCall_3_0_2_3__q_CLOSEDCURLYTerminalRuleCall_3_0_3__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('requirements' OPENCURLY CLOSEDCURLY)?
	 */
	protected void emit_WBSDeliverable___RequirementsKeyword_3_0_2_0_OPENCURLYTerminalRuleCall_3_0_2_1_CLOSEDCURLYTerminalRuleCall_3_0_2_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('requirements' OPENCURLY CLOSEDCURLY)?
	 */
	protected void emit_WBSProgram___RequirementsKeyword_6_0_OPENCURLYTerminalRuleCall_6_1_CLOSEDCURLYTerminalRuleCall_6_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('requirements' OPENCURLY CLOSEDCURLY)?
	 */
	protected void emit_WBSProject___RequirementsKeyword_6_0_OPENCURLYTerminalRuleCall_6_1_CLOSEDCURLYTerminalRuleCall_6_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ENDLINE | (OPENCURLY ('requirements' OPENCURLY CLOSEDCURLY)? CLOSEDCURLY)
	 */
	protected void emit_WBSWorkPackage_ENDLINETerminalRuleCall_3_1_or___OPENCURLYTerminalRuleCall_3_0_0___RequirementsKeyword_3_0_2_0_OPENCURLYTerminalRuleCall_3_0_2_1_CLOSEDCURLYTerminalRuleCall_3_0_2_3__q_CLOSEDCURLYTerminalRuleCall_3_0_3__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('requirements' OPENCURLY CLOSEDCURLY)?
	 */
	protected void emit_WBSWorkPackage___RequirementsKeyword_3_0_2_0_OPENCURLYTerminalRuleCall_3_0_2_1_CLOSEDCURLYTerminalRuleCall_3_0_2_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
