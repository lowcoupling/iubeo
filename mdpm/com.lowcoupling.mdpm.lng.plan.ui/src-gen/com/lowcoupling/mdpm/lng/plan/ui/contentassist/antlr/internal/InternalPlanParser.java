package com.lowcoupling.mdpm.lng.plan.ui.contentassist.antlr.internal; 

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
import com.lowcoupling.mdpm.lng.plan.services.PlanGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPlanParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_OPENCURLY", "RULE_CLOSEDCURLY", "RULE_ID", "RULE_ML_COMMENT", "RULE_STRING", "RULE_INT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'RESPONSIBLE'", "'ACCOUNTABLE'", "'CONSULTED'", "'INFORMED'", "'Program'", "'name'", "'project'", "'Project'", "'assumptions'", "'constraints'", "'-'", "'Group'", "'wbsActivity'", "'dependsOn'", "'wbs'", "'resources'", "'plan'", "'.'", "'CheckPoint'", "'wbsDeliverable'", "'date'", "'after'", "'offset'", "'completeness'", "'%'", "'at'", "'as'", "'Activity'", "'involves'", "'starts'", "'ends'", "'duration'"
    };
    public static final int RULE_ID=6;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=9;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=8;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int RULE_CLOSEDCURLY=5;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_OPENCURLY=4;
    public static final int RULE_WS=11;

    // delegates
    // delegators


        public InternalPlanParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPlanParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPlanParser.tokenNames; }
    public String getGrammarFileName() { return "../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g"; }


     
     	private PlanGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(PlanGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleProgram"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:60:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:61:1: ( ruleProgram EOF )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:62:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram61);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram68); 

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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:69:1: ruleProgram : ( ( rule__Program__Alternatives ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:73:2: ( ( ( rule__Program__Alternatives ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:74:1: ( ( rule__Program__Alternatives ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:74:1: ( ( rule__Program__Alternatives ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:75:1: ( rule__Program__Alternatives )
            {
             before(grammarAccess.getProgramAccess().getAlternatives()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:76:1: ( rule__Program__Alternatives )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:76:2: rule__Program__Alternatives
            {
            pushFollow(FOLLOW_rule__Program__Alternatives_in_ruleProgram94);
            rule__Program__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getAlternatives()); 

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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleProject"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:88:1: entryRuleProject : ruleProject EOF ;
    public final void entryRuleProject() throws RecognitionException {
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:89:1: ( ruleProject EOF )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:90:1: ruleProject EOF
            {
             before(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_ruleProject_in_entryRuleProject121);
            ruleProject();

            state._fsp--;

             after(grammarAccess.getProjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProject128); 

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
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:97:1: ruleProject : ( ( rule__Project__Group__0 ) ) ;
    public final void ruleProject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:101:2: ( ( ( rule__Project__Group__0 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:102:1: ( ( rule__Project__Group__0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:102:1: ( ( rule__Project__Group__0 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:103:1: ( rule__Project__Group__0 )
            {
             before(grammarAccess.getProjectAccess().getGroup()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:104:1: ( rule__Project__Group__0 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:104:2: rule__Project__Group__0
            {
            pushFollow(FOLLOW_rule__Project__Group__0_in_ruleProject154);
            rule__Project__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getGroup()); 

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
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleAssumption"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:116:1: entryRuleAssumption : ruleAssumption EOF ;
    public final void entryRuleAssumption() throws RecognitionException {
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:117:1: ( ruleAssumption EOF )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:118:1: ruleAssumption EOF
            {
             before(grammarAccess.getAssumptionRule()); 
            pushFollow(FOLLOW_ruleAssumption_in_entryRuleAssumption181);
            ruleAssumption();

            state._fsp--;

             after(grammarAccess.getAssumptionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssumption188); 

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
    // $ANTLR end "entryRuleAssumption"


    // $ANTLR start "ruleAssumption"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:125:1: ruleAssumption : ( ( rule__Assumption__Group__0 ) ) ;
    public final void ruleAssumption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:129:2: ( ( ( rule__Assumption__Group__0 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:130:1: ( ( rule__Assumption__Group__0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:130:1: ( ( rule__Assumption__Group__0 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:131:1: ( rule__Assumption__Group__0 )
            {
             before(grammarAccess.getAssumptionAccess().getGroup()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:132:1: ( rule__Assumption__Group__0 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:132:2: rule__Assumption__Group__0
            {
            pushFollow(FOLLOW_rule__Assumption__Group__0_in_ruleAssumption214);
            rule__Assumption__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssumptionAccess().getGroup()); 

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
    // $ANTLR end "ruleAssumption"


    // $ANTLR start "entryRuleConstraint"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:144:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:145:1: ( ruleConstraint EOF )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:146:1: ruleConstraint EOF
            {
             before(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint241);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint248); 

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
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:153:1: ruleConstraint : ( ( rule__Constraint__Group__0 ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:157:2: ( ( ( rule__Constraint__Group__0 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:158:1: ( ( rule__Constraint__Group__0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:158:1: ( ( rule__Constraint__Group__0 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:159:1: ( rule__Constraint__Group__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:160:1: ( rule__Constraint__Group__0 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:160:2: rule__Constraint__Group__0
            {
            pushFollow(FOLLOW_rule__Constraint__Group__0_in_ruleConstraint274);
            rule__Constraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getGroup()); 

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
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleActivityGroup"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:172:1: entryRuleActivityGroup : ruleActivityGroup EOF ;
    public final void entryRuleActivityGroup() throws RecognitionException {
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:173:1: ( ruleActivityGroup EOF )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:174:1: ruleActivityGroup EOF
            {
             before(grammarAccess.getActivityGroupRule()); 
            pushFollow(FOLLOW_ruleActivityGroup_in_entryRuleActivityGroup301);
            ruleActivityGroup();

            state._fsp--;

             after(grammarAccess.getActivityGroupRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivityGroup308); 

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
    // $ANTLR end "entryRuleActivityGroup"


    // $ANTLR start "ruleActivityGroup"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:181:1: ruleActivityGroup : ( ( rule__ActivityGroup__Group__0 ) ) ;
    public final void ruleActivityGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:185:2: ( ( ( rule__ActivityGroup__Group__0 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:186:1: ( ( rule__ActivityGroup__Group__0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:186:1: ( ( rule__ActivityGroup__Group__0 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:187:1: ( rule__ActivityGroup__Group__0 )
            {
             before(grammarAccess.getActivityGroupAccess().getGroup()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:188:1: ( rule__ActivityGroup__Group__0 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:188:2: rule__ActivityGroup__Group__0
            {
            pushFollow(FOLLOW_rule__ActivityGroup__Group__0_in_ruleActivityGroup334);
            rule__ActivityGroup__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActivityGroupAccess().getGroup()); 

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
    // $ANTLR end "ruleActivityGroup"


    // $ANTLR start "entryRuleWBSImport"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:200:1: entryRuleWBSImport : ruleWBSImport EOF ;
    public final void entryRuleWBSImport() throws RecognitionException {
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:201:1: ( ruleWBSImport EOF )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:202:1: ruleWBSImport EOF
            {
             before(grammarAccess.getWBSImportRule()); 
            pushFollow(FOLLOW_ruleWBSImport_in_entryRuleWBSImport361);
            ruleWBSImport();

            state._fsp--;

             after(grammarAccess.getWBSImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWBSImport368); 

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
    // $ANTLR end "entryRuleWBSImport"


    // $ANTLR start "ruleWBSImport"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:209:1: ruleWBSImport : ( ( rule__WBSImport__Group__0 ) ) ;
    public final void ruleWBSImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:213:2: ( ( ( rule__WBSImport__Group__0 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:214:1: ( ( rule__WBSImport__Group__0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:214:1: ( ( rule__WBSImport__Group__0 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:215:1: ( rule__WBSImport__Group__0 )
            {
             before(grammarAccess.getWBSImportAccess().getGroup()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:216:1: ( rule__WBSImport__Group__0 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:216:2: rule__WBSImport__Group__0
            {
            pushFollow(FOLLOW_rule__WBSImport__Group__0_in_ruleWBSImport394);
            rule__WBSImport__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWBSImportAccess().getGroup()); 

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
    // $ANTLR end "ruleWBSImport"


    // $ANTLR start "entryRuleResourcesImport"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:228:1: entryRuleResourcesImport : ruleResourcesImport EOF ;
    public final void entryRuleResourcesImport() throws RecognitionException {
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:229:1: ( ruleResourcesImport EOF )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:230:1: ruleResourcesImport EOF
            {
             before(grammarAccess.getResourcesImportRule()); 
            pushFollow(FOLLOW_ruleResourcesImport_in_entryRuleResourcesImport421);
            ruleResourcesImport();

            state._fsp--;

             after(grammarAccess.getResourcesImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourcesImport428); 

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
    // $ANTLR end "entryRuleResourcesImport"


    // $ANTLR start "ruleResourcesImport"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:237:1: ruleResourcesImport : ( ( rule__ResourcesImport__Group__0 ) ) ;
    public final void ruleResourcesImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:241:2: ( ( ( rule__ResourcesImport__Group__0 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:242:1: ( ( rule__ResourcesImport__Group__0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:242:1: ( ( rule__ResourcesImport__Group__0 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:243:1: ( rule__ResourcesImport__Group__0 )
            {
             before(grammarAccess.getResourcesImportAccess().getGroup()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:244:1: ( rule__ResourcesImport__Group__0 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:244:2: rule__ResourcesImport__Group__0
            {
            pushFollow(FOLLOW_rule__ResourcesImport__Group__0_in_ruleResourcesImport454);
            rule__ResourcesImport__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResourcesImportAccess().getGroup()); 

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
    // $ANTLR end "ruleResourcesImport"


    // $ANTLR start "entryRulePlanImport"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:256:1: entryRulePlanImport : rulePlanImport EOF ;
    public final void entryRulePlanImport() throws RecognitionException {
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:257:1: ( rulePlanImport EOF )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:258:1: rulePlanImport EOF
            {
             before(grammarAccess.getPlanImportRule()); 
            pushFollow(FOLLOW_rulePlanImport_in_entryRulePlanImport481);
            rulePlanImport();

            state._fsp--;

             after(grammarAccess.getPlanImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlanImport488); 

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
    // $ANTLR end "entryRulePlanImport"


    // $ANTLR start "rulePlanImport"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:265:1: rulePlanImport : ( ( rule__PlanImport__Group__0 ) ) ;
    public final void rulePlanImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:269:2: ( ( ( rule__PlanImport__Group__0 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:270:1: ( ( rule__PlanImport__Group__0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:270:1: ( ( rule__PlanImport__Group__0 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:271:1: ( rule__PlanImport__Group__0 )
            {
             before(grammarAccess.getPlanImportAccess().getGroup()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:272:1: ( rule__PlanImport__Group__0 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:272:2: rule__PlanImport__Group__0
            {
            pushFollow(FOLLOW_rule__PlanImport__Group__0_in_rulePlanImport514);
            rule__PlanImport__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlanImportAccess().getGroup()); 

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
    // $ANTLR end "rulePlanImport"


    // $ANTLR start "entryRuleQualifiedName"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:284:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:285:1: ( ruleQualifiedName EOF )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:286:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName541);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName548); 

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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:293:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:297:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:298:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:298:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:299:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:300:1: ( rule__QualifiedName__Group__0 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:300:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName574);
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


    // $ANTLR start "entryRuleActivityElement"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:314:1: entryRuleActivityElement : ruleActivityElement EOF ;
    public final void entryRuleActivityElement() throws RecognitionException {
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:315:1: ( ruleActivityElement EOF )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:316:1: ruleActivityElement EOF
            {
             before(grammarAccess.getActivityElementRule()); 
            pushFollow(FOLLOW_ruleActivityElement_in_entryRuleActivityElement603);
            ruleActivityElement();

            state._fsp--;

             after(grammarAccess.getActivityElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivityElement610); 

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
    // $ANTLR end "entryRuleActivityElement"


    // $ANTLR start "ruleActivityElement"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:323:1: ruleActivityElement : ( ( rule__ActivityElement__Alternatives ) ) ;
    public final void ruleActivityElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:327:2: ( ( ( rule__ActivityElement__Alternatives ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:328:1: ( ( rule__ActivityElement__Alternatives ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:328:1: ( ( rule__ActivityElement__Alternatives ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:329:1: ( rule__ActivityElement__Alternatives )
            {
             before(grammarAccess.getActivityElementAccess().getAlternatives()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:330:1: ( rule__ActivityElement__Alternatives )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:330:2: rule__ActivityElement__Alternatives
            {
            pushFollow(FOLLOW_rule__ActivityElement__Alternatives_in_ruleActivityElement636);
            rule__ActivityElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActivityElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleActivityElement"


    // $ANTLR start "entryRuleENDLINE"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:342:1: entryRuleENDLINE : ruleENDLINE EOF ;
    public final void entryRuleENDLINE() throws RecognitionException {
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:343:1: ( ruleENDLINE EOF )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:344:1: ruleENDLINE EOF
            {
             before(grammarAccess.getENDLINERule()); 
            pushFollow(FOLLOW_ruleENDLINE_in_entryRuleENDLINE663);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getENDLINERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleENDLINE670); 

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
    // $ANTLR end "entryRuleENDLINE"


    // $ANTLR start "ruleENDLINE"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:351:1: ruleENDLINE : ( ';' ) ;
    public final void ruleENDLINE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:355:2: ( ( ';' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:356:1: ( ';' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:356:1: ( ';' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:357:1: ';'
            {
             before(grammarAccess.getENDLINEAccess().getSemicolonKeyword()); 
            match(input,13,FOLLOW_13_in_ruleENDLINE697); 
             after(grammarAccess.getENDLINEAccess().getSemicolonKeyword()); 

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
    // $ANTLR end "ruleENDLINE"


    // $ANTLR start "entryRuleCheckPoint"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:372:1: entryRuleCheckPoint : ruleCheckPoint EOF ;
    public final void entryRuleCheckPoint() throws RecognitionException {
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:373:1: ( ruleCheckPoint EOF )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:374:1: ruleCheckPoint EOF
            {
             before(grammarAccess.getCheckPointRule()); 
            pushFollow(FOLLOW_ruleCheckPoint_in_entryRuleCheckPoint725);
            ruleCheckPoint();

            state._fsp--;

             after(grammarAccess.getCheckPointRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckPoint732); 

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
    // $ANTLR end "entryRuleCheckPoint"


    // $ANTLR start "ruleCheckPoint"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:381:1: ruleCheckPoint : ( ( rule__CheckPoint__UnorderedGroup ) ) ;
    public final void ruleCheckPoint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:385:2: ( ( ( rule__CheckPoint__UnorderedGroup ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:386:1: ( ( rule__CheckPoint__UnorderedGroup ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:386:1: ( ( rule__CheckPoint__UnorderedGroup ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:387:1: ( rule__CheckPoint__UnorderedGroup )
            {
             before(grammarAccess.getCheckPointAccess().getUnorderedGroup()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:388:1: ( rule__CheckPoint__UnorderedGroup )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:388:2: rule__CheckPoint__UnorderedGroup
            {
            pushFollow(FOLLOW_rule__CheckPoint__UnorderedGroup_in_ruleCheckPoint758);
            rule__CheckPoint__UnorderedGroup();

            state._fsp--;


            }

             after(grammarAccess.getCheckPointAccess().getUnorderedGroup()); 

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
    // $ANTLR end "ruleCheckPoint"


    // $ANTLR start "entryRuleResourceInvolvement"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:400:1: entryRuleResourceInvolvement : ruleResourceInvolvement EOF ;
    public final void entryRuleResourceInvolvement() throws RecognitionException {
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:401:1: ( ruleResourceInvolvement EOF )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:402:1: ruleResourceInvolvement EOF
            {
             before(grammarAccess.getResourceInvolvementRule()); 
            pushFollow(FOLLOW_ruleResourceInvolvement_in_entryRuleResourceInvolvement785);
            ruleResourceInvolvement();

            state._fsp--;

             after(grammarAccess.getResourceInvolvementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceInvolvement792); 

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
    // $ANTLR end "entryRuleResourceInvolvement"


    // $ANTLR start "ruleResourceInvolvement"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:409:1: ruleResourceInvolvement : ( ( rule__ResourceInvolvement__Group__0 ) ) ;
    public final void ruleResourceInvolvement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:413:2: ( ( ( rule__ResourceInvolvement__Group__0 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:414:1: ( ( rule__ResourceInvolvement__Group__0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:414:1: ( ( rule__ResourceInvolvement__Group__0 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:415:1: ( rule__ResourceInvolvement__Group__0 )
            {
             before(grammarAccess.getResourceInvolvementAccess().getGroup()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:416:1: ( rule__ResourceInvolvement__Group__0 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:416:2: rule__ResourceInvolvement__Group__0
            {
            pushFollow(FOLLOW_rule__ResourceInvolvement__Group__0_in_ruleResourceInvolvement818);
            rule__ResourceInvolvement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResourceInvolvementAccess().getGroup()); 

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
    // $ANTLR end "ruleResourceInvolvement"


    // $ANTLR start "entryRuleActivity"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:428:1: entryRuleActivity : ruleActivity EOF ;
    public final void entryRuleActivity() throws RecognitionException {
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:429:1: ( ruleActivity EOF )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:430:1: ruleActivity EOF
            {
             before(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_ruleActivity_in_entryRuleActivity845);
            ruleActivity();

            state._fsp--;

             after(grammarAccess.getActivityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivity852); 

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
    // $ANTLR end "entryRuleActivity"


    // $ANTLR start "ruleActivity"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:437:1: ruleActivity : ( ( rule__Activity__Group__0 ) ) ;
    public final void ruleActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:441:2: ( ( ( rule__Activity__Group__0 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:442:1: ( ( rule__Activity__Group__0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:442:1: ( ( rule__Activity__Group__0 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:443:1: ( rule__Activity__Group__0 )
            {
             before(grammarAccess.getActivityAccess().getGroup()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:444:1: ( rule__Activity__Group__0 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:444:2: rule__Activity__Group__0
            {
            pushFollow(FOLLOW_rule__Activity__Group__0_in_ruleActivity878);
            rule__Activity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getGroup()); 

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
    // $ANTLR end "ruleActivity"


    // $ANTLR start "ruleResponsibility"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:459:1: ruleResponsibility : ( ( rule__Responsibility__Alternatives ) ) ;
    public final void ruleResponsibility() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:463:1: ( ( ( rule__Responsibility__Alternatives ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:464:1: ( ( rule__Responsibility__Alternatives ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:464:1: ( ( rule__Responsibility__Alternatives ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:465:1: ( rule__Responsibility__Alternatives )
            {
             before(grammarAccess.getResponsibilityAccess().getAlternatives()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:466:1: ( rule__Responsibility__Alternatives )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:466:2: rule__Responsibility__Alternatives
            {
            pushFollow(FOLLOW_rule__Responsibility__Alternatives_in_ruleResponsibility917);
            rule__Responsibility__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getResponsibilityAccess().getAlternatives()); 

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
    // $ANTLR end "ruleResponsibility"


    // $ANTLR start "rule__Program__Alternatives"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:477:1: rule__Program__Alternatives : ( ( ( rule__Program__Group_0__0 ) ) | ( ( rule__Program__ProjectsAssignment_1 ) ) );
    public final void rule__Program__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:481:1: ( ( ( rule__Program__Group_0__0 ) ) | ( ( rule__Program__ProjectsAssignment_1 ) ) )
            int alt1=2;
            switch ( input.LA(1) ) {
            case RULE_ML_COMMENT:
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==18) ) {
                    alt1=1;
                }
                else if ( (LA1_1==21) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case 18:
                {
                alt1=1;
                }
                break;
            case 21:
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
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:482:1: ( ( rule__Program__Group_0__0 ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:482:1: ( ( rule__Program__Group_0__0 ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:483:1: ( rule__Program__Group_0__0 )
                    {
                     before(grammarAccess.getProgramAccess().getGroup_0()); 
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:484:1: ( rule__Program__Group_0__0 )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:484:2: rule__Program__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Program__Group_0__0_in_rule__Program__Alternatives952);
                    rule__Program__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProgramAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:488:6: ( ( rule__Program__ProjectsAssignment_1 ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:488:6: ( ( rule__Program__ProjectsAssignment_1 ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:489:1: ( rule__Program__ProjectsAssignment_1 )
                    {
                     before(grammarAccess.getProgramAccess().getProjectsAssignment_1()); 
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:490:1: ( rule__Program__ProjectsAssignment_1 )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:490:2: rule__Program__ProjectsAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Program__ProjectsAssignment_1_in_rule__Program__Alternatives970);
                    rule__Program__ProjectsAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getProgramAccess().getProjectsAssignment_1()); 

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
    // $ANTLR end "rule__Program__Alternatives"


    // $ANTLR start "rule__ActivityElement__Alternatives"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:499:1: rule__ActivityElement__Alternatives : ( ( ruleActivity ) | ( ruleCheckPoint ) | ( ruleActivityGroup ) );
    public final void rule__ActivityElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:503:1: ( ( ruleActivity ) | ( ruleCheckPoint ) | ( ruleActivityGroup ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_ML_COMMENT:
                {
                switch ( input.LA(2) ) {
                case 41:
                    {
                    alt2=1;
                    }
                    break;
                case 25:
                    {
                    alt2=3;
                    }
                    break;
                case 32:
                    {
                    alt2=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }

                }
                break;
            case 41:
                {
                alt2=1;
                }
                break;
            case 32:
            case 34:
            case 35:
            case 37:
                {
                alt2=2;
                }
                break;
            case 25:
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
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:504:1: ( ruleActivity )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:504:1: ( ruleActivity )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:505:1: ruleActivity
                    {
                     before(grammarAccess.getActivityElementAccess().getActivityParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleActivity_in_rule__ActivityElement__Alternatives1003);
                    ruleActivity();

                    state._fsp--;

                     after(grammarAccess.getActivityElementAccess().getActivityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:510:6: ( ruleCheckPoint )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:510:6: ( ruleCheckPoint )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:511:1: ruleCheckPoint
                    {
                     before(grammarAccess.getActivityElementAccess().getCheckPointParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCheckPoint_in_rule__ActivityElement__Alternatives1020);
                    ruleCheckPoint();

                    state._fsp--;

                     after(grammarAccess.getActivityElementAccess().getCheckPointParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:516:6: ( ruleActivityGroup )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:516:6: ( ruleActivityGroup )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:517:1: ruleActivityGroup
                    {
                     before(grammarAccess.getActivityElementAccess().getActivityGroupParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleActivityGroup_in_rule__ActivityElement__Alternatives1037);
                    ruleActivityGroup();

                    state._fsp--;

                     after(grammarAccess.getActivityElementAccess().getActivityGroupParserRuleCall_2()); 

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
    // $ANTLR end "rule__ActivityElement__Alternatives"


    // $ANTLR start "rule__CheckPoint__Alternatives_1_0_0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:527:1: rule__CheckPoint__Alternatives_1_0_0 : ( ( ( rule__CheckPoint__Group_1_0_0_0__0 ) ) | ( ( rule__CheckPoint__Group_1_0_0_1__0 ) ) );
    public final void rule__CheckPoint__Alternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:531:1: ( ( ( rule__CheckPoint__Group_1_0_0_0__0 ) ) | ( ( rule__CheckPoint__Group_1_0_0_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==34) ) {
                alt3=1;
            }
            else if ( (LA3_0==35) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:532:1: ( ( rule__CheckPoint__Group_1_0_0_0__0 ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:532:1: ( ( rule__CheckPoint__Group_1_0_0_0__0 ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:533:1: ( rule__CheckPoint__Group_1_0_0_0__0 )
                    {
                     before(grammarAccess.getCheckPointAccess().getGroup_1_0_0_0()); 
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:534:1: ( rule__CheckPoint__Group_1_0_0_0__0 )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:534:2: rule__CheckPoint__Group_1_0_0_0__0
                    {
                    pushFollow(FOLLOW_rule__CheckPoint__Group_1_0_0_0__0_in_rule__CheckPoint__Alternatives_1_0_01069);
                    rule__CheckPoint__Group_1_0_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCheckPointAccess().getGroup_1_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:538:6: ( ( rule__CheckPoint__Group_1_0_0_1__0 ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:538:6: ( ( rule__CheckPoint__Group_1_0_0_1__0 ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:539:1: ( rule__CheckPoint__Group_1_0_0_1__0 )
                    {
                     before(grammarAccess.getCheckPointAccess().getGroup_1_0_0_1()); 
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:540:1: ( rule__CheckPoint__Group_1_0_0_1__0 )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:540:2: rule__CheckPoint__Group_1_0_0_1__0
                    {
                    pushFollow(FOLLOW_rule__CheckPoint__Group_1_0_0_1__0_in_rule__CheckPoint__Alternatives_1_0_01087);
                    rule__CheckPoint__Group_1_0_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCheckPointAccess().getGroup_1_0_0_1()); 

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
    // $ANTLR end "rule__CheckPoint__Alternatives_1_0_0"


    // $ANTLR start "rule__Activity__Alternatives_7_0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:549:1: rule__Activity__Alternatives_7_0 : ( ( ( rule__Activity__Group_7_0_0__0 ) ) | ( ( rule__Activity__Group_7_0_1__0 ) ) );
    public final void rule__Activity__Alternatives_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:553:1: ( ( ( rule__Activity__Group_7_0_0__0 ) ) | ( ( rule__Activity__Group_7_0_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==43) ) {
                alt4=1;
            }
            else if ( (LA4_0==35) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:554:1: ( ( rule__Activity__Group_7_0_0__0 ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:554:1: ( ( rule__Activity__Group_7_0_0__0 ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:555:1: ( rule__Activity__Group_7_0_0__0 )
                    {
                     before(grammarAccess.getActivityAccess().getGroup_7_0_0()); 
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:556:1: ( rule__Activity__Group_7_0_0__0 )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:556:2: rule__Activity__Group_7_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_7_0_0__0_in_rule__Activity__Alternatives_7_01120);
                    rule__Activity__Group_7_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActivityAccess().getGroup_7_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:560:6: ( ( rule__Activity__Group_7_0_1__0 ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:560:6: ( ( rule__Activity__Group_7_0_1__0 ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:561:1: ( rule__Activity__Group_7_0_1__0 )
                    {
                     before(grammarAccess.getActivityAccess().getGroup_7_0_1()); 
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:562:1: ( rule__Activity__Group_7_0_1__0 )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:562:2: rule__Activity__Group_7_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_7_0_1__0_in_rule__Activity__Alternatives_7_01138);
                    rule__Activity__Group_7_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActivityAccess().getGroup_7_0_1()); 

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
    // $ANTLR end "rule__Activity__Alternatives_7_0"


    // $ANTLR start "rule__Activity__Alternatives_7_1_0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:571:1: rule__Activity__Alternatives_7_1_0 : ( ( ( rule__Activity__Group_7_1_0_0__0 ) ) | ( ( rule__Activity__Group_7_1_0_1__0 ) ) );
    public final void rule__Activity__Alternatives_7_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:575:1: ( ( ( rule__Activity__Group_7_1_0_0__0 ) ) | ( ( rule__Activity__Group_7_1_0_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==44) ) {
                alt5=1;
            }
            else if ( (LA5_0==45) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:576:1: ( ( rule__Activity__Group_7_1_0_0__0 ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:576:1: ( ( rule__Activity__Group_7_1_0_0__0 ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:577:1: ( rule__Activity__Group_7_1_0_0__0 )
                    {
                     before(grammarAccess.getActivityAccess().getGroup_7_1_0_0()); 
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:578:1: ( rule__Activity__Group_7_1_0_0__0 )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:578:2: rule__Activity__Group_7_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_7_1_0_0__0_in_rule__Activity__Alternatives_7_1_01171);
                    rule__Activity__Group_7_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActivityAccess().getGroup_7_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:582:6: ( ( rule__Activity__Group_7_1_0_1__0 ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:582:6: ( ( rule__Activity__Group_7_1_0_1__0 ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:583:1: ( rule__Activity__Group_7_1_0_1__0 )
                    {
                     before(grammarAccess.getActivityAccess().getGroup_7_1_0_1()); 
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:584:1: ( rule__Activity__Group_7_1_0_1__0 )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:584:2: rule__Activity__Group_7_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_7_1_0_1__0_in_rule__Activity__Alternatives_7_1_01189);
                    rule__Activity__Group_7_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActivityAccess().getGroup_7_1_0_1()); 

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
    // $ANTLR end "rule__Activity__Alternatives_7_1_0"


    // $ANTLR start "rule__Responsibility__Alternatives"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:593:1: rule__Responsibility__Alternatives : ( ( ( 'RESPONSIBLE' ) ) | ( ( 'ACCOUNTABLE' ) ) | ( ( 'CONSULTED' ) ) | ( ( 'INFORMED' ) ) );
    public final void rule__Responsibility__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:597:1: ( ( ( 'RESPONSIBLE' ) ) | ( ( 'ACCOUNTABLE' ) ) | ( ( 'CONSULTED' ) ) | ( ( 'INFORMED' ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt6=1;
                }
                break;
            case 15:
                {
                alt6=2;
                }
                break;
            case 16:
                {
                alt6=3;
                }
                break;
            case 17:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:598:1: ( ( 'RESPONSIBLE' ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:598:1: ( ( 'RESPONSIBLE' ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:599:1: ( 'RESPONSIBLE' )
                    {
                     before(grammarAccess.getResponsibilityAccess().getRESPONSIBLEEnumLiteralDeclaration_0()); 
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:600:1: ( 'RESPONSIBLE' )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:600:3: 'RESPONSIBLE'
                    {
                    match(input,14,FOLLOW_14_in_rule__Responsibility__Alternatives1223); 

                    }

                     after(grammarAccess.getResponsibilityAccess().getRESPONSIBLEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:605:6: ( ( 'ACCOUNTABLE' ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:605:6: ( ( 'ACCOUNTABLE' ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:606:1: ( 'ACCOUNTABLE' )
                    {
                     before(grammarAccess.getResponsibilityAccess().getACCOUNTABLEEnumLiteralDeclaration_1()); 
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:607:1: ( 'ACCOUNTABLE' )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:607:3: 'ACCOUNTABLE'
                    {
                    match(input,15,FOLLOW_15_in_rule__Responsibility__Alternatives1244); 

                    }

                     after(grammarAccess.getResponsibilityAccess().getACCOUNTABLEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:612:6: ( ( 'CONSULTED' ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:612:6: ( ( 'CONSULTED' ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:613:1: ( 'CONSULTED' )
                    {
                     before(grammarAccess.getResponsibilityAccess().getCONSULTEDEnumLiteralDeclaration_2()); 
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:614:1: ( 'CONSULTED' )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:614:3: 'CONSULTED'
                    {
                    match(input,16,FOLLOW_16_in_rule__Responsibility__Alternatives1265); 

                    }

                     after(grammarAccess.getResponsibilityAccess().getCONSULTEDEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:619:6: ( ( 'INFORMED' ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:619:6: ( ( 'INFORMED' ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:620:1: ( 'INFORMED' )
                    {
                     before(grammarAccess.getResponsibilityAccess().getINFORMEDEnumLiteralDeclaration_3()); 
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:621:1: ( 'INFORMED' )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:621:3: 'INFORMED'
                    {
                    match(input,17,FOLLOW_17_in_rule__Responsibility__Alternatives1286); 

                    }

                     after(grammarAccess.getResponsibilityAccess().getINFORMEDEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__Responsibility__Alternatives"


    // $ANTLR start "rule__Program__Group_0__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:633:1: rule__Program__Group_0__0 : rule__Program__Group_0__0__Impl rule__Program__Group_0__1 ;
    public final void rule__Program__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:637:1: ( rule__Program__Group_0__0__Impl rule__Program__Group_0__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:638:2: rule__Program__Group_0__0__Impl rule__Program__Group_0__1
            {
            pushFollow(FOLLOW_rule__Program__Group_0__0__Impl_in_rule__Program__Group_0__01319);
            rule__Program__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group_0__1_in_rule__Program__Group_0__01322);
            rule__Program__Group_0__1();

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
    // $ANTLR end "rule__Program__Group_0__0"


    // $ANTLR start "rule__Program__Group_0__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:645:1: rule__Program__Group_0__0__Impl : ( ( rule__Program__DescriptionAssignment_0_0 )? ) ;
    public final void rule__Program__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:649:1: ( ( ( rule__Program__DescriptionAssignment_0_0 )? ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:650:1: ( ( rule__Program__DescriptionAssignment_0_0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:650:1: ( ( rule__Program__DescriptionAssignment_0_0 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:651:1: ( rule__Program__DescriptionAssignment_0_0 )?
            {
             before(grammarAccess.getProgramAccess().getDescriptionAssignment_0_0()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:652:1: ( rule__Program__DescriptionAssignment_0_0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ML_COMMENT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:652:2: rule__Program__DescriptionAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__Program__DescriptionAssignment_0_0_in_rule__Program__Group_0__0__Impl1349);
                    rule__Program__DescriptionAssignment_0_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProgramAccess().getDescriptionAssignment_0_0()); 

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
    // $ANTLR end "rule__Program__Group_0__0__Impl"


    // $ANTLR start "rule__Program__Group_0__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:662:1: rule__Program__Group_0__1 : rule__Program__Group_0__1__Impl ;
    public final void rule__Program__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:666:1: ( rule__Program__Group_0__1__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:667:2: rule__Program__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group_0__1__Impl_in_rule__Program__Group_0__11380);
            rule__Program__Group_0__1__Impl();

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
    // $ANTLR end "rule__Program__Group_0__1"


    // $ANTLR start "rule__Program__Group_0__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:673:1: rule__Program__Group_0__1__Impl : ( ( rule__Program__Group_0_1__0 ) ) ;
    public final void rule__Program__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:677:1: ( ( ( rule__Program__Group_0_1__0 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:678:1: ( ( rule__Program__Group_0_1__0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:678:1: ( ( rule__Program__Group_0_1__0 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:679:1: ( rule__Program__Group_0_1__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup_0_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:680:1: ( rule__Program__Group_0_1__0 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:680:2: rule__Program__Group_0_1__0
            {
            pushFollow(FOLLOW_rule__Program__Group_0_1__0_in_rule__Program__Group_0__1__Impl1407);
            rule__Program__Group_0_1__0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getGroup_0_1()); 

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
    // $ANTLR end "rule__Program__Group_0__1__Impl"


    // $ANTLR start "rule__Program__Group_0_1__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:694:1: rule__Program__Group_0_1__0 : rule__Program__Group_0_1__0__Impl rule__Program__Group_0_1__1 ;
    public final void rule__Program__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:698:1: ( rule__Program__Group_0_1__0__Impl rule__Program__Group_0_1__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:699:2: rule__Program__Group_0_1__0__Impl rule__Program__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__Program__Group_0_1__0__Impl_in_rule__Program__Group_0_1__01441);
            rule__Program__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group_0_1__1_in_rule__Program__Group_0_1__01444);
            rule__Program__Group_0_1__1();

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
    // $ANTLR end "rule__Program__Group_0_1__0"


    // $ANTLR start "rule__Program__Group_0_1__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:706:1: rule__Program__Group_0_1__0__Impl : ( 'Program' ) ;
    public final void rule__Program__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:710:1: ( ( 'Program' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:711:1: ( 'Program' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:711:1: ( 'Program' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:712:1: 'Program'
            {
             before(grammarAccess.getProgramAccess().getProgramKeyword_0_1_0()); 
            match(input,18,FOLLOW_18_in_rule__Program__Group_0_1__0__Impl1472); 
             after(grammarAccess.getProgramAccess().getProgramKeyword_0_1_0()); 

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
    // $ANTLR end "rule__Program__Group_0_1__0__Impl"


    // $ANTLR start "rule__Program__Group_0_1__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:725:1: rule__Program__Group_0_1__1 : rule__Program__Group_0_1__1__Impl rule__Program__Group_0_1__2 ;
    public final void rule__Program__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:729:1: ( rule__Program__Group_0_1__1__Impl rule__Program__Group_0_1__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:730:2: rule__Program__Group_0_1__1__Impl rule__Program__Group_0_1__2
            {
            pushFollow(FOLLOW_rule__Program__Group_0_1__1__Impl_in_rule__Program__Group_0_1__11503);
            rule__Program__Group_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group_0_1__2_in_rule__Program__Group_0_1__11506);
            rule__Program__Group_0_1__2();

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
    // $ANTLR end "rule__Program__Group_0_1__1"


    // $ANTLR start "rule__Program__Group_0_1__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:737:1: rule__Program__Group_0_1__1__Impl : ( ( rule__Program__NameAssignment_0_1_1 ) ) ;
    public final void rule__Program__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:741:1: ( ( ( rule__Program__NameAssignment_0_1_1 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:742:1: ( ( rule__Program__NameAssignment_0_1_1 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:742:1: ( ( rule__Program__NameAssignment_0_1_1 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:743:1: ( rule__Program__NameAssignment_0_1_1 )
            {
             before(grammarAccess.getProgramAccess().getNameAssignment_0_1_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:744:1: ( rule__Program__NameAssignment_0_1_1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:744:2: rule__Program__NameAssignment_0_1_1
            {
            pushFollow(FOLLOW_rule__Program__NameAssignment_0_1_1_in_rule__Program__Group_0_1__1__Impl1533);
            rule__Program__NameAssignment_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getNameAssignment_0_1_1()); 

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
    // $ANTLR end "rule__Program__Group_0_1__1__Impl"


    // $ANTLR start "rule__Program__Group_0_1__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:754:1: rule__Program__Group_0_1__2 : rule__Program__Group_0_1__2__Impl rule__Program__Group_0_1__3 ;
    public final void rule__Program__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:758:1: ( rule__Program__Group_0_1__2__Impl rule__Program__Group_0_1__3 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:759:2: rule__Program__Group_0_1__2__Impl rule__Program__Group_0_1__3
            {
            pushFollow(FOLLOW_rule__Program__Group_0_1__2__Impl_in_rule__Program__Group_0_1__21563);
            rule__Program__Group_0_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group_0_1__3_in_rule__Program__Group_0_1__21566);
            rule__Program__Group_0_1__3();

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
    // $ANTLR end "rule__Program__Group_0_1__2"


    // $ANTLR start "rule__Program__Group_0_1__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:766:1: rule__Program__Group_0_1__2__Impl : ( RULE_OPENCURLY ) ;
    public final void rule__Program__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:770:1: ( ( RULE_OPENCURLY ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:771:1: ( RULE_OPENCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:771:1: ( RULE_OPENCURLY )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:772:1: RULE_OPENCURLY
            {
             before(grammarAccess.getProgramAccess().getOPENCURLYTerminalRuleCall_0_1_2()); 
            match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_rule__Program__Group_0_1__2__Impl1593); 
             after(grammarAccess.getProgramAccess().getOPENCURLYTerminalRuleCall_0_1_2()); 

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
    // $ANTLR end "rule__Program__Group_0_1__2__Impl"


    // $ANTLR start "rule__Program__Group_0_1__3"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:783:1: rule__Program__Group_0_1__3 : rule__Program__Group_0_1__3__Impl rule__Program__Group_0_1__4 ;
    public final void rule__Program__Group_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:787:1: ( rule__Program__Group_0_1__3__Impl rule__Program__Group_0_1__4 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:788:2: rule__Program__Group_0_1__3__Impl rule__Program__Group_0_1__4
            {
            pushFollow(FOLLOW_rule__Program__Group_0_1__3__Impl_in_rule__Program__Group_0_1__31622);
            rule__Program__Group_0_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group_0_1__4_in_rule__Program__Group_0_1__31625);
            rule__Program__Group_0_1__4();

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
    // $ANTLR end "rule__Program__Group_0_1__3"


    // $ANTLR start "rule__Program__Group_0_1__3__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:795:1: rule__Program__Group_0_1__3__Impl : ( ( rule__Program__Group_0_1_3__0 )? ) ;
    public final void rule__Program__Group_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:799:1: ( ( ( rule__Program__Group_0_1_3__0 )? ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:800:1: ( ( rule__Program__Group_0_1_3__0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:800:1: ( ( rule__Program__Group_0_1_3__0 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:801:1: ( rule__Program__Group_0_1_3__0 )?
            {
             before(grammarAccess.getProgramAccess().getGroup_0_1_3()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:802:1: ( rule__Program__Group_0_1_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:802:2: rule__Program__Group_0_1_3__0
                    {
                    pushFollow(FOLLOW_rule__Program__Group_0_1_3__0_in_rule__Program__Group_0_1__3__Impl1652);
                    rule__Program__Group_0_1_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProgramAccess().getGroup_0_1_3()); 

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
    // $ANTLR end "rule__Program__Group_0_1__3__Impl"


    // $ANTLR start "rule__Program__Group_0_1__4"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:812:1: rule__Program__Group_0_1__4 : rule__Program__Group_0_1__4__Impl rule__Program__Group_0_1__5 ;
    public final void rule__Program__Group_0_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:816:1: ( rule__Program__Group_0_1__4__Impl rule__Program__Group_0_1__5 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:817:2: rule__Program__Group_0_1__4__Impl rule__Program__Group_0_1__5
            {
            pushFollow(FOLLOW_rule__Program__Group_0_1__4__Impl_in_rule__Program__Group_0_1__41683);
            rule__Program__Group_0_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group_0_1__5_in_rule__Program__Group_0_1__41686);
            rule__Program__Group_0_1__5();

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
    // $ANTLR end "rule__Program__Group_0_1__4"


    // $ANTLR start "rule__Program__Group_0_1__4__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:824:1: rule__Program__Group_0_1__4__Impl : ( ( rule__Program__Group_0_1_4__0 )* ) ;
    public final void rule__Program__Group_0_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:828:1: ( ( ( rule__Program__Group_0_1_4__0 )* ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:829:1: ( ( rule__Program__Group_0_1_4__0 )* )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:829:1: ( ( rule__Program__Group_0_1_4__0 )* )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:830:1: ( rule__Program__Group_0_1_4__0 )*
            {
             before(grammarAccess.getProgramAccess().getGroup_0_1_4()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:831:1: ( rule__Program__Group_0_1_4__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==30) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:831:2: rule__Program__Group_0_1_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Program__Group_0_1_4__0_in_rule__Program__Group_0_1__4__Impl1713);
            	    rule__Program__Group_0_1_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getGroup_0_1_4()); 

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
    // $ANTLR end "rule__Program__Group_0_1__4__Impl"


    // $ANTLR start "rule__Program__Group_0_1__5"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:841:1: rule__Program__Group_0_1__5 : rule__Program__Group_0_1__5__Impl rule__Program__Group_0_1__6 ;
    public final void rule__Program__Group_0_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:845:1: ( rule__Program__Group_0_1__5__Impl rule__Program__Group_0_1__6 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:846:2: rule__Program__Group_0_1__5__Impl rule__Program__Group_0_1__6
            {
            pushFollow(FOLLOW_rule__Program__Group_0_1__5__Impl_in_rule__Program__Group_0_1__51744);
            rule__Program__Group_0_1__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group_0_1__6_in_rule__Program__Group_0_1__51747);
            rule__Program__Group_0_1__6();

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
    // $ANTLR end "rule__Program__Group_0_1__5"


    // $ANTLR start "rule__Program__Group_0_1__5__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:853:1: rule__Program__Group_0_1__5__Impl : ( ( rule__Program__Group_0_1_5__0 )* ) ;
    public final void rule__Program__Group_0_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:857:1: ( ( ( rule__Program__Group_0_1_5__0 )* ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:858:1: ( ( rule__Program__Group_0_1_5__0 )* )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:858:1: ( ( rule__Program__Group_0_1_5__0 )* )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:859:1: ( rule__Program__Group_0_1_5__0 )*
            {
             before(grammarAccess.getProgramAccess().getGroup_0_1_5()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:860:1: ( rule__Program__Group_0_1_5__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==20) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:860:2: rule__Program__Group_0_1_5__0
            	    {
            	    pushFollow(FOLLOW_rule__Program__Group_0_1_5__0_in_rule__Program__Group_0_1__5__Impl1774);
            	    rule__Program__Group_0_1_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getGroup_0_1_5()); 

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
    // $ANTLR end "rule__Program__Group_0_1__5__Impl"


    // $ANTLR start "rule__Program__Group_0_1__6"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:870:1: rule__Program__Group_0_1__6 : rule__Program__Group_0_1__6__Impl rule__Program__Group_0_1__7 ;
    public final void rule__Program__Group_0_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:874:1: ( rule__Program__Group_0_1__6__Impl rule__Program__Group_0_1__7 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:875:2: rule__Program__Group_0_1__6__Impl rule__Program__Group_0_1__7
            {
            pushFollow(FOLLOW_rule__Program__Group_0_1__6__Impl_in_rule__Program__Group_0_1__61805);
            rule__Program__Group_0_1__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group_0_1__7_in_rule__Program__Group_0_1__61808);
            rule__Program__Group_0_1__7();

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
    // $ANTLR end "rule__Program__Group_0_1__6"


    // $ANTLR start "rule__Program__Group_0_1__6__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:882:1: rule__Program__Group_0_1__6__Impl : ( ( rule__Program__ProjectsAssignment_0_1_6 )* ) ;
    public final void rule__Program__Group_0_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:886:1: ( ( ( rule__Program__ProjectsAssignment_0_1_6 )* ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:887:1: ( ( rule__Program__ProjectsAssignment_0_1_6 )* )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:887:1: ( ( rule__Program__ProjectsAssignment_0_1_6 )* )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:888:1: ( rule__Program__ProjectsAssignment_0_1_6 )*
            {
             before(grammarAccess.getProgramAccess().getProjectsAssignment_0_1_6()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:889:1: ( rule__Program__ProjectsAssignment_0_1_6 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ML_COMMENT||LA11_0==21) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:889:2: rule__Program__ProjectsAssignment_0_1_6
            	    {
            	    pushFollow(FOLLOW_rule__Program__ProjectsAssignment_0_1_6_in_rule__Program__Group_0_1__6__Impl1835);
            	    rule__Program__ProjectsAssignment_0_1_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getProjectsAssignment_0_1_6()); 

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
    // $ANTLR end "rule__Program__Group_0_1__6__Impl"


    // $ANTLR start "rule__Program__Group_0_1__7"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:899:1: rule__Program__Group_0_1__7 : rule__Program__Group_0_1__7__Impl ;
    public final void rule__Program__Group_0_1__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:903:1: ( rule__Program__Group_0_1__7__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:904:2: rule__Program__Group_0_1__7__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group_0_1__7__Impl_in_rule__Program__Group_0_1__71866);
            rule__Program__Group_0_1__7__Impl();

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
    // $ANTLR end "rule__Program__Group_0_1__7"


    // $ANTLR start "rule__Program__Group_0_1__7__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:910:1: rule__Program__Group_0_1__7__Impl : ( RULE_CLOSEDCURLY ) ;
    public final void rule__Program__Group_0_1__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:914:1: ( ( RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:915:1: ( RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:915:1: ( RULE_CLOSEDCURLY )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:916:1: RULE_CLOSEDCURLY
            {
             before(grammarAccess.getProgramAccess().getCLOSEDCURLYTerminalRuleCall_0_1_7()); 
            match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_rule__Program__Group_0_1__7__Impl1893); 
             after(grammarAccess.getProgramAccess().getCLOSEDCURLYTerminalRuleCall_0_1_7()); 

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
    // $ANTLR end "rule__Program__Group_0_1__7__Impl"


    // $ANTLR start "rule__Program__Group_0_1_3__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:943:1: rule__Program__Group_0_1_3__0 : rule__Program__Group_0_1_3__0__Impl rule__Program__Group_0_1_3__1 ;
    public final void rule__Program__Group_0_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:947:1: ( rule__Program__Group_0_1_3__0__Impl rule__Program__Group_0_1_3__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:948:2: rule__Program__Group_0_1_3__0__Impl rule__Program__Group_0_1_3__1
            {
            pushFollow(FOLLOW_rule__Program__Group_0_1_3__0__Impl_in_rule__Program__Group_0_1_3__01938);
            rule__Program__Group_0_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group_0_1_3__1_in_rule__Program__Group_0_1_3__01941);
            rule__Program__Group_0_1_3__1();

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
    // $ANTLR end "rule__Program__Group_0_1_3__0"


    // $ANTLR start "rule__Program__Group_0_1_3__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:955:1: rule__Program__Group_0_1_3__0__Impl : ( 'name' ) ;
    public final void rule__Program__Group_0_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:959:1: ( ( 'name' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:960:1: ( 'name' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:960:1: ( 'name' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:961:1: 'name'
            {
             before(grammarAccess.getProgramAccess().getNameKeyword_0_1_3_0()); 
            match(input,19,FOLLOW_19_in_rule__Program__Group_0_1_3__0__Impl1969); 
             after(grammarAccess.getProgramAccess().getNameKeyword_0_1_3_0()); 

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
    // $ANTLR end "rule__Program__Group_0_1_3__0__Impl"


    // $ANTLR start "rule__Program__Group_0_1_3__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:974:1: rule__Program__Group_0_1_3__1 : rule__Program__Group_0_1_3__1__Impl rule__Program__Group_0_1_3__2 ;
    public final void rule__Program__Group_0_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:978:1: ( rule__Program__Group_0_1_3__1__Impl rule__Program__Group_0_1_3__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:979:2: rule__Program__Group_0_1_3__1__Impl rule__Program__Group_0_1_3__2
            {
            pushFollow(FOLLOW_rule__Program__Group_0_1_3__1__Impl_in_rule__Program__Group_0_1_3__12000);
            rule__Program__Group_0_1_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group_0_1_3__2_in_rule__Program__Group_0_1_3__12003);
            rule__Program__Group_0_1_3__2();

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
    // $ANTLR end "rule__Program__Group_0_1_3__1"


    // $ANTLR start "rule__Program__Group_0_1_3__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:986:1: rule__Program__Group_0_1_3__1__Impl : ( ( rule__Program__LongNameAssignment_0_1_3_1 ) ) ;
    public final void rule__Program__Group_0_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:990:1: ( ( ( rule__Program__LongNameAssignment_0_1_3_1 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:991:1: ( ( rule__Program__LongNameAssignment_0_1_3_1 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:991:1: ( ( rule__Program__LongNameAssignment_0_1_3_1 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:992:1: ( rule__Program__LongNameAssignment_0_1_3_1 )
            {
             before(grammarAccess.getProgramAccess().getLongNameAssignment_0_1_3_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:993:1: ( rule__Program__LongNameAssignment_0_1_3_1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:993:2: rule__Program__LongNameAssignment_0_1_3_1
            {
            pushFollow(FOLLOW_rule__Program__LongNameAssignment_0_1_3_1_in_rule__Program__Group_0_1_3__1__Impl2030);
            rule__Program__LongNameAssignment_0_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getLongNameAssignment_0_1_3_1()); 

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
    // $ANTLR end "rule__Program__Group_0_1_3__1__Impl"


    // $ANTLR start "rule__Program__Group_0_1_3__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1003:1: rule__Program__Group_0_1_3__2 : rule__Program__Group_0_1_3__2__Impl ;
    public final void rule__Program__Group_0_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1007:1: ( rule__Program__Group_0_1_3__2__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1008:2: rule__Program__Group_0_1_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group_0_1_3__2__Impl_in_rule__Program__Group_0_1_3__22060);
            rule__Program__Group_0_1_3__2__Impl();

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
    // $ANTLR end "rule__Program__Group_0_1_3__2"


    // $ANTLR start "rule__Program__Group_0_1_3__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1014:1: rule__Program__Group_0_1_3__2__Impl : ( ruleENDLINE ) ;
    public final void rule__Program__Group_0_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1018:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1019:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1019:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1020:1: ruleENDLINE
            {
             before(grammarAccess.getProgramAccess().getENDLINEParserRuleCall_0_1_3_2()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__Program__Group_0_1_3__2__Impl2087);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getENDLINEParserRuleCall_0_1_3_2()); 

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
    // $ANTLR end "rule__Program__Group_0_1_3__2__Impl"


    // $ANTLR start "rule__Program__Group_0_1_4__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1037:1: rule__Program__Group_0_1_4__0 : rule__Program__Group_0_1_4__0__Impl rule__Program__Group_0_1_4__1 ;
    public final void rule__Program__Group_0_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1041:1: ( rule__Program__Group_0_1_4__0__Impl rule__Program__Group_0_1_4__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1042:2: rule__Program__Group_0_1_4__0__Impl rule__Program__Group_0_1_4__1
            {
            pushFollow(FOLLOW_rule__Program__Group_0_1_4__0__Impl_in_rule__Program__Group_0_1_4__02122);
            rule__Program__Group_0_1_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group_0_1_4__1_in_rule__Program__Group_0_1_4__02125);
            rule__Program__Group_0_1_4__1();

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
    // $ANTLR end "rule__Program__Group_0_1_4__0"


    // $ANTLR start "rule__Program__Group_0_1_4__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1049:1: rule__Program__Group_0_1_4__0__Impl : ( ( rule__Program__PlansAssignment_0_1_4_0 ) ) ;
    public final void rule__Program__Group_0_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1053:1: ( ( ( rule__Program__PlansAssignment_0_1_4_0 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1054:1: ( ( rule__Program__PlansAssignment_0_1_4_0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1054:1: ( ( rule__Program__PlansAssignment_0_1_4_0 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1055:1: ( rule__Program__PlansAssignment_0_1_4_0 )
            {
             before(grammarAccess.getProgramAccess().getPlansAssignment_0_1_4_0()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1056:1: ( rule__Program__PlansAssignment_0_1_4_0 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1056:2: rule__Program__PlansAssignment_0_1_4_0
            {
            pushFollow(FOLLOW_rule__Program__PlansAssignment_0_1_4_0_in_rule__Program__Group_0_1_4__0__Impl2152);
            rule__Program__PlansAssignment_0_1_4_0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getPlansAssignment_0_1_4_0()); 

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
    // $ANTLR end "rule__Program__Group_0_1_4__0__Impl"


    // $ANTLR start "rule__Program__Group_0_1_4__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1066:1: rule__Program__Group_0_1_4__1 : rule__Program__Group_0_1_4__1__Impl ;
    public final void rule__Program__Group_0_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1070:1: ( rule__Program__Group_0_1_4__1__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1071:2: rule__Program__Group_0_1_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group_0_1_4__1__Impl_in_rule__Program__Group_0_1_4__12182);
            rule__Program__Group_0_1_4__1__Impl();

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
    // $ANTLR end "rule__Program__Group_0_1_4__1"


    // $ANTLR start "rule__Program__Group_0_1_4__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1077:1: rule__Program__Group_0_1_4__1__Impl : ( ruleENDLINE ) ;
    public final void rule__Program__Group_0_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1081:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1082:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1082:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1083:1: ruleENDLINE
            {
             before(grammarAccess.getProgramAccess().getENDLINEParserRuleCall_0_1_4_1()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__Program__Group_0_1_4__1__Impl2209);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getENDLINEParserRuleCall_0_1_4_1()); 

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
    // $ANTLR end "rule__Program__Group_0_1_4__1__Impl"


    // $ANTLR start "rule__Program__Group_0_1_5__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1098:1: rule__Program__Group_0_1_5__0 : rule__Program__Group_0_1_5__0__Impl rule__Program__Group_0_1_5__1 ;
    public final void rule__Program__Group_0_1_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1102:1: ( rule__Program__Group_0_1_5__0__Impl rule__Program__Group_0_1_5__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1103:2: rule__Program__Group_0_1_5__0__Impl rule__Program__Group_0_1_5__1
            {
            pushFollow(FOLLOW_rule__Program__Group_0_1_5__0__Impl_in_rule__Program__Group_0_1_5__02242);
            rule__Program__Group_0_1_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group_0_1_5__1_in_rule__Program__Group_0_1_5__02245);
            rule__Program__Group_0_1_5__1();

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
    // $ANTLR end "rule__Program__Group_0_1_5__0"


    // $ANTLR start "rule__Program__Group_0_1_5__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1110:1: rule__Program__Group_0_1_5__0__Impl : ( 'project' ) ;
    public final void rule__Program__Group_0_1_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1114:1: ( ( 'project' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1115:1: ( 'project' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1115:1: ( 'project' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1116:1: 'project'
            {
             before(grammarAccess.getProgramAccess().getProjectKeyword_0_1_5_0()); 
            match(input,20,FOLLOW_20_in_rule__Program__Group_0_1_5__0__Impl2273); 
             after(grammarAccess.getProgramAccess().getProjectKeyword_0_1_5_0()); 

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
    // $ANTLR end "rule__Program__Group_0_1_5__0__Impl"


    // $ANTLR start "rule__Program__Group_0_1_5__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1129:1: rule__Program__Group_0_1_5__1 : rule__Program__Group_0_1_5__1__Impl rule__Program__Group_0_1_5__2 ;
    public final void rule__Program__Group_0_1_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1133:1: ( rule__Program__Group_0_1_5__1__Impl rule__Program__Group_0_1_5__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1134:2: rule__Program__Group_0_1_5__1__Impl rule__Program__Group_0_1_5__2
            {
            pushFollow(FOLLOW_rule__Program__Group_0_1_5__1__Impl_in_rule__Program__Group_0_1_5__12304);
            rule__Program__Group_0_1_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group_0_1_5__2_in_rule__Program__Group_0_1_5__12307);
            rule__Program__Group_0_1_5__2();

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
    // $ANTLR end "rule__Program__Group_0_1_5__1"


    // $ANTLR start "rule__Program__Group_0_1_5__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1141:1: rule__Program__Group_0_1_5__1__Impl : ( ( rule__Program__ReferencedProjectsAssignment_0_1_5_1 ) ) ;
    public final void rule__Program__Group_0_1_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1145:1: ( ( ( rule__Program__ReferencedProjectsAssignment_0_1_5_1 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1146:1: ( ( rule__Program__ReferencedProjectsAssignment_0_1_5_1 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1146:1: ( ( rule__Program__ReferencedProjectsAssignment_0_1_5_1 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1147:1: ( rule__Program__ReferencedProjectsAssignment_0_1_5_1 )
            {
             before(grammarAccess.getProgramAccess().getReferencedProjectsAssignment_0_1_5_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1148:1: ( rule__Program__ReferencedProjectsAssignment_0_1_5_1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1148:2: rule__Program__ReferencedProjectsAssignment_0_1_5_1
            {
            pushFollow(FOLLOW_rule__Program__ReferencedProjectsAssignment_0_1_5_1_in_rule__Program__Group_0_1_5__1__Impl2334);
            rule__Program__ReferencedProjectsAssignment_0_1_5_1();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getReferencedProjectsAssignment_0_1_5_1()); 

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
    // $ANTLR end "rule__Program__Group_0_1_5__1__Impl"


    // $ANTLR start "rule__Program__Group_0_1_5__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1158:1: rule__Program__Group_0_1_5__2 : rule__Program__Group_0_1_5__2__Impl ;
    public final void rule__Program__Group_0_1_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1162:1: ( rule__Program__Group_0_1_5__2__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1163:2: rule__Program__Group_0_1_5__2__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group_0_1_5__2__Impl_in_rule__Program__Group_0_1_5__22364);
            rule__Program__Group_0_1_5__2__Impl();

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
    // $ANTLR end "rule__Program__Group_0_1_5__2"


    // $ANTLR start "rule__Program__Group_0_1_5__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1169:1: rule__Program__Group_0_1_5__2__Impl : ( ruleENDLINE ) ;
    public final void rule__Program__Group_0_1_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1173:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1174:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1174:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1175:1: ruleENDLINE
            {
             before(grammarAccess.getProgramAccess().getENDLINEParserRuleCall_0_1_5_2()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__Program__Group_0_1_5__2__Impl2391);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getENDLINEParserRuleCall_0_1_5_2()); 

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
    // $ANTLR end "rule__Program__Group_0_1_5__2__Impl"


    // $ANTLR start "rule__Project__Group__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1192:1: rule__Project__Group__0 : rule__Project__Group__0__Impl rule__Project__Group__1 ;
    public final void rule__Project__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1196:1: ( rule__Project__Group__0__Impl rule__Project__Group__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1197:2: rule__Project__Group__0__Impl rule__Project__Group__1
            {
            pushFollow(FOLLOW_rule__Project__Group__0__Impl_in_rule__Project__Group__02426);
            rule__Project__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group__1_in_rule__Project__Group__02429);
            rule__Project__Group__1();

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
    // $ANTLR end "rule__Project__Group__0"


    // $ANTLR start "rule__Project__Group__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1204:1: rule__Project__Group__0__Impl : ( ( rule__Project__DescriptionAssignment_0 )? ) ;
    public final void rule__Project__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1208:1: ( ( ( rule__Project__DescriptionAssignment_0 )? ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1209:1: ( ( rule__Project__DescriptionAssignment_0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1209:1: ( ( rule__Project__DescriptionAssignment_0 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1210:1: ( rule__Project__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getProjectAccess().getDescriptionAssignment_0()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1211:1: ( rule__Project__DescriptionAssignment_0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ML_COMMENT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1211:2: rule__Project__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Project__DescriptionAssignment_0_in_rule__Project__Group__0__Impl2456);
                    rule__Project__DescriptionAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProjectAccess().getDescriptionAssignment_0()); 

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
    // $ANTLR end "rule__Project__Group__0__Impl"


    // $ANTLR start "rule__Project__Group__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1221:1: rule__Project__Group__1 : rule__Project__Group__1__Impl rule__Project__Group__2 ;
    public final void rule__Project__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1225:1: ( rule__Project__Group__1__Impl rule__Project__Group__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1226:2: rule__Project__Group__1__Impl rule__Project__Group__2
            {
            pushFollow(FOLLOW_rule__Project__Group__1__Impl_in_rule__Project__Group__12487);
            rule__Project__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group__2_in_rule__Project__Group__12490);
            rule__Project__Group__2();

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
    // $ANTLR end "rule__Project__Group__1"


    // $ANTLR start "rule__Project__Group__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1233:1: rule__Project__Group__1__Impl : ( 'Project' ) ;
    public final void rule__Project__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1237:1: ( ( 'Project' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1238:1: ( 'Project' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1238:1: ( 'Project' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1239:1: 'Project'
            {
             before(grammarAccess.getProjectAccess().getProjectKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__Project__Group__1__Impl2518); 
             after(grammarAccess.getProjectAccess().getProjectKeyword_1()); 

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
    // $ANTLR end "rule__Project__Group__1__Impl"


    // $ANTLR start "rule__Project__Group__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1252:1: rule__Project__Group__2 : rule__Project__Group__2__Impl rule__Project__Group__3 ;
    public final void rule__Project__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1256:1: ( rule__Project__Group__2__Impl rule__Project__Group__3 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1257:2: rule__Project__Group__2__Impl rule__Project__Group__3
            {
            pushFollow(FOLLOW_rule__Project__Group__2__Impl_in_rule__Project__Group__22549);
            rule__Project__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group__3_in_rule__Project__Group__22552);
            rule__Project__Group__3();

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
    // $ANTLR end "rule__Project__Group__2"


    // $ANTLR start "rule__Project__Group__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1264:1: rule__Project__Group__2__Impl : ( ( rule__Project__NameAssignment_2 ) ) ;
    public final void rule__Project__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1268:1: ( ( ( rule__Project__NameAssignment_2 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1269:1: ( ( rule__Project__NameAssignment_2 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1269:1: ( ( rule__Project__NameAssignment_2 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1270:1: ( rule__Project__NameAssignment_2 )
            {
             before(grammarAccess.getProjectAccess().getNameAssignment_2()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1271:1: ( rule__Project__NameAssignment_2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1271:2: rule__Project__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Project__NameAssignment_2_in_rule__Project__Group__2__Impl2579);
            rule__Project__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Project__Group__2__Impl"


    // $ANTLR start "rule__Project__Group__3"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1281:1: rule__Project__Group__3 : rule__Project__Group__3__Impl rule__Project__Group__4 ;
    public final void rule__Project__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1285:1: ( rule__Project__Group__3__Impl rule__Project__Group__4 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1286:2: rule__Project__Group__3__Impl rule__Project__Group__4
            {
            pushFollow(FOLLOW_rule__Project__Group__3__Impl_in_rule__Project__Group__32609);
            rule__Project__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group__4_in_rule__Project__Group__32612);
            rule__Project__Group__4();

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
    // $ANTLR end "rule__Project__Group__3"


    // $ANTLR start "rule__Project__Group__3__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1293:1: rule__Project__Group__3__Impl : ( RULE_OPENCURLY ) ;
    public final void rule__Project__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1297:1: ( ( RULE_OPENCURLY ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1298:1: ( RULE_OPENCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1298:1: ( RULE_OPENCURLY )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1299:1: RULE_OPENCURLY
            {
             before(grammarAccess.getProjectAccess().getOPENCURLYTerminalRuleCall_3()); 
            match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_rule__Project__Group__3__Impl2639); 
             after(grammarAccess.getProjectAccess().getOPENCURLYTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__Project__Group__3__Impl"


    // $ANTLR start "rule__Project__Group__4"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1310:1: rule__Project__Group__4 : rule__Project__Group__4__Impl rule__Project__Group__5 ;
    public final void rule__Project__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1314:1: ( rule__Project__Group__4__Impl rule__Project__Group__5 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1315:2: rule__Project__Group__4__Impl rule__Project__Group__5
            {
            pushFollow(FOLLOW_rule__Project__Group__4__Impl_in_rule__Project__Group__42668);
            rule__Project__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group__5_in_rule__Project__Group__42671);
            rule__Project__Group__5();

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
    // $ANTLR end "rule__Project__Group__4"


    // $ANTLR start "rule__Project__Group__4__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1322:1: rule__Project__Group__4__Impl : ( ( rule__Project__Group_4__0 )? ) ;
    public final void rule__Project__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1326:1: ( ( ( rule__Project__Group_4__0 )? ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1327:1: ( ( rule__Project__Group_4__0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1327:1: ( ( rule__Project__Group_4__0 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1328:1: ( rule__Project__Group_4__0 )?
            {
             before(grammarAccess.getProjectAccess().getGroup_4()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1329:1: ( rule__Project__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1329:2: rule__Project__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Project__Group_4__0_in_rule__Project__Group__4__Impl2698);
                    rule__Project__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProjectAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Project__Group__4__Impl"


    // $ANTLR start "rule__Project__Group__5"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1339:1: rule__Project__Group__5 : rule__Project__Group__5__Impl rule__Project__Group__6 ;
    public final void rule__Project__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1343:1: ( rule__Project__Group__5__Impl rule__Project__Group__6 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1344:2: rule__Project__Group__5__Impl rule__Project__Group__6
            {
            pushFollow(FOLLOW_rule__Project__Group__5__Impl_in_rule__Project__Group__52729);
            rule__Project__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group__6_in_rule__Project__Group__52732);
            rule__Project__Group__6();

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
    // $ANTLR end "rule__Project__Group__5"


    // $ANTLR start "rule__Project__Group__5__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1351:1: rule__Project__Group__5__Impl : ( ( rule__Project__Group_5__0 )? ) ;
    public final void rule__Project__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1355:1: ( ( ( rule__Project__Group_5__0 )? ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1356:1: ( ( rule__Project__Group_5__0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1356:1: ( ( rule__Project__Group_5__0 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1357:1: ( rule__Project__Group_5__0 )?
            {
             before(grammarAccess.getProjectAccess().getGroup_5()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1358:1: ( rule__Project__Group_5__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1358:2: rule__Project__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Project__Group_5__0_in_rule__Project__Group__5__Impl2759);
                    rule__Project__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProjectAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Project__Group__5__Impl"


    // $ANTLR start "rule__Project__Group__6"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1368:1: rule__Project__Group__6 : rule__Project__Group__6__Impl rule__Project__Group__7 ;
    public final void rule__Project__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1372:1: ( rule__Project__Group__6__Impl rule__Project__Group__7 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1373:2: rule__Project__Group__6__Impl rule__Project__Group__7
            {
            pushFollow(FOLLOW_rule__Project__Group__6__Impl_in_rule__Project__Group__62790);
            rule__Project__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group__7_in_rule__Project__Group__62793);
            rule__Project__Group__7();

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
    // $ANTLR end "rule__Project__Group__6"


    // $ANTLR start "rule__Project__Group__6__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1380:1: rule__Project__Group__6__Impl : ( ( rule__Project__Group_6__0 )? ) ;
    public final void rule__Project__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1384:1: ( ( ( rule__Project__Group_6__0 )? ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1385:1: ( ( rule__Project__Group_6__0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1385:1: ( ( rule__Project__Group_6__0 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1386:1: ( rule__Project__Group_6__0 )?
            {
             before(grammarAccess.getProjectAccess().getGroup_6()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1387:1: ( rule__Project__Group_6__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1387:2: rule__Project__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Project__Group_6__0_in_rule__Project__Group__6__Impl2820);
                    rule__Project__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProjectAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Project__Group__6__Impl"


    // $ANTLR start "rule__Project__Group__7"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1397:1: rule__Project__Group__7 : rule__Project__Group__7__Impl rule__Project__Group__8 ;
    public final void rule__Project__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1401:1: ( rule__Project__Group__7__Impl rule__Project__Group__8 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1402:2: rule__Project__Group__7__Impl rule__Project__Group__8
            {
            pushFollow(FOLLOW_rule__Project__Group__7__Impl_in_rule__Project__Group__72851);
            rule__Project__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group__8_in_rule__Project__Group__72854);
            rule__Project__Group__8();

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
    // $ANTLR end "rule__Project__Group__7"


    // $ANTLR start "rule__Project__Group__7__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1409:1: rule__Project__Group__7__Impl : ( ( rule__Project__Group_7__0 )* ) ;
    public final void rule__Project__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1413:1: ( ( ( rule__Project__Group_7__0 )* ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1414:1: ( ( rule__Project__Group_7__0 )* )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1414:1: ( ( rule__Project__Group_7__0 )* )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1415:1: ( rule__Project__Group_7__0 )*
            {
             before(grammarAccess.getProjectAccess().getGroup_7()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1416:1: ( rule__Project__Group_7__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==30) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1416:2: rule__Project__Group_7__0
            	    {
            	    pushFollow(FOLLOW_rule__Project__Group_7__0_in_rule__Project__Group__7__Impl2881);
            	    rule__Project__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getProjectAccess().getGroup_7()); 

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
    // $ANTLR end "rule__Project__Group__7__Impl"


    // $ANTLR start "rule__Project__Group__8"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1426:1: rule__Project__Group__8 : rule__Project__Group__8__Impl rule__Project__Group__9 ;
    public final void rule__Project__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1430:1: ( rule__Project__Group__8__Impl rule__Project__Group__9 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1431:2: rule__Project__Group__8__Impl rule__Project__Group__9
            {
            pushFollow(FOLLOW_rule__Project__Group__8__Impl_in_rule__Project__Group__82912);
            rule__Project__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group__9_in_rule__Project__Group__82915);
            rule__Project__Group__9();

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
    // $ANTLR end "rule__Project__Group__8"


    // $ANTLR start "rule__Project__Group__8__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1438:1: rule__Project__Group__8__Impl : ( ( rule__Project__Group_8__0 )? ) ;
    public final void rule__Project__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1442:1: ( ( ( rule__Project__Group_8__0 )? ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1443:1: ( ( rule__Project__Group_8__0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1443:1: ( ( rule__Project__Group_8__0 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1444:1: ( rule__Project__Group_8__0 )?
            {
             before(grammarAccess.getProjectAccess().getGroup_8()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1445:1: ( rule__Project__Group_8__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==22) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1445:2: rule__Project__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__Project__Group_8__0_in_rule__Project__Group__8__Impl2942);
                    rule__Project__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProjectAccess().getGroup_8()); 

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
    // $ANTLR end "rule__Project__Group__8__Impl"


    // $ANTLR start "rule__Project__Group__9"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1455:1: rule__Project__Group__9 : rule__Project__Group__9__Impl rule__Project__Group__10 ;
    public final void rule__Project__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1459:1: ( rule__Project__Group__9__Impl rule__Project__Group__10 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1460:2: rule__Project__Group__9__Impl rule__Project__Group__10
            {
            pushFollow(FOLLOW_rule__Project__Group__9__Impl_in_rule__Project__Group__92973);
            rule__Project__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group__10_in_rule__Project__Group__92976);
            rule__Project__Group__10();

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
    // $ANTLR end "rule__Project__Group__9"


    // $ANTLR start "rule__Project__Group__9__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1467:1: rule__Project__Group__9__Impl : ( ( rule__Project__Group_9__0 )? ) ;
    public final void rule__Project__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1471:1: ( ( ( rule__Project__Group_9__0 )? ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1472:1: ( ( rule__Project__Group_9__0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1472:1: ( ( rule__Project__Group_9__0 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1473:1: ( rule__Project__Group_9__0 )?
            {
             before(grammarAccess.getProjectAccess().getGroup_9()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1474:1: ( rule__Project__Group_9__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1474:2: rule__Project__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__Project__Group_9__0_in_rule__Project__Group__9__Impl3003);
                    rule__Project__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProjectAccess().getGroup_9()); 

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
    // $ANTLR end "rule__Project__Group__9__Impl"


    // $ANTLR start "rule__Project__Group__10"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1484:1: rule__Project__Group__10 : rule__Project__Group__10__Impl rule__Project__Group__11 ;
    public final void rule__Project__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1488:1: ( rule__Project__Group__10__Impl rule__Project__Group__11 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1489:2: rule__Project__Group__10__Impl rule__Project__Group__11
            {
            pushFollow(FOLLOW_rule__Project__Group__10__Impl_in_rule__Project__Group__103034);
            rule__Project__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group__11_in_rule__Project__Group__103037);
            rule__Project__Group__11();

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
    // $ANTLR end "rule__Project__Group__10"


    // $ANTLR start "rule__Project__Group__10__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1496:1: rule__Project__Group__10__Impl : ( ( rule__Project__ActivitiesAssignment_10 )* ) ;
    public final void rule__Project__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1500:1: ( ( ( rule__Project__ActivitiesAssignment_10 )* ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1501:1: ( ( rule__Project__ActivitiesAssignment_10 )* )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1501:1: ( ( rule__Project__ActivitiesAssignment_10 )* )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1502:1: ( rule__Project__ActivitiesAssignment_10 )*
            {
             before(grammarAccess.getProjectAccess().getActivitiesAssignment_10()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1503:1: ( rule__Project__ActivitiesAssignment_10 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ML_COMMENT||LA19_0==25||LA19_0==32||(LA19_0>=34 && LA19_0<=35)||LA19_0==37||LA19_0==41) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1503:2: rule__Project__ActivitiesAssignment_10
            	    {
            	    pushFollow(FOLLOW_rule__Project__ActivitiesAssignment_10_in_rule__Project__Group__10__Impl3064);
            	    rule__Project__ActivitiesAssignment_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getProjectAccess().getActivitiesAssignment_10()); 

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
    // $ANTLR end "rule__Project__Group__10__Impl"


    // $ANTLR start "rule__Project__Group__11"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1513:1: rule__Project__Group__11 : rule__Project__Group__11__Impl ;
    public final void rule__Project__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1517:1: ( rule__Project__Group__11__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1518:2: rule__Project__Group__11__Impl
            {
            pushFollow(FOLLOW_rule__Project__Group__11__Impl_in_rule__Project__Group__113095);
            rule__Project__Group__11__Impl();

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
    // $ANTLR end "rule__Project__Group__11"


    // $ANTLR start "rule__Project__Group__11__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1524:1: rule__Project__Group__11__Impl : ( RULE_CLOSEDCURLY ) ;
    public final void rule__Project__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1528:1: ( ( RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1529:1: ( RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1529:1: ( RULE_CLOSEDCURLY )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1530:1: RULE_CLOSEDCURLY
            {
             before(grammarAccess.getProjectAccess().getCLOSEDCURLYTerminalRuleCall_11()); 
            match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_rule__Project__Group__11__Impl3122); 
             after(grammarAccess.getProjectAccess().getCLOSEDCURLYTerminalRuleCall_11()); 

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
    // $ANTLR end "rule__Project__Group__11__Impl"


    // $ANTLR start "rule__Project__Group_4__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1565:1: rule__Project__Group_4__0 : rule__Project__Group_4__0__Impl rule__Project__Group_4__1 ;
    public final void rule__Project__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1569:1: ( rule__Project__Group_4__0__Impl rule__Project__Group_4__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1570:2: rule__Project__Group_4__0__Impl rule__Project__Group_4__1
            {
            pushFollow(FOLLOW_rule__Project__Group_4__0__Impl_in_rule__Project__Group_4__03175);
            rule__Project__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group_4__1_in_rule__Project__Group_4__03178);
            rule__Project__Group_4__1();

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
    // $ANTLR end "rule__Project__Group_4__0"


    // $ANTLR start "rule__Project__Group_4__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1577:1: rule__Project__Group_4__0__Impl : ( 'name' ) ;
    public final void rule__Project__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1581:1: ( ( 'name' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1582:1: ( 'name' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1582:1: ( 'name' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1583:1: 'name'
            {
             before(grammarAccess.getProjectAccess().getNameKeyword_4_0()); 
            match(input,19,FOLLOW_19_in_rule__Project__Group_4__0__Impl3206); 
             after(grammarAccess.getProjectAccess().getNameKeyword_4_0()); 

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
    // $ANTLR end "rule__Project__Group_4__0__Impl"


    // $ANTLR start "rule__Project__Group_4__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1596:1: rule__Project__Group_4__1 : rule__Project__Group_4__1__Impl rule__Project__Group_4__2 ;
    public final void rule__Project__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1600:1: ( rule__Project__Group_4__1__Impl rule__Project__Group_4__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1601:2: rule__Project__Group_4__1__Impl rule__Project__Group_4__2
            {
            pushFollow(FOLLOW_rule__Project__Group_4__1__Impl_in_rule__Project__Group_4__13237);
            rule__Project__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group_4__2_in_rule__Project__Group_4__13240);
            rule__Project__Group_4__2();

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
    // $ANTLR end "rule__Project__Group_4__1"


    // $ANTLR start "rule__Project__Group_4__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1608:1: rule__Project__Group_4__1__Impl : ( ( rule__Project__LongNameAssignment_4_1 ) ) ;
    public final void rule__Project__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1612:1: ( ( ( rule__Project__LongNameAssignment_4_1 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1613:1: ( ( rule__Project__LongNameAssignment_4_1 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1613:1: ( ( rule__Project__LongNameAssignment_4_1 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1614:1: ( rule__Project__LongNameAssignment_4_1 )
            {
             before(grammarAccess.getProjectAccess().getLongNameAssignment_4_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1615:1: ( rule__Project__LongNameAssignment_4_1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1615:2: rule__Project__LongNameAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Project__LongNameAssignment_4_1_in_rule__Project__Group_4__1__Impl3267);
            rule__Project__LongNameAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getLongNameAssignment_4_1()); 

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
    // $ANTLR end "rule__Project__Group_4__1__Impl"


    // $ANTLR start "rule__Project__Group_4__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1625:1: rule__Project__Group_4__2 : rule__Project__Group_4__2__Impl ;
    public final void rule__Project__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1629:1: ( rule__Project__Group_4__2__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1630:2: rule__Project__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Project__Group_4__2__Impl_in_rule__Project__Group_4__23297);
            rule__Project__Group_4__2__Impl();

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
    // $ANTLR end "rule__Project__Group_4__2"


    // $ANTLR start "rule__Project__Group_4__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1636:1: rule__Project__Group_4__2__Impl : ( ruleENDLINE ) ;
    public final void rule__Project__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1640:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1641:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1641:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1642:1: ruleENDLINE
            {
             before(grammarAccess.getProjectAccess().getENDLINEParserRuleCall_4_2()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__Project__Group_4__2__Impl3324);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getENDLINEParserRuleCall_4_2()); 

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
    // $ANTLR end "rule__Project__Group_4__2__Impl"


    // $ANTLR start "rule__Project__Group_5__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1659:1: rule__Project__Group_5__0 : rule__Project__Group_5__0__Impl rule__Project__Group_5__1 ;
    public final void rule__Project__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1663:1: ( rule__Project__Group_5__0__Impl rule__Project__Group_5__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1664:2: rule__Project__Group_5__0__Impl rule__Project__Group_5__1
            {
            pushFollow(FOLLOW_rule__Project__Group_5__0__Impl_in_rule__Project__Group_5__03359);
            rule__Project__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group_5__1_in_rule__Project__Group_5__03362);
            rule__Project__Group_5__1();

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
    // $ANTLR end "rule__Project__Group_5__0"


    // $ANTLR start "rule__Project__Group_5__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1671:1: rule__Project__Group_5__0__Impl : ( ( rule__Project__WbsAssignment_5_0 ) ) ;
    public final void rule__Project__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1675:1: ( ( ( rule__Project__WbsAssignment_5_0 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1676:1: ( ( rule__Project__WbsAssignment_5_0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1676:1: ( ( rule__Project__WbsAssignment_5_0 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1677:1: ( rule__Project__WbsAssignment_5_0 )
            {
             before(grammarAccess.getProjectAccess().getWbsAssignment_5_0()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1678:1: ( rule__Project__WbsAssignment_5_0 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1678:2: rule__Project__WbsAssignment_5_0
            {
            pushFollow(FOLLOW_rule__Project__WbsAssignment_5_0_in_rule__Project__Group_5__0__Impl3389);
            rule__Project__WbsAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getWbsAssignment_5_0()); 

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
    // $ANTLR end "rule__Project__Group_5__0__Impl"


    // $ANTLR start "rule__Project__Group_5__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1688:1: rule__Project__Group_5__1 : rule__Project__Group_5__1__Impl rule__Project__Group_5__2 ;
    public final void rule__Project__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1692:1: ( rule__Project__Group_5__1__Impl rule__Project__Group_5__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1693:2: rule__Project__Group_5__1__Impl rule__Project__Group_5__2
            {
            pushFollow(FOLLOW_rule__Project__Group_5__1__Impl_in_rule__Project__Group_5__13419);
            rule__Project__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group_5__2_in_rule__Project__Group_5__13422);
            rule__Project__Group_5__2();

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
    // $ANTLR end "rule__Project__Group_5__1"


    // $ANTLR start "rule__Project__Group_5__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1700:1: rule__Project__Group_5__1__Impl : ( 'project' ) ;
    public final void rule__Project__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1704:1: ( ( 'project' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1705:1: ( 'project' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1705:1: ( 'project' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1706:1: 'project'
            {
             before(grammarAccess.getProjectAccess().getProjectKeyword_5_1()); 
            match(input,20,FOLLOW_20_in_rule__Project__Group_5__1__Impl3450); 
             after(grammarAccess.getProjectAccess().getProjectKeyword_5_1()); 

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
    // $ANTLR end "rule__Project__Group_5__1__Impl"


    // $ANTLR start "rule__Project__Group_5__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1719:1: rule__Project__Group_5__2 : rule__Project__Group_5__2__Impl rule__Project__Group_5__3 ;
    public final void rule__Project__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1723:1: ( rule__Project__Group_5__2__Impl rule__Project__Group_5__3 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1724:2: rule__Project__Group_5__2__Impl rule__Project__Group_5__3
            {
            pushFollow(FOLLOW_rule__Project__Group_5__2__Impl_in_rule__Project__Group_5__23481);
            rule__Project__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group_5__3_in_rule__Project__Group_5__23484);
            rule__Project__Group_5__3();

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
    // $ANTLR end "rule__Project__Group_5__2"


    // $ANTLR start "rule__Project__Group_5__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1731:1: rule__Project__Group_5__2__Impl : ( ( rule__Project__WbsProjectAssignment_5_2 ) ) ;
    public final void rule__Project__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1735:1: ( ( ( rule__Project__WbsProjectAssignment_5_2 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1736:1: ( ( rule__Project__WbsProjectAssignment_5_2 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1736:1: ( ( rule__Project__WbsProjectAssignment_5_2 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1737:1: ( rule__Project__WbsProjectAssignment_5_2 )
            {
             before(grammarAccess.getProjectAccess().getWbsProjectAssignment_5_2()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1738:1: ( rule__Project__WbsProjectAssignment_5_2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1738:2: rule__Project__WbsProjectAssignment_5_2
            {
            pushFollow(FOLLOW_rule__Project__WbsProjectAssignment_5_2_in_rule__Project__Group_5__2__Impl3511);
            rule__Project__WbsProjectAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getWbsProjectAssignment_5_2()); 

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
    // $ANTLR end "rule__Project__Group_5__2__Impl"


    // $ANTLR start "rule__Project__Group_5__3"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1748:1: rule__Project__Group_5__3 : rule__Project__Group_5__3__Impl ;
    public final void rule__Project__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1752:1: ( rule__Project__Group_5__3__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1753:2: rule__Project__Group_5__3__Impl
            {
            pushFollow(FOLLOW_rule__Project__Group_5__3__Impl_in_rule__Project__Group_5__33541);
            rule__Project__Group_5__3__Impl();

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
    // $ANTLR end "rule__Project__Group_5__3"


    // $ANTLR start "rule__Project__Group_5__3__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1759:1: rule__Project__Group_5__3__Impl : ( ruleENDLINE ) ;
    public final void rule__Project__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1763:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1764:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1764:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1765:1: ruleENDLINE
            {
             before(grammarAccess.getProjectAccess().getENDLINEParserRuleCall_5_3()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__Project__Group_5__3__Impl3568);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getENDLINEParserRuleCall_5_3()); 

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
    // $ANTLR end "rule__Project__Group_5__3__Impl"


    // $ANTLR start "rule__Project__Group_6__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1784:1: rule__Project__Group_6__0 : rule__Project__Group_6__0__Impl rule__Project__Group_6__1 ;
    public final void rule__Project__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1788:1: ( rule__Project__Group_6__0__Impl rule__Project__Group_6__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1789:2: rule__Project__Group_6__0__Impl rule__Project__Group_6__1
            {
            pushFollow(FOLLOW_rule__Project__Group_6__0__Impl_in_rule__Project__Group_6__03605);
            rule__Project__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group_6__1_in_rule__Project__Group_6__03608);
            rule__Project__Group_6__1();

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
    // $ANTLR end "rule__Project__Group_6__0"


    // $ANTLR start "rule__Project__Group_6__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1796:1: rule__Project__Group_6__0__Impl : ( ( rule__Project__ResourcesAssignment_6_0 ) ) ;
    public final void rule__Project__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1800:1: ( ( ( rule__Project__ResourcesAssignment_6_0 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1801:1: ( ( rule__Project__ResourcesAssignment_6_0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1801:1: ( ( rule__Project__ResourcesAssignment_6_0 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1802:1: ( rule__Project__ResourcesAssignment_6_0 )
            {
             before(grammarAccess.getProjectAccess().getResourcesAssignment_6_0()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1803:1: ( rule__Project__ResourcesAssignment_6_0 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1803:2: rule__Project__ResourcesAssignment_6_0
            {
            pushFollow(FOLLOW_rule__Project__ResourcesAssignment_6_0_in_rule__Project__Group_6__0__Impl3635);
            rule__Project__ResourcesAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getResourcesAssignment_6_0()); 

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
    // $ANTLR end "rule__Project__Group_6__0__Impl"


    // $ANTLR start "rule__Project__Group_6__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1813:1: rule__Project__Group_6__1 : rule__Project__Group_6__1__Impl ;
    public final void rule__Project__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1817:1: ( rule__Project__Group_6__1__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1818:2: rule__Project__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Project__Group_6__1__Impl_in_rule__Project__Group_6__13665);
            rule__Project__Group_6__1__Impl();

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
    // $ANTLR end "rule__Project__Group_6__1"


    // $ANTLR start "rule__Project__Group_6__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1824:1: rule__Project__Group_6__1__Impl : ( ruleENDLINE ) ;
    public final void rule__Project__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1828:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1829:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1829:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1830:1: ruleENDLINE
            {
             before(grammarAccess.getProjectAccess().getENDLINEParserRuleCall_6_1()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__Project__Group_6__1__Impl3692);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getENDLINEParserRuleCall_6_1()); 

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
    // $ANTLR end "rule__Project__Group_6__1__Impl"


    // $ANTLR start "rule__Project__Group_7__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1845:1: rule__Project__Group_7__0 : rule__Project__Group_7__0__Impl rule__Project__Group_7__1 ;
    public final void rule__Project__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1849:1: ( rule__Project__Group_7__0__Impl rule__Project__Group_7__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1850:2: rule__Project__Group_7__0__Impl rule__Project__Group_7__1
            {
            pushFollow(FOLLOW_rule__Project__Group_7__0__Impl_in_rule__Project__Group_7__03725);
            rule__Project__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group_7__1_in_rule__Project__Group_7__03728);
            rule__Project__Group_7__1();

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
    // $ANTLR end "rule__Project__Group_7__0"


    // $ANTLR start "rule__Project__Group_7__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1857:1: rule__Project__Group_7__0__Impl : ( ( rule__Project__PlansAssignment_7_0 ) ) ;
    public final void rule__Project__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1861:1: ( ( ( rule__Project__PlansAssignment_7_0 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1862:1: ( ( rule__Project__PlansAssignment_7_0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1862:1: ( ( rule__Project__PlansAssignment_7_0 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1863:1: ( rule__Project__PlansAssignment_7_0 )
            {
             before(grammarAccess.getProjectAccess().getPlansAssignment_7_0()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1864:1: ( rule__Project__PlansAssignment_7_0 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1864:2: rule__Project__PlansAssignment_7_0
            {
            pushFollow(FOLLOW_rule__Project__PlansAssignment_7_0_in_rule__Project__Group_7__0__Impl3755);
            rule__Project__PlansAssignment_7_0();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getPlansAssignment_7_0()); 

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
    // $ANTLR end "rule__Project__Group_7__0__Impl"


    // $ANTLR start "rule__Project__Group_7__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1874:1: rule__Project__Group_7__1 : rule__Project__Group_7__1__Impl ;
    public final void rule__Project__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1878:1: ( rule__Project__Group_7__1__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1879:2: rule__Project__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Project__Group_7__1__Impl_in_rule__Project__Group_7__13785);
            rule__Project__Group_7__1__Impl();

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
    // $ANTLR end "rule__Project__Group_7__1"


    // $ANTLR start "rule__Project__Group_7__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1885:1: rule__Project__Group_7__1__Impl : ( ruleENDLINE ) ;
    public final void rule__Project__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1889:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1890:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1890:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1891:1: ruleENDLINE
            {
             before(grammarAccess.getProjectAccess().getENDLINEParserRuleCall_7_1()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__Project__Group_7__1__Impl3812);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getENDLINEParserRuleCall_7_1()); 

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
    // $ANTLR end "rule__Project__Group_7__1__Impl"


    // $ANTLR start "rule__Project__Group_8__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1906:1: rule__Project__Group_8__0 : rule__Project__Group_8__0__Impl rule__Project__Group_8__1 ;
    public final void rule__Project__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1910:1: ( rule__Project__Group_8__0__Impl rule__Project__Group_8__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1911:2: rule__Project__Group_8__0__Impl rule__Project__Group_8__1
            {
            pushFollow(FOLLOW_rule__Project__Group_8__0__Impl_in_rule__Project__Group_8__03845);
            rule__Project__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group_8__1_in_rule__Project__Group_8__03848);
            rule__Project__Group_8__1();

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
    // $ANTLR end "rule__Project__Group_8__0"


    // $ANTLR start "rule__Project__Group_8__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1918:1: rule__Project__Group_8__0__Impl : ( 'assumptions' ) ;
    public final void rule__Project__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1922:1: ( ( 'assumptions' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1923:1: ( 'assumptions' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1923:1: ( 'assumptions' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1924:1: 'assumptions'
            {
             before(grammarAccess.getProjectAccess().getAssumptionsKeyword_8_0()); 
            match(input,22,FOLLOW_22_in_rule__Project__Group_8__0__Impl3876); 
             after(grammarAccess.getProjectAccess().getAssumptionsKeyword_8_0()); 

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
    // $ANTLR end "rule__Project__Group_8__0__Impl"


    // $ANTLR start "rule__Project__Group_8__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1937:1: rule__Project__Group_8__1 : rule__Project__Group_8__1__Impl rule__Project__Group_8__2 ;
    public final void rule__Project__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1941:1: ( rule__Project__Group_8__1__Impl rule__Project__Group_8__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1942:2: rule__Project__Group_8__1__Impl rule__Project__Group_8__2
            {
            pushFollow(FOLLOW_rule__Project__Group_8__1__Impl_in_rule__Project__Group_8__13907);
            rule__Project__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group_8__2_in_rule__Project__Group_8__13910);
            rule__Project__Group_8__2();

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
    // $ANTLR end "rule__Project__Group_8__1"


    // $ANTLR start "rule__Project__Group_8__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1949:1: rule__Project__Group_8__1__Impl : ( RULE_OPENCURLY ) ;
    public final void rule__Project__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1953:1: ( ( RULE_OPENCURLY ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1954:1: ( RULE_OPENCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1954:1: ( RULE_OPENCURLY )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1955:1: RULE_OPENCURLY
            {
             before(grammarAccess.getProjectAccess().getOPENCURLYTerminalRuleCall_8_1()); 
            match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_rule__Project__Group_8__1__Impl3937); 
             after(grammarAccess.getProjectAccess().getOPENCURLYTerminalRuleCall_8_1()); 

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
    // $ANTLR end "rule__Project__Group_8__1__Impl"


    // $ANTLR start "rule__Project__Group_8__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1966:1: rule__Project__Group_8__2 : rule__Project__Group_8__2__Impl rule__Project__Group_8__3 ;
    public final void rule__Project__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1970:1: ( rule__Project__Group_8__2__Impl rule__Project__Group_8__3 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1971:2: rule__Project__Group_8__2__Impl rule__Project__Group_8__3
            {
            pushFollow(FOLLOW_rule__Project__Group_8__2__Impl_in_rule__Project__Group_8__23966);
            rule__Project__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group_8__3_in_rule__Project__Group_8__23969);
            rule__Project__Group_8__3();

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
    // $ANTLR end "rule__Project__Group_8__2"


    // $ANTLR start "rule__Project__Group_8__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1978:1: rule__Project__Group_8__2__Impl : ( ( rule__Project__AssumptionsAssignment_8_2 )* ) ;
    public final void rule__Project__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1982:1: ( ( ( rule__Project__AssumptionsAssignment_8_2 )* ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1983:1: ( ( rule__Project__AssumptionsAssignment_8_2 )* )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1983:1: ( ( rule__Project__AssumptionsAssignment_8_2 )* )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1984:1: ( rule__Project__AssumptionsAssignment_8_2 )*
            {
             before(grammarAccess.getProjectAccess().getAssumptionsAssignment_8_2()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1985:1: ( rule__Project__AssumptionsAssignment_8_2 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==24) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1985:2: rule__Project__AssumptionsAssignment_8_2
            	    {
            	    pushFollow(FOLLOW_rule__Project__AssumptionsAssignment_8_2_in_rule__Project__Group_8__2__Impl3996);
            	    rule__Project__AssumptionsAssignment_8_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getProjectAccess().getAssumptionsAssignment_8_2()); 

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
    // $ANTLR end "rule__Project__Group_8__2__Impl"


    // $ANTLR start "rule__Project__Group_8__3"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1995:1: rule__Project__Group_8__3 : rule__Project__Group_8__3__Impl ;
    public final void rule__Project__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:1999:1: ( rule__Project__Group_8__3__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2000:2: rule__Project__Group_8__3__Impl
            {
            pushFollow(FOLLOW_rule__Project__Group_8__3__Impl_in_rule__Project__Group_8__34027);
            rule__Project__Group_8__3__Impl();

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
    // $ANTLR end "rule__Project__Group_8__3"


    // $ANTLR start "rule__Project__Group_8__3__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2006:1: rule__Project__Group_8__3__Impl : ( RULE_CLOSEDCURLY ) ;
    public final void rule__Project__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2010:1: ( ( RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2011:1: ( RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2011:1: ( RULE_CLOSEDCURLY )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2012:1: RULE_CLOSEDCURLY
            {
             before(grammarAccess.getProjectAccess().getCLOSEDCURLYTerminalRuleCall_8_3()); 
            match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_rule__Project__Group_8__3__Impl4054); 
             after(grammarAccess.getProjectAccess().getCLOSEDCURLYTerminalRuleCall_8_3()); 

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
    // $ANTLR end "rule__Project__Group_8__3__Impl"


    // $ANTLR start "rule__Project__Group_9__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2031:1: rule__Project__Group_9__0 : rule__Project__Group_9__0__Impl rule__Project__Group_9__1 ;
    public final void rule__Project__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2035:1: ( rule__Project__Group_9__0__Impl rule__Project__Group_9__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2036:2: rule__Project__Group_9__0__Impl rule__Project__Group_9__1
            {
            pushFollow(FOLLOW_rule__Project__Group_9__0__Impl_in_rule__Project__Group_9__04091);
            rule__Project__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group_9__1_in_rule__Project__Group_9__04094);
            rule__Project__Group_9__1();

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
    // $ANTLR end "rule__Project__Group_9__0"


    // $ANTLR start "rule__Project__Group_9__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2043:1: rule__Project__Group_9__0__Impl : ( 'constraints' ) ;
    public final void rule__Project__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2047:1: ( ( 'constraints' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2048:1: ( 'constraints' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2048:1: ( 'constraints' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2049:1: 'constraints'
            {
             before(grammarAccess.getProjectAccess().getConstraintsKeyword_9_0()); 
            match(input,23,FOLLOW_23_in_rule__Project__Group_9__0__Impl4122); 
             after(grammarAccess.getProjectAccess().getConstraintsKeyword_9_0()); 

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
    // $ANTLR end "rule__Project__Group_9__0__Impl"


    // $ANTLR start "rule__Project__Group_9__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2062:1: rule__Project__Group_9__1 : rule__Project__Group_9__1__Impl rule__Project__Group_9__2 ;
    public final void rule__Project__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2066:1: ( rule__Project__Group_9__1__Impl rule__Project__Group_9__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2067:2: rule__Project__Group_9__1__Impl rule__Project__Group_9__2
            {
            pushFollow(FOLLOW_rule__Project__Group_9__1__Impl_in_rule__Project__Group_9__14153);
            rule__Project__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group_9__2_in_rule__Project__Group_9__14156);
            rule__Project__Group_9__2();

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
    // $ANTLR end "rule__Project__Group_9__1"


    // $ANTLR start "rule__Project__Group_9__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2074:1: rule__Project__Group_9__1__Impl : ( RULE_OPENCURLY ) ;
    public final void rule__Project__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2078:1: ( ( RULE_OPENCURLY ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2079:1: ( RULE_OPENCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2079:1: ( RULE_OPENCURLY )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2080:1: RULE_OPENCURLY
            {
             before(grammarAccess.getProjectAccess().getOPENCURLYTerminalRuleCall_9_1()); 
            match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_rule__Project__Group_9__1__Impl4183); 
             after(grammarAccess.getProjectAccess().getOPENCURLYTerminalRuleCall_9_1()); 

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
    // $ANTLR end "rule__Project__Group_9__1__Impl"


    // $ANTLR start "rule__Project__Group_9__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2091:1: rule__Project__Group_9__2 : rule__Project__Group_9__2__Impl rule__Project__Group_9__3 ;
    public final void rule__Project__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2095:1: ( rule__Project__Group_9__2__Impl rule__Project__Group_9__3 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2096:2: rule__Project__Group_9__2__Impl rule__Project__Group_9__3
            {
            pushFollow(FOLLOW_rule__Project__Group_9__2__Impl_in_rule__Project__Group_9__24212);
            rule__Project__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group_9__3_in_rule__Project__Group_9__24215);
            rule__Project__Group_9__3();

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
    // $ANTLR end "rule__Project__Group_9__2"


    // $ANTLR start "rule__Project__Group_9__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2103:1: rule__Project__Group_9__2__Impl : ( ( rule__Project__ConstraintsAssignment_9_2 )* ) ;
    public final void rule__Project__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2107:1: ( ( ( rule__Project__ConstraintsAssignment_9_2 )* ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2108:1: ( ( rule__Project__ConstraintsAssignment_9_2 )* )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2108:1: ( ( rule__Project__ConstraintsAssignment_9_2 )* )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2109:1: ( rule__Project__ConstraintsAssignment_9_2 )*
            {
             before(grammarAccess.getProjectAccess().getConstraintsAssignment_9_2()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2110:1: ( rule__Project__ConstraintsAssignment_9_2 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==24) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2110:2: rule__Project__ConstraintsAssignment_9_2
            	    {
            	    pushFollow(FOLLOW_rule__Project__ConstraintsAssignment_9_2_in_rule__Project__Group_9__2__Impl4242);
            	    rule__Project__ConstraintsAssignment_9_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getProjectAccess().getConstraintsAssignment_9_2()); 

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
    // $ANTLR end "rule__Project__Group_9__2__Impl"


    // $ANTLR start "rule__Project__Group_9__3"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2120:1: rule__Project__Group_9__3 : rule__Project__Group_9__3__Impl ;
    public final void rule__Project__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2124:1: ( rule__Project__Group_9__3__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2125:2: rule__Project__Group_9__3__Impl
            {
            pushFollow(FOLLOW_rule__Project__Group_9__3__Impl_in_rule__Project__Group_9__34273);
            rule__Project__Group_9__3__Impl();

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
    // $ANTLR end "rule__Project__Group_9__3"


    // $ANTLR start "rule__Project__Group_9__3__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2131:1: rule__Project__Group_9__3__Impl : ( RULE_CLOSEDCURLY ) ;
    public final void rule__Project__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2135:1: ( ( RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2136:1: ( RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2136:1: ( RULE_CLOSEDCURLY )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2137:1: RULE_CLOSEDCURLY
            {
             before(grammarAccess.getProjectAccess().getCLOSEDCURLYTerminalRuleCall_9_3()); 
            match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_rule__Project__Group_9__3__Impl4300); 
             after(grammarAccess.getProjectAccess().getCLOSEDCURLYTerminalRuleCall_9_3()); 

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
    // $ANTLR end "rule__Project__Group_9__3__Impl"


    // $ANTLR start "rule__Assumption__Group__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2156:1: rule__Assumption__Group__0 : rule__Assumption__Group__0__Impl rule__Assumption__Group__1 ;
    public final void rule__Assumption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2160:1: ( rule__Assumption__Group__0__Impl rule__Assumption__Group__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2161:2: rule__Assumption__Group__0__Impl rule__Assumption__Group__1
            {
            pushFollow(FOLLOW_rule__Assumption__Group__0__Impl_in_rule__Assumption__Group__04337);
            rule__Assumption__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assumption__Group__1_in_rule__Assumption__Group__04340);
            rule__Assumption__Group__1();

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
    // $ANTLR end "rule__Assumption__Group__0"


    // $ANTLR start "rule__Assumption__Group__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2168:1: rule__Assumption__Group__0__Impl : ( '-' ) ;
    public final void rule__Assumption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2172:1: ( ( '-' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2173:1: ( '-' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2173:1: ( '-' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2174:1: '-'
            {
             before(grammarAccess.getAssumptionAccess().getHyphenMinusKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Assumption__Group__0__Impl4368); 
             after(grammarAccess.getAssumptionAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__Assumption__Group__0__Impl"


    // $ANTLR start "rule__Assumption__Group__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2187:1: rule__Assumption__Group__1 : rule__Assumption__Group__1__Impl rule__Assumption__Group__2 ;
    public final void rule__Assumption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2191:1: ( rule__Assumption__Group__1__Impl rule__Assumption__Group__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2192:2: rule__Assumption__Group__1__Impl rule__Assumption__Group__2
            {
            pushFollow(FOLLOW_rule__Assumption__Group__1__Impl_in_rule__Assumption__Group__14399);
            rule__Assumption__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assumption__Group__2_in_rule__Assumption__Group__14402);
            rule__Assumption__Group__2();

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
    // $ANTLR end "rule__Assumption__Group__1"


    // $ANTLR start "rule__Assumption__Group__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2199:1: rule__Assumption__Group__1__Impl : ( ( rule__Assumption__ValueAssignment_1 ) ) ;
    public final void rule__Assumption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2203:1: ( ( ( rule__Assumption__ValueAssignment_1 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2204:1: ( ( rule__Assumption__ValueAssignment_1 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2204:1: ( ( rule__Assumption__ValueAssignment_1 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2205:1: ( rule__Assumption__ValueAssignment_1 )
            {
             before(grammarAccess.getAssumptionAccess().getValueAssignment_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2206:1: ( rule__Assumption__ValueAssignment_1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2206:2: rule__Assumption__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__Assumption__ValueAssignment_1_in_rule__Assumption__Group__1__Impl4429);
            rule__Assumption__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAssumptionAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__Assumption__Group__1__Impl"


    // $ANTLR start "rule__Assumption__Group__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2216:1: rule__Assumption__Group__2 : rule__Assumption__Group__2__Impl ;
    public final void rule__Assumption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2220:1: ( rule__Assumption__Group__2__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2221:2: rule__Assumption__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Assumption__Group__2__Impl_in_rule__Assumption__Group__24459);
            rule__Assumption__Group__2__Impl();

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
    // $ANTLR end "rule__Assumption__Group__2"


    // $ANTLR start "rule__Assumption__Group__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2227:1: rule__Assumption__Group__2__Impl : ( ruleENDLINE ) ;
    public final void rule__Assumption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2231:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2232:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2232:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2233:1: ruleENDLINE
            {
             before(grammarAccess.getAssumptionAccess().getENDLINEParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__Assumption__Group__2__Impl4486);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getAssumptionAccess().getENDLINEParserRuleCall_2()); 

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
    // $ANTLR end "rule__Assumption__Group__2__Impl"


    // $ANTLR start "rule__Constraint__Group__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2250:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2254:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2255:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
            {
            pushFollow(FOLLOW_rule__Constraint__Group__0__Impl_in_rule__Constraint__Group__04521);
            rule__Constraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__1_in_rule__Constraint__Group__04524);
            rule__Constraint__Group__1();

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
    // $ANTLR end "rule__Constraint__Group__0"


    // $ANTLR start "rule__Constraint__Group__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2262:1: rule__Constraint__Group__0__Impl : ( '-' ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2266:1: ( ( '-' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2267:1: ( '-' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2267:1: ( '-' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2268:1: '-'
            {
             before(grammarAccess.getConstraintAccess().getHyphenMinusKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Constraint__Group__0__Impl4552); 
             after(grammarAccess.getConstraintAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__Constraint__Group__0__Impl"


    // $ANTLR start "rule__Constraint__Group__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2281:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2285:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2286:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
            {
            pushFollow(FOLLOW_rule__Constraint__Group__1__Impl_in_rule__Constraint__Group__14583);
            rule__Constraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__2_in_rule__Constraint__Group__14586);
            rule__Constraint__Group__2();

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
    // $ANTLR end "rule__Constraint__Group__1"


    // $ANTLR start "rule__Constraint__Group__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2293:1: rule__Constraint__Group__1__Impl : ( ( rule__Constraint__ValueAssignment_1 ) ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2297:1: ( ( ( rule__Constraint__ValueAssignment_1 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2298:1: ( ( rule__Constraint__ValueAssignment_1 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2298:1: ( ( rule__Constraint__ValueAssignment_1 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2299:1: ( rule__Constraint__ValueAssignment_1 )
            {
             before(grammarAccess.getConstraintAccess().getValueAssignment_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2300:1: ( rule__Constraint__ValueAssignment_1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2300:2: rule__Constraint__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__Constraint__ValueAssignment_1_in_rule__Constraint__Group__1__Impl4613);
            rule__Constraint__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__Constraint__Group__1__Impl"


    // $ANTLR start "rule__Constraint__Group__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2310:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2314:1: ( rule__Constraint__Group__2__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2315:2: rule__Constraint__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Constraint__Group__2__Impl_in_rule__Constraint__Group__24643);
            rule__Constraint__Group__2__Impl();

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
    // $ANTLR end "rule__Constraint__Group__2"


    // $ANTLR start "rule__Constraint__Group__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2321:1: rule__Constraint__Group__2__Impl : ( ruleENDLINE ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2325:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2326:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2326:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2327:1: ruleENDLINE
            {
             before(grammarAccess.getConstraintAccess().getENDLINEParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__Constraint__Group__2__Impl4670);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getENDLINEParserRuleCall_2()); 

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
    // $ANTLR end "rule__Constraint__Group__2__Impl"


    // $ANTLR start "rule__ActivityGroup__Group__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2344:1: rule__ActivityGroup__Group__0 : rule__ActivityGroup__Group__0__Impl rule__ActivityGroup__Group__1 ;
    public final void rule__ActivityGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2348:1: ( rule__ActivityGroup__Group__0__Impl rule__ActivityGroup__Group__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2349:2: rule__ActivityGroup__Group__0__Impl rule__ActivityGroup__Group__1
            {
            pushFollow(FOLLOW_rule__ActivityGroup__Group__0__Impl_in_rule__ActivityGroup__Group__04705);
            rule__ActivityGroup__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityGroup__Group__1_in_rule__ActivityGroup__Group__04708);
            rule__ActivityGroup__Group__1();

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
    // $ANTLR end "rule__ActivityGroup__Group__0"


    // $ANTLR start "rule__ActivityGroup__Group__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2356:1: rule__ActivityGroup__Group__0__Impl : ( ( rule__ActivityGroup__DescriptionAssignment_0 )? ) ;
    public final void rule__ActivityGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2360:1: ( ( ( rule__ActivityGroup__DescriptionAssignment_0 )? ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2361:1: ( ( rule__ActivityGroup__DescriptionAssignment_0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2361:1: ( ( rule__ActivityGroup__DescriptionAssignment_0 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2362:1: ( rule__ActivityGroup__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getActivityGroupAccess().getDescriptionAssignment_0()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2363:1: ( rule__ActivityGroup__DescriptionAssignment_0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ML_COMMENT) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2363:2: rule__ActivityGroup__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ActivityGroup__DescriptionAssignment_0_in_rule__ActivityGroup__Group__0__Impl4735);
                    rule__ActivityGroup__DescriptionAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivityGroupAccess().getDescriptionAssignment_0()); 

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
    // $ANTLR end "rule__ActivityGroup__Group__0__Impl"


    // $ANTLR start "rule__ActivityGroup__Group__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2373:1: rule__ActivityGroup__Group__1 : rule__ActivityGroup__Group__1__Impl rule__ActivityGroup__Group__2 ;
    public final void rule__ActivityGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2377:1: ( rule__ActivityGroup__Group__1__Impl rule__ActivityGroup__Group__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2378:2: rule__ActivityGroup__Group__1__Impl rule__ActivityGroup__Group__2
            {
            pushFollow(FOLLOW_rule__ActivityGroup__Group__1__Impl_in_rule__ActivityGroup__Group__14766);
            rule__ActivityGroup__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityGroup__Group__2_in_rule__ActivityGroup__Group__14769);
            rule__ActivityGroup__Group__2();

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
    // $ANTLR end "rule__ActivityGroup__Group__1"


    // $ANTLR start "rule__ActivityGroup__Group__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2385:1: rule__ActivityGroup__Group__1__Impl : ( 'Group' ) ;
    public final void rule__ActivityGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2389:1: ( ( 'Group' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2390:1: ( 'Group' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2390:1: ( 'Group' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2391:1: 'Group'
            {
             before(grammarAccess.getActivityGroupAccess().getGroupKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__ActivityGroup__Group__1__Impl4797); 
             after(grammarAccess.getActivityGroupAccess().getGroupKeyword_1()); 

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
    // $ANTLR end "rule__ActivityGroup__Group__1__Impl"


    // $ANTLR start "rule__ActivityGroup__Group__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2404:1: rule__ActivityGroup__Group__2 : rule__ActivityGroup__Group__2__Impl rule__ActivityGroup__Group__3 ;
    public final void rule__ActivityGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2408:1: ( rule__ActivityGroup__Group__2__Impl rule__ActivityGroup__Group__3 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2409:2: rule__ActivityGroup__Group__2__Impl rule__ActivityGroup__Group__3
            {
            pushFollow(FOLLOW_rule__ActivityGroup__Group__2__Impl_in_rule__ActivityGroup__Group__24828);
            rule__ActivityGroup__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityGroup__Group__3_in_rule__ActivityGroup__Group__24831);
            rule__ActivityGroup__Group__3();

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
    // $ANTLR end "rule__ActivityGroup__Group__2"


    // $ANTLR start "rule__ActivityGroup__Group__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2416:1: rule__ActivityGroup__Group__2__Impl : ( ( rule__ActivityGroup__NameAssignment_2 ) ) ;
    public final void rule__ActivityGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2420:1: ( ( ( rule__ActivityGroup__NameAssignment_2 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2421:1: ( ( rule__ActivityGroup__NameAssignment_2 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2421:1: ( ( rule__ActivityGroup__NameAssignment_2 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2422:1: ( rule__ActivityGroup__NameAssignment_2 )
            {
             before(grammarAccess.getActivityGroupAccess().getNameAssignment_2()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2423:1: ( rule__ActivityGroup__NameAssignment_2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2423:2: rule__ActivityGroup__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ActivityGroup__NameAssignment_2_in_rule__ActivityGroup__Group__2__Impl4858);
            rule__ActivityGroup__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getActivityGroupAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__ActivityGroup__Group__2__Impl"


    // $ANTLR start "rule__ActivityGroup__Group__3"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2433:1: rule__ActivityGroup__Group__3 : rule__ActivityGroup__Group__3__Impl rule__ActivityGroup__Group__4 ;
    public final void rule__ActivityGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2437:1: ( rule__ActivityGroup__Group__3__Impl rule__ActivityGroup__Group__4 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2438:2: rule__ActivityGroup__Group__3__Impl rule__ActivityGroup__Group__4
            {
            pushFollow(FOLLOW_rule__ActivityGroup__Group__3__Impl_in_rule__ActivityGroup__Group__34888);
            rule__ActivityGroup__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityGroup__Group__4_in_rule__ActivityGroup__Group__34891);
            rule__ActivityGroup__Group__4();

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
    // $ANTLR end "rule__ActivityGroup__Group__3"


    // $ANTLR start "rule__ActivityGroup__Group__3__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2445:1: rule__ActivityGroup__Group__3__Impl : ( RULE_OPENCURLY ) ;
    public final void rule__ActivityGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2449:1: ( ( RULE_OPENCURLY ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2450:1: ( RULE_OPENCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2450:1: ( RULE_OPENCURLY )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2451:1: RULE_OPENCURLY
            {
             before(grammarAccess.getActivityGroupAccess().getOPENCURLYTerminalRuleCall_3()); 
            match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_rule__ActivityGroup__Group__3__Impl4918); 
             after(grammarAccess.getActivityGroupAccess().getOPENCURLYTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__ActivityGroup__Group__3__Impl"


    // $ANTLR start "rule__ActivityGroup__Group__4"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2462:1: rule__ActivityGroup__Group__4 : rule__ActivityGroup__Group__4__Impl rule__ActivityGroup__Group__5 ;
    public final void rule__ActivityGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2466:1: ( rule__ActivityGroup__Group__4__Impl rule__ActivityGroup__Group__5 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2467:2: rule__ActivityGroup__Group__4__Impl rule__ActivityGroup__Group__5
            {
            pushFollow(FOLLOW_rule__ActivityGroup__Group__4__Impl_in_rule__ActivityGroup__Group__44947);
            rule__ActivityGroup__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityGroup__Group__5_in_rule__ActivityGroup__Group__44950);
            rule__ActivityGroup__Group__5();

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
    // $ANTLR end "rule__ActivityGroup__Group__4"


    // $ANTLR start "rule__ActivityGroup__Group__4__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2474:1: rule__ActivityGroup__Group__4__Impl : ( ( rule__ActivityGroup__Group_4__0 )? ) ;
    public final void rule__ActivityGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2478:1: ( ( ( rule__ActivityGroup__Group_4__0 )? ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2479:1: ( ( rule__ActivityGroup__Group_4__0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2479:1: ( ( rule__ActivityGroup__Group_4__0 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2480:1: ( rule__ActivityGroup__Group_4__0 )?
            {
             before(grammarAccess.getActivityGroupAccess().getGroup_4()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2481:1: ( rule__ActivityGroup__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==19) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2481:2: rule__ActivityGroup__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__ActivityGroup__Group_4__0_in_rule__ActivityGroup__Group__4__Impl4977);
                    rule__ActivityGroup__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivityGroupAccess().getGroup_4()); 

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
    // $ANTLR end "rule__ActivityGroup__Group__4__Impl"


    // $ANTLR start "rule__ActivityGroup__Group__5"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2491:1: rule__ActivityGroup__Group__5 : rule__ActivityGroup__Group__5__Impl rule__ActivityGroup__Group__6 ;
    public final void rule__ActivityGroup__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2495:1: ( rule__ActivityGroup__Group__5__Impl rule__ActivityGroup__Group__6 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2496:2: rule__ActivityGroup__Group__5__Impl rule__ActivityGroup__Group__6
            {
            pushFollow(FOLLOW_rule__ActivityGroup__Group__5__Impl_in_rule__ActivityGroup__Group__55008);
            rule__ActivityGroup__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityGroup__Group__6_in_rule__ActivityGroup__Group__55011);
            rule__ActivityGroup__Group__6();

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
    // $ANTLR end "rule__ActivityGroup__Group__5"


    // $ANTLR start "rule__ActivityGroup__Group__5__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2503:1: rule__ActivityGroup__Group__5__Impl : ( ( rule__ActivityGroup__Group_5__0 )? ) ;
    public final void rule__ActivityGroup__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2507:1: ( ( ( rule__ActivityGroup__Group_5__0 )? ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2508:1: ( ( rule__ActivityGroup__Group_5__0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2508:1: ( ( rule__ActivityGroup__Group_5__0 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2509:1: ( rule__ActivityGroup__Group_5__0 )?
            {
             before(grammarAccess.getActivityGroupAccess().getGroup_5()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2510:1: ( rule__ActivityGroup__Group_5__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==26) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2510:2: rule__ActivityGroup__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__ActivityGroup__Group_5__0_in_rule__ActivityGroup__Group__5__Impl5038);
                    rule__ActivityGroup__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivityGroupAccess().getGroup_5()); 

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
    // $ANTLR end "rule__ActivityGroup__Group__5__Impl"


    // $ANTLR start "rule__ActivityGroup__Group__6"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2520:1: rule__ActivityGroup__Group__6 : rule__ActivityGroup__Group__6__Impl rule__ActivityGroup__Group__7 ;
    public final void rule__ActivityGroup__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2524:1: ( rule__ActivityGroup__Group__6__Impl rule__ActivityGroup__Group__7 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2525:2: rule__ActivityGroup__Group__6__Impl rule__ActivityGroup__Group__7
            {
            pushFollow(FOLLOW_rule__ActivityGroup__Group__6__Impl_in_rule__ActivityGroup__Group__65069);
            rule__ActivityGroup__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityGroup__Group__7_in_rule__ActivityGroup__Group__65072);
            rule__ActivityGroup__Group__7();

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
    // $ANTLR end "rule__ActivityGroup__Group__6"


    // $ANTLR start "rule__ActivityGroup__Group__6__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2532:1: rule__ActivityGroup__Group__6__Impl : ( ( rule__ActivityGroup__Group_6__0 )? ) ;
    public final void rule__ActivityGroup__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2536:1: ( ( ( rule__ActivityGroup__Group_6__0 )? ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2537:1: ( ( rule__ActivityGroup__Group_6__0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2537:1: ( ( rule__ActivityGroup__Group_6__0 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2538:1: ( rule__ActivityGroup__Group_6__0 )?
            {
             before(grammarAccess.getActivityGroupAccess().getGroup_6()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2539:1: ( rule__ActivityGroup__Group_6__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==27) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2539:2: rule__ActivityGroup__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__ActivityGroup__Group_6__0_in_rule__ActivityGroup__Group__6__Impl5099);
                    rule__ActivityGroup__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivityGroupAccess().getGroup_6()); 

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
    // $ANTLR end "rule__ActivityGroup__Group__6__Impl"


    // $ANTLR start "rule__ActivityGroup__Group__7"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2549:1: rule__ActivityGroup__Group__7 : rule__ActivityGroup__Group__7__Impl rule__ActivityGroup__Group__8 ;
    public final void rule__ActivityGroup__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2553:1: ( rule__ActivityGroup__Group__7__Impl rule__ActivityGroup__Group__8 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2554:2: rule__ActivityGroup__Group__7__Impl rule__ActivityGroup__Group__8
            {
            pushFollow(FOLLOW_rule__ActivityGroup__Group__7__Impl_in_rule__ActivityGroup__Group__75130);
            rule__ActivityGroup__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityGroup__Group__8_in_rule__ActivityGroup__Group__75133);
            rule__ActivityGroup__Group__8();

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
    // $ANTLR end "rule__ActivityGroup__Group__7"


    // $ANTLR start "rule__ActivityGroup__Group__7__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2561:1: rule__ActivityGroup__Group__7__Impl : ( ( rule__ActivityGroup__ActivitiesAssignment_7 )* ) ;
    public final void rule__ActivityGroup__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2565:1: ( ( ( rule__ActivityGroup__ActivitiesAssignment_7 )* ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2566:1: ( ( rule__ActivityGroup__ActivitiesAssignment_7 )* )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2566:1: ( ( rule__ActivityGroup__ActivitiesAssignment_7 )* )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2567:1: ( rule__ActivityGroup__ActivitiesAssignment_7 )*
            {
             before(grammarAccess.getActivityGroupAccess().getActivitiesAssignment_7()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2568:1: ( rule__ActivityGroup__ActivitiesAssignment_7 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ML_COMMENT||LA26_0==25||LA26_0==32||(LA26_0>=34 && LA26_0<=35)||LA26_0==37||LA26_0==41) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2568:2: rule__ActivityGroup__ActivitiesAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__ActivityGroup__ActivitiesAssignment_7_in_rule__ActivityGroup__Group__7__Impl5160);
            	    rule__ActivityGroup__ActivitiesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getActivityGroupAccess().getActivitiesAssignment_7()); 

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
    // $ANTLR end "rule__ActivityGroup__Group__7__Impl"


    // $ANTLR start "rule__ActivityGroup__Group__8"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2578:1: rule__ActivityGroup__Group__8 : rule__ActivityGroup__Group__8__Impl ;
    public final void rule__ActivityGroup__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2582:1: ( rule__ActivityGroup__Group__8__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2583:2: rule__ActivityGroup__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__ActivityGroup__Group__8__Impl_in_rule__ActivityGroup__Group__85191);
            rule__ActivityGroup__Group__8__Impl();

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
    // $ANTLR end "rule__ActivityGroup__Group__8"


    // $ANTLR start "rule__ActivityGroup__Group__8__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2589:1: rule__ActivityGroup__Group__8__Impl : ( RULE_CLOSEDCURLY ) ;
    public final void rule__ActivityGroup__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2593:1: ( ( RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2594:1: ( RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2594:1: ( RULE_CLOSEDCURLY )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2595:1: RULE_CLOSEDCURLY
            {
             before(grammarAccess.getActivityGroupAccess().getCLOSEDCURLYTerminalRuleCall_8()); 
            match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_rule__ActivityGroup__Group__8__Impl5218); 
             after(grammarAccess.getActivityGroupAccess().getCLOSEDCURLYTerminalRuleCall_8()); 

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
    // $ANTLR end "rule__ActivityGroup__Group__8__Impl"


    // $ANTLR start "rule__ActivityGroup__Group_4__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2624:1: rule__ActivityGroup__Group_4__0 : rule__ActivityGroup__Group_4__0__Impl rule__ActivityGroup__Group_4__1 ;
    public final void rule__ActivityGroup__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2628:1: ( rule__ActivityGroup__Group_4__0__Impl rule__ActivityGroup__Group_4__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2629:2: rule__ActivityGroup__Group_4__0__Impl rule__ActivityGroup__Group_4__1
            {
            pushFollow(FOLLOW_rule__ActivityGroup__Group_4__0__Impl_in_rule__ActivityGroup__Group_4__05265);
            rule__ActivityGroup__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityGroup__Group_4__1_in_rule__ActivityGroup__Group_4__05268);
            rule__ActivityGroup__Group_4__1();

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
    // $ANTLR end "rule__ActivityGroup__Group_4__0"


    // $ANTLR start "rule__ActivityGroup__Group_4__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2636:1: rule__ActivityGroup__Group_4__0__Impl : ( 'name' ) ;
    public final void rule__ActivityGroup__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2640:1: ( ( 'name' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2641:1: ( 'name' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2641:1: ( 'name' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2642:1: 'name'
            {
             before(grammarAccess.getActivityGroupAccess().getNameKeyword_4_0()); 
            match(input,19,FOLLOW_19_in_rule__ActivityGroup__Group_4__0__Impl5296); 
             after(grammarAccess.getActivityGroupAccess().getNameKeyword_4_0()); 

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
    // $ANTLR end "rule__ActivityGroup__Group_4__0__Impl"


    // $ANTLR start "rule__ActivityGroup__Group_4__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2655:1: rule__ActivityGroup__Group_4__1 : rule__ActivityGroup__Group_4__1__Impl rule__ActivityGroup__Group_4__2 ;
    public final void rule__ActivityGroup__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2659:1: ( rule__ActivityGroup__Group_4__1__Impl rule__ActivityGroup__Group_4__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2660:2: rule__ActivityGroup__Group_4__1__Impl rule__ActivityGroup__Group_4__2
            {
            pushFollow(FOLLOW_rule__ActivityGroup__Group_4__1__Impl_in_rule__ActivityGroup__Group_4__15327);
            rule__ActivityGroup__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityGroup__Group_4__2_in_rule__ActivityGroup__Group_4__15330);
            rule__ActivityGroup__Group_4__2();

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
    // $ANTLR end "rule__ActivityGroup__Group_4__1"


    // $ANTLR start "rule__ActivityGroup__Group_4__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2667:1: rule__ActivityGroup__Group_4__1__Impl : ( ( rule__ActivityGroup__LongNameAssignment_4_1 ) ) ;
    public final void rule__ActivityGroup__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2671:1: ( ( ( rule__ActivityGroup__LongNameAssignment_4_1 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2672:1: ( ( rule__ActivityGroup__LongNameAssignment_4_1 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2672:1: ( ( rule__ActivityGroup__LongNameAssignment_4_1 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2673:1: ( rule__ActivityGroup__LongNameAssignment_4_1 )
            {
             before(grammarAccess.getActivityGroupAccess().getLongNameAssignment_4_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2674:1: ( rule__ActivityGroup__LongNameAssignment_4_1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2674:2: rule__ActivityGroup__LongNameAssignment_4_1
            {
            pushFollow(FOLLOW_rule__ActivityGroup__LongNameAssignment_4_1_in_rule__ActivityGroup__Group_4__1__Impl5357);
            rule__ActivityGroup__LongNameAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityGroupAccess().getLongNameAssignment_4_1()); 

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
    // $ANTLR end "rule__ActivityGroup__Group_4__1__Impl"


    // $ANTLR start "rule__ActivityGroup__Group_4__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2684:1: rule__ActivityGroup__Group_4__2 : rule__ActivityGroup__Group_4__2__Impl ;
    public final void rule__ActivityGroup__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2688:1: ( rule__ActivityGroup__Group_4__2__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2689:2: rule__ActivityGroup__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__ActivityGroup__Group_4__2__Impl_in_rule__ActivityGroup__Group_4__25387);
            rule__ActivityGroup__Group_4__2__Impl();

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
    // $ANTLR end "rule__ActivityGroup__Group_4__2"


    // $ANTLR start "rule__ActivityGroup__Group_4__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2695:1: rule__ActivityGroup__Group_4__2__Impl : ( ruleENDLINE ) ;
    public final void rule__ActivityGroup__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2699:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2700:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2700:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2701:1: ruleENDLINE
            {
             before(grammarAccess.getActivityGroupAccess().getENDLINEParserRuleCall_4_2()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__ActivityGroup__Group_4__2__Impl5414);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getActivityGroupAccess().getENDLINEParserRuleCall_4_2()); 

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
    // $ANTLR end "rule__ActivityGroup__Group_4__2__Impl"


    // $ANTLR start "rule__ActivityGroup__Group_5__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2718:1: rule__ActivityGroup__Group_5__0 : rule__ActivityGroup__Group_5__0__Impl rule__ActivityGroup__Group_5__1 ;
    public final void rule__ActivityGroup__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2722:1: ( rule__ActivityGroup__Group_5__0__Impl rule__ActivityGroup__Group_5__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2723:2: rule__ActivityGroup__Group_5__0__Impl rule__ActivityGroup__Group_5__1
            {
            pushFollow(FOLLOW_rule__ActivityGroup__Group_5__0__Impl_in_rule__ActivityGroup__Group_5__05449);
            rule__ActivityGroup__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityGroup__Group_5__1_in_rule__ActivityGroup__Group_5__05452);
            rule__ActivityGroup__Group_5__1();

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
    // $ANTLR end "rule__ActivityGroup__Group_5__0"


    // $ANTLR start "rule__ActivityGroup__Group_5__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2730:1: rule__ActivityGroup__Group_5__0__Impl : ( 'wbsActivity' ) ;
    public final void rule__ActivityGroup__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2734:1: ( ( 'wbsActivity' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2735:1: ( 'wbsActivity' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2735:1: ( 'wbsActivity' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2736:1: 'wbsActivity'
            {
             before(grammarAccess.getActivityGroupAccess().getWbsActivityKeyword_5_0()); 
            match(input,26,FOLLOW_26_in_rule__ActivityGroup__Group_5__0__Impl5480); 
             after(grammarAccess.getActivityGroupAccess().getWbsActivityKeyword_5_0()); 

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
    // $ANTLR end "rule__ActivityGroup__Group_5__0__Impl"


    // $ANTLR start "rule__ActivityGroup__Group_5__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2749:1: rule__ActivityGroup__Group_5__1 : rule__ActivityGroup__Group_5__1__Impl rule__ActivityGroup__Group_5__2 ;
    public final void rule__ActivityGroup__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2753:1: ( rule__ActivityGroup__Group_5__1__Impl rule__ActivityGroup__Group_5__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2754:2: rule__ActivityGroup__Group_5__1__Impl rule__ActivityGroup__Group_5__2
            {
            pushFollow(FOLLOW_rule__ActivityGroup__Group_5__1__Impl_in_rule__ActivityGroup__Group_5__15511);
            rule__ActivityGroup__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityGroup__Group_5__2_in_rule__ActivityGroup__Group_5__15514);
            rule__ActivityGroup__Group_5__2();

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
    // $ANTLR end "rule__ActivityGroup__Group_5__1"


    // $ANTLR start "rule__ActivityGroup__Group_5__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2761:1: rule__ActivityGroup__Group_5__1__Impl : ( ( rule__ActivityGroup__WbsActivityAssignment_5_1 )* ) ;
    public final void rule__ActivityGroup__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2765:1: ( ( ( rule__ActivityGroup__WbsActivityAssignment_5_1 )* ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2766:1: ( ( rule__ActivityGroup__WbsActivityAssignment_5_1 )* )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2766:1: ( ( rule__ActivityGroup__WbsActivityAssignment_5_1 )* )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2767:1: ( rule__ActivityGroup__WbsActivityAssignment_5_1 )*
            {
             before(grammarAccess.getActivityGroupAccess().getWbsActivityAssignment_5_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2768:1: ( rule__ActivityGroup__WbsActivityAssignment_5_1 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2768:2: rule__ActivityGroup__WbsActivityAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_rule__ActivityGroup__WbsActivityAssignment_5_1_in_rule__ActivityGroup__Group_5__1__Impl5541);
            	    rule__ActivityGroup__WbsActivityAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getActivityGroupAccess().getWbsActivityAssignment_5_1()); 

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
    // $ANTLR end "rule__ActivityGroup__Group_5__1__Impl"


    // $ANTLR start "rule__ActivityGroup__Group_5__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2778:1: rule__ActivityGroup__Group_5__2 : rule__ActivityGroup__Group_5__2__Impl ;
    public final void rule__ActivityGroup__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2782:1: ( rule__ActivityGroup__Group_5__2__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2783:2: rule__ActivityGroup__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__ActivityGroup__Group_5__2__Impl_in_rule__ActivityGroup__Group_5__25572);
            rule__ActivityGroup__Group_5__2__Impl();

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
    // $ANTLR end "rule__ActivityGroup__Group_5__2"


    // $ANTLR start "rule__ActivityGroup__Group_5__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2789:1: rule__ActivityGroup__Group_5__2__Impl : ( ruleENDLINE ) ;
    public final void rule__ActivityGroup__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2793:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2794:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2794:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2795:1: ruleENDLINE
            {
             before(grammarAccess.getActivityGroupAccess().getENDLINEParserRuleCall_5_2()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__ActivityGroup__Group_5__2__Impl5599);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getActivityGroupAccess().getENDLINEParserRuleCall_5_2()); 

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
    // $ANTLR end "rule__ActivityGroup__Group_5__2__Impl"


    // $ANTLR start "rule__ActivityGroup__Group_6__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2812:1: rule__ActivityGroup__Group_6__0 : rule__ActivityGroup__Group_6__0__Impl rule__ActivityGroup__Group_6__1 ;
    public final void rule__ActivityGroup__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2816:1: ( rule__ActivityGroup__Group_6__0__Impl rule__ActivityGroup__Group_6__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2817:2: rule__ActivityGroup__Group_6__0__Impl rule__ActivityGroup__Group_6__1
            {
            pushFollow(FOLLOW_rule__ActivityGroup__Group_6__0__Impl_in_rule__ActivityGroup__Group_6__05634);
            rule__ActivityGroup__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityGroup__Group_6__1_in_rule__ActivityGroup__Group_6__05637);
            rule__ActivityGroup__Group_6__1();

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
    // $ANTLR end "rule__ActivityGroup__Group_6__0"


    // $ANTLR start "rule__ActivityGroup__Group_6__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2824:1: rule__ActivityGroup__Group_6__0__Impl : ( 'dependsOn' ) ;
    public final void rule__ActivityGroup__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2828:1: ( ( 'dependsOn' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2829:1: ( 'dependsOn' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2829:1: ( 'dependsOn' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2830:1: 'dependsOn'
            {
             before(grammarAccess.getActivityGroupAccess().getDependsOnKeyword_6_0()); 
            match(input,27,FOLLOW_27_in_rule__ActivityGroup__Group_6__0__Impl5665); 
             after(grammarAccess.getActivityGroupAccess().getDependsOnKeyword_6_0()); 

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
    // $ANTLR end "rule__ActivityGroup__Group_6__0__Impl"


    // $ANTLR start "rule__ActivityGroup__Group_6__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2843:1: rule__ActivityGroup__Group_6__1 : rule__ActivityGroup__Group_6__1__Impl rule__ActivityGroup__Group_6__2 ;
    public final void rule__ActivityGroup__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2847:1: ( rule__ActivityGroup__Group_6__1__Impl rule__ActivityGroup__Group_6__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2848:2: rule__ActivityGroup__Group_6__1__Impl rule__ActivityGroup__Group_6__2
            {
            pushFollow(FOLLOW_rule__ActivityGroup__Group_6__1__Impl_in_rule__ActivityGroup__Group_6__15696);
            rule__ActivityGroup__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActivityGroup__Group_6__2_in_rule__ActivityGroup__Group_6__15699);
            rule__ActivityGroup__Group_6__2();

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
    // $ANTLR end "rule__ActivityGroup__Group_6__1"


    // $ANTLR start "rule__ActivityGroup__Group_6__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2855:1: rule__ActivityGroup__Group_6__1__Impl : ( ( rule__ActivityGroup__DependenciesAssignment_6_1 )* ) ;
    public final void rule__ActivityGroup__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2859:1: ( ( ( rule__ActivityGroup__DependenciesAssignment_6_1 )* ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2860:1: ( ( rule__ActivityGroup__DependenciesAssignment_6_1 )* )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2860:1: ( ( rule__ActivityGroup__DependenciesAssignment_6_1 )* )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2861:1: ( rule__ActivityGroup__DependenciesAssignment_6_1 )*
            {
             before(grammarAccess.getActivityGroupAccess().getDependenciesAssignment_6_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2862:1: ( rule__ActivityGroup__DependenciesAssignment_6_1 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2862:2: rule__ActivityGroup__DependenciesAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_rule__ActivityGroup__DependenciesAssignment_6_1_in_rule__ActivityGroup__Group_6__1__Impl5726);
            	    rule__ActivityGroup__DependenciesAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getActivityGroupAccess().getDependenciesAssignment_6_1()); 

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
    // $ANTLR end "rule__ActivityGroup__Group_6__1__Impl"


    // $ANTLR start "rule__ActivityGroup__Group_6__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2872:1: rule__ActivityGroup__Group_6__2 : rule__ActivityGroup__Group_6__2__Impl ;
    public final void rule__ActivityGroup__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2876:1: ( rule__ActivityGroup__Group_6__2__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2877:2: rule__ActivityGroup__Group_6__2__Impl
            {
            pushFollow(FOLLOW_rule__ActivityGroup__Group_6__2__Impl_in_rule__ActivityGroup__Group_6__25757);
            rule__ActivityGroup__Group_6__2__Impl();

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
    // $ANTLR end "rule__ActivityGroup__Group_6__2"


    // $ANTLR start "rule__ActivityGroup__Group_6__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2883:1: rule__ActivityGroup__Group_6__2__Impl : ( ruleENDLINE ) ;
    public final void rule__ActivityGroup__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2887:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2888:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2888:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2889:1: ruleENDLINE
            {
             before(grammarAccess.getActivityGroupAccess().getENDLINEParserRuleCall_6_2()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__ActivityGroup__Group_6__2__Impl5784);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getActivityGroupAccess().getENDLINEParserRuleCall_6_2()); 

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
    // $ANTLR end "rule__ActivityGroup__Group_6__2__Impl"


    // $ANTLR start "rule__WBSImport__Group__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2906:1: rule__WBSImport__Group__0 : rule__WBSImport__Group__0__Impl rule__WBSImport__Group__1 ;
    public final void rule__WBSImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2910:1: ( rule__WBSImport__Group__0__Impl rule__WBSImport__Group__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2911:2: rule__WBSImport__Group__0__Impl rule__WBSImport__Group__1
            {
            pushFollow(FOLLOW_rule__WBSImport__Group__0__Impl_in_rule__WBSImport__Group__05819);
            rule__WBSImport__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WBSImport__Group__1_in_rule__WBSImport__Group__05822);
            rule__WBSImport__Group__1();

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
    // $ANTLR end "rule__WBSImport__Group__0"


    // $ANTLR start "rule__WBSImport__Group__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2918:1: rule__WBSImport__Group__0__Impl : ( 'wbs' ) ;
    public final void rule__WBSImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2922:1: ( ( 'wbs' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2923:1: ( 'wbs' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2923:1: ( 'wbs' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2924:1: 'wbs'
            {
             before(grammarAccess.getWBSImportAccess().getWbsKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__WBSImport__Group__0__Impl5850); 
             after(grammarAccess.getWBSImportAccess().getWbsKeyword_0()); 

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
    // $ANTLR end "rule__WBSImport__Group__0__Impl"


    // $ANTLR start "rule__WBSImport__Group__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2937:1: rule__WBSImport__Group__1 : rule__WBSImport__Group__1__Impl ;
    public final void rule__WBSImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2941:1: ( rule__WBSImport__Group__1__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2942:2: rule__WBSImport__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__WBSImport__Group__1__Impl_in_rule__WBSImport__Group__15881);
            rule__WBSImport__Group__1__Impl();

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
    // $ANTLR end "rule__WBSImport__Group__1"


    // $ANTLR start "rule__WBSImport__Group__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2948:1: rule__WBSImport__Group__1__Impl : ( ( rule__WBSImport__ImportURIAssignment_1 ) ) ;
    public final void rule__WBSImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2952:1: ( ( ( rule__WBSImport__ImportURIAssignment_1 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2953:1: ( ( rule__WBSImport__ImportURIAssignment_1 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2953:1: ( ( rule__WBSImport__ImportURIAssignment_1 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2954:1: ( rule__WBSImport__ImportURIAssignment_1 )
            {
             before(grammarAccess.getWBSImportAccess().getImportURIAssignment_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2955:1: ( rule__WBSImport__ImportURIAssignment_1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2955:2: rule__WBSImport__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__WBSImport__ImportURIAssignment_1_in_rule__WBSImport__Group__1__Impl5908);
            rule__WBSImport__ImportURIAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWBSImportAccess().getImportURIAssignment_1()); 

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
    // $ANTLR end "rule__WBSImport__Group__1__Impl"


    // $ANTLR start "rule__ResourcesImport__Group__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2969:1: rule__ResourcesImport__Group__0 : rule__ResourcesImport__Group__0__Impl rule__ResourcesImport__Group__1 ;
    public final void rule__ResourcesImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2973:1: ( rule__ResourcesImport__Group__0__Impl rule__ResourcesImport__Group__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2974:2: rule__ResourcesImport__Group__0__Impl rule__ResourcesImport__Group__1
            {
            pushFollow(FOLLOW_rule__ResourcesImport__Group__0__Impl_in_rule__ResourcesImport__Group__05942);
            rule__ResourcesImport__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourcesImport__Group__1_in_rule__ResourcesImport__Group__05945);
            rule__ResourcesImport__Group__1();

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
    // $ANTLR end "rule__ResourcesImport__Group__0"


    // $ANTLR start "rule__ResourcesImport__Group__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2981:1: rule__ResourcesImport__Group__0__Impl : ( 'resources' ) ;
    public final void rule__ResourcesImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2985:1: ( ( 'resources' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2986:1: ( 'resources' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2986:1: ( 'resources' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:2987:1: 'resources'
            {
             before(grammarAccess.getResourcesImportAccess().getResourcesKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__ResourcesImport__Group__0__Impl5973); 
             after(grammarAccess.getResourcesImportAccess().getResourcesKeyword_0()); 

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
    // $ANTLR end "rule__ResourcesImport__Group__0__Impl"


    // $ANTLR start "rule__ResourcesImport__Group__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3000:1: rule__ResourcesImport__Group__1 : rule__ResourcesImport__Group__1__Impl ;
    public final void rule__ResourcesImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3004:1: ( rule__ResourcesImport__Group__1__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3005:2: rule__ResourcesImport__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ResourcesImport__Group__1__Impl_in_rule__ResourcesImport__Group__16004);
            rule__ResourcesImport__Group__1__Impl();

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
    // $ANTLR end "rule__ResourcesImport__Group__1"


    // $ANTLR start "rule__ResourcesImport__Group__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3011:1: rule__ResourcesImport__Group__1__Impl : ( ( rule__ResourcesImport__ImportURIAssignment_1 ) ) ;
    public final void rule__ResourcesImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3015:1: ( ( ( rule__ResourcesImport__ImportURIAssignment_1 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3016:1: ( ( rule__ResourcesImport__ImportURIAssignment_1 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3016:1: ( ( rule__ResourcesImport__ImportURIAssignment_1 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3017:1: ( rule__ResourcesImport__ImportURIAssignment_1 )
            {
             before(grammarAccess.getResourcesImportAccess().getImportURIAssignment_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3018:1: ( rule__ResourcesImport__ImportURIAssignment_1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3018:2: rule__ResourcesImport__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__ResourcesImport__ImportURIAssignment_1_in_rule__ResourcesImport__Group__1__Impl6031);
            rule__ResourcesImport__ImportURIAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getResourcesImportAccess().getImportURIAssignment_1()); 

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
    // $ANTLR end "rule__ResourcesImport__Group__1__Impl"


    // $ANTLR start "rule__PlanImport__Group__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3032:1: rule__PlanImport__Group__0 : rule__PlanImport__Group__0__Impl rule__PlanImport__Group__1 ;
    public final void rule__PlanImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3036:1: ( rule__PlanImport__Group__0__Impl rule__PlanImport__Group__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3037:2: rule__PlanImport__Group__0__Impl rule__PlanImport__Group__1
            {
            pushFollow(FOLLOW_rule__PlanImport__Group__0__Impl_in_rule__PlanImport__Group__06065);
            rule__PlanImport__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PlanImport__Group__1_in_rule__PlanImport__Group__06068);
            rule__PlanImport__Group__1();

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
    // $ANTLR end "rule__PlanImport__Group__0"


    // $ANTLR start "rule__PlanImport__Group__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3044:1: rule__PlanImport__Group__0__Impl : ( 'plan' ) ;
    public final void rule__PlanImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3048:1: ( ( 'plan' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3049:1: ( 'plan' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3049:1: ( 'plan' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3050:1: 'plan'
            {
             before(grammarAccess.getPlanImportAccess().getPlanKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__PlanImport__Group__0__Impl6096); 
             after(grammarAccess.getPlanImportAccess().getPlanKeyword_0()); 

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
    // $ANTLR end "rule__PlanImport__Group__0__Impl"


    // $ANTLR start "rule__PlanImport__Group__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3063:1: rule__PlanImport__Group__1 : rule__PlanImport__Group__1__Impl ;
    public final void rule__PlanImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3067:1: ( rule__PlanImport__Group__1__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3068:2: rule__PlanImport__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PlanImport__Group__1__Impl_in_rule__PlanImport__Group__16127);
            rule__PlanImport__Group__1__Impl();

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
    // $ANTLR end "rule__PlanImport__Group__1"


    // $ANTLR start "rule__PlanImport__Group__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3074:1: rule__PlanImport__Group__1__Impl : ( ( rule__PlanImport__ImportURIAssignment_1 ) ) ;
    public final void rule__PlanImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3078:1: ( ( ( rule__PlanImport__ImportURIAssignment_1 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3079:1: ( ( rule__PlanImport__ImportURIAssignment_1 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3079:1: ( ( rule__PlanImport__ImportURIAssignment_1 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3080:1: ( rule__PlanImport__ImportURIAssignment_1 )
            {
             before(grammarAccess.getPlanImportAccess().getImportURIAssignment_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3081:1: ( rule__PlanImport__ImportURIAssignment_1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3081:2: rule__PlanImport__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__PlanImport__ImportURIAssignment_1_in_rule__PlanImport__Group__1__Impl6154);
            rule__PlanImport__ImportURIAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPlanImportAccess().getImportURIAssignment_1()); 

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
    // $ANTLR end "rule__PlanImport__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3095:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3099:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3100:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__06188);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__06191);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3107:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3111:1: ( ( RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3112:1: ( RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3112:1: ( RULE_ID )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3113:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl6218); 
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3124:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3128:1: ( rule__QualifiedName__Group__1__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3129:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__16247);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3135:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3139:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3140:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3140:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3141:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3142:1: ( rule__QualifiedName__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==31) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3142:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl6274);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3156:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3160:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3161:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__06309);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__06312);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3168:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3172:1: ( ( '.' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3173:1: ( '.' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3173:1: ( '.' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3174:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,31,FOLLOW_31_in_rule__QualifiedName__Group_1__0__Impl6340); 
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3187:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3191:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3192:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__16371);
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
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3198:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3202:1: ( ( RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3203:1: ( RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3203:1: ( RULE_ID )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3204:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl6398); 
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


    // $ANTLR start "rule__CheckPoint__Group_0__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3220:1: rule__CheckPoint__Group_0__0 : rule__CheckPoint__Group_0__0__Impl rule__CheckPoint__Group_0__1 ;
    public final void rule__CheckPoint__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3224:1: ( rule__CheckPoint__Group_0__0__Impl rule__CheckPoint__Group_0__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3225:2: rule__CheckPoint__Group_0__0__Impl rule__CheckPoint__Group_0__1
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_0__0__Impl_in_rule__CheckPoint__Group_0__06432);
            rule__CheckPoint__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group_0__1_in_rule__CheckPoint__Group_0__06435);
            rule__CheckPoint__Group_0__1();

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
    // $ANTLR end "rule__CheckPoint__Group_0__0"


    // $ANTLR start "rule__CheckPoint__Group_0__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3232:1: rule__CheckPoint__Group_0__0__Impl : ( ( rule__CheckPoint__DescriptionAssignment_0_0 )? ) ;
    public final void rule__CheckPoint__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3236:1: ( ( ( rule__CheckPoint__DescriptionAssignment_0_0 )? ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3237:1: ( ( rule__CheckPoint__DescriptionAssignment_0_0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3237:1: ( ( rule__CheckPoint__DescriptionAssignment_0_0 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3238:1: ( rule__CheckPoint__DescriptionAssignment_0_0 )?
            {
             before(grammarAccess.getCheckPointAccess().getDescriptionAssignment_0_0()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3239:1: ( rule__CheckPoint__DescriptionAssignment_0_0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ML_COMMENT) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3239:2: rule__CheckPoint__DescriptionAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__CheckPoint__DescriptionAssignment_0_0_in_rule__CheckPoint__Group_0__0__Impl6462);
                    rule__CheckPoint__DescriptionAssignment_0_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCheckPointAccess().getDescriptionAssignment_0_0()); 

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
    // $ANTLR end "rule__CheckPoint__Group_0__0__Impl"


    // $ANTLR start "rule__CheckPoint__Group_0__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3249:1: rule__CheckPoint__Group_0__1 : rule__CheckPoint__Group_0__1__Impl rule__CheckPoint__Group_0__2 ;
    public final void rule__CheckPoint__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3253:1: ( rule__CheckPoint__Group_0__1__Impl rule__CheckPoint__Group_0__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3254:2: rule__CheckPoint__Group_0__1__Impl rule__CheckPoint__Group_0__2
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_0__1__Impl_in_rule__CheckPoint__Group_0__16493);
            rule__CheckPoint__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group_0__2_in_rule__CheckPoint__Group_0__16496);
            rule__CheckPoint__Group_0__2();

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
    // $ANTLR end "rule__CheckPoint__Group_0__1"


    // $ANTLR start "rule__CheckPoint__Group_0__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3261:1: rule__CheckPoint__Group_0__1__Impl : ( 'CheckPoint' ) ;
    public final void rule__CheckPoint__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3265:1: ( ( 'CheckPoint' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3266:1: ( 'CheckPoint' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3266:1: ( 'CheckPoint' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3267:1: 'CheckPoint'
            {
             before(grammarAccess.getCheckPointAccess().getCheckPointKeyword_0_1()); 
            match(input,32,FOLLOW_32_in_rule__CheckPoint__Group_0__1__Impl6524); 
             after(grammarAccess.getCheckPointAccess().getCheckPointKeyword_0_1()); 

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
    // $ANTLR end "rule__CheckPoint__Group_0__1__Impl"


    // $ANTLR start "rule__CheckPoint__Group_0__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3280:1: rule__CheckPoint__Group_0__2 : rule__CheckPoint__Group_0__2__Impl rule__CheckPoint__Group_0__3 ;
    public final void rule__CheckPoint__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3284:1: ( rule__CheckPoint__Group_0__2__Impl rule__CheckPoint__Group_0__3 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3285:2: rule__CheckPoint__Group_0__2__Impl rule__CheckPoint__Group_0__3
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_0__2__Impl_in_rule__CheckPoint__Group_0__26555);
            rule__CheckPoint__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group_0__3_in_rule__CheckPoint__Group_0__26558);
            rule__CheckPoint__Group_0__3();

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
    // $ANTLR end "rule__CheckPoint__Group_0__2"


    // $ANTLR start "rule__CheckPoint__Group_0__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3292:1: rule__CheckPoint__Group_0__2__Impl : ( ( rule__CheckPoint__NameAssignment_0_2 ) ) ;
    public final void rule__CheckPoint__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3296:1: ( ( ( rule__CheckPoint__NameAssignment_0_2 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3297:1: ( ( rule__CheckPoint__NameAssignment_0_2 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3297:1: ( ( rule__CheckPoint__NameAssignment_0_2 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3298:1: ( rule__CheckPoint__NameAssignment_0_2 )
            {
             before(grammarAccess.getCheckPointAccess().getNameAssignment_0_2()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3299:1: ( rule__CheckPoint__NameAssignment_0_2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3299:2: rule__CheckPoint__NameAssignment_0_2
            {
            pushFollow(FOLLOW_rule__CheckPoint__NameAssignment_0_2_in_rule__CheckPoint__Group_0__2__Impl6585);
            rule__CheckPoint__NameAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getCheckPointAccess().getNameAssignment_0_2()); 

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
    // $ANTLR end "rule__CheckPoint__Group_0__2__Impl"


    // $ANTLR start "rule__CheckPoint__Group_0__3"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3309:1: rule__CheckPoint__Group_0__3 : rule__CheckPoint__Group_0__3__Impl rule__CheckPoint__Group_0__4 ;
    public final void rule__CheckPoint__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3313:1: ( rule__CheckPoint__Group_0__3__Impl rule__CheckPoint__Group_0__4 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3314:2: rule__CheckPoint__Group_0__3__Impl rule__CheckPoint__Group_0__4
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_0__3__Impl_in_rule__CheckPoint__Group_0__36615);
            rule__CheckPoint__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group_0__4_in_rule__CheckPoint__Group_0__36618);
            rule__CheckPoint__Group_0__4();

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
    // $ANTLR end "rule__CheckPoint__Group_0__3"


    // $ANTLR start "rule__CheckPoint__Group_0__3__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3321:1: rule__CheckPoint__Group_0__3__Impl : ( RULE_OPENCURLY ) ;
    public final void rule__CheckPoint__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3325:1: ( ( RULE_OPENCURLY ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3326:1: ( RULE_OPENCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3326:1: ( RULE_OPENCURLY )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3327:1: RULE_OPENCURLY
            {
             before(grammarAccess.getCheckPointAccess().getOPENCURLYTerminalRuleCall_0_3()); 
            match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_rule__CheckPoint__Group_0__3__Impl6645); 
             after(grammarAccess.getCheckPointAccess().getOPENCURLYTerminalRuleCall_0_3()); 

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
    // $ANTLR end "rule__CheckPoint__Group_0__3__Impl"


    // $ANTLR start "rule__CheckPoint__Group_0__4"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3338:1: rule__CheckPoint__Group_0__4 : rule__CheckPoint__Group_0__4__Impl rule__CheckPoint__Group_0__5 ;
    public final void rule__CheckPoint__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3342:1: ( rule__CheckPoint__Group_0__4__Impl rule__CheckPoint__Group_0__5 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3343:2: rule__CheckPoint__Group_0__4__Impl rule__CheckPoint__Group_0__5
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_0__4__Impl_in_rule__CheckPoint__Group_0__46674);
            rule__CheckPoint__Group_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group_0__5_in_rule__CheckPoint__Group_0__46677);
            rule__CheckPoint__Group_0__5();

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
    // $ANTLR end "rule__CheckPoint__Group_0__4"


    // $ANTLR start "rule__CheckPoint__Group_0__4__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3350:1: rule__CheckPoint__Group_0__4__Impl : ( ( rule__CheckPoint__Group_0_4__0 )? ) ;
    public final void rule__CheckPoint__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3354:1: ( ( ( rule__CheckPoint__Group_0_4__0 )? ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3355:1: ( ( rule__CheckPoint__Group_0_4__0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3355:1: ( ( rule__CheckPoint__Group_0_4__0 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3356:1: ( rule__CheckPoint__Group_0_4__0 )?
            {
             before(grammarAccess.getCheckPointAccess().getGroup_0_4()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3357:1: ( rule__CheckPoint__Group_0_4__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==19) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3357:2: rule__CheckPoint__Group_0_4__0
                    {
                    pushFollow(FOLLOW_rule__CheckPoint__Group_0_4__0_in_rule__CheckPoint__Group_0__4__Impl6704);
                    rule__CheckPoint__Group_0_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCheckPointAccess().getGroup_0_4()); 

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
    // $ANTLR end "rule__CheckPoint__Group_0__4__Impl"


    // $ANTLR start "rule__CheckPoint__Group_0__5"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3367:1: rule__CheckPoint__Group_0__5 : rule__CheckPoint__Group_0__5__Impl ;
    public final void rule__CheckPoint__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3371:1: ( rule__CheckPoint__Group_0__5__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3372:2: rule__CheckPoint__Group_0__5__Impl
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_0__5__Impl_in_rule__CheckPoint__Group_0__56735);
            rule__CheckPoint__Group_0__5__Impl();

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
    // $ANTLR end "rule__CheckPoint__Group_0__5"


    // $ANTLR start "rule__CheckPoint__Group_0__5__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3378:1: rule__CheckPoint__Group_0__5__Impl : ( ( rule__CheckPoint__Group_0_5__0 )? ) ;
    public final void rule__CheckPoint__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3382:1: ( ( ( rule__CheckPoint__Group_0_5__0 )? ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3383:1: ( ( rule__CheckPoint__Group_0_5__0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3383:1: ( ( rule__CheckPoint__Group_0_5__0 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3384:1: ( rule__CheckPoint__Group_0_5__0 )?
            {
             before(grammarAccess.getCheckPointAccess().getGroup_0_5()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3385:1: ( rule__CheckPoint__Group_0_5__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==33) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3385:2: rule__CheckPoint__Group_0_5__0
                    {
                    pushFollow(FOLLOW_rule__CheckPoint__Group_0_5__0_in_rule__CheckPoint__Group_0__5__Impl6762);
                    rule__CheckPoint__Group_0_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCheckPointAccess().getGroup_0_5()); 

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
    // $ANTLR end "rule__CheckPoint__Group_0__5__Impl"


    // $ANTLR start "rule__CheckPoint__Group_0_4__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3407:1: rule__CheckPoint__Group_0_4__0 : rule__CheckPoint__Group_0_4__0__Impl rule__CheckPoint__Group_0_4__1 ;
    public final void rule__CheckPoint__Group_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3411:1: ( rule__CheckPoint__Group_0_4__0__Impl rule__CheckPoint__Group_0_4__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3412:2: rule__CheckPoint__Group_0_4__0__Impl rule__CheckPoint__Group_0_4__1
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_0_4__0__Impl_in_rule__CheckPoint__Group_0_4__06805);
            rule__CheckPoint__Group_0_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group_0_4__1_in_rule__CheckPoint__Group_0_4__06808);
            rule__CheckPoint__Group_0_4__1();

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
    // $ANTLR end "rule__CheckPoint__Group_0_4__0"


    // $ANTLR start "rule__CheckPoint__Group_0_4__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3419:1: rule__CheckPoint__Group_0_4__0__Impl : ( 'name' ) ;
    public final void rule__CheckPoint__Group_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3423:1: ( ( 'name' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3424:1: ( 'name' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3424:1: ( 'name' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3425:1: 'name'
            {
             before(grammarAccess.getCheckPointAccess().getNameKeyword_0_4_0()); 
            match(input,19,FOLLOW_19_in_rule__CheckPoint__Group_0_4__0__Impl6836); 
             after(grammarAccess.getCheckPointAccess().getNameKeyword_0_4_0()); 

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
    // $ANTLR end "rule__CheckPoint__Group_0_4__0__Impl"


    // $ANTLR start "rule__CheckPoint__Group_0_4__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3438:1: rule__CheckPoint__Group_0_4__1 : rule__CheckPoint__Group_0_4__1__Impl rule__CheckPoint__Group_0_4__2 ;
    public final void rule__CheckPoint__Group_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3442:1: ( rule__CheckPoint__Group_0_4__1__Impl rule__CheckPoint__Group_0_4__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3443:2: rule__CheckPoint__Group_0_4__1__Impl rule__CheckPoint__Group_0_4__2
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_0_4__1__Impl_in_rule__CheckPoint__Group_0_4__16867);
            rule__CheckPoint__Group_0_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group_0_4__2_in_rule__CheckPoint__Group_0_4__16870);
            rule__CheckPoint__Group_0_4__2();

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
    // $ANTLR end "rule__CheckPoint__Group_0_4__1"


    // $ANTLR start "rule__CheckPoint__Group_0_4__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3450:1: rule__CheckPoint__Group_0_4__1__Impl : ( ( rule__CheckPoint__LongNameAssignment_0_4_1 ) ) ;
    public final void rule__CheckPoint__Group_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3454:1: ( ( ( rule__CheckPoint__LongNameAssignment_0_4_1 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3455:1: ( ( rule__CheckPoint__LongNameAssignment_0_4_1 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3455:1: ( ( rule__CheckPoint__LongNameAssignment_0_4_1 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3456:1: ( rule__CheckPoint__LongNameAssignment_0_4_1 )
            {
             before(grammarAccess.getCheckPointAccess().getLongNameAssignment_0_4_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3457:1: ( rule__CheckPoint__LongNameAssignment_0_4_1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3457:2: rule__CheckPoint__LongNameAssignment_0_4_1
            {
            pushFollow(FOLLOW_rule__CheckPoint__LongNameAssignment_0_4_1_in_rule__CheckPoint__Group_0_4__1__Impl6897);
            rule__CheckPoint__LongNameAssignment_0_4_1();

            state._fsp--;


            }

             after(grammarAccess.getCheckPointAccess().getLongNameAssignment_0_4_1()); 

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
    // $ANTLR end "rule__CheckPoint__Group_0_4__1__Impl"


    // $ANTLR start "rule__CheckPoint__Group_0_4__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3467:1: rule__CheckPoint__Group_0_4__2 : rule__CheckPoint__Group_0_4__2__Impl ;
    public final void rule__CheckPoint__Group_0_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3471:1: ( rule__CheckPoint__Group_0_4__2__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3472:2: rule__CheckPoint__Group_0_4__2__Impl
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_0_4__2__Impl_in_rule__CheckPoint__Group_0_4__26927);
            rule__CheckPoint__Group_0_4__2__Impl();

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
    // $ANTLR end "rule__CheckPoint__Group_0_4__2"


    // $ANTLR start "rule__CheckPoint__Group_0_4__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3478:1: rule__CheckPoint__Group_0_4__2__Impl : ( ruleENDLINE ) ;
    public final void rule__CheckPoint__Group_0_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3482:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3483:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3483:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3484:1: ruleENDLINE
            {
             before(grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_0_4_2()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__CheckPoint__Group_0_4__2__Impl6954);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_0_4_2()); 

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
    // $ANTLR end "rule__CheckPoint__Group_0_4__2__Impl"


    // $ANTLR start "rule__CheckPoint__Group_0_5__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3501:1: rule__CheckPoint__Group_0_5__0 : rule__CheckPoint__Group_0_5__0__Impl rule__CheckPoint__Group_0_5__1 ;
    public final void rule__CheckPoint__Group_0_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3505:1: ( rule__CheckPoint__Group_0_5__0__Impl rule__CheckPoint__Group_0_5__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3506:2: rule__CheckPoint__Group_0_5__0__Impl rule__CheckPoint__Group_0_5__1
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_0_5__0__Impl_in_rule__CheckPoint__Group_0_5__06989);
            rule__CheckPoint__Group_0_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group_0_5__1_in_rule__CheckPoint__Group_0_5__06992);
            rule__CheckPoint__Group_0_5__1();

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
    // $ANTLR end "rule__CheckPoint__Group_0_5__0"


    // $ANTLR start "rule__CheckPoint__Group_0_5__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3513:1: rule__CheckPoint__Group_0_5__0__Impl : ( 'wbsDeliverable' ) ;
    public final void rule__CheckPoint__Group_0_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3517:1: ( ( 'wbsDeliverable' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3518:1: ( 'wbsDeliverable' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3518:1: ( 'wbsDeliverable' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3519:1: 'wbsDeliverable'
            {
             before(grammarAccess.getCheckPointAccess().getWbsDeliverableKeyword_0_5_0()); 
            match(input,33,FOLLOW_33_in_rule__CheckPoint__Group_0_5__0__Impl7020); 
             after(grammarAccess.getCheckPointAccess().getWbsDeliverableKeyword_0_5_0()); 

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
    // $ANTLR end "rule__CheckPoint__Group_0_5__0__Impl"


    // $ANTLR start "rule__CheckPoint__Group_0_5__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3532:1: rule__CheckPoint__Group_0_5__1 : rule__CheckPoint__Group_0_5__1__Impl rule__CheckPoint__Group_0_5__2 ;
    public final void rule__CheckPoint__Group_0_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3536:1: ( rule__CheckPoint__Group_0_5__1__Impl rule__CheckPoint__Group_0_5__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3537:2: rule__CheckPoint__Group_0_5__1__Impl rule__CheckPoint__Group_0_5__2
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_0_5__1__Impl_in_rule__CheckPoint__Group_0_5__17051);
            rule__CheckPoint__Group_0_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group_0_5__2_in_rule__CheckPoint__Group_0_5__17054);
            rule__CheckPoint__Group_0_5__2();

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
    // $ANTLR end "rule__CheckPoint__Group_0_5__1"


    // $ANTLR start "rule__CheckPoint__Group_0_5__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3544:1: rule__CheckPoint__Group_0_5__1__Impl : ( ( rule__CheckPoint__WbsDeliverableAssignment_0_5_1 )* ) ;
    public final void rule__CheckPoint__Group_0_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3548:1: ( ( ( rule__CheckPoint__WbsDeliverableAssignment_0_5_1 )* ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3549:1: ( ( rule__CheckPoint__WbsDeliverableAssignment_0_5_1 )* )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3549:1: ( ( rule__CheckPoint__WbsDeliverableAssignment_0_5_1 )* )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3550:1: ( rule__CheckPoint__WbsDeliverableAssignment_0_5_1 )*
            {
             before(grammarAccess.getCheckPointAccess().getWbsDeliverableAssignment_0_5_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3551:1: ( rule__CheckPoint__WbsDeliverableAssignment_0_5_1 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_ID) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3551:2: rule__CheckPoint__WbsDeliverableAssignment_0_5_1
            	    {
            	    pushFollow(FOLLOW_rule__CheckPoint__WbsDeliverableAssignment_0_5_1_in_rule__CheckPoint__Group_0_5__1__Impl7081);
            	    rule__CheckPoint__WbsDeliverableAssignment_0_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getCheckPointAccess().getWbsDeliverableAssignment_0_5_1()); 

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
    // $ANTLR end "rule__CheckPoint__Group_0_5__1__Impl"


    // $ANTLR start "rule__CheckPoint__Group_0_5__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3561:1: rule__CheckPoint__Group_0_5__2 : rule__CheckPoint__Group_0_5__2__Impl ;
    public final void rule__CheckPoint__Group_0_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3565:1: ( rule__CheckPoint__Group_0_5__2__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3566:2: rule__CheckPoint__Group_0_5__2__Impl
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_0_5__2__Impl_in_rule__CheckPoint__Group_0_5__27112);
            rule__CheckPoint__Group_0_5__2__Impl();

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
    // $ANTLR end "rule__CheckPoint__Group_0_5__2"


    // $ANTLR start "rule__CheckPoint__Group_0_5__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3572:1: rule__CheckPoint__Group_0_5__2__Impl : ( ruleENDLINE ) ;
    public final void rule__CheckPoint__Group_0_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3576:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3577:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3577:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3578:1: ruleENDLINE
            {
             before(grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_0_5_2()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__CheckPoint__Group_0_5__2__Impl7139);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_0_5_2()); 

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
    // $ANTLR end "rule__CheckPoint__Group_0_5__2__Impl"


    // $ANTLR start "rule__CheckPoint__Group_1__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3595:1: rule__CheckPoint__Group_1__0 : rule__CheckPoint__Group_1__0__Impl rule__CheckPoint__Group_1__1 ;
    public final void rule__CheckPoint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3599:1: ( rule__CheckPoint__Group_1__0__Impl rule__CheckPoint__Group_1__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3600:2: rule__CheckPoint__Group_1__0__Impl rule__CheckPoint__Group_1__1
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_1__0__Impl_in_rule__CheckPoint__Group_1__07174);
            rule__CheckPoint__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group_1__1_in_rule__CheckPoint__Group_1__07177);
            rule__CheckPoint__Group_1__1();

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
    // $ANTLR end "rule__CheckPoint__Group_1__0"


    // $ANTLR start "rule__CheckPoint__Group_1__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3607:1: rule__CheckPoint__Group_1__0__Impl : ( ( rule__CheckPoint__UnorderedGroup_1_0 ) ) ;
    public final void rule__CheckPoint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3611:1: ( ( ( rule__CheckPoint__UnorderedGroup_1_0 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3612:1: ( ( rule__CheckPoint__UnorderedGroup_1_0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3612:1: ( ( rule__CheckPoint__UnorderedGroup_1_0 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3613:1: ( rule__CheckPoint__UnorderedGroup_1_0 )
            {
             before(grammarAccess.getCheckPointAccess().getUnorderedGroup_1_0()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3614:1: ( rule__CheckPoint__UnorderedGroup_1_0 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3614:2: rule__CheckPoint__UnorderedGroup_1_0
            {
            pushFollow(FOLLOW_rule__CheckPoint__UnorderedGroup_1_0_in_rule__CheckPoint__Group_1__0__Impl7204);
            rule__CheckPoint__UnorderedGroup_1_0();

            state._fsp--;


            }

             after(grammarAccess.getCheckPointAccess().getUnorderedGroup_1_0()); 

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
    // $ANTLR end "rule__CheckPoint__Group_1__0__Impl"


    // $ANTLR start "rule__CheckPoint__Group_1__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3624:1: rule__CheckPoint__Group_1__1 : rule__CheckPoint__Group_1__1__Impl ;
    public final void rule__CheckPoint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3628:1: ( rule__CheckPoint__Group_1__1__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3629:2: rule__CheckPoint__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_1__1__Impl_in_rule__CheckPoint__Group_1__17234);
            rule__CheckPoint__Group_1__1__Impl();

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
    // $ANTLR end "rule__CheckPoint__Group_1__1"


    // $ANTLR start "rule__CheckPoint__Group_1__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3635:1: rule__CheckPoint__Group_1__1__Impl : ( RULE_CLOSEDCURLY ) ;
    public final void rule__CheckPoint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3639:1: ( ( RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3640:1: ( RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3640:1: ( RULE_CLOSEDCURLY )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3641:1: RULE_CLOSEDCURLY
            {
             before(grammarAccess.getCheckPointAccess().getCLOSEDCURLYTerminalRuleCall_1_1()); 
            match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_rule__CheckPoint__Group_1__1__Impl7261); 
             after(grammarAccess.getCheckPointAccess().getCLOSEDCURLYTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__CheckPoint__Group_1__1__Impl"


    // $ANTLR start "rule__CheckPoint__Group_1_0_0_0__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3656:1: rule__CheckPoint__Group_1_0_0_0__0 : rule__CheckPoint__Group_1_0_0_0__0__Impl rule__CheckPoint__Group_1_0_0_0__1 ;
    public final void rule__CheckPoint__Group_1_0_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3660:1: ( rule__CheckPoint__Group_1_0_0_0__0__Impl rule__CheckPoint__Group_1_0_0_0__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3661:2: rule__CheckPoint__Group_1_0_0_0__0__Impl rule__CheckPoint__Group_1_0_0_0__1
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_1_0_0_0__0__Impl_in_rule__CheckPoint__Group_1_0_0_0__07294);
            rule__CheckPoint__Group_1_0_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group_1_0_0_0__1_in_rule__CheckPoint__Group_1_0_0_0__07297);
            rule__CheckPoint__Group_1_0_0_0__1();

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
    // $ANTLR end "rule__CheckPoint__Group_1_0_0_0__0"


    // $ANTLR start "rule__CheckPoint__Group_1_0_0_0__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3668:1: rule__CheckPoint__Group_1_0_0_0__0__Impl : ( 'date' ) ;
    public final void rule__CheckPoint__Group_1_0_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3672:1: ( ( 'date' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3673:1: ( 'date' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3673:1: ( 'date' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3674:1: 'date'
            {
             before(grammarAccess.getCheckPointAccess().getDateKeyword_1_0_0_0_0()); 
            match(input,34,FOLLOW_34_in_rule__CheckPoint__Group_1_0_0_0__0__Impl7325); 
             after(grammarAccess.getCheckPointAccess().getDateKeyword_1_0_0_0_0()); 

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
    // $ANTLR end "rule__CheckPoint__Group_1_0_0_0__0__Impl"


    // $ANTLR start "rule__CheckPoint__Group_1_0_0_0__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3687:1: rule__CheckPoint__Group_1_0_0_0__1 : rule__CheckPoint__Group_1_0_0_0__1__Impl rule__CheckPoint__Group_1_0_0_0__2 ;
    public final void rule__CheckPoint__Group_1_0_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3691:1: ( rule__CheckPoint__Group_1_0_0_0__1__Impl rule__CheckPoint__Group_1_0_0_0__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3692:2: rule__CheckPoint__Group_1_0_0_0__1__Impl rule__CheckPoint__Group_1_0_0_0__2
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_1_0_0_0__1__Impl_in_rule__CheckPoint__Group_1_0_0_0__17356);
            rule__CheckPoint__Group_1_0_0_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group_1_0_0_0__2_in_rule__CheckPoint__Group_1_0_0_0__17359);
            rule__CheckPoint__Group_1_0_0_0__2();

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
    // $ANTLR end "rule__CheckPoint__Group_1_0_0_0__1"


    // $ANTLR start "rule__CheckPoint__Group_1_0_0_0__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3699:1: rule__CheckPoint__Group_1_0_0_0__1__Impl : ( ( rule__CheckPoint__EndAssignment_1_0_0_0_1 ) ) ;
    public final void rule__CheckPoint__Group_1_0_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3703:1: ( ( ( rule__CheckPoint__EndAssignment_1_0_0_0_1 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3704:1: ( ( rule__CheckPoint__EndAssignment_1_0_0_0_1 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3704:1: ( ( rule__CheckPoint__EndAssignment_1_0_0_0_1 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3705:1: ( rule__CheckPoint__EndAssignment_1_0_0_0_1 )
            {
             before(grammarAccess.getCheckPointAccess().getEndAssignment_1_0_0_0_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3706:1: ( rule__CheckPoint__EndAssignment_1_0_0_0_1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3706:2: rule__CheckPoint__EndAssignment_1_0_0_0_1
            {
            pushFollow(FOLLOW_rule__CheckPoint__EndAssignment_1_0_0_0_1_in_rule__CheckPoint__Group_1_0_0_0__1__Impl7386);
            rule__CheckPoint__EndAssignment_1_0_0_0_1();

            state._fsp--;


            }

             after(grammarAccess.getCheckPointAccess().getEndAssignment_1_0_0_0_1()); 

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
    // $ANTLR end "rule__CheckPoint__Group_1_0_0_0__1__Impl"


    // $ANTLR start "rule__CheckPoint__Group_1_0_0_0__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3716:1: rule__CheckPoint__Group_1_0_0_0__2 : rule__CheckPoint__Group_1_0_0_0__2__Impl ;
    public final void rule__CheckPoint__Group_1_0_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3720:1: ( rule__CheckPoint__Group_1_0_0_0__2__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3721:2: rule__CheckPoint__Group_1_0_0_0__2__Impl
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_1_0_0_0__2__Impl_in_rule__CheckPoint__Group_1_0_0_0__27416);
            rule__CheckPoint__Group_1_0_0_0__2__Impl();

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
    // $ANTLR end "rule__CheckPoint__Group_1_0_0_0__2"


    // $ANTLR start "rule__CheckPoint__Group_1_0_0_0__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3727:1: rule__CheckPoint__Group_1_0_0_0__2__Impl : ( ruleENDLINE ) ;
    public final void rule__CheckPoint__Group_1_0_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3731:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3732:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3732:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3733:1: ruleENDLINE
            {
             before(grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_1_0_0_0_2()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__CheckPoint__Group_1_0_0_0__2__Impl7443);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_1_0_0_0_2()); 

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
    // $ANTLR end "rule__CheckPoint__Group_1_0_0_0__2__Impl"


    // $ANTLR start "rule__CheckPoint__Group_1_0_0_1__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3750:1: rule__CheckPoint__Group_1_0_0_1__0 : rule__CheckPoint__Group_1_0_0_1__0__Impl rule__CheckPoint__Group_1_0_0_1__1 ;
    public final void rule__CheckPoint__Group_1_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3754:1: ( rule__CheckPoint__Group_1_0_0_1__0__Impl rule__CheckPoint__Group_1_0_0_1__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3755:2: rule__CheckPoint__Group_1_0_0_1__0__Impl rule__CheckPoint__Group_1_0_0_1__1
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_1_0_0_1__0__Impl_in_rule__CheckPoint__Group_1_0_0_1__07478);
            rule__CheckPoint__Group_1_0_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group_1_0_0_1__1_in_rule__CheckPoint__Group_1_0_0_1__07481);
            rule__CheckPoint__Group_1_0_0_1__1();

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
    // $ANTLR end "rule__CheckPoint__Group_1_0_0_1__0"


    // $ANTLR start "rule__CheckPoint__Group_1_0_0_1__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3762:1: rule__CheckPoint__Group_1_0_0_1__0__Impl : ( 'after' ) ;
    public final void rule__CheckPoint__Group_1_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3766:1: ( ( 'after' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3767:1: ( 'after' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3767:1: ( 'after' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3768:1: 'after'
            {
             before(grammarAccess.getCheckPointAccess().getAfterKeyword_1_0_0_1_0()); 
            match(input,35,FOLLOW_35_in_rule__CheckPoint__Group_1_0_0_1__0__Impl7509); 
             after(grammarAccess.getCheckPointAccess().getAfterKeyword_1_0_0_1_0()); 

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
    // $ANTLR end "rule__CheckPoint__Group_1_0_0_1__0__Impl"


    // $ANTLR start "rule__CheckPoint__Group_1_0_0_1__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3781:1: rule__CheckPoint__Group_1_0_0_1__1 : rule__CheckPoint__Group_1_0_0_1__1__Impl rule__CheckPoint__Group_1_0_0_1__2 ;
    public final void rule__CheckPoint__Group_1_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3785:1: ( rule__CheckPoint__Group_1_0_0_1__1__Impl rule__CheckPoint__Group_1_0_0_1__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3786:2: rule__CheckPoint__Group_1_0_0_1__1__Impl rule__CheckPoint__Group_1_0_0_1__2
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_1_0_0_1__1__Impl_in_rule__CheckPoint__Group_1_0_0_1__17540);
            rule__CheckPoint__Group_1_0_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group_1_0_0_1__2_in_rule__CheckPoint__Group_1_0_0_1__17543);
            rule__CheckPoint__Group_1_0_0_1__2();

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
    // $ANTLR end "rule__CheckPoint__Group_1_0_0_1__1"


    // $ANTLR start "rule__CheckPoint__Group_1_0_0_1__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3793:1: rule__CheckPoint__Group_1_0_0_1__1__Impl : ( ( rule__CheckPoint__AfterAssignment_1_0_0_1_1 ) ) ;
    public final void rule__CheckPoint__Group_1_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3797:1: ( ( ( rule__CheckPoint__AfterAssignment_1_0_0_1_1 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3798:1: ( ( rule__CheckPoint__AfterAssignment_1_0_0_1_1 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3798:1: ( ( rule__CheckPoint__AfterAssignment_1_0_0_1_1 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3799:1: ( rule__CheckPoint__AfterAssignment_1_0_0_1_1 )
            {
             before(grammarAccess.getCheckPointAccess().getAfterAssignment_1_0_0_1_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3800:1: ( rule__CheckPoint__AfterAssignment_1_0_0_1_1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3800:2: rule__CheckPoint__AfterAssignment_1_0_0_1_1
            {
            pushFollow(FOLLOW_rule__CheckPoint__AfterAssignment_1_0_0_1_1_in_rule__CheckPoint__Group_1_0_0_1__1__Impl7570);
            rule__CheckPoint__AfterAssignment_1_0_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCheckPointAccess().getAfterAssignment_1_0_0_1_1()); 

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
    // $ANTLR end "rule__CheckPoint__Group_1_0_0_1__1__Impl"


    // $ANTLR start "rule__CheckPoint__Group_1_0_0_1__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3810:1: rule__CheckPoint__Group_1_0_0_1__2 : rule__CheckPoint__Group_1_0_0_1__2__Impl rule__CheckPoint__Group_1_0_0_1__3 ;
    public final void rule__CheckPoint__Group_1_0_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3814:1: ( rule__CheckPoint__Group_1_0_0_1__2__Impl rule__CheckPoint__Group_1_0_0_1__3 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3815:2: rule__CheckPoint__Group_1_0_0_1__2__Impl rule__CheckPoint__Group_1_0_0_1__3
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_1_0_0_1__2__Impl_in_rule__CheckPoint__Group_1_0_0_1__27600);
            rule__CheckPoint__Group_1_0_0_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group_1_0_0_1__3_in_rule__CheckPoint__Group_1_0_0_1__27603);
            rule__CheckPoint__Group_1_0_0_1__3();

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
    // $ANTLR end "rule__CheckPoint__Group_1_0_0_1__2"


    // $ANTLR start "rule__CheckPoint__Group_1_0_0_1__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3822:1: rule__CheckPoint__Group_1_0_0_1__2__Impl : ( 'offset' ) ;
    public final void rule__CheckPoint__Group_1_0_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3826:1: ( ( 'offset' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3827:1: ( 'offset' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3827:1: ( 'offset' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3828:1: 'offset'
            {
             before(grammarAccess.getCheckPointAccess().getOffsetKeyword_1_0_0_1_2()); 
            match(input,36,FOLLOW_36_in_rule__CheckPoint__Group_1_0_0_1__2__Impl7631); 
             after(grammarAccess.getCheckPointAccess().getOffsetKeyword_1_0_0_1_2()); 

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
    // $ANTLR end "rule__CheckPoint__Group_1_0_0_1__2__Impl"


    // $ANTLR start "rule__CheckPoint__Group_1_0_0_1__3"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3841:1: rule__CheckPoint__Group_1_0_0_1__3 : rule__CheckPoint__Group_1_0_0_1__3__Impl rule__CheckPoint__Group_1_0_0_1__4 ;
    public final void rule__CheckPoint__Group_1_0_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3845:1: ( rule__CheckPoint__Group_1_0_0_1__3__Impl rule__CheckPoint__Group_1_0_0_1__4 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3846:2: rule__CheckPoint__Group_1_0_0_1__3__Impl rule__CheckPoint__Group_1_0_0_1__4
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_1_0_0_1__3__Impl_in_rule__CheckPoint__Group_1_0_0_1__37662);
            rule__CheckPoint__Group_1_0_0_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group_1_0_0_1__4_in_rule__CheckPoint__Group_1_0_0_1__37665);
            rule__CheckPoint__Group_1_0_0_1__4();

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
    // $ANTLR end "rule__CheckPoint__Group_1_0_0_1__3"


    // $ANTLR start "rule__CheckPoint__Group_1_0_0_1__3__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3853:1: rule__CheckPoint__Group_1_0_0_1__3__Impl : ( ( rule__CheckPoint__OffsetAssignment_1_0_0_1_3 ) ) ;
    public final void rule__CheckPoint__Group_1_0_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3857:1: ( ( ( rule__CheckPoint__OffsetAssignment_1_0_0_1_3 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3858:1: ( ( rule__CheckPoint__OffsetAssignment_1_0_0_1_3 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3858:1: ( ( rule__CheckPoint__OffsetAssignment_1_0_0_1_3 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3859:1: ( rule__CheckPoint__OffsetAssignment_1_0_0_1_3 )
            {
             before(grammarAccess.getCheckPointAccess().getOffsetAssignment_1_0_0_1_3()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3860:1: ( rule__CheckPoint__OffsetAssignment_1_0_0_1_3 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3860:2: rule__CheckPoint__OffsetAssignment_1_0_0_1_3
            {
            pushFollow(FOLLOW_rule__CheckPoint__OffsetAssignment_1_0_0_1_3_in_rule__CheckPoint__Group_1_0_0_1__3__Impl7692);
            rule__CheckPoint__OffsetAssignment_1_0_0_1_3();

            state._fsp--;


            }

             after(grammarAccess.getCheckPointAccess().getOffsetAssignment_1_0_0_1_3()); 

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
    // $ANTLR end "rule__CheckPoint__Group_1_0_0_1__3__Impl"


    // $ANTLR start "rule__CheckPoint__Group_1_0_0_1__4"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3870:1: rule__CheckPoint__Group_1_0_0_1__4 : rule__CheckPoint__Group_1_0_0_1__4__Impl ;
    public final void rule__CheckPoint__Group_1_0_0_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3874:1: ( rule__CheckPoint__Group_1_0_0_1__4__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3875:2: rule__CheckPoint__Group_1_0_0_1__4__Impl
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_1_0_0_1__4__Impl_in_rule__CheckPoint__Group_1_0_0_1__47722);
            rule__CheckPoint__Group_1_0_0_1__4__Impl();

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
    // $ANTLR end "rule__CheckPoint__Group_1_0_0_1__4"


    // $ANTLR start "rule__CheckPoint__Group_1_0_0_1__4__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3881:1: rule__CheckPoint__Group_1_0_0_1__4__Impl : ( ruleENDLINE ) ;
    public final void rule__CheckPoint__Group_1_0_0_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3885:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3886:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3886:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3887:1: ruleENDLINE
            {
             before(grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_1_0_0_1_4()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__CheckPoint__Group_1_0_0_1__4__Impl7749);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_1_0_0_1_4()); 

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
    // $ANTLR end "rule__CheckPoint__Group_1_0_0_1__4__Impl"


    // $ANTLR start "rule__CheckPoint__Group_1_0_1__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3908:1: rule__CheckPoint__Group_1_0_1__0 : rule__CheckPoint__Group_1_0_1__0__Impl rule__CheckPoint__Group_1_0_1__1 ;
    public final void rule__CheckPoint__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3912:1: ( rule__CheckPoint__Group_1_0_1__0__Impl rule__CheckPoint__Group_1_0_1__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3913:2: rule__CheckPoint__Group_1_0_1__0__Impl rule__CheckPoint__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_1_0_1__0__Impl_in_rule__CheckPoint__Group_1_0_1__07788);
            rule__CheckPoint__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group_1_0_1__1_in_rule__CheckPoint__Group_1_0_1__07791);
            rule__CheckPoint__Group_1_0_1__1();

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
    // $ANTLR end "rule__CheckPoint__Group_1_0_1__0"


    // $ANTLR start "rule__CheckPoint__Group_1_0_1__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3920:1: rule__CheckPoint__Group_1_0_1__0__Impl : ( 'completeness' ) ;
    public final void rule__CheckPoint__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3924:1: ( ( 'completeness' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3925:1: ( 'completeness' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3925:1: ( 'completeness' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3926:1: 'completeness'
            {
             before(grammarAccess.getCheckPointAccess().getCompletenessKeyword_1_0_1_0()); 
            match(input,37,FOLLOW_37_in_rule__CheckPoint__Group_1_0_1__0__Impl7819); 
             after(grammarAccess.getCheckPointAccess().getCompletenessKeyword_1_0_1_0()); 

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
    // $ANTLR end "rule__CheckPoint__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__CheckPoint__Group_1_0_1__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3939:1: rule__CheckPoint__Group_1_0_1__1 : rule__CheckPoint__Group_1_0_1__1__Impl rule__CheckPoint__Group_1_0_1__2 ;
    public final void rule__CheckPoint__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3943:1: ( rule__CheckPoint__Group_1_0_1__1__Impl rule__CheckPoint__Group_1_0_1__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3944:2: rule__CheckPoint__Group_1_0_1__1__Impl rule__CheckPoint__Group_1_0_1__2
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_1_0_1__1__Impl_in_rule__CheckPoint__Group_1_0_1__17850);
            rule__CheckPoint__Group_1_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group_1_0_1__2_in_rule__CheckPoint__Group_1_0_1__17853);
            rule__CheckPoint__Group_1_0_1__2();

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
    // $ANTLR end "rule__CheckPoint__Group_1_0_1__1"


    // $ANTLR start "rule__CheckPoint__Group_1_0_1__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3951:1: rule__CheckPoint__Group_1_0_1__1__Impl : ( ( rule__CheckPoint__CompletenessAssignment_1_0_1_1 ) ) ;
    public final void rule__CheckPoint__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3955:1: ( ( ( rule__CheckPoint__CompletenessAssignment_1_0_1_1 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3956:1: ( ( rule__CheckPoint__CompletenessAssignment_1_0_1_1 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3956:1: ( ( rule__CheckPoint__CompletenessAssignment_1_0_1_1 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3957:1: ( rule__CheckPoint__CompletenessAssignment_1_0_1_1 )
            {
             before(grammarAccess.getCheckPointAccess().getCompletenessAssignment_1_0_1_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3958:1: ( rule__CheckPoint__CompletenessAssignment_1_0_1_1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3958:2: rule__CheckPoint__CompletenessAssignment_1_0_1_1
            {
            pushFollow(FOLLOW_rule__CheckPoint__CompletenessAssignment_1_0_1_1_in_rule__CheckPoint__Group_1_0_1__1__Impl7880);
            rule__CheckPoint__CompletenessAssignment_1_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCheckPointAccess().getCompletenessAssignment_1_0_1_1()); 

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
    // $ANTLR end "rule__CheckPoint__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__CheckPoint__Group_1_0_1__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3968:1: rule__CheckPoint__Group_1_0_1__2 : rule__CheckPoint__Group_1_0_1__2__Impl rule__CheckPoint__Group_1_0_1__3 ;
    public final void rule__CheckPoint__Group_1_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3972:1: ( rule__CheckPoint__Group_1_0_1__2__Impl rule__CheckPoint__Group_1_0_1__3 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3973:2: rule__CheckPoint__Group_1_0_1__2__Impl rule__CheckPoint__Group_1_0_1__3
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_1_0_1__2__Impl_in_rule__CheckPoint__Group_1_0_1__27910);
            rule__CheckPoint__Group_1_0_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group_1_0_1__3_in_rule__CheckPoint__Group_1_0_1__27913);
            rule__CheckPoint__Group_1_0_1__3();

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
    // $ANTLR end "rule__CheckPoint__Group_1_0_1__2"


    // $ANTLR start "rule__CheckPoint__Group_1_0_1__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3980:1: rule__CheckPoint__Group_1_0_1__2__Impl : ( '%' ) ;
    public final void rule__CheckPoint__Group_1_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3984:1: ( ( '%' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3985:1: ( '%' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3985:1: ( '%' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3986:1: '%'
            {
             before(grammarAccess.getCheckPointAccess().getPercentSignKeyword_1_0_1_2()); 
            match(input,38,FOLLOW_38_in_rule__CheckPoint__Group_1_0_1__2__Impl7941); 
             after(grammarAccess.getCheckPointAccess().getPercentSignKeyword_1_0_1_2()); 

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
    // $ANTLR end "rule__CheckPoint__Group_1_0_1__2__Impl"


    // $ANTLR start "rule__CheckPoint__Group_1_0_1__3"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:3999:1: rule__CheckPoint__Group_1_0_1__3 : rule__CheckPoint__Group_1_0_1__3__Impl rule__CheckPoint__Group_1_0_1__4 ;
    public final void rule__CheckPoint__Group_1_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4003:1: ( rule__CheckPoint__Group_1_0_1__3__Impl rule__CheckPoint__Group_1_0_1__4 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4004:2: rule__CheckPoint__Group_1_0_1__3__Impl rule__CheckPoint__Group_1_0_1__4
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_1_0_1__3__Impl_in_rule__CheckPoint__Group_1_0_1__37972);
            rule__CheckPoint__Group_1_0_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group_1_0_1__4_in_rule__CheckPoint__Group_1_0_1__37975);
            rule__CheckPoint__Group_1_0_1__4();

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
    // $ANTLR end "rule__CheckPoint__Group_1_0_1__3"


    // $ANTLR start "rule__CheckPoint__Group_1_0_1__3__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4011:1: rule__CheckPoint__Group_1_0_1__3__Impl : ( ruleENDLINE ) ;
    public final void rule__CheckPoint__Group_1_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4015:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4016:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4016:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4017:1: ruleENDLINE
            {
             before(grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_1_0_1_3()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__CheckPoint__Group_1_0_1__3__Impl8002);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_1_0_1_3()); 

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
    // $ANTLR end "rule__CheckPoint__Group_1_0_1__3__Impl"


    // $ANTLR start "rule__CheckPoint__Group_1_0_1__4"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4028:1: rule__CheckPoint__Group_1_0_1__4 : rule__CheckPoint__Group_1_0_1__4__Impl ;
    public final void rule__CheckPoint__Group_1_0_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4032:1: ( rule__CheckPoint__Group_1_0_1__4__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4033:2: rule__CheckPoint__Group_1_0_1__4__Impl
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_1_0_1__4__Impl_in_rule__CheckPoint__Group_1_0_1__48031);
            rule__CheckPoint__Group_1_0_1__4__Impl();

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
    // $ANTLR end "rule__CheckPoint__Group_1_0_1__4"


    // $ANTLR start "rule__CheckPoint__Group_1_0_1__4__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4039:1: rule__CheckPoint__Group_1_0_1__4__Impl : ( ( rule__CheckPoint__Group_1_0_1_4__0 )? ) ;
    public final void rule__CheckPoint__Group_1_0_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4043:1: ( ( ( rule__CheckPoint__Group_1_0_1_4__0 )? ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4044:1: ( ( rule__CheckPoint__Group_1_0_1_4__0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4044:1: ( ( rule__CheckPoint__Group_1_0_1_4__0 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4045:1: ( rule__CheckPoint__Group_1_0_1_4__0 )?
            {
             before(grammarAccess.getCheckPointAccess().getGroup_1_0_1_4()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4046:1: ( rule__CheckPoint__Group_1_0_1_4__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==27) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4046:2: rule__CheckPoint__Group_1_0_1_4__0
                    {
                    pushFollow(FOLLOW_rule__CheckPoint__Group_1_0_1_4__0_in_rule__CheckPoint__Group_1_0_1__4__Impl8058);
                    rule__CheckPoint__Group_1_0_1_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCheckPointAccess().getGroup_1_0_1_4()); 

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
    // $ANTLR end "rule__CheckPoint__Group_1_0_1__4__Impl"


    // $ANTLR start "rule__CheckPoint__Group_1_0_1_4__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4066:1: rule__CheckPoint__Group_1_0_1_4__0 : rule__CheckPoint__Group_1_0_1_4__0__Impl rule__CheckPoint__Group_1_0_1_4__1 ;
    public final void rule__CheckPoint__Group_1_0_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4070:1: ( rule__CheckPoint__Group_1_0_1_4__0__Impl rule__CheckPoint__Group_1_0_1_4__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4071:2: rule__CheckPoint__Group_1_0_1_4__0__Impl rule__CheckPoint__Group_1_0_1_4__1
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_1_0_1_4__0__Impl_in_rule__CheckPoint__Group_1_0_1_4__08099);
            rule__CheckPoint__Group_1_0_1_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group_1_0_1_4__1_in_rule__CheckPoint__Group_1_0_1_4__08102);
            rule__CheckPoint__Group_1_0_1_4__1();

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
    // $ANTLR end "rule__CheckPoint__Group_1_0_1_4__0"


    // $ANTLR start "rule__CheckPoint__Group_1_0_1_4__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4078:1: rule__CheckPoint__Group_1_0_1_4__0__Impl : ( 'dependsOn' ) ;
    public final void rule__CheckPoint__Group_1_0_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4082:1: ( ( 'dependsOn' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4083:1: ( 'dependsOn' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4083:1: ( 'dependsOn' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4084:1: 'dependsOn'
            {
             before(grammarAccess.getCheckPointAccess().getDependsOnKeyword_1_0_1_4_0()); 
            match(input,27,FOLLOW_27_in_rule__CheckPoint__Group_1_0_1_4__0__Impl8130); 
             after(grammarAccess.getCheckPointAccess().getDependsOnKeyword_1_0_1_4_0()); 

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
    // $ANTLR end "rule__CheckPoint__Group_1_0_1_4__0__Impl"


    // $ANTLR start "rule__CheckPoint__Group_1_0_1_4__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4097:1: rule__CheckPoint__Group_1_0_1_4__1 : rule__CheckPoint__Group_1_0_1_4__1__Impl rule__CheckPoint__Group_1_0_1_4__2 ;
    public final void rule__CheckPoint__Group_1_0_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4101:1: ( rule__CheckPoint__Group_1_0_1_4__1__Impl rule__CheckPoint__Group_1_0_1_4__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4102:2: rule__CheckPoint__Group_1_0_1_4__1__Impl rule__CheckPoint__Group_1_0_1_4__2
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_1_0_1_4__1__Impl_in_rule__CheckPoint__Group_1_0_1_4__18161);
            rule__CheckPoint__Group_1_0_1_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckPoint__Group_1_0_1_4__2_in_rule__CheckPoint__Group_1_0_1_4__18164);
            rule__CheckPoint__Group_1_0_1_4__2();

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
    // $ANTLR end "rule__CheckPoint__Group_1_0_1_4__1"


    // $ANTLR start "rule__CheckPoint__Group_1_0_1_4__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4109:1: rule__CheckPoint__Group_1_0_1_4__1__Impl : ( ( rule__CheckPoint__DependenciesAssignment_1_0_1_4_1 )* ) ;
    public final void rule__CheckPoint__Group_1_0_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4113:1: ( ( ( rule__CheckPoint__DependenciesAssignment_1_0_1_4_1 )* ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4114:1: ( ( rule__CheckPoint__DependenciesAssignment_1_0_1_4_1 )* )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4114:1: ( ( rule__CheckPoint__DependenciesAssignment_1_0_1_4_1 )* )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4115:1: ( rule__CheckPoint__DependenciesAssignment_1_0_1_4_1 )*
            {
             before(grammarAccess.getCheckPointAccess().getDependenciesAssignment_1_0_1_4_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4116:1: ( rule__CheckPoint__DependenciesAssignment_1_0_1_4_1 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ID) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4116:2: rule__CheckPoint__DependenciesAssignment_1_0_1_4_1
            	    {
            	    pushFollow(FOLLOW_rule__CheckPoint__DependenciesAssignment_1_0_1_4_1_in_rule__CheckPoint__Group_1_0_1_4__1__Impl8191);
            	    rule__CheckPoint__DependenciesAssignment_1_0_1_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getCheckPointAccess().getDependenciesAssignment_1_0_1_4_1()); 

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
    // $ANTLR end "rule__CheckPoint__Group_1_0_1_4__1__Impl"


    // $ANTLR start "rule__CheckPoint__Group_1_0_1_4__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4126:1: rule__CheckPoint__Group_1_0_1_4__2 : rule__CheckPoint__Group_1_0_1_4__2__Impl ;
    public final void rule__CheckPoint__Group_1_0_1_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4130:1: ( rule__CheckPoint__Group_1_0_1_4__2__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4131:2: rule__CheckPoint__Group_1_0_1_4__2__Impl
            {
            pushFollow(FOLLOW_rule__CheckPoint__Group_1_0_1_4__2__Impl_in_rule__CheckPoint__Group_1_0_1_4__28222);
            rule__CheckPoint__Group_1_0_1_4__2__Impl();

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
    // $ANTLR end "rule__CheckPoint__Group_1_0_1_4__2"


    // $ANTLR start "rule__CheckPoint__Group_1_0_1_4__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4137:1: rule__CheckPoint__Group_1_0_1_4__2__Impl : ( ruleENDLINE ) ;
    public final void rule__CheckPoint__Group_1_0_1_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4141:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4142:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4142:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4143:1: ruleENDLINE
            {
             before(grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_1_0_1_4_2()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__CheckPoint__Group_1_0_1_4__2__Impl8249);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_1_0_1_4_2()); 

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
    // $ANTLR end "rule__CheckPoint__Group_1_0_1_4__2__Impl"


    // $ANTLR start "rule__ResourceInvolvement__Group__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4160:1: rule__ResourceInvolvement__Group__0 : rule__ResourceInvolvement__Group__0__Impl rule__ResourceInvolvement__Group__1 ;
    public final void rule__ResourceInvolvement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4164:1: ( rule__ResourceInvolvement__Group__0__Impl rule__ResourceInvolvement__Group__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4165:2: rule__ResourceInvolvement__Group__0__Impl rule__ResourceInvolvement__Group__1
            {
            pushFollow(FOLLOW_rule__ResourceInvolvement__Group__0__Impl_in_rule__ResourceInvolvement__Group__08284);
            rule__ResourceInvolvement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceInvolvement__Group__1_in_rule__ResourceInvolvement__Group__08287);
            rule__ResourceInvolvement__Group__1();

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
    // $ANTLR end "rule__ResourceInvolvement__Group__0"


    // $ANTLR start "rule__ResourceInvolvement__Group__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4172:1: rule__ResourceInvolvement__Group__0__Impl : ( ( rule__ResourceInvolvement__ResourceAssignment_0 ) ) ;
    public final void rule__ResourceInvolvement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4176:1: ( ( ( rule__ResourceInvolvement__ResourceAssignment_0 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4177:1: ( ( rule__ResourceInvolvement__ResourceAssignment_0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4177:1: ( ( rule__ResourceInvolvement__ResourceAssignment_0 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4178:1: ( rule__ResourceInvolvement__ResourceAssignment_0 )
            {
             before(grammarAccess.getResourceInvolvementAccess().getResourceAssignment_0()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4179:1: ( rule__ResourceInvolvement__ResourceAssignment_0 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4179:2: rule__ResourceInvolvement__ResourceAssignment_0
            {
            pushFollow(FOLLOW_rule__ResourceInvolvement__ResourceAssignment_0_in_rule__ResourceInvolvement__Group__0__Impl8314);
            rule__ResourceInvolvement__ResourceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getResourceInvolvementAccess().getResourceAssignment_0()); 

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
    // $ANTLR end "rule__ResourceInvolvement__Group__0__Impl"


    // $ANTLR start "rule__ResourceInvolvement__Group__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4189:1: rule__ResourceInvolvement__Group__1 : rule__ResourceInvolvement__Group__1__Impl rule__ResourceInvolvement__Group__2 ;
    public final void rule__ResourceInvolvement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4193:1: ( rule__ResourceInvolvement__Group__1__Impl rule__ResourceInvolvement__Group__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4194:2: rule__ResourceInvolvement__Group__1__Impl rule__ResourceInvolvement__Group__2
            {
            pushFollow(FOLLOW_rule__ResourceInvolvement__Group__1__Impl_in_rule__ResourceInvolvement__Group__18344);
            rule__ResourceInvolvement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceInvolvement__Group__2_in_rule__ResourceInvolvement__Group__18347);
            rule__ResourceInvolvement__Group__2();

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
    // $ANTLR end "rule__ResourceInvolvement__Group__1"


    // $ANTLR start "rule__ResourceInvolvement__Group__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4201:1: rule__ResourceInvolvement__Group__1__Impl : ( ( rule__ResourceInvolvement__Group_1__0 )? ) ;
    public final void rule__ResourceInvolvement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4205:1: ( ( ( rule__ResourceInvolvement__Group_1__0 )? ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4206:1: ( ( rule__ResourceInvolvement__Group_1__0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4206:1: ( ( rule__ResourceInvolvement__Group_1__0 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4207:1: ( rule__ResourceInvolvement__Group_1__0 )?
            {
             before(grammarAccess.getResourceInvolvementAccess().getGroup_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4208:1: ( rule__ResourceInvolvement__Group_1__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==39) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4208:2: rule__ResourceInvolvement__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ResourceInvolvement__Group_1__0_in_rule__ResourceInvolvement__Group__1__Impl8374);
                    rule__ResourceInvolvement__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getResourceInvolvementAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ResourceInvolvement__Group__1__Impl"


    // $ANTLR start "rule__ResourceInvolvement__Group__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4218:1: rule__ResourceInvolvement__Group__2 : rule__ResourceInvolvement__Group__2__Impl rule__ResourceInvolvement__Group__3 ;
    public final void rule__ResourceInvolvement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4222:1: ( rule__ResourceInvolvement__Group__2__Impl rule__ResourceInvolvement__Group__3 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4223:2: rule__ResourceInvolvement__Group__2__Impl rule__ResourceInvolvement__Group__3
            {
            pushFollow(FOLLOW_rule__ResourceInvolvement__Group__2__Impl_in_rule__ResourceInvolvement__Group__28405);
            rule__ResourceInvolvement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceInvolvement__Group__3_in_rule__ResourceInvolvement__Group__28408);
            rule__ResourceInvolvement__Group__3();

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
    // $ANTLR end "rule__ResourceInvolvement__Group__2"


    // $ANTLR start "rule__ResourceInvolvement__Group__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4230:1: rule__ResourceInvolvement__Group__2__Impl : ( ( rule__ResourceInvolvement__Group_2__0 )? ) ;
    public final void rule__ResourceInvolvement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4234:1: ( ( ( rule__ResourceInvolvement__Group_2__0 )? ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4235:1: ( ( rule__ResourceInvolvement__Group_2__0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4235:1: ( ( rule__ResourceInvolvement__Group_2__0 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4236:1: ( rule__ResourceInvolvement__Group_2__0 )?
            {
             before(grammarAccess.getResourceInvolvementAccess().getGroup_2()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4237:1: ( rule__ResourceInvolvement__Group_2__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==40) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4237:2: rule__ResourceInvolvement__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ResourceInvolvement__Group_2__0_in_rule__ResourceInvolvement__Group__2__Impl8435);
                    rule__ResourceInvolvement__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getResourceInvolvementAccess().getGroup_2()); 

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
    // $ANTLR end "rule__ResourceInvolvement__Group__2__Impl"


    // $ANTLR start "rule__ResourceInvolvement__Group__3"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4247:1: rule__ResourceInvolvement__Group__3 : rule__ResourceInvolvement__Group__3__Impl ;
    public final void rule__ResourceInvolvement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4251:1: ( rule__ResourceInvolvement__Group__3__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4252:2: rule__ResourceInvolvement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ResourceInvolvement__Group__3__Impl_in_rule__ResourceInvolvement__Group__38466);
            rule__ResourceInvolvement__Group__3__Impl();

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
    // $ANTLR end "rule__ResourceInvolvement__Group__3"


    // $ANTLR start "rule__ResourceInvolvement__Group__3__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4258:1: rule__ResourceInvolvement__Group__3__Impl : ( ruleENDLINE ) ;
    public final void rule__ResourceInvolvement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4262:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4263:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4263:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4264:1: ruleENDLINE
            {
             before(grammarAccess.getResourceInvolvementAccess().getENDLINEParserRuleCall_3()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__ResourceInvolvement__Group__3__Impl8493);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getResourceInvolvementAccess().getENDLINEParserRuleCall_3()); 

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
    // $ANTLR end "rule__ResourceInvolvement__Group__3__Impl"


    // $ANTLR start "rule__ResourceInvolvement__Group_1__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4283:1: rule__ResourceInvolvement__Group_1__0 : rule__ResourceInvolvement__Group_1__0__Impl rule__ResourceInvolvement__Group_1__1 ;
    public final void rule__ResourceInvolvement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4287:1: ( rule__ResourceInvolvement__Group_1__0__Impl rule__ResourceInvolvement__Group_1__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4288:2: rule__ResourceInvolvement__Group_1__0__Impl rule__ResourceInvolvement__Group_1__1
            {
            pushFollow(FOLLOW_rule__ResourceInvolvement__Group_1__0__Impl_in_rule__ResourceInvolvement__Group_1__08530);
            rule__ResourceInvolvement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceInvolvement__Group_1__1_in_rule__ResourceInvolvement__Group_1__08533);
            rule__ResourceInvolvement__Group_1__1();

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
    // $ANTLR end "rule__ResourceInvolvement__Group_1__0"


    // $ANTLR start "rule__ResourceInvolvement__Group_1__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4295:1: rule__ResourceInvolvement__Group_1__0__Impl : ( 'at' ) ;
    public final void rule__ResourceInvolvement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4299:1: ( ( 'at' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4300:1: ( 'at' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4300:1: ( 'at' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4301:1: 'at'
            {
             before(grammarAccess.getResourceInvolvementAccess().getAtKeyword_1_0()); 
            match(input,39,FOLLOW_39_in_rule__ResourceInvolvement__Group_1__0__Impl8561); 
             after(grammarAccess.getResourceInvolvementAccess().getAtKeyword_1_0()); 

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
    // $ANTLR end "rule__ResourceInvolvement__Group_1__0__Impl"


    // $ANTLR start "rule__ResourceInvolvement__Group_1__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4314:1: rule__ResourceInvolvement__Group_1__1 : rule__ResourceInvolvement__Group_1__1__Impl rule__ResourceInvolvement__Group_1__2 ;
    public final void rule__ResourceInvolvement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4318:1: ( rule__ResourceInvolvement__Group_1__1__Impl rule__ResourceInvolvement__Group_1__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4319:2: rule__ResourceInvolvement__Group_1__1__Impl rule__ResourceInvolvement__Group_1__2
            {
            pushFollow(FOLLOW_rule__ResourceInvolvement__Group_1__1__Impl_in_rule__ResourceInvolvement__Group_1__18592);
            rule__ResourceInvolvement__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceInvolvement__Group_1__2_in_rule__ResourceInvolvement__Group_1__18595);
            rule__ResourceInvolvement__Group_1__2();

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
    // $ANTLR end "rule__ResourceInvolvement__Group_1__1"


    // $ANTLR start "rule__ResourceInvolvement__Group_1__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4326:1: rule__ResourceInvolvement__Group_1__1__Impl : ( ( rule__ResourceInvolvement__OccupationAssignment_1_1 ) ) ;
    public final void rule__ResourceInvolvement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4330:1: ( ( ( rule__ResourceInvolvement__OccupationAssignment_1_1 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4331:1: ( ( rule__ResourceInvolvement__OccupationAssignment_1_1 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4331:1: ( ( rule__ResourceInvolvement__OccupationAssignment_1_1 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4332:1: ( rule__ResourceInvolvement__OccupationAssignment_1_1 )
            {
             before(grammarAccess.getResourceInvolvementAccess().getOccupationAssignment_1_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4333:1: ( rule__ResourceInvolvement__OccupationAssignment_1_1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4333:2: rule__ResourceInvolvement__OccupationAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ResourceInvolvement__OccupationAssignment_1_1_in_rule__ResourceInvolvement__Group_1__1__Impl8622);
            rule__ResourceInvolvement__OccupationAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getResourceInvolvementAccess().getOccupationAssignment_1_1()); 

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
    // $ANTLR end "rule__ResourceInvolvement__Group_1__1__Impl"


    // $ANTLR start "rule__ResourceInvolvement__Group_1__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4343:1: rule__ResourceInvolvement__Group_1__2 : rule__ResourceInvolvement__Group_1__2__Impl ;
    public final void rule__ResourceInvolvement__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4347:1: ( rule__ResourceInvolvement__Group_1__2__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4348:2: rule__ResourceInvolvement__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ResourceInvolvement__Group_1__2__Impl_in_rule__ResourceInvolvement__Group_1__28652);
            rule__ResourceInvolvement__Group_1__2__Impl();

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
    // $ANTLR end "rule__ResourceInvolvement__Group_1__2"


    // $ANTLR start "rule__ResourceInvolvement__Group_1__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4354:1: rule__ResourceInvolvement__Group_1__2__Impl : ( '%' ) ;
    public final void rule__ResourceInvolvement__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4358:1: ( ( '%' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4359:1: ( '%' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4359:1: ( '%' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4360:1: '%'
            {
             before(grammarAccess.getResourceInvolvementAccess().getPercentSignKeyword_1_2()); 
            match(input,38,FOLLOW_38_in_rule__ResourceInvolvement__Group_1__2__Impl8680); 
             after(grammarAccess.getResourceInvolvementAccess().getPercentSignKeyword_1_2()); 

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
    // $ANTLR end "rule__ResourceInvolvement__Group_1__2__Impl"


    // $ANTLR start "rule__ResourceInvolvement__Group_2__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4379:1: rule__ResourceInvolvement__Group_2__0 : rule__ResourceInvolvement__Group_2__0__Impl rule__ResourceInvolvement__Group_2__1 ;
    public final void rule__ResourceInvolvement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4383:1: ( rule__ResourceInvolvement__Group_2__0__Impl rule__ResourceInvolvement__Group_2__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4384:2: rule__ResourceInvolvement__Group_2__0__Impl rule__ResourceInvolvement__Group_2__1
            {
            pushFollow(FOLLOW_rule__ResourceInvolvement__Group_2__0__Impl_in_rule__ResourceInvolvement__Group_2__08717);
            rule__ResourceInvolvement__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceInvolvement__Group_2__1_in_rule__ResourceInvolvement__Group_2__08720);
            rule__ResourceInvolvement__Group_2__1();

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
    // $ANTLR end "rule__ResourceInvolvement__Group_2__0"


    // $ANTLR start "rule__ResourceInvolvement__Group_2__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4391:1: rule__ResourceInvolvement__Group_2__0__Impl : ( 'as' ) ;
    public final void rule__ResourceInvolvement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4395:1: ( ( 'as' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4396:1: ( 'as' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4396:1: ( 'as' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4397:1: 'as'
            {
             before(grammarAccess.getResourceInvolvementAccess().getAsKeyword_2_0()); 
            match(input,40,FOLLOW_40_in_rule__ResourceInvolvement__Group_2__0__Impl8748); 
             after(grammarAccess.getResourceInvolvementAccess().getAsKeyword_2_0()); 

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
    // $ANTLR end "rule__ResourceInvolvement__Group_2__0__Impl"


    // $ANTLR start "rule__ResourceInvolvement__Group_2__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4410:1: rule__ResourceInvolvement__Group_2__1 : rule__ResourceInvolvement__Group_2__1__Impl ;
    public final void rule__ResourceInvolvement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4414:1: ( rule__ResourceInvolvement__Group_2__1__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4415:2: rule__ResourceInvolvement__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ResourceInvolvement__Group_2__1__Impl_in_rule__ResourceInvolvement__Group_2__18779);
            rule__ResourceInvolvement__Group_2__1__Impl();

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
    // $ANTLR end "rule__ResourceInvolvement__Group_2__1"


    // $ANTLR start "rule__ResourceInvolvement__Group_2__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4421:1: rule__ResourceInvolvement__Group_2__1__Impl : ( ( rule__ResourceInvolvement__ResponsibilityAssignment_2_1 ) ) ;
    public final void rule__ResourceInvolvement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4425:1: ( ( ( rule__ResourceInvolvement__ResponsibilityAssignment_2_1 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4426:1: ( ( rule__ResourceInvolvement__ResponsibilityAssignment_2_1 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4426:1: ( ( rule__ResourceInvolvement__ResponsibilityAssignment_2_1 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4427:1: ( rule__ResourceInvolvement__ResponsibilityAssignment_2_1 )
            {
             before(grammarAccess.getResourceInvolvementAccess().getResponsibilityAssignment_2_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4428:1: ( rule__ResourceInvolvement__ResponsibilityAssignment_2_1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4428:2: rule__ResourceInvolvement__ResponsibilityAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ResourceInvolvement__ResponsibilityAssignment_2_1_in_rule__ResourceInvolvement__Group_2__1__Impl8806);
            rule__ResourceInvolvement__ResponsibilityAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getResourceInvolvementAccess().getResponsibilityAssignment_2_1()); 

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
    // $ANTLR end "rule__ResourceInvolvement__Group_2__1__Impl"


    // $ANTLR start "rule__Activity__Group__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4442:1: rule__Activity__Group__0 : rule__Activity__Group__0__Impl rule__Activity__Group__1 ;
    public final void rule__Activity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4446:1: ( rule__Activity__Group__0__Impl rule__Activity__Group__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4447:2: rule__Activity__Group__0__Impl rule__Activity__Group__1
            {
            pushFollow(FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__08840);
            rule__Activity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__08843);
            rule__Activity__Group__1();

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
    // $ANTLR end "rule__Activity__Group__0"


    // $ANTLR start "rule__Activity__Group__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4454:1: rule__Activity__Group__0__Impl : ( ( rule__Activity__DescriptionAssignment_0 )? ) ;
    public final void rule__Activity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4458:1: ( ( ( rule__Activity__DescriptionAssignment_0 )? ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4459:1: ( ( rule__Activity__DescriptionAssignment_0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4459:1: ( ( rule__Activity__DescriptionAssignment_0 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4460:1: ( rule__Activity__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getActivityAccess().getDescriptionAssignment_0()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4461:1: ( rule__Activity__DescriptionAssignment_0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ML_COMMENT) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4461:2: rule__Activity__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Activity__DescriptionAssignment_0_in_rule__Activity__Group__0__Impl8870);
                    rule__Activity__DescriptionAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivityAccess().getDescriptionAssignment_0()); 

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
    // $ANTLR end "rule__Activity__Group__0__Impl"


    // $ANTLR start "rule__Activity__Group__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4471:1: rule__Activity__Group__1 : rule__Activity__Group__1__Impl rule__Activity__Group__2 ;
    public final void rule__Activity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4475:1: ( rule__Activity__Group__1__Impl rule__Activity__Group__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4476:2: rule__Activity__Group__1__Impl rule__Activity__Group__2
            {
            pushFollow(FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__18901);
            rule__Activity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__18904);
            rule__Activity__Group__2();

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
    // $ANTLR end "rule__Activity__Group__1"


    // $ANTLR start "rule__Activity__Group__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4483:1: rule__Activity__Group__1__Impl : ( 'Activity' ) ;
    public final void rule__Activity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4487:1: ( ( 'Activity' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4488:1: ( 'Activity' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4488:1: ( 'Activity' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4489:1: 'Activity'
            {
             before(grammarAccess.getActivityAccess().getActivityKeyword_1()); 
            match(input,41,FOLLOW_41_in_rule__Activity__Group__1__Impl8932); 
             after(grammarAccess.getActivityAccess().getActivityKeyword_1()); 

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
    // $ANTLR end "rule__Activity__Group__1__Impl"


    // $ANTLR start "rule__Activity__Group__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4502:1: rule__Activity__Group__2 : rule__Activity__Group__2__Impl rule__Activity__Group__3 ;
    public final void rule__Activity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4506:1: ( rule__Activity__Group__2__Impl rule__Activity__Group__3 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4507:2: rule__Activity__Group__2__Impl rule__Activity__Group__3
            {
            pushFollow(FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__28963);
            rule__Activity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__28966);
            rule__Activity__Group__3();

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
    // $ANTLR end "rule__Activity__Group__2"


    // $ANTLR start "rule__Activity__Group__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4514:1: rule__Activity__Group__2__Impl : ( ( rule__Activity__NameAssignment_2 ) ) ;
    public final void rule__Activity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4518:1: ( ( ( rule__Activity__NameAssignment_2 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4519:1: ( ( rule__Activity__NameAssignment_2 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4519:1: ( ( rule__Activity__NameAssignment_2 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4520:1: ( rule__Activity__NameAssignment_2 )
            {
             before(grammarAccess.getActivityAccess().getNameAssignment_2()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4521:1: ( rule__Activity__NameAssignment_2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4521:2: rule__Activity__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Activity__NameAssignment_2_in_rule__Activity__Group__2__Impl8993);
            rule__Activity__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Activity__Group__2__Impl"


    // $ANTLR start "rule__Activity__Group__3"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4531:1: rule__Activity__Group__3 : rule__Activity__Group__3__Impl rule__Activity__Group__4 ;
    public final void rule__Activity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4535:1: ( rule__Activity__Group__3__Impl rule__Activity__Group__4 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4536:2: rule__Activity__Group__3__Impl rule__Activity__Group__4
            {
            pushFollow(FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__39023);
            rule__Activity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__39026);
            rule__Activity__Group__4();

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
    // $ANTLR end "rule__Activity__Group__3"


    // $ANTLR start "rule__Activity__Group__3__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4543:1: rule__Activity__Group__3__Impl : ( RULE_OPENCURLY ) ;
    public final void rule__Activity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4547:1: ( ( RULE_OPENCURLY ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4548:1: ( RULE_OPENCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4548:1: ( RULE_OPENCURLY )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4549:1: RULE_OPENCURLY
            {
             before(grammarAccess.getActivityAccess().getOPENCURLYTerminalRuleCall_3()); 
            match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_rule__Activity__Group__3__Impl9053); 
             after(grammarAccess.getActivityAccess().getOPENCURLYTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__Activity__Group__3__Impl"


    // $ANTLR start "rule__Activity__Group__4"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4560:1: rule__Activity__Group__4 : rule__Activity__Group__4__Impl rule__Activity__Group__5 ;
    public final void rule__Activity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4564:1: ( rule__Activity__Group__4__Impl rule__Activity__Group__5 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4565:2: rule__Activity__Group__4__Impl rule__Activity__Group__5
            {
            pushFollow(FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__49082);
            rule__Activity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__5_in_rule__Activity__Group__49085);
            rule__Activity__Group__5();

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
    // $ANTLR end "rule__Activity__Group__4"


    // $ANTLR start "rule__Activity__Group__4__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4572:1: rule__Activity__Group__4__Impl : ( ( rule__Activity__Group_4__0 )? ) ;
    public final void rule__Activity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4576:1: ( ( ( rule__Activity__Group_4__0 )? ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4577:1: ( ( rule__Activity__Group_4__0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4577:1: ( ( rule__Activity__Group_4__0 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4578:1: ( rule__Activity__Group_4__0 )?
            {
             before(grammarAccess.getActivityAccess().getGroup_4()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4579:1: ( rule__Activity__Group_4__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==19) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4579:2: rule__Activity__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_4__0_in_rule__Activity__Group__4__Impl9112);
                    rule__Activity__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivityAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Activity__Group__4__Impl"


    // $ANTLR start "rule__Activity__Group__5"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4589:1: rule__Activity__Group__5 : rule__Activity__Group__5__Impl rule__Activity__Group__6 ;
    public final void rule__Activity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4593:1: ( rule__Activity__Group__5__Impl rule__Activity__Group__6 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4594:2: rule__Activity__Group__5__Impl rule__Activity__Group__6
            {
            pushFollow(FOLLOW_rule__Activity__Group__5__Impl_in_rule__Activity__Group__59143);
            rule__Activity__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__6_in_rule__Activity__Group__59146);
            rule__Activity__Group__6();

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
    // $ANTLR end "rule__Activity__Group__5"


    // $ANTLR start "rule__Activity__Group__5__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4601:1: rule__Activity__Group__5__Impl : ( ( rule__Activity__Group_5__0 )? ) ;
    public final void rule__Activity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4605:1: ( ( ( rule__Activity__Group_5__0 )? ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4606:1: ( ( rule__Activity__Group_5__0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4606:1: ( ( rule__Activity__Group_5__0 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4607:1: ( rule__Activity__Group_5__0 )?
            {
             before(grammarAccess.getActivityAccess().getGroup_5()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4608:1: ( rule__Activity__Group_5__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==42) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4608:2: rule__Activity__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_5__0_in_rule__Activity__Group__5__Impl9173);
                    rule__Activity__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivityAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Activity__Group__5__Impl"


    // $ANTLR start "rule__Activity__Group__6"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4618:1: rule__Activity__Group__6 : rule__Activity__Group__6__Impl rule__Activity__Group__7 ;
    public final void rule__Activity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4622:1: ( rule__Activity__Group__6__Impl rule__Activity__Group__7 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4623:2: rule__Activity__Group__6__Impl rule__Activity__Group__7
            {
            pushFollow(FOLLOW_rule__Activity__Group__6__Impl_in_rule__Activity__Group__69204);
            rule__Activity__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__7_in_rule__Activity__Group__69207);
            rule__Activity__Group__7();

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
    // $ANTLR end "rule__Activity__Group__6"


    // $ANTLR start "rule__Activity__Group__6__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4630:1: rule__Activity__Group__6__Impl : ( ( rule__Activity__Group_6__0 )? ) ;
    public final void rule__Activity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4634:1: ( ( ( rule__Activity__Group_6__0 )? ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4635:1: ( ( rule__Activity__Group_6__0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4635:1: ( ( rule__Activity__Group_6__0 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4636:1: ( rule__Activity__Group_6__0 )?
            {
             before(grammarAccess.getActivityAccess().getGroup_6()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4637:1: ( rule__Activity__Group_6__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==26) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4637:2: rule__Activity__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_6__0_in_rule__Activity__Group__6__Impl9234);
                    rule__Activity__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivityAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Activity__Group__6__Impl"


    // $ANTLR start "rule__Activity__Group__7"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4647:1: rule__Activity__Group__7 : rule__Activity__Group__7__Impl rule__Activity__Group__8 ;
    public final void rule__Activity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4651:1: ( rule__Activity__Group__7__Impl rule__Activity__Group__8 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4652:2: rule__Activity__Group__7__Impl rule__Activity__Group__8
            {
            pushFollow(FOLLOW_rule__Activity__Group__7__Impl_in_rule__Activity__Group__79265);
            rule__Activity__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__8_in_rule__Activity__Group__79268);
            rule__Activity__Group__8();

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
    // $ANTLR end "rule__Activity__Group__7"


    // $ANTLR start "rule__Activity__Group__7__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4659:1: rule__Activity__Group__7__Impl : ( ( rule__Activity__UnorderedGroup_7 ) ) ;
    public final void rule__Activity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4663:1: ( ( ( rule__Activity__UnorderedGroup_7 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4664:1: ( ( rule__Activity__UnorderedGroup_7 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4664:1: ( ( rule__Activity__UnorderedGroup_7 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4665:1: ( rule__Activity__UnorderedGroup_7 )
            {
             before(grammarAccess.getActivityAccess().getUnorderedGroup_7()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4666:1: ( rule__Activity__UnorderedGroup_7 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4666:2: rule__Activity__UnorderedGroup_7
            {
            pushFollow(FOLLOW_rule__Activity__UnorderedGroup_7_in_rule__Activity__Group__7__Impl9295);
            rule__Activity__UnorderedGroup_7();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getUnorderedGroup_7()); 

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
    // $ANTLR end "rule__Activity__Group__7__Impl"


    // $ANTLR start "rule__Activity__Group__8"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4676:1: rule__Activity__Group__8 : rule__Activity__Group__8__Impl ;
    public final void rule__Activity__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4680:1: ( rule__Activity__Group__8__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4681:2: rule__Activity__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group__8__Impl_in_rule__Activity__Group__89325);
            rule__Activity__Group__8__Impl();

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
    // $ANTLR end "rule__Activity__Group__8"


    // $ANTLR start "rule__Activity__Group__8__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4687:1: rule__Activity__Group__8__Impl : ( RULE_CLOSEDCURLY ) ;
    public final void rule__Activity__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4691:1: ( ( RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4692:1: ( RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4692:1: ( RULE_CLOSEDCURLY )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4693:1: RULE_CLOSEDCURLY
            {
             before(grammarAccess.getActivityAccess().getCLOSEDCURLYTerminalRuleCall_8()); 
            match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_rule__Activity__Group__8__Impl9352); 
             after(grammarAccess.getActivityAccess().getCLOSEDCURLYTerminalRuleCall_8()); 

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
    // $ANTLR end "rule__Activity__Group__8__Impl"


    // $ANTLR start "rule__Activity__Group_4__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4722:1: rule__Activity__Group_4__0 : rule__Activity__Group_4__0__Impl rule__Activity__Group_4__1 ;
    public final void rule__Activity__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4726:1: ( rule__Activity__Group_4__0__Impl rule__Activity__Group_4__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4727:2: rule__Activity__Group_4__0__Impl rule__Activity__Group_4__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_4__0__Impl_in_rule__Activity__Group_4__09399);
            rule__Activity__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_4__1_in_rule__Activity__Group_4__09402);
            rule__Activity__Group_4__1();

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
    // $ANTLR end "rule__Activity__Group_4__0"


    // $ANTLR start "rule__Activity__Group_4__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4734:1: rule__Activity__Group_4__0__Impl : ( 'name' ) ;
    public final void rule__Activity__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4738:1: ( ( 'name' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4739:1: ( 'name' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4739:1: ( 'name' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4740:1: 'name'
            {
             before(grammarAccess.getActivityAccess().getNameKeyword_4_0()); 
            match(input,19,FOLLOW_19_in_rule__Activity__Group_4__0__Impl9430); 
             after(grammarAccess.getActivityAccess().getNameKeyword_4_0()); 

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
    // $ANTLR end "rule__Activity__Group_4__0__Impl"


    // $ANTLR start "rule__Activity__Group_4__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4753:1: rule__Activity__Group_4__1 : rule__Activity__Group_4__1__Impl rule__Activity__Group_4__2 ;
    public final void rule__Activity__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4757:1: ( rule__Activity__Group_4__1__Impl rule__Activity__Group_4__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4758:2: rule__Activity__Group_4__1__Impl rule__Activity__Group_4__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_4__1__Impl_in_rule__Activity__Group_4__19461);
            rule__Activity__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_4__2_in_rule__Activity__Group_4__19464);
            rule__Activity__Group_4__2();

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
    // $ANTLR end "rule__Activity__Group_4__1"


    // $ANTLR start "rule__Activity__Group_4__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4765:1: rule__Activity__Group_4__1__Impl : ( ( rule__Activity__LongNameAssignment_4_1 ) ) ;
    public final void rule__Activity__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4769:1: ( ( ( rule__Activity__LongNameAssignment_4_1 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4770:1: ( ( rule__Activity__LongNameAssignment_4_1 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4770:1: ( ( rule__Activity__LongNameAssignment_4_1 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4771:1: ( rule__Activity__LongNameAssignment_4_1 )
            {
             before(grammarAccess.getActivityAccess().getLongNameAssignment_4_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4772:1: ( rule__Activity__LongNameAssignment_4_1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4772:2: rule__Activity__LongNameAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Activity__LongNameAssignment_4_1_in_rule__Activity__Group_4__1__Impl9491);
            rule__Activity__LongNameAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getLongNameAssignment_4_1()); 

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
    // $ANTLR end "rule__Activity__Group_4__1__Impl"


    // $ANTLR start "rule__Activity__Group_4__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4782:1: rule__Activity__Group_4__2 : rule__Activity__Group_4__2__Impl ;
    public final void rule__Activity__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4786:1: ( rule__Activity__Group_4__2__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4787:2: rule__Activity__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_4__2__Impl_in_rule__Activity__Group_4__29521);
            rule__Activity__Group_4__2__Impl();

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
    // $ANTLR end "rule__Activity__Group_4__2"


    // $ANTLR start "rule__Activity__Group_4__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4793:1: rule__Activity__Group_4__2__Impl : ( ruleENDLINE ) ;
    public final void rule__Activity__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4797:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4798:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4798:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4799:1: ruleENDLINE
            {
             before(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_4_2()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__Activity__Group_4__2__Impl9548);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_4_2()); 

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
    // $ANTLR end "rule__Activity__Group_4__2__Impl"


    // $ANTLR start "rule__Activity__Group_5__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4816:1: rule__Activity__Group_5__0 : rule__Activity__Group_5__0__Impl rule__Activity__Group_5__1 ;
    public final void rule__Activity__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4820:1: ( rule__Activity__Group_5__0__Impl rule__Activity__Group_5__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4821:2: rule__Activity__Group_5__0__Impl rule__Activity__Group_5__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_5__0__Impl_in_rule__Activity__Group_5__09583);
            rule__Activity__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_5__1_in_rule__Activity__Group_5__09586);
            rule__Activity__Group_5__1();

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
    // $ANTLR end "rule__Activity__Group_5__0"


    // $ANTLR start "rule__Activity__Group_5__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4828:1: rule__Activity__Group_5__0__Impl : ( 'involves' ) ;
    public final void rule__Activity__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4832:1: ( ( 'involves' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4833:1: ( 'involves' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4833:1: ( 'involves' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4834:1: 'involves'
            {
             before(grammarAccess.getActivityAccess().getInvolvesKeyword_5_0()); 
            match(input,42,FOLLOW_42_in_rule__Activity__Group_5__0__Impl9614); 
             after(grammarAccess.getActivityAccess().getInvolvesKeyword_5_0()); 

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
    // $ANTLR end "rule__Activity__Group_5__0__Impl"


    // $ANTLR start "rule__Activity__Group_5__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4847:1: rule__Activity__Group_5__1 : rule__Activity__Group_5__1__Impl rule__Activity__Group_5__2 ;
    public final void rule__Activity__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4851:1: ( rule__Activity__Group_5__1__Impl rule__Activity__Group_5__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4852:2: rule__Activity__Group_5__1__Impl rule__Activity__Group_5__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_5__1__Impl_in_rule__Activity__Group_5__19645);
            rule__Activity__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_5__2_in_rule__Activity__Group_5__19648);
            rule__Activity__Group_5__2();

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
    // $ANTLR end "rule__Activity__Group_5__1"


    // $ANTLR start "rule__Activity__Group_5__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4859:1: rule__Activity__Group_5__1__Impl : ( RULE_OPENCURLY ) ;
    public final void rule__Activity__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4863:1: ( ( RULE_OPENCURLY ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4864:1: ( RULE_OPENCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4864:1: ( RULE_OPENCURLY )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4865:1: RULE_OPENCURLY
            {
             before(grammarAccess.getActivityAccess().getOPENCURLYTerminalRuleCall_5_1()); 
            match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_rule__Activity__Group_5__1__Impl9675); 
             after(grammarAccess.getActivityAccess().getOPENCURLYTerminalRuleCall_5_1()); 

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
    // $ANTLR end "rule__Activity__Group_5__1__Impl"


    // $ANTLR start "rule__Activity__Group_5__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4876:1: rule__Activity__Group_5__2 : rule__Activity__Group_5__2__Impl rule__Activity__Group_5__3 ;
    public final void rule__Activity__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4880:1: ( rule__Activity__Group_5__2__Impl rule__Activity__Group_5__3 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4881:2: rule__Activity__Group_5__2__Impl rule__Activity__Group_5__3
            {
            pushFollow(FOLLOW_rule__Activity__Group_5__2__Impl_in_rule__Activity__Group_5__29704);
            rule__Activity__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_5__3_in_rule__Activity__Group_5__29707);
            rule__Activity__Group_5__3();

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
    // $ANTLR end "rule__Activity__Group_5__2"


    // $ANTLR start "rule__Activity__Group_5__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4888:1: rule__Activity__Group_5__2__Impl : ( ( rule__Activity__InvolvedResourcesAssignment_5_2 )* ) ;
    public final void rule__Activity__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4892:1: ( ( ( rule__Activity__InvolvedResourcesAssignment_5_2 )* ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4893:1: ( ( rule__Activity__InvolvedResourcesAssignment_5_2 )* )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4893:1: ( ( rule__Activity__InvolvedResourcesAssignment_5_2 )* )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4894:1: ( rule__Activity__InvolvedResourcesAssignment_5_2 )*
            {
             before(grammarAccess.getActivityAccess().getInvolvedResourcesAssignment_5_2()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4895:1: ( rule__Activity__InvolvedResourcesAssignment_5_2 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_ID) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4895:2: rule__Activity__InvolvedResourcesAssignment_5_2
            	    {
            	    pushFollow(FOLLOW_rule__Activity__InvolvedResourcesAssignment_5_2_in_rule__Activity__Group_5__2__Impl9734);
            	    rule__Activity__InvolvedResourcesAssignment_5_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getActivityAccess().getInvolvedResourcesAssignment_5_2()); 

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
    // $ANTLR end "rule__Activity__Group_5__2__Impl"


    // $ANTLR start "rule__Activity__Group_5__3"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4905:1: rule__Activity__Group_5__3 : rule__Activity__Group_5__3__Impl ;
    public final void rule__Activity__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4909:1: ( rule__Activity__Group_5__3__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4910:2: rule__Activity__Group_5__3__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_5__3__Impl_in_rule__Activity__Group_5__39765);
            rule__Activity__Group_5__3__Impl();

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
    // $ANTLR end "rule__Activity__Group_5__3"


    // $ANTLR start "rule__Activity__Group_5__3__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4916:1: rule__Activity__Group_5__3__Impl : ( RULE_CLOSEDCURLY ) ;
    public final void rule__Activity__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4920:1: ( ( RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4921:1: ( RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4921:1: ( RULE_CLOSEDCURLY )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4922:1: RULE_CLOSEDCURLY
            {
             before(grammarAccess.getActivityAccess().getCLOSEDCURLYTerminalRuleCall_5_3()); 
            match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_rule__Activity__Group_5__3__Impl9792); 
             after(grammarAccess.getActivityAccess().getCLOSEDCURLYTerminalRuleCall_5_3()); 

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
    // $ANTLR end "rule__Activity__Group_5__3__Impl"


    // $ANTLR start "rule__Activity__Group_6__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4941:1: rule__Activity__Group_6__0 : rule__Activity__Group_6__0__Impl rule__Activity__Group_6__1 ;
    public final void rule__Activity__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4945:1: ( rule__Activity__Group_6__0__Impl rule__Activity__Group_6__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4946:2: rule__Activity__Group_6__0__Impl rule__Activity__Group_6__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_6__0__Impl_in_rule__Activity__Group_6__09829);
            rule__Activity__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_6__1_in_rule__Activity__Group_6__09832);
            rule__Activity__Group_6__1();

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
    // $ANTLR end "rule__Activity__Group_6__0"


    // $ANTLR start "rule__Activity__Group_6__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4953:1: rule__Activity__Group_6__0__Impl : ( 'wbsActivity' ) ;
    public final void rule__Activity__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4957:1: ( ( 'wbsActivity' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4958:1: ( 'wbsActivity' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4958:1: ( 'wbsActivity' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4959:1: 'wbsActivity'
            {
             before(grammarAccess.getActivityAccess().getWbsActivityKeyword_6_0()); 
            match(input,26,FOLLOW_26_in_rule__Activity__Group_6__0__Impl9860); 
             after(grammarAccess.getActivityAccess().getWbsActivityKeyword_6_0()); 

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
    // $ANTLR end "rule__Activity__Group_6__0__Impl"


    // $ANTLR start "rule__Activity__Group_6__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4972:1: rule__Activity__Group_6__1 : rule__Activity__Group_6__1__Impl rule__Activity__Group_6__2 ;
    public final void rule__Activity__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4976:1: ( rule__Activity__Group_6__1__Impl rule__Activity__Group_6__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4977:2: rule__Activity__Group_6__1__Impl rule__Activity__Group_6__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_6__1__Impl_in_rule__Activity__Group_6__19891);
            rule__Activity__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_6__2_in_rule__Activity__Group_6__19894);
            rule__Activity__Group_6__2();

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
    // $ANTLR end "rule__Activity__Group_6__1"


    // $ANTLR start "rule__Activity__Group_6__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4984:1: rule__Activity__Group_6__1__Impl : ( ( rule__Activity__WbsActivityAssignment_6_1 )* ) ;
    public final void rule__Activity__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4988:1: ( ( ( rule__Activity__WbsActivityAssignment_6_1 )* ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4989:1: ( ( rule__Activity__WbsActivityAssignment_6_1 )* )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4989:1: ( ( rule__Activity__WbsActivityAssignment_6_1 )* )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4990:1: ( rule__Activity__WbsActivityAssignment_6_1 )*
            {
             before(grammarAccess.getActivityAccess().getWbsActivityAssignment_6_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4991:1: ( rule__Activity__WbsActivityAssignment_6_1 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_ID) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:4991:2: rule__Activity__WbsActivityAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_rule__Activity__WbsActivityAssignment_6_1_in_rule__Activity__Group_6__1__Impl9921);
            	    rule__Activity__WbsActivityAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getActivityAccess().getWbsActivityAssignment_6_1()); 

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
    // $ANTLR end "rule__Activity__Group_6__1__Impl"


    // $ANTLR start "rule__Activity__Group_6__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5001:1: rule__Activity__Group_6__2 : rule__Activity__Group_6__2__Impl ;
    public final void rule__Activity__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5005:1: ( rule__Activity__Group_6__2__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5006:2: rule__Activity__Group_6__2__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_6__2__Impl_in_rule__Activity__Group_6__29952);
            rule__Activity__Group_6__2__Impl();

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
    // $ANTLR end "rule__Activity__Group_6__2"


    // $ANTLR start "rule__Activity__Group_6__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5012:1: rule__Activity__Group_6__2__Impl : ( ruleENDLINE ) ;
    public final void rule__Activity__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5016:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5017:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5017:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5018:1: ruleENDLINE
            {
             before(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_6_2()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__Activity__Group_6__2__Impl9979);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_6_2()); 

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
    // $ANTLR end "rule__Activity__Group_6__2__Impl"


    // $ANTLR start "rule__Activity__Group_7_0_0__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5035:1: rule__Activity__Group_7_0_0__0 : rule__Activity__Group_7_0_0__0__Impl rule__Activity__Group_7_0_0__1 ;
    public final void rule__Activity__Group_7_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5039:1: ( rule__Activity__Group_7_0_0__0__Impl rule__Activity__Group_7_0_0__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5040:2: rule__Activity__Group_7_0_0__0__Impl rule__Activity__Group_7_0_0__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_7_0_0__0__Impl_in_rule__Activity__Group_7_0_0__010014);
            rule__Activity__Group_7_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_7_0_0__1_in_rule__Activity__Group_7_0_0__010017);
            rule__Activity__Group_7_0_0__1();

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
    // $ANTLR end "rule__Activity__Group_7_0_0__0"


    // $ANTLR start "rule__Activity__Group_7_0_0__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5047:1: rule__Activity__Group_7_0_0__0__Impl : ( 'starts' ) ;
    public final void rule__Activity__Group_7_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5051:1: ( ( 'starts' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5052:1: ( 'starts' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5052:1: ( 'starts' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5053:1: 'starts'
            {
             before(grammarAccess.getActivityAccess().getStartsKeyword_7_0_0_0()); 
            match(input,43,FOLLOW_43_in_rule__Activity__Group_7_0_0__0__Impl10045); 
             after(grammarAccess.getActivityAccess().getStartsKeyword_7_0_0_0()); 

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
    // $ANTLR end "rule__Activity__Group_7_0_0__0__Impl"


    // $ANTLR start "rule__Activity__Group_7_0_0__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5066:1: rule__Activity__Group_7_0_0__1 : rule__Activity__Group_7_0_0__1__Impl rule__Activity__Group_7_0_0__2 ;
    public final void rule__Activity__Group_7_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5070:1: ( rule__Activity__Group_7_0_0__1__Impl rule__Activity__Group_7_0_0__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5071:2: rule__Activity__Group_7_0_0__1__Impl rule__Activity__Group_7_0_0__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_7_0_0__1__Impl_in_rule__Activity__Group_7_0_0__110076);
            rule__Activity__Group_7_0_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_7_0_0__2_in_rule__Activity__Group_7_0_0__110079);
            rule__Activity__Group_7_0_0__2();

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
    // $ANTLR end "rule__Activity__Group_7_0_0__1"


    // $ANTLR start "rule__Activity__Group_7_0_0__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5078:1: rule__Activity__Group_7_0_0__1__Impl : ( ( rule__Activity__StartAssignment_7_0_0_1 ) ) ;
    public final void rule__Activity__Group_7_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5082:1: ( ( ( rule__Activity__StartAssignment_7_0_0_1 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5083:1: ( ( rule__Activity__StartAssignment_7_0_0_1 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5083:1: ( ( rule__Activity__StartAssignment_7_0_0_1 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5084:1: ( rule__Activity__StartAssignment_7_0_0_1 )
            {
             before(grammarAccess.getActivityAccess().getStartAssignment_7_0_0_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5085:1: ( rule__Activity__StartAssignment_7_0_0_1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5085:2: rule__Activity__StartAssignment_7_0_0_1
            {
            pushFollow(FOLLOW_rule__Activity__StartAssignment_7_0_0_1_in_rule__Activity__Group_7_0_0__1__Impl10106);
            rule__Activity__StartAssignment_7_0_0_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getStartAssignment_7_0_0_1()); 

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
    // $ANTLR end "rule__Activity__Group_7_0_0__1__Impl"


    // $ANTLR start "rule__Activity__Group_7_0_0__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5095:1: rule__Activity__Group_7_0_0__2 : rule__Activity__Group_7_0_0__2__Impl ;
    public final void rule__Activity__Group_7_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5099:1: ( rule__Activity__Group_7_0_0__2__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5100:2: rule__Activity__Group_7_0_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_7_0_0__2__Impl_in_rule__Activity__Group_7_0_0__210136);
            rule__Activity__Group_7_0_0__2__Impl();

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
    // $ANTLR end "rule__Activity__Group_7_0_0__2"


    // $ANTLR start "rule__Activity__Group_7_0_0__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5106:1: rule__Activity__Group_7_0_0__2__Impl : ( ruleENDLINE ) ;
    public final void rule__Activity__Group_7_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5110:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5111:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5111:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5112:1: ruleENDLINE
            {
             before(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_7_0_0_2()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__Activity__Group_7_0_0__2__Impl10163);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_7_0_0_2()); 

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
    // $ANTLR end "rule__Activity__Group_7_0_0__2__Impl"


    // $ANTLR start "rule__Activity__Group_7_0_1__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5129:1: rule__Activity__Group_7_0_1__0 : rule__Activity__Group_7_0_1__0__Impl rule__Activity__Group_7_0_1__1 ;
    public final void rule__Activity__Group_7_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5133:1: ( rule__Activity__Group_7_0_1__0__Impl rule__Activity__Group_7_0_1__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5134:2: rule__Activity__Group_7_0_1__0__Impl rule__Activity__Group_7_0_1__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_7_0_1__0__Impl_in_rule__Activity__Group_7_0_1__010198);
            rule__Activity__Group_7_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_7_0_1__1_in_rule__Activity__Group_7_0_1__010201);
            rule__Activity__Group_7_0_1__1();

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
    // $ANTLR end "rule__Activity__Group_7_0_1__0"


    // $ANTLR start "rule__Activity__Group_7_0_1__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5141:1: rule__Activity__Group_7_0_1__0__Impl : ( 'after' ) ;
    public final void rule__Activity__Group_7_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5145:1: ( ( 'after' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5146:1: ( 'after' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5146:1: ( 'after' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5147:1: 'after'
            {
             before(grammarAccess.getActivityAccess().getAfterKeyword_7_0_1_0()); 
            match(input,35,FOLLOW_35_in_rule__Activity__Group_7_0_1__0__Impl10229); 
             after(grammarAccess.getActivityAccess().getAfterKeyword_7_0_1_0()); 

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
    // $ANTLR end "rule__Activity__Group_7_0_1__0__Impl"


    // $ANTLR start "rule__Activity__Group_7_0_1__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5160:1: rule__Activity__Group_7_0_1__1 : rule__Activity__Group_7_0_1__1__Impl rule__Activity__Group_7_0_1__2 ;
    public final void rule__Activity__Group_7_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5164:1: ( rule__Activity__Group_7_0_1__1__Impl rule__Activity__Group_7_0_1__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5165:2: rule__Activity__Group_7_0_1__1__Impl rule__Activity__Group_7_0_1__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_7_0_1__1__Impl_in_rule__Activity__Group_7_0_1__110260);
            rule__Activity__Group_7_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_7_0_1__2_in_rule__Activity__Group_7_0_1__110263);
            rule__Activity__Group_7_0_1__2();

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
    // $ANTLR end "rule__Activity__Group_7_0_1__1"


    // $ANTLR start "rule__Activity__Group_7_0_1__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5172:1: rule__Activity__Group_7_0_1__1__Impl : ( ( rule__Activity__AfterAssignment_7_0_1_1 ) ) ;
    public final void rule__Activity__Group_7_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5176:1: ( ( ( rule__Activity__AfterAssignment_7_0_1_1 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5177:1: ( ( rule__Activity__AfterAssignment_7_0_1_1 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5177:1: ( ( rule__Activity__AfterAssignment_7_0_1_1 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5178:1: ( rule__Activity__AfterAssignment_7_0_1_1 )
            {
             before(grammarAccess.getActivityAccess().getAfterAssignment_7_0_1_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5179:1: ( rule__Activity__AfterAssignment_7_0_1_1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5179:2: rule__Activity__AfterAssignment_7_0_1_1
            {
            pushFollow(FOLLOW_rule__Activity__AfterAssignment_7_0_1_1_in_rule__Activity__Group_7_0_1__1__Impl10290);
            rule__Activity__AfterAssignment_7_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getAfterAssignment_7_0_1_1()); 

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
    // $ANTLR end "rule__Activity__Group_7_0_1__1__Impl"


    // $ANTLR start "rule__Activity__Group_7_0_1__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5189:1: rule__Activity__Group_7_0_1__2 : rule__Activity__Group_7_0_1__2__Impl rule__Activity__Group_7_0_1__3 ;
    public final void rule__Activity__Group_7_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5193:1: ( rule__Activity__Group_7_0_1__2__Impl rule__Activity__Group_7_0_1__3 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5194:2: rule__Activity__Group_7_0_1__2__Impl rule__Activity__Group_7_0_1__3
            {
            pushFollow(FOLLOW_rule__Activity__Group_7_0_1__2__Impl_in_rule__Activity__Group_7_0_1__210320);
            rule__Activity__Group_7_0_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_7_0_1__3_in_rule__Activity__Group_7_0_1__210323);
            rule__Activity__Group_7_0_1__3();

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
    // $ANTLR end "rule__Activity__Group_7_0_1__2"


    // $ANTLR start "rule__Activity__Group_7_0_1__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5201:1: rule__Activity__Group_7_0_1__2__Impl : ( 'offset' ) ;
    public final void rule__Activity__Group_7_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5205:1: ( ( 'offset' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5206:1: ( 'offset' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5206:1: ( 'offset' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5207:1: 'offset'
            {
             before(grammarAccess.getActivityAccess().getOffsetKeyword_7_0_1_2()); 
            match(input,36,FOLLOW_36_in_rule__Activity__Group_7_0_1__2__Impl10351); 
             after(grammarAccess.getActivityAccess().getOffsetKeyword_7_0_1_2()); 

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
    // $ANTLR end "rule__Activity__Group_7_0_1__2__Impl"


    // $ANTLR start "rule__Activity__Group_7_0_1__3"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5220:1: rule__Activity__Group_7_0_1__3 : rule__Activity__Group_7_0_1__3__Impl rule__Activity__Group_7_0_1__4 ;
    public final void rule__Activity__Group_7_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5224:1: ( rule__Activity__Group_7_0_1__3__Impl rule__Activity__Group_7_0_1__4 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5225:2: rule__Activity__Group_7_0_1__3__Impl rule__Activity__Group_7_0_1__4
            {
            pushFollow(FOLLOW_rule__Activity__Group_7_0_1__3__Impl_in_rule__Activity__Group_7_0_1__310382);
            rule__Activity__Group_7_0_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_7_0_1__4_in_rule__Activity__Group_7_0_1__310385);
            rule__Activity__Group_7_0_1__4();

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
    // $ANTLR end "rule__Activity__Group_7_0_1__3"


    // $ANTLR start "rule__Activity__Group_7_0_1__3__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5232:1: rule__Activity__Group_7_0_1__3__Impl : ( ( rule__Activity__OffsetAssignment_7_0_1_3 ) ) ;
    public final void rule__Activity__Group_7_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5236:1: ( ( ( rule__Activity__OffsetAssignment_7_0_1_3 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5237:1: ( ( rule__Activity__OffsetAssignment_7_0_1_3 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5237:1: ( ( rule__Activity__OffsetAssignment_7_0_1_3 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5238:1: ( rule__Activity__OffsetAssignment_7_0_1_3 )
            {
             before(grammarAccess.getActivityAccess().getOffsetAssignment_7_0_1_3()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5239:1: ( rule__Activity__OffsetAssignment_7_0_1_3 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5239:2: rule__Activity__OffsetAssignment_7_0_1_3
            {
            pushFollow(FOLLOW_rule__Activity__OffsetAssignment_7_0_1_3_in_rule__Activity__Group_7_0_1__3__Impl10412);
            rule__Activity__OffsetAssignment_7_0_1_3();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getOffsetAssignment_7_0_1_3()); 

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
    // $ANTLR end "rule__Activity__Group_7_0_1__3__Impl"


    // $ANTLR start "rule__Activity__Group_7_0_1__4"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5249:1: rule__Activity__Group_7_0_1__4 : rule__Activity__Group_7_0_1__4__Impl ;
    public final void rule__Activity__Group_7_0_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5253:1: ( rule__Activity__Group_7_0_1__4__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5254:2: rule__Activity__Group_7_0_1__4__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_7_0_1__4__Impl_in_rule__Activity__Group_7_0_1__410442);
            rule__Activity__Group_7_0_1__4__Impl();

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
    // $ANTLR end "rule__Activity__Group_7_0_1__4"


    // $ANTLR start "rule__Activity__Group_7_0_1__4__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5260:1: rule__Activity__Group_7_0_1__4__Impl : ( ruleENDLINE ) ;
    public final void rule__Activity__Group_7_0_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5264:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5265:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5265:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5266:1: ruleENDLINE
            {
             before(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_7_0_1_4()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__Activity__Group_7_0_1__4__Impl10469);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_7_0_1_4()); 

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
    // $ANTLR end "rule__Activity__Group_7_0_1__4__Impl"


    // $ANTLR start "rule__Activity__Group_7_1__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5287:1: rule__Activity__Group_7_1__0 : rule__Activity__Group_7_1__0__Impl rule__Activity__Group_7_1__1 ;
    public final void rule__Activity__Group_7_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5291:1: ( rule__Activity__Group_7_1__0__Impl rule__Activity__Group_7_1__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5292:2: rule__Activity__Group_7_1__0__Impl rule__Activity__Group_7_1__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_7_1__0__Impl_in_rule__Activity__Group_7_1__010508);
            rule__Activity__Group_7_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_7_1__1_in_rule__Activity__Group_7_1__010511);
            rule__Activity__Group_7_1__1();

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
    // $ANTLR end "rule__Activity__Group_7_1__0"


    // $ANTLR start "rule__Activity__Group_7_1__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5299:1: rule__Activity__Group_7_1__0__Impl : ( ( rule__Activity__Alternatives_7_1_0 ) ) ;
    public final void rule__Activity__Group_7_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5303:1: ( ( ( rule__Activity__Alternatives_7_1_0 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5304:1: ( ( rule__Activity__Alternatives_7_1_0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5304:1: ( ( rule__Activity__Alternatives_7_1_0 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5305:1: ( rule__Activity__Alternatives_7_1_0 )
            {
             before(grammarAccess.getActivityAccess().getAlternatives_7_1_0()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5306:1: ( rule__Activity__Alternatives_7_1_0 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5306:2: rule__Activity__Alternatives_7_1_0
            {
            pushFollow(FOLLOW_rule__Activity__Alternatives_7_1_0_in_rule__Activity__Group_7_1__0__Impl10538);
            rule__Activity__Alternatives_7_1_0();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getAlternatives_7_1_0()); 

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
    // $ANTLR end "rule__Activity__Group_7_1__0__Impl"


    // $ANTLR start "rule__Activity__Group_7_1__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5316:1: rule__Activity__Group_7_1__1 : rule__Activity__Group_7_1__1__Impl rule__Activity__Group_7_1__2 ;
    public final void rule__Activity__Group_7_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5320:1: ( rule__Activity__Group_7_1__1__Impl rule__Activity__Group_7_1__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5321:2: rule__Activity__Group_7_1__1__Impl rule__Activity__Group_7_1__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_7_1__1__Impl_in_rule__Activity__Group_7_1__110568);
            rule__Activity__Group_7_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_7_1__2_in_rule__Activity__Group_7_1__110571);
            rule__Activity__Group_7_1__2();

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
    // $ANTLR end "rule__Activity__Group_7_1__1"


    // $ANTLR start "rule__Activity__Group_7_1__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5328:1: rule__Activity__Group_7_1__1__Impl : ( 'completeness' ) ;
    public final void rule__Activity__Group_7_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5332:1: ( ( 'completeness' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5333:1: ( 'completeness' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5333:1: ( 'completeness' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5334:1: 'completeness'
            {
             before(grammarAccess.getActivityAccess().getCompletenessKeyword_7_1_1()); 
            match(input,37,FOLLOW_37_in_rule__Activity__Group_7_1__1__Impl10599); 
             after(grammarAccess.getActivityAccess().getCompletenessKeyword_7_1_1()); 

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
    // $ANTLR end "rule__Activity__Group_7_1__1__Impl"


    // $ANTLR start "rule__Activity__Group_7_1__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5347:1: rule__Activity__Group_7_1__2 : rule__Activity__Group_7_1__2__Impl rule__Activity__Group_7_1__3 ;
    public final void rule__Activity__Group_7_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5351:1: ( rule__Activity__Group_7_1__2__Impl rule__Activity__Group_7_1__3 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5352:2: rule__Activity__Group_7_1__2__Impl rule__Activity__Group_7_1__3
            {
            pushFollow(FOLLOW_rule__Activity__Group_7_1__2__Impl_in_rule__Activity__Group_7_1__210630);
            rule__Activity__Group_7_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_7_1__3_in_rule__Activity__Group_7_1__210633);
            rule__Activity__Group_7_1__3();

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
    // $ANTLR end "rule__Activity__Group_7_1__2"


    // $ANTLR start "rule__Activity__Group_7_1__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5359:1: rule__Activity__Group_7_1__2__Impl : ( ( rule__Activity__CompletenessAssignment_7_1_2 ) ) ;
    public final void rule__Activity__Group_7_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5363:1: ( ( ( rule__Activity__CompletenessAssignment_7_1_2 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5364:1: ( ( rule__Activity__CompletenessAssignment_7_1_2 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5364:1: ( ( rule__Activity__CompletenessAssignment_7_1_2 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5365:1: ( rule__Activity__CompletenessAssignment_7_1_2 )
            {
             before(grammarAccess.getActivityAccess().getCompletenessAssignment_7_1_2()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5366:1: ( rule__Activity__CompletenessAssignment_7_1_2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5366:2: rule__Activity__CompletenessAssignment_7_1_2
            {
            pushFollow(FOLLOW_rule__Activity__CompletenessAssignment_7_1_2_in_rule__Activity__Group_7_1__2__Impl10660);
            rule__Activity__CompletenessAssignment_7_1_2();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getCompletenessAssignment_7_1_2()); 

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
    // $ANTLR end "rule__Activity__Group_7_1__2__Impl"


    // $ANTLR start "rule__Activity__Group_7_1__3"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5376:1: rule__Activity__Group_7_1__3 : rule__Activity__Group_7_1__3__Impl rule__Activity__Group_7_1__4 ;
    public final void rule__Activity__Group_7_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5380:1: ( rule__Activity__Group_7_1__3__Impl rule__Activity__Group_7_1__4 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5381:2: rule__Activity__Group_7_1__3__Impl rule__Activity__Group_7_1__4
            {
            pushFollow(FOLLOW_rule__Activity__Group_7_1__3__Impl_in_rule__Activity__Group_7_1__310690);
            rule__Activity__Group_7_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_7_1__4_in_rule__Activity__Group_7_1__310693);
            rule__Activity__Group_7_1__4();

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
    // $ANTLR end "rule__Activity__Group_7_1__3"


    // $ANTLR start "rule__Activity__Group_7_1__3__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5388:1: rule__Activity__Group_7_1__3__Impl : ( '%' ) ;
    public final void rule__Activity__Group_7_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5392:1: ( ( '%' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5393:1: ( '%' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5393:1: ( '%' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5394:1: '%'
            {
             before(grammarAccess.getActivityAccess().getPercentSignKeyword_7_1_3()); 
            match(input,38,FOLLOW_38_in_rule__Activity__Group_7_1__3__Impl10721); 
             after(grammarAccess.getActivityAccess().getPercentSignKeyword_7_1_3()); 

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
    // $ANTLR end "rule__Activity__Group_7_1__3__Impl"


    // $ANTLR start "rule__Activity__Group_7_1__4"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5407:1: rule__Activity__Group_7_1__4 : rule__Activity__Group_7_1__4__Impl ;
    public final void rule__Activity__Group_7_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5411:1: ( rule__Activity__Group_7_1__4__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5412:2: rule__Activity__Group_7_1__4__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_7_1__4__Impl_in_rule__Activity__Group_7_1__410752);
            rule__Activity__Group_7_1__4__Impl();

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
    // $ANTLR end "rule__Activity__Group_7_1__4"


    // $ANTLR start "rule__Activity__Group_7_1__4__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5418:1: rule__Activity__Group_7_1__4__Impl : ( ruleENDLINE ) ;
    public final void rule__Activity__Group_7_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5422:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5423:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5423:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5424:1: ruleENDLINE
            {
             before(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_7_1_4()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__Activity__Group_7_1__4__Impl10779);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_7_1_4()); 

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
    // $ANTLR end "rule__Activity__Group_7_1__4__Impl"


    // $ANTLR start "rule__Activity__Group_7_1_0_0__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5445:1: rule__Activity__Group_7_1_0_0__0 : rule__Activity__Group_7_1_0_0__0__Impl rule__Activity__Group_7_1_0_0__1 ;
    public final void rule__Activity__Group_7_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5449:1: ( rule__Activity__Group_7_1_0_0__0__Impl rule__Activity__Group_7_1_0_0__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5450:2: rule__Activity__Group_7_1_0_0__0__Impl rule__Activity__Group_7_1_0_0__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_7_1_0_0__0__Impl_in_rule__Activity__Group_7_1_0_0__010818);
            rule__Activity__Group_7_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_7_1_0_0__1_in_rule__Activity__Group_7_1_0_0__010821);
            rule__Activity__Group_7_1_0_0__1();

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
    // $ANTLR end "rule__Activity__Group_7_1_0_0__0"


    // $ANTLR start "rule__Activity__Group_7_1_0_0__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5457:1: rule__Activity__Group_7_1_0_0__0__Impl : ( 'ends' ) ;
    public final void rule__Activity__Group_7_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5461:1: ( ( 'ends' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5462:1: ( 'ends' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5462:1: ( 'ends' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5463:1: 'ends'
            {
             before(grammarAccess.getActivityAccess().getEndsKeyword_7_1_0_0_0()); 
            match(input,44,FOLLOW_44_in_rule__Activity__Group_7_1_0_0__0__Impl10849); 
             after(grammarAccess.getActivityAccess().getEndsKeyword_7_1_0_0_0()); 

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
    // $ANTLR end "rule__Activity__Group_7_1_0_0__0__Impl"


    // $ANTLR start "rule__Activity__Group_7_1_0_0__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5476:1: rule__Activity__Group_7_1_0_0__1 : rule__Activity__Group_7_1_0_0__1__Impl rule__Activity__Group_7_1_0_0__2 ;
    public final void rule__Activity__Group_7_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5480:1: ( rule__Activity__Group_7_1_0_0__1__Impl rule__Activity__Group_7_1_0_0__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5481:2: rule__Activity__Group_7_1_0_0__1__Impl rule__Activity__Group_7_1_0_0__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_7_1_0_0__1__Impl_in_rule__Activity__Group_7_1_0_0__110880);
            rule__Activity__Group_7_1_0_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_7_1_0_0__2_in_rule__Activity__Group_7_1_0_0__110883);
            rule__Activity__Group_7_1_0_0__2();

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
    // $ANTLR end "rule__Activity__Group_7_1_0_0__1"


    // $ANTLR start "rule__Activity__Group_7_1_0_0__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5488:1: rule__Activity__Group_7_1_0_0__1__Impl : ( ( rule__Activity__EndAssignment_7_1_0_0_1 ) ) ;
    public final void rule__Activity__Group_7_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5492:1: ( ( ( rule__Activity__EndAssignment_7_1_0_0_1 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5493:1: ( ( rule__Activity__EndAssignment_7_1_0_0_1 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5493:1: ( ( rule__Activity__EndAssignment_7_1_0_0_1 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5494:1: ( rule__Activity__EndAssignment_7_1_0_0_1 )
            {
             before(grammarAccess.getActivityAccess().getEndAssignment_7_1_0_0_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5495:1: ( rule__Activity__EndAssignment_7_1_0_0_1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5495:2: rule__Activity__EndAssignment_7_1_0_0_1
            {
            pushFollow(FOLLOW_rule__Activity__EndAssignment_7_1_0_0_1_in_rule__Activity__Group_7_1_0_0__1__Impl10910);
            rule__Activity__EndAssignment_7_1_0_0_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getEndAssignment_7_1_0_0_1()); 

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
    // $ANTLR end "rule__Activity__Group_7_1_0_0__1__Impl"


    // $ANTLR start "rule__Activity__Group_7_1_0_0__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5505:1: rule__Activity__Group_7_1_0_0__2 : rule__Activity__Group_7_1_0_0__2__Impl ;
    public final void rule__Activity__Group_7_1_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5509:1: ( rule__Activity__Group_7_1_0_0__2__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5510:2: rule__Activity__Group_7_1_0_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_7_1_0_0__2__Impl_in_rule__Activity__Group_7_1_0_0__210940);
            rule__Activity__Group_7_1_0_0__2__Impl();

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
    // $ANTLR end "rule__Activity__Group_7_1_0_0__2"


    // $ANTLR start "rule__Activity__Group_7_1_0_0__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5516:1: rule__Activity__Group_7_1_0_0__2__Impl : ( ruleENDLINE ) ;
    public final void rule__Activity__Group_7_1_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5520:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5521:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5521:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5522:1: ruleENDLINE
            {
             before(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_7_1_0_0_2()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__Activity__Group_7_1_0_0__2__Impl10967);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_7_1_0_0_2()); 

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
    // $ANTLR end "rule__Activity__Group_7_1_0_0__2__Impl"


    // $ANTLR start "rule__Activity__Group_7_1_0_1__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5539:1: rule__Activity__Group_7_1_0_1__0 : rule__Activity__Group_7_1_0_1__0__Impl rule__Activity__Group_7_1_0_1__1 ;
    public final void rule__Activity__Group_7_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5543:1: ( rule__Activity__Group_7_1_0_1__0__Impl rule__Activity__Group_7_1_0_1__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5544:2: rule__Activity__Group_7_1_0_1__0__Impl rule__Activity__Group_7_1_0_1__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_7_1_0_1__0__Impl_in_rule__Activity__Group_7_1_0_1__011002);
            rule__Activity__Group_7_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_7_1_0_1__1_in_rule__Activity__Group_7_1_0_1__011005);
            rule__Activity__Group_7_1_0_1__1();

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
    // $ANTLR end "rule__Activity__Group_7_1_0_1__0"


    // $ANTLR start "rule__Activity__Group_7_1_0_1__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5551:1: rule__Activity__Group_7_1_0_1__0__Impl : ( 'duration' ) ;
    public final void rule__Activity__Group_7_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5555:1: ( ( 'duration' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5556:1: ( 'duration' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5556:1: ( 'duration' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5557:1: 'duration'
            {
             before(grammarAccess.getActivityAccess().getDurationKeyword_7_1_0_1_0()); 
            match(input,45,FOLLOW_45_in_rule__Activity__Group_7_1_0_1__0__Impl11033); 
             after(grammarAccess.getActivityAccess().getDurationKeyword_7_1_0_1_0()); 

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
    // $ANTLR end "rule__Activity__Group_7_1_0_1__0__Impl"


    // $ANTLR start "rule__Activity__Group_7_1_0_1__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5570:1: rule__Activity__Group_7_1_0_1__1 : rule__Activity__Group_7_1_0_1__1__Impl rule__Activity__Group_7_1_0_1__2 ;
    public final void rule__Activity__Group_7_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5574:1: ( rule__Activity__Group_7_1_0_1__1__Impl rule__Activity__Group_7_1_0_1__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5575:2: rule__Activity__Group_7_1_0_1__1__Impl rule__Activity__Group_7_1_0_1__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_7_1_0_1__1__Impl_in_rule__Activity__Group_7_1_0_1__111064);
            rule__Activity__Group_7_1_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_7_1_0_1__2_in_rule__Activity__Group_7_1_0_1__111067);
            rule__Activity__Group_7_1_0_1__2();

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
    // $ANTLR end "rule__Activity__Group_7_1_0_1__1"


    // $ANTLR start "rule__Activity__Group_7_1_0_1__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5582:1: rule__Activity__Group_7_1_0_1__1__Impl : ( ( rule__Activity__DurationAssignment_7_1_0_1_1 ) ) ;
    public final void rule__Activity__Group_7_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5586:1: ( ( ( rule__Activity__DurationAssignment_7_1_0_1_1 ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5587:1: ( ( rule__Activity__DurationAssignment_7_1_0_1_1 ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5587:1: ( ( rule__Activity__DurationAssignment_7_1_0_1_1 ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5588:1: ( rule__Activity__DurationAssignment_7_1_0_1_1 )
            {
             before(grammarAccess.getActivityAccess().getDurationAssignment_7_1_0_1_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5589:1: ( rule__Activity__DurationAssignment_7_1_0_1_1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5589:2: rule__Activity__DurationAssignment_7_1_0_1_1
            {
            pushFollow(FOLLOW_rule__Activity__DurationAssignment_7_1_0_1_1_in_rule__Activity__Group_7_1_0_1__1__Impl11094);
            rule__Activity__DurationAssignment_7_1_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getDurationAssignment_7_1_0_1_1()); 

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
    // $ANTLR end "rule__Activity__Group_7_1_0_1__1__Impl"


    // $ANTLR start "rule__Activity__Group_7_1_0_1__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5599:1: rule__Activity__Group_7_1_0_1__2 : rule__Activity__Group_7_1_0_1__2__Impl ;
    public final void rule__Activity__Group_7_1_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5603:1: ( rule__Activity__Group_7_1_0_1__2__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5604:2: rule__Activity__Group_7_1_0_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_7_1_0_1__2__Impl_in_rule__Activity__Group_7_1_0_1__211124);
            rule__Activity__Group_7_1_0_1__2__Impl();

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
    // $ANTLR end "rule__Activity__Group_7_1_0_1__2"


    // $ANTLR start "rule__Activity__Group_7_1_0_1__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5610:1: rule__Activity__Group_7_1_0_1__2__Impl : ( ruleENDLINE ) ;
    public final void rule__Activity__Group_7_1_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5614:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5615:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5615:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5616:1: ruleENDLINE
            {
             before(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_7_1_0_1_2()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__Activity__Group_7_1_0_1__2__Impl11151);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_7_1_0_1_2()); 

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
    // $ANTLR end "rule__Activity__Group_7_1_0_1__2__Impl"


    // $ANTLR start "rule__Activity__Group_7_2__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5633:1: rule__Activity__Group_7_2__0 : rule__Activity__Group_7_2__0__Impl rule__Activity__Group_7_2__1 ;
    public final void rule__Activity__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5637:1: ( rule__Activity__Group_7_2__0__Impl rule__Activity__Group_7_2__1 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5638:2: rule__Activity__Group_7_2__0__Impl rule__Activity__Group_7_2__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_7_2__0__Impl_in_rule__Activity__Group_7_2__011186);
            rule__Activity__Group_7_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_7_2__1_in_rule__Activity__Group_7_2__011189);
            rule__Activity__Group_7_2__1();

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
    // $ANTLR end "rule__Activity__Group_7_2__0"


    // $ANTLR start "rule__Activity__Group_7_2__0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5645:1: rule__Activity__Group_7_2__0__Impl : ( 'dependsOn' ) ;
    public final void rule__Activity__Group_7_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5649:1: ( ( 'dependsOn' ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5650:1: ( 'dependsOn' )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5650:1: ( 'dependsOn' )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5651:1: 'dependsOn'
            {
             before(grammarAccess.getActivityAccess().getDependsOnKeyword_7_2_0()); 
            match(input,27,FOLLOW_27_in_rule__Activity__Group_7_2__0__Impl11217); 
             after(grammarAccess.getActivityAccess().getDependsOnKeyword_7_2_0()); 

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
    // $ANTLR end "rule__Activity__Group_7_2__0__Impl"


    // $ANTLR start "rule__Activity__Group_7_2__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5664:1: rule__Activity__Group_7_2__1 : rule__Activity__Group_7_2__1__Impl rule__Activity__Group_7_2__2 ;
    public final void rule__Activity__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5668:1: ( rule__Activity__Group_7_2__1__Impl rule__Activity__Group_7_2__2 )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5669:2: rule__Activity__Group_7_2__1__Impl rule__Activity__Group_7_2__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_7_2__1__Impl_in_rule__Activity__Group_7_2__111248);
            rule__Activity__Group_7_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_7_2__2_in_rule__Activity__Group_7_2__111251);
            rule__Activity__Group_7_2__2();

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
    // $ANTLR end "rule__Activity__Group_7_2__1"


    // $ANTLR start "rule__Activity__Group_7_2__1__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5676:1: rule__Activity__Group_7_2__1__Impl : ( ( rule__Activity__DependenciesAssignment_7_2_1 )* ) ;
    public final void rule__Activity__Group_7_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5680:1: ( ( ( rule__Activity__DependenciesAssignment_7_2_1 )* ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5681:1: ( ( rule__Activity__DependenciesAssignment_7_2_1 )* )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5681:1: ( ( rule__Activity__DependenciesAssignment_7_2_1 )* )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5682:1: ( rule__Activity__DependenciesAssignment_7_2_1 )*
            {
             before(grammarAccess.getActivityAccess().getDependenciesAssignment_7_2_1()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5683:1: ( rule__Activity__DependenciesAssignment_7_2_1 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_ID) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5683:2: rule__Activity__DependenciesAssignment_7_2_1
            	    {
            	    pushFollow(FOLLOW_rule__Activity__DependenciesAssignment_7_2_1_in_rule__Activity__Group_7_2__1__Impl11278);
            	    rule__Activity__DependenciesAssignment_7_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.getActivityAccess().getDependenciesAssignment_7_2_1()); 

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
    // $ANTLR end "rule__Activity__Group_7_2__1__Impl"


    // $ANTLR start "rule__Activity__Group_7_2__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5693:1: rule__Activity__Group_7_2__2 : rule__Activity__Group_7_2__2__Impl ;
    public final void rule__Activity__Group_7_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5697:1: ( rule__Activity__Group_7_2__2__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5698:2: rule__Activity__Group_7_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_7_2__2__Impl_in_rule__Activity__Group_7_2__211309);
            rule__Activity__Group_7_2__2__Impl();

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
    // $ANTLR end "rule__Activity__Group_7_2__2"


    // $ANTLR start "rule__Activity__Group_7_2__2__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5704:1: rule__Activity__Group_7_2__2__Impl : ( ruleENDLINE ) ;
    public final void rule__Activity__Group_7_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5708:1: ( ( ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5709:1: ( ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5709:1: ( ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5710:1: ruleENDLINE
            {
             before(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_7_2_2()); 
            pushFollow(FOLLOW_ruleENDLINE_in_rule__Activity__Group_7_2__2__Impl11336);
            ruleENDLINE();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_7_2_2()); 

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
    // $ANTLR end "rule__Activity__Group_7_2__2__Impl"


    // $ANTLR start "rule__CheckPoint__UnorderedGroup"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5729:1: rule__CheckPoint__UnorderedGroup : rule__CheckPoint__UnorderedGroup__0 {...}?;
    public final void rule__CheckPoint__UnorderedGroup() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getCheckPointAccess().getUnorderedGroup());
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5734:1: ( rule__CheckPoint__UnorderedGroup__0 {...}?)
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5735:2: rule__CheckPoint__UnorderedGroup__0 {...}?
            {
            pushFollow(FOLLOW_rule__CheckPoint__UnorderedGroup__0_in_rule__CheckPoint__UnorderedGroup11373);
            rule__CheckPoint__UnorderedGroup__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getCheckPointAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "rule__CheckPoint__UnorderedGroup", "getUnorderedGroupHelper().canLeave(grammarAccess.getCheckPointAccess().getUnorderedGroup())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getCheckPointAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__UnorderedGroup"


    // $ANTLR start "rule__CheckPoint__UnorderedGroup__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5746:1: rule__CheckPoint__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__CheckPoint__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__CheckPoint__Group_1__0 ) ) ) ) ) ;
    public final void rule__CheckPoint__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5751:1: ( ( ({...}? => ( ( ( rule__CheckPoint__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__CheckPoint__Group_1__0 ) ) ) ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5752:3: ( ({...}? => ( ( ( rule__CheckPoint__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__CheckPoint__Group_1__0 ) ) ) ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5752:3: ( ({...}? => ( ( ( rule__CheckPoint__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__CheckPoint__Group_1__0 ) ) ) ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ML_COMMENT||LA45_0==32) && getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup(), 0) ) {
                alt45=1;
            }
            else if ( ( LA45_0 >=34 && LA45_0<=35 ||LA45_0==37 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup(), 1) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5754:4: ({...}? => ( ( ( rule__CheckPoint__Group_0__0 ) ) ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5754:4: ({...}? => ( ( ( rule__CheckPoint__Group_0__0 ) ) ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5755:5: {...}? => ( ( ( rule__CheckPoint__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__CheckPoint__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup(), 0)");
                    }
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5755:105: ( ( ( rule__CheckPoint__Group_0__0 ) ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5756:6: ( ( rule__CheckPoint__Group_0__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getCheckPointAccess().getUnorderedGroup(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5762:6: ( ( rule__CheckPoint__Group_0__0 ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5764:7: ( rule__CheckPoint__Group_0__0 )
                    {
                     before(grammarAccess.getCheckPointAccess().getGroup_0()); 
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5765:7: ( rule__CheckPoint__Group_0__0 )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5765:8: rule__CheckPoint__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__CheckPoint__Group_0__0_in_rule__CheckPoint__UnorderedGroup__Impl11462);
                    rule__CheckPoint__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCheckPointAccess().getGroup_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5771:4: ({...}? => ( ( ( rule__CheckPoint__Group_1__0 ) ) ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5771:4: ({...}? => ( ( ( rule__CheckPoint__Group_1__0 ) ) ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5772:5: {...}? => ( ( ( rule__CheckPoint__Group_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__CheckPoint__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup(), 1)");
                    }
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5772:105: ( ( ( rule__CheckPoint__Group_1__0 ) ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5773:6: ( ( rule__CheckPoint__Group_1__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getCheckPointAccess().getUnorderedGroup(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5779:6: ( ( rule__CheckPoint__Group_1__0 ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5781:7: ( rule__CheckPoint__Group_1__0 )
                    {
                     before(grammarAccess.getCheckPointAccess().getGroup_1()); 
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5782:7: ( rule__CheckPoint__Group_1__0 )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5782:8: rule__CheckPoint__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__CheckPoint__Group_1__0_in_rule__CheckPoint__UnorderedGroup__Impl11553);
                    rule__CheckPoint__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCheckPointAccess().getGroup_1()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCheckPointAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__UnorderedGroup__Impl"


    // $ANTLR start "rule__CheckPoint__UnorderedGroup__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5797:1: rule__CheckPoint__UnorderedGroup__0 : rule__CheckPoint__UnorderedGroup__Impl ( rule__CheckPoint__UnorderedGroup__1 )? ;
    public final void rule__CheckPoint__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5801:1: ( rule__CheckPoint__UnorderedGroup__Impl ( rule__CheckPoint__UnorderedGroup__1 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5802:2: rule__CheckPoint__UnorderedGroup__Impl ( rule__CheckPoint__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_rule__CheckPoint__UnorderedGroup__Impl_in_rule__CheckPoint__UnorderedGroup__011612);
            rule__CheckPoint__UnorderedGroup__Impl();

            state._fsp--;

            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5803:2: ( rule__CheckPoint__UnorderedGroup__1 )?
            int alt46=2;
            alt46 = dfa46.predict(input);
            switch (alt46) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5803:2: rule__CheckPoint__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_rule__CheckPoint__UnorderedGroup__1_in_rule__CheckPoint__UnorderedGroup__011615);
                    rule__CheckPoint__UnorderedGroup__1();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__CheckPoint__UnorderedGroup__0"


    // $ANTLR start "rule__CheckPoint__UnorderedGroup__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5810:1: rule__CheckPoint__UnorderedGroup__1 : rule__CheckPoint__UnorderedGroup__Impl ;
    public final void rule__CheckPoint__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5814:1: ( rule__CheckPoint__UnorderedGroup__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5815:2: rule__CheckPoint__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_rule__CheckPoint__UnorderedGroup__Impl_in_rule__CheckPoint__UnorderedGroup__111640);
            rule__CheckPoint__UnorderedGroup__Impl();

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
    // $ANTLR end "rule__CheckPoint__UnorderedGroup__1"


    // $ANTLR start "rule__CheckPoint__UnorderedGroup_1_0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5826:1: rule__CheckPoint__UnorderedGroup_1_0 : rule__CheckPoint__UnorderedGroup_1_0__0 {...}?;
    public final void rule__CheckPoint__UnorderedGroup_1_0() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getCheckPointAccess().getUnorderedGroup_1_0());
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5831:1: ( rule__CheckPoint__UnorderedGroup_1_0__0 {...}?)
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5832:2: rule__CheckPoint__UnorderedGroup_1_0__0 {...}?
            {
            pushFollow(FOLLOW_rule__CheckPoint__UnorderedGroup_1_0__0_in_rule__CheckPoint__UnorderedGroup_1_011668);
            rule__CheckPoint__UnorderedGroup_1_0__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getCheckPointAccess().getUnorderedGroup_1_0()) ) {
                throw new FailedPredicateException(input, "rule__CheckPoint__UnorderedGroup_1_0", "getUnorderedGroupHelper().canLeave(grammarAccess.getCheckPointAccess().getUnorderedGroup_1_0())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getCheckPointAccess().getUnorderedGroup_1_0());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__UnorderedGroup_1_0"


    // $ANTLR start "rule__CheckPoint__UnorderedGroup_1_0__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5843:1: rule__CheckPoint__UnorderedGroup_1_0__Impl : ( ({...}? => ( ( ( rule__CheckPoint__Alternatives_1_0_0 ) ) ) ) | ({...}? => ( ( ( rule__CheckPoint__Group_1_0_1__0 ) ) ) ) ) ;
    public final void rule__CheckPoint__UnorderedGroup_1_0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5848:1: ( ( ({...}? => ( ( ( rule__CheckPoint__Alternatives_1_0_0 ) ) ) ) | ({...}? => ( ( ( rule__CheckPoint__Group_1_0_1__0 ) ) ) ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5849:3: ( ({...}? => ( ( ( rule__CheckPoint__Alternatives_1_0_0 ) ) ) ) | ({...}? => ( ( ( rule__CheckPoint__Group_1_0_1__0 ) ) ) ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5849:3: ( ({...}? => ( ( ( rule__CheckPoint__Alternatives_1_0_0 ) ) ) ) | ({...}? => ( ( ( rule__CheckPoint__Group_1_0_1__0 ) ) ) ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( LA47_0 >=34 && LA47_0<=35 && getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_1_0(), 0) ) {
                alt47=1;
            }
            else if ( LA47_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_1_0(), 1) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5851:4: ({...}? => ( ( ( rule__CheckPoint__Alternatives_1_0_0 ) ) ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5851:4: ({...}? => ( ( ( rule__CheckPoint__Alternatives_1_0_0 ) ) ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5852:5: {...}? => ( ( ( rule__CheckPoint__Alternatives_1_0_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_1_0(), 0) ) {
                        throw new FailedPredicateException(input, "rule__CheckPoint__UnorderedGroup_1_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_1_0(), 0)");
                    }
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5852:109: ( ( ( rule__CheckPoint__Alternatives_1_0_0 ) ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5853:6: ( ( rule__CheckPoint__Alternatives_1_0_0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getCheckPointAccess().getUnorderedGroup_1_0(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5859:6: ( ( rule__CheckPoint__Alternatives_1_0_0 ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5861:7: ( rule__CheckPoint__Alternatives_1_0_0 )
                    {
                     before(grammarAccess.getCheckPointAccess().getAlternatives_1_0_0()); 
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5862:7: ( rule__CheckPoint__Alternatives_1_0_0 )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5862:8: rule__CheckPoint__Alternatives_1_0_0
                    {
                    pushFollow(FOLLOW_rule__CheckPoint__Alternatives_1_0_0_in_rule__CheckPoint__UnorderedGroup_1_0__Impl11757);
                    rule__CheckPoint__Alternatives_1_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCheckPointAccess().getAlternatives_1_0_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5868:4: ({...}? => ( ( ( rule__CheckPoint__Group_1_0_1__0 ) ) ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5868:4: ({...}? => ( ( ( rule__CheckPoint__Group_1_0_1__0 ) ) ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5869:5: {...}? => ( ( ( rule__CheckPoint__Group_1_0_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_1_0(), 1) ) {
                        throw new FailedPredicateException(input, "rule__CheckPoint__UnorderedGroup_1_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_1_0(), 1)");
                    }
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5869:109: ( ( ( rule__CheckPoint__Group_1_0_1__0 ) ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5870:6: ( ( rule__CheckPoint__Group_1_0_1__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getCheckPointAccess().getUnorderedGroup_1_0(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5876:6: ( ( rule__CheckPoint__Group_1_0_1__0 ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5878:7: ( rule__CheckPoint__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getCheckPointAccess().getGroup_1_0_1()); 
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5879:7: ( rule__CheckPoint__Group_1_0_1__0 )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5879:8: rule__CheckPoint__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__CheckPoint__Group_1_0_1__0_in_rule__CheckPoint__UnorderedGroup_1_0__Impl11848);
                    rule__CheckPoint__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCheckPointAccess().getGroup_1_0_1()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCheckPointAccess().getUnorderedGroup_1_0());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckPoint__UnorderedGroup_1_0__Impl"


    // $ANTLR start "rule__CheckPoint__UnorderedGroup_1_0__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5894:1: rule__CheckPoint__UnorderedGroup_1_0__0 : rule__CheckPoint__UnorderedGroup_1_0__Impl ( rule__CheckPoint__UnorderedGroup_1_0__1 )? ;
    public final void rule__CheckPoint__UnorderedGroup_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5898:1: ( rule__CheckPoint__UnorderedGroup_1_0__Impl ( rule__CheckPoint__UnorderedGroup_1_0__1 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5899:2: rule__CheckPoint__UnorderedGroup_1_0__Impl ( rule__CheckPoint__UnorderedGroup_1_0__1 )?
            {
            pushFollow(FOLLOW_rule__CheckPoint__UnorderedGroup_1_0__Impl_in_rule__CheckPoint__UnorderedGroup_1_0__011907);
            rule__CheckPoint__UnorderedGroup_1_0__Impl();

            state._fsp--;

            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5900:2: ( rule__CheckPoint__UnorderedGroup_1_0__1 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( LA48_0 >=34 && LA48_0<=35 && getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_1_0(), 0) ) {
                alt48=1;
            }
            else if ( LA48_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_1_0(), 1) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5900:2: rule__CheckPoint__UnorderedGroup_1_0__1
                    {
                    pushFollow(FOLLOW_rule__CheckPoint__UnorderedGroup_1_0__1_in_rule__CheckPoint__UnorderedGroup_1_0__011910);
                    rule__CheckPoint__UnorderedGroup_1_0__1();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__CheckPoint__UnorderedGroup_1_0__0"


    // $ANTLR start "rule__CheckPoint__UnorderedGroup_1_0__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5907:1: rule__CheckPoint__UnorderedGroup_1_0__1 : rule__CheckPoint__UnorderedGroup_1_0__Impl ;
    public final void rule__CheckPoint__UnorderedGroup_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5911:1: ( rule__CheckPoint__UnorderedGroup_1_0__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5912:2: rule__CheckPoint__UnorderedGroup_1_0__Impl
            {
            pushFollow(FOLLOW_rule__CheckPoint__UnorderedGroup_1_0__Impl_in_rule__CheckPoint__UnorderedGroup_1_0__111935);
            rule__CheckPoint__UnorderedGroup_1_0__Impl();

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
    // $ANTLR end "rule__CheckPoint__UnorderedGroup_1_0__1"


    // $ANTLR start "rule__Activity__UnorderedGroup_7"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5923:1: rule__Activity__UnorderedGroup_7 : rule__Activity__UnorderedGroup_7__0 {...}?;
    public final void rule__Activity__UnorderedGroup_7() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getActivityAccess().getUnorderedGroup_7());
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5928:1: ( rule__Activity__UnorderedGroup_7__0 {...}?)
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5929:2: rule__Activity__UnorderedGroup_7__0 {...}?
            {
            pushFollow(FOLLOW_rule__Activity__UnorderedGroup_7__0_in_rule__Activity__UnorderedGroup_711963);
            rule__Activity__UnorderedGroup_7__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getActivityAccess().getUnorderedGroup_7()) ) {
                throw new FailedPredicateException(input, "rule__Activity__UnorderedGroup_7", "getUnorderedGroupHelper().canLeave(grammarAccess.getActivityAccess().getUnorderedGroup_7())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getActivityAccess().getUnorderedGroup_7());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__UnorderedGroup_7"


    // $ANTLR start "rule__Activity__UnorderedGroup_7__Impl"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5940:1: rule__Activity__UnorderedGroup_7__Impl : ( ({...}? => ( ( ( rule__Activity__Alternatives_7_0 ) ) ) ) | ({...}? => ( ( ( rule__Activity__Group_7_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Activity__Group_7_2__0 ) ) ) ) ) ;
    public final void rule__Activity__UnorderedGroup_7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5945:1: ( ( ({...}? => ( ( ( rule__Activity__Alternatives_7_0 ) ) ) ) | ({...}? => ( ( ( rule__Activity__Group_7_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Activity__Group_7_2__0 ) ) ) ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5946:3: ( ({...}? => ( ( ( rule__Activity__Alternatives_7_0 ) ) ) ) | ({...}? => ( ( ( rule__Activity__Group_7_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Activity__Group_7_2__0 ) ) ) ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5946:3: ( ({...}? => ( ( ( rule__Activity__Alternatives_7_0 ) ) ) ) | ({...}? => ( ( ( rule__Activity__Group_7_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Activity__Group_7_2__0 ) ) ) ) )
            int alt49=3;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==35||LA49_0==43) && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_7(), 0) ) {
                alt49=1;
            }
            else if ( LA49_0 >=44 && LA49_0<=45 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_7(), 1) ) {
                alt49=2;
            }
            else if ( LA49_0 ==27 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_7(), 2) ) {
                alt49=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5948:4: ({...}? => ( ( ( rule__Activity__Alternatives_7_0 ) ) ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5948:4: ({...}? => ( ( ( rule__Activity__Alternatives_7_0 ) ) ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5949:5: {...}? => ( ( ( rule__Activity__Alternatives_7_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_7(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Activity__UnorderedGroup_7__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_7(), 0)");
                    }
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5949:105: ( ( ( rule__Activity__Alternatives_7_0 ) ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5950:6: ( ( rule__Activity__Alternatives_7_0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getActivityAccess().getUnorderedGroup_7(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5956:6: ( ( rule__Activity__Alternatives_7_0 ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5958:7: ( rule__Activity__Alternatives_7_0 )
                    {
                     before(grammarAccess.getActivityAccess().getAlternatives_7_0()); 
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5959:7: ( rule__Activity__Alternatives_7_0 )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5959:8: rule__Activity__Alternatives_7_0
                    {
                    pushFollow(FOLLOW_rule__Activity__Alternatives_7_0_in_rule__Activity__UnorderedGroup_7__Impl12052);
                    rule__Activity__Alternatives_7_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActivityAccess().getAlternatives_7_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5965:4: ({...}? => ( ( ( rule__Activity__Group_7_1__0 ) ) ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5965:4: ({...}? => ( ( ( rule__Activity__Group_7_1__0 ) ) ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5966:5: {...}? => ( ( ( rule__Activity__Group_7_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_7(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Activity__UnorderedGroup_7__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_7(), 1)");
                    }
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5966:105: ( ( ( rule__Activity__Group_7_1__0 ) ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5967:6: ( ( rule__Activity__Group_7_1__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getActivityAccess().getUnorderedGroup_7(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5973:6: ( ( rule__Activity__Group_7_1__0 ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5975:7: ( rule__Activity__Group_7_1__0 )
                    {
                     before(grammarAccess.getActivityAccess().getGroup_7_1()); 
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5976:7: ( rule__Activity__Group_7_1__0 )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5976:8: rule__Activity__Group_7_1__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_7_1__0_in_rule__Activity__UnorderedGroup_7__Impl12143);
                    rule__Activity__Group_7_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActivityAccess().getGroup_7_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5982:4: ({...}? => ( ( ( rule__Activity__Group_7_2__0 ) ) ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5982:4: ({...}? => ( ( ( rule__Activity__Group_7_2__0 ) ) ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5983:5: {...}? => ( ( ( rule__Activity__Group_7_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_7(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Activity__UnorderedGroup_7__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_7(), 2)");
                    }
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5983:105: ( ( ( rule__Activity__Group_7_2__0 ) ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5984:6: ( ( rule__Activity__Group_7_2__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getActivityAccess().getUnorderedGroup_7(), 2);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5990:6: ( ( rule__Activity__Group_7_2__0 ) )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5992:7: ( rule__Activity__Group_7_2__0 )
                    {
                     before(grammarAccess.getActivityAccess().getGroup_7_2()); 
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5993:7: ( rule__Activity__Group_7_2__0 )
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:5993:8: rule__Activity__Group_7_2__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_7_2__0_in_rule__Activity__UnorderedGroup_7__Impl12234);
                    rule__Activity__Group_7_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActivityAccess().getGroup_7_2()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActivityAccess().getUnorderedGroup_7());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__UnorderedGroup_7__Impl"


    // $ANTLR start "rule__Activity__UnorderedGroup_7__0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6008:1: rule__Activity__UnorderedGroup_7__0 : rule__Activity__UnorderedGroup_7__Impl ( rule__Activity__UnorderedGroup_7__1 )? ;
    public final void rule__Activity__UnorderedGroup_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6012:1: ( rule__Activity__UnorderedGroup_7__Impl ( rule__Activity__UnorderedGroup_7__1 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6013:2: rule__Activity__UnorderedGroup_7__Impl ( rule__Activity__UnorderedGroup_7__1 )?
            {
            pushFollow(FOLLOW_rule__Activity__UnorderedGroup_7__Impl_in_rule__Activity__UnorderedGroup_7__012293);
            rule__Activity__UnorderedGroup_7__Impl();

            state._fsp--;

            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6014:2: ( rule__Activity__UnorderedGroup_7__1 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==35||LA50_0==43) && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_7(), 0) ) {
                alt50=1;
            }
            else if ( LA50_0 >=44 && LA50_0<=45 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_7(), 1) ) {
                alt50=1;
            }
            else if ( LA50_0 ==27 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_7(), 2) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6014:2: rule__Activity__UnorderedGroup_7__1
                    {
                    pushFollow(FOLLOW_rule__Activity__UnorderedGroup_7__1_in_rule__Activity__UnorderedGroup_7__012296);
                    rule__Activity__UnorderedGroup_7__1();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__Activity__UnorderedGroup_7__0"


    // $ANTLR start "rule__Activity__UnorderedGroup_7__1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6021:1: rule__Activity__UnorderedGroup_7__1 : rule__Activity__UnorderedGroup_7__Impl ( rule__Activity__UnorderedGroup_7__2 )? ;
    public final void rule__Activity__UnorderedGroup_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6025:1: ( rule__Activity__UnorderedGroup_7__Impl ( rule__Activity__UnorderedGroup_7__2 )? )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6026:2: rule__Activity__UnorderedGroup_7__Impl ( rule__Activity__UnorderedGroup_7__2 )?
            {
            pushFollow(FOLLOW_rule__Activity__UnorderedGroup_7__Impl_in_rule__Activity__UnorderedGroup_7__112321);
            rule__Activity__UnorderedGroup_7__Impl();

            state._fsp--;

            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6027:2: ( rule__Activity__UnorderedGroup_7__2 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==35||LA51_0==43) && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_7(), 0) ) {
                alt51=1;
            }
            else if ( LA51_0 >=44 && LA51_0<=45 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_7(), 1) ) {
                alt51=1;
            }
            else if ( LA51_0 ==27 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_7(), 2) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6027:2: rule__Activity__UnorderedGroup_7__2
                    {
                    pushFollow(FOLLOW_rule__Activity__UnorderedGroup_7__2_in_rule__Activity__UnorderedGroup_7__112324);
                    rule__Activity__UnorderedGroup_7__2();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__Activity__UnorderedGroup_7__1"


    // $ANTLR start "rule__Activity__UnorderedGroup_7__2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6034:1: rule__Activity__UnorderedGroup_7__2 : rule__Activity__UnorderedGroup_7__Impl ;
    public final void rule__Activity__UnorderedGroup_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6038:1: ( rule__Activity__UnorderedGroup_7__Impl )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6039:2: rule__Activity__UnorderedGroup_7__Impl
            {
            pushFollow(FOLLOW_rule__Activity__UnorderedGroup_7__Impl_in_rule__Activity__UnorderedGroup_7__212349);
            rule__Activity__UnorderedGroup_7__Impl();

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
    // $ANTLR end "rule__Activity__UnorderedGroup_7__2"


    // $ANTLR start "rule__Program__DescriptionAssignment_0_0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6052:1: rule__Program__DescriptionAssignment_0_0 : ( RULE_ML_COMMENT ) ;
    public final void rule__Program__DescriptionAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6056:1: ( ( RULE_ML_COMMENT ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6057:1: ( RULE_ML_COMMENT )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6057:1: ( RULE_ML_COMMENT )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6058:1: RULE_ML_COMMENT
            {
             before(grammarAccess.getProgramAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0_0()); 
            match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_rule__Program__DescriptionAssignment_0_012383); 
             after(grammarAccess.getProgramAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__Program__DescriptionAssignment_0_0"


    // $ANTLR start "rule__Program__NameAssignment_0_1_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6067:1: rule__Program__NameAssignment_0_1_1 : ( RULE_ID ) ;
    public final void rule__Program__NameAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6071:1: ( ( RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6072:1: ( RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6072:1: ( RULE_ID )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6073:1: RULE_ID
            {
             before(grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_0_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Program__NameAssignment_0_1_112414); 
             after(grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_0_1_1_0()); 

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
    // $ANTLR end "rule__Program__NameAssignment_0_1_1"


    // $ANTLR start "rule__Program__LongNameAssignment_0_1_3_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6082:1: rule__Program__LongNameAssignment_0_1_3_1 : ( RULE_STRING ) ;
    public final void rule__Program__LongNameAssignment_0_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6086:1: ( ( RULE_STRING ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6087:1: ( RULE_STRING )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6087:1: ( RULE_STRING )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6088:1: RULE_STRING
            {
             before(grammarAccess.getProgramAccess().getLongNameSTRINGTerminalRuleCall_0_1_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Program__LongNameAssignment_0_1_3_112445); 
             after(grammarAccess.getProgramAccess().getLongNameSTRINGTerminalRuleCall_0_1_3_1_0()); 

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
    // $ANTLR end "rule__Program__LongNameAssignment_0_1_3_1"


    // $ANTLR start "rule__Program__PlansAssignment_0_1_4_0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6097:1: rule__Program__PlansAssignment_0_1_4_0 : ( rulePlanImport ) ;
    public final void rule__Program__PlansAssignment_0_1_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6101:1: ( ( rulePlanImport ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6102:1: ( rulePlanImport )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6102:1: ( rulePlanImport )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6103:1: rulePlanImport
            {
             before(grammarAccess.getProgramAccess().getPlansPlanImportParserRuleCall_0_1_4_0_0()); 
            pushFollow(FOLLOW_rulePlanImport_in_rule__Program__PlansAssignment_0_1_4_012476);
            rulePlanImport();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getPlansPlanImportParserRuleCall_0_1_4_0_0()); 

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
    // $ANTLR end "rule__Program__PlansAssignment_0_1_4_0"


    // $ANTLR start "rule__Program__ReferencedProjectsAssignment_0_1_5_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6112:1: rule__Program__ReferencedProjectsAssignment_0_1_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Program__ReferencedProjectsAssignment_0_1_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6116:1: ( ( ( ruleQualifiedName ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6117:1: ( ( ruleQualifiedName ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6117:1: ( ( ruleQualifiedName ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6118:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getProgramAccess().getReferencedProjectsProjectCrossReference_0_1_5_1_0()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6119:1: ( ruleQualifiedName )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6120:1: ruleQualifiedName
            {
             before(grammarAccess.getProgramAccess().getReferencedProjectsProjectQualifiedNameParserRuleCall_0_1_5_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Program__ReferencedProjectsAssignment_0_1_5_112511);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getReferencedProjectsProjectQualifiedNameParserRuleCall_0_1_5_1_0_1()); 

            }

             after(grammarAccess.getProgramAccess().getReferencedProjectsProjectCrossReference_0_1_5_1_0()); 

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
    // $ANTLR end "rule__Program__ReferencedProjectsAssignment_0_1_5_1"


    // $ANTLR start "rule__Program__ProjectsAssignment_0_1_6"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6131:1: rule__Program__ProjectsAssignment_0_1_6 : ( ruleProject ) ;
    public final void rule__Program__ProjectsAssignment_0_1_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6135:1: ( ( ruleProject ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6136:1: ( ruleProject )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6136:1: ( ruleProject )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6137:1: ruleProject
            {
             before(grammarAccess.getProgramAccess().getProjectsProjectParserRuleCall_0_1_6_0()); 
            pushFollow(FOLLOW_ruleProject_in_rule__Program__ProjectsAssignment_0_1_612546);
            ruleProject();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getProjectsProjectParserRuleCall_0_1_6_0()); 

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
    // $ANTLR end "rule__Program__ProjectsAssignment_0_1_6"


    // $ANTLR start "rule__Program__ProjectsAssignment_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6146:1: rule__Program__ProjectsAssignment_1 : ( ruleProject ) ;
    public final void rule__Program__ProjectsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6150:1: ( ( ruleProject ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6151:1: ( ruleProject )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6151:1: ( ruleProject )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6152:1: ruleProject
            {
             before(grammarAccess.getProgramAccess().getProjectsProjectParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleProject_in_rule__Program__ProjectsAssignment_112577);
            ruleProject();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getProjectsProjectParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Program__ProjectsAssignment_1"


    // $ANTLR start "rule__Project__DescriptionAssignment_0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6161:1: rule__Project__DescriptionAssignment_0 : ( RULE_ML_COMMENT ) ;
    public final void rule__Project__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6165:1: ( ( RULE_ML_COMMENT ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6166:1: ( RULE_ML_COMMENT )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6166:1: ( RULE_ML_COMMENT )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6167:1: RULE_ML_COMMENT
            {
             before(grammarAccess.getProjectAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_rule__Project__DescriptionAssignment_012608); 
             after(grammarAccess.getProjectAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Project__DescriptionAssignment_0"


    // $ANTLR start "rule__Project__NameAssignment_2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6176:1: rule__Project__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Project__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6180:1: ( ( RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6181:1: ( RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6181:1: ( RULE_ID )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6182:1: RULE_ID
            {
             before(grammarAccess.getProjectAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Project__NameAssignment_212639); 
             after(grammarAccess.getProjectAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Project__NameAssignment_2"


    // $ANTLR start "rule__Project__LongNameAssignment_4_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6191:1: rule__Project__LongNameAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Project__LongNameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6195:1: ( ( RULE_STRING ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6196:1: ( RULE_STRING )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6196:1: ( RULE_STRING )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6197:1: RULE_STRING
            {
             before(grammarAccess.getProjectAccess().getLongNameSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Project__LongNameAssignment_4_112670); 
             after(grammarAccess.getProjectAccess().getLongNameSTRINGTerminalRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Project__LongNameAssignment_4_1"


    // $ANTLR start "rule__Project__WbsAssignment_5_0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6206:1: rule__Project__WbsAssignment_5_0 : ( ruleWBSImport ) ;
    public final void rule__Project__WbsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6210:1: ( ( ruleWBSImport ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6211:1: ( ruleWBSImport )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6211:1: ( ruleWBSImport )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6212:1: ruleWBSImport
            {
             before(grammarAccess.getProjectAccess().getWbsWBSImportParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_ruleWBSImport_in_rule__Project__WbsAssignment_5_012701);
            ruleWBSImport();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getWbsWBSImportParserRuleCall_5_0_0()); 

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
    // $ANTLR end "rule__Project__WbsAssignment_5_0"


    // $ANTLR start "rule__Project__WbsProjectAssignment_5_2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6221:1: rule__Project__WbsProjectAssignment_5_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Project__WbsProjectAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6225:1: ( ( ( ruleQualifiedName ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6226:1: ( ( ruleQualifiedName ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6226:1: ( ( ruleQualifiedName ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6227:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getProjectAccess().getWbsProjectWBSProjectCrossReference_5_2_0()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6228:1: ( ruleQualifiedName )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6229:1: ruleQualifiedName
            {
             before(grammarAccess.getProjectAccess().getWbsProjectWBSProjectQualifiedNameParserRuleCall_5_2_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Project__WbsProjectAssignment_5_212736);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getWbsProjectWBSProjectQualifiedNameParserRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getProjectAccess().getWbsProjectWBSProjectCrossReference_5_2_0()); 

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
    // $ANTLR end "rule__Project__WbsProjectAssignment_5_2"


    // $ANTLR start "rule__Project__ResourcesAssignment_6_0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6240:1: rule__Project__ResourcesAssignment_6_0 : ( ruleResourcesImport ) ;
    public final void rule__Project__ResourcesAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6244:1: ( ( ruleResourcesImport ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6245:1: ( ruleResourcesImport )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6245:1: ( ruleResourcesImport )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6246:1: ruleResourcesImport
            {
             before(grammarAccess.getProjectAccess().getResourcesResourcesImportParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_ruleResourcesImport_in_rule__Project__ResourcesAssignment_6_012771);
            ruleResourcesImport();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getResourcesResourcesImportParserRuleCall_6_0_0()); 

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
    // $ANTLR end "rule__Project__ResourcesAssignment_6_0"


    // $ANTLR start "rule__Project__PlansAssignment_7_0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6255:1: rule__Project__PlansAssignment_7_0 : ( rulePlanImport ) ;
    public final void rule__Project__PlansAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6259:1: ( ( rulePlanImport ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6260:1: ( rulePlanImport )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6260:1: ( rulePlanImport )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6261:1: rulePlanImport
            {
             before(grammarAccess.getProjectAccess().getPlansPlanImportParserRuleCall_7_0_0()); 
            pushFollow(FOLLOW_rulePlanImport_in_rule__Project__PlansAssignment_7_012802);
            rulePlanImport();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getPlansPlanImportParserRuleCall_7_0_0()); 

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
    // $ANTLR end "rule__Project__PlansAssignment_7_0"


    // $ANTLR start "rule__Project__AssumptionsAssignment_8_2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6270:1: rule__Project__AssumptionsAssignment_8_2 : ( ruleAssumption ) ;
    public final void rule__Project__AssumptionsAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6274:1: ( ( ruleAssumption ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6275:1: ( ruleAssumption )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6275:1: ( ruleAssumption )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6276:1: ruleAssumption
            {
             before(grammarAccess.getProjectAccess().getAssumptionsAssumptionParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_ruleAssumption_in_rule__Project__AssumptionsAssignment_8_212833);
            ruleAssumption();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getAssumptionsAssumptionParserRuleCall_8_2_0()); 

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
    // $ANTLR end "rule__Project__AssumptionsAssignment_8_2"


    // $ANTLR start "rule__Project__ConstraintsAssignment_9_2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6285:1: rule__Project__ConstraintsAssignment_9_2 : ( ruleConstraint ) ;
    public final void rule__Project__ConstraintsAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6289:1: ( ( ruleConstraint ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6290:1: ( ruleConstraint )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6290:1: ( ruleConstraint )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6291:1: ruleConstraint
            {
             before(grammarAccess.getProjectAccess().getConstraintsConstraintParserRuleCall_9_2_0()); 
            pushFollow(FOLLOW_ruleConstraint_in_rule__Project__ConstraintsAssignment_9_212864);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getConstraintsConstraintParserRuleCall_9_2_0()); 

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
    // $ANTLR end "rule__Project__ConstraintsAssignment_9_2"


    // $ANTLR start "rule__Project__ActivitiesAssignment_10"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6300:1: rule__Project__ActivitiesAssignment_10 : ( ruleActivityElement ) ;
    public final void rule__Project__ActivitiesAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6304:1: ( ( ruleActivityElement ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6305:1: ( ruleActivityElement )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6305:1: ( ruleActivityElement )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6306:1: ruleActivityElement
            {
             before(grammarAccess.getProjectAccess().getActivitiesActivityElementParserRuleCall_10_0()); 
            pushFollow(FOLLOW_ruleActivityElement_in_rule__Project__ActivitiesAssignment_1012895);
            ruleActivityElement();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getActivitiesActivityElementParserRuleCall_10_0()); 

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
    // $ANTLR end "rule__Project__ActivitiesAssignment_10"


    // $ANTLR start "rule__Assumption__ValueAssignment_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6315:1: rule__Assumption__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Assumption__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6319:1: ( ( RULE_STRING ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6320:1: ( RULE_STRING )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6320:1: ( RULE_STRING )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6321:1: RULE_STRING
            {
             before(grammarAccess.getAssumptionAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Assumption__ValueAssignment_112926); 
             after(grammarAccess.getAssumptionAccess().getValueSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Assumption__ValueAssignment_1"


    // $ANTLR start "rule__Constraint__ValueAssignment_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6330:1: rule__Constraint__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Constraint__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6334:1: ( ( RULE_STRING ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6335:1: ( RULE_STRING )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6335:1: ( RULE_STRING )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6336:1: RULE_STRING
            {
             before(grammarAccess.getConstraintAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Constraint__ValueAssignment_112957); 
             after(grammarAccess.getConstraintAccess().getValueSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Constraint__ValueAssignment_1"


    // $ANTLR start "rule__ActivityGroup__DescriptionAssignment_0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6345:1: rule__ActivityGroup__DescriptionAssignment_0 : ( RULE_ML_COMMENT ) ;
    public final void rule__ActivityGroup__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6349:1: ( ( RULE_ML_COMMENT ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6350:1: ( RULE_ML_COMMENT )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6350:1: ( RULE_ML_COMMENT )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6351:1: RULE_ML_COMMENT
            {
             before(grammarAccess.getActivityGroupAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_rule__ActivityGroup__DescriptionAssignment_012988); 
             after(grammarAccess.getActivityGroupAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__ActivityGroup__DescriptionAssignment_0"


    // $ANTLR start "rule__ActivityGroup__NameAssignment_2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6360:1: rule__ActivityGroup__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ActivityGroup__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6364:1: ( ( RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6365:1: ( RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6365:1: ( RULE_ID )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6366:1: RULE_ID
            {
             before(grammarAccess.getActivityGroupAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ActivityGroup__NameAssignment_213019); 
             after(grammarAccess.getActivityGroupAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__ActivityGroup__NameAssignment_2"


    // $ANTLR start "rule__ActivityGroup__LongNameAssignment_4_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6375:1: rule__ActivityGroup__LongNameAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__ActivityGroup__LongNameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6379:1: ( ( RULE_STRING ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6380:1: ( RULE_STRING )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6380:1: ( RULE_STRING )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6381:1: RULE_STRING
            {
             before(grammarAccess.getActivityGroupAccess().getLongNameSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ActivityGroup__LongNameAssignment_4_113050); 
             after(grammarAccess.getActivityGroupAccess().getLongNameSTRINGTerminalRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__ActivityGroup__LongNameAssignment_4_1"


    // $ANTLR start "rule__ActivityGroup__WbsActivityAssignment_5_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6390:1: rule__ActivityGroup__WbsActivityAssignment_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ActivityGroup__WbsActivityAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6394:1: ( ( ( ruleQualifiedName ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6395:1: ( ( ruleQualifiedName ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6395:1: ( ( ruleQualifiedName ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6396:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getActivityGroupAccess().getWbsActivityWBSNodeCrossReference_5_1_0()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6397:1: ( ruleQualifiedName )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6398:1: ruleQualifiedName
            {
             before(grammarAccess.getActivityGroupAccess().getWbsActivityWBSNodeQualifiedNameParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__ActivityGroup__WbsActivityAssignment_5_113085);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getActivityGroupAccess().getWbsActivityWBSNodeQualifiedNameParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getActivityGroupAccess().getWbsActivityWBSNodeCrossReference_5_1_0()); 

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
    // $ANTLR end "rule__ActivityGroup__WbsActivityAssignment_5_1"


    // $ANTLR start "rule__ActivityGroup__DependenciesAssignment_6_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6409:1: rule__ActivityGroup__DependenciesAssignment_6_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ActivityGroup__DependenciesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6413:1: ( ( ( ruleQualifiedName ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6414:1: ( ( ruleQualifiedName ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6414:1: ( ( ruleQualifiedName ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6415:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getActivityGroupAccess().getDependenciesActivityElementCrossReference_6_1_0()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6416:1: ( ruleQualifiedName )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6417:1: ruleQualifiedName
            {
             before(grammarAccess.getActivityGroupAccess().getDependenciesActivityElementQualifiedNameParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__ActivityGroup__DependenciesAssignment_6_113124);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getActivityGroupAccess().getDependenciesActivityElementQualifiedNameParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getActivityGroupAccess().getDependenciesActivityElementCrossReference_6_1_0()); 

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
    // $ANTLR end "rule__ActivityGroup__DependenciesAssignment_6_1"


    // $ANTLR start "rule__ActivityGroup__ActivitiesAssignment_7"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6428:1: rule__ActivityGroup__ActivitiesAssignment_7 : ( ruleActivityElement ) ;
    public final void rule__ActivityGroup__ActivitiesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6432:1: ( ( ruleActivityElement ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6433:1: ( ruleActivityElement )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6433:1: ( ruleActivityElement )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6434:1: ruleActivityElement
            {
             before(grammarAccess.getActivityGroupAccess().getActivitiesActivityElementParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleActivityElement_in_rule__ActivityGroup__ActivitiesAssignment_713159);
            ruleActivityElement();

            state._fsp--;

             after(grammarAccess.getActivityGroupAccess().getActivitiesActivityElementParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__ActivityGroup__ActivitiesAssignment_7"


    // $ANTLR start "rule__WBSImport__ImportURIAssignment_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6443:1: rule__WBSImport__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__WBSImport__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6447:1: ( ( RULE_STRING ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6448:1: ( RULE_STRING )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6448:1: ( RULE_STRING )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6449:1: RULE_STRING
            {
             before(grammarAccess.getWBSImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__WBSImport__ImportURIAssignment_113190); 
             after(grammarAccess.getWBSImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__WBSImport__ImportURIAssignment_1"


    // $ANTLR start "rule__ResourcesImport__ImportURIAssignment_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6458:1: rule__ResourcesImport__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ResourcesImport__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6462:1: ( ( RULE_STRING ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6463:1: ( RULE_STRING )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6463:1: ( RULE_STRING )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6464:1: RULE_STRING
            {
             before(grammarAccess.getResourcesImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ResourcesImport__ImportURIAssignment_113221); 
             after(grammarAccess.getResourcesImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ResourcesImport__ImportURIAssignment_1"


    // $ANTLR start "rule__PlanImport__ImportURIAssignment_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6473:1: rule__PlanImport__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__PlanImport__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6477:1: ( ( RULE_STRING ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6478:1: ( RULE_STRING )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6478:1: ( RULE_STRING )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6479:1: RULE_STRING
            {
             before(grammarAccess.getPlanImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PlanImport__ImportURIAssignment_113252); 
             after(grammarAccess.getPlanImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__PlanImport__ImportURIAssignment_1"


    // $ANTLR start "rule__CheckPoint__DescriptionAssignment_0_0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6488:1: rule__CheckPoint__DescriptionAssignment_0_0 : ( RULE_ML_COMMENT ) ;
    public final void rule__CheckPoint__DescriptionAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6492:1: ( ( RULE_ML_COMMENT ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6493:1: ( RULE_ML_COMMENT )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6493:1: ( RULE_ML_COMMENT )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6494:1: RULE_ML_COMMENT
            {
             before(grammarAccess.getCheckPointAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0_0()); 
            match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_rule__CheckPoint__DescriptionAssignment_0_013283); 
             after(grammarAccess.getCheckPointAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__CheckPoint__DescriptionAssignment_0_0"


    // $ANTLR start "rule__CheckPoint__NameAssignment_0_2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6503:1: rule__CheckPoint__NameAssignment_0_2 : ( RULE_ID ) ;
    public final void rule__CheckPoint__NameAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6507:1: ( ( RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6508:1: ( RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6508:1: ( RULE_ID )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6509:1: RULE_ID
            {
             before(grammarAccess.getCheckPointAccess().getNameIDTerminalRuleCall_0_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CheckPoint__NameAssignment_0_213314); 
             after(grammarAccess.getCheckPointAccess().getNameIDTerminalRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__CheckPoint__NameAssignment_0_2"


    // $ANTLR start "rule__CheckPoint__LongNameAssignment_0_4_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6518:1: rule__CheckPoint__LongNameAssignment_0_4_1 : ( RULE_STRING ) ;
    public final void rule__CheckPoint__LongNameAssignment_0_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6522:1: ( ( RULE_STRING ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6523:1: ( RULE_STRING )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6523:1: ( RULE_STRING )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6524:1: RULE_STRING
            {
             before(grammarAccess.getCheckPointAccess().getLongNameSTRINGTerminalRuleCall_0_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CheckPoint__LongNameAssignment_0_4_113345); 
             after(grammarAccess.getCheckPointAccess().getLongNameSTRINGTerminalRuleCall_0_4_1_0()); 

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
    // $ANTLR end "rule__CheckPoint__LongNameAssignment_0_4_1"


    // $ANTLR start "rule__CheckPoint__WbsDeliverableAssignment_0_5_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6533:1: rule__CheckPoint__WbsDeliverableAssignment_0_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__CheckPoint__WbsDeliverableAssignment_0_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6537:1: ( ( ( ruleQualifiedName ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6538:1: ( ( ruleQualifiedName ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6538:1: ( ( ruleQualifiedName ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6539:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getCheckPointAccess().getWbsDeliverableWBSDeliverableCrossReference_0_5_1_0()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6540:1: ( ruleQualifiedName )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6541:1: ruleQualifiedName
            {
             before(grammarAccess.getCheckPointAccess().getWbsDeliverableWBSDeliverableQualifiedNameParserRuleCall_0_5_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__CheckPoint__WbsDeliverableAssignment_0_5_113380);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getCheckPointAccess().getWbsDeliverableWBSDeliverableQualifiedNameParserRuleCall_0_5_1_0_1()); 

            }

             after(grammarAccess.getCheckPointAccess().getWbsDeliverableWBSDeliverableCrossReference_0_5_1_0()); 

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
    // $ANTLR end "rule__CheckPoint__WbsDeliverableAssignment_0_5_1"


    // $ANTLR start "rule__CheckPoint__EndAssignment_1_0_0_0_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6552:1: rule__CheckPoint__EndAssignment_1_0_0_0_1 : ( RULE_STRING ) ;
    public final void rule__CheckPoint__EndAssignment_1_0_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6556:1: ( ( RULE_STRING ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6557:1: ( RULE_STRING )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6557:1: ( RULE_STRING )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6558:1: RULE_STRING
            {
             before(grammarAccess.getCheckPointAccess().getEndSTRINGTerminalRuleCall_1_0_0_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CheckPoint__EndAssignment_1_0_0_0_113415); 
             after(grammarAccess.getCheckPointAccess().getEndSTRINGTerminalRuleCall_1_0_0_0_1_0()); 

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
    // $ANTLR end "rule__CheckPoint__EndAssignment_1_0_0_0_1"


    // $ANTLR start "rule__CheckPoint__AfterAssignment_1_0_0_1_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6567:1: rule__CheckPoint__AfterAssignment_1_0_0_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__CheckPoint__AfterAssignment_1_0_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6571:1: ( ( ( ruleQualifiedName ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6572:1: ( ( ruleQualifiedName ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6572:1: ( ( ruleQualifiedName ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6573:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getCheckPointAccess().getAfterActivityElementCrossReference_1_0_0_1_1_0()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6574:1: ( ruleQualifiedName )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6575:1: ruleQualifiedName
            {
             before(grammarAccess.getCheckPointAccess().getAfterActivityElementQualifiedNameParserRuleCall_1_0_0_1_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__CheckPoint__AfterAssignment_1_0_0_1_113450);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getCheckPointAccess().getAfterActivityElementQualifiedNameParserRuleCall_1_0_0_1_1_0_1()); 

            }

             after(grammarAccess.getCheckPointAccess().getAfterActivityElementCrossReference_1_0_0_1_1_0()); 

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
    // $ANTLR end "rule__CheckPoint__AfterAssignment_1_0_0_1_1"


    // $ANTLR start "rule__CheckPoint__OffsetAssignment_1_0_0_1_3"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6586:1: rule__CheckPoint__OffsetAssignment_1_0_0_1_3 : ( RULE_INT ) ;
    public final void rule__CheckPoint__OffsetAssignment_1_0_0_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6590:1: ( ( RULE_INT ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6591:1: ( RULE_INT )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6591:1: ( RULE_INT )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6592:1: RULE_INT
            {
             before(grammarAccess.getCheckPointAccess().getOffsetINTTerminalRuleCall_1_0_0_1_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__CheckPoint__OffsetAssignment_1_0_0_1_313485); 
             after(grammarAccess.getCheckPointAccess().getOffsetINTTerminalRuleCall_1_0_0_1_3_0()); 

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
    // $ANTLR end "rule__CheckPoint__OffsetAssignment_1_0_0_1_3"


    // $ANTLR start "rule__CheckPoint__CompletenessAssignment_1_0_1_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6601:1: rule__CheckPoint__CompletenessAssignment_1_0_1_1 : ( RULE_INT ) ;
    public final void rule__CheckPoint__CompletenessAssignment_1_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6605:1: ( ( RULE_INT ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6606:1: ( RULE_INT )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6606:1: ( RULE_INT )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6607:1: RULE_INT
            {
             before(grammarAccess.getCheckPointAccess().getCompletenessINTTerminalRuleCall_1_0_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__CheckPoint__CompletenessAssignment_1_0_1_113516); 
             after(grammarAccess.getCheckPointAccess().getCompletenessINTTerminalRuleCall_1_0_1_1_0()); 

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
    // $ANTLR end "rule__CheckPoint__CompletenessAssignment_1_0_1_1"


    // $ANTLR start "rule__CheckPoint__DependenciesAssignment_1_0_1_4_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6616:1: rule__CheckPoint__DependenciesAssignment_1_0_1_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__CheckPoint__DependenciesAssignment_1_0_1_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6620:1: ( ( ( ruleQualifiedName ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6621:1: ( ( ruleQualifiedName ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6621:1: ( ( ruleQualifiedName ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6622:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getCheckPointAccess().getDependenciesActivityElementCrossReference_1_0_1_4_1_0()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6623:1: ( ruleQualifiedName )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6624:1: ruleQualifiedName
            {
             before(grammarAccess.getCheckPointAccess().getDependenciesActivityElementQualifiedNameParserRuleCall_1_0_1_4_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__CheckPoint__DependenciesAssignment_1_0_1_4_113551);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getCheckPointAccess().getDependenciesActivityElementQualifiedNameParserRuleCall_1_0_1_4_1_0_1()); 

            }

             after(grammarAccess.getCheckPointAccess().getDependenciesActivityElementCrossReference_1_0_1_4_1_0()); 

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
    // $ANTLR end "rule__CheckPoint__DependenciesAssignment_1_0_1_4_1"


    // $ANTLR start "rule__ResourceInvolvement__ResourceAssignment_0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6635:1: rule__ResourceInvolvement__ResourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ResourceInvolvement__ResourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6639:1: ( ( ( RULE_ID ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6640:1: ( ( RULE_ID ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6640:1: ( ( RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6641:1: ( RULE_ID )
            {
             before(grammarAccess.getResourceInvolvementAccess().getResourceResourceCrossReference_0_0()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6642:1: ( RULE_ID )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6643:1: RULE_ID
            {
             before(grammarAccess.getResourceInvolvementAccess().getResourceResourceIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ResourceInvolvement__ResourceAssignment_013590); 
             after(grammarAccess.getResourceInvolvementAccess().getResourceResourceIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getResourceInvolvementAccess().getResourceResourceCrossReference_0_0()); 

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
    // $ANTLR end "rule__ResourceInvolvement__ResourceAssignment_0"


    // $ANTLR start "rule__ResourceInvolvement__OccupationAssignment_1_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6654:1: rule__ResourceInvolvement__OccupationAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__ResourceInvolvement__OccupationAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6658:1: ( ( RULE_INT ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6659:1: ( RULE_INT )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6659:1: ( RULE_INT )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6660:1: RULE_INT
            {
             before(grammarAccess.getResourceInvolvementAccess().getOccupationINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ResourceInvolvement__OccupationAssignment_1_113625); 
             after(grammarAccess.getResourceInvolvementAccess().getOccupationINTTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__ResourceInvolvement__OccupationAssignment_1_1"


    // $ANTLR start "rule__ResourceInvolvement__ResponsibilityAssignment_2_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6669:1: rule__ResourceInvolvement__ResponsibilityAssignment_2_1 : ( ruleResponsibility ) ;
    public final void rule__ResourceInvolvement__ResponsibilityAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6673:1: ( ( ruleResponsibility ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6674:1: ( ruleResponsibility )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6674:1: ( ruleResponsibility )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6675:1: ruleResponsibility
            {
             before(grammarAccess.getResourceInvolvementAccess().getResponsibilityResponsibilityEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleResponsibility_in_rule__ResourceInvolvement__ResponsibilityAssignment_2_113656);
            ruleResponsibility();

            state._fsp--;

             after(grammarAccess.getResourceInvolvementAccess().getResponsibilityResponsibilityEnumRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__ResourceInvolvement__ResponsibilityAssignment_2_1"


    // $ANTLR start "rule__Activity__DescriptionAssignment_0"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6684:1: rule__Activity__DescriptionAssignment_0 : ( RULE_ML_COMMENT ) ;
    public final void rule__Activity__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6688:1: ( ( RULE_ML_COMMENT ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6689:1: ( RULE_ML_COMMENT )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6689:1: ( RULE_ML_COMMENT )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6690:1: RULE_ML_COMMENT
            {
             before(grammarAccess.getActivityAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_rule__Activity__DescriptionAssignment_013687); 
             after(grammarAccess.getActivityAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Activity__DescriptionAssignment_0"


    // $ANTLR start "rule__Activity__NameAssignment_2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6699:1: rule__Activity__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Activity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6703:1: ( ( RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6704:1: ( RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6704:1: ( RULE_ID )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6705:1: RULE_ID
            {
             before(grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Activity__NameAssignment_213718); 
             after(grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Activity__NameAssignment_2"


    // $ANTLR start "rule__Activity__LongNameAssignment_4_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6714:1: rule__Activity__LongNameAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Activity__LongNameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6718:1: ( ( RULE_STRING ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6719:1: ( RULE_STRING )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6719:1: ( RULE_STRING )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6720:1: RULE_STRING
            {
             before(grammarAccess.getActivityAccess().getLongNameSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Activity__LongNameAssignment_4_113749); 
             after(grammarAccess.getActivityAccess().getLongNameSTRINGTerminalRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Activity__LongNameAssignment_4_1"


    // $ANTLR start "rule__Activity__InvolvedResourcesAssignment_5_2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6729:1: rule__Activity__InvolvedResourcesAssignment_5_2 : ( ruleResourceInvolvement ) ;
    public final void rule__Activity__InvolvedResourcesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6733:1: ( ( ruleResourceInvolvement ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6734:1: ( ruleResourceInvolvement )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6734:1: ( ruleResourceInvolvement )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6735:1: ruleResourceInvolvement
            {
             before(grammarAccess.getActivityAccess().getInvolvedResourcesResourceInvolvementParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_ruleResourceInvolvement_in_rule__Activity__InvolvedResourcesAssignment_5_213780);
            ruleResourceInvolvement();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getInvolvedResourcesResourceInvolvementParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__Activity__InvolvedResourcesAssignment_5_2"


    // $ANTLR start "rule__Activity__WbsActivityAssignment_6_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6744:1: rule__Activity__WbsActivityAssignment_6_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Activity__WbsActivityAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6748:1: ( ( ( ruleQualifiedName ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6749:1: ( ( ruleQualifiedName ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6749:1: ( ( ruleQualifiedName ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6750:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getActivityAccess().getWbsActivityWBSNodeCrossReference_6_1_0()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6751:1: ( ruleQualifiedName )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6752:1: ruleQualifiedName
            {
             before(grammarAccess.getActivityAccess().getWbsActivityWBSNodeQualifiedNameParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Activity__WbsActivityAssignment_6_113815);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getWbsActivityWBSNodeQualifiedNameParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getActivityAccess().getWbsActivityWBSNodeCrossReference_6_1_0()); 

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
    // $ANTLR end "rule__Activity__WbsActivityAssignment_6_1"


    // $ANTLR start "rule__Activity__StartAssignment_7_0_0_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6763:1: rule__Activity__StartAssignment_7_0_0_1 : ( RULE_STRING ) ;
    public final void rule__Activity__StartAssignment_7_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6767:1: ( ( RULE_STRING ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6768:1: ( RULE_STRING )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6768:1: ( RULE_STRING )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6769:1: RULE_STRING
            {
             before(grammarAccess.getActivityAccess().getStartSTRINGTerminalRuleCall_7_0_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Activity__StartAssignment_7_0_0_113850); 
             after(grammarAccess.getActivityAccess().getStartSTRINGTerminalRuleCall_7_0_0_1_0()); 

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
    // $ANTLR end "rule__Activity__StartAssignment_7_0_0_1"


    // $ANTLR start "rule__Activity__AfterAssignment_7_0_1_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6778:1: rule__Activity__AfterAssignment_7_0_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Activity__AfterAssignment_7_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6782:1: ( ( ( ruleQualifiedName ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6783:1: ( ( ruleQualifiedName ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6783:1: ( ( ruleQualifiedName ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6784:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getActivityAccess().getAfterActivityElementCrossReference_7_0_1_1_0()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6785:1: ( ruleQualifiedName )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6786:1: ruleQualifiedName
            {
             before(grammarAccess.getActivityAccess().getAfterActivityElementQualifiedNameParserRuleCall_7_0_1_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Activity__AfterAssignment_7_0_1_113885);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getAfterActivityElementQualifiedNameParserRuleCall_7_0_1_1_0_1()); 

            }

             after(grammarAccess.getActivityAccess().getAfterActivityElementCrossReference_7_0_1_1_0()); 

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
    // $ANTLR end "rule__Activity__AfterAssignment_7_0_1_1"


    // $ANTLR start "rule__Activity__OffsetAssignment_7_0_1_3"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6797:1: rule__Activity__OffsetAssignment_7_0_1_3 : ( RULE_INT ) ;
    public final void rule__Activity__OffsetAssignment_7_0_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6801:1: ( ( RULE_INT ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6802:1: ( RULE_INT )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6802:1: ( RULE_INT )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6803:1: RULE_INT
            {
             before(grammarAccess.getActivityAccess().getOffsetINTTerminalRuleCall_7_0_1_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Activity__OffsetAssignment_7_0_1_313920); 
             after(grammarAccess.getActivityAccess().getOffsetINTTerminalRuleCall_7_0_1_3_0()); 

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
    // $ANTLR end "rule__Activity__OffsetAssignment_7_0_1_3"


    // $ANTLR start "rule__Activity__EndAssignment_7_1_0_0_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6812:1: rule__Activity__EndAssignment_7_1_0_0_1 : ( RULE_STRING ) ;
    public final void rule__Activity__EndAssignment_7_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6816:1: ( ( RULE_STRING ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6817:1: ( RULE_STRING )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6817:1: ( RULE_STRING )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6818:1: RULE_STRING
            {
             before(grammarAccess.getActivityAccess().getEndSTRINGTerminalRuleCall_7_1_0_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Activity__EndAssignment_7_1_0_0_113951); 
             after(grammarAccess.getActivityAccess().getEndSTRINGTerminalRuleCall_7_1_0_0_1_0()); 

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
    // $ANTLR end "rule__Activity__EndAssignment_7_1_0_0_1"


    // $ANTLR start "rule__Activity__DurationAssignment_7_1_0_1_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6827:1: rule__Activity__DurationAssignment_7_1_0_1_1 : ( RULE_INT ) ;
    public final void rule__Activity__DurationAssignment_7_1_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6831:1: ( ( RULE_INT ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6832:1: ( RULE_INT )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6832:1: ( RULE_INT )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6833:1: RULE_INT
            {
             before(grammarAccess.getActivityAccess().getDurationINTTerminalRuleCall_7_1_0_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Activity__DurationAssignment_7_1_0_1_113982); 
             after(grammarAccess.getActivityAccess().getDurationINTTerminalRuleCall_7_1_0_1_1_0()); 

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
    // $ANTLR end "rule__Activity__DurationAssignment_7_1_0_1_1"


    // $ANTLR start "rule__Activity__CompletenessAssignment_7_1_2"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6842:1: rule__Activity__CompletenessAssignment_7_1_2 : ( RULE_INT ) ;
    public final void rule__Activity__CompletenessAssignment_7_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6846:1: ( ( RULE_INT ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6847:1: ( RULE_INT )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6847:1: ( RULE_INT )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6848:1: RULE_INT
            {
             before(grammarAccess.getActivityAccess().getCompletenessINTTerminalRuleCall_7_1_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Activity__CompletenessAssignment_7_1_214013); 
             after(grammarAccess.getActivityAccess().getCompletenessINTTerminalRuleCall_7_1_2_0()); 

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
    // $ANTLR end "rule__Activity__CompletenessAssignment_7_1_2"


    // $ANTLR start "rule__Activity__DependenciesAssignment_7_2_1"
    // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6857:1: rule__Activity__DependenciesAssignment_7_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Activity__DependenciesAssignment_7_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6861:1: ( ( ( ruleQualifiedName ) ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6862:1: ( ( ruleQualifiedName ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6862:1: ( ( ruleQualifiedName ) )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6863:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getActivityAccess().getDependenciesActivityElementCrossReference_7_2_1_0()); 
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6864:1: ( ruleQualifiedName )
            // ../com.lowcoupling.mdpm.lng.plan.ui/src-gen/com/lowcoupling/mdpm/lng/plan/ui/contentassist/antlr/internal/InternalPlan.g:6865:1: ruleQualifiedName
            {
             before(grammarAccess.getActivityAccess().getDependenciesActivityElementQualifiedNameParserRuleCall_7_2_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Activity__DependenciesAssignment_7_2_114048);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getDependenciesActivityElementQualifiedNameParserRuleCall_7_2_1_0_1()); 

            }

             after(grammarAccess.getActivityAccess().getDependenciesActivityElementCrossReference_7_2_1_0()); 

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
    // $ANTLR end "rule__Activity__DependenciesAssignment_7_2_1"

    // Delegated rules


    protected DFA46 dfa46 = new DFA46(this);
    static final String DFA46_eotS =
        "\56\uffff";
    static final String DFA46_eofS =
        "\1\6\55\uffff";
    static final String DFA46_minS =
        "\1\5\1\31\1\6\1\10\1\6\1\11\1\uffff\1\4\1\15\1\37\1\46\1\0\1\5\1"+
        "\6\1\11\1\15\1\uffff\1\10\1\6\1\11\1\0\1\37\1\15\1\5\1\15\1\37\1"+
        "\46\1\5\1\6\1\5\1\6\1\11\1\15\1\6\1\5\1\37\1\15\1\5\1\6\1\5\3\6"+
        "\1\5\2\6";
    static final String DFA46_maxS =
        "\2\51\1\6\1\10\1\6\1\11\1\uffff\1\4\1\15\1\44\1\46\1\0\1\45\1\6"+
        "\1\11\1\15\1\uffff\1\10\1\6\1\11\1\0\1\44\1\15\1\45\1\15\1\44\1"+
        "\46\1\45\1\15\1\5\1\6\1\11\1\15\1\37\1\45\1\44\1\15\1\33\1\6\1\5"+
        "\1\15\2\37\1\5\1\6\1\37";
    static final String DFA46_acceptS =
        "\6\uffff\1\2\11\uffff\1\1\35\uffff";
    static final String DFA46_specialS =
        "\13\uffff\1\1\10\uffff\1\0\31\uffff}>";
    static final String[] DFA46_transitionS = {
            "\1\6\1\uffff\1\1\21\uffff\1\6\6\uffff\1\2\1\uffff\1\3\1\4\1"+
            "\uffff\1\5\3\uffff\1\6",
            "\1\6\6\uffff\1\2\10\uffff\1\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\12",
            "",
            "\1\13",
            "\1\14",
            "\1\15\4\uffff\1\16",
            "\1\17",
            "\1\uffff",
            "\1\24\34\uffff\1\21\1\22\1\uffff\1\23",
            "\1\25",
            "\1\26",
            "\1\27",
            "",
            "\1\30",
            "\1\31",
            "\1\32",
            "\1\uffff",
            "\1\15\4\uffff\1\16",
            "\1\33",
            "\1\24\25\uffff\1\34\6\uffff\1\21\1\22\1\uffff\1\23",
            "\1\35",
            "\1\36\4\uffff\1\37",
            "\1\40",
            "\1\24\34\uffff\1\21\1\22\1\uffff\1\23",
            "\1\41\6\uffff\1\42",
            "\1\24",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\41\6\uffff\1\42\21\uffff\1\46",
            "\1\24\34\uffff\1\21\1\22\1\uffff\1\23",
            "\1\36\4\uffff\1\37",
            "\1\47",
            "\1\24\25\uffff\1\50",
            "\1\51",
            "\1\24",
            "\1\52\6\uffff\1\53",
            "\1\41\6\uffff\1\42\21\uffff\1\46",
            "\1\52\6\uffff\1\53\21\uffff\1\54",
            "\1\24",
            "\1\55",
            "\1\52\6\uffff\1\53\21\uffff\1\54"
    };

    static final short[] DFA46_eot = DFA.unpackEncodedString(DFA46_eotS);
    static final short[] DFA46_eof = DFA.unpackEncodedString(DFA46_eofS);
    static final char[] DFA46_min = DFA.unpackEncodedStringToUnsignedChars(DFA46_minS);
    static final char[] DFA46_max = DFA.unpackEncodedStringToUnsignedChars(DFA46_maxS);
    static final short[] DFA46_accept = DFA.unpackEncodedString(DFA46_acceptS);
    static final short[] DFA46_special = DFA.unpackEncodedString(DFA46_specialS);
    static final short[][] DFA46_transition;

    static {
        int numStates = DFA46_transitionS.length;
        DFA46_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA46_transition[i] = DFA.unpackEncodedString(DFA46_transitionS[i]);
        }
    }

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = DFA46_eot;
            this.eof = DFA46_eof;
            this.min = DFA46_min;
            this.max = DFA46_max;
            this.accept = DFA46_accept;
            this.special = DFA46_special;
            this.transition = DFA46_transition;
        }
        public String getDescription() {
            return "5803:2: ( rule__CheckPoint__UnorderedGroup__1 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA46_20 = input.LA(1);

                         
                        int index46_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup(), 1) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getCheckPointAccess().getUnorderedGroup()) ) {s = 6;}

                         
                        input.seek(index46_20);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA46_11 = input.LA(1);

                         
                        int index46_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup(), 0) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getCheckPointAccess().getUnorderedGroup()) ) {s = 6;}

                         
                        input.seek(index46_11);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 46, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Alternatives_in_ruleProgram94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProject_in_entryRuleProject121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProject128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group__0_in_ruleProject154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssumption_in_entryRuleAssumption181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssumption188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assumption__Group__0_in_ruleAssumption214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__0_in_ruleConstraint274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityGroup_in_entryRuleActivityGroup301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivityGroup308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__0_in_ruleActivityGroup334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSImport_in_entryRuleWBSImport361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWBSImport368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSImport__Group__0_in_ruleWBSImport394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourcesImport_in_entryRuleResourcesImport421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourcesImport428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourcesImport__Group__0_in_ruleResourcesImport454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlanImport_in_entryRulePlanImport481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlanImport488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlanImport__Group__0_in_rulePlanImport514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityElement_in_entryRuleActivityElement603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivityElement610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityElement__Alternatives_in_ruleActivityElement636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_entryRuleENDLINE663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleENDLINE670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleENDLINE697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckPoint_in_entryRuleCheckPoint725 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckPoint732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__UnorderedGroup_in_ruleCheckPoint758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceInvolvement_in_entryRuleResourceInvolvement785 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceInvolvement792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group__0_in_ruleResourceInvolvement818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity845 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivity852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__0_in_ruleActivity878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Responsibility__Alternatives_in_ruleResponsibility917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0__0_in_rule__Program__Alternatives952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__ProjectsAssignment_1_in_rule__Program__Alternatives970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_rule__ActivityElement__Alternatives1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckPoint_in_rule__ActivityElement__Alternatives1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityGroup_in_rule__ActivityElement__Alternatives1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_1_0_0_0__0_in_rule__CheckPoint__Alternatives_1_0_01069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_1_0_0_1__0_in_rule__CheckPoint__Alternatives_1_0_01087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_0_0__0_in_rule__Activity__Alternatives_7_01120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_0_1__0_in_rule__Activity__Alternatives_7_01138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_1_0_0__0_in_rule__Activity__Alternatives_7_1_01171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_1_0_1__0_in_rule__Activity__Alternatives_7_1_01189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Responsibility__Alternatives1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Responsibility__Alternatives1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Responsibility__Alternatives1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Responsibility__Alternatives1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0__0__Impl_in_rule__Program__Group_0__01319 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Program__Group_0__1_in_rule__Program__Group_0__01322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__DescriptionAssignment_0_0_in_rule__Program__Group_0__0__Impl1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0__1__Impl_in_rule__Program__Group_0__11380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1__0_in_rule__Program__Group_0__1__Impl1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1__0__Impl_in_rule__Program__Group_0_1__01441 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1__1_in_rule__Program__Group_0_1__01444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Program__Group_0_1__0__Impl1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1__1__Impl_in_rule__Program__Group_0_1__11503 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1__2_in_rule__Program__Group_0_1__11506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__NameAssignment_0_1_1_in_rule__Program__Group_0_1__1__Impl1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1__2__Impl_in_rule__Program__Group_0_1__21563 = new BitSet(new long[]{0x00000000403800A0L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1__3_in_rule__Program__Group_0_1__21566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_rule__Program__Group_0_1__2__Impl1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1__3__Impl_in_rule__Program__Group_0_1__31622 = new BitSet(new long[]{0x00000000403800A0L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1__4_in_rule__Program__Group_0_1__31625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1_3__0_in_rule__Program__Group_0_1__3__Impl1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1__4__Impl_in_rule__Program__Group_0_1__41683 = new BitSet(new long[]{0x00000000403800A0L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1__5_in_rule__Program__Group_0_1__41686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1_4__0_in_rule__Program__Group_0_1__4__Impl1713 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1__5__Impl_in_rule__Program__Group_0_1__51744 = new BitSet(new long[]{0x00000000403800A0L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1__6_in_rule__Program__Group_0_1__51747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1_5__0_in_rule__Program__Group_0_1__5__Impl1774 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1__6__Impl_in_rule__Program__Group_0_1__61805 = new BitSet(new long[]{0x00000000403800A0L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1__7_in_rule__Program__Group_0_1__61808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__ProjectsAssignment_0_1_6_in_rule__Program__Group_0_1__6__Impl1835 = new BitSet(new long[]{0x0000000000200082L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1__7__Impl_in_rule__Program__Group_0_1__71866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_rule__Program__Group_0_1__7__Impl1893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1_3__0__Impl_in_rule__Program__Group_0_1_3__01938 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1_3__1_in_rule__Program__Group_0_1_3__01941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Program__Group_0_1_3__0__Impl1969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1_3__1__Impl_in_rule__Program__Group_0_1_3__12000 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1_3__2_in_rule__Program__Group_0_1_3__12003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__LongNameAssignment_0_1_3_1_in_rule__Program__Group_0_1_3__1__Impl2030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1_3__2__Impl_in_rule__Program__Group_0_1_3__22060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__Program__Group_0_1_3__2__Impl2087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1_4__0__Impl_in_rule__Program__Group_0_1_4__02122 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1_4__1_in_rule__Program__Group_0_1_4__02125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__PlansAssignment_0_1_4_0_in_rule__Program__Group_0_1_4__0__Impl2152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1_4__1__Impl_in_rule__Program__Group_0_1_4__12182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__Program__Group_0_1_4__1__Impl2209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1_5__0__Impl_in_rule__Program__Group_0_1_5__02242 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1_5__1_in_rule__Program__Group_0_1_5__02245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Program__Group_0_1_5__0__Impl2273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1_5__1__Impl_in_rule__Program__Group_0_1_5__12304 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1_5__2_in_rule__Program__Group_0_1_5__12307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__ReferencedProjectsAssignment_0_1_5_1_in_rule__Program__Group_0_1_5__1__Impl2334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0_1_5__2__Impl_in_rule__Program__Group_0_1_5__22364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__Program__Group_0_1_5__2__Impl2391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group__0__Impl_in_rule__Project__Group__02426 = new BitSet(new long[]{0x0000000000200080L});
    public static final BitSet FOLLOW_rule__Project__Group__1_in_rule__Project__Group__02429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__DescriptionAssignment_0_in_rule__Project__Group__0__Impl2456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group__1__Impl_in_rule__Project__Group__12487 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Project__Group__2_in_rule__Project__Group__12490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Project__Group__1__Impl2518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group__2__Impl_in_rule__Project__Group__22549 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Project__Group__3_in_rule__Project__Group__22552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__NameAssignment_2_in_rule__Project__Group__2__Impl2579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group__3__Impl_in_rule__Project__Group__32609 = new BitSet(new long[]{0x0000022D72C800A0L});
    public static final BitSet FOLLOW_rule__Project__Group__4_in_rule__Project__Group__32612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_rule__Project__Group__3__Impl2639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group__4__Impl_in_rule__Project__Group__42668 = new BitSet(new long[]{0x0000022D72C800A0L});
    public static final BitSet FOLLOW_rule__Project__Group__5_in_rule__Project__Group__42671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_4__0_in_rule__Project__Group__4__Impl2698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group__5__Impl_in_rule__Project__Group__52729 = new BitSet(new long[]{0x0000022D72C800A0L});
    public static final BitSet FOLLOW_rule__Project__Group__6_in_rule__Project__Group__52732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_5__0_in_rule__Project__Group__5__Impl2759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group__6__Impl_in_rule__Project__Group__62790 = new BitSet(new long[]{0x0000022D72C800A0L});
    public static final BitSet FOLLOW_rule__Project__Group__7_in_rule__Project__Group__62793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_6__0_in_rule__Project__Group__6__Impl2820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group__7__Impl_in_rule__Project__Group__72851 = new BitSet(new long[]{0x0000022D72C800A0L});
    public static final BitSet FOLLOW_rule__Project__Group__8_in_rule__Project__Group__72854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_7__0_in_rule__Project__Group__7__Impl2881 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__Project__Group__8__Impl_in_rule__Project__Group__82912 = new BitSet(new long[]{0x0000022D72C800A0L});
    public static final BitSet FOLLOW_rule__Project__Group__9_in_rule__Project__Group__82915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_8__0_in_rule__Project__Group__8__Impl2942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group__9__Impl_in_rule__Project__Group__92973 = new BitSet(new long[]{0x0000022D72C800A0L});
    public static final BitSet FOLLOW_rule__Project__Group__10_in_rule__Project__Group__92976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_9__0_in_rule__Project__Group__9__Impl3003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group__10__Impl_in_rule__Project__Group__103034 = new BitSet(new long[]{0x0000022D72C800A0L});
    public static final BitSet FOLLOW_rule__Project__Group__11_in_rule__Project__Group__103037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__ActivitiesAssignment_10_in_rule__Project__Group__10__Impl3064 = new BitSet(new long[]{0x0000022D02000082L});
    public static final BitSet FOLLOW_rule__Project__Group__11__Impl_in_rule__Project__Group__113095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_rule__Project__Group__11__Impl3122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_4__0__Impl_in_rule__Project__Group_4__03175 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Project__Group_4__1_in_rule__Project__Group_4__03178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Project__Group_4__0__Impl3206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_4__1__Impl_in_rule__Project__Group_4__13237 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Project__Group_4__2_in_rule__Project__Group_4__13240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__LongNameAssignment_4_1_in_rule__Project__Group_4__1__Impl3267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_4__2__Impl_in_rule__Project__Group_4__23297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__Project__Group_4__2__Impl3324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_5__0__Impl_in_rule__Project__Group_5__03359 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Project__Group_5__1_in_rule__Project__Group_5__03362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__WbsAssignment_5_0_in_rule__Project__Group_5__0__Impl3389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_5__1__Impl_in_rule__Project__Group_5__13419 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Project__Group_5__2_in_rule__Project__Group_5__13422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Project__Group_5__1__Impl3450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_5__2__Impl_in_rule__Project__Group_5__23481 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Project__Group_5__3_in_rule__Project__Group_5__23484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__WbsProjectAssignment_5_2_in_rule__Project__Group_5__2__Impl3511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_5__3__Impl_in_rule__Project__Group_5__33541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__Project__Group_5__3__Impl3568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_6__0__Impl_in_rule__Project__Group_6__03605 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Project__Group_6__1_in_rule__Project__Group_6__03608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__ResourcesAssignment_6_0_in_rule__Project__Group_6__0__Impl3635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_6__1__Impl_in_rule__Project__Group_6__13665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__Project__Group_6__1__Impl3692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_7__0__Impl_in_rule__Project__Group_7__03725 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Project__Group_7__1_in_rule__Project__Group_7__03728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__PlansAssignment_7_0_in_rule__Project__Group_7__0__Impl3755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_7__1__Impl_in_rule__Project__Group_7__13785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__Project__Group_7__1__Impl3812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_8__0__Impl_in_rule__Project__Group_8__03845 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Project__Group_8__1_in_rule__Project__Group_8__03848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Project__Group_8__0__Impl3876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_8__1__Impl_in_rule__Project__Group_8__13907 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_rule__Project__Group_8__2_in_rule__Project__Group_8__13910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_rule__Project__Group_8__1__Impl3937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_8__2__Impl_in_rule__Project__Group_8__23966 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_rule__Project__Group_8__3_in_rule__Project__Group_8__23969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__AssumptionsAssignment_8_2_in_rule__Project__Group_8__2__Impl3996 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Project__Group_8__3__Impl_in_rule__Project__Group_8__34027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_rule__Project__Group_8__3__Impl4054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_9__0__Impl_in_rule__Project__Group_9__04091 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Project__Group_9__1_in_rule__Project__Group_9__04094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Project__Group_9__0__Impl4122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_9__1__Impl_in_rule__Project__Group_9__14153 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_rule__Project__Group_9__2_in_rule__Project__Group_9__14156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_rule__Project__Group_9__1__Impl4183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group_9__2__Impl_in_rule__Project__Group_9__24212 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_rule__Project__Group_9__3_in_rule__Project__Group_9__24215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__ConstraintsAssignment_9_2_in_rule__Project__Group_9__2__Impl4242 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Project__Group_9__3__Impl_in_rule__Project__Group_9__34273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_rule__Project__Group_9__3__Impl4300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assumption__Group__0__Impl_in_rule__Assumption__Group__04337 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Assumption__Group__1_in_rule__Assumption__Group__04340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Assumption__Group__0__Impl4368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assumption__Group__1__Impl_in_rule__Assumption__Group__14399 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Assumption__Group__2_in_rule__Assumption__Group__14402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assumption__ValueAssignment_1_in_rule__Assumption__Group__1__Impl4429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assumption__Group__2__Impl_in_rule__Assumption__Group__24459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__Assumption__Group__2__Impl4486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__0__Impl_in_rule__Constraint__Group__04521 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Constraint__Group__1_in_rule__Constraint__Group__04524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Constraint__Group__0__Impl4552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__1__Impl_in_rule__Constraint__Group__14583 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Constraint__Group__2_in_rule__Constraint__Group__14586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__ValueAssignment_1_in_rule__Constraint__Group__1__Impl4613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__2__Impl_in_rule__Constraint__Group__24643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__Constraint__Group__2__Impl4670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__0__Impl_in_rule__ActivityGroup__Group__04705 = new BitSet(new long[]{0x0000022D02000080L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__1_in_rule__ActivityGroup__Group__04708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__DescriptionAssignment_0_in_rule__ActivityGroup__Group__0__Impl4735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__1__Impl_in_rule__ActivityGroup__Group__14766 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__2_in_rule__ActivityGroup__Group__14769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ActivityGroup__Group__1__Impl4797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__2__Impl_in_rule__ActivityGroup__Group__24828 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__3_in_rule__ActivityGroup__Group__24831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__NameAssignment_2_in_rule__ActivityGroup__Group__2__Impl4858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__3__Impl_in_rule__ActivityGroup__Group__34888 = new BitSet(new long[]{0x0000022D0E0800A0L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__4_in_rule__ActivityGroup__Group__34891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_rule__ActivityGroup__Group__3__Impl4918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__4__Impl_in_rule__ActivityGroup__Group__44947 = new BitSet(new long[]{0x0000022D0E0800A0L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__5_in_rule__ActivityGroup__Group__44950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group_4__0_in_rule__ActivityGroup__Group__4__Impl4977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__5__Impl_in_rule__ActivityGroup__Group__55008 = new BitSet(new long[]{0x0000022D0E0800A0L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__6_in_rule__ActivityGroup__Group__55011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group_5__0_in_rule__ActivityGroup__Group__5__Impl5038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__6__Impl_in_rule__ActivityGroup__Group__65069 = new BitSet(new long[]{0x0000022D0E0800A0L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__7_in_rule__ActivityGroup__Group__65072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group_6__0_in_rule__ActivityGroup__Group__6__Impl5099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__7__Impl_in_rule__ActivityGroup__Group__75130 = new BitSet(new long[]{0x0000022D0E0800A0L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__8_in_rule__ActivityGroup__Group__75133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__ActivitiesAssignment_7_in_rule__ActivityGroup__Group__7__Impl5160 = new BitSet(new long[]{0x0000022D02000082L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group__8__Impl_in_rule__ActivityGroup__Group__85191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_rule__ActivityGroup__Group__8__Impl5218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group_4__0__Impl_in_rule__ActivityGroup__Group_4__05265 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group_4__1_in_rule__ActivityGroup__Group_4__05268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ActivityGroup__Group_4__0__Impl5296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group_4__1__Impl_in_rule__ActivityGroup__Group_4__15327 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group_4__2_in_rule__ActivityGroup__Group_4__15330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__LongNameAssignment_4_1_in_rule__ActivityGroup__Group_4__1__Impl5357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group_4__2__Impl_in_rule__ActivityGroup__Group_4__25387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__ActivityGroup__Group_4__2__Impl5414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group_5__0__Impl_in_rule__ActivityGroup__Group_5__05449 = new BitSet(new long[]{0x0000000000002040L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group_5__1_in_rule__ActivityGroup__Group_5__05452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ActivityGroup__Group_5__0__Impl5480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group_5__1__Impl_in_rule__ActivityGroup__Group_5__15511 = new BitSet(new long[]{0x0000000000002040L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group_5__2_in_rule__ActivityGroup__Group_5__15514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__WbsActivityAssignment_5_1_in_rule__ActivityGroup__Group_5__1__Impl5541 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group_5__2__Impl_in_rule__ActivityGroup__Group_5__25572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__ActivityGroup__Group_5__2__Impl5599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group_6__0__Impl_in_rule__ActivityGroup__Group_6__05634 = new BitSet(new long[]{0x0000000000002040L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group_6__1_in_rule__ActivityGroup__Group_6__05637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ActivityGroup__Group_6__0__Impl5665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group_6__1__Impl_in_rule__ActivityGroup__Group_6__15696 = new BitSet(new long[]{0x0000000000002040L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group_6__2_in_rule__ActivityGroup__Group_6__15699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActivityGroup__DependenciesAssignment_6_1_in_rule__ActivityGroup__Group_6__1__Impl5726 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__ActivityGroup__Group_6__2__Impl_in_rule__ActivityGroup__Group_6__25757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__ActivityGroup__Group_6__2__Impl5784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSImport__Group__0__Impl_in_rule__WBSImport__Group__05819 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__WBSImport__Group__1_in_rule__WBSImport__Group__05822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__WBSImport__Group__0__Impl5850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSImport__Group__1__Impl_in_rule__WBSImport__Group__15881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WBSImport__ImportURIAssignment_1_in_rule__WBSImport__Group__1__Impl5908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourcesImport__Group__0__Impl_in_rule__ResourcesImport__Group__05942 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__ResourcesImport__Group__1_in_rule__ResourcesImport__Group__05945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ResourcesImport__Group__0__Impl5973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourcesImport__Group__1__Impl_in_rule__ResourcesImport__Group__16004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourcesImport__ImportURIAssignment_1_in_rule__ResourcesImport__Group__1__Impl6031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlanImport__Group__0__Impl_in_rule__PlanImport__Group__06065 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__PlanImport__Group__1_in_rule__PlanImport__Group__06068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__PlanImport__Group__0__Impl6096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlanImport__Group__1__Impl_in_rule__PlanImport__Group__16127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlanImport__ImportURIAssignment_1_in_rule__PlanImport__Group__1__Impl6154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__06188 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__06191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl6218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__16247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl6274 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__06309 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__06312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__QualifiedName__Group_1__0__Impl6340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__16371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl6398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_0__0__Impl_in_rule__CheckPoint__Group_0__06432 = new BitSet(new long[]{0x0000000100000080L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_0__1_in_rule__CheckPoint__Group_0__06435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__DescriptionAssignment_0_0_in_rule__CheckPoint__Group_0__0__Impl6462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_0__1__Impl_in_rule__CheckPoint__Group_0__16493 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_0__2_in_rule__CheckPoint__Group_0__16496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__CheckPoint__Group_0__1__Impl6524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_0__2__Impl_in_rule__CheckPoint__Group_0__26555 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_0__3_in_rule__CheckPoint__Group_0__26558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__NameAssignment_0_2_in_rule__CheckPoint__Group_0__2__Impl6585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_0__3__Impl_in_rule__CheckPoint__Group_0__36615 = new BitSet(new long[]{0x0000000200080000L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_0__4_in_rule__CheckPoint__Group_0__36618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_rule__CheckPoint__Group_0__3__Impl6645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_0__4__Impl_in_rule__CheckPoint__Group_0__46674 = new BitSet(new long[]{0x0000000200080000L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_0__5_in_rule__CheckPoint__Group_0__46677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_0_4__0_in_rule__CheckPoint__Group_0__4__Impl6704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_0__5__Impl_in_rule__CheckPoint__Group_0__56735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_0_5__0_in_rule__CheckPoint__Group_0__5__Impl6762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_0_4__0__Impl_in_rule__CheckPoint__Group_0_4__06805 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_0_4__1_in_rule__CheckPoint__Group_0_4__06808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__CheckPoint__Group_0_4__0__Impl6836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_0_4__1__Impl_in_rule__CheckPoint__Group_0_4__16867 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_0_4__2_in_rule__CheckPoint__Group_0_4__16870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__LongNameAssignment_0_4_1_in_rule__CheckPoint__Group_0_4__1__Impl6897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_0_4__2__Impl_in_rule__CheckPoint__Group_0_4__26927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__CheckPoint__Group_0_4__2__Impl6954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_0_5__0__Impl_in_rule__CheckPoint__Group_0_5__06989 = new BitSet(new long[]{0x0000000000002040L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_0_5__1_in_rule__CheckPoint__Group_0_5__06992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__CheckPoint__Group_0_5__0__Impl7020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_0_5__1__Impl_in_rule__CheckPoint__Group_0_5__17051 = new BitSet(new long[]{0x0000000000002040L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_0_5__2_in_rule__CheckPoint__Group_0_5__17054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__WbsDeliverableAssignment_0_5_1_in_rule__CheckPoint__Group_0_5__1__Impl7081 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_0_5__2__Impl_in_rule__CheckPoint__Group_0_5__27112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__CheckPoint__Group_0_5__2__Impl7139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_1__0__Impl_in_rule__CheckPoint__Group_1__07174 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_1__1_in_rule__CheckPoint__Group_1__07177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__UnorderedGroup_1_0_in_rule__CheckPoint__Group_1__0__Impl7204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_1__1__Impl_in_rule__CheckPoint__Group_1__17234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_rule__CheckPoint__Group_1__1__Impl7261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_1_0_0_0__0__Impl_in_rule__CheckPoint__Group_1_0_0_0__07294 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_1_0_0_0__1_in_rule__CheckPoint__Group_1_0_0_0__07297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__CheckPoint__Group_1_0_0_0__0__Impl7325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_1_0_0_0__1__Impl_in_rule__CheckPoint__Group_1_0_0_0__17356 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_1_0_0_0__2_in_rule__CheckPoint__Group_1_0_0_0__17359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__EndAssignment_1_0_0_0_1_in_rule__CheckPoint__Group_1_0_0_0__1__Impl7386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_1_0_0_0__2__Impl_in_rule__CheckPoint__Group_1_0_0_0__27416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__CheckPoint__Group_1_0_0_0__2__Impl7443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_1_0_0_1__0__Impl_in_rule__CheckPoint__Group_1_0_0_1__07478 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_1_0_0_1__1_in_rule__CheckPoint__Group_1_0_0_1__07481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__CheckPoint__Group_1_0_0_1__0__Impl7509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_1_0_0_1__1__Impl_in_rule__CheckPoint__Group_1_0_0_1__17540 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_1_0_0_1__2_in_rule__CheckPoint__Group_1_0_0_1__17543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__AfterAssignment_1_0_0_1_1_in_rule__CheckPoint__Group_1_0_0_1__1__Impl7570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_1_0_0_1__2__Impl_in_rule__CheckPoint__Group_1_0_0_1__27600 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_1_0_0_1__3_in_rule__CheckPoint__Group_1_0_0_1__27603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__CheckPoint__Group_1_0_0_1__2__Impl7631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_1_0_0_1__3__Impl_in_rule__CheckPoint__Group_1_0_0_1__37662 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_1_0_0_1__4_in_rule__CheckPoint__Group_1_0_0_1__37665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__OffsetAssignment_1_0_0_1_3_in_rule__CheckPoint__Group_1_0_0_1__3__Impl7692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_1_0_0_1__4__Impl_in_rule__CheckPoint__Group_1_0_0_1__47722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__CheckPoint__Group_1_0_0_1__4__Impl7749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_1_0_1__0__Impl_in_rule__CheckPoint__Group_1_0_1__07788 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_1_0_1__1_in_rule__CheckPoint__Group_1_0_1__07791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__CheckPoint__Group_1_0_1__0__Impl7819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_1_0_1__1__Impl_in_rule__CheckPoint__Group_1_0_1__17850 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_1_0_1__2_in_rule__CheckPoint__Group_1_0_1__17853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__CompletenessAssignment_1_0_1_1_in_rule__CheckPoint__Group_1_0_1__1__Impl7880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_1_0_1__2__Impl_in_rule__CheckPoint__Group_1_0_1__27910 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_1_0_1__3_in_rule__CheckPoint__Group_1_0_1__27913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__CheckPoint__Group_1_0_1__2__Impl7941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_1_0_1__3__Impl_in_rule__CheckPoint__Group_1_0_1__37972 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_1_0_1__4_in_rule__CheckPoint__Group_1_0_1__37975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__CheckPoint__Group_1_0_1__3__Impl8002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_1_0_1__4__Impl_in_rule__CheckPoint__Group_1_0_1__48031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_1_0_1_4__0_in_rule__CheckPoint__Group_1_0_1__4__Impl8058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_1_0_1_4__0__Impl_in_rule__CheckPoint__Group_1_0_1_4__08099 = new BitSet(new long[]{0x0000000000002040L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_1_0_1_4__1_in_rule__CheckPoint__Group_1_0_1_4__08102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__CheckPoint__Group_1_0_1_4__0__Impl8130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_1_0_1_4__1__Impl_in_rule__CheckPoint__Group_1_0_1_4__18161 = new BitSet(new long[]{0x0000000000002040L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_1_0_1_4__2_in_rule__CheckPoint__Group_1_0_1_4__18164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__DependenciesAssignment_1_0_1_4_1_in_rule__CheckPoint__Group_1_0_1_4__1__Impl8191 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_1_0_1_4__2__Impl_in_rule__CheckPoint__Group_1_0_1_4__28222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__CheckPoint__Group_1_0_1_4__2__Impl8249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group__0__Impl_in_rule__ResourceInvolvement__Group__08284 = new BitSet(new long[]{0x0000018000002000L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group__1_in_rule__ResourceInvolvement__Group__08287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__ResourceAssignment_0_in_rule__ResourceInvolvement__Group__0__Impl8314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group__1__Impl_in_rule__ResourceInvolvement__Group__18344 = new BitSet(new long[]{0x0000018000002000L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group__2_in_rule__ResourceInvolvement__Group__18347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group_1__0_in_rule__ResourceInvolvement__Group__1__Impl8374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group__2__Impl_in_rule__ResourceInvolvement__Group__28405 = new BitSet(new long[]{0x0000018000002000L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group__3_in_rule__ResourceInvolvement__Group__28408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group_2__0_in_rule__ResourceInvolvement__Group__2__Impl8435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group__3__Impl_in_rule__ResourceInvolvement__Group__38466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__ResourceInvolvement__Group__3__Impl8493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group_1__0__Impl_in_rule__ResourceInvolvement__Group_1__08530 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group_1__1_in_rule__ResourceInvolvement__Group_1__08533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__ResourceInvolvement__Group_1__0__Impl8561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group_1__1__Impl_in_rule__ResourceInvolvement__Group_1__18592 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group_1__2_in_rule__ResourceInvolvement__Group_1__18595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__OccupationAssignment_1_1_in_rule__ResourceInvolvement__Group_1__1__Impl8622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group_1__2__Impl_in_rule__ResourceInvolvement__Group_1__28652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ResourceInvolvement__Group_1__2__Impl8680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group_2__0__Impl_in_rule__ResourceInvolvement__Group_2__08717 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group_2__1_in_rule__ResourceInvolvement__Group_2__08720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ResourceInvolvement__Group_2__0__Impl8748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__Group_2__1__Impl_in_rule__ResourceInvolvement__Group_2__18779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceInvolvement__ResponsibilityAssignment_2_1_in_rule__ResourceInvolvement__Group_2__1__Impl8806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__08840 = new BitSet(new long[]{0x0000020000000080L});
    public static final BitSet FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__08843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__DescriptionAssignment_0_in_rule__Activity__Group__0__Impl8870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__18901 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__18904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Activity__Group__1__Impl8932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__28963 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__28966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__NameAssignment_2_in_rule__Activity__Group__2__Impl8993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__39023 = new BitSet(new long[]{0x00003C080C080000L});
    public static final BitSet FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__39026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_rule__Activity__Group__3__Impl9053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__49082 = new BitSet(new long[]{0x00003C080C080000L});
    public static final BitSet FOLLOW_rule__Activity__Group__5_in_rule__Activity__Group__49085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__0_in_rule__Activity__Group__4__Impl9112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__5__Impl_in_rule__Activity__Group__59143 = new BitSet(new long[]{0x00003C080C080000L});
    public static final BitSet FOLLOW_rule__Activity__Group__6_in_rule__Activity__Group__59146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__0_in_rule__Activity__Group__5__Impl9173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__6__Impl_in_rule__Activity__Group__69204 = new BitSet(new long[]{0x00003C080C080000L});
    public static final BitSet FOLLOW_rule__Activity__Group__7_in_rule__Activity__Group__69207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6__0_in_rule__Activity__Group__6__Impl9234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__7__Impl_in_rule__Activity__Group__79265 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Activity__Group__8_in_rule__Activity__Group__79268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__UnorderedGroup_7_in_rule__Activity__Group__7__Impl9295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__8__Impl_in_rule__Activity__Group__89325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_rule__Activity__Group__8__Impl9352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__0__Impl_in_rule__Activity__Group_4__09399 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__1_in_rule__Activity__Group_4__09402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Activity__Group_4__0__Impl9430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__1__Impl_in_rule__Activity__Group_4__19461 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__2_in_rule__Activity__Group_4__19464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__LongNameAssignment_4_1_in_rule__Activity__Group_4__1__Impl9491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__2__Impl_in_rule__Activity__Group_4__29521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__Activity__Group_4__2__Impl9548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__0__Impl_in_rule__Activity__Group_5__09583 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__1_in_rule__Activity__Group_5__09586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Activity__Group_5__0__Impl9614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__1__Impl_in_rule__Activity__Group_5__19645 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__2_in_rule__Activity__Group_5__19648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_rule__Activity__Group_5__1__Impl9675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__2__Impl_in_rule__Activity__Group_5__29704 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__3_in_rule__Activity__Group_5__29707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__InvolvedResourcesAssignment_5_2_in_rule__Activity__Group_5__2__Impl9734 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Activity__Group_5__3__Impl_in_rule__Activity__Group_5__39765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_rule__Activity__Group_5__3__Impl9792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6__0__Impl_in_rule__Activity__Group_6__09829 = new BitSet(new long[]{0x0000000000002040L});
    public static final BitSet FOLLOW_rule__Activity__Group_6__1_in_rule__Activity__Group_6__09832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Activity__Group_6__0__Impl9860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_6__1__Impl_in_rule__Activity__Group_6__19891 = new BitSet(new long[]{0x0000000000002040L});
    public static final BitSet FOLLOW_rule__Activity__Group_6__2_in_rule__Activity__Group_6__19894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__WbsActivityAssignment_6_1_in_rule__Activity__Group_6__1__Impl9921 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Activity__Group_6__2__Impl_in_rule__Activity__Group_6__29952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__Activity__Group_6__2__Impl9979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_0_0__0__Impl_in_rule__Activity__Group_7_0_0__010014 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_0_0__1_in_rule__Activity__Group_7_0_0__010017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Activity__Group_7_0_0__0__Impl10045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_0_0__1__Impl_in_rule__Activity__Group_7_0_0__110076 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_0_0__2_in_rule__Activity__Group_7_0_0__110079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__StartAssignment_7_0_0_1_in_rule__Activity__Group_7_0_0__1__Impl10106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_0_0__2__Impl_in_rule__Activity__Group_7_0_0__210136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__Activity__Group_7_0_0__2__Impl10163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_0_1__0__Impl_in_rule__Activity__Group_7_0_1__010198 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_0_1__1_in_rule__Activity__Group_7_0_1__010201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Activity__Group_7_0_1__0__Impl10229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_0_1__1__Impl_in_rule__Activity__Group_7_0_1__110260 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_0_1__2_in_rule__Activity__Group_7_0_1__110263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__AfterAssignment_7_0_1_1_in_rule__Activity__Group_7_0_1__1__Impl10290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_0_1__2__Impl_in_rule__Activity__Group_7_0_1__210320 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_0_1__3_in_rule__Activity__Group_7_0_1__210323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Activity__Group_7_0_1__2__Impl10351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_0_1__3__Impl_in_rule__Activity__Group_7_0_1__310382 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_0_1__4_in_rule__Activity__Group_7_0_1__310385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__OffsetAssignment_7_0_1_3_in_rule__Activity__Group_7_0_1__3__Impl10412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_0_1__4__Impl_in_rule__Activity__Group_7_0_1__410442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__Activity__Group_7_0_1__4__Impl10469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_1__0__Impl_in_rule__Activity__Group_7_1__010508 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_1__1_in_rule__Activity__Group_7_1__010511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Alternatives_7_1_0_in_rule__Activity__Group_7_1__0__Impl10538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_1__1__Impl_in_rule__Activity__Group_7_1__110568 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_1__2_in_rule__Activity__Group_7_1__110571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Activity__Group_7_1__1__Impl10599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_1__2__Impl_in_rule__Activity__Group_7_1__210630 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_1__3_in_rule__Activity__Group_7_1__210633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__CompletenessAssignment_7_1_2_in_rule__Activity__Group_7_1__2__Impl10660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_1__3__Impl_in_rule__Activity__Group_7_1__310690 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_1__4_in_rule__Activity__Group_7_1__310693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Activity__Group_7_1__3__Impl10721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_1__4__Impl_in_rule__Activity__Group_7_1__410752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__Activity__Group_7_1__4__Impl10779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_1_0_0__0__Impl_in_rule__Activity__Group_7_1_0_0__010818 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_1_0_0__1_in_rule__Activity__Group_7_1_0_0__010821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Activity__Group_7_1_0_0__0__Impl10849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_1_0_0__1__Impl_in_rule__Activity__Group_7_1_0_0__110880 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_1_0_0__2_in_rule__Activity__Group_7_1_0_0__110883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__EndAssignment_7_1_0_0_1_in_rule__Activity__Group_7_1_0_0__1__Impl10910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_1_0_0__2__Impl_in_rule__Activity__Group_7_1_0_0__210940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__Activity__Group_7_1_0_0__2__Impl10967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_1_0_1__0__Impl_in_rule__Activity__Group_7_1_0_1__011002 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_1_0_1__1_in_rule__Activity__Group_7_1_0_1__011005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Activity__Group_7_1_0_1__0__Impl11033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_1_0_1__1__Impl_in_rule__Activity__Group_7_1_0_1__111064 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_1_0_1__2_in_rule__Activity__Group_7_1_0_1__111067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__DurationAssignment_7_1_0_1_1_in_rule__Activity__Group_7_1_0_1__1__Impl11094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_1_0_1__2__Impl_in_rule__Activity__Group_7_1_0_1__211124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__Activity__Group_7_1_0_1__2__Impl11151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_2__0__Impl_in_rule__Activity__Group_7_2__011186 = new BitSet(new long[]{0x0000000000002040L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_2__1_in_rule__Activity__Group_7_2__011189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Activity__Group_7_2__0__Impl11217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_2__1__Impl_in_rule__Activity__Group_7_2__111248 = new BitSet(new long[]{0x0000000000002040L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_2__2_in_rule__Activity__Group_7_2__111251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__DependenciesAssignment_7_2_1_in_rule__Activity__Group_7_2__1__Impl11278 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_2__2__Impl_in_rule__Activity__Group_7_2__211309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_rule__Activity__Group_7_2__2__Impl11336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__UnorderedGroup__0_in_rule__CheckPoint__UnorderedGroup11373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_0__0_in_rule__CheckPoint__UnorderedGroup__Impl11462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_1__0_in_rule__CheckPoint__UnorderedGroup__Impl11553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__UnorderedGroup__Impl_in_rule__CheckPoint__UnorderedGroup__011612 = new BitSet(new long[]{0x0000002D00000082L});
    public static final BitSet FOLLOW_rule__CheckPoint__UnorderedGroup__1_in_rule__CheckPoint__UnorderedGroup__011615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__UnorderedGroup__Impl_in_rule__CheckPoint__UnorderedGroup__111640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__UnorderedGroup_1_0__0_in_rule__CheckPoint__UnorderedGroup_1_011668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Alternatives_1_0_0_in_rule__CheckPoint__UnorderedGroup_1_0__Impl11757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__Group_1_0_1__0_in_rule__CheckPoint__UnorderedGroup_1_0__Impl11848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__UnorderedGroup_1_0__Impl_in_rule__CheckPoint__UnorderedGroup_1_0__011907 = new BitSet(new long[]{0x0000002D00000082L});
    public static final BitSet FOLLOW_rule__CheckPoint__UnorderedGroup_1_0__1_in_rule__CheckPoint__UnorderedGroup_1_0__011910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckPoint__UnorderedGroup_1_0__Impl_in_rule__CheckPoint__UnorderedGroup_1_0__111935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__UnorderedGroup_7__0_in_rule__Activity__UnorderedGroup_711963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Alternatives_7_0_in_rule__Activity__UnorderedGroup_7__Impl12052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_1__0_in_rule__Activity__UnorderedGroup_7__Impl12143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_7_2__0_in_rule__Activity__UnorderedGroup_7__Impl12234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__UnorderedGroup_7__Impl_in_rule__Activity__UnorderedGroup_7__012293 = new BitSet(new long[]{0x00003C080C080002L});
    public static final BitSet FOLLOW_rule__Activity__UnorderedGroup_7__1_in_rule__Activity__UnorderedGroup_7__012296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__UnorderedGroup_7__Impl_in_rule__Activity__UnorderedGroup_7__112321 = new BitSet(new long[]{0x00003C080C080002L});
    public static final BitSet FOLLOW_rule__Activity__UnorderedGroup_7__2_in_rule__Activity__UnorderedGroup_7__112324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__UnorderedGroup_7__Impl_in_rule__Activity__UnorderedGroup_7__212349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_rule__Program__DescriptionAssignment_0_012383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Program__NameAssignment_0_1_112414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Program__LongNameAssignment_0_1_3_112445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlanImport_in_rule__Program__PlansAssignment_0_1_4_012476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Program__ReferencedProjectsAssignment_0_1_5_112511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProject_in_rule__Program__ProjectsAssignment_0_1_612546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProject_in_rule__Program__ProjectsAssignment_112577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_rule__Project__DescriptionAssignment_012608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Project__NameAssignment_212639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Project__LongNameAssignment_4_112670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSImport_in_rule__Project__WbsAssignment_5_012701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Project__WbsProjectAssignment_5_212736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourcesImport_in_rule__Project__ResourcesAssignment_6_012771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlanImport_in_rule__Project__PlansAssignment_7_012802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssumption_in_rule__Project__AssumptionsAssignment_8_212833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_rule__Project__ConstraintsAssignment_9_212864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityElement_in_rule__Project__ActivitiesAssignment_1012895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Assumption__ValueAssignment_112926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Constraint__ValueAssignment_112957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_rule__ActivityGroup__DescriptionAssignment_012988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ActivityGroup__NameAssignment_213019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ActivityGroup__LongNameAssignment_4_113050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__ActivityGroup__WbsActivityAssignment_5_113085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__ActivityGroup__DependenciesAssignment_6_113124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityElement_in_rule__ActivityGroup__ActivitiesAssignment_713159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__WBSImport__ImportURIAssignment_113190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ResourcesImport__ImportURIAssignment_113221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PlanImport__ImportURIAssignment_113252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_rule__CheckPoint__DescriptionAssignment_0_013283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CheckPoint__NameAssignment_0_213314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CheckPoint__LongNameAssignment_0_4_113345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__CheckPoint__WbsDeliverableAssignment_0_5_113380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CheckPoint__EndAssignment_1_0_0_0_113415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__CheckPoint__AfterAssignment_1_0_0_1_113450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__CheckPoint__OffsetAssignment_1_0_0_1_313485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__CheckPoint__CompletenessAssignment_1_0_1_113516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__CheckPoint__DependenciesAssignment_1_0_1_4_113551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ResourceInvolvement__ResourceAssignment_013590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ResourceInvolvement__OccupationAssignment_1_113625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResponsibility_in_rule__ResourceInvolvement__ResponsibilityAssignment_2_113656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_rule__Activity__DescriptionAssignment_013687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Activity__NameAssignment_213718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Activity__LongNameAssignment_4_113749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceInvolvement_in_rule__Activity__InvolvedResourcesAssignment_5_213780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Activity__WbsActivityAssignment_6_113815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Activity__StartAssignment_7_0_0_113850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Activity__AfterAssignment_7_0_1_113885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Activity__OffsetAssignment_7_0_1_313920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Activity__EndAssignment_7_1_0_0_113951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Activity__DurationAssignment_7_1_0_1_113982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Activity__CompletenessAssignment_7_1_214013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Activity__DependenciesAssignment_7_2_114048 = new BitSet(new long[]{0x0000000000000002L});

}
