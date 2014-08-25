package com.lowcoupling.mdpm.lng.wbs.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import com.lowcoupling.mdpm.lng.wbs.services.WBSGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWBSParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ENDLINE", "RULE_OPENCURLY", "RULE_CLOSEDCURLY", "RULE_ID", "RULE_ML_COMMENT", "RULE_STRING", "RULE_INT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Program '", "'requirements'", "'Project '", "'Activity '", "'WorkPackage '", "'Deliverable '", "'.'", "'req_import'"
    };
    public static final int RULE_ENDLINE=4;
    public static final int RULE_OPENCURLY=5;
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_CLOSEDCURLY=6;
    public static final int RULE_ID=7;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_INT=10;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalWBSParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalWBSParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalWBSParser.tokenNames; }
    public String getGrammarFileName() { return "../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g"; }


     
     	private WBSGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(WBSGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleWBS"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:60:1: entryRuleWBS : ruleWBS EOF ;
    public final void entryRuleWBS() throws RecognitionException {
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:61:1: ( ruleWBS EOF )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:62:1: ruleWBS EOF
            {
             before(grammarAccess.getWBSRule()); 
            pushFollow(FOLLOW_ruleWBS_in_entryRuleWBS61);
            ruleWBS();

            state._fsp--;

             after(grammarAccess.getWBSRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWBS68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWBS"


    // $ANTLR start "ruleWBS"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:69:1: ruleWBS : ( ( rule__WBS__Alternatives ) ) ;
    public final void ruleWBS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:73:2: ( ( ( rule__WBS__Alternatives ) ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:74:1: ( ( rule__WBS__Alternatives ) )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:74:1: ( ( rule__WBS__Alternatives ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:75:1: ( rule__WBS__Alternatives )
            {
             before(grammarAccess.getWBSAccess().getAlternatives()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:76:1: ( rule__WBS__Alternatives )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:76:2: rule__WBS__Alternatives
            {
            pushFollow(FOLLOW_rule__WBS__Alternatives_in_ruleWBS94);
            rule__WBS__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWBSAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWBS"


    // $ANTLR start "entryRuleWBSProgram"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:88:1: entryRuleWBSProgram : ruleWBSProgram EOF ;
    public final void entryRuleWBSProgram() throws RecognitionException {
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:89:1: ( ruleWBSProgram EOF )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:90:1: ruleWBSProgram EOF
            {
             before(grammarAccess.getWBSProgramRule()); 
            pushFollow(FOLLOW_ruleWBSProgram_in_entryRuleWBSProgram121);
            ruleWBSProgram();

            state._fsp--;

             after(grammarAccess.getWBSProgramRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWBSProgram128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWBSProgram"


    // $ANTLR start "ruleWBSProgram"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:97:1: ruleWBSProgram : ( ( rule__WBSProgram__Group__0 ) ) ;
    public final void ruleWBSProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:101:2: ( ( ( rule__WBSProgram__Group__0 ) ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:102:1: ( ( rule__WBSProgram__Group__0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:102:1: ( ( rule__WBSProgram__Group__0 ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:103:1: ( rule__WBSProgram__Group__0 )
            {
             before(grammarAccess.getWBSProgramAccess().getGroup()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:104:1: ( rule__WBSProgram__Group__0 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:104:2: rule__WBSProgram__Group__0
            {
            pushFollow(FOLLOW_rule__WBSProgram__Group__0_in_ruleWBSProgram154);
            rule__WBSProgram__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWBSProgramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWBSProgram"


    // $ANTLR start "entryRuleWBSProject"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:116:1: entryRuleWBSProject : ruleWBSProject EOF ;
    public final void entryRuleWBSProject() throws RecognitionException {
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:117:1: ( ruleWBSProject EOF )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:118:1: ruleWBSProject EOF
            {
             before(grammarAccess.getWBSProjectRule()); 
            pushFollow(FOLLOW_ruleWBSProject_in_entryRuleWBSProject181);
            ruleWBSProject();

            state._fsp--;

             after(grammarAccess.getWBSProjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWBSProject188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWBSProject"


    // $ANTLR start "ruleWBSProject"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:125:1: ruleWBSProject : ( ( rule__WBSProject__Group__0 ) ) ;
    public final void ruleWBSProject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:129:2: ( ( ( rule__WBSProject__Group__0 ) ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:130:1: ( ( rule__WBSProject__Group__0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:130:1: ( ( rule__WBSProject__Group__0 ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:131:1: ( rule__WBSProject__Group__0 )
            {
             before(grammarAccess.getWBSProjectAccess().getGroup()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:132:1: ( rule__WBSProject__Group__0 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:132:2: rule__WBSProject__Group__0
            {
            pushFollow(FOLLOW_rule__WBSProject__Group__0_in_ruleWBSProject214);
            rule__WBSProject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWBSProjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWBSProject"


    // $ANTLR start "entryRuleWBSNode"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:144:1: entryRuleWBSNode : ruleWBSNode EOF ;
    public final void entryRuleWBSNode() throws RecognitionException {
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:145:1: ( ruleWBSNode EOF )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:146:1: ruleWBSNode EOF
            {
             before(grammarAccess.getWBSNodeRule()); 
            pushFollow(FOLLOW_ruleWBSNode_in_entryRuleWBSNode241);
            ruleWBSNode();

            state._fsp--;

             after(grammarAccess.getWBSNodeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWBSNode248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWBSNode"


    // $ANTLR start "ruleWBSNode"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:153:1: ruleWBSNode : ( ( rule__WBSNode__Alternatives ) ) ;
    public final void ruleWBSNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:157:2: ( ( ( rule__WBSNode__Alternatives ) ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:158:1: ( ( rule__WBSNode__Alternatives ) )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:158:1: ( ( rule__WBSNode__Alternatives ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:159:1: ( rule__WBSNode__Alternatives )
            {
             before(grammarAccess.getWBSNodeAccess().getAlternatives()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:160:1: ( rule__WBSNode__Alternatives )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:160:2: rule__WBSNode__Alternatives
            {
            pushFollow(FOLLOW_rule__WBSNode__Alternatives_in_ruleWBSNode274);
            rule__WBSNode__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWBSNodeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWBSNode"


    // $ANTLR start "entryRuleWBSActivity"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:172:1: entryRuleWBSActivity : ruleWBSActivity EOF ;
    public final void entryRuleWBSActivity() throws RecognitionException {
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:173:1: ( ruleWBSActivity EOF )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:174:1: ruleWBSActivity EOF
            {
             before(grammarAccess.getWBSActivityRule()); 
            pushFollow(FOLLOW_ruleWBSActivity_in_entryRuleWBSActivity301);
            ruleWBSActivity();

            state._fsp--;

             after(grammarAccess.getWBSActivityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWBSActivity308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWBSActivity"


    // $ANTLR start "ruleWBSActivity"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:181:1: ruleWBSActivity : ( ( rule__WBSActivity__Group__0 ) ) ;
    public final void ruleWBSActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:185:2: ( ( ( rule__WBSActivity__Group__0 ) ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:186:1: ( ( rule__WBSActivity__Group__0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:186:1: ( ( rule__WBSActivity__Group__0 ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:187:1: ( rule__WBSActivity__Group__0 )
            {
             before(grammarAccess.getWBSActivityAccess().getGroup()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:188:1: ( rule__WBSActivity__Group__0 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:188:2: rule__WBSActivity__Group__0
            {
            pushFollow(FOLLOW_rule__WBSActivity__Group__0_in_ruleWBSActivity334);
            rule__WBSActivity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWBSActivityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWBSActivity"


    // $ANTLR start "entryRuleWBSWorkPackage"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:200:1: entryRuleWBSWorkPackage : ruleWBSWorkPackage EOF ;
    public final void entryRuleWBSWorkPackage() throws RecognitionException {
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:201:1: ( ruleWBSWorkPackage EOF )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:202:1: ruleWBSWorkPackage EOF
            {
             before(grammarAccess.getWBSWorkPackageRule()); 
            pushFollow(FOLLOW_ruleWBSWorkPackage_in_entryRuleWBSWorkPackage361);
            ruleWBSWorkPackage();

            state._fsp--;

             after(grammarAccess.getWBSWorkPackageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWBSWorkPackage368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWBSWorkPackage"


    // $ANTLR start "ruleWBSWorkPackage"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:209:1: ruleWBSWorkPackage : ( ( rule__WBSWorkPackage__Group__0 ) ) ;
    public final void ruleWBSWorkPackage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:213:2: ( ( ( rule__WBSWorkPackage__Group__0 ) ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:214:1: ( ( rule__WBSWorkPackage__Group__0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:214:1: ( ( rule__WBSWorkPackage__Group__0 ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:215:1: ( rule__WBSWorkPackage__Group__0 )
            {
             before(grammarAccess.getWBSWorkPackageAccess().getGroup()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:216:1: ( rule__WBSWorkPackage__Group__0 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:216:2: rule__WBSWorkPackage__Group__0
            {
            pushFollow(FOLLOW_rule__WBSWorkPackage__Group__0_in_ruleWBSWorkPackage394);
            rule__WBSWorkPackage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWBSWorkPackageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWBSWorkPackage"


    // $ANTLR start "entryRuleWBSDeliverable"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:228:1: entryRuleWBSDeliverable : ruleWBSDeliverable EOF ;
    public final void entryRuleWBSDeliverable() throws RecognitionException {
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:229:1: ( ruleWBSDeliverable EOF )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:230:1: ruleWBSDeliverable EOF
            {
             before(grammarAccess.getWBSDeliverableRule()); 
            pushFollow(FOLLOW_ruleWBSDeliverable_in_entryRuleWBSDeliverable421);
            ruleWBSDeliverable();

            state._fsp--;

             after(grammarAccess.getWBSDeliverableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWBSDeliverable428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWBSDeliverable"


    // $ANTLR start "ruleWBSDeliverable"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:237:1: ruleWBSDeliverable : ( ( rule__WBSDeliverable__Group__0 ) ) ;
    public final void ruleWBSDeliverable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:241:2: ( ( ( rule__WBSDeliverable__Group__0 ) ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:242:1: ( ( rule__WBSDeliverable__Group__0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:242:1: ( ( rule__WBSDeliverable__Group__0 ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:243:1: ( rule__WBSDeliverable__Group__0 )
            {
             before(grammarAccess.getWBSDeliverableAccess().getGroup()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:244:1: ( rule__WBSDeliverable__Group__0 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:244:2: rule__WBSDeliverable__Group__0
            {
            pushFollow(FOLLOW_rule__WBSDeliverable__Group__0_in_ruleWBSDeliverable454);
            rule__WBSDeliverable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWBSDeliverableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWBSDeliverable"


    // $ANTLR start "entryRuleQualifiedName"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:256:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:257:1: ( ruleQualifiedName EOF )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:258:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName481);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:265:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:269:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:270:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:270:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:271:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:272:1: ( rule__QualifiedName__Group__0 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:272:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName514);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleRequirementImport"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:284:1: entryRuleRequirementImport : ruleRequirementImport EOF ;
    public final void entryRuleRequirementImport() throws RecognitionException {
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:285:1: ( ruleRequirementImport EOF )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:286:1: ruleRequirementImport EOF
            {
             before(grammarAccess.getRequirementImportRule()); 
            pushFollow(FOLLOW_ruleRequirementImport_in_entryRuleRequirementImport541);
            ruleRequirementImport();

            state._fsp--;

             after(grammarAccess.getRequirementImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequirementImport548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRequirementImport"


    // $ANTLR start "ruleRequirementImport"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:293:1: ruleRequirementImport : ( ( rule__RequirementImport__Group__0 ) ) ;
    public final void ruleRequirementImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:297:2: ( ( ( rule__RequirementImport__Group__0 ) ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:298:1: ( ( rule__RequirementImport__Group__0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:298:1: ( ( rule__RequirementImport__Group__0 ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:299:1: ( rule__RequirementImport__Group__0 )
            {
             before(grammarAccess.getRequirementImportAccess().getGroup()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:300:1: ( rule__RequirementImport__Group__0 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:300:2: rule__RequirementImport__Group__0
            {
            pushFollow(FOLLOW_rule__RequirementImport__Group__0_in_ruleRequirementImport574);
            rule__RequirementImport__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRequirementImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRequirementImport"


    // $ANTLR start "rule__WBS__Alternatives"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:312:1: rule__WBS__Alternatives : ( ( ruleWBSProgram ) | ( ruleWBSProject ) );
    public final void rule__WBS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:316:1: ( ( ruleWBSProgram ) | ( ruleWBSProject ) )
            int alt1=2;
            switch ( input.LA(1) ) {
            case RULE_ML_COMMENT:
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==14) ) {
                    alt1=1;
                }
                else if ( (LA1_1==16) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case 14:
                {
                alt1=1;
                }
                break;
            case 16:
                {
                alt1=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:317:1: ( ruleWBSProgram )
                    {
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:317:1: ( ruleWBSProgram )
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:318:1: ruleWBSProgram
                    {
                     before(grammarAccess.getWBSAccess().getWBSProgramParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleWBSProgram_in_rule__WBS__Alternatives610);
                    ruleWBSProgram();

                    state._fsp--;

                     after(grammarAccess.getWBSAccess().getWBSProgramParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:323:6: ( ruleWBSProject )
                    {
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:323:6: ( ruleWBSProject )
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:324:1: ruleWBSProject
                    {
                     before(grammarAccess.getWBSAccess().getWBSProjectParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleWBSProject_in_rule__WBS__Alternatives627);
                    ruleWBSProject();

                    state._fsp--;

                     after(grammarAccess.getWBSAccess().getWBSProjectParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBS__Alternatives"


    // $ANTLR start "rule__WBSNode__Alternatives"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:334:1: rule__WBSNode__Alternatives : ( ( ruleWBSActivity ) | ( ruleWBSWorkPackage ) | ( ruleWBSDeliverable ) );
    public final void rule__WBSNode__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:338:1: ( ( ruleWBSActivity ) | ( ruleWBSWorkPackage ) | ( ruleWBSDeliverable ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_ML_COMMENT:
                {
                switch ( input.LA(2) ) {
                case 18:
                    {
                    alt2=2;
                    }
                    break;
                case 17:
                    {
                    alt2=1;
                    }
                    break;
                case 19:
                    {
                    alt2=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }

                }
                break;
            case 17:
                {
                alt2=1;
                }
                break;
            case 18:
                {
                alt2=2;
                }
                break;
            case 19:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:339:1: ( ruleWBSActivity )
                    {
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:339:1: ( ruleWBSActivity )
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:340:1: ruleWBSActivity
                    {
                     before(grammarAccess.getWBSNodeAccess().getWBSActivityParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleWBSActivity_in_rule__WBSNode__Alternatives659);
                    ruleWBSActivity();

                    state._fsp--;

                     after(grammarAccess.getWBSNodeAccess().getWBSActivityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:345:6: ( ruleWBSWorkPackage )
                    {
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:345:6: ( ruleWBSWorkPackage )
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:346:1: ruleWBSWorkPackage
                    {
                     before(grammarAccess.getWBSNodeAccess().getWBSWorkPackageParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleWBSWorkPackage_in_rule__WBSNode__Alternatives676);
                    ruleWBSWorkPackage();

                    state._fsp--;

                     after(grammarAccess.getWBSNodeAccess().getWBSWorkPackageParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:351:6: ( ruleWBSDeliverable )
                    {
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:351:6: ( ruleWBSDeliverable )
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:352:1: ruleWBSDeliverable
                    {
                     before(grammarAccess.getWBSNodeAccess().getWBSDeliverableParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleWBSDeliverable_in_rule__WBSNode__Alternatives693);
                    ruleWBSDeliverable();

                    state._fsp--;

                     after(grammarAccess.getWBSNodeAccess().getWBSDeliverableParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSNode__Alternatives"


    // $ANTLR start "rule__WBSActivity__Alternatives_3"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:362:1: rule__WBSActivity__Alternatives_3 : ( ( ( rule__WBSActivity__Group_3_0__0 ) ) | ( RULE_ENDLINE ) );
    public final void rule__WBSActivity__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:366:1: ( ( ( rule__WBSActivity__Group_3_0__0 ) ) | ( RULE_ENDLINE ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_OPENCURLY) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ENDLINE) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:367:1: ( ( rule__WBSActivity__Group_3_0__0 ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:367:1: ( ( rule__WBSActivity__Group_3_0__0 ) )
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:368:1: ( rule__WBSActivity__Group_3_0__0 )
                    {
                     before(grammarAccess.getWBSActivityAccess().getGroup_3_0()); 
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:369:1: ( rule__WBSActivity__Group_3_0__0 )
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:369:2: rule__WBSActivity__Group_3_0__0
                    {
                    pushFollow(FOLLOW_rule__WBSActivity__Group_3_0__0_in_rule__WBSActivity__Alternatives_3725);
                    rule__WBSActivity__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getWBSActivityAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:373:6: ( RULE_ENDLINE )
                    {
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:373:6: ( RULE_ENDLINE )
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:374:1: RULE_ENDLINE
                    {
                     before(grammarAccess.getWBSActivityAccess().getENDLINETerminalRuleCall_3_1()); 
                    match(input,RULE_ENDLINE,FOLLOW_RULE_ENDLINE_in_rule__WBSActivity__Alternatives_3743); 
                     after(grammarAccess.getWBSActivityAccess().getENDLINETerminalRuleCall_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSActivity__Alternatives_3"


    // $ANTLR start "rule__WBSWorkPackage__Alternatives_3"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:384:1: rule__WBSWorkPackage__Alternatives_3 : ( ( ( rule__WBSWorkPackage__Group_3_0__0 ) ) | ( RULE_ENDLINE ) );
    public final void rule__WBSWorkPackage__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:388:1: ( ( ( rule__WBSWorkPackage__Group_3_0__0 ) ) | ( RULE_ENDLINE ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_OPENCURLY) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ENDLINE) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:389:1: ( ( rule__WBSWorkPackage__Group_3_0__0 ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:389:1: ( ( rule__WBSWorkPackage__Group_3_0__0 ) )
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:390:1: ( rule__WBSWorkPackage__Group_3_0__0 )
                    {
                     before(grammarAccess.getWBSWorkPackageAccess().getGroup_3_0()); 
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:391:1: ( rule__WBSWorkPackage__Group_3_0__0 )
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:391:2: rule__WBSWorkPackage__Group_3_0__0
                    {
                    pushFollow(FOLLOW_rule__WBSWorkPackage__Group_3_0__0_in_rule__WBSWorkPackage__Alternatives_3775);
                    rule__WBSWorkPackage__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getWBSWorkPackageAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:395:6: ( RULE_ENDLINE )
                    {
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:395:6: ( RULE_ENDLINE )
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:396:1: RULE_ENDLINE
                    {
                     before(grammarAccess.getWBSWorkPackageAccess().getENDLINETerminalRuleCall_3_1()); 
                    match(input,RULE_ENDLINE,FOLLOW_RULE_ENDLINE_in_rule__WBSWorkPackage__Alternatives_3793); 
                     after(grammarAccess.getWBSWorkPackageAccess().getENDLINETerminalRuleCall_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSWorkPackage__Alternatives_3"


    // $ANTLR start "rule__WBSDeliverable__Alternatives_3"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:406:1: rule__WBSDeliverable__Alternatives_3 : ( ( ( rule__WBSDeliverable__Group_3_0__0 ) ) | ( RULE_ENDLINE ) );
    public final void rule__WBSDeliverable__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:410:1: ( ( ( rule__WBSDeliverable__Group_3_0__0 ) ) | ( RULE_ENDLINE ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_OPENCURLY) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ENDLINE) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:411:1: ( ( rule__WBSDeliverable__Group_3_0__0 ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:411:1: ( ( rule__WBSDeliverable__Group_3_0__0 ) )
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:412:1: ( rule__WBSDeliverable__Group_3_0__0 )
                    {
                     before(grammarAccess.getWBSDeliverableAccess().getGroup_3_0()); 
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:413:1: ( rule__WBSDeliverable__Group_3_0__0 )
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:413:2: rule__WBSDeliverable__Group_3_0__0
                    {
                    pushFollow(FOLLOW_rule__WBSDeliverable__Group_3_0__0_in_rule__WBSDeliverable__Alternatives_3825);
                    rule__WBSDeliverable__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getWBSDeliverableAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:417:6: ( RULE_ENDLINE )
                    {
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:417:6: ( RULE_ENDLINE )
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:418:1: RULE_ENDLINE
                    {
                     before(grammarAccess.getWBSDeliverableAccess().getENDLINETerminalRuleCall_3_1()); 
                    match(input,RULE_ENDLINE,FOLLOW_RULE_ENDLINE_in_rule__WBSDeliverable__Alternatives_3843); 
                     after(grammarAccess.getWBSDeliverableAccess().getENDLINETerminalRuleCall_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSDeliverable__Alternatives_3"


    // $ANTLR start "rule__WBSProgram__Group__0"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:430:1: rule__WBSProgram__Group__0 : rule__WBSProgram__Group__0__Impl rule__WBSProgram__Group__1 ;
    public final void rule__WBSProgram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:434:1: ( rule__WBSProgram__Group__0__Impl rule__WBSProgram__Group__1 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:435:2: rule__WBSProgram__Group__0__Impl rule__WBSProgram__Group__1
            {
            pushFollow(FOLLOW_rule__WBSProgram__Group__0__Impl_in_rule__WBSProgram__Group__0873);
            rule__WBSProgram__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSProgram__Group__1_in_rule__WBSProgram__Group__0876);
            rule__WBSProgram__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProgram__Group__0"


    // $ANTLR start "rule__WBSProgram__Group__0__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:442:1: rule__WBSProgram__Group__0__Impl : ( ( rule__WBSProgram__DescriptionAssignment_0 )? ) ;
    public final void rule__WBSProgram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:446:1: ( ( ( rule__WBSProgram__DescriptionAssignment_0 )? ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:447:1: ( ( rule__WBSProgram__DescriptionAssignment_0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:447:1: ( ( rule__WBSProgram__DescriptionAssignment_0 )? )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:448:1: ( rule__WBSProgram__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getWBSProgramAccess().getDescriptionAssignment_0()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:449:1: ( rule__WBSProgram__DescriptionAssignment_0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ML_COMMENT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:449:2: rule__WBSProgram__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__WBSProgram__DescriptionAssignment_0_in_rule__WBSProgram__Group__0__Impl903);
                    rule__WBSProgram__DescriptionAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWBSProgramAccess().getDescriptionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProgram__Group__0__Impl"


    // $ANTLR start "rule__WBSProgram__Group__1"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:459:1: rule__WBSProgram__Group__1 : rule__WBSProgram__Group__1__Impl rule__WBSProgram__Group__2 ;
    public final void rule__WBSProgram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:463:1: ( rule__WBSProgram__Group__1__Impl rule__WBSProgram__Group__2 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:464:2: rule__WBSProgram__Group__1__Impl rule__WBSProgram__Group__2
            {
            pushFollow(FOLLOW_rule__WBSProgram__Group__1__Impl_in_rule__WBSProgram__Group__1934);
            rule__WBSProgram__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSProgram__Group__2_in_rule__WBSProgram__Group__1937);
            rule__WBSProgram__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProgram__Group__1"


    // $ANTLR start "rule__WBSProgram__Group__1__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:471:1: rule__WBSProgram__Group__1__Impl : ( 'Program ' ) ;
    public final void rule__WBSProgram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:475:1: ( ( 'Program ' ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:476:1: ( 'Program ' )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:476:1: ( 'Program ' )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:477:1: 'Program '
            {
             before(grammarAccess.getWBSProgramAccess().getProgramKeyword_1()); 
            match(input,14,FOLLOW_14_in_rule__WBSProgram__Group__1__Impl965); 
             after(grammarAccess.getWBSProgramAccess().getProgramKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProgram__Group__1__Impl"


    // $ANTLR start "rule__WBSProgram__Group__2"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:490:1: rule__WBSProgram__Group__2 : rule__WBSProgram__Group__2__Impl rule__WBSProgram__Group__3 ;
    public final void rule__WBSProgram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:494:1: ( rule__WBSProgram__Group__2__Impl rule__WBSProgram__Group__3 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:495:2: rule__WBSProgram__Group__2__Impl rule__WBSProgram__Group__3
            {
            pushFollow(FOLLOW_rule__WBSProgram__Group__2__Impl_in_rule__WBSProgram__Group__2996);
            rule__WBSProgram__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSProgram__Group__3_in_rule__WBSProgram__Group__2999);
            rule__WBSProgram__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProgram__Group__2"


    // $ANTLR start "rule__WBSProgram__Group__2__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:502:1: rule__WBSProgram__Group__2__Impl : ( ( rule__WBSProgram__NameAssignment_2 ) ) ;
    public final void rule__WBSProgram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:506:1: ( ( ( rule__WBSProgram__NameAssignment_2 ) ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:507:1: ( ( rule__WBSProgram__NameAssignment_2 ) )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:507:1: ( ( rule__WBSProgram__NameAssignment_2 ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:508:1: ( rule__WBSProgram__NameAssignment_2 )
            {
             before(grammarAccess.getWBSProgramAccess().getNameAssignment_2()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:509:1: ( rule__WBSProgram__NameAssignment_2 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:509:2: rule__WBSProgram__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__WBSProgram__NameAssignment_2_in_rule__WBSProgram__Group__2__Impl1026);
            rule__WBSProgram__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWBSProgramAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProgram__Group__2__Impl"


    // $ANTLR start "rule__WBSProgram__Group__3"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:519:1: rule__WBSProgram__Group__3 : rule__WBSProgram__Group__3__Impl rule__WBSProgram__Group__4 ;
    public final void rule__WBSProgram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:523:1: ( rule__WBSProgram__Group__3__Impl rule__WBSProgram__Group__4 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:524:2: rule__WBSProgram__Group__3__Impl rule__WBSProgram__Group__4
            {
            pushFollow(FOLLOW_rule__WBSProgram__Group__3__Impl_in_rule__WBSProgram__Group__31056);
            rule__WBSProgram__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSProgram__Group__4_in_rule__WBSProgram__Group__31059);
            rule__WBSProgram__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProgram__Group__3"


    // $ANTLR start "rule__WBSProgram__Group__3__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:531:1: rule__WBSProgram__Group__3__Impl : ( RULE_OPENCURLY ) ;
    public final void rule__WBSProgram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:535:1: ( ( RULE_OPENCURLY ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:536:1: ( RULE_OPENCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:536:1: ( RULE_OPENCURLY )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:537:1: RULE_OPENCURLY
            {
             before(grammarAccess.getWBSProgramAccess().getOPENCURLYTerminalRuleCall_3()); 
            match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_rule__WBSProgram__Group__3__Impl1086); 
             after(grammarAccess.getWBSProgramAccess().getOPENCURLYTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProgram__Group__3__Impl"


    // $ANTLR start "rule__WBSProgram__Group__4"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:548:1: rule__WBSProgram__Group__4 : rule__WBSProgram__Group__4__Impl rule__WBSProgram__Group__5 ;
    public final void rule__WBSProgram__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:552:1: ( rule__WBSProgram__Group__4__Impl rule__WBSProgram__Group__5 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:553:2: rule__WBSProgram__Group__4__Impl rule__WBSProgram__Group__5
            {
            pushFollow(FOLLOW_rule__WBSProgram__Group__4__Impl_in_rule__WBSProgram__Group__41115);
            rule__WBSProgram__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSProgram__Group__5_in_rule__WBSProgram__Group__41118);
            rule__WBSProgram__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProgram__Group__4"


    // $ANTLR start "rule__WBSProgram__Group__4__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:560:1: rule__WBSProgram__Group__4__Impl : ( ( rule__WBSProgram__Group_4__0 )* ) ;
    public final void rule__WBSProgram__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:564:1: ( ( ( rule__WBSProgram__Group_4__0 )* ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:565:1: ( ( rule__WBSProgram__Group_4__0 )* )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:565:1: ( ( rule__WBSProgram__Group_4__0 )* )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:566:1: ( rule__WBSProgram__Group_4__0 )*
            {
             before(grammarAccess.getWBSProgramAccess().getGroup_4()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:567:1: ( rule__WBSProgram__Group_4__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==21) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:567:2: rule__WBSProgram__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__WBSProgram__Group_4__0_in_rule__WBSProgram__Group__4__Impl1145);
            	    rule__WBSProgram__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getWBSProgramAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProgram__Group__4__Impl"


    // $ANTLR start "rule__WBSProgram__Group__5"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:577:1: rule__WBSProgram__Group__5 : rule__WBSProgram__Group__5__Impl rule__WBSProgram__Group__6 ;
    public final void rule__WBSProgram__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:581:1: ( rule__WBSProgram__Group__5__Impl rule__WBSProgram__Group__6 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:582:2: rule__WBSProgram__Group__5__Impl rule__WBSProgram__Group__6
            {
            pushFollow(FOLLOW_rule__WBSProgram__Group__5__Impl_in_rule__WBSProgram__Group__51176);
            rule__WBSProgram__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSProgram__Group__6_in_rule__WBSProgram__Group__51179);
            rule__WBSProgram__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProgram__Group__5"


    // $ANTLR start "rule__WBSProgram__Group__5__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:589:1: rule__WBSProgram__Group__5__Impl : ( ( rule__WBSProgram__ProjectsAssignment_5 )* ) ;
    public final void rule__WBSProgram__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:593:1: ( ( ( rule__WBSProgram__ProjectsAssignment_5 )* ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:594:1: ( ( rule__WBSProgram__ProjectsAssignment_5 )* )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:594:1: ( ( rule__WBSProgram__ProjectsAssignment_5 )* )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:595:1: ( rule__WBSProgram__ProjectsAssignment_5 )*
            {
             before(grammarAccess.getWBSProgramAccess().getProjectsAssignment_5()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:596:1: ( rule__WBSProgram__ProjectsAssignment_5 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ML_COMMENT||LA8_0==16) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:596:2: rule__WBSProgram__ProjectsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__WBSProgram__ProjectsAssignment_5_in_rule__WBSProgram__Group__5__Impl1206);
            	    rule__WBSProgram__ProjectsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getWBSProgramAccess().getProjectsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProgram__Group__5__Impl"


    // $ANTLR start "rule__WBSProgram__Group__6"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:606:1: rule__WBSProgram__Group__6 : rule__WBSProgram__Group__6__Impl rule__WBSProgram__Group__7 ;
    public final void rule__WBSProgram__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:610:1: ( rule__WBSProgram__Group__6__Impl rule__WBSProgram__Group__7 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:611:2: rule__WBSProgram__Group__6__Impl rule__WBSProgram__Group__7
            {
            pushFollow(FOLLOW_rule__WBSProgram__Group__6__Impl_in_rule__WBSProgram__Group__61237);
            rule__WBSProgram__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSProgram__Group__7_in_rule__WBSProgram__Group__61240);
            rule__WBSProgram__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProgram__Group__6"


    // $ANTLR start "rule__WBSProgram__Group__6__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:618:1: rule__WBSProgram__Group__6__Impl : ( ( rule__WBSProgram__Group_6__0 )? ) ;
    public final void rule__WBSProgram__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:622:1: ( ( ( rule__WBSProgram__Group_6__0 )? ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:623:1: ( ( rule__WBSProgram__Group_6__0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:623:1: ( ( rule__WBSProgram__Group_6__0 )? )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:624:1: ( rule__WBSProgram__Group_6__0 )?
            {
             before(grammarAccess.getWBSProgramAccess().getGroup_6()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:625:1: ( rule__WBSProgram__Group_6__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:625:2: rule__WBSProgram__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__WBSProgram__Group_6__0_in_rule__WBSProgram__Group__6__Impl1267);
                    rule__WBSProgram__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWBSProgramAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProgram__Group__6__Impl"


    // $ANTLR start "rule__WBSProgram__Group__7"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:635:1: rule__WBSProgram__Group__7 : rule__WBSProgram__Group__7__Impl ;
    public final void rule__WBSProgram__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:639:1: ( rule__WBSProgram__Group__7__Impl )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:640:2: rule__WBSProgram__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__WBSProgram__Group__7__Impl_in_rule__WBSProgram__Group__71298);
            rule__WBSProgram__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProgram__Group__7"


    // $ANTLR start "rule__WBSProgram__Group__7__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:646:1: rule__WBSProgram__Group__7__Impl : ( RULE_CLOSEDCURLY ) ;
    public final void rule__WBSProgram__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:650:1: ( ( RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:651:1: ( RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:651:1: ( RULE_CLOSEDCURLY )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:652:1: RULE_CLOSEDCURLY
            {
             before(grammarAccess.getWBSProgramAccess().getCLOSEDCURLYTerminalRuleCall_7()); 
            match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_rule__WBSProgram__Group__7__Impl1325); 
             after(grammarAccess.getWBSProgramAccess().getCLOSEDCURLYTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProgram__Group__7__Impl"


    // $ANTLR start "rule__WBSProgram__Group_4__0"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:679:1: rule__WBSProgram__Group_4__0 : rule__WBSProgram__Group_4__0__Impl rule__WBSProgram__Group_4__1 ;
    public final void rule__WBSProgram__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:683:1: ( rule__WBSProgram__Group_4__0__Impl rule__WBSProgram__Group_4__1 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:684:2: rule__WBSProgram__Group_4__0__Impl rule__WBSProgram__Group_4__1
            {
            pushFollow(FOLLOW_rule__WBSProgram__Group_4__0__Impl_in_rule__WBSProgram__Group_4__01370);
            rule__WBSProgram__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSProgram__Group_4__1_in_rule__WBSProgram__Group_4__01373);
            rule__WBSProgram__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProgram__Group_4__0"


    // $ANTLR start "rule__WBSProgram__Group_4__0__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:691:1: rule__WBSProgram__Group_4__0__Impl : ( ( rule__WBSProgram__RequirementsModelAssignment_4_0 ) ) ;
    public final void rule__WBSProgram__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:695:1: ( ( ( rule__WBSProgram__RequirementsModelAssignment_4_0 ) ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:696:1: ( ( rule__WBSProgram__RequirementsModelAssignment_4_0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:696:1: ( ( rule__WBSProgram__RequirementsModelAssignment_4_0 ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:697:1: ( rule__WBSProgram__RequirementsModelAssignment_4_0 )
            {
             before(grammarAccess.getWBSProgramAccess().getRequirementsModelAssignment_4_0()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:698:1: ( rule__WBSProgram__RequirementsModelAssignment_4_0 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:698:2: rule__WBSProgram__RequirementsModelAssignment_4_0
            {
            pushFollow(FOLLOW_rule__WBSProgram__RequirementsModelAssignment_4_0_in_rule__WBSProgram__Group_4__0__Impl1400);
            rule__WBSProgram__RequirementsModelAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getWBSProgramAccess().getRequirementsModelAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProgram__Group_4__0__Impl"


    // $ANTLR start "rule__WBSProgram__Group_4__1"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:708:1: rule__WBSProgram__Group_4__1 : rule__WBSProgram__Group_4__1__Impl ;
    public final void rule__WBSProgram__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:712:1: ( rule__WBSProgram__Group_4__1__Impl )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:713:2: rule__WBSProgram__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__WBSProgram__Group_4__1__Impl_in_rule__WBSProgram__Group_4__11430);
            rule__WBSProgram__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProgram__Group_4__1"


    // $ANTLR start "rule__WBSProgram__Group_4__1__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:719:1: rule__WBSProgram__Group_4__1__Impl : ( RULE_ENDLINE ) ;
    public final void rule__WBSProgram__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:723:1: ( ( RULE_ENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:724:1: ( RULE_ENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:724:1: ( RULE_ENDLINE )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:725:1: RULE_ENDLINE
            {
             before(grammarAccess.getWBSProgramAccess().getENDLINETerminalRuleCall_4_1()); 
            match(input,RULE_ENDLINE,FOLLOW_RULE_ENDLINE_in_rule__WBSProgram__Group_4__1__Impl1457); 
             after(grammarAccess.getWBSProgramAccess().getENDLINETerminalRuleCall_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProgram__Group_4__1__Impl"


    // $ANTLR start "rule__WBSProgram__Group_6__0"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:740:1: rule__WBSProgram__Group_6__0 : rule__WBSProgram__Group_6__0__Impl rule__WBSProgram__Group_6__1 ;
    public final void rule__WBSProgram__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:744:1: ( rule__WBSProgram__Group_6__0__Impl rule__WBSProgram__Group_6__1 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:745:2: rule__WBSProgram__Group_6__0__Impl rule__WBSProgram__Group_6__1
            {
            pushFollow(FOLLOW_rule__WBSProgram__Group_6__0__Impl_in_rule__WBSProgram__Group_6__01490);
            rule__WBSProgram__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSProgram__Group_6__1_in_rule__WBSProgram__Group_6__01493);
            rule__WBSProgram__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProgram__Group_6__0"


    // $ANTLR start "rule__WBSProgram__Group_6__0__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:752:1: rule__WBSProgram__Group_6__0__Impl : ( 'requirements' ) ;
    public final void rule__WBSProgram__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:756:1: ( ( 'requirements' ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:757:1: ( 'requirements' )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:757:1: ( 'requirements' )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:758:1: 'requirements'
            {
             before(grammarAccess.getWBSProgramAccess().getRequirementsKeyword_6_0()); 
            match(input,15,FOLLOW_15_in_rule__WBSProgram__Group_6__0__Impl1521); 
             after(grammarAccess.getWBSProgramAccess().getRequirementsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProgram__Group_6__0__Impl"


    // $ANTLR start "rule__WBSProgram__Group_6__1"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:771:1: rule__WBSProgram__Group_6__1 : rule__WBSProgram__Group_6__1__Impl rule__WBSProgram__Group_6__2 ;
    public final void rule__WBSProgram__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:775:1: ( rule__WBSProgram__Group_6__1__Impl rule__WBSProgram__Group_6__2 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:776:2: rule__WBSProgram__Group_6__1__Impl rule__WBSProgram__Group_6__2
            {
            pushFollow(FOLLOW_rule__WBSProgram__Group_6__1__Impl_in_rule__WBSProgram__Group_6__11552);
            rule__WBSProgram__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSProgram__Group_6__2_in_rule__WBSProgram__Group_6__11555);
            rule__WBSProgram__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProgram__Group_6__1"


    // $ANTLR start "rule__WBSProgram__Group_6__1__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:783:1: rule__WBSProgram__Group_6__1__Impl : ( RULE_OPENCURLY ) ;
    public final void rule__WBSProgram__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:787:1: ( ( RULE_OPENCURLY ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:788:1: ( RULE_OPENCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:788:1: ( RULE_OPENCURLY )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:789:1: RULE_OPENCURLY
            {
             before(grammarAccess.getWBSProgramAccess().getOPENCURLYTerminalRuleCall_6_1()); 
            match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_rule__WBSProgram__Group_6__1__Impl1582); 
             after(grammarAccess.getWBSProgramAccess().getOPENCURLYTerminalRuleCall_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProgram__Group_6__1__Impl"


    // $ANTLR start "rule__WBSProgram__Group_6__2"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:800:1: rule__WBSProgram__Group_6__2 : rule__WBSProgram__Group_6__2__Impl rule__WBSProgram__Group_6__3 ;
    public final void rule__WBSProgram__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:804:1: ( rule__WBSProgram__Group_6__2__Impl rule__WBSProgram__Group_6__3 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:805:2: rule__WBSProgram__Group_6__2__Impl rule__WBSProgram__Group_6__3
            {
            pushFollow(FOLLOW_rule__WBSProgram__Group_6__2__Impl_in_rule__WBSProgram__Group_6__21611);
            rule__WBSProgram__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSProgram__Group_6__3_in_rule__WBSProgram__Group_6__21614);
            rule__WBSProgram__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProgram__Group_6__2"


    // $ANTLR start "rule__WBSProgram__Group_6__2__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:812:1: rule__WBSProgram__Group_6__2__Impl : ( ( rule__WBSProgram__Group_6_2__0 )? ) ;
    public final void rule__WBSProgram__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:816:1: ( ( ( rule__WBSProgram__Group_6_2__0 )? ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:817:1: ( ( rule__WBSProgram__Group_6_2__0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:817:1: ( ( rule__WBSProgram__Group_6_2__0 )? )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:818:1: ( rule__WBSProgram__Group_6_2__0 )?
            {
             before(grammarAccess.getWBSProgramAccess().getGroup_6_2()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:819:1: ( rule__WBSProgram__Group_6_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:819:2: rule__WBSProgram__Group_6_2__0
                    {
                    pushFollow(FOLLOW_rule__WBSProgram__Group_6_2__0_in_rule__WBSProgram__Group_6__2__Impl1641);
                    rule__WBSProgram__Group_6_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWBSProgramAccess().getGroup_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProgram__Group_6__2__Impl"


    // $ANTLR start "rule__WBSProgram__Group_6__3"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:829:1: rule__WBSProgram__Group_6__3 : rule__WBSProgram__Group_6__3__Impl ;
    public final void rule__WBSProgram__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:833:1: ( rule__WBSProgram__Group_6__3__Impl )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:834:2: rule__WBSProgram__Group_6__3__Impl
            {
            pushFollow(FOLLOW_rule__WBSProgram__Group_6__3__Impl_in_rule__WBSProgram__Group_6__31672);
            rule__WBSProgram__Group_6__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProgram__Group_6__3"


    // $ANTLR start "rule__WBSProgram__Group_6__3__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:840:1: rule__WBSProgram__Group_6__3__Impl : ( RULE_CLOSEDCURLY ) ;
    public final void rule__WBSProgram__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:844:1: ( ( RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:845:1: ( RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:845:1: ( RULE_CLOSEDCURLY )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:846:1: RULE_CLOSEDCURLY
            {
             before(grammarAccess.getWBSProgramAccess().getCLOSEDCURLYTerminalRuleCall_6_3()); 
            match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_rule__WBSProgram__Group_6__3__Impl1699); 
             after(grammarAccess.getWBSProgramAccess().getCLOSEDCURLYTerminalRuleCall_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProgram__Group_6__3__Impl"


    // $ANTLR start "rule__WBSProgram__Group_6_2__0"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:865:1: rule__WBSProgram__Group_6_2__0 : rule__WBSProgram__Group_6_2__0__Impl rule__WBSProgram__Group_6_2__1 ;
    public final void rule__WBSProgram__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:869:1: ( rule__WBSProgram__Group_6_2__0__Impl rule__WBSProgram__Group_6_2__1 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:870:2: rule__WBSProgram__Group_6_2__0__Impl rule__WBSProgram__Group_6_2__1
            {
            pushFollow(FOLLOW_rule__WBSProgram__Group_6_2__0__Impl_in_rule__WBSProgram__Group_6_2__01736);
            rule__WBSProgram__Group_6_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSProgram__Group_6_2__1_in_rule__WBSProgram__Group_6_2__01739);
            rule__WBSProgram__Group_6_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProgram__Group_6_2__0"


    // $ANTLR start "rule__WBSProgram__Group_6_2__0__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:877:1: rule__WBSProgram__Group_6_2__0__Impl : ( ( rule__WBSProgram__RequirementsAssignment_6_2_0 ) ) ;
    public final void rule__WBSProgram__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:881:1: ( ( ( rule__WBSProgram__RequirementsAssignment_6_2_0 ) ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:882:1: ( ( rule__WBSProgram__RequirementsAssignment_6_2_0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:882:1: ( ( rule__WBSProgram__RequirementsAssignment_6_2_0 ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:883:1: ( rule__WBSProgram__RequirementsAssignment_6_2_0 )
            {
             before(grammarAccess.getWBSProgramAccess().getRequirementsAssignment_6_2_0()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:884:1: ( rule__WBSProgram__RequirementsAssignment_6_2_0 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:884:2: rule__WBSProgram__RequirementsAssignment_6_2_0
            {
            pushFollow(FOLLOW_rule__WBSProgram__RequirementsAssignment_6_2_0_in_rule__WBSProgram__Group_6_2__0__Impl1766);
            rule__WBSProgram__RequirementsAssignment_6_2_0();

            state._fsp--;


            }

             after(grammarAccess.getWBSProgramAccess().getRequirementsAssignment_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProgram__Group_6_2__0__Impl"


    // $ANTLR start "rule__WBSProgram__Group_6_2__1"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:894:1: rule__WBSProgram__Group_6_2__1 : rule__WBSProgram__Group_6_2__1__Impl ;
    public final void rule__WBSProgram__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:898:1: ( rule__WBSProgram__Group_6_2__1__Impl )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:899:2: rule__WBSProgram__Group_6_2__1__Impl
            {
            pushFollow(FOLLOW_rule__WBSProgram__Group_6_2__1__Impl_in_rule__WBSProgram__Group_6_2__11796);
            rule__WBSProgram__Group_6_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProgram__Group_6_2__1"


    // $ANTLR start "rule__WBSProgram__Group_6_2__1__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:905:1: rule__WBSProgram__Group_6_2__1__Impl : ( RULE_ENDLINE ) ;
    public final void rule__WBSProgram__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:909:1: ( ( RULE_ENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:910:1: ( RULE_ENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:910:1: ( RULE_ENDLINE )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:911:1: RULE_ENDLINE
            {
             before(grammarAccess.getWBSProgramAccess().getENDLINETerminalRuleCall_6_2_1()); 
            match(input,RULE_ENDLINE,FOLLOW_RULE_ENDLINE_in_rule__WBSProgram__Group_6_2__1__Impl1823); 
             after(grammarAccess.getWBSProgramAccess().getENDLINETerminalRuleCall_6_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProgram__Group_6_2__1__Impl"


    // $ANTLR start "rule__WBSProject__Group__0"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:926:1: rule__WBSProject__Group__0 : rule__WBSProject__Group__0__Impl rule__WBSProject__Group__1 ;
    public final void rule__WBSProject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:930:1: ( rule__WBSProject__Group__0__Impl rule__WBSProject__Group__1 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:931:2: rule__WBSProject__Group__0__Impl rule__WBSProject__Group__1
            {
            pushFollow(FOLLOW_rule__WBSProject__Group__0__Impl_in_rule__WBSProject__Group__01856);
            rule__WBSProject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSProject__Group__1_in_rule__WBSProject__Group__01859);
            rule__WBSProject__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProject__Group__0"


    // $ANTLR start "rule__WBSProject__Group__0__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:938:1: rule__WBSProject__Group__0__Impl : ( ( rule__WBSProject__DescriptionAssignment_0 )? ) ;
    public final void rule__WBSProject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:942:1: ( ( ( rule__WBSProject__DescriptionAssignment_0 )? ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:943:1: ( ( rule__WBSProject__DescriptionAssignment_0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:943:1: ( ( rule__WBSProject__DescriptionAssignment_0 )? )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:944:1: ( rule__WBSProject__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getWBSProjectAccess().getDescriptionAssignment_0()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:945:1: ( rule__WBSProject__DescriptionAssignment_0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ML_COMMENT) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:945:2: rule__WBSProject__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__WBSProject__DescriptionAssignment_0_in_rule__WBSProject__Group__0__Impl1886);
                    rule__WBSProject__DescriptionAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWBSProjectAccess().getDescriptionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProject__Group__0__Impl"


    // $ANTLR start "rule__WBSProject__Group__1"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:955:1: rule__WBSProject__Group__1 : rule__WBSProject__Group__1__Impl rule__WBSProject__Group__2 ;
    public final void rule__WBSProject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:959:1: ( rule__WBSProject__Group__1__Impl rule__WBSProject__Group__2 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:960:2: rule__WBSProject__Group__1__Impl rule__WBSProject__Group__2
            {
            pushFollow(FOLLOW_rule__WBSProject__Group__1__Impl_in_rule__WBSProject__Group__11917);
            rule__WBSProject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSProject__Group__2_in_rule__WBSProject__Group__11920);
            rule__WBSProject__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProject__Group__1"


    // $ANTLR start "rule__WBSProject__Group__1__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:967:1: rule__WBSProject__Group__1__Impl : ( 'Project ' ) ;
    public final void rule__WBSProject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:971:1: ( ( 'Project ' ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:972:1: ( 'Project ' )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:972:1: ( 'Project ' )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:973:1: 'Project '
            {
             before(grammarAccess.getWBSProjectAccess().getProjectKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__WBSProject__Group__1__Impl1948); 
             after(grammarAccess.getWBSProjectAccess().getProjectKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProject__Group__1__Impl"


    // $ANTLR start "rule__WBSProject__Group__2"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:986:1: rule__WBSProject__Group__2 : rule__WBSProject__Group__2__Impl rule__WBSProject__Group__3 ;
    public final void rule__WBSProject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:990:1: ( rule__WBSProject__Group__2__Impl rule__WBSProject__Group__3 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:991:2: rule__WBSProject__Group__2__Impl rule__WBSProject__Group__3
            {
            pushFollow(FOLLOW_rule__WBSProject__Group__2__Impl_in_rule__WBSProject__Group__21979);
            rule__WBSProject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSProject__Group__3_in_rule__WBSProject__Group__21982);
            rule__WBSProject__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProject__Group__2"


    // $ANTLR start "rule__WBSProject__Group__2__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:998:1: rule__WBSProject__Group__2__Impl : ( ( rule__WBSProject__NameAssignment_2 ) ) ;
    public final void rule__WBSProject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1002:1: ( ( ( rule__WBSProject__NameAssignment_2 ) ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1003:1: ( ( rule__WBSProject__NameAssignment_2 ) )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1003:1: ( ( rule__WBSProject__NameAssignment_2 ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1004:1: ( rule__WBSProject__NameAssignment_2 )
            {
             before(grammarAccess.getWBSProjectAccess().getNameAssignment_2()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1005:1: ( rule__WBSProject__NameAssignment_2 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1005:2: rule__WBSProject__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__WBSProject__NameAssignment_2_in_rule__WBSProject__Group__2__Impl2009);
            rule__WBSProject__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWBSProjectAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProject__Group__2__Impl"


    // $ANTLR start "rule__WBSProject__Group__3"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1015:1: rule__WBSProject__Group__3 : rule__WBSProject__Group__3__Impl rule__WBSProject__Group__4 ;
    public final void rule__WBSProject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1019:1: ( rule__WBSProject__Group__3__Impl rule__WBSProject__Group__4 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1020:2: rule__WBSProject__Group__3__Impl rule__WBSProject__Group__4
            {
            pushFollow(FOLLOW_rule__WBSProject__Group__3__Impl_in_rule__WBSProject__Group__32039);
            rule__WBSProject__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSProject__Group__4_in_rule__WBSProject__Group__32042);
            rule__WBSProject__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProject__Group__3"


    // $ANTLR start "rule__WBSProject__Group__3__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1027:1: rule__WBSProject__Group__3__Impl : ( RULE_OPENCURLY ) ;
    public final void rule__WBSProject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1031:1: ( ( RULE_OPENCURLY ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1032:1: ( RULE_OPENCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1032:1: ( RULE_OPENCURLY )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1033:1: RULE_OPENCURLY
            {
             before(grammarAccess.getWBSProjectAccess().getOPENCURLYTerminalRuleCall_3()); 
            match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_rule__WBSProject__Group__3__Impl2069); 
             after(grammarAccess.getWBSProjectAccess().getOPENCURLYTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProject__Group__3__Impl"


    // $ANTLR start "rule__WBSProject__Group__4"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1044:1: rule__WBSProject__Group__4 : rule__WBSProject__Group__4__Impl rule__WBSProject__Group__5 ;
    public final void rule__WBSProject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1048:1: ( rule__WBSProject__Group__4__Impl rule__WBSProject__Group__5 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1049:2: rule__WBSProject__Group__4__Impl rule__WBSProject__Group__5
            {
            pushFollow(FOLLOW_rule__WBSProject__Group__4__Impl_in_rule__WBSProject__Group__42098);
            rule__WBSProject__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSProject__Group__5_in_rule__WBSProject__Group__42101);
            rule__WBSProject__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProject__Group__4"


    // $ANTLR start "rule__WBSProject__Group__4__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1056:1: rule__WBSProject__Group__4__Impl : ( ( rule__WBSProject__Group_4__0 )* ) ;
    public final void rule__WBSProject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1060:1: ( ( ( rule__WBSProject__Group_4__0 )* ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1061:1: ( ( rule__WBSProject__Group_4__0 )* )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1061:1: ( ( rule__WBSProject__Group_4__0 )* )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1062:1: ( rule__WBSProject__Group_4__0 )*
            {
             before(grammarAccess.getWBSProjectAccess().getGroup_4()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1063:1: ( rule__WBSProject__Group_4__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==21) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1063:2: rule__WBSProject__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__WBSProject__Group_4__0_in_rule__WBSProject__Group__4__Impl2128);
            	    rule__WBSProject__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getWBSProjectAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProject__Group__4__Impl"


    // $ANTLR start "rule__WBSProject__Group__5"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1073:1: rule__WBSProject__Group__5 : rule__WBSProject__Group__5__Impl rule__WBSProject__Group__6 ;
    public final void rule__WBSProject__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1077:1: ( rule__WBSProject__Group__5__Impl rule__WBSProject__Group__6 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1078:2: rule__WBSProject__Group__5__Impl rule__WBSProject__Group__6
            {
            pushFollow(FOLLOW_rule__WBSProject__Group__5__Impl_in_rule__WBSProject__Group__52159);
            rule__WBSProject__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSProject__Group__6_in_rule__WBSProject__Group__52162);
            rule__WBSProject__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProject__Group__5"


    // $ANTLR start "rule__WBSProject__Group__5__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1085:1: rule__WBSProject__Group__5__Impl : ( ( rule__WBSProject__WbsNodesAssignment_5 )* ) ;
    public final void rule__WBSProject__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1089:1: ( ( ( rule__WBSProject__WbsNodesAssignment_5 )* ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1090:1: ( ( rule__WBSProject__WbsNodesAssignment_5 )* )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1090:1: ( ( rule__WBSProject__WbsNodesAssignment_5 )* )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1091:1: ( rule__WBSProject__WbsNodesAssignment_5 )*
            {
             before(grammarAccess.getWBSProjectAccess().getWbsNodesAssignment_5()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1092:1: ( rule__WBSProject__WbsNodesAssignment_5 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ML_COMMENT||(LA13_0>=17 && LA13_0<=19)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1092:2: rule__WBSProject__WbsNodesAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__WBSProject__WbsNodesAssignment_5_in_rule__WBSProject__Group__5__Impl2189);
            	    rule__WBSProject__WbsNodesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getWBSProjectAccess().getWbsNodesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProject__Group__5__Impl"


    // $ANTLR start "rule__WBSProject__Group__6"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1102:1: rule__WBSProject__Group__6 : rule__WBSProject__Group__6__Impl rule__WBSProject__Group__7 ;
    public final void rule__WBSProject__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1106:1: ( rule__WBSProject__Group__6__Impl rule__WBSProject__Group__7 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1107:2: rule__WBSProject__Group__6__Impl rule__WBSProject__Group__7
            {
            pushFollow(FOLLOW_rule__WBSProject__Group__6__Impl_in_rule__WBSProject__Group__62220);
            rule__WBSProject__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSProject__Group__7_in_rule__WBSProject__Group__62223);
            rule__WBSProject__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProject__Group__6"


    // $ANTLR start "rule__WBSProject__Group__6__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1114:1: rule__WBSProject__Group__6__Impl : ( ( rule__WBSProject__Group_6__0 )? ) ;
    public final void rule__WBSProject__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1118:1: ( ( ( rule__WBSProject__Group_6__0 )? ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1119:1: ( ( rule__WBSProject__Group_6__0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1119:1: ( ( rule__WBSProject__Group_6__0 )? )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1120:1: ( rule__WBSProject__Group_6__0 )?
            {
             before(grammarAccess.getWBSProjectAccess().getGroup_6()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1121:1: ( rule__WBSProject__Group_6__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==15) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1121:2: rule__WBSProject__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__WBSProject__Group_6__0_in_rule__WBSProject__Group__6__Impl2250);
                    rule__WBSProject__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWBSProjectAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProject__Group__6__Impl"


    // $ANTLR start "rule__WBSProject__Group__7"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1131:1: rule__WBSProject__Group__7 : rule__WBSProject__Group__7__Impl ;
    public final void rule__WBSProject__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1135:1: ( rule__WBSProject__Group__7__Impl )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1136:2: rule__WBSProject__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__WBSProject__Group__7__Impl_in_rule__WBSProject__Group__72281);
            rule__WBSProject__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProject__Group__7"


    // $ANTLR start "rule__WBSProject__Group__7__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1142:1: rule__WBSProject__Group__7__Impl : ( RULE_CLOSEDCURLY ) ;
    public final void rule__WBSProject__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1146:1: ( ( RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1147:1: ( RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1147:1: ( RULE_CLOSEDCURLY )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1148:1: RULE_CLOSEDCURLY
            {
             before(grammarAccess.getWBSProjectAccess().getCLOSEDCURLYTerminalRuleCall_7()); 
            match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_rule__WBSProject__Group__7__Impl2308); 
             after(grammarAccess.getWBSProjectAccess().getCLOSEDCURLYTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProject__Group__7__Impl"


    // $ANTLR start "rule__WBSProject__Group_4__0"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1175:1: rule__WBSProject__Group_4__0 : rule__WBSProject__Group_4__0__Impl rule__WBSProject__Group_4__1 ;
    public final void rule__WBSProject__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1179:1: ( rule__WBSProject__Group_4__0__Impl rule__WBSProject__Group_4__1 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1180:2: rule__WBSProject__Group_4__0__Impl rule__WBSProject__Group_4__1
            {
            pushFollow(FOLLOW_rule__WBSProject__Group_4__0__Impl_in_rule__WBSProject__Group_4__02353);
            rule__WBSProject__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSProject__Group_4__1_in_rule__WBSProject__Group_4__02356);
            rule__WBSProject__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProject__Group_4__0"


    // $ANTLR start "rule__WBSProject__Group_4__0__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1187:1: rule__WBSProject__Group_4__0__Impl : ( ( rule__WBSProject__RequirementsModelAssignment_4_0 ) ) ;
    public final void rule__WBSProject__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1191:1: ( ( ( rule__WBSProject__RequirementsModelAssignment_4_0 ) ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1192:1: ( ( rule__WBSProject__RequirementsModelAssignment_4_0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1192:1: ( ( rule__WBSProject__RequirementsModelAssignment_4_0 ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1193:1: ( rule__WBSProject__RequirementsModelAssignment_4_0 )
            {
             before(grammarAccess.getWBSProjectAccess().getRequirementsModelAssignment_4_0()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1194:1: ( rule__WBSProject__RequirementsModelAssignment_4_0 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1194:2: rule__WBSProject__RequirementsModelAssignment_4_0
            {
            pushFollow(FOLLOW_rule__WBSProject__RequirementsModelAssignment_4_0_in_rule__WBSProject__Group_4__0__Impl2383);
            rule__WBSProject__RequirementsModelAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getWBSProjectAccess().getRequirementsModelAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProject__Group_4__0__Impl"


    // $ANTLR start "rule__WBSProject__Group_4__1"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1204:1: rule__WBSProject__Group_4__1 : rule__WBSProject__Group_4__1__Impl ;
    public final void rule__WBSProject__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1208:1: ( rule__WBSProject__Group_4__1__Impl )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1209:2: rule__WBSProject__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__WBSProject__Group_4__1__Impl_in_rule__WBSProject__Group_4__12413);
            rule__WBSProject__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProject__Group_4__1"


    // $ANTLR start "rule__WBSProject__Group_4__1__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1215:1: rule__WBSProject__Group_4__1__Impl : ( RULE_ENDLINE ) ;
    public final void rule__WBSProject__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1219:1: ( ( RULE_ENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1220:1: ( RULE_ENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1220:1: ( RULE_ENDLINE )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1221:1: RULE_ENDLINE
            {
             before(grammarAccess.getWBSProjectAccess().getENDLINETerminalRuleCall_4_1()); 
            match(input,RULE_ENDLINE,FOLLOW_RULE_ENDLINE_in_rule__WBSProject__Group_4__1__Impl2440); 
             after(grammarAccess.getWBSProjectAccess().getENDLINETerminalRuleCall_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProject__Group_4__1__Impl"


    // $ANTLR start "rule__WBSProject__Group_6__0"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1236:1: rule__WBSProject__Group_6__0 : rule__WBSProject__Group_6__0__Impl rule__WBSProject__Group_6__1 ;
    public final void rule__WBSProject__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1240:1: ( rule__WBSProject__Group_6__0__Impl rule__WBSProject__Group_6__1 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1241:2: rule__WBSProject__Group_6__0__Impl rule__WBSProject__Group_6__1
            {
            pushFollow(FOLLOW_rule__WBSProject__Group_6__0__Impl_in_rule__WBSProject__Group_6__02473);
            rule__WBSProject__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSProject__Group_6__1_in_rule__WBSProject__Group_6__02476);
            rule__WBSProject__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProject__Group_6__0"


    // $ANTLR start "rule__WBSProject__Group_6__0__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1248:1: rule__WBSProject__Group_6__0__Impl : ( 'requirements' ) ;
    public final void rule__WBSProject__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1252:1: ( ( 'requirements' ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1253:1: ( 'requirements' )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1253:1: ( 'requirements' )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1254:1: 'requirements'
            {
             before(grammarAccess.getWBSProjectAccess().getRequirementsKeyword_6_0()); 
            match(input,15,FOLLOW_15_in_rule__WBSProject__Group_6__0__Impl2504); 
             after(grammarAccess.getWBSProjectAccess().getRequirementsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProject__Group_6__0__Impl"


    // $ANTLR start "rule__WBSProject__Group_6__1"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1267:1: rule__WBSProject__Group_6__1 : rule__WBSProject__Group_6__1__Impl rule__WBSProject__Group_6__2 ;
    public final void rule__WBSProject__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1271:1: ( rule__WBSProject__Group_6__1__Impl rule__WBSProject__Group_6__2 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1272:2: rule__WBSProject__Group_6__1__Impl rule__WBSProject__Group_6__2
            {
            pushFollow(FOLLOW_rule__WBSProject__Group_6__1__Impl_in_rule__WBSProject__Group_6__12535);
            rule__WBSProject__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSProject__Group_6__2_in_rule__WBSProject__Group_6__12538);
            rule__WBSProject__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProject__Group_6__1"


    // $ANTLR start "rule__WBSProject__Group_6__1__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1279:1: rule__WBSProject__Group_6__1__Impl : ( RULE_OPENCURLY ) ;
    public final void rule__WBSProject__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1283:1: ( ( RULE_OPENCURLY ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1284:1: ( RULE_OPENCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1284:1: ( RULE_OPENCURLY )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1285:1: RULE_OPENCURLY
            {
             before(grammarAccess.getWBSProjectAccess().getOPENCURLYTerminalRuleCall_6_1()); 
            match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_rule__WBSProject__Group_6__1__Impl2565); 
             after(grammarAccess.getWBSProjectAccess().getOPENCURLYTerminalRuleCall_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProject__Group_6__1__Impl"


    // $ANTLR start "rule__WBSProject__Group_6__2"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1296:1: rule__WBSProject__Group_6__2 : rule__WBSProject__Group_6__2__Impl rule__WBSProject__Group_6__3 ;
    public final void rule__WBSProject__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1300:1: ( rule__WBSProject__Group_6__2__Impl rule__WBSProject__Group_6__3 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1301:2: rule__WBSProject__Group_6__2__Impl rule__WBSProject__Group_6__3
            {
            pushFollow(FOLLOW_rule__WBSProject__Group_6__2__Impl_in_rule__WBSProject__Group_6__22594);
            rule__WBSProject__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSProject__Group_6__3_in_rule__WBSProject__Group_6__22597);
            rule__WBSProject__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProject__Group_6__2"


    // $ANTLR start "rule__WBSProject__Group_6__2__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1308:1: rule__WBSProject__Group_6__2__Impl : ( ( rule__WBSProject__Group_6_2__0 )? ) ;
    public final void rule__WBSProject__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1312:1: ( ( ( rule__WBSProject__Group_6_2__0 )? ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1313:1: ( ( rule__WBSProject__Group_6_2__0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1313:1: ( ( rule__WBSProject__Group_6_2__0 )? )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1314:1: ( rule__WBSProject__Group_6_2__0 )?
            {
             before(grammarAccess.getWBSProjectAccess().getGroup_6_2()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1315:1: ( rule__WBSProject__Group_6_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1315:2: rule__WBSProject__Group_6_2__0
                    {
                    pushFollow(FOLLOW_rule__WBSProject__Group_6_2__0_in_rule__WBSProject__Group_6__2__Impl2624);
                    rule__WBSProject__Group_6_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWBSProjectAccess().getGroup_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProject__Group_6__2__Impl"


    // $ANTLR start "rule__WBSProject__Group_6__3"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1325:1: rule__WBSProject__Group_6__3 : rule__WBSProject__Group_6__3__Impl ;
    public final void rule__WBSProject__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1329:1: ( rule__WBSProject__Group_6__3__Impl )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1330:2: rule__WBSProject__Group_6__3__Impl
            {
            pushFollow(FOLLOW_rule__WBSProject__Group_6__3__Impl_in_rule__WBSProject__Group_6__32655);
            rule__WBSProject__Group_6__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProject__Group_6__3"


    // $ANTLR start "rule__WBSProject__Group_6__3__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1336:1: rule__WBSProject__Group_6__3__Impl : ( RULE_CLOSEDCURLY ) ;
    public final void rule__WBSProject__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1340:1: ( ( RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1341:1: ( RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1341:1: ( RULE_CLOSEDCURLY )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1342:1: RULE_CLOSEDCURLY
            {
             before(grammarAccess.getWBSProjectAccess().getCLOSEDCURLYTerminalRuleCall_6_3()); 
            match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_rule__WBSProject__Group_6__3__Impl2682); 
             after(grammarAccess.getWBSProjectAccess().getCLOSEDCURLYTerminalRuleCall_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProject__Group_6__3__Impl"


    // $ANTLR start "rule__WBSProject__Group_6_2__0"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1361:1: rule__WBSProject__Group_6_2__0 : rule__WBSProject__Group_6_2__0__Impl rule__WBSProject__Group_6_2__1 ;
    public final void rule__WBSProject__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1365:1: ( rule__WBSProject__Group_6_2__0__Impl rule__WBSProject__Group_6_2__1 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1366:2: rule__WBSProject__Group_6_2__0__Impl rule__WBSProject__Group_6_2__1
            {
            pushFollow(FOLLOW_rule__WBSProject__Group_6_2__0__Impl_in_rule__WBSProject__Group_6_2__02719);
            rule__WBSProject__Group_6_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSProject__Group_6_2__1_in_rule__WBSProject__Group_6_2__02722);
            rule__WBSProject__Group_6_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProject__Group_6_2__0"


    // $ANTLR start "rule__WBSProject__Group_6_2__0__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1373:1: rule__WBSProject__Group_6_2__0__Impl : ( ( rule__WBSProject__RequirementsAssignment_6_2_0 ) ) ;
    public final void rule__WBSProject__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1377:1: ( ( ( rule__WBSProject__RequirementsAssignment_6_2_0 ) ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1378:1: ( ( rule__WBSProject__RequirementsAssignment_6_2_0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1378:1: ( ( rule__WBSProject__RequirementsAssignment_6_2_0 ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1379:1: ( rule__WBSProject__RequirementsAssignment_6_2_0 )
            {
             before(grammarAccess.getWBSProjectAccess().getRequirementsAssignment_6_2_0()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1380:1: ( rule__WBSProject__RequirementsAssignment_6_2_0 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1380:2: rule__WBSProject__RequirementsAssignment_6_2_0
            {
            pushFollow(FOLLOW_rule__WBSProject__RequirementsAssignment_6_2_0_in_rule__WBSProject__Group_6_2__0__Impl2749);
            rule__WBSProject__RequirementsAssignment_6_2_0();

            state._fsp--;


            }

             after(grammarAccess.getWBSProjectAccess().getRequirementsAssignment_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProject__Group_6_2__0__Impl"


    // $ANTLR start "rule__WBSProject__Group_6_2__1"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1390:1: rule__WBSProject__Group_6_2__1 : rule__WBSProject__Group_6_2__1__Impl ;
    public final void rule__WBSProject__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1394:1: ( rule__WBSProject__Group_6_2__1__Impl )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1395:2: rule__WBSProject__Group_6_2__1__Impl
            {
            pushFollow(FOLLOW_rule__WBSProject__Group_6_2__1__Impl_in_rule__WBSProject__Group_6_2__12779);
            rule__WBSProject__Group_6_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProject__Group_6_2__1"


    // $ANTLR start "rule__WBSProject__Group_6_2__1__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1401:1: rule__WBSProject__Group_6_2__1__Impl : ( RULE_ENDLINE ) ;
    public final void rule__WBSProject__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1405:1: ( ( RULE_ENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1406:1: ( RULE_ENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1406:1: ( RULE_ENDLINE )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1407:1: RULE_ENDLINE
            {
             before(grammarAccess.getWBSProjectAccess().getENDLINETerminalRuleCall_6_2_1()); 
            match(input,RULE_ENDLINE,FOLLOW_RULE_ENDLINE_in_rule__WBSProject__Group_6_2__1__Impl2806); 
             after(grammarAccess.getWBSProjectAccess().getENDLINETerminalRuleCall_6_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProject__Group_6_2__1__Impl"


    // $ANTLR start "rule__WBSActivity__Group__0"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1422:1: rule__WBSActivity__Group__0 : rule__WBSActivity__Group__0__Impl rule__WBSActivity__Group__1 ;
    public final void rule__WBSActivity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1426:1: ( rule__WBSActivity__Group__0__Impl rule__WBSActivity__Group__1 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1427:2: rule__WBSActivity__Group__0__Impl rule__WBSActivity__Group__1
            {
            pushFollow(FOLLOW_rule__WBSActivity__Group__0__Impl_in_rule__WBSActivity__Group__02839);
            rule__WBSActivity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSActivity__Group__1_in_rule__WBSActivity__Group__02842);
            rule__WBSActivity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSActivity__Group__0"


    // $ANTLR start "rule__WBSActivity__Group__0__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1434:1: rule__WBSActivity__Group__0__Impl : ( ( rule__WBSActivity__DescriptionAssignment_0 )? ) ;
    public final void rule__WBSActivity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1438:1: ( ( ( rule__WBSActivity__DescriptionAssignment_0 )? ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1439:1: ( ( rule__WBSActivity__DescriptionAssignment_0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1439:1: ( ( rule__WBSActivity__DescriptionAssignment_0 )? )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1440:1: ( rule__WBSActivity__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getWBSActivityAccess().getDescriptionAssignment_0()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1441:1: ( rule__WBSActivity__DescriptionAssignment_0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ML_COMMENT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1441:2: rule__WBSActivity__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__WBSActivity__DescriptionAssignment_0_in_rule__WBSActivity__Group__0__Impl2869);
                    rule__WBSActivity__DescriptionAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWBSActivityAccess().getDescriptionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSActivity__Group__0__Impl"


    // $ANTLR start "rule__WBSActivity__Group__1"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1451:1: rule__WBSActivity__Group__1 : rule__WBSActivity__Group__1__Impl rule__WBSActivity__Group__2 ;
    public final void rule__WBSActivity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1455:1: ( rule__WBSActivity__Group__1__Impl rule__WBSActivity__Group__2 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1456:2: rule__WBSActivity__Group__1__Impl rule__WBSActivity__Group__2
            {
            pushFollow(FOLLOW_rule__WBSActivity__Group__1__Impl_in_rule__WBSActivity__Group__12900);
            rule__WBSActivity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSActivity__Group__2_in_rule__WBSActivity__Group__12903);
            rule__WBSActivity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSActivity__Group__1"


    // $ANTLR start "rule__WBSActivity__Group__1__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1463:1: rule__WBSActivity__Group__1__Impl : ( 'Activity ' ) ;
    public final void rule__WBSActivity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1467:1: ( ( 'Activity ' ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1468:1: ( 'Activity ' )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1468:1: ( 'Activity ' )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1469:1: 'Activity '
            {
             before(grammarAccess.getWBSActivityAccess().getActivityKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__WBSActivity__Group__1__Impl2931); 
             after(grammarAccess.getWBSActivityAccess().getActivityKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSActivity__Group__1__Impl"


    // $ANTLR start "rule__WBSActivity__Group__2"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1482:1: rule__WBSActivity__Group__2 : rule__WBSActivity__Group__2__Impl rule__WBSActivity__Group__3 ;
    public final void rule__WBSActivity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1486:1: ( rule__WBSActivity__Group__2__Impl rule__WBSActivity__Group__3 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1487:2: rule__WBSActivity__Group__2__Impl rule__WBSActivity__Group__3
            {
            pushFollow(FOLLOW_rule__WBSActivity__Group__2__Impl_in_rule__WBSActivity__Group__22962);
            rule__WBSActivity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSActivity__Group__3_in_rule__WBSActivity__Group__22965);
            rule__WBSActivity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSActivity__Group__2"


    // $ANTLR start "rule__WBSActivity__Group__2__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1494:1: rule__WBSActivity__Group__2__Impl : ( ( rule__WBSActivity__NameAssignment_2 ) ) ;
    public final void rule__WBSActivity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1498:1: ( ( ( rule__WBSActivity__NameAssignment_2 ) ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1499:1: ( ( rule__WBSActivity__NameAssignment_2 ) )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1499:1: ( ( rule__WBSActivity__NameAssignment_2 ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1500:1: ( rule__WBSActivity__NameAssignment_2 )
            {
             before(grammarAccess.getWBSActivityAccess().getNameAssignment_2()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1501:1: ( rule__WBSActivity__NameAssignment_2 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1501:2: rule__WBSActivity__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__WBSActivity__NameAssignment_2_in_rule__WBSActivity__Group__2__Impl2992);
            rule__WBSActivity__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWBSActivityAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSActivity__Group__2__Impl"


    // $ANTLR start "rule__WBSActivity__Group__3"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1511:1: rule__WBSActivity__Group__3 : rule__WBSActivity__Group__3__Impl ;
    public final void rule__WBSActivity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1515:1: ( rule__WBSActivity__Group__3__Impl )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1516:2: rule__WBSActivity__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__WBSActivity__Group__3__Impl_in_rule__WBSActivity__Group__33022);
            rule__WBSActivity__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSActivity__Group__3"


    // $ANTLR start "rule__WBSActivity__Group__3__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1522:1: rule__WBSActivity__Group__3__Impl : ( ( rule__WBSActivity__Alternatives_3 ) ) ;
    public final void rule__WBSActivity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1526:1: ( ( ( rule__WBSActivity__Alternatives_3 ) ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1527:1: ( ( rule__WBSActivity__Alternatives_3 ) )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1527:1: ( ( rule__WBSActivity__Alternatives_3 ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1528:1: ( rule__WBSActivity__Alternatives_3 )
            {
             before(grammarAccess.getWBSActivityAccess().getAlternatives_3()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1529:1: ( rule__WBSActivity__Alternatives_3 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1529:2: rule__WBSActivity__Alternatives_3
            {
            pushFollow(FOLLOW_rule__WBSActivity__Alternatives_3_in_rule__WBSActivity__Group__3__Impl3049);
            rule__WBSActivity__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getWBSActivityAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSActivity__Group__3__Impl"


    // $ANTLR start "rule__WBSActivity__Group_3_0__0"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1547:1: rule__WBSActivity__Group_3_0__0 : rule__WBSActivity__Group_3_0__0__Impl rule__WBSActivity__Group_3_0__1 ;
    public final void rule__WBSActivity__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1551:1: ( rule__WBSActivity__Group_3_0__0__Impl rule__WBSActivity__Group_3_0__1 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1552:2: rule__WBSActivity__Group_3_0__0__Impl rule__WBSActivity__Group_3_0__1
            {
            pushFollow(FOLLOW_rule__WBSActivity__Group_3_0__0__Impl_in_rule__WBSActivity__Group_3_0__03087);
            rule__WBSActivity__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSActivity__Group_3_0__1_in_rule__WBSActivity__Group_3_0__03090);
            rule__WBSActivity__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSActivity__Group_3_0__0"


    // $ANTLR start "rule__WBSActivity__Group_3_0__0__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1559:1: rule__WBSActivity__Group_3_0__0__Impl : ( RULE_OPENCURLY ) ;
    public final void rule__WBSActivity__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1563:1: ( ( RULE_OPENCURLY ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1564:1: ( RULE_OPENCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1564:1: ( RULE_OPENCURLY )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1565:1: RULE_OPENCURLY
            {
             before(grammarAccess.getWBSActivityAccess().getOPENCURLYTerminalRuleCall_3_0_0()); 
            match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_rule__WBSActivity__Group_3_0__0__Impl3117); 
             after(grammarAccess.getWBSActivityAccess().getOPENCURLYTerminalRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSActivity__Group_3_0__0__Impl"


    // $ANTLR start "rule__WBSActivity__Group_3_0__1"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1576:1: rule__WBSActivity__Group_3_0__1 : rule__WBSActivity__Group_3_0__1__Impl rule__WBSActivity__Group_3_0__2 ;
    public final void rule__WBSActivity__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1580:1: ( rule__WBSActivity__Group_3_0__1__Impl rule__WBSActivity__Group_3_0__2 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1581:2: rule__WBSActivity__Group_3_0__1__Impl rule__WBSActivity__Group_3_0__2
            {
            pushFollow(FOLLOW_rule__WBSActivity__Group_3_0__1__Impl_in_rule__WBSActivity__Group_3_0__13146);
            rule__WBSActivity__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSActivity__Group_3_0__2_in_rule__WBSActivity__Group_3_0__13149);
            rule__WBSActivity__Group_3_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSActivity__Group_3_0__1"


    // $ANTLR start "rule__WBSActivity__Group_3_0__1__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1588:1: rule__WBSActivity__Group_3_0__1__Impl : ( ( rule__WBSActivity__WbsNodesAssignment_3_0_1 )* ) ;
    public final void rule__WBSActivity__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1592:1: ( ( ( rule__WBSActivity__WbsNodesAssignment_3_0_1 )* ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1593:1: ( ( rule__WBSActivity__WbsNodesAssignment_3_0_1 )* )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1593:1: ( ( rule__WBSActivity__WbsNodesAssignment_3_0_1 )* )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1594:1: ( rule__WBSActivity__WbsNodesAssignment_3_0_1 )*
            {
             before(grammarAccess.getWBSActivityAccess().getWbsNodesAssignment_3_0_1()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1595:1: ( rule__WBSActivity__WbsNodesAssignment_3_0_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ML_COMMENT||(LA17_0>=17 && LA17_0<=19)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1595:2: rule__WBSActivity__WbsNodesAssignment_3_0_1
            	    {
            	    pushFollow(FOLLOW_rule__WBSActivity__WbsNodesAssignment_3_0_1_in_rule__WBSActivity__Group_3_0__1__Impl3176);
            	    rule__WBSActivity__WbsNodesAssignment_3_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getWBSActivityAccess().getWbsNodesAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSActivity__Group_3_0__1__Impl"


    // $ANTLR start "rule__WBSActivity__Group_3_0__2"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1605:1: rule__WBSActivity__Group_3_0__2 : rule__WBSActivity__Group_3_0__2__Impl rule__WBSActivity__Group_3_0__3 ;
    public final void rule__WBSActivity__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1609:1: ( rule__WBSActivity__Group_3_0__2__Impl rule__WBSActivity__Group_3_0__3 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1610:2: rule__WBSActivity__Group_3_0__2__Impl rule__WBSActivity__Group_3_0__3
            {
            pushFollow(FOLLOW_rule__WBSActivity__Group_3_0__2__Impl_in_rule__WBSActivity__Group_3_0__23207);
            rule__WBSActivity__Group_3_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSActivity__Group_3_0__3_in_rule__WBSActivity__Group_3_0__23210);
            rule__WBSActivity__Group_3_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSActivity__Group_3_0__2"


    // $ANTLR start "rule__WBSActivity__Group_3_0__2__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1617:1: rule__WBSActivity__Group_3_0__2__Impl : ( ( rule__WBSActivity__Group_3_0_2__0 )? ) ;
    public final void rule__WBSActivity__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1621:1: ( ( ( rule__WBSActivity__Group_3_0_2__0 )? ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1622:1: ( ( rule__WBSActivity__Group_3_0_2__0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1622:1: ( ( rule__WBSActivity__Group_3_0_2__0 )? )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1623:1: ( rule__WBSActivity__Group_3_0_2__0 )?
            {
             before(grammarAccess.getWBSActivityAccess().getGroup_3_0_2()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1624:1: ( rule__WBSActivity__Group_3_0_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==15) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1624:2: rule__WBSActivity__Group_3_0_2__0
                    {
                    pushFollow(FOLLOW_rule__WBSActivity__Group_3_0_2__0_in_rule__WBSActivity__Group_3_0__2__Impl3237);
                    rule__WBSActivity__Group_3_0_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWBSActivityAccess().getGroup_3_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSActivity__Group_3_0__2__Impl"


    // $ANTLR start "rule__WBSActivity__Group_3_0__3"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1634:1: rule__WBSActivity__Group_3_0__3 : rule__WBSActivity__Group_3_0__3__Impl ;
    public final void rule__WBSActivity__Group_3_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1638:1: ( rule__WBSActivity__Group_3_0__3__Impl )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1639:2: rule__WBSActivity__Group_3_0__3__Impl
            {
            pushFollow(FOLLOW_rule__WBSActivity__Group_3_0__3__Impl_in_rule__WBSActivity__Group_3_0__33268);
            rule__WBSActivity__Group_3_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSActivity__Group_3_0__3"


    // $ANTLR start "rule__WBSActivity__Group_3_0__3__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1645:1: rule__WBSActivity__Group_3_0__3__Impl : ( RULE_CLOSEDCURLY ) ;
    public final void rule__WBSActivity__Group_3_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1649:1: ( ( RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1650:1: ( RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1650:1: ( RULE_CLOSEDCURLY )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1651:1: RULE_CLOSEDCURLY
            {
             before(grammarAccess.getWBSActivityAccess().getCLOSEDCURLYTerminalRuleCall_3_0_3()); 
            match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_rule__WBSActivity__Group_3_0__3__Impl3295); 
             after(grammarAccess.getWBSActivityAccess().getCLOSEDCURLYTerminalRuleCall_3_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSActivity__Group_3_0__3__Impl"


    // $ANTLR start "rule__WBSActivity__Group_3_0_2__0"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1670:1: rule__WBSActivity__Group_3_0_2__0 : rule__WBSActivity__Group_3_0_2__0__Impl rule__WBSActivity__Group_3_0_2__1 ;
    public final void rule__WBSActivity__Group_3_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1674:1: ( rule__WBSActivity__Group_3_0_2__0__Impl rule__WBSActivity__Group_3_0_2__1 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1675:2: rule__WBSActivity__Group_3_0_2__0__Impl rule__WBSActivity__Group_3_0_2__1
            {
            pushFollow(FOLLOW_rule__WBSActivity__Group_3_0_2__0__Impl_in_rule__WBSActivity__Group_3_0_2__03332);
            rule__WBSActivity__Group_3_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSActivity__Group_3_0_2__1_in_rule__WBSActivity__Group_3_0_2__03335);
            rule__WBSActivity__Group_3_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSActivity__Group_3_0_2__0"


    // $ANTLR start "rule__WBSActivity__Group_3_0_2__0__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1682:1: rule__WBSActivity__Group_3_0_2__0__Impl : ( 'requirements' ) ;
    public final void rule__WBSActivity__Group_3_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1686:1: ( ( 'requirements' ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1687:1: ( 'requirements' )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1687:1: ( 'requirements' )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1688:1: 'requirements'
            {
             before(grammarAccess.getWBSActivityAccess().getRequirementsKeyword_3_0_2_0()); 
            match(input,15,FOLLOW_15_in_rule__WBSActivity__Group_3_0_2__0__Impl3363); 
             after(grammarAccess.getWBSActivityAccess().getRequirementsKeyword_3_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSActivity__Group_3_0_2__0__Impl"


    // $ANTLR start "rule__WBSActivity__Group_3_0_2__1"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1701:1: rule__WBSActivity__Group_3_0_2__1 : rule__WBSActivity__Group_3_0_2__1__Impl rule__WBSActivity__Group_3_0_2__2 ;
    public final void rule__WBSActivity__Group_3_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1705:1: ( rule__WBSActivity__Group_3_0_2__1__Impl rule__WBSActivity__Group_3_0_2__2 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1706:2: rule__WBSActivity__Group_3_0_2__1__Impl rule__WBSActivity__Group_3_0_2__2
            {
            pushFollow(FOLLOW_rule__WBSActivity__Group_3_0_2__1__Impl_in_rule__WBSActivity__Group_3_0_2__13394);
            rule__WBSActivity__Group_3_0_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSActivity__Group_3_0_2__2_in_rule__WBSActivity__Group_3_0_2__13397);
            rule__WBSActivity__Group_3_0_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSActivity__Group_3_0_2__1"


    // $ANTLR start "rule__WBSActivity__Group_3_0_2__1__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1713:1: rule__WBSActivity__Group_3_0_2__1__Impl : ( RULE_OPENCURLY ) ;
    public final void rule__WBSActivity__Group_3_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1717:1: ( ( RULE_OPENCURLY ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1718:1: ( RULE_OPENCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1718:1: ( RULE_OPENCURLY )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1719:1: RULE_OPENCURLY
            {
             before(grammarAccess.getWBSActivityAccess().getOPENCURLYTerminalRuleCall_3_0_2_1()); 
            match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_rule__WBSActivity__Group_3_0_2__1__Impl3424); 
             after(grammarAccess.getWBSActivityAccess().getOPENCURLYTerminalRuleCall_3_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSActivity__Group_3_0_2__1__Impl"


    // $ANTLR start "rule__WBSActivity__Group_3_0_2__2"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1730:1: rule__WBSActivity__Group_3_0_2__2 : rule__WBSActivity__Group_3_0_2__2__Impl rule__WBSActivity__Group_3_0_2__3 ;
    public final void rule__WBSActivity__Group_3_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1734:1: ( rule__WBSActivity__Group_3_0_2__2__Impl rule__WBSActivity__Group_3_0_2__3 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1735:2: rule__WBSActivity__Group_3_0_2__2__Impl rule__WBSActivity__Group_3_0_2__3
            {
            pushFollow(FOLLOW_rule__WBSActivity__Group_3_0_2__2__Impl_in_rule__WBSActivity__Group_3_0_2__23453);
            rule__WBSActivity__Group_3_0_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSActivity__Group_3_0_2__3_in_rule__WBSActivity__Group_3_0_2__23456);
            rule__WBSActivity__Group_3_0_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSActivity__Group_3_0_2__2"


    // $ANTLR start "rule__WBSActivity__Group_3_0_2__2__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1742:1: rule__WBSActivity__Group_3_0_2__2__Impl : ( ( rule__WBSActivity__Group_3_0_2_2__0 )? ) ;
    public final void rule__WBSActivity__Group_3_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1746:1: ( ( ( rule__WBSActivity__Group_3_0_2_2__0 )? ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1747:1: ( ( rule__WBSActivity__Group_3_0_2_2__0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1747:1: ( ( rule__WBSActivity__Group_3_0_2_2__0 )? )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1748:1: ( rule__WBSActivity__Group_3_0_2_2__0 )?
            {
             before(grammarAccess.getWBSActivityAccess().getGroup_3_0_2_2()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1749:1: ( rule__WBSActivity__Group_3_0_2_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1749:2: rule__WBSActivity__Group_3_0_2_2__0
                    {
                    pushFollow(FOLLOW_rule__WBSActivity__Group_3_0_2_2__0_in_rule__WBSActivity__Group_3_0_2__2__Impl3483);
                    rule__WBSActivity__Group_3_0_2_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWBSActivityAccess().getGroup_3_0_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSActivity__Group_3_0_2__2__Impl"


    // $ANTLR start "rule__WBSActivity__Group_3_0_2__3"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1759:1: rule__WBSActivity__Group_3_0_2__3 : rule__WBSActivity__Group_3_0_2__3__Impl ;
    public final void rule__WBSActivity__Group_3_0_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1763:1: ( rule__WBSActivity__Group_3_0_2__3__Impl )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1764:2: rule__WBSActivity__Group_3_0_2__3__Impl
            {
            pushFollow(FOLLOW_rule__WBSActivity__Group_3_0_2__3__Impl_in_rule__WBSActivity__Group_3_0_2__33514);
            rule__WBSActivity__Group_3_0_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSActivity__Group_3_0_2__3"


    // $ANTLR start "rule__WBSActivity__Group_3_0_2__3__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1770:1: rule__WBSActivity__Group_3_0_2__3__Impl : ( RULE_CLOSEDCURLY ) ;
    public final void rule__WBSActivity__Group_3_0_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1774:1: ( ( RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1775:1: ( RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1775:1: ( RULE_CLOSEDCURLY )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1776:1: RULE_CLOSEDCURLY
            {
             before(grammarAccess.getWBSActivityAccess().getCLOSEDCURLYTerminalRuleCall_3_0_2_3()); 
            match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_rule__WBSActivity__Group_3_0_2__3__Impl3541); 
             after(grammarAccess.getWBSActivityAccess().getCLOSEDCURLYTerminalRuleCall_3_0_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSActivity__Group_3_0_2__3__Impl"


    // $ANTLR start "rule__WBSActivity__Group_3_0_2_2__0"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1795:1: rule__WBSActivity__Group_3_0_2_2__0 : rule__WBSActivity__Group_3_0_2_2__0__Impl rule__WBSActivity__Group_3_0_2_2__1 ;
    public final void rule__WBSActivity__Group_3_0_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1799:1: ( rule__WBSActivity__Group_3_0_2_2__0__Impl rule__WBSActivity__Group_3_0_2_2__1 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1800:2: rule__WBSActivity__Group_3_0_2_2__0__Impl rule__WBSActivity__Group_3_0_2_2__1
            {
            pushFollow(FOLLOW_rule__WBSActivity__Group_3_0_2_2__0__Impl_in_rule__WBSActivity__Group_3_0_2_2__03578);
            rule__WBSActivity__Group_3_0_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSActivity__Group_3_0_2_2__1_in_rule__WBSActivity__Group_3_0_2_2__03581);
            rule__WBSActivity__Group_3_0_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSActivity__Group_3_0_2_2__0"


    // $ANTLR start "rule__WBSActivity__Group_3_0_2_2__0__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1807:1: rule__WBSActivity__Group_3_0_2_2__0__Impl : ( ( rule__WBSActivity__RequirementsAssignment_3_0_2_2_0 ) ) ;
    public final void rule__WBSActivity__Group_3_0_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1811:1: ( ( ( rule__WBSActivity__RequirementsAssignment_3_0_2_2_0 ) ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1812:1: ( ( rule__WBSActivity__RequirementsAssignment_3_0_2_2_0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1812:1: ( ( rule__WBSActivity__RequirementsAssignment_3_0_2_2_0 ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1813:1: ( rule__WBSActivity__RequirementsAssignment_3_0_2_2_0 )
            {
             before(grammarAccess.getWBSActivityAccess().getRequirementsAssignment_3_0_2_2_0()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1814:1: ( rule__WBSActivity__RequirementsAssignment_3_0_2_2_0 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1814:2: rule__WBSActivity__RequirementsAssignment_3_0_2_2_0
            {
            pushFollow(FOLLOW_rule__WBSActivity__RequirementsAssignment_3_0_2_2_0_in_rule__WBSActivity__Group_3_0_2_2__0__Impl3608);
            rule__WBSActivity__RequirementsAssignment_3_0_2_2_0();

            state._fsp--;


            }

             after(grammarAccess.getWBSActivityAccess().getRequirementsAssignment_3_0_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSActivity__Group_3_0_2_2__0__Impl"


    // $ANTLR start "rule__WBSActivity__Group_3_0_2_2__1"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1824:1: rule__WBSActivity__Group_3_0_2_2__1 : rule__WBSActivity__Group_3_0_2_2__1__Impl ;
    public final void rule__WBSActivity__Group_3_0_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1828:1: ( rule__WBSActivity__Group_3_0_2_2__1__Impl )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1829:2: rule__WBSActivity__Group_3_0_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__WBSActivity__Group_3_0_2_2__1__Impl_in_rule__WBSActivity__Group_3_0_2_2__13638);
            rule__WBSActivity__Group_3_0_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSActivity__Group_3_0_2_2__1"


    // $ANTLR start "rule__WBSActivity__Group_3_0_2_2__1__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1835:1: rule__WBSActivity__Group_3_0_2_2__1__Impl : ( RULE_ENDLINE ) ;
    public final void rule__WBSActivity__Group_3_0_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1839:1: ( ( RULE_ENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1840:1: ( RULE_ENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1840:1: ( RULE_ENDLINE )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1841:1: RULE_ENDLINE
            {
             before(grammarAccess.getWBSActivityAccess().getENDLINETerminalRuleCall_3_0_2_2_1()); 
            match(input,RULE_ENDLINE,FOLLOW_RULE_ENDLINE_in_rule__WBSActivity__Group_3_0_2_2__1__Impl3665); 
             after(grammarAccess.getWBSActivityAccess().getENDLINETerminalRuleCall_3_0_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSActivity__Group_3_0_2_2__1__Impl"


    // $ANTLR start "rule__WBSWorkPackage__Group__0"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1856:1: rule__WBSWorkPackage__Group__0 : rule__WBSWorkPackage__Group__0__Impl rule__WBSWorkPackage__Group__1 ;
    public final void rule__WBSWorkPackage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1860:1: ( rule__WBSWorkPackage__Group__0__Impl rule__WBSWorkPackage__Group__1 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1861:2: rule__WBSWorkPackage__Group__0__Impl rule__WBSWorkPackage__Group__1
            {
            pushFollow(FOLLOW_rule__WBSWorkPackage__Group__0__Impl_in_rule__WBSWorkPackage__Group__03698);
            rule__WBSWorkPackage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSWorkPackage__Group__1_in_rule__WBSWorkPackage__Group__03701);
            rule__WBSWorkPackage__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSWorkPackage__Group__0"


    // $ANTLR start "rule__WBSWorkPackage__Group__0__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1868:1: rule__WBSWorkPackage__Group__0__Impl : ( ( rule__WBSWorkPackage__DescriptionAssignment_0 )? ) ;
    public final void rule__WBSWorkPackage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1872:1: ( ( ( rule__WBSWorkPackage__DescriptionAssignment_0 )? ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1873:1: ( ( rule__WBSWorkPackage__DescriptionAssignment_0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1873:1: ( ( rule__WBSWorkPackage__DescriptionAssignment_0 )? )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1874:1: ( rule__WBSWorkPackage__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getWBSWorkPackageAccess().getDescriptionAssignment_0()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1875:1: ( rule__WBSWorkPackage__DescriptionAssignment_0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ML_COMMENT) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1875:2: rule__WBSWorkPackage__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__WBSWorkPackage__DescriptionAssignment_0_in_rule__WBSWorkPackage__Group__0__Impl3728);
                    rule__WBSWorkPackage__DescriptionAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWBSWorkPackageAccess().getDescriptionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSWorkPackage__Group__0__Impl"


    // $ANTLR start "rule__WBSWorkPackage__Group__1"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1885:1: rule__WBSWorkPackage__Group__1 : rule__WBSWorkPackage__Group__1__Impl rule__WBSWorkPackage__Group__2 ;
    public final void rule__WBSWorkPackage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1889:1: ( rule__WBSWorkPackage__Group__1__Impl rule__WBSWorkPackage__Group__2 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1890:2: rule__WBSWorkPackage__Group__1__Impl rule__WBSWorkPackage__Group__2
            {
            pushFollow(FOLLOW_rule__WBSWorkPackage__Group__1__Impl_in_rule__WBSWorkPackage__Group__13759);
            rule__WBSWorkPackage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSWorkPackage__Group__2_in_rule__WBSWorkPackage__Group__13762);
            rule__WBSWorkPackage__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSWorkPackage__Group__1"


    // $ANTLR start "rule__WBSWorkPackage__Group__1__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1897:1: rule__WBSWorkPackage__Group__1__Impl : ( 'WorkPackage ' ) ;
    public final void rule__WBSWorkPackage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1901:1: ( ( 'WorkPackage ' ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1902:1: ( 'WorkPackage ' )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1902:1: ( 'WorkPackage ' )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1903:1: 'WorkPackage '
            {
             before(grammarAccess.getWBSWorkPackageAccess().getWorkPackageKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__WBSWorkPackage__Group__1__Impl3790); 
             after(grammarAccess.getWBSWorkPackageAccess().getWorkPackageKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSWorkPackage__Group__1__Impl"


    // $ANTLR start "rule__WBSWorkPackage__Group__2"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1916:1: rule__WBSWorkPackage__Group__2 : rule__WBSWorkPackage__Group__2__Impl rule__WBSWorkPackage__Group__3 ;
    public final void rule__WBSWorkPackage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1920:1: ( rule__WBSWorkPackage__Group__2__Impl rule__WBSWorkPackage__Group__3 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1921:2: rule__WBSWorkPackage__Group__2__Impl rule__WBSWorkPackage__Group__3
            {
            pushFollow(FOLLOW_rule__WBSWorkPackage__Group__2__Impl_in_rule__WBSWorkPackage__Group__23821);
            rule__WBSWorkPackage__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSWorkPackage__Group__3_in_rule__WBSWorkPackage__Group__23824);
            rule__WBSWorkPackage__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSWorkPackage__Group__2"


    // $ANTLR start "rule__WBSWorkPackage__Group__2__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1928:1: rule__WBSWorkPackage__Group__2__Impl : ( ( rule__WBSWorkPackage__NameAssignment_2 ) ) ;
    public final void rule__WBSWorkPackage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1932:1: ( ( ( rule__WBSWorkPackage__NameAssignment_2 ) ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1933:1: ( ( rule__WBSWorkPackage__NameAssignment_2 ) )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1933:1: ( ( rule__WBSWorkPackage__NameAssignment_2 ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1934:1: ( rule__WBSWorkPackage__NameAssignment_2 )
            {
             before(grammarAccess.getWBSWorkPackageAccess().getNameAssignment_2()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1935:1: ( rule__WBSWorkPackage__NameAssignment_2 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1935:2: rule__WBSWorkPackage__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__WBSWorkPackage__NameAssignment_2_in_rule__WBSWorkPackage__Group__2__Impl3851);
            rule__WBSWorkPackage__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWBSWorkPackageAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSWorkPackage__Group__2__Impl"


    // $ANTLR start "rule__WBSWorkPackage__Group__3"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1945:1: rule__WBSWorkPackage__Group__3 : rule__WBSWorkPackage__Group__3__Impl ;
    public final void rule__WBSWorkPackage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1949:1: ( rule__WBSWorkPackage__Group__3__Impl )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1950:2: rule__WBSWorkPackage__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__WBSWorkPackage__Group__3__Impl_in_rule__WBSWorkPackage__Group__33881);
            rule__WBSWorkPackage__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSWorkPackage__Group__3"


    // $ANTLR start "rule__WBSWorkPackage__Group__3__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1956:1: rule__WBSWorkPackage__Group__3__Impl : ( ( rule__WBSWorkPackage__Alternatives_3 ) ) ;
    public final void rule__WBSWorkPackage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1960:1: ( ( ( rule__WBSWorkPackage__Alternatives_3 ) ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1961:1: ( ( rule__WBSWorkPackage__Alternatives_3 ) )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1961:1: ( ( rule__WBSWorkPackage__Alternatives_3 ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1962:1: ( rule__WBSWorkPackage__Alternatives_3 )
            {
             before(grammarAccess.getWBSWorkPackageAccess().getAlternatives_3()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1963:1: ( rule__WBSWorkPackage__Alternatives_3 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1963:2: rule__WBSWorkPackage__Alternatives_3
            {
            pushFollow(FOLLOW_rule__WBSWorkPackage__Alternatives_3_in_rule__WBSWorkPackage__Group__3__Impl3908);
            rule__WBSWorkPackage__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getWBSWorkPackageAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSWorkPackage__Group__3__Impl"


    // $ANTLR start "rule__WBSWorkPackage__Group_3_0__0"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1981:1: rule__WBSWorkPackage__Group_3_0__0 : rule__WBSWorkPackage__Group_3_0__0__Impl rule__WBSWorkPackage__Group_3_0__1 ;
    public final void rule__WBSWorkPackage__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1985:1: ( rule__WBSWorkPackage__Group_3_0__0__Impl rule__WBSWorkPackage__Group_3_0__1 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1986:2: rule__WBSWorkPackage__Group_3_0__0__Impl rule__WBSWorkPackage__Group_3_0__1
            {
            pushFollow(FOLLOW_rule__WBSWorkPackage__Group_3_0__0__Impl_in_rule__WBSWorkPackage__Group_3_0__03946);
            rule__WBSWorkPackage__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSWorkPackage__Group_3_0__1_in_rule__WBSWorkPackage__Group_3_0__03949);
            rule__WBSWorkPackage__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSWorkPackage__Group_3_0__0"


    // $ANTLR start "rule__WBSWorkPackage__Group_3_0__0__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1993:1: rule__WBSWorkPackage__Group_3_0__0__Impl : ( RULE_OPENCURLY ) ;
    public final void rule__WBSWorkPackage__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1997:1: ( ( RULE_OPENCURLY ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1998:1: ( RULE_OPENCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1998:1: ( RULE_OPENCURLY )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:1999:1: RULE_OPENCURLY
            {
             before(grammarAccess.getWBSWorkPackageAccess().getOPENCURLYTerminalRuleCall_3_0_0()); 
            match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_rule__WBSWorkPackage__Group_3_0__0__Impl3976); 
             after(grammarAccess.getWBSWorkPackageAccess().getOPENCURLYTerminalRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSWorkPackage__Group_3_0__0__Impl"


    // $ANTLR start "rule__WBSWorkPackage__Group_3_0__1"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2010:1: rule__WBSWorkPackage__Group_3_0__1 : rule__WBSWorkPackage__Group_3_0__1__Impl rule__WBSWorkPackage__Group_3_0__2 ;
    public final void rule__WBSWorkPackage__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2014:1: ( rule__WBSWorkPackage__Group_3_0__1__Impl rule__WBSWorkPackage__Group_3_0__2 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2015:2: rule__WBSWorkPackage__Group_3_0__1__Impl rule__WBSWorkPackage__Group_3_0__2
            {
            pushFollow(FOLLOW_rule__WBSWorkPackage__Group_3_0__1__Impl_in_rule__WBSWorkPackage__Group_3_0__14005);
            rule__WBSWorkPackage__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSWorkPackage__Group_3_0__2_in_rule__WBSWorkPackage__Group_3_0__14008);
            rule__WBSWorkPackage__Group_3_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSWorkPackage__Group_3_0__1"


    // $ANTLR start "rule__WBSWorkPackage__Group_3_0__1__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2022:1: rule__WBSWorkPackage__Group_3_0__1__Impl : ( ( rule__WBSWorkPackage__WbsNodesAssignment_3_0_1 )* ) ;
    public final void rule__WBSWorkPackage__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2026:1: ( ( ( rule__WBSWorkPackage__WbsNodesAssignment_3_0_1 )* ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2027:1: ( ( rule__WBSWorkPackage__WbsNodesAssignment_3_0_1 )* )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2027:1: ( ( rule__WBSWorkPackage__WbsNodesAssignment_3_0_1 )* )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2028:1: ( rule__WBSWorkPackage__WbsNodesAssignment_3_0_1 )*
            {
             before(grammarAccess.getWBSWorkPackageAccess().getWbsNodesAssignment_3_0_1()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2029:1: ( rule__WBSWorkPackage__WbsNodesAssignment_3_0_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ML_COMMENT||(LA21_0>=17 && LA21_0<=19)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2029:2: rule__WBSWorkPackage__WbsNodesAssignment_3_0_1
            	    {
            	    pushFollow(FOLLOW_rule__WBSWorkPackage__WbsNodesAssignment_3_0_1_in_rule__WBSWorkPackage__Group_3_0__1__Impl4035);
            	    rule__WBSWorkPackage__WbsNodesAssignment_3_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getWBSWorkPackageAccess().getWbsNodesAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSWorkPackage__Group_3_0__1__Impl"


    // $ANTLR start "rule__WBSWorkPackage__Group_3_0__2"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2039:1: rule__WBSWorkPackage__Group_3_0__2 : rule__WBSWorkPackage__Group_3_0__2__Impl rule__WBSWorkPackage__Group_3_0__3 ;
    public final void rule__WBSWorkPackage__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2043:1: ( rule__WBSWorkPackage__Group_3_0__2__Impl rule__WBSWorkPackage__Group_3_0__3 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2044:2: rule__WBSWorkPackage__Group_3_0__2__Impl rule__WBSWorkPackage__Group_3_0__3
            {
            pushFollow(FOLLOW_rule__WBSWorkPackage__Group_3_0__2__Impl_in_rule__WBSWorkPackage__Group_3_0__24066);
            rule__WBSWorkPackage__Group_3_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSWorkPackage__Group_3_0__3_in_rule__WBSWorkPackage__Group_3_0__24069);
            rule__WBSWorkPackage__Group_3_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSWorkPackage__Group_3_0__2"


    // $ANTLR start "rule__WBSWorkPackage__Group_3_0__2__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2051:1: rule__WBSWorkPackage__Group_3_0__2__Impl : ( ( rule__WBSWorkPackage__Group_3_0_2__0 )? ) ;
    public final void rule__WBSWorkPackage__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2055:1: ( ( ( rule__WBSWorkPackage__Group_3_0_2__0 )? ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2056:1: ( ( rule__WBSWorkPackage__Group_3_0_2__0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2056:1: ( ( rule__WBSWorkPackage__Group_3_0_2__0 )? )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2057:1: ( rule__WBSWorkPackage__Group_3_0_2__0 )?
            {
             before(grammarAccess.getWBSWorkPackageAccess().getGroup_3_0_2()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2058:1: ( rule__WBSWorkPackage__Group_3_0_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==15) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2058:2: rule__WBSWorkPackage__Group_3_0_2__0
                    {
                    pushFollow(FOLLOW_rule__WBSWorkPackage__Group_3_0_2__0_in_rule__WBSWorkPackage__Group_3_0__2__Impl4096);
                    rule__WBSWorkPackage__Group_3_0_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWBSWorkPackageAccess().getGroup_3_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSWorkPackage__Group_3_0__2__Impl"


    // $ANTLR start "rule__WBSWorkPackage__Group_3_0__3"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2068:1: rule__WBSWorkPackage__Group_3_0__3 : rule__WBSWorkPackage__Group_3_0__3__Impl ;
    public final void rule__WBSWorkPackage__Group_3_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2072:1: ( rule__WBSWorkPackage__Group_3_0__3__Impl )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2073:2: rule__WBSWorkPackage__Group_3_0__3__Impl
            {
            pushFollow(FOLLOW_rule__WBSWorkPackage__Group_3_0__3__Impl_in_rule__WBSWorkPackage__Group_3_0__34127);
            rule__WBSWorkPackage__Group_3_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSWorkPackage__Group_3_0__3"


    // $ANTLR start "rule__WBSWorkPackage__Group_3_0__3__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2079:1: rule__WBSWorkPackage__Group_3_0__3__Impl : ( RULE_CLOSEDCURLY ) ;
    public final void rule__WBSWorkPackage__Group_3_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2083:1: ( ( RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2084:1: ( RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2084:1: ( RULE_CLOSEDCURLY )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2085:1: RULE_CLOSEDCURLY
            {
             before(grammarAccess.getWBSWorkPackageAccess().getCLOSEDCURLYTerminalRuleCall_3_0_3()); 
            match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_rule__WBSWorkPackage__Group_3_0__3__Impl4154); 
             after(grammarAccess.getWBSWorkPackageAccess().getCLOSEDCURLYTerminalRuleCall_3_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSWorkPackage__Group_3_0__3__Impl"


    // $ANTLR start "rule__WBSWorkPackage__Group_3_0_2__0"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2104:1: rule__WBSWorkPackage__Group_3_0_2__0 : rule__WBSWorkPackage__Group_3_0_2__0__Impl rule__WBSWorkPackage__Group_3_0_2__1 ;
    public final void rule__WBSWorkPackage__Group_3_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2108:1: ( rule__WBSWorkPackage__Group_3_0_2__0__Impl rule__WBSWorkPackage__Group_3_0_2__1 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2109:2: rule__WBSWorkPackage__Group_3_0_2__0__Impl rule__WBSWorkPackage__Group_3_0_2__1
            {
            pushFollow(FOLLOW_rule__WBSWorkPackage__Group_3_0_2__0__Impl_in_rule__WBSWorkPackage__Group_3_0_2__04191);
            rule__WBSWorkPackage__Group_3_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSWorkPackage__Group_3_0_2__1_in_rule__WBSWorkPackage__Group_3_0_2__04194);
            rule__WBSWorkPackage__Group_3_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSWorkPackage__Group_3_0_2__0"


    // $ANTLR start "rule__WBSWorkPackage__Group_3_0_2__0__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2116:1: rule__WBSWorkPackage__Group_3_0_2__0__Impl : ( 'requirements' ) ;
    public final void rule__WBSWorkPackage__Group_3_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2120:1: ( ( 'requirements' ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2121:1: ( 'requirements' )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2121:1: ( 'requirements' )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2122:1: 'requirements'
            {
             before(grammarAccess.getWBSWorkPackageAccess().getRequirementsKeyword_3_0_2_0()); 
            match(input,15,FOLLOW_15_in_rule__WBSWorkPackage__Group_3_0_2__0__Impl4222); 
             after(grammarAccess.getWBSWorkPackageAccess().getRequirementsKeyword_3_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSWorkPackage__Group_3_0_2__0__Impl"


    // $ANTLR start "rule__WBSWorkPackage__Group_3_0_2__1"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2135:1: rule__WBSWorkPackage__Group_3_0_2__1 : rule__WBSWorkPackage__Group_3_0_2__1__Impl rule__WBSWorkPackage__Group_3_0_2__2 ;
    public final void rule__WBSWorkPackage__Group_3_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2139:1: ( rule__WBSWorkPackage__Group_3_0_2__1__Impl rule__WBSWorkPackage__Group_3_0_2__2 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2140:2: rule__WBSWorkPackage__Group_3_0_2__1__Impl rule__WBSWorkPackage__Group_3_0_2__2
            {
            pushFollow(FOLLOW_rule__WBSWorkPackage__Group_3_0_2__1__Impl_in_rule__WBSWorkPackage__Group_3_0_2__14253);
            rule__WBSWorkPackage__Group_3_0_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSWorkPackage__Group_3_0_2__2_in_rule__WBSWorkPackage__Group_3_0_2__14256);
            rule__WBSWorkPackage__Group_3_0_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSWorkPackage__Group_3_0_2__1"


    // $ANTLR start "rule__WBSWorkPackage__Group_3_0_2__1__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2147:1: rule__WBSWorkPackage__Group_3_0_2__1__Impl : ( RULE_OPENCURLY ) ;
    public final void rule__WBSWorkPackage__Group_3_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2151:1: ( ( RULE_OPENCURLY ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2152:1: ( RULE_OPENCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2152:1: ( RULE_OPENCURLY )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2153:1: RULE_OPENCURLY
            {
             before(grammarAccess.getWBSWorkPackageAccess().getOPENCURLYTerminalRuleCall_3_0_2_1()); 
            match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_rule__WBSWorkPackage__Group_3_0_2__1__Impl4283); 
             after(grammarAccess.getWBSWorkPackageAccess().getOPENCURLYTerminalRuleCall_3_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSWorkPackage__Group_3_0_2__1__Impl"


    // $ANTLR start "rule__WBSWorkPackage__Group_3_0_2__2"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2164:1: rule__WBSWorkPackage__Group_3_0_2__2 : rule__WBSWorkPackage__Group_3_0_2__2__Impl rule__WBSWorkPackage__Group_3_0_2__3 ;
    public final void rule__WBSWorkPackage__Group_3_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2168:1: ( rule__WBSWorkPackage__Group_3_0_2__2__Impl rule__WBSWorkPackage__Group_3_0_2__3 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2169:2: rule__WBSWorkPackage__Group_3_0_2__2__Impl rule__WBSWorkPackage__Group_3_0_2__3
            {
            pushFollow(FOLLOW_rule__WBSWorkPackage__Group_3_0_2__2__Impl_in_rule__WBSWorkPackage__Group_3_0_2__24312);
            rule__WBSWorkPackage__Group_3_0_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSWorkPackage__Group_3_0_2__3_in_rule__WBSWorkPackage__Group_3_0_2__24315);
            rule__WBSWorkPackage__Group_3_0_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSWorkPackage__Group_3_0_2__2"


    // $ANTLR start "rule__WBSWorkPackage__Group_3_0_2__2__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2176:1: rule__WBSWorkPackage__Group_3_0_2__2__Impl : ( ( rule__WBSWorkPackage__Group_3_0_2_2__0 )? ) ;
    public final void rule__WBSWorkPackage__Group_3_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2180:1: ( ( ( rule__WBSWorkPackage__Group_3_0_2_2__0 )? ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2181:1: ( ( rule__WBSWorkPackage__Group_3_0_2_2__0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2181:1: ( ( rule__WBSWorkPackage__Group_3_0_2_2__0 )? )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2182:1: ( rule__WBSWorkPackage__Group_3_0_2_2__0 )?
            {
             before(grammarAccess.getWBSWorkPackageAccess().getGroup_3_0_2_2()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2183:1: ( rule__WBSWorkPackage__Group_3_0_2_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2183:2: rule__WBSWorkPackage__Group_3_0_2_2__0
                    {
                    pushFollow(FOLLOW_rule__WBSWorkPackage__Group_3_0_2_2__0_in_rule__WBSWorkPackage__Group_3_0_2__2__Impl4342);
                    rule__WBSWorkPackage__Group_3_0_2_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWBSWorkPackageAccess().getGroup_3_0_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSWorkPackage__Group_3_0_2__2__Impl"


    // $ANTLR start "rule__WBSWorkPackage__Group_3_0_2__3"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2193:1: rule__WBSWorkPackage__Group_3_0_2__3 : rule__WBSWorkPackage__Group_3_0_2__3__Impl ;
    public final void rule__WBSWorkPackage__Group_3_0_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2197:1: ( rule__WBSWorkPackage__Group_3_0_2__3__Impl )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2198:2: rule__WBSWorkPackage__Group_3_0_2__3__Impl
            {
            pushFollow(FOLLOW_rule__WBSWorkPackage__Group_3_0_2__3__Impl_in_rule__WBSWorkPackage__Group_3_0_2__34373);
            rule__WBSWorkPackage__Group_3_0_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSWorkPackage__Group_3_0_2__3"


    // $ANTLR start "rule__WBSWorkPackage__Group_3_0_2__3__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2204:1: rule__WBSWorkPackage__Group_3_0_2__3__Impl : ( RULE_CLOSEDCURLY ) ;
    public final void rule__WBSWorkPackage__Group_3_0_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2208:1: ( ( RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2209:1: ( RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2209:1: ( RULE_CLOSEDCURLY )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2210:1: RULE_CLOSEDCURLY
            {
             before(grammarAccess.getWBSWorkPackageAccess().getCLOSEDCURLYTerminalRuleCall_3_0_2_3()); 
            match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_rule__WBSWorkPackage__Group_3_0_2__3__Impl4400); 
             after(grammarAccess.getWBSWorkPackageAccess().getCLOSEDCURLYTerminalRuleCall_3_0_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSWorkPackage__Group_3_0_2__3__Impl"


    // $ANTLR start "rule__WBSWorkPackage__Group_3_0_2_2__0"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2229:1: rule__WBSWorkPackage__Group_3_0_2_2__0 : rule__WBSWorkPackage__Group_3_0_2_2__0__Impl rule__WBSWorkPackage__Group_3_0_2_2__1 ;
    public final void rule__WBSWorkPackage__Group_3_0_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2233:1: ( rule__WBSWorkPackage__Group_3_0_2_2__0__Impl rule__WBSWorkPackage__Group_3_0_2_2__1 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2234:2: rule__WBSWorkPackage__Group_3_0_2_2__0__Impl rule__WBSWorkPackage__Group_3_0_2_2__1
            {
            pushFollow(FOLLOW_rule__WBSWorkPackage__Group_3_0_2_2__0__Impl_in_rule__WBSWorkPackage__Group_3_0_2_2__04437);
            rule__WBSWorkPackage__Group_3_0_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSWorkPackage__Group_3_0_2_2__1_in_rule__WBSWorkPackage__Group_3_0_2_2__04440);
            rule__WBSWorkPackage__Group_3_0_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSWorkPackage__Group_3_0_2_2__0"


    // $ANTLR start "rule__WBSWorkPackage__Group_3_0_2_2__0__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2241:1: rule__WBSWorkPackage__Group_3_0_2_2__0__Impl : ( ( rule__WBSWorkPackage__RequirementsAssignment_3_0_2_2_0 ) ) ;
    public final void rule__WBSWorkPackage__Group_3_0_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2245:1: ( ( ( rule__WBSWorkPackage__RequirementsAssignment_3_0_2_2_0 ) ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2246:1: ( ( rule__WBSWorkPackage__RequirementsAssignment_3_0_2_2_0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2246:1: ( ( rule__WBSWorkPackage__RequirementsAssignment_3_0_2_2_0 ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2247:1: ( rule__WBSWorkPackage__RequirementsAssignment_3_0_2_2_0 )
            {
             before(grammarAccess.getWBSWorkPackageAccess().getRequirementsAssignment_3_0_2_2_0()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2248:1: ( rule__WBSWorkPackage__RequirementsAssignment_3_0_2_2_0 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2248:2: rule__WBSWorkPackage__RequirementsAssignment_3_0_2_2_0
            {
            pushFollow(FOLLOW_rule__WBSWorkPackage__RequirementsAssignment_3_0_2_2_0_in_rule__WBSWorkPackage__Group_3_0_2_2__0__Impl4467);
            rule__WBSWorkPackage__RequirementsAssignment_3_0_2_2_0();

            state._fsp--;


            }

             after(grammarAccess.getWBSWorkPackageAccess().getRequirementsAssignment_3_0_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSWorkPackage__Group_3_0_2_2__0__Impl"


    // $ANTLR start "rule__WBSWorkPackage__Group_3_0_2_2__1"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2258:1: rule__WBSWorkPackage__Group_3_0_2_2__1 : rule__WBSWorkPackage__Group_3_0_2_2__1__Impl ;
    public final void rule__WBSWorkPackage__Group_3_0_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2262:1: ( rule__WBSWorkPackage__Group_3_0_2_2__1__Impl )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2263:2: rule__WBSWorkPackage__Group_3_0_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__WBSWorkPackage__Group_3_0_2_2__1__Impl_in_rule__WBSWorkPackage__Group_3_0_2_2__14497);
            rule__WBSWorkPackage__Group_3_0_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSWorkPackage__Group_3_0_2_2__1"


    // $ANTLR start "rule__WBSWorkPackage__Group_3_0_2_2__1__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2269:1: rule__WBSWorkPackage__Group_3_0_2_2__1__Impl : ( RULE_ENDLINE ) ;
    public final void rule__WBSWorkPackage__Group_3_0_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2273:1: ( ( RULE_ENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2274:1: ( RULE_ENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2274:1: ( RULE_ENDLINE )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2275:1: RULE_ENDLINE
            {
             before(grammarAccess.getWBSWorkPackageAccess().getENDLINETerminalRuleCall_3_0_2_2_1()); 
            match(input,RULE_ENDLINE,FOLLOW_RULE_ENDLINE_in_rule__WBSWorkPackage__Group_3_0_2_2__1__Impl4524); 
             after(grammarAccess.getWBSWorkPackageAccess().getENDLINETerminalRuleCall_3_0_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSWorkPackage__Group_3_0_2_2__1__Impl"


    // $ANTLR start "rule__WBSDeliverable__Group__0"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2290:1: rule__WBSDeliverable__Group__0 : rule__WBSDeliverable__Group__0__Impl rule__WBSDeliverable__Group__1 ;
    public final void rule__WBSDeliverable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2294:1: ( rule__WBSDeliverable__Group__0__Impl rule__WBSDeliverable__Group__1 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2295:2: rule__WBSDeliverable__Group__0__Impl rule__WBSDeliverable__Group__1
            {
            pushFollow(FOLLOW_rule__WBSDeliverable__Group__0__Impl_in_rule__WBSDeliverable__Group__04557);
            rule__WBSDeliverable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSDeliverable__Group__1_in_rule__WBSDeliverable__Group__04560);
            rule__WBSDeliverable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSDeliverable__Group__0"


    // $ANTLR start "rule__WBSDeliverable__Group__0__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2302:1: rule__WBSDeliverable__Group__0__Impl : ( ( rule__WBSDeliverable__DescriptionAssignment_0 )? ) ;
    public final void rule__WBSDeliverable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2306:1: ( ( ( rule__WBSDeliverable__DescriptionAssignment_0 )? ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2307:1: ( ( rule__WBSDeliverable__DescriptionAssignment_0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2307:1: ( ( rule__WBSDeliverable__DescriptionAssignment_0 )? )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2308:1: ( rule__WBSDeliverable__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getWBSDeliverableAccess().getDescriptionAssignment_0()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2309:1: ( rule__WBSDeliverable__DescriptionAssignment_0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ML_COMMENT) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2309:2: rule__WBSDeliverable__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__WBSDeliverable__DescriptionAssignment_0_in_rule__WBSDeliverable__Group__0__Impl4587);
                    rule__WBSDeliverable__DescriptionAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWBSDeliverableAccess().getDescriptionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSDeliverable__Group__0__Impl"


    // $ANTLR start "rule__WBSDeliverable__Group__1"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2319:1: rule__WBSDeliverable__Group__1 : rule__WBSDeliverable__Group__1__Impl rule__WBSDeliverable__Group__2 ;
    public final void rule__WBSDeliverable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2323:1: ( rule__WBSDeliverable__Group__1__Impl rule__WBSDeliverable__Group__2 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2324:2: rule__WBSDeliverable__Group__1__Impl rule__WBSDeliverable__Group__2
            {
            pushFollow(FOLLOW_rule__WBSDeliverable__Group__1__Impl_in_rule__WBSDeliverable__Group__14618);
            rule__WBSDeliverable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSDeliverable__Group__2_in_rule__WBSDeliverable__Group__14621);
            rule__WBSDeliverable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSDeliverable__Group__1"


    // $ANTLR start "rule__WBSDeliverable__Group__1__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2331:1: rule__WBSDeliverable__Group__1__Impl : ( 'Deliverable ' ) ;
    public final void rule__WBSDeliverable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2335:1: ( ( 'Deliverable ' ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2336:1: ( 'Deliverable ' )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2336:1: ( 'Deliverable ' )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2337:1: 'Deliverable '
            {
             before(grammarAccess.getWBSDeliverableAccess().getDeliverableKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__WBSDeliverable__Group__1__Impl4649); 
             after(grammarAccess.getWBSDeliverableAccess().getDeliverableKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSDeliverable__Group__1__Impl"


    // $ANTLR start "rule__WBSDeliverable__Group__2"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2350:1: rule__WBSDeliverable__Group__2 : rule__WBSDeliverable__Group__2__Impl rule__WBSDeliverable__Group__3 ;
    public final void rule__WBSDeliverable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2354:1: ( rule__WBSDeliverable__Group__2__Impl rule__WBSDeliverable__Group__3 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2355:2: rule__WBSDeliverable__Group__2__Impl rule__WBSDeliverable__Group__3
            {
            pushFollow(FOLLOW_rule__WBSDeliverable__Group__2__Impl_in_rule__WBSDeliverable__Group__24680);
            rule__WBSDeliverable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSDeliverable__Group__3_in_rule__WBSDeliverable__Group__24683);
            rule__WBSDeliverable__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSDeliverable__Group__2"


    // $ANTLR start "rule__WBSDeliverable__Group__2__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2362:1: rule__WBSDeliverable__Group__2__Impl : ( ( rule__WBSDeliverable__NameAssignment_2 ) ) ;
    public final void rule__WBSDeliverable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2366:1: ( ( ( rule__WBSDeliverable__NameAssignment_2 ) ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2367:1: ( ( rule__WBSDeliverable__NameAssignment_2 ) )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2367:1: ( ( rule__WBSDeliverable__NameAssignment_2 ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2368:1: ( rule__WBSDeliverable__NameAssignment_2 )
            {
             before(grammarAccess.getWBSDeliverableAccess().getNameAssignment_2()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2369:1: ( rule__WBSDeliverable__NameAssignment_2 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2369:2: rule__WBSDeliverable__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__WBSDeliverable__NameAssignment_2_in_rule__WBSDeliverable__Group__2__Impl4710);
            rule__WBSDeliverable__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWBSDeliverableAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSDeliverable__Group__2__Impl"


    // $ANTLR start "rule__WBSDeliverable__Group__3"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2379:1: rule__WBSDeliverable__Group__3 : rule__WBSDeliverable__Group__3__Impl ;
    public final void rule__WBSDeliverable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2383:1: ( rule__WBSDeliverable__Group__3__Impl )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2384:2: rule__WBSDeliverable__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__WBSDeliverable__Group__3__Impl_in_rule__WBSDeliverable__Group__34740);
            rule__WBSDeliverable__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSDeliverable__Group__3"


    // $ANTLR start "rule__WBSDeliverable__Group__3__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2390:1: rule__WBSDeliverable__Group__3__Impl : ( ( rule__WBSDeliverable__Alternatives_3 ) ) ;
    public final void rule__WBSDeliverable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2394:1: ( ( ( rule__WBSDeliverable__Alternatives_3 ) ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2395:1: ( ( rule__WBSDeliverable__Alternatives_3 ) )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2395:1: ( ( rule__WBSDeliverable__Alternatives_3 ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2396:1: ( rule__WBSDeliverable__Alternatives_3 )
            {
             before(grammarAccess.getWBSDeliverableAccess().getAlternatives_3()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2397:1: ( rule__WBSDeliverable__Alternatives_3 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2397:2: rule__WBSDeliverable__Alternatives_3
            {
            pushFollow(FOLLOW_rule__WBSDeliverable__Alternatives_3_in_rule__WBSDeliverable__Group__3__Impl4767);
            rule__WBSDeliverable__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getWBSDeliverableAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSDeliverable__Group__3__Impl"


    // $ANTLR start "rule__WBSDeliverable__Group_3_0__0"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2415:1: rule__WBSDeliverable__Group_3_0__0 : rule__WBSDeliverable__Group_3_0__0__Impl rule__WBSDeliverable__Group_3_0__1 ;
    public final void rule__WBSDeliverable__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2419:1: ( rule__WBSDeliverable__Group_3_0__0__Impl rule__WBSDeliverable__Group_3_0__1 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2420:2: rule__WBSDeliverable__Group_3_0__0__Impl rule__WBSDeliverable__Group_3_0__1
            {
            pushFollow(FOLLOW_rule__WBSDeliverable__Group_3_0__0__Impl_in_rule__WBSDeliverable__Group_3_0__04805);
            rule__WBSDeliverable__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSDeliverable__Group_3_0__1_in_rule__WBSDeliverable__Group_3_0__04808);
            rule__WBSDeliverable__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSDeliverable__Group_3_0__0"


    // $ANTLR start "rule__WBSDeliverable__Group_3_0__0__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2427:1: rule__WBSDeliverable__Group_3_0__0__Impl : ( RULE_OPENCURLY ) ;
    public final void rule__WBSDeliverable__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2431:1: ( ( RULE_OPENCURLY ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2432:1: ( RULE_OPENCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2432:1: ( RULE_OPENCURLY )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2433:1: RULE_OPENCURLY
            {
             before(grammarAccess.getWBSDeliverableAccess().getOPENCURLYTerminalRuleCall_3_0_0()); 
            match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_rule__WBSDeliverable__Group_3_0__0__Impl4835); 
             after(grammarAccess.getWBSDeliverableAccess().getOPENCURLYTerminalRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSDeliverable__Group_3_0__0__Impl"


    // $ANTLR start "rule__WBSDeliverable__Group_3_0__1"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2444:1: rule__WBSDeliverable__Group_3_0__1 : rule__WBSDeliverable__Group_3_0__1__Impl rule__WBSDeliverable__Group_3_0__2 ;
    public final void rule__WBSDeliverable__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2448:1: ( rule__WBSDeliverable__Group_3_0__1__Impl rule__WBSDeliverable__Group_3_0__2 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2449:2: rule__WBSDeliverable__Group_3_0__1__Impl rule__WBSDeliverable__Group_3_0__2
            {
            pushFollow(FOLLOW_rule__WBSDeliverable__Group_3_0__1__Impl_in_rule__WBSDeliverable__Group_3_0__14864);
            rule__WBSDeliverable__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSDeliverable__Group_3_0__2_in_rule__WBSDeliverable__Group_3_0__14867);
            rule__WBSDeliverable__Group_3_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSDeliverable__Group_3_0__1"


    // $ANTLR start "rule__WBSDeliverable__Group_3_0__1__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2456:1: rule__WBSDeliverable__Group_3_0__1__Impl : ( ( rule__WBSDeliverable__WbsNodesAssignment_3_0_1 )* ) ;
    public final void rule__WBSDeliverable__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2460:1: ( ( ( rule__WBSDeliverable__WbsNodesAssignment_3_0_1 )* ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2461:1: ( ( rule__WBSDeliverable__WbsNodesAssignment_3_0_1 )* )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2461:1: ( ( rule__WBSDeliverable__WbsNodesAssignment_3_0_1 )* )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2462:1: ( rule__WBSDeliverable__WbsNodesAssignment_3_0_1 )*
            {
             before(grammarAccess.getWBSDeliverableAccess().getWbsNodesAssignment_3_0_1()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2463:1: ( rule__WBSDeliverable__WbsNodesAssignment_3_0_1 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ML_COMMENT||(LA25_0>=17 && LA25_0<=19)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2463:2: rule__WBSDeliverable__WbsNodesAssignment_3_0_1
            	    {
            	    pushFollow(FOLLOW_rule__WBSDeliverable__WbsNodesAssignment_3_0_1_in_rule__WBSDeliverable__Group_3_0__1__Impl4894);
            	    rule__WBSDeliverable__WbsNodesAssignment_3_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getWBSDeliverableAccess().getWbsNodesAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSDeliverable__Group_3_0__1__Impl"


    // $ANTLR start "rule__WBSDeliverable__Group_3_0__2"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2473:1: rule__WBSDeliverable__Group_3_0__2 : rule__WBSDeliverable__Group_3_0__2__Impl rule__WBSDeliverable__Group_3_0__3 ;
    public final void rule__WBSDeliverable__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2477:1: ( rule__WBSDeliverable__Group_3_0__2__Impl rule__WBSDeliverable__Group_3_0__3 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2478:2: rule__WBSDeliverable__Group_3_0__2__Impl rule__WBSDeliverable__Group_3_0__3
            {
            pushFollow(FOLLOW_rule__WBSDeliverable__Group_3_0__2__Impl_in_rule__WBSDeliverable__Group_3_0__24925);
            rule__WBSDeliverable__Group_3_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSDeliverable__Group_3_0__3_in_rule__WBSDeliverable__Group_3_0__24928);
            rule__WBSDeliverable__Group_3_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSDeliverable__Group_3_0__2"


    // $ANTLR start "rule__WBSDeliverable__Group_3_0__2__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2485:1: rule__WBSDeliverable__Group_3_0__2__Impl : ( ( rule__WBSDeliverable__Group_3_0_2__0 )? ) ;
    public final void rule__WBSDeliverable__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2489:1: ( ( ( rule__WBSDeliverable__Group_3_0_2__0 )? ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2490:1: ( ( rule__WBSDeliverable__Group_3_0_2__0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2490:1: ( ( rule__WBSDeliverable__Group_3_0_2__0 )? )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2491:1: ( rule__WBSDeliverable__Group_3_0_2__0 )?
            {
             before(grammarAccess.getWBSDeliverableAccess().getGroup_3_0_2()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2492:1: ( rule__WBSDeliverable__Group_3_0_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==15) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2492:2: rule__WBSDeliverable__Group_3_0_2__0
                    {
                    pushFollow(FOLLOW_rule__WBSDeliverable__Group_3_0_2__0_in_rule__WBSDeliverable__Group_3_0__2__Impl4955);
                    rule__WBSDeliverable__Group_3_0_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWBSDeliverableAccess().getGroup_3_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSDeliverable__Group_3_0__2__Impl"


    // $ANTLR start "rule__WBSDeliverable__Group_3_0__3"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2502:1: rule__WBSDeliverable__Group_3_0__3 : rule__WBSDeliverable__Group_3_0__3__Impl ;
    public final void rule__WBSDeliverable__Group_3_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2506:1: ( rule__WBSDeliverable__Group_3_0__3__Impl )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2507:2: rule__WBSDeliverable__Group_3_0__3__Impl
            {
            pushFollow(FOLLOW_rule__WBSDeliverable__Group_3_0__3__Impl_in_rule__WBSDeliverable__Group_3_0__34986);
            rule__WBSDeliverable__Group_3_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSDeliverable__Group_3_0__3"


    // $ANTLR start "rule__WBSDeliverable__Group_3_0__3__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2513:1: rule__WBSDeliverable__Group_3_0__3__Impl : ( RULE_CLOSEDCURLY ) ;
    public final void rule__WBSDeliverable__Group_3_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2517:1: ( ( RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2518:1: ( RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2518:1: ( RULE_CLOSEDCURLY )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2519:1: RULE_CLOSEDCURLY
            {
             before(grammarAccess.getWBSDeliverableAccess().getCLOSEDCURLYTerminalRuleCall_3_0_3()); 
            match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_rule__WBSDeliverable__Group_3_0__3__Impl5013); 
             after(grammarAccess.getWBSDeliverableAccess().getCLOSEDCURLYTerminalRuleCall_3_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSDeliverable__Group_3_0__3__Impl"


    // $ANTLR start "rule__WBSDeliverable__Group_3_0_2__0"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2538:1: rule__WBSDeliverable__Group_3_0_2__0 : rule__WBSDeliverable__Group_3_0_2__0__Impl rule__WBSDeliverable__Group_3_0_2__1 ;
    public final void rule__WBSDeliverable__Group_3_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2542:1: ( rule__WBSDeliverable__Group_3_0_2__0__Impl rule__WBSDeliverable__Group_3_0_2__1 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2543:2: rule__WBSDeliverable__Group_3_0_2__0__Impl rule__WBSDeliverable__Group_3_0_2__1
            {
            pushFollow(FOLLOW_rule__WBSDeliverable__Group_3_0_2__0__Impl_in_rule__WBSDeliverable__Group_3_0_2__05050);
            rule__WBSDeliverable__Group_3_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSDeliverable__Group_3_0_2__1_in_rule__WBSDeliverable__Group_3_0_2__05053);
            rule__WBSDeliverable__Group_3_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSDeliverable__Group_3_0_2__0"


    // $ANTLR start "rule__WBSDeliverable__Group_3_0_2__0__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2550:1: rule__WBSDeliverable__Group_3_0_2__0__Impl : ( 'requirements' ) ;
    public final void rule__WBSDeliverable__Group_3_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2554:1: ( ( 'requirements' ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2555:1: ( 'requirements' )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2555:1: ( 'requirements' )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2556:1: 'requirements'
            {
             before(grammarAccess.getWBSDeliverableAccess().getRequirementsKeyword_3_0_2_0()); 
            match(input,15,FOLLOW_15_in_rule__WBSDeliverable__Group_3_0_2__0__Impl5081); 
             after(grammarAccess.getWBSDeliverableAccess().getRequirementsKeyword_3_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSDeliverable__Group_3_0_2__0__Impl"


    // $ANTLR start "rule__WBSDeliverable__Group_3_0_2__1"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2569:1: rule__WBSDeliverable__Group_3_0_2__1 : rule__WBSDeliverable__Group_3_0_2__1__Impl rule__WBSDeliverable__Group_3_0_2__2 ;
    public final void rule__WBSDeliverable__Group_3_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2573:1: ( rule__WBSDeliverable__Group_3_0_2__1__Impl rule__WBSDeliverable__Group_3_0_2__2 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2574:2: rule__WBSDeliverable__Group_3_0_2__1__Impl rule__WBSDeliverable__Group_3_0_2__2
            {
            pushFollow(FOLLOW_rule__WBSDeliverable__Group_3_0_2__1__Impl_in_rule__WBSDeliverable__Group_3_0_2__15112);
            rule__WBSDeliverable__Group_3_0_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSDeliverable__Group_3_0_2__2_in_rule__WBSDeliverable__Group_3_0_2__15115);
            rule__WBSDeliverable__Group_3_0_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSDeliverable__Group_3_0_2__1"


    // $ANTLR start "rule__WBSDeliverable__Group_3_0_2__1__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2581:1: rule__WBSDeliverable__Group_3_0_2__1__Impl : ( RULE_OPENCURLY ) ;
    public final void rule__WBSDeliverable__Group_3_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2585:1: ( ( RULE_OPENCURLY ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2586:1: ( RULE_OPENCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2586:1: ( RULE_OPENCURLY )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2587:1: RULE_OPENCURLY
            {
             before(grammarAccess.getWBSDeliverableAccess().getOPENCURLYTerminalRuleCall_3_0_2_1()); 
            match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_rule__WBSDeliverable__Group_3_0_2__1__Impl5142); 
             after(grammarAccess.getWBSDeliverableAccess().getOPENCURLYTerminalRuleCall_3_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSDeliverable__Group_3_0_2__1__Impl"


    // $ANTLR start "rule__WBSDeliverable__Group_3_0_2__2"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2598:1: rule__WBSDeliverable__Group_3_0_2__2 : rule__WBSDeliverable__Group_3_0_2__2__Impl rule__WBSDeliverable__Group_3_0_2__3 ;
    public final void rule__WBSDeliverable__Group_3_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2602:1: ( rule__WBSDeliverable__Group_3_0_2__2__Impl rule__WBSDeliverable__Group_3_0_2__3 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2603:2: rule__WBSDeliverable__Group_3_0_2__2__Impl rule__WBSDeliverable__Group_3_0_2__3
            {
            pushFollow(FOLLOW_rule__WBSDeliverable__Group_3_0_2__2__Impl_in_rule__WBSDeliverable__Group_3_0_2__25171);
            rule__WBSDeliverable__Group_3_0_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSDeliverable__Group_3_0_2__3_in_rule__WBSDeliverable__Group_3_0_2__25174);
            rule__WBSDeliverable__Group_3_0_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSDeliverable__Group_3_0_2__2"


    // $ANTLR start "rule__WBSDeliverable__Group_3_0_2__2__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2610:1: rule__WBSDeliverable__Group_3_0_2__2__Impl : ( ( rule__WBSDeliverable__Group_3_0_2_2__0 )? ) ;
    public final void rule__WBSDeliverable__Group_3_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2614:1: ( ( ( rule__WBSDeliverable__Group_3_0_2_2__0 )? ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2615:1: ( ( rule__WBSDeliverable__Group_3_0_2_2__0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2615:1: ( ( rule__WBSDeliverable__Group_3_0_2_2__0 )? )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2616:1: ( rule__WBSDeliverable__Group_3_0_2_2__0 )?
            {
             before(grammarAccess.getWBSDeliverableAccess().getGroup_3_0_2_2()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2617:1: ( rule__WBSDeliverable__Group_3_0_2_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2617:2: rule__WBSDeliverable__Group_3_0_2_2__0
                    {
                    pushFollow(FOLLOW_rule__WBSDeliverable__Group_3_0_2_2__0_in_rule__WBSDeliverable__Group_3_0_2__2__Impl5201);
                    rule__WBSDeliverable__Group_3_0_2_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWBSDeliverableAccess().getGroup_3_0_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSDeliverable__Group_3_0_2__2__Impl"


    // $ANTLR start "rule__WBSDeliverable__Group_3_0_2__3"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2627:1: rule__WBSDeliverable__Group_3_0_2__3 : rule__WBSDeliverable__Group_3_0_2__3__Impl ;
    public final void rule__WBSDeliverable__Group_3_0_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2631:1: ( rule__WBSDeliverable__Group_3_0_2__3__Impl )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2632:2: rule__WBSDeliverable__Group_3_0_2__3__Impl
            {
            pushFollow(FOLLOW_rule__WBSDeliverable__Group_3_0_2__3__Impl_in_rule__WBSDeliverable__Group_3_0_2__35232);
            rule__WBSDeliverable__Group_3_0_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSDeliverable__Group_3_0_2__3"


    // $ANTLR start "rule__WBSDeliverable__Group_3_0_2__3__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2638:1: rule__WBSDeliverable__Group_3_0_2__3__Impl : ( RULE_CLOSEDCURLY ) ;
    public final void rule__WBSDeliverable__Group_3_0_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2642:1: ( ( RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2643:1: ( RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2643:1: ( RULE_CLOSEDCURLY )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2644:1: RULE_CLOSEDCURLY
            {
             before(grammarAccess.getWBSDeliverableAccess().getCLOSEDCURLYTerminalRuleCall_3_0_2_3()); 
            match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_rule__WBSDeliverable__Group_3_0_2__3__Impl5259); 
             after(grammarAccess.getWBSDeliverableAccess().getCLOSEDCURLYTerminalRuleCall_3_0_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSDeliverable__Group_3_0_2__3__Impl"


    // $ANTLR start "rule__WBSDeliverable__Group_3_0_2_2__0"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2663:1: rule__WBSDeliverable__Group_3_0_2_2__0 : rule__WBSDeliverable__Group_3_0_2_2__0__Impl rule__WBSDeliverable__Group_3_0_2_2__1 ;
    public final void rule__WBSDeliverable__Group_3_0_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2667:1: ( rule__WBSDeliverable__Group_3_0_2_2__0__Impl rule__WBSDeliverable__Group_3_0_2_2__1 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2668:2: rule__WBSDeliverable__Group_3_0_2_2__0__Impl rule__WBSDeliverable__Group_3_0_2_2__1
            {
            pushFollow(FOLLOW_rule__WBSDeliverable__Group_3_0_2_2__0__Impl_in_rule__WBSDeliverable__Group_3_0_2_2__05296);
            rule__WBSDeliverable__Group_3_0_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSDeliverable__Group_3_0_2_2__1_in_rule__WBSDeliverable__Group_3_0_2_2__05299);
            rule__WBSDeliverable__Group_3_0_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSDeliverable__Group_3_0_2_2__0"


    // $ANTLR start "rule__WBSDeliverable__Group_3_0_2_2__0__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2675:1: rule__WBSDeliverable__Group_3_0_2_2__0__Impl : ( ( rule__WBSDeliverable__RequirementsAssignment_3_0_2_2_0 ) ) ;
    public final void rule__WBSDeliverable__Group_3_0_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2679:1: ( ( ( rule__WBSDeliverable__RequirementsAssignment_3_0_2_2_0 ) ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2680:1: ( ( rule__WBSDeliverable__RequirementsAssignment_3_0_2_2_0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2680:1: ( ( rule__WBSDeliverable__RequirementsAssignment_3_0_2_2_0 ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2681:1: ( rule__WBSDeliverable__RequirementsAssignment_3_0_2_2_0 )
            {
             before(grammarAccess.getWBSDeliverableAccess().getRequirementsAssignment_3_0_2_2_0()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2682:1: ( rule__WBSDeliverable__RequirementsAssignment_3_0_2_2_0 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2682:2: rule__WBSDeliverable__RequirementsAssignment_3_0_2_2_0
            {
            pushFollow(FOLLOW_rule__WBSDeliverable__RequirementsAssignment_3_0_2_2_0_in_rule__WBSDeliverable__Group_3_0_2_2__0__Impl5326);
            rule__WBSDeliverable__RequirementsAssignment_3_0_2_2_0();

            state._fsp--;


            }

             after(grammarAccess.getWBSDeliverableAccess().getRequirementsAssignment_3_0_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSDeliverable__Group_3_0_2_2__0__Impl"


    // $ANTLR start "rule__WBSDeliverable__Group_3_0_2_2__1"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2692:1: rule__WBSDeliverable__Group_3_0_2_2__1 : rule__WBSDeliverable__Group_3_0_2_2__1__Impl ;
    public final void rule__WBSDeliverable__Group_3_0_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2696:1: ( rule__WBSDeliverable__Group_3_0_2_2__1__Impl )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2697:2: rule__WBSDeliverable__Group_3_0_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__WBSDeliverable__Group_3_0_2_2__1__Impl_in_rule__WBSDeliverable__Group_3_0_2_2__15356);
            rule__WBSDeliverable__Group_3_0_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSDeliverable__Group_3_0_2_2__1"


    // $ANTLR start "rule__WBSDeliverable__Group_3_0_2_2__1__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2703:1: rule__WBSDeliverable__Group_3_0_2_2__1__Impl : ( RULE_ENDLINE ) ;
    public final void rule__WBSDeliverable__Group_3_0_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2707:1: ( ( RULE_ENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2708:1: ( RULE_ENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2708:1: ( RULE_ENDLINE )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2709:1: RULE_ENDLINE
            {
             before(grammarAccess.getWBSDeliverableAccess().getENDLINETerminalRuleCall_3_0_2_2_1()); 
            match(input,RULE_ENDLINE,FOLLOW_RULE_ENDLINE_in_rule__WBSDeliverable__Group_3_0_2_2__1__Impl5383); 
             after(grammarAccess.getWBSDeliverableAccess().getENDLINETerminalRuleCall_3_0_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSDeliverable__Group_3_0_2_2__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2724:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2728:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2729:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__05416);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__05419);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2736:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2740:1: ( ( RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2741:1: ( RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2741:1: ( RULE_ID )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2742:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl5446); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2753:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2757:1: ( rule__QualifiedName__Group__1__Impl )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2758:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__15475);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2764:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2768:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2769:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2769:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2770:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2771:1: ( rule__QualifiedName__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==20) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2771:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl5502);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2785:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2789:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2790:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__05537);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__05540);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2797:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2801:1: ( ( '.' ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2802:1: ( '.' )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2802:1: ( '.' )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2803:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,20,FOLLOW_20_in_rule__QualifiedName__Group_1__0__Impl5568); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2816:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2820:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2821:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__15599);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2827:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2831:1: ( ( RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2832:1: ( RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2832:1: ( RULE_ID )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2833:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl5626); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__RequirementImport__Group__0"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2848:1: rule__RequirementImport__Group__0 : rule__RequirementImport__Group__0__Impl rule__RequirementImport__Group__1 ;
    public final void rule__RequirementImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2852:1: ( rule__RequirementImport__Group__0__Impl rule__RequirementImport__Group__1 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2853:2: rule__RequirementImport__Group__0__Impl rule__RequirementImport__Group__1
            {
            pushFollow(FOLLOW_rule__RequirementImport__Group__0__Impl_in_rule__RequirementImport__Group__05659);
            rule__RequirementImport__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RequirementImport__Group__1_in_rule__RequirementImport__Group__05662);
            rule__RequirementImport__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementImport__Group__0"


    // $ANTLR start "rule__RequirementImport__Group__0__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2860:1: rule__RequirementImport__Group__0__Impl : ( 'req_import' ) ;
    public final void rule__RequirementImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2864:1: ( ( 'req_import' ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2865:1: ( 'req_import' )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2865:1: ( 'req_import' )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2866:1: 'req_import'
            {
             before(grammarAccess.getRequirementImportAccess().getReq_importKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__RequirementImport__Group__0__Impl5690); 
             after(grammarAccess.getRequirementImportAccess().getReq_importKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementImport__Group__0__Impl"


    // $ANTLR start "rule__RequirementImport__Group__1"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2879:1: rule__RequirementImport__Group__1 : rule__RequirementImport__Group__1__Impl ;
    public final void rule__RequirementImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2883:1: ( rule__RequirementImport__Group__1__Impl )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2884:2: rule__RequirementImport__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__RequirementImport__Group__1__Impl_in_rule__RequirementImport__Group__15721);
            rule__RequirementImport__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementImport__Group__1"


    // $ANTLR start "rule__RequirementImport__Group__1__Impl"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2890:1: rule__RequirementImport__Group__1__Impl : ( ( rule__RequirementImport__ImportURIAssignment_1 ) ) ;
    public final void rule__RequirementImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2894:1: ( ( ( rule__RequirementImport__ImportURIAssignment_1 ) ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2895:1: ( ( rule__RequirementImport__ImportURIAssignment_1 ) )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2895:1: ( ( rule__RequirementImport__ImportURIAssignment_1 ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2896:1: ( rule__RequirementImport__ImportURIAssignment_1 )
            {
             before(grammarAccess.getRequirementImportAccess().getImportURIAssignment_1()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2897:1: ( rule__RequirementImport__ImportURIAssignment_1 )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2897:2: rule__RequirementImport__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__RequirementImport__ImportURIAssignment_1_in_rule__RequirementImport__Group__1__Impl5748);
            rule__RequirementImport__ImportURIAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRequirementImportAccess().getImportURIAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementImport__Group__1__Impl"


    // $ANTLR start "rule__WBSProgram__DescriptionAssignment_0"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2912:1: rule__WBSProgram__DescriptionAssignment_0 : ( RULE_ML_COMMENT ) ;
    public final void rule__WBSProgram__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2916:1: ( ( RULE_ML_COMMENT ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2917:1: ( RULE_ML_COMMENT )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2917:1: ( RULE_ML_COMMENT )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2918:1: RULE_ML_COMMENT
            {
             before(grammarAccess.getWBSProgramAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_rule__WBSProgram__DescriptionAssignment_05787); 
             after(grammarAccess.getWBSProgramAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProgram__DescriptionAssignment_0"


    // $ANTLR start "rule__WBSProgram__NameAssignment_2"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2927:1: rule__WBSProgram__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__WBSProgram__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2931:1: ( ( RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2932:1: ( RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2932:1: ( RULE_ID )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2933:1: RULE_ID
            {
             before(grammarAccess.getWBSProgramAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__WBSProgram__NameAssignment_25818); 
             after(grammarAccess.getWBSProgramAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProgram__NameAssignment_2"


    // $ANTLR start "rule__WBSProgram__RequirementsModelAssignment_4_0"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2942:1: rule__WBSProgram__RequirementsModelAssignment_4_0 : ( ruleRequirementImport ) ;
    public final void rule__WBSProgram__RequirementsModelAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2946:1: ( ( ruleRequirementImport ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2947:1: ( ruleRequirementImport )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2947:1: ( ruleRequirementImport )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2948:1: ruleRequirementImport
            {
             before(grammarAccess.getWBSProgramAccess().getRequirementsModelRequirementImportParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleRequirementImport_in_rule__WBSProgram__RequirementsModelAssignment_4_05849);
            ruleRequirementImport();

            state._fsp--;

             after(grammarAccess.getWBSProgramAccess().getRequirementsModelRequirementImportParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProgram__RequirementsModelAssignment_4_0"


    // $ANTLR start "rule__WBSProgram__ProjectsAssignment_5"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2957:1: rule__WBSProgram__ProjectsAssignment_5 : ( ruleWBSProject ) ;
    public final void rule__WBSProgram__ProjectsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2961:1: ( ( ruleWBSProject ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2962:1: ( ruleWBSProject )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2962:1: ( ruleWBSProject )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2963:1: ruleWBSProject
            {
             before(grammarAccess.getWBSProgramAccess().getProjectsWBSProjectParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleWBSProject_in_rule__WBSProgram__ProjectsAssignment_55880);
            ruleWBSProject();

            state._fsp--;

             after(grammarAccess.getWBSProgramAccess().getProjectsWBSProjectParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProgram__ProjectsAssignment_5"


    // $ANTLR start "rule__WBSProgram__RequirementsAssignment_6_2_0"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2972:1: rule__WBSProgram__RequirementsAssignment_6_2_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__WBSProgram__RequirementsAssignment_6_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2976:1: ( ( ( ruleQualifiedName ) ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2977:1: ( ( ruleQualifiedName ) )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2977:1: ( ( ruleQualifiedName ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2978:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getWBSProgramAccess().getRequirementsREQNodeCrossReference_6_2_0_0()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2979:1: ( ruleQualifiedName )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2980:1: ruleQualifiedName
            {
             before(grammarAccess.getWBSProgramAccess().getRequirementsREQNodeQualifiedNameParserRuleCall_6_2_0_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__WBSProgram__RequirementsAssignment_6_2_05915);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getWBSProgramAccess().getRequirementsREQNodeQualifiedNameParserRuleCall_6_2_0_0_1()); 

            }

             after(grammarAccess.getWBSProgramAccess().getRequirementsREQNodeCrossReference_6_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProgram__RequirementsAssignment_6_2_0"


    // $ANTLR start "rule__WBSProject__DescriptionAssignment_0"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2991:1: rule__WBSProject__DescriptionAssignment_0 : ( RULE_ML_COMMENT ) ;
    public final void rule__WBSProject__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2995:1: ( ( RULE_ML_COMMENT ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2996:1: ( RULE_ML_COMMENT )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2996:1: ( RULE_ML_COMMENT )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:2997:1: RULE_ML_COMMENT
            {
             before(grammarAccess.getWBSProjectAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_rule__WBSProject__DescriptionAssignment_05950); 
             after(grammarAccess.getWBSProjectAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProject__DescriptionAssignment_0"


    // $ANTLR start "rule__WBSProject__NameAssignment_2"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3006:1: rule__WBSProject__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__WBSProject__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3010:1: ( ( RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3011:1: ( RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3011:1: ( RULE_ID )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3012:1: RULE_ID
            {
             before(grammarAccess.getWBSProjectAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__WBSProject__NameAssignment_25981); 
             after(grammarAccess.getWBSProjectAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProject__NameAssignment_2"


    // $ANTLR start "rule__WBSProject__RequirementsModelAssignment_4_0"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3021:1: rule__WBSProject__RequirementsModelAssignment_4_0 : ( ruleRequirementImport ) ;
    public final void rule__WBSProject__RequirementsModelAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3025:1: ( ( ruleRequirementImport ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3026:1: ( ruleRequirementImport )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3026:1: ( ruleRequirementImport )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3027:1: ruleRequirementImport
            {
             before(grammarAccess.getWBSProjectAccess().getRequirementsModelRequirementImportParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleRequirementImport_in_rule__WBSProject__RequirementsModelAssignment_4_06012);
            ruleRequirementImport();

            state._fsp--;

             after(grammarAccess.getWBSProjectAccess().getRequirementsModelRequirementImportParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProject__RequirementsModelAssignment_4_0"


    // $ANTLR start "rule__WBSProject__WbsNodesAssignment_5"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3036:1: rule__WBSProject__WbsNodesAssignment_5 : ( ruleWBSNode ) ;
    public final void rule__WBSProject__WbsNodesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3040:1: ( ( ruleWBSNode ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3041:1: ( ruleWBSNode )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3041:1: ( ruleWBSNode )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3042:1: ruleWBSNode
            {
             before(grammarAccess.getWBSProjectAccess().getWbsNodesWBSNodeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleWBSNode_in_rule__WBSProject__WbsNodesAssignment_56043);
            ruleWBSNode();

            state._fsp--;

             after(grammarAccess.getWBSProjectAccess().getWbsNodesWBSNodeParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProject__WbsNodesAssignment_5"


    // $ANTLR start "rule__WBSProject__RequirementsAssignment_6_2_0"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3051:1: rule__WBSProject__RequirementsAssignment_6_2_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__WBSProject__RequirementsAssignment_6_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3055:1: ( ( ( ruleQualifiedName ) ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3056:1: ( ( ruleQualifiedName ) )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3056:1: ( ( ruleQualifiedName ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3057:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getWBSProjectAccess().getRequirementsREQNodeCrossReference_6_2_0_0()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3058:1: ( ruleQualifiedName )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3059:1: ruleQualifiedName
            {
             before(grammarAccess.getWBSProjectAccess().getRequirementsREQNodeQualifiedNameParserRuleCall_6_2_0_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__WBSProject__RequirementsAssignment_6_2_06078);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getWBSProjectAccess().getRequirementsREQNodeQualifiedNameParserRuleCall_6_2_0_0_1()); 

            }

             after(grammarAccess.getWBSProjectAccess().getRequirementsREQNodeCrossReference_6_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSProject__RequirementsAssignment_6_2_0"


    // $ANTLR start "rule__WBSActivity__DescriptionAssignment_0"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3070:1: rule__WBSActivity__DescriptionAssignment_0 : ( RULE_ML_COMMENT ) ;
    public final void rule__WBSActivity__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3074:1: ( ( RULE_ML_COMMENT ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3075:1: ( RULE_ML_COMMENT )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3075:1: ( RULE_ML_COMMENT )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3076:1: RULE_ML_COMMENT
            {
             before(grammarAccess.getWBSActivityAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_rule__WBSActivity__DescriptionAssignment_06113); 
             after(grammarAccess.getWBSActivityAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSActivity__DescriptionAssignment_0"


    // $ANTLR start "rule__WBSActivity__NameAssignment_2"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3085:1: rule__WBSActivity__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__WBSActivity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3089:1: ( ( RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3090:1: ( RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3090:1: ( RULE_ID )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3091:1: RULE_ID
            {
             before(grammarAccess.getWBSActivityAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__WBSActivity__NameAssignment_26144); 
             after(grammarAccess.getWBSActivityAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSActivity__NameAssignment_2"


    // $ANTLR start "rule__WBSActivity__WbsNodesAssignment_3_0_1"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3100:1: rule__WBSActivity__WbsNodesAssignment_3_0_1 : ( ruleWBSNode ) ;
    public final void rule__WBSActivity__WbsNodesAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3104:1: ( ( ruleWBSNode ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3105:1: ( ruleWBSNode )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3105:1: ( ruleWBSNode )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3106:1: ruleWBSNode
            {
             before(grammarAccess.getWBSActivityAccess().getWbsNodesWBSNodeParserRuleCall_3_0_1_0()); 
            pushFollow(FOLLOW_ruleWBSNode_in_rule__WBSActivity__WbsNodesAssignment_3_0_16175);
            ruleWBSNode();

            state._fsp--;

             after(grammarAccess.getWBSActivityAccess().getWbsNodesWBSNodeParserRuleCall_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSActivity__WbsNodesAssignment_3_0_1"


    // $ANTLR start "rule__WBSActivity__RequirementsAssignment_3_0_2_2_0"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3115:1: rule__WBSActivity__RequirementsAssignment_3_0_2_2_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__WBSActivity__RequirementsAssignment_3_0_2_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3119:1: ( ( ( ruleQualifiedName ) ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3120:1: ( ( ruleQualifiedName ) )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3120:1: ( ( ruleQualifiedName ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3121:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getWBSActivityAccess().getRequirementsREQNodeCrossReference_3_0_2_2_0_0()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3122:1: ( ruleQualifiedName )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3123:1: ruleQualifiedName
            {
             before(grammarAccess.getWBSActivityAccess().getRequirementsREQNodeQualifiedNameParserRuleCall_3_0_2_2_0_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__WBSActivity__RequirementsAssignment_3_0_2_2_06210);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getWBSActivityAccess().getRequirementsREQNodeQualifiedNameParserRuleCall_3_0_2_2_0_0_1()); 

            }

             after(grammarAccess.getWBSActivityAccess().getRequirementsREQNodeCrossReference_3_0_2_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSActivity__RequirementsAssignment_3_0_2_2_0"


    // $ANTLR start "rule__WBSWorkPackage__DescriptionAssignment_0"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3134:1: rule__WBSWorkPackage__DescriptionAssignment_0 : ( RULE_ML_COMMENT ) ;
    public final void rule__WBSWorkPackage__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3138:1: ( ( RULE_ML_COMMENT ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3139:1: ( RULE_ML_COMMENT )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3139:1: ( RULE_ML_COMMENT )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3140:1: RULE_ML_COMMENT
            {
             before(grammarAccess.getWBSWorkPackageAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_rule__WBSWorkPackage__DescriptionAssignment_06245); 
             after(grammarAccess.getWBSWorkPackageAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSWorkPackage__DescriptionAssignment_0"


    // $ANTLR start "rule__WBSWorkPackage__NameAssignment_2"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3149:1: rule__WBSWorkPackage__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__WBSWorkPackage__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3153:1: ( ( RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3154:1: ( RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3154:1: ( RULE_ID )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3155:1: RULE_ID
            {
             before(grammarAccess.getWBSWorkPackageAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__WBSWorkPackage__NameAssignment_26276); 
             after(grammarAccess.getWBSWorkPackageAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSWorkPackage__NameAssignment_2"


    // $ANTLR start "rule__WBSWorkPackage__WbsNodesAssignment_3_0_1"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3164:1: rule__WBSWorkPackage__WbsNodesAssignment_3_0_1 : ( ruleWBSNode ) ;
    public final void rule__WBSWorkPackage__WbsNodesAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3168:1: ( ( ruleWBSNode ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3169:1: ( ruleWBSNode )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3169:1: ( ruleWBSNode )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3170:1: ruleWBSNode
            {
             before(grammarAccess.getWBSWorkPackageAccess().getWbsNodesWBSNodeParserRuleCall_3_0_1_0()); 
            pushFollow(FOLLOW_ruleWBSNode_in_rule__WBSWorkPackage__WbsNodesAssignment_3_0_16307);
            ruleWBSNode();

            state._fsp--;

             after(grammarAccess.getWBSWorkPackageAccess().getWbsNodesWBSNodeParserRuleCall_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSWorkPackage__WbsNodesAssignment_3_0_1"


    // $ANTLR start "rule__WBSWorkPackage__RequirementsAssignment_3_0_2_2_0"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3179:1: rule__WBSWorkPackage__RequirementsAssignment_3_0_2_2_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__WBSWorkPackage__RequirementsAssignment_3_0_2_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3183:1: ( ( ( ruleQualifiedName ) ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3184:1: ( ( ruleQualifiedName ) )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3184:1: ( ( ruleQualifiedName ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3185:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getWBSWorkPackageAccess().getRequirementsREQNodeCrossReference_3_0_2_2_0_0()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3186:1: ( ruleQualifiedName )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3187:1: ruleQualifiedName
            {
             before(grammarAccess.getWBSWorkPackageAccess().getRequirementsREQNodeQualifiedNameParserRuleCall_3_0_2_2_0_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__WBSWorkPackage__RequirementsAssignment_3_0_2_2_06342);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getWBSWorkPackageAccess().getRequirementsREQNodeQualifiedNameParserRuleCall_3_0_2_2_0_0_1()); 

            }

             after(grammarAccess.getWBSWorkPackageAccess().getRequirementsREQNodeCrossReference_3_0_2_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSWorkPackage__RequirementsAssignment_3_0_2_2_0"


    // $ANTLR start "rule__WBSDeliverable__DescriptionAssignment_0"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3198:1: rule__WBSDeliverable__DescriptionAssignment_0 : ( RULE_ML_COMMENT ) ;
    public final void rule__WBSDeliverable__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3202:1: ( ( RULE_ML_COMMENT ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3203:1: ( RULE_ML_COMMENT )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3203:1: ( RULE_ML_COMMENT )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3204:1: RULE_ML_COMMENT
            {
             before(grammarAccess.getWBSDeliverableAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_rule__WBSDeliverable__DescriptionAssignment_06377); 
             after(grammarAccess.getWBSDeliverableAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSDeliverable__DescriptionAssignment_0"


    // $ANTLR start "rule__WBSDeliverable__NameAssignment_2"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3213:1: rule__WBSDeliverable__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__WBSDeliverable__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3217:1: ( ( RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3218:1: ( RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3218:1: ( RULE_ID )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3219:1: RULE_ID
            {
             before(grammarAccess.getWBSDeliverableAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__WBSDeliverable__NameAssignment_26408); 
             after(grammarAccess.getWBSDeliverableAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSDeliverable__NameAssignment_2"


    // $ANTLR start "rule__WBSDeliverable__WbsNodesAssignment_3_0_1"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3228:1: rule__WBSDeliverable__WbsNodesAssignment_3_0_1 : ( ruleWBSNode ) ;
    public final void rule__WBSDeliverable__WbsNodesAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3232:1: ( ( ruleWBSNode ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3233:1: ( ruleWBSNode )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3233:1: ( ruleWBSNode )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3234:1: ruleWBSNode
            {
             before(grammarAccess.getWBSDeliverableAccess().getWbsNodesWBSNodeParserRuleCall_3_0_1_0()); 
            pushFollow(FOLLOW_ruleWBSNode_in_rule__WBSDeliverable__WbsNodesAssignment_3_0_16439);
            ruleWBSNode();

            state._fsp--;

             after(grammarAccess.getWBSDeliverableAccess().getWbsNodesWBSNodeParserRuleCall_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSDeliverable__WbsNodesAssignment_3_0_1"


    // $ANTLR start "rule__WBSDeliverable__RequirementsAssignment_3_0_2_2_0"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3243:1: rule__WBSDeliverable__RequirementsAssignment_3_0_2_2_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__WBSDeliverable__RequirementsAssignment_3_0_2_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3247:1: ( ( ( ruleQualifiedName ) ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3248:1: ( ( ruleQualifiedName ) )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3248:1: ( ( ruleQualifiedName ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3249:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getWBSDeliverableAccess().getRequirementsREQNodeCrossReference_3_0_2_2_0_0()); 
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3250:1: ( ruleQualifiedName )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3251:1: ruleQualifiedName
            {
             before(grammarAccess.getWBSDeliverableAccess().getRequirementsREQNodeQualifiedNameParserRuleCall_3_0_2_2_0_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__WBSDeliverable__RequirementsAssignment_3_0_2_2_06474);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getWBSDeliverableAccess().getRequirementsREQNodeQualifiedNameParserRuleCall_3_0_2_2_0_0_1()); 

            }

             after(grammarAccess.getWBSDeliverableAccess().getRequirementsREQNodeCrossReference_3_0_2_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WBSDeliverable__RequirementsAssignment_3_0_2_2_0"


    // $ANTLR start "rule__RequirementImport__ImportURIAssignment_1"
    // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3262:1: rule__RequirementImport__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__RequirementImport__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3266:1: ( ( RULE_STRING ) )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3267:1: ( RULE_STRING )
            {
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3267:1: ( RULE_STRING )
            // ../com.lowcoupling.mdpm.lng.wbs.ui/src-gen/com/lowcoupling/mdpm/lng/wbs/ui/contentassist/antlr/internal/InternalWBS.g:3268:1: RULE_STRING
            {
             before(grammarAccess.getRequirementImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__RequirementImport__ImportURIAssignment_16509); 
             after(grammarAccess.getRequirementImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementImport__ImportURIAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleWBS_in_entryRuleWBS61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWBS68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBS__Alternatives_in_ruleWBS94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSProgram_in_entryRuleWBSProgram121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWBSProgram128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProgram__Group__0_in_ruleWBSProgram154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSProject_in_entryRuleWBSProject181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWBSProject188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProject__Group__0_in_ruleWBSProject214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSNode_in_entryRuleWBSNode241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWBSNode248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSNode__Alternatives_in_ruleWBSNode274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSActivity_in_entryRuleWBSActivity301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWBSActivity308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSActivity__Group__0_in_ruleWBSActivity334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSWorkPackage_in_entryRuleWBSWorkPackage361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWBSWorkPackage368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSWorkPackage__Group__0_in_ruleWBSWorkPackage394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSDeliverable_in_entryRuleWBSDeliverable421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWBSDeliverable428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSDeliverable__Group__0_in_ruleWBSDeliverable454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequirementImport_in_entryRuleRequirementImport541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequirementImport548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequirementImport__Group__0_in_ruleRequirementImport574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSProgram_in_rule__WBS__Alternatives610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSProject_in_rule__WBS__Alternatives627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSActivity_in_rule__WBSNode__Alternatives659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSWorkPackage_in_rule__WBSNode__Alternatives676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSDeliverable_in_rule__WBSNode__Alternatives693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSActivity__Group_3_0__0_in_rule__WBSActivity__Alternatives_3725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ENDLINE_in_rule__WBSActivity__Alternatives_3743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSWorkPackage__Group_3_0__0_in_rule__WBSWorkPackage__Alternatives_3775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ENDLINE_in_rule__WBSWorkPackage__Alternatives_3793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSDeliverable__Group_3_0__0_in_rule__WBSDeliverable__Alternatives_3825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ENDLINE_in_rule__WBSDeliverable__Alternatives_3843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProgram__Group__0__Impl_in_rule__WBSProgram__Group__0873 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__WBSProgram__Group__1_in_rule__WBSProgram__Group__0876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProgram__DescriptionAssignment_0_in_rule__WBSProgram__Group__0__Impl903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProgram__Group__1__Impl_in_rule__WBSProgram__Group__1934 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__WBSProgram__Group__2_in_rule__WBSProgram__Group__1937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__WBSProgram__Group__1__Impl965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProgram__Group__2__Impl_in_rule__WBSProgram__Group__2996 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__WBSProgram__Group__3_in_rule__WBSProgram__Group__2999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProgram__NameAssignment_2_in_rule__WBSProgram__Group__2__Impl1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProgram__Group__3__Impl_in_rule__WBSProgram__Group__31056 = new BitSet(new long[]{0x0000000000218140L});
    public static final BitSet FOLLOW_rule__WBSProgram__Group__4_in_rule__WBSProgram__Group__31059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_rule__WBSProgram__Group__3__Impl1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProgram__Group__4__Impl_in_rule__WBSProgram__Group__41115 = new BitSet(new long[]{0x0000000000218140L});
    public static final BitSet FOLLOW_rule__WBSProgram__Group__5_in_rule__WBSProgram__Group__41118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProgram__Group_4__0_in_rule__WBSProgram__Group__4__Impl1145 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__WBSProgram__Group__5__Impl_in_rule__WBSProgram__Group__51176 = new BitSet(new long[]{0x0000000000218140L});
    public static final BitSet FOLLOW_rule__WBSProgram__Group__6_in_rule__WBSProgram__Group__51179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProgram__ProjectsAssignment_5_in_rule__WBSProgram__Group__5__Impl1206 = new BitSet(new long[]{0x0000000000010102L});
    public static final BitSet FOLLOW_rule__WBSProgram__Group__6__Impl_in_rule__WBSProgram__Group__61237 = new BitSet(new long[]{0x0000000000218140L});
    public static final BitSet FOLLOW_rule__WBSProgram__Group__7_in_rule__WBSProgram__Group__61240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProgram__Group_6__0_in_rule__WBSProgram__Group__6__Impl1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProgram__Group__7__Impl_in_rule__WBSProgram__Group__71298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_rule__WBSProgram__Group__7__Impl1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProgram__Group_4__0__Impl_in_rule__WBSProgram__Group_4__01370 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__WBSProgram__Group_4__1_in_rule__WBSProgram__Group_4__01373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProgram__RequirementsModelAssignment_4_0_in_rule__WBSProgram__Group_4__0__Impl1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProgram__Group_4__1__Impl_in_rule__WBSProgram__Group_4__11430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ENDLINE_in_rule__WBSProgram__Group_4__1__Impl1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProgram__Group_6__0__Impl_in_rule__WBSProgram__Group_6__01490 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__WBSProgram__Group_6__1_in_rule__WBSProgram__Group_6__01493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__WBSProgram__Group_6__0__Impl1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProgram__Group_6__1__Impl_in_rule__WBSProgram__Group_6__11552 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__WBSProgram__Group_6__2_in_rule__WBSProgram__Group_6__11555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_rule__WBSProgram__Group_6__1__Impl1582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProgram__Group_6__2__Impl_in_rule__WBSProgram__Group_6__21611 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__WBSProgram__Group_6__3_in_rule__WBSProgram__Group_6__21614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProgram__Group_6_2__0_in_rule__WBSProgram__Group_6__2__Impl1641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProgram__Group_6__3__Impl_in_rule__WBSProgram__Group_6__31672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_rule__WBSProgram__Group_6__3__Impl1699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProgram__Group_6_2__0__Impl_in_rule__WBSProgram__Group_6_2__01736 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__WBSProgram__Group_6_2__1_in_rule__WBSProgram__Group_6_2__01739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProgram__RequirementsAssignment_6_2_0_in_rule__WBSProgram__Group_6_2__0__Impl1766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProgram__Group_6_2__1__Impl_in_rule__WBSProgram__Group_6_2__11796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ENDLINE_in_rule__WBSProgram__Group_6_2__1__Impl1823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProject__Group__0__Impl_in_rule__WBSProject__Group__01856 = new BitSet(new long[]{0x0000000000010100L});
    public static final BitSet FOLLOW_rule__WBSProject__Group__1_in_rule__WBSProject__Group__01859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProject__DescriptionAssignment_0_in_rule__WBSProject__Group__0__Impl1886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProject__Group__1__Impl_in_rule__WBSProject__Group__11917 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__WBSProject__Group__2_in_rule__WBSProject__Group__11920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__WBSProject__Group__1__Impl1948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProject__Group__2__Impl_in_rule__WBSProject__Group__21979 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__WBSProject__Group__3_in_rule__WBSProject__Group__21982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProject__NameAssignment_2_in_rule__WBSProject__Group__2__Impl2009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProject__Group__3__Impl_in_rule__WBSProject__Group__32039 = new BitSet(new long[]{0x00000000002E8140L});
    public static final BitSet FOLLOW_rule__WBSProject__Group__4_in_rule__WBSProject__Group__32042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_rule__WBSProject__Group__3__Impl2069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProject__Group__4__Impl_in_rule__WBSProject__Group__42098 = new BitSet(new long[]{0x00000000002E8140L});
    public static final BitSet FOLLOW_rule__WBSProject__Group__5_in_rule__WBSProject__Group__42101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProject__Group_4__0_in_rule__WBSProject__Group__4__Impl2128 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__WBSProject__Group__5__Impl_in_rule__WBSProject__Group__52159 = new BitSet(new long[]{0x00000000002E8140L});
    public static final BitSet FOLLOW_rule__WBSProject__Group__6_in_rule__WBSProject__Group__52162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProject__WbsNodesAssignment_5_in_rule__WBSProject__Group__5__Impl2189 = new BitSet(new long[]{0x00000000000E0102L});
    public static final BitSet FOLLOW_rule__WBSProject__Group__6__Impl_in_rule__WBSProject__Group__62220 = new BitSet(new long[]{0x00000000002E8140L});
    public static final BitSet FOLLOW_rule__WBSProject__Group__7_in_rule__WBSProject__Group__62223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProject__Group_6__0_in_rule__WBSProject__Group__6__Impl2250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProject__Group__7__Impl_in_rule__WBSProject__Group__72281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_rule__WBSProject__Group__7__Impl2308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProject__Group_4__0__Impl_in_rule__WBSProject__Group_4__02353 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__WBSProject__Group_4__1_in_rule__WBSProject__Group_4__02356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProject__RequirementsModelAssignment_4_0_in_rule__WBSProject__Group_4__0__Impl2383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProject__Group_4__1__Impl_in_rule__WBSProject__Group_4__12413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ENDLINE_in_rule__WBSProject__Group_4__1__Impl2440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProject__Group_6__0__Impl_in_rule__WBSProject__Group_6__02473 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__WBSProject__Group_6__1_in_rule__WBSProject__Group_6__02476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__WBSProject__Group_6__0__Impl2504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProject__Group_6__1__Impl_in_rule__WBSProject__Group_6__12535 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__WBSProject__Group_6__2_in_rule__WBSProject__Group_6__12538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_rule__WBSProject__Group_6__1__Impl2565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProject__Group_6__2__Impl_in_rule__WBSProject__Group_6__22594 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__WBSProject__Group_6__3_in_rule__WBSProject__Group_6__22597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProject__Group_6_2__0_in_rule__WBSProject__Group_6__2__Impl2624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProject__Group_6__3__Impl_in_rule__WBSProject__Group_6__32655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_rule__WBSProject__Group_6__3__Impl2682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProject__Group_6_2__0__Impl_in_rule__WBSProject__Group_6_2__02719 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__WBSProject__Group_6_2__1_in_rule__WBSProject__Group_6_2__02722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProject__RequirementsAssignment_6_2_0_in_rule__WBSProject__Group_6_2__0__Impl2749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSProject__Group_6_2__1__Impl_in_rule__WBSProject__Group_6_2__12779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ENDLINE_in_rule__WBSProject__Group_6_2__1__Impl2806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSActivity__Group__0__Impl_in_rule__WBSActivity__Group__02839 = new BitSet(new long[]{0x0000000000020100L});
    public static final BitSet FOLLOW_rule__WBSActivity__Group__1_in_rule__WBSActivity__Group__02842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSActivity__DescriptionAssignment_0_in_rule__WBSActivity__Group__0__Impl2869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSActivity__Group__1__Impl_in_rule__WBSActivity__Group__12900 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__WBSActivity__Group__2_in_rule__WBSActivity__Group__12903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__WBSActivity__Group__1__Impl2931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSActivity__Group__2__Impl_in_rule__WBSActivity__Group__22962 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__WBSActivity__Group__3_in_rule__WBSActivity__Group__22965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSActivity__NameAssignment_2_in_rule__WBSActivity__Group__2__Impl2992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSActivity__Group__3__Impl_in_rule__WBSActivity__Group__33022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSActivity__Alternatives_3_in_rule__WBSActivity__Group__3__Impl3049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSActivity__Group_3_0__0__Impl_in_rule__WBSActivity__Group_3_0__03087 = new BitSet(new long[]{0x00000000000E8140L});
    public static final BitSet FOLLOW_rule__WBSActivity__Group_3_0__1_in_rule__WBSActivity__Group_3_0__03090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_rule__WBSActivity__Group_3_0__0__Impl3117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSActivity__Group_3_0__1__Impl_in_rule__WBSActivity__Group_3_0__13146 = new BitSet(new long[]{0x00000000000E8140L});
    public static final BitSet FOLLOW_rule__WBSActivity__Group_3_0__2_in_rule__WBSActivity__Group_3_0__13149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSActivity__WbsNodesAssignment_3_0_1_in_rule__WBSActivity__Group_3_0__1__Impl3176 = new BitSet(new long[]{0x00000000000E0102L});
    public static final BitSet FOLLOW_rule__WBSActivity__Group_3_0__2__Impl_in_rule__WBSActivity__Group_3_0__23207 = new BitSet(new long[]{0x00000000000E8140L});
    public static final BitSet FOLLOW_rule__WBSActivity__Group_3_0__3_in_rule__WBSActivity__Group_3_0__23210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSActivity__Group_3_0_2__0_in_rule__WBSActivity__Group_3_0__2__Impl3237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSActivity__Group_3_0__3__Impl_in_rule__WBSActivity__Group_3_0__33268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_rule__WBSActivity__Group_3_0__3__Impl3295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSActivity__Group_3_0_2__0__Impl_in_rule__WBSActivity__Group_3_0_2__03332 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__WBSActivity__Group_3_0_2__1_in_rule__WBSActivity__Group_3_0_2__03335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__WBSActivity__Group_3_0_2__0__Impl3363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSActivity__Group_3_0_2__1__Impl_in_rule__WBSActivity__Group_3_0_2__13394 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__WBSActivity__Group_3_0_2__2_in_rule__WBSActivity__Group_3_0_2__13397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_rule__WBSActivity__Group_3_0_2__1__Impl3424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSActivity__Group_3_0_2__2__Impl_in_rule__WBSActivity__Group_3_0_2__23453 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__WBSActivity__Group_3_0_2__3_in_rule__WBSActivity__Group_3_0_2__23456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSActivity__Group_3_0_2_2__0_in_rule__WBSActivity__Group_3_0_2__2__Impl3483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSActivity__Group_3_0_2__3__Impl_in_rule__WBSActivity__Group_3_0_2__33514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_rule__WBSActivity__Group_3_0_2__3__Impl3541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSActivity__Group_3_0_2_2__0__Impl_in_rule__WBSActivity__Group_3_0_2_2__03578 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__WBSActivity__Group_3_0_2_2__1_in_rule__WBSActivity__Group_3_0_2_2__03581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSActivity__RequirementsAssignment_3_0_2_2_0_in_rule__WBSActivity__Group_3_0_2_2__0__Impl3608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSActivity__Group_3_0_2_2__1__Impl_in_rule__WBSActivity__Group_3_0_2_2__13638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ENDLINE_in_rule__WBSActivity__Group_3_0_2_2__1__Impl3665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSWorkPackage__Group__0__Impl_in_rule__WBSWorkPackage__Group__03698 = new BitSet(new long[]{0x0000000000040100L});
    public static final BitSet FOLLOW_rule__WBSWorkPackage__Group__1_in_rule__WBSWorkPackage__Group__03701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSWorkPackage__DescriptionAssignment_0_in_rule__WBSWorkPackage__Group__0__Impl3728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSWorkPackage__Group__1__Impl_in_rule__WBSWorkPackage__Group__13759 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__WBSWorkPackage__Group__2_in_rule__WBSWorkPackage__Group__13762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__WBSWorkPackage__Group__1__Impl3790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSWorkPackage__Group__2__Impl_in_rule__WBSWorkPackage__Group__23821 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__WBSWorkPackage__Group__3_in_rule__WBSWorkPackage__Group__23824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSWorkPackage__NameAssignment_2_in_rule__WBSWorkPackage__Group__2__Impl3851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSWorkPackage__Group__3__Impl_in_rule__WBSWorkPackage__Group__33881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSWorkPackage__Alternatives_3_in_rule__WBSWorkPackage__Group__3__Impl3908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSWorkPackage__Group_3_0__0__Impl_in_rule__WBSWorkPackage__Group_3_0__03946 = new BitSet(new long[]{0x00000000000E8140L});
    public static final BitSet FOLLOW_rule__WBSWorkPackage__Group_3_0__1_in_rule__WBSWorkPackage__Group_3_0__03949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_rule__WBSWorkPackage__Group_3_0__0__Impl3976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSWorkPackage__Group_3_0__1__Impl_in_rule__WBSWorkPackage__Group_3_0__14005 = new BitSet(new long[]{0x00000000000E8140L});
    public static final BitSet FOLLOW_rule__WBSWorkPackage__Group_3_0__2_in_rule__WBSWorkPackage__Group_3_0__14008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSWorkPackage__WbsNodesAssignment_3_0_1_in_rule__WBSWorkPackage__Group_3_0__1__Impl4035 = new BitSet(new long[]{0x00000000000E0102L});
    public static final BitSet FOLLOW_rule__WBSWorkPackage__Group_3_0__2__Impl_in_rule__WBSWorkPackage__Group_3_0__24066 = new BitSet(new long[]{0x00000000000E8140L});
    public static final BitSet FOLLOW_rule__WBSWorkPackage__Group_3_0__3_in_rule__WBSWorkPackage__Group_3_0__24069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSWorkPackage__Group_3_0_2__0_in_rule__WBSWorkPackage__Group_3_0__2__Impl4096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSWorkPackage__Group_3_0__3__Impl_in_rule__WBSWorkPackage__Group_3_0__34127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_rule__WBSWorkPackage__Group_3_0__3__Impl4154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSWorkPackage__Group_3_0_2__0__Impl_in_rule__WBSWorkPackage__Group_3_0_2__04191 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__WBSWorkPackage__Group_3_0_2__1_in_rule__WBSWorkPackage__Group_3_0_2__04194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__WBSWorkPackage__Group_3_0_2__0__Impl4222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSWorkPackage__Group_3_0_2__1__Impl_in_rule__WBSWorkPackage__Group_3_0_2__14253 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__WBSWorkPackage__Group_3_0_2__2_in_rule__WBSWorkPackage__Group_3_0_2__14256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_rule__WBSWorkPackage__Group_3_0_2__1__Impl4283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSWorkPackage__Group_3_0_2__2__Impl_in_rule__WBSWorkPackage__Group_3_0_2__24312 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__WBSWorkPackage__Group_3_0_2__3_in_rule__WBSWorkPackage__Group_3_0_2__24315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSWorkPackage__Group_3_0_2_2__0_in_rule__WBSWorkPackage__Group_3_0_2__2__Impl4342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSWorkPackage__Group_3_0_2__3__Impl_in_rule__WBSWorkPackage__Group_3_0_2__34373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_rule__WBSWorkPackage__Group_3_0_2__3__Impl4400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSWorkPackage__Group_3_0_2_2__0__Impl_in_rule__WBSWorkPackage__Group_3_0_2_2__04437 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__WBSWorkPackage__Group_3_0_2_2__1_in_rule__WBSWorkPackage__Group_3_0_2_2__04440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSWorkPackage__RequirementsAssignment_3_0_2_2_0_in_rule__WBSWorkPackage__Group_3_0_2_2__0__Impl4467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSWorkPackage__Group_3_0_2_2__1__Impl_in_rule__WBSWorkPackage__Group_3_0_2_2__14497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ENDLINE_in_rule__WBSWorkPackage__Group_3_0_2_2__1__Impl4524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSDeliverable__Group__0__Impl_in_rule__WBSDeliverable__Group__04557 = new BitSet(new long[]{0x00000000000E0100L});
    public static final BitSet FOLLOW_rule__WBSDeliverable__Group__1_in_rule__WBSDeliverable__Group__04560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSDeliverable__DescriptionAssignment_0_in_rule__WBSDeliverable__Group__0__Impl4587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSDeliverable__Group__1__Impl_in_rule__WBSDeliverable__Group__14618 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__WBSDeliverable__Group__2_in_rule__WBSDeliverable__Group__14621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__WBSDeliverable__Group__1__Impl4649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSDeliverable__Group__2__Impl_in_rule__WBSDeliverable__Group__24680 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__WBSDeliverable__Group__3_in_rule__WBSDeliverable__Group__24683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSDeliverable__NameAssignment_2_in_rule__WBSDeliverable__Group__2__Impl4710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSDeliverable__Group__3__Impl_in_rule__WBSDeliverable__Group__34740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSDeliverable__Alternatives_3_in_rule__WBSDeliverable__Group__3__Impl4767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSDeliverable__Group_3_0__0__Impl_in_rule__WBSDeliverable__Group_3_0__04805 = new BitSet(new long[]{0x00000000000E8140L});
    public static final BitSet FOLLOW_rule__WBSDeliverable__Group_3_0__1_in_rule__WBSDeliverable__Group_3_0__04808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_rule__WBSDeliverable__Group_3_0__0__Impl4835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSDeliverable__Group_3_0__1__Impl_in_rule__WBSDeliverable__Group_3_0__14864 = new BitSet(new long[]{0x00000000000E8140L});
    public static final BitSet FOLLOW_rule__WBSDeliverable__Group_3_0__2_in_rule__WBSDeliverable__Group_3_0__14867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSDeliverable__WbsNodesAssignment_3_0_1_in_rule__WBSDeliverable__Group_3_0__1__Impl4894 = new BitSet(new long[]{0x00000000000E0102L});
    public static final BitSet FOLLOW_rule__WBSDeliverable__Group_3_0__2__Impl_in_rule__WBSDeliverable__Group_3_0__24925 = new BitSet(new long[]{0x00000000000E8140L});
    public static final BitSet FOLLOW_rule__WBSDeliverable__Group_3_0__3_in_rule__WBSDeliverable__Group_3_0__24928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSDeliverable__Group_3_0_2__0_in_rule__WBSDeliverable__Group_3_0__2__Impl4955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSDeliverable__Group_3_0__3__Impl_in_rule__WBSDeliverable__Group_3_0__34986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_rule__WBSDeliverable__Group_3_0__3__Impl5013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSDeliverable__Group_3_0_2__0__Impl_in_rule__WBSDeliverable__Group_3_0_2__05050 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__WBSDeliverable__Group_3_0_2__1_in_rule__WBSDeliverable__Group_3_0_2__05053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__WBSDeliverable__Group_3_0_2__0__Impl5081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSDeliverable__Group_3_0_2__1__Impl_in_rule__WBSDeliverable__Group_3_0_2__15112 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__WBSDeliverable__Group_3_0_2__2_in_rule__WBSDeliverable__Group_3_0_2__15115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_rule__WBSDeliverable__Group_3_0_2__1__Impl5142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSDeliverable__Group_3_0_2__2__Impl_in_rule__WBSDeliverable__Group_3_0_2__25171 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__WBSDeliverable__Group_3_0_2__3_in_rule__WBSDeliverable__Group_3_0_2__25174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSDeliverable__Group_3_0_2_2__0_in_rule__WBSDeliverable__Group_3_0_2__2__Impl5201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSDeliverable__Group_3_0_2__3__Impl_in_rule__WBSDeliverable__Group_3_0_2__35232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_rule__WBSDeliverable__Group_3_0_2__3__Impl5259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSDeliverable__Group_3_0_2_2__0__Impl_in_rule__WBSDeliverable__Group_3_0_2_2__05296 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__WBSDeliverable__Group_3_0_2_2__1_in_rule__WBSDeliverable__Group_3_0_2_2__05299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSDeliverable__RequirementsAssignment_3_0_2_2_0_in_rule__WBSDeliverable__Group_3_0_2_2__0__Impl5326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSDeliverable__Group_3_0_2_2__1__Impl_in_rule__WBSDeliverable__Group_3_0_2_2__15356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ENDLINE_in_rule__WBSDeliverable__Group_3_0_2_2__1__Impl5383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__05416 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__05419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl5446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__15475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl5502 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__05537 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__05540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__QualifiedName__Group_1__0__Impl5568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__15599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl5626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequirementImport__Group__0__Impl_in_rule__RequirementImport__Group__05659 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__RequirementImport__Group__1_in_rule__RequirementImport__Group__05662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__RequirementImport__Group__0__Impl5690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequirementImport__Group__1__Impl_in_rule__RequirementImport__Group__15721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequirementImport__ImportURIAssignment_1_in_rule__RequirementImport__Group__1__Impl5748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_rule__WBSProgram__DescriptionAssignment_05787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__WBSProgram__NameAssignment_25818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequirementImport_in_rule__WBSProgram__RequirementsModelAssignment_4_05849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSProject_in_rule__WBSProgram__ProjectsAssignment_55880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__WBSProgram__RequirementsAssignment_6_2_05915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_rule__WBSProject__DescriptionAssignment_05950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__WBSProject__NameAssignment_25981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequirementImport_in_rule__WBSProject__RequirementsModelAssignment_4_06012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSNode_in_rule__WBSProject__WbsNodesAssignment_56043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__WBSProject__RequirementsAssignment_6_2_06078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_rule__WBSActivity__DescriptionAssignment_06113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__WBSActivity__NameAssignment_26144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSNode_in_rule__WBSActivity__WbsNodesAssignment_3_0_16175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__WBSActivity__RequirementsAssignment_3_0_2_2_06210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_rule__WBSWorkPackage__DescriptionAssignment_06245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__WBSWorkPackage__NameAssignment_26276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSNode_in_rule__WBSWorkPackage__WbsNodesAssignment_3_0_16307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__WBSWorkPackage__RequirementsAssignment_3_0_2_2_06342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_rule__WBSDeliverable__DescriptionAssignment_06377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__WBSDeliverable__NameAssignment_26408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSNode_in_rule__WBSDeliverable__WbsNodesAssignment_3_0_16439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__WBSDeliverable__RequirementsAssignment_3_0_2_2_06474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__RequirementImport__ImportURIAssignment_16509 = new BitSet(new long[]{0x0000000000000002L});

}