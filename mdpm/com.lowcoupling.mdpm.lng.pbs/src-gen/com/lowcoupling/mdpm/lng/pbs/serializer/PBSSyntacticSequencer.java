package com.lowcoupling.mdpm.lng.pbs.serializer;

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

import com.google.inject.Inject;
import com.lowcoupling.mdpm.lng.pbs.services.PBSGrammarAccess;

@SuppressWarnings("all")
public class PBSSyntacticSequencer extends AbstractSyntacticSequencer {

	protected PBSGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Part_ENDLINETerminalRuleCall_3_1_or___OPENCURLYTerminalRuleCall_3_0_0_CLOSEDCURLYTerminalRuleCall_3_0_2__;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (PBSGrammarAccess) access;
		match_Part_ENDLINETerminalRuleCall_3_1_or___OPENCURLYTerminalRuleCall_3_0_0_CLOSEDCURLYTerminalRuleCall_3_0_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getPartAccess().getOPENCURLYTerminalRuleCall_3_0_0()), new TokenAlias(false, false, grammarAccess.getPartAccess().getCLOSEDCURLYTerminalRuleCall_3_0_2())), new TokenAlias(false, false, grammarAccess.getPartAccess().getENDLINETerminalRuleCall_3_1()));
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
			if(match_Part_ENDLINETerminalRuleCall_3_1_or___OPENCURLYTerminalRuleCall_3_0_0_CLOSEDCURLYTerminalRuleCall_3_0_2__.equals(syntax))
				emit_Part_ENDLINETerminalRuleCall_3_1_or___OPENCURLYTerminalRuleCall_3_0_0_CLOSEDCURLYTerminalRuleCall_3_0_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     (OPENCURLY CLOSEDCURLY) | ENDLINE
	 */
	protected void emit_Part_ENDLINETerminalRuleCall_3_1_or___OPENCURLYTerminalRuleCall_3_0_0_CLOSEDCURLYTerminalRuleCall_3_0_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
