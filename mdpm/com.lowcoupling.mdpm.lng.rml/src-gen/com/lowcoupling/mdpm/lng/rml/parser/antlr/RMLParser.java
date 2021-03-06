/*
* generated by Xtext
*/
package com.lowcoupling.mdpm.lng.rml.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import com.lowcoupling.mdpm.lng.rml.services.RMLGrammarAccess;

public class RMLParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private RMLGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected com.lowcoupling.mdpm.lng.rml.parser.antlr.internal.InternalRMLParser createParser(XtextTokenStream stream) {
		return new com.lowcoupling.mdpm.lng.rml.parser.antlr.internal.InternalRMLParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}
	
	public RMLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(RMLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
