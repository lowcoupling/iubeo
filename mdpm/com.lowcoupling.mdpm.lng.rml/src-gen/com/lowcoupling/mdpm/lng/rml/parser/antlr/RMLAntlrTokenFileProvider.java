/*
* generated by Xtext
*/
package com.lowcoupling.mdpm.lng.rml.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class RMLAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("com/lowcoupling/mdpm/lng/rml/parser/antlr/internal/InternalRML.tokens");
	}
}
