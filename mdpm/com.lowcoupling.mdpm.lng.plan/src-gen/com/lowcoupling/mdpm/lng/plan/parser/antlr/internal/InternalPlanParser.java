package com.lowcoupling.mdpm.lng.plan.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.lowcoupling.mdpm.lng.plan.services.PlanGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPlanParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ML_COMMENT", "RULE_ID", "RULE_OPENCURLY", "RULE_STRING", "RULE_CLOSEDCURLY", "RULE_INT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Program'", "'name'", "'project'", "'Project'", "'assumptions'", "'constraints'", "'-'", "'Group'", "'wbsActivity'", "'dependsOn'", "'wbs'", "'resources'", "'plan'", "'.'", "';'", "'CheckPoint'", "'wbsDeliverable'", "'date'", "'after'", "'offset'", "'completeness'", "'%'", "'at'", "'as'", "'Activity'", "'involves'", "'starts'", "'ends'", "'duration'", "'RESPONSIBLE'", "'ACCOUNTABLE'", "'CONSULTED'", "'INFORMED'"
    };
    public static final int RULE_ID=5;
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
    public static final int RULE_ML_COMMENT=4;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=7;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int RULE_CLOSEDCURLY=8;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_OPENCURLY=6;
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
    public String getGrammarFileName() { return "../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g"; }



     	private PlanGrammarAccess grammarAccess;
     	
        public InternalPlanParser(TokenStream input, PlanGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Program";	
       	}
       	
       	@Override
       	protected PlanGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleProgram"
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:68:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:69:2: (iv_ruleProgram= ruleProgram EOF )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:70:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram75);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:77:1: ruleProgram returns [EObject current=null] : ( ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? (otherlv_1= 'Program' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? ( ( (lv_plans_7_0= rulePlanImport ) ) ruleENDLINE )* (otherlv_9= 'project' ( ( ruleQualifiedName ) ) ruleENDLINE )* ( (lv_projects_12_0= ruleProject ) )* this_CLOSEDCURLY_13= RULE_CLOSEDCURLY ) ) | ( (lv_projects_14_0= ruleProject ) ) ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token lv_description_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token this_OPENCURLY_3=null;
        Token otherlv_4=null;
        Token lv_longName_5_0=null;
        Token otherlv_9=null;
        Token this_CLOSEDCURLY_13=null;
        EObject lv_plans_7_0 = null;

        EObject lv_projects_12_0 = null;

        EObject lv_projects_14_0 = null;


         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:80:28: ( ( ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? (otherlv_1= 'Program' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? ( ( (lv_plans_7_0= rulePlanImport ) ) ruleENDLINE )* (otherlv_9= 'project' ( ( ruleQualifiedName ) ) ruleENDLINE )* ( (lv_projects_12_0= ruleProject ) )* this_CLOSEDCURLY_13= RULE_CLOSEDCURLY ) ) | ( (lv_projects_14_0= ruleProject ) ) ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:81:1: ( ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? (otherlv_1= 'Program' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? ( ( (lv_plans_7_0= rulePlanImport ) ) ruleENDLINE )* (otherlv_9= 'project' ( ( ruleQualifiedName ) ) ruleENDLINE )* ( (lv_projects_12_0= ruleProject ) )* this_CLOSEDCURLY_13= RULE_CLOSEDCURLY ) ) | ( (lv_projects_14_0= ruleProject ) ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:81:1: ( ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? (otherlv_1= 'Program' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? ( ( (lv_plans_7_0= rulePlanImport ) ) ruleENDLINE )* (otherlv_9= 'project' ( ( ruleQualifiedName ) ) ruleENDLINE )* ( (lv_projects_12_0= ruleProject ) )* this_CLOSEDCURLY_13= RULE_CLOSEDCURLY ) ) | ( (lv_projects_14_0= ruleProject ) ) )
            int alt6=2;
            switch ( input.LA(1) ) {
            case RULE_ML_COMMENT:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==13) ) {
                    alt6=1;
                }
                else if ( (LA6_1==16) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
                }
                break;
            case 13:
                {
                alt6=1;
                }
                break;
            case 16:
                {
                alt6=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:81:2: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? (otherlv_1= 'Program' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? ( ( (lv_plans_7_0= rulePlanImport ) ) ruleENDLINE )* (otherlv_9= 'project' ( ( ruleQualifiedName ) ) ruleENDLINE )* ( (lv_projects_12_0= ruleProject ) )* this_CLOSEDCURLY_13= RULE_CLOSEDCURLY ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:81:2: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? (otherlv_1= 'Program' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? ( ( (lv_plans_7_0= rulePlanImport ) ) ruleENDLINE )* (otherlv_9= 'project' ( ( ruleQualifiedName ) ) ruleENDLINE )* ( (lv_projects_12_0= ruleProject ) )* this_CLOSEDCURLY_13= RULE_CLOSEDCURLY ) )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:81:3: ( (lv_description_0_0= RULE_ML_COMMENT ) )? (otherlv_1= 'Program' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? ( ( (lv_plans_7_0= rulePlanImport ) ) ruleENDLINE )* (otherlv_9= 'project' ( ( ruleQualifiedName ) ) ruleENDLINE )* ( (lv_projects_12_0= ruleProject ) )* this_CLOSEDCURLY_13= RULE_CLOSEDCURLY )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:81:3: ( (lv_description_0_0= RULE_ML_COMMENT ) )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==RULE_ML_COMMENT) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:82:1: (lv_description_0_0= RULE_ML_COMMENT )
                            {
                            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:82:1: (lv_description_0_0= RULE_ML_COMMENT )
                            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:83:3: lv_description_0_0= RULE_ML_COMMENT
                            {
                            lv_description_0_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_ruleProgram128); 

                            			newLeafNode(lv_description_0_0, grammarAccess.getProgramAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getProgramRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"description",
                                    		lv_description_0_0, 
                                    		"ML_COMMENT");
                            	    

                            }


                            }
                            break;

                    }

                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:99:3: (otherlv_1= 'Program' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? ( ( (lv_plans_7_0= rulePlanImport ) ) ruleENDLINE )* (otherlv_9= 'project' ( ( ruleQualifiedName ) ) ruleENDLINE )* ( (lv_projects_12_0= ruleProject ) )* this_CLOSEDCURLY_13= RULE_CLOSEDCURLY )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:99:5: otherlv_1= 'Program' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? ( ( (lv_plans_7_0= rulePlanImport ) ) ruleENDLINE )* (otherlv_9= 'project' ( ( ruleQualifiedName ) ) ruleENDLINE )* ( (lv_projects_12_0= ruleProject ) )* this_CLOSEDCURLY_13= RULE_CLOSEDCURLY
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleProgram147); 

                        	newLeafNode(otherlv_1, grammarAccess.getProgramAccess().getProgramKeyword_0_1_0());
                        
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:103:1: ( (lv_name_2_0= RULE_ID ) )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:104:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:104:1: (lv_name_2_0= RULE_ID )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:105:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProgram164); 

                    			newLeafNode(lv_name_2_0, grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_0_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProgramRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_2_0, 
                            		"ID");
                    	    

                    }


                    }

                    this_OPENCURLY_3=(Token)match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_ruleProgram180); 
                     
                        newLeafNode(this_OPENCURLY_3, grammarAccess.getProgramAccess().getOPENCURLYTerminalRuleCall_0_1_2()); 
                        
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:125:1: (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==14) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:125:3: otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE
                            {
                            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleProgram192); 

                                	newLeafNode(otherlv_4, grammarAccess.getProgramAccess().getNameKeyword_0_1_3_0());
                                
                            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:129:1: ( (lv_longName_5_0= RULE_STRING ) )
                            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:130:1: (lv_longName_5_0= RULE_STRING )
                            {
                            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:130:1: (lv_longName_5_0= RULE_STRING )
                            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:131:3: lv_longName_5_0= RULE_STRING
                            {
                            lv_longName_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProgram209); 

                            			newLeafNode(lv_longName_5_0, grammarAccess.getProgramAccess().getLongNameSTRINGTerminalRuleCall_0_1_3_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getProgramRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"longName",
                                    		lv_longName_5_0, 
                                    		"STRING");
                            	    

                            }


                            }

                             
                                    newCompositeNode(grammarAccess.getProgramAccess().getENDLINEParserRuleCall_0_1_3_2()); 
                                
                            pushFollow(FOLLOW_ruleENDLINE_in_ruleProgram230);
                            ruleENDLINE();

                            state._fsp--;

                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:155:3: ( ( (lv_plans_7_0= rulePlanImport ) ) ruleENDLINE )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==25) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:155:4: ( (lv_plans_7_0= rulePlanImport ) ) ruleENDLINE
                    	    {
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:155:4: ( (lv_plans_7_0= rulePlanImport ) )
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:156:1: (lv_plans_7_0= rulePlanImport )
                    	    {
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:156:1: (lv_plans_7_0= rulePlanImport )
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:157:3: lv_plans_7_0= rulePlanImport
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProgramAccess().getPlansPlanImportParserRuleCall_0_1_4_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePlanImport_in_ruleProgram253);
                    	    lv_plans_7_0=rulePlanImport();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProgramRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"plans",
                    	            		lv_plans_7_0, 
                    	            		"PlanImport");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	     
                    	            newCompositeNode(grammarAccess.getProgramAccess().getENDLINEParserRuleCall_0_1_4_1()); 
                    	        
                    	    pushFollow(FOLLOW_ruleENDLINE_in_ruleProgram269);
                    	    ruleENDLINE();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:181:3: (otherlv_9= 'project' ( ( ruleQualifiedName ) ) ruleENDLINE )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==15) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:181:5: otherlv_9= 'project' ( ( ruleQualifiedName ) ) ruleENDLINE
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleProgram283); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getProgramAccess().getProjectKeyword_0_1_5_0());
                    	        
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:185:1: ( ( ruleQualifiedName ) )
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:186:1: ( ruleQualifiedName )
                    	    {
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:186:1: ( ruleQualifiedName )
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:187:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getProgramRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getProgramAccess().getReferencedProjectsProjectCrossReference_0_1_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleProgram306);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	     
                    	            newCompositeNode(grammarAccess.getProgramAccess().getENDLINEParserRuleCall_0_1_5_2()); 
                    	        
                    	    pushFollow(FOLLOW_ruleENDLINE_in_ruleProgram322);
                    	    ruleENDLINE();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:208:3: ( (lv_projects_12_0= ruleProject ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_ML_COMMENT||LA5_0==16) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:209:1: (lv_projects_12_0= ruleProject )
                    	    {
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:209:1: (lv_projects_12_0= ruleProject )
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:210:3: lv_projects_12_0= ruleProject
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProgramAccess().getProjectsProjectParserRuleCall_0_1_6_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleProject_in_ruleProgram344);
                    	    lv_projects_12_0=ruleProject();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProgramRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"projects",
                    	            		lv_projects_12_0, 
                    	            		"Project");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    this_CLOSEDCURLY_13=(Token)match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_ruleProgram356); 
                     
                        newLeafNode(this_CLOSEDCURLY_13, grammarAccess.getProgramAccess().getCLOSEDCURLYTerminalRuleCall_0_1_7()); 
                        

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:231:6: ( (lv_projects_14_0= ruleProject ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:231:6: ( (lv_projects_14_0= ruleProject ) )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:232:1: (lv_projects_14_0= ruleProject )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:232:1: (lv_projects_14_0= ruleProject )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:233:3: lv_projects_14_0= ruleProject
                    {
                     
                    	        newCompositeNode(grammarAccess.getProgramAccess().getProjectsProjectParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProject_in_ruleProgram384);
                    lv_projects_14_0=ruleProject();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProgramRule());
                    	        }
                           		add(
                           			current, 
                           			"projects",
                            		lv_projects_14_0, 
                            		"Project");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleProject"
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:257:1: entryRuleProject returns [EObject current=null] : iv_ruleProject= ruleProject EOF ;
    public final EObject entryRuleProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProject = null;


        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:258:2: (iv_ruleProject= ruleProject EOF )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:259:2: iv_ruleProject= ruleProject EOF
            {
             newCompositeNode(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_ruleProject_in_entryRuleProject420);
            iv_ruleProject=ruleProject();

            state._fsp--;

             current =iv_ruleProject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProject430); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:266:1: ruleProject returns [EObject current=null] : ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Project' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? ( ( (lv_wbs_7_0= ruleWBSImport ) ) otherlv_8= 'project' ( ( ruleQualifiedName ) ) ruleENDLINE )? ( ( (lv_resources_11_0= ruleResourcesImport ) ) ruleENDLINE )? ( ( (lv_plans_13_0= rulePlanImport ) ) ruleENDLINE )* (otherlv_15= 'assumptions' this_OPENCURLY_16= RULE_OPENCURLY ( (lv_assumptions_17_0= ruleAssumption ) )* this_CLOSEDCURLY_18= RULE_CLOSEDCURLY )? (otherlv_19= 'constraints' this_OPENCURLY_20= RULE_OPENCURLY ( (lv_constraints_21_0= ruleConstraint ) )* this_CLOSEDCURLY_22= RULE_CLOSEDCURLY )? ( (lv_activities_23_0= ruleActivityElement ) )* this_CLOSEDCURLY_24= RULE_CLOSEDCURLY ) ;
    public final EObject ruleProject() throws RecognitionException {
        EObject current = null;

        Token lv_description_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token this_OPENCURLY_3=null;
        Token otherlv_4=null;
        Token lv_longName_5_0=null;
        Token otherlv_8=null;
        Token otherlv_15=null;
        Token this_OPENCURLY_16=null;
        Token this_CLOSEDCURLY_18=null;
        Token otherlv_19=null;
        Token this_OPENCURLY_20=null;
        Token this_CLOSEDCURLY_22=null;
        Token this_CLOSEDCURLY_24=null;
        EObject lv_wbs_7_0 = null;

        EObject lv_resources_11_0 = null;

        EObject lv_plans_13_0 = null;

        EObject lv_assumptions_17_0 = null;

        EObject lv_constraints_21_0 = null;

        EObject lv_activities_23_0 = null;


         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:269:28: ( ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Project' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? ( ( (lv_wbs_7_0= ruleWBSImport ) ) otherlv_8= 'project' ( ( ruleQualifiedName ) ) ruleENDLINE )? ( ( (lv_resources_11_0= ruleResourcesImport ) ) ruleENDLINE )? ( ( (lv_plans_13_0= rulePlanImport ) ) ruleENDLINE )* (otherlv_15= 'assumptions' this_OPENCURLY_16= RULE_OPENCURLY ( (lv_assumptions_17_0= ruleAssumption ) )* this_CLOSEDCURLY_18= RULE_CLOSEDCURLY )? (otherlv_19= 'constraints' this_OPENCURLY_20= RULE_OPENCURLY ( (lv_constraints_21_0= ruleConstraint ) )* this_CLOSEDCURLY_22= RULE_CLOSEDCURLY )? ( (lv_activities_23_0= ruleActivityElement ) )* this_CLOSEDCURLY_24= RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:270:1: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Project' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? ( ( (lv_wbs_7_0= ruleWBSImport ) ) otherlv_8= 'project' ( ( ruleQualifiedName ) ) ruleENDLINE )? ( ( (lv_resources_11_0= ruleResourcesImport ) ) ruleENDLINE )? ( ( (lv_plans_13_0= rulePlanImport ) ) ruleENDLINE )* (otherlv_15= 'assumptions' this_OPENCURLY_16= RULE_OPENCURLY ( (lv_assumptions_17_0= ruleAssumption ) )* this_CLOSEDCURLY_18= RULE_CLOSEDCURLY )? (otherlv_19= 'constraints' this_OPENCURLY_20= RULE_OPENCURLY ( (lv_constraints_21_0= ruleConstraint ) )* this_CLOSEDCURLY_22= RULE_CLOSEDCURLY )? ( (lv_activities_23_0= ruleActivityElement ) )* this_CLOSEDCURLY_24= RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:270:1: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Project' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? ( ( (lv_wbs_7_0= ruleWBSImport ) ) otherlv_8= 'project' ( ( ruleQualifiedName ) ) ruleENDLINE )? ( ( (lv_resources_11_0= ruleResourcesImport ) ) ruleENDLINE )? ( ( (lv_plans_13_0= rulePlanImport ) ) ruleENDLINE )* (otherlv_15= 'assumptions' this_OPENCURLY_16= RULE_OPENCURLY ( (lv_assumptions_17_0= ruleAssumption ) )* this_CLOSEDCURLY_18= RULE_CLOSEDCURLY )? (otherlv_19= 'constraints' this_OPENCURLY_20= RULE_OPENCURLY ( (lv_constraints_21_0= ruleConstraint ) )* this_CLOSEDCURLY_22= RULE_CLOSEDCURLY )? ( (lv_activities_23_0= ruleActivityElement ) )* this_CLOSEDCURLY_24= RULE_CLOSEDCURLY )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:270:2: ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Project' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? ( ( (lv_wbs_7_0= ruleWBSImport ) ) otherlv_8= 'project' ( ( ruleQualifiedName ) ) ruleENDLINE )? ( ( (lv_resources_11_0= ruleResourcesImport ) ) ruleENDLINE )? ( ( (lv_plans_13_0= rulePlanImport ) ) ruleENDLINE )* (otherlv_15= 'assumptions' this_OPENCURLY_16= RULE_OPENCURLY ( (lv_assumptions_17_0= ruleAssumption ) )* this_CLOSEDCURLY_18= RULE_CLOSEDCURLY )? (otherlv_19= 'constraints' this_OPENCURLY_20= RULE_OPENCURLY ( (lv_constraints_21_0= ruleConstraint ) )* this_CLOSEDCURLY_22= RULE_CLOSEDCURLY )? ( (lv_activities_23_0= ruleActivityElement ) )* this_CLOSEDCURLY_24= RULE_CLOSEDCURLY
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:270:2: ( (lv_description_0_0= RULE_ML_COMMENT ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ML_COMMENT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:271:1: (lv_description_0_0= RULE_ML_COMMENT )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:271:1: (lv_description_0_0= RULE_ML_COMMENT )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:272:3: lv_description_0_0= RULE_ML_COMMENT
                    {
                    lv_description_0_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_ruleProject472); 

                    			newLeafNode(lv_description_0_0, grammarAccess.getProjectAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProjectRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_0_0, 
                            		"ML_COMMENT");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleProject490); 

                	newLeafNode(otherlv_1, grammarAccess.getProjectAccess().getProjectKeyword_1());
                
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:292:1: ( (lv_name_2_0= RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:293:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:293:1: (lv_name_2_0= RULE_ID )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:294:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProject507); 

            			newLeafNode(lv_name_2_0, grammarAccess.getProjectAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProjectRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            this_OPENCURLY_3=(Token)match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_ruleProject523); 
             
                newLeafNode(this_OPENCURLY_3, grammarAccess.getProjectAccess().getOPENCURLYTerminalRuleCall_3()); 
                
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:314:1: (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:314:3: otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleProject535); 

                        	newLeafNode(otherlv_4, grammarAccess.getProjectAccess().getNameKeyword_4_0());
                        
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:318:1: ( (lv_longName_5_0= RULE_STRING ) )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:319:1: (lv_longName_5_0= RULE_STRING )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:319:1: (lv_longName_5_0= RULE_STRING )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:320:3: lv_longName_5_0= RULE_STRING
                    {
                    lv_longName_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProject552); 

                    			newLeafNode(lv_longName_5_0, grammarAccess.getProjectAccess().getLongNameSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProjectRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"longName",
                            		lv_longName_5_0, 
                            		"STRING");
                    	    

                    }


                    }

                     
                            newCompositeNode(grammarAccess.getProjectAccess().getENDLINEParserRuleCall_4_2()); 
                        
                    pushFollow(FOLLOW_ruleENDLINE_in_ruleProject573);
                    ruleENDLINE();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:344:3: ( ( (lv_wbs_7_0= ruleWBSImport ) ) otherlv_8= 'project' ( ( ruleQualifiedName ) ) ruleENDLINE )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:344:4: ( (lv_wbs_7_0= ruleWBSImport ) ) otherlv_8= 'project' ( ( ruleQualifiedName ) ) ruleENDLINE
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:344:4: ( (lv_wbs_7_0= ruleWBSImport ) )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:345:1: (lv_wbs_7_0= ruleWBSImport )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:345:1: (lv_wbs_7_0= ruleWBSImport )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:346:3: lv_wbs_7_0= ruleWBSImport
                    {
                     
                    	        newCompositeNode(grammarAccess.getProjectAccess().getWbsWBSImportParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleWBSImport_in_ruleProject596);
                    lv_wbs_7_0=ruleWBSImport();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProjectRule());
                    	        }
                           		set(
                           			current, 
                           			"wbs",
                            		lv_wbs_7_0, 
                            		"WBSImport");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleProject608); 

                        	newLeafNode(otherlv_8, grammarAccess.getProjectAccess().getProjectKeyword_5_1());
                        
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:366:1: ( ( ruleQualifiedName ) )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:367:1: ( ruleQualifiedName )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:367:1: ( ruleQualifiedName )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:368:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getProjectRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getProjectAccess().getWbsProjectWBSProjectCrossReference_5_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleProject631);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                     
                            newCompositeNode(grammarAccess.getProjectAccess().getENDLINEParserRuleCall_5_3()); 
                        
                    pushFollow(FOLLOW_ruleENDLINE_in_ruleProject647);
                    ruleENDLINE();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:389:3: ( ( (lv_resources_11_0= ruleResourcesImport ) ) ruleENDLINE )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:389:4: ( (lv_resources_11_0= ruleResourcesImport ) ) ruleENDLINE
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:389:4: ( (lv_resources_11_0= ruleResourcesImport ) )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:390:1: (lv_resources_11_0= ruleResourcesImport )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:390:1: (lv_resources_11_0= ruleResourcesImport )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:391:3: lv_resources_11_0= ruleResourcesImport
                    {
                     
                    	        newCompositeNode(grammarAccess.getProjectAccess().getResourcesResourcesImportParserRuleCall_6_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleResourcesImport_in_ruleProject670);
                    lv_resources_11_0=ruleResourcesImport();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProjectRule());
                    	        }
                           		set(
                           			current, 
                           			"resources",
                            		lv_resources_11_0, 
                            		"ResourcesImport");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                     
                            newCompositeNode(grammarAccess.getProjectAccess().getENDLINEParserRuleCall_6_1()); 
                        
                    pushFollow(FOLLOW_ruleENDLINE_in_ruleProject686);
                    ruleENDLINE();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:415:3: ( ( (lv_plans_13_0= rulePlanImport ) ) ruleENDLINE )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==25) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:415:4: ( (lv_plans_13_0= rulePlanImport ) ) ruleENDLINE
            	    {
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:415:4: ( (lv_plans_13_0= rulePlanImport ) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:416:1: (lv_plans_13_0= rulePlanImport )
            	    {
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:416:1: (lv_plans_13_0= rulePlanImport )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:417:3: lv_plans_13_0= rulePlanImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProjectAccess().getPlansPlanImportParserRuleCall_7_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePlanImport_in_ruleProject709);
            	    lv_plans_13_0=rulePlanImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"plans",
            	            		lv_plans_13_0, 
            	            		"PlanImport");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	     
            	            newCompositeNode(grammarAccess.getProjectAccess().getENDLINEParserRuleCall_7_1()); 
            	        
            	    pushFollow(FOLLOW_ruleENDLINE_in_ruleProject725);
            	    ruleENDLINE();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:441:3: (otherlv_15= 'assumptions' this_OPENCURLY_16= RULE_OPENCURLY ( (lv_assumptions_17_0= ruleAssumption ) )* this_CLOSEDCURLY_18= RULE_CLOSEDCURLY )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==17) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:441:5: otherlv_15= 'assumptions' this_OPENCURLY_16= RULE_OPENCURLY ( (lv_assumptions_17_0= ruleAssumption ) )* this_CLOSEDCURLY_18= RULE_CLOSEDCURLY
                    {
                    otherlv_15=(Token)match(input,17,FOLLOW_17_in_ruleProject739); 

                        	newLeafNode(otherlv_15, grammarAccess.getProjectAccess().getAssumptionsKeyword_8_0());
                        
                    this_OPENCURLY_16=(Token)match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_ruleProject750); 
                     
                        newLeafNode(this_OPENCURLY_16, grammarAccess.getProjectAccess().getOPENCURLYTerminalRuleCall_8_1()); 
                        
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:449:1: ( (lv_assumptions_17_0= ruleAssumption ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==19) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:450:1: (lv_assumptions_17_0= ruleAssumption )
                    	    {
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:450:1: (lv_assumptions_17_0= ruleAssumption )
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:451:3: lv_assumptions_17_0= ruleAssumption
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProjectAccess().getAssumptionsAssumptionParserRuleCall_8_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAssumption_in_ruleProject770);
                    	    lv_assumptions_17_0=ruleAssumption();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProjectRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"assumptions",
                    	            		lv_assumptions_17_0, 
                    	            		"Assumption");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    this_CLOSEDCURLY_18=(Token)match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_ruleProject782); 
                     
                        newLeafNode(this_CLOSEDCURLY_18, grammarAccess.getProjectAccess().getCLOSEDCURLYTerminalRuleCall_8_3()); 
                        

                    }
                    break;

            }

            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:471:3: (otherlv_19= 'constraints' this_OPENCURLY_20= RULE_OPENCURLY ( (lv_constraints_21_0= ruleConstraint ) )* this_CLOSEDCURLY_22= RULE_CLOSEDCURLY )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:471:5: otherlv_19= 'constraints' this_OPENCURLY_20= RULE_OPENCURLY ( (lv_constraints_21_0= ruleConstraint ) )* this_CLOSEDCURLY_22= RULE_CLOSEDCURLY
                    {
                    otherlv_19=(Token)match(input,18,FOLLOW_18_in_ruleProject796); 

                        	newLeafNode(otherlv_19, grammarAccess.getProjectAccess().getConstraintsKeyword_9_0());
                        
                    this_OPENCURLY_20=(Token)match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_ruleProject807); 
                     
                        newLeafNode(this_OPENCURLY_20, grammarAccess.getProjectAccess().getOPENCURLYTerminalRuleCall_9_1()); 
                        
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:479:1: ( (lv_constraints_21_0= ruleConstraint ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==19) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:480:1: (lv_constraints_21_0= ruleConstraint )
                    	    {
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:480:1: (lv_constraints_21_0= ruleConstraint )
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:481:3: lv_constraints_21_0= ruleConstraint
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProjectAccess().getConstraintsConstraintParserRuleCall_9_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleConstraint_in_ruleProject827);
                    	    lv_constraints_21_0=ruleConstraint();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProjectRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"constraints",
                    	            		lv_constraints_21_0, 
                    	            		"Constraint");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    this_CLOSEDCURLY_22=(Token)match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_ruleProject839); 
                     
                        newLeafNode(this_CLOSEDCURLY_22, grammarAccess.getProjectAccess().getCLOSEDCURLYTerminalRuleCall_9_3()); 
                        

                    }
                    break;

            }

            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:501:3: ( (lv_activities_23_0= ruleActivityElement ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ML_COMMENT||LA16_0==20||LA16_0==28||(LA16_0>=30 && LA16_0<=31)||LA16_0==33||LA16_0==37) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:502:1: (lv_activities_23_0= ruleActivityElement )
            	    {
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:502:1: (lv_activities_23_0= ruleActivityElement )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:503:3: lv_activities_23_0= ruleActivityElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProjectAccess().getActivitiesActivityElementParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActivityElement_in_ruleProject861);
            	    lv_activities_23_0=ruleActivityElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"activities",
            	            		lv_activities_23_0, 
            	            		"ActivityElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            this_CLOSEDCURLY_24=(Token)match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_ruleProject873); 
             
                newLeafNode(this_CLOSEDCURLY_24, grammarAccess.getProjectAccess().getCLOSEDCURLYTerminalRuleCall_11()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleAssumption"
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:531:1: entryRuleAssumption returns [EObject current=null] : iv_ruleAssumption= ruleAssumption EOF ;
    public final EObject entryRuleAssumption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssumption = null;


        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:532:2: (iv_ruleAssumption= ruleAssumption EOF )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:533:2: iv_ruleAssumption= ruleAssumption EOF
            {
             newCompositeNode(grammarAccess.getAssumptionRule()); 
            pushFollow(FOLLOW_ruleAssumption_in_entryRuleAssumption908);
            iv_ruleAssumption=ruleAssumption();

            state._fsp--;

             current =iv_ruleAssumption; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssumption918); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssumption"


    // $ANTLR start "ruleAssumption"
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:540:1: ruleAssumption returns [EObject current=null] : (otherlv_0= '-' ( (lv_value_1_0= RULE_STRING ) ) ruleENDLINE ) ;
    public final EObject ruleAssumption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:543:28: ( (otherlv_0= '-' ( (lv_value_1_0= RULE_STRING ) ) ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:544:1: (otherlv_0= '-' ( (lv_value_1_0= RULE_STRING ) ) ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:544:1: (otherlv_0= '-' ( (lv_value_1_0= RULE_STRING ) ) ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:544:3: otherlv_0= '-' ( (lv_value_1_0= RULE_STRING ) ) ruleENDLINE
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleAssumption955); 

                	newLeafNode(otherlv_0, grammarAccess.getAssumptionAccess().getHyphenMinusKeyword_0());
                
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:548:1: ( (lv_value_1_0= RULE_STRING ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:549:1: (lv_value_1_0= RULE_STRING )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:549:1: (lv_value_1_0= RULE_STRING )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:550:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAssumption972); 

            			newLeafNode(lv_value_1_0, grammarAccess.getAssumptionAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAssumptionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"STRING");
            	    

            }


            }

             
                    newCompositeNode(grammarAccess.getAssumptionAccess().getENDLINEParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleENDLINE_in_ruleAssumption993);
            ruleENDLINE();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssumption"


    // $ANTLR start "entryRuleConstraint"
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:582:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:583:2: (iv_ruleConstraint= ruleConstraint EOF )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:584:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint1028);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint1038); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:591:1: ruleConstraint returns [EObject current=null] : (otherlv_0= '-' ( (lv_value_1_0= RULE_STRING ) ) ruleENDLINE ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:594:28: ( (otherlv_0= '-' ( (lv_value_1_0= RULE_STRING ) ) ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:595:1: (otherlv_0= '-' ( (lv_value_1_0= RULE_STRING ) ) ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:595:1: (otherlv_0= '-' ( (lv_value_1_0= RULE_STRING ) ) ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:595:3: otherlv_0= '-' ( (lv_value_1_0= RULE_STRING ) ) ruleENDLINE
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleConstraint1075); 

                	newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getHyphenMinusKeyword_0());
                
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:599:1: ( (lv_value_1_0= RULE_STRING ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:600:1: (lv_value_1_0= RULE_STRING )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:600:1: (lv_value_1_0= RULE_STRING )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:601:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstraint1092); 

            			newLeafNode(lv_value_1_0, grammarAccess.getConstraintAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConstraintRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"STRING");
            	    

            }


            }

             
                    newCompositeNode(grammarAccess.getConstraintAccess().getENDLINEParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleENDLINE_in_ruleConstraint1113);
            ruleENDLINE();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleActivityGroup"
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:633:1: entryRuleActivityGroup returns [EObject current=null] : iv_ruleActivityGroup= ruleActivityGroup EOF ;
    public final EObject entryRuleActivityGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityGroup = null;


        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:634:2: (iv_ruleActivityGroup= ruleActivityGroup EOF )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:635:2: iv_ruleActivityGroup= ruleActivityGroup EOF
            {
             newCompositeNode(grammarAccess.getActivityGroupRule()); 
            pushFollow(FOLLOW_ruleActivityGroup_in_entryRuleActivityGroup1148);
            iv_ruleActivityGroup=ruleActivityGroup();

            state._fsp--;

             current =iv_ruleActivityGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivityGroup1158); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActivityGroup"


    // $ANTLR start "ruleActivityGroup"
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:642:1: ruleActivityGroup returns [EObject current=null] : ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Group' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? (otherlv_7= 'wbsActivity' ( ( ruleQualifiedName ) )* ruleENDLINE )? (otherlv_10= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ( (lv_activities_13_0= ruleActivityElement ) )* this_CLOSEDCURLY_14= RULE_CLOSEDCURLY ) ;
    public final EObject ruleActivityGroup() throws RecognitionException {
        EObject current = null;

        Token lv_description_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token this_OPENCURLY_3=null;
        Token otherlv_4=null;
        Token lv_longName_5_0=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token this_CLOSEDCURLY_14=null;
        EObject lv_activities_13_0 = null;


         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:645:28: ( ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Group' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? (otherlv_7= 'wbsActivity' ( ( ruleQualifiedName ) )* ruleENDLINE )? (otherlv_10= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ( (lv_activities_13_0= ruleActivityElement ) )* this_CLOSEDCURLY_14= RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:646:1: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Group' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? (otherlv_7= 'wbsActivity' ( ( ruleQualifiedName ) )* ruleENDLINE )? (otherlv_10= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ( (lv_activities_13_0= ruleActivityElement ) )* this_CLOSEDCURLY_14= RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:646:1: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Group' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? (otherlv_7= 'wbsActivity' ( ( ruleQualifiedName ) )* ruleENDLINE )? (otherlv_10= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ( (lv_activities_13_0= ruleActivityElement ) )* this_CLOSEDCURLY_14= RULE_CLOSEDCURLY )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:646:2: ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Group' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? (otherlv_7= 'wbsActivity' ( ( ruleQualifiedName ) )* ruleENDLINE )? (otherlv_10= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ( (lv_activities_13_0= ruleActivityElement ) )* this_CLOSEDCURLY_14= RULE_CLOSEDCURLY
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:646:2: ( (lv_description_0_0= RULE_ML_COMMENT ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ML_COMMENT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:647:1: (lv_description_0_0= RULE_ML_COMMENT )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:647:1: (lv_description_0_0= RULE_ML_COMMENT )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:648:3: lv_description_0_0= RULE_ML_COMMENT
                    {
                    lv_description_0_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_ruleActivityGroup1200); 

                    			newLeafNode(lv_description_0_0, grammarAccess.getActivityGroupAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActivityGroupRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_0_0, 
                            		"ML_COMMENT");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleActivityGroup1218); 

                	newLeafNode(otherlv_1, grammarAccess.getActivityGroupAccess().getGroupKeyword_1());
                
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:668:1: ( (lv_name_2_0= RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:669:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:669:1: (lv_name_2_0= RULE_ID )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:670:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActivityGroup1235); 

            			newLeafNode(lv_name_2_0, grammarAccess.getActivityGroupAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActivityGroupRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            this_OPENCURLY_3=(Token)match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_ruleActivityGroup1251); 
             
                newLeafNode(this_OPENCURLY_3, grammarAccess.getActivityGroupAccess().getOPENCURLYTerminalRuleCall_3()); 
                
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:690:1: (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==14) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:690:3: otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleActivityGroup1263); 

                        	newLeafNode(otherlv_4, grammarAccess.getActivityGroupAccess().getNameKeyword_4_0());
                        
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:694:1: ( (lv_longName_5_0= RULE_STRING ) )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:695:1: (lv_longName_5_0= RULE_STRING )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:695:1: (lv_longName_5_0= RULE_STRING )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:696:3: lv_longName_5_0= RULE_STRING
                    {
                    lv_longName_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActivityGroup1280); 

                    			newLeafNode(lv_longName_5_0, grammarAccess.getActivityGroupAccess().getLongNameSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActivityGroupRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"longName",
                            		lv_longName_5_0, 
                            		"STRING");
                    	    

                    }


                    }

                     
                            newCompositeNode(grammarAccess.getActivityGroupAccess().getENDLINEParserRuleCall_4_2()); 
                        
                    pushFollow(FOLLOW_ruleENDLINE_in_ruleActivityGroup1301);
                    ruleENDLINE();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:720:3: (otherlv_7= 'wbsActivity' ( ( ruleQualifiedName ) )* ruleENDLINE )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==21) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:720:5: otherlv_7= 'wbsActivity' ( ( ruleQualifiedName ) )* ruleENDLINE
                    {
                    otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleActivityGroup1315); 

                        	newLeafNode(otherlv_7, grammarAccess.getActivityGroupAccess().getWbsActivityKeyword_5_0());
                        
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:724:1: ( ( ruleQualifiedName ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==RULE_ID) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:725:1: ( ruleQualifiedName )
                    	    {
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:725:1: ( ruleQualifiedName )
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:726:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getActivityGroupRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityGroupAccess().getWbsActivityWBSActivityCrossReference_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleActivityGroup1338);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                     
                            newCompositeNode(grammarAccess.getActivityGroupAccess().getENDLINEParserRuleCall_5_2()); 
                        
                    pushFollow(FOLLOW_ruleENDLINE_in_ruleActivityGroup1355);
                    ruleENDLINE();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:747:3: (otherlv_10= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==22) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:747:5: otherlv_10= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE
                    {
                    otherlv_10=(Token)match(input,22,FOLLOW_22_in_ruleActivityGroup1369); 

                        	newLeafNode(otherlv_10, grammarAccess.getActivityGroupAccess().getDependsOnKeyword_6_0());
                        
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:751:1: ( ( ruleQualifiedName ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==RULE_ID) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:752:1: ( ruleQualifiedName )
                    	    {
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:752:1: ( ruleQualifiedName )
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:753:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getActivityGroupRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityGroupAccess().getDependenciesActivityElementCrossReference_6_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleActivityGroup1392);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                     
                            newCompositeNode(grammarAccess.getActivityGroupAccess().getENDLINEParserRuleCall_6_2()); 
                        
                    pushFollow(FOLLOW_ruleENDLINE_in_ruleActivityGroup1409);
                    ruleENDLINE();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:774:3: ( (lv_activities_13_0= ruleActivityElement ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ML_COMMENT||LA23_0==20||LA23_0==28||(LA23_0>=30 && LA23_0<=31)||LA23_0==33||LA23_0==37) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:775:1: (lv_activities_13_0= ruleActivityElement )
            	    {
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:775:1: (lv_activities_13_0= ruleActivityElement )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:776:3: lv_activities_13_0= ruleActivityElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActivityGroupAccess().getActivitiesActivityElementParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActivityElement_in_ruleActivityGroup1431);
            	    lv_activities_13_0=ruleActivityElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getActivityGroupRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"activities",
            	            		lv_activities_13_0, 
            	            		"ActivityElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            this_CLOSEDCURLY_14=(Token)match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_ruleActivityGroup1443); 
             
                newLeafNode(this_CLOSEDCURLY_14, grammarAccess.getActivityGroupAccess().getCLOSEDCURLYTerminalRuleCall_8()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActivityGroup"


    // $ANTLR start "entryRuleWBSImport"
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:804:1: entryRuleWBSImport returns [EObject current=null] : iv_ruleWBSImport= ruleWBSImport EOF ;
    public final EObject entryRuleWBSImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWBSImport = null;


        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:805:2: (iv_ruleWBSImport= ruleWBSImport EOF )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:806:2: iv_ruleWBSImport= ruleWBSImport EOF
            {
             newCompositeNode(grammarAccess.getWBSImportRule()); 
            pushFollow(FOLLOW_ruleWBSImport_in_entryRuleWBSImport1478);
            iv_ruleWBSImport=ruleWBSImport();

            state._fsp--;

             current =iv_ruleWBSImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWBSImport1488); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWBSImport"


    // $ANTLR start "ruleWBSImport"
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:813:1: ruleWBSImport returns [EObject current=null] : (otherlv_0= 'wbs' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleWBSImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;

         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:816:28: ( (otherlv_0= 'wbs' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:817:1: (otherlv_0= 'wbs' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:817:1: (otherlv_0= 'wbs' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:817:3: otherlv_0= 'wbs' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleWBSImport1525); 

                	newLeafNode(otherlv_0, grammarAccess.getWBSImportAccess().getWbsKeyword_0());
                
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:821:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:822:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:822:1: (lv_importURI_1_0= RULE_STRING )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:823:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWBSImport1542); 

            			newLeafNode(lv_importURI_1_0, grammarAccess.getWBSImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWBSImportRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"importURI",
                    		lv_importURI_1_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWBSImport"


    // $ANTLR start "entryRuleResourcesImport"
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:847:1: entryRuleResourcesImport returns [EObject current=null] : iv_ruleResourcesImport= ruleResourcesImport EOF ;
    public final EObject entryRuleResourcesImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourcesImport = null;


        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:848:2: (iv_ruleResourcesImport= ruleResourcesImport EOF )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:849:2: iv_ruleResourcesImport= ruleResourcesImport EOF
            {
             newCompositeNode(grammarAccess.getResourcesImportRule()); 
            pushFollow(FOLLOW_ruleResourcesImport_in_entryRuleResourcesImport1583);
            iv_ruleResourcesImport=ruleResourcesImport();

            state._fsp--;

             current =iv_ruleResourcesImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourcesImport1593); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleResourcesImport"


    // $ANTLR start "ruleResourcesImport"
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:856:1: ruleResourcesImport returns [EObject current=null] : (otherlv_0= 'resources' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleResourcesImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;

         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:859:28: ( (otherlv_0= 'resources' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:860:1: (otherlv_0= 'resources' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:860:1: (otherlv_0= 'resources' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:860:3: otherlv_0= 'resources' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleResourcesImport1630); 

                	newLeafNode(otherlv_0, grammarAccess.getResourcesImportAccess().getResourcesKeyword_0());
                
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:864:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:865:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:865:1: (lv_importURI_1_0= RULE_STRING )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:866:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResourcesImport1647); 

            			newLeafNode(lv_importURI_1_0, grammarAccess.getResourcesImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getResourcesImportRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"importURI",
                    		lv_importURI_1_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResourcesImport"


    // $ANTLR start "entryRulePlanImport"
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:890:1: entryRulePlanImport returns [EObject current=null] : iv_rulePlanImport= rulePlanImport EOF ;
    public final EObject entryRulePlanImport() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlanImport = null;


        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:891:2: (iv_rulePlanImport= rulePlanImport EOF )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:892:2: iv_rulePlanImport= rulePlanImport EOF
            {
             newCompositeNode(grammarAccess.getPlanImportRule()); 
            pushFollow(FOLLOW_rulePlanImport_in_entryRulePlanImport1688);
            iv_rulePlanImport=rulePlanImport();

            state._fsp--;

             current =iv_rulePlanImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlanImport1698); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlanImport"


    // $ANTLR start "rulePlanImport"
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:899:1: rulePlanImport returns [EObject current=null] : (otherlv_0= 'plan' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject rulePlanImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;

         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:902:28: ( (otherlv_0= 'plan' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:903:1: (otherlv_0= 'plan' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:903:1: (otherlv_0= 'plan' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:903:3: otherlv_0= 'plan' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_rulePlanImport1735); 

                	newLeafNode(otherlv_0, grammarAccess.getPlanImportAccess().getPlanKeyword_0());
                
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:907:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:908:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:908:1: (lv_importURI_1_0= RULE_STRING )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:909:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePlanImport1752); 

            			newLeafNode(lv_importURI_1_0, grammarAccess.getPlanImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPlanImportRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"importURI",
                    		lv_importURI_1_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlanImport"


    // $ANTLR start "entryRuleQualifiedName"
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:933:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:934:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:935:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1794);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1805); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:942:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:945:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:946:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:946:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:946:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1845); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:953:1: (kw= '.' this_ID_2= RULE_ID )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==26) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:954:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,26,FOLLOW_26_in_ruleQualifiedName1864); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1879); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleActivityElement"
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:976:1: entryRuleActivityElement returns [EObject current=null] : iv_ruleActivityElement= ruleActivityElement EOF ;
    public final EObject entryRuleActivityElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityElement = null;


        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:977:2: (iv_ruleActivityElement= ruleActivityElement EOF )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:978:2: iv_ruleActivityElement= ruleActivityElement EOF
            {
             newCompositeNode(grammarAccess.getActivityElementRule()); 
            pushFollow(FOLLOW_ruleActivityElement_in_entryRuleActivityElement1928);
            iv_ruleActivityElement=ruleActivityElement();

            state._fsp--;

             current =iv_ruleActivityElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivityElement1938); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActivityElement"


    // $ANTLR start "ruleActivityElement"
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:985:1: ruleActivityElement returns [EObject current=null] : (this_Activity_0= ruleActivity | this_CheckPoint_1= ruleCheckPoint | this_ActivityGroup_2= ruleActivityGroup ) ;
    public final EObject ruleActivityElement() throws RecognitionException {
        EObject current = null;

        EObject this_Activity_0 = null;

        EObject this_CheckPoint_1 = null;

        EObject this_ActivityGroup_2 = null;


         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:988:28: ( (this_Activity_0= ruleActivity | this_CheckPoint_1= ruleCheckPoint | this_ActivityGroup_2= ruleActivityGroup ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:989:1: (this_Activity_0= ruleActivity | this_CheckPoint_1= ruleCheckPoint | this_ActivityGroup_2= ruleActivityGroup )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:989:1: (this_Activity_0= ruleActivity | this_CheckPoint_1= ruleCheckPoint | this_ActivityGroup_2= ruleActivityGroup )
            int alt25=3;
            switch ( input.LA(1) ) {
            case RULE_ML_COMMENT:
                {
                switch ( input.LA(2) ) {
                case 28:
                    {
                    alt25=2;
                    }
                    break;
                case 20:
                    {
                    alt25=3;
                    }
                    break;
                case 37:
                    {
                    alt25=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }

                }
                break;
            case 37:
                {
                alt25=1;
                }
                break;
            case 28:
            case 30:
            case 31:
            case 33:
                {
                alt25=2;
                }
                break;
            case 20:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:990:5: this_Activity_0= ruleActivity
                    {
                     
                            newCompositeNode(grammarAccess.getActivityElementAccess().getActivityParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleActivity_in_ruleActivityElement1985);
                    this_Activity_0=ruleActivity();

                    state._fsp--;

                     
                            current = this_Activity_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1000:5: this_CheckPoint_1= ruleCheckPoint
                    {
                     
                            newCompositeNode(grammarAccess.getActivityElementAccess().getCheckPointParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCheckPoint_in_ruleActivityElement2012);
                    this_CheckPoint_1=ruleCheckPoint();

                    state._fsp--;

                     
                            current = this_CheckPoint_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1010:5: this_ActivityGroup_2= ruleActivityGroup
                    {
                     
                            newCompositeNode(grammarAccess.getActivityElementAccess().getActivityGroupParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleActivityGroup_in_ruleActivityElement2039);
                    this_ActivityGroup_2=ruleActivityGroup();

                    state._fsp--;

                     
                            current = this_ActivityGroup_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActivityElement"


    // $ANTLR start "entryRuleENDLINE"
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1026:1: entryRuleENDLINE returns [String current=null] : iv_ruleENDLINE= ruleENDLINE EOF ;
    public final String entryRuleENDLINE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleENDLINE = null;


        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1027:2: (iv_ruleENDLINE= ruleENDLINE EOF )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1028:2: iv_ruleENDLINE= ruleENDLINE EOF
            {
             newCompositeNode(grammarAccess.getENDLINERule()); 
            pushFollow(FOLLOW_ruleENDLINE_in_entryRuleENDLINE2075);
            iv_ruleENDLINE=ruleENDLINE();

            state._fsp--;

             current =iv_ruleENDLINE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleENDLINE2086); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleENDLINE"


    // $ANTLR start "ruleENDLINE"
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1035:1: ruleENDLINE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ';' ;
    public final AntlrDatatypeRuleToken ruleENDLINE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1038:28: (kw= ';' )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1040:2: kw= ';'
            {
            kw=(Token)match(input,27,FOLLOW_27_in_ruleENDLINE2123); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getENDLINEAccess().getSemicolonKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleENDLINE"


    // $ANTLR start "entryRuleCheckPoint"
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1053:1: entryRuleCheckPoint returns [EObject current=null] : iv_ruleCheckPoint= ruleCheckPoint EOF ;
    public final EObject entryRuleCheckPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckPoint = null;


        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1054:2: (iv_ruleCheckPoint= ruleCheckPoint EOF )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1055:2: iv_ruleCheckPoint= ruleCheckPoint EOF
            {
             newCompositeNode(grammarAccess.getCheckPointRule()); 
            pushFollow(FOLLOW_ruleCheckPoint_in_entryRuleCheckPoint2162);
            iv_ruleCheckPoint=ruleCheckPoint();

            state._fsp--;

             current =iv_ruleCheckPoint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckPoint2172); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCheckPoint"


    // $ANTLR start "ruleCheckPoint"
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1062:1: ruleCheckPoint returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_description_1_0= RULE_ML_COMMENT ) )? otherlv_2= 'CheckPoint' ( (lv_name_3_0= RULE_ID ) ) this_OPENCURLY_4= RULE_OPENCURLY (otherlv_5= 'name' ( (lv_longName_6_0= RULE_STRING ) ) ruleENDLINE )? (otherlv_8= 'wbsDeliverable' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_12= 'date' ( (lv_end_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'completeness' ( (lv_completeness_21_0= RULE_INT ) ) otherlv_22= '%' ruleENDLINE (otherlv_24= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) ) ) ) )+ {...}?) ) ) this_CLOSEDCURLY_27= RULE_CLOSEDCURLY ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleCheckPoint() throws RecognitionException {
        EObject current = null;

        Token lv_description_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token this_OPENCURLY_4=null;
        Token otherlv_5=null;
        Token lv_longName_6_0=null;
        Token otherlv_8=null;
        Token otherlv_12=null;
        Token lv_end_13_0=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token lv_offset_18_0=null;
        Token otherlv_20=null;
        Token lv_completeness_21_0=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token this_CLOSEDCURLY_27=null;

         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1065:28: ( ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_description_1_0= RULE_ML_COMMENT ) )? otherlv_2= 'CheckPoint' ( (lv_name_3_0= RULE_ID ) ) this_OPENCURLY_4= RULE_OPENCURLY (otherlv_5= 'name' ( (lv_longName_6_0= RULE_STRING ) ) ruleENDLINE )? (otherlv_8= 'wbsDeliverable' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_12= 'date' ( (lv_end_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'completeness' ( (lv_completeness_21_0= RULE_INT ) ) otherlv_22= '%' ruleENDLINE (otherlv_24= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) ) ) ) )+ {...}?) ) ) this_CLOSEDCURLY_27= RULE_CLOSEDCURLY ) ) ) ) )+ {...}?) ) ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1066:1: ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_description_1_0= RULE_ML_COMMENT ) )? otherlv_2= 'CheckPoint' ( (lv_name_3_0= RULE_ID ) ) this_OPENCURLY_4= RULE_OPENCURLY (otherlv_5= 'name' ( (lv_longName_6_0= RULE_STRING ) ) ruleENDLINE )? (otherlv_8= 'wbsDeliverable' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_12= 'date' ( (lv_end_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'completeness' ( (lv_completeness_21_0= RULE_INT ) ) otherlv_22= '%' ruleENDLINE (otherlv_24= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) ) ) ) )+ {...}?) ) ) this_CLOSEDCURLY_27= RULE_CLOSEDCURLY ) ) ) ) )+ {...}?) ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1066:1: ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_description_1_0= RULE_ML_COMMENT ) )? otherlv_2= 'CheckPoint' ( (lv_name_3_0= RULE_ID ) ) this_OPENCURLY_4= RULE_OPENCURLY (otherlv_5= 'name' ( (lv_longName_6_0= RULE_STRING ) ) ruleENDLINE )? (otherlv_8= 'wbsDeliverable' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_12= 'date' ( (lv_end_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'completeness' ( (lv_completeness_21_0= RULE_INT ) ) otherlv_22= '%' ruleENDLINE (otherlv_24= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) ) ) ) )+ {...}?) ) ) this_CLOSEDCURLY_27= RULE_CLOSEDCURLY ) ) ) ) )+ {...}?) ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1068:1: ( ( ( ({...}? => ( ({...}? => ( ( (lv_description_1_0= RULE_ML_COMMENT ) )? otherlv_2= 'CheckPoint' ( (lv_name_3_0= RULE_ID ) ) this_OPENCURLY_4= RULE_OPENCURLY (otherlv_5= 'name' ( (lv_longName_6_0= RULE_STRING ) ) ruleENDLINE )? (otherlv_8= 'wbsDeliverable' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_12= 'date' ( (lv_end_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'completeness' ( (lv_completeness_21_0= RULE_INT ) ) otherlv_22= '%' ruleENDLINE (otherlv_24= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) ) ) ) )+ {...}?) ) ) this_CLOSEDCURLY_27= RULE_CLOSEDCURLY ) ) ) ) )+ {...}?) )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1068:1: ( ( ( ({...}? => ( ({...}? => ( ( (lv_description_1_0= RULE_ML_COMMENT ) )? otherlv_2= 'CheckPoint' ( (lv_name_3_0= RULE_ID ) ) this_OPENCURLY_4= RULE_OPENCURLY (otherlv_5= 'name' ( (lv_longName_6_0= RULE_STRING ) ) ruleENDLINE )? (otherlv_8= 'wbsDeliverable' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_12= 'date' ( (lv_end_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'completeness' ( (lv_completeness_21_0= RULE_INT ) ) otherlv_22= '%' ruleENDLINE (otherlv_24= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) ) ) ) )+ {...}?) ) ) this_CLOSEDCURLY_27= RULE_CLOSEDCURLY ) ) ) ) )+ {...}?) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1069:2: ( ( ({...}? => ( ({...}? => ( ( (lv_description_1_0= RULE_ML_COMMENT ) )? otherlv_2= 'CheckPoint' ( (lv_name_3_0= RULE_ID ) ) this_OPENCURLY_4= RULE_OPENCURLY (otherlv_5= 'name' ( (lv_longName_6_0= RULE_STRING ) ) ruleENDLINE )? (otherlv_8= 'wbsDeliverable' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_12= 'date' ( (lv_end_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'completeness' ( (lv_completeness_21_0= RULE_INT ) ) otherlv_22= '%' ruleENDLINE (otherlv_24= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) ) ) ) )+ {...}?) ) ) this_CLOSEDCURLY_27= RULE_CLOSEDCURLY ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getCheckPointAccess().getUnorderedGroup());
            	
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1072:2: ( ( ({...}? => ( ({...}? => ( ( (lv_description_1_0= RULE_ML_COMMENT ) )? otherlv_2= 'CheckPoint' ( (lv_name_3_0= RULE_ID ) ) this_OPENCURLY_4= RULE_OPENCURLY (otherlv_5= 'name' ( (lv_longName_6_0= RULE_STRING ) ) ruleENDLINE )? (otherlv_8= 'wbsDeliverable' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_12= 'date' ( (lv_end_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'completeness' ( (lv_completeness_21_0= RULE_INT ) ) otherlv_22= '%' ruleENDLINE (otherlv_24= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) ) ) ) )+ {...}?) ) ) this_CLOSEDCURLY_27= RULE_CLOSEDCURLY ) ) ) ) )+ {...}?)
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1073:3: ( ({...}? => ( ({...}? => ( ( (lv_description_1_0= RULE_ML_COMMENT ) )? otherlv_2= 'CheckPoint' ( (lv_name_3_0= RULE_ID ) ) this_OPENCURLY_4= RULE_OPENCURLY (otherlv_5= 'name' ( (lv_longName_6_0= RULE_STRING ) ) ruleENDLINE )? (otherlv_8= 'wbsDeliverable' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_12= 'date' ( (lv_end_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'completeness' ( (lv_completeness_21_0= RULE_INT ) ) otherlv_22= '%' ruleENDLINE (otherlv_24= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) ) ) ) )+ {...}?) ) ) this_CLOSEDCURLY_27= RULE_CLOSEDCURLY ) ) ) ) )+ {...}?
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1073:3: ( ({...}? => ( ({...}? => ( ( (lv_description_1_0= RULE_ML_COMMENT ) )? otherlv_2= 'CheckPoint' ( (lv_name_3_0= RULE_ID ) ) this_OPENCURLY_4= RULE_OPENCURLY (otherlv_5= 'name' ( (lv_longName_6_0= RULE_STRING ) ) ruleENDLINE )? (otherlv_8= 'wbsDeliverable' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_12= 'date' ( (lv_end_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'completeness' ( (lv_completeness_21_0= RULE_INT ) ) otherlv_22= '%' ruleENDLINE (otherlv_24= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) ) ) ) )+ {...}?) ) ) this_CLOSEDCURLY_27= RULE_CLOSEDCURLY ) ) ) ) )+
            int cnt34=0;
            loop34:
            do {
                int alt34=3;
                switch ( input.LA(1) ) {
                case RULE_ML_COMMENT:
                    {
                    int LA34_2 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup(), 0) ) {
                        alt34=1;
                    }


                    }
                    break;
                case 28:
                    {
                    int LA34_3 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup(), 0) ) {
                        alt34=1;
                    }


                    }
                    break;
                case 30:
                    {
                    int LA34_4 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup(), 1) ) {
                        alt34=2;
                    }


                    }
                    break;
                case 31:
                    {
                    int LA34_5 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup(), 1) ) {
                        alt34=2;
                    }


                    }
                    break;
                case 33:
                    {
                    int LA34_6 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup(), 1) ) {
                        alt34=2;
                    }


                    }
                    break;

                }

                switch (alt34) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1075:4: ({...}? => ( ({...}? => ( ( (lv_description_1_0= RULE_ML_COMMENT ) )? otherlv_2= 'CheckPoint' ( (lv_name_3_0= RULE_ID ) ) this_OPENCURLY_4= RULE_OPENCURLY (otherlv_5= 'name' ( (lv_longName_6_0= RULE_STRING ) ) ruleENDLINE )? (otherlv_8= 'wbsDeliverable' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) ) ) )
            	    {
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1075:4: ({...}? => ( ({...}? => ( ( (lv_description_1_0= RULE_ML_COMMENT ) )? otherlv_2= 'CheckPoint' ( (lv_name_3_0= RULE_ID ) ) this_OPENCURLY_4= RULE_OPENCURLY (otherlv_5= 'name' ( (lv_longName_6_0= RULE_STRING ) ) ruleENDLINE )? (otherlv_8= 'wbsDeliverable' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) ) ) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1076:5: {...}? => ( ({...}? => ( ( (lv_description_1_0= RULE_ML_COMMENT ) )? otherlv_2= 'CheckPoint' ( (lv_name_3_0= RULE_ID ) ) this_OPENCURLY_4= RULE_OPENCURLY (otherlv_5= 'name' ( (lv_longName_6_0= RULE_STRING ) ) ruleENDLINE )? (otherlv_8= 'wbsDeliverable' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleCheckPoint", "getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup(), 0)");
            	    }
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1076:105: ( ({...}? => ( ( (lv_description_1_0= RULE_ML_COMMENT ) )? otherlv_2= 'CheckPoint' ( (lv_name_3_0= RULE_ID ) ) this_OPENCURLY_4= RULE_OPENCURLY (otherlv_5= 'name' ( (lv_longName_6_0= RULE_STRING ) ) ruleENDLINE )? (otherlv_8= 'wbsDeliverable' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) ) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1077:6: ({...}? => ( ( (lv_description_1_0= RULE_ML_COMMENT ) )? otherlv_2= 'CheckPoint' ( (lv_name_3_0= RULE_ID ) ) this_OPENCURLY_4= RULE_OPENCURLY (otherlv_5= 'name' ( (lv_longName_6_0= RULE_STRING ) ) ruleENDLINE )? (otherlv_8= 'wbsDeliverable' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCheckPointAccess().getUnorderedGroup(), 0);
            	    	 				
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1080:6: ({...}? => ( ( (lv_description_1_0= RULE_ML_COMMENT ) )? otherlv_2= 'CheckPoint' ( (lv_name_3_0= RULE_ID ) ) this_OPENCURLY_4= RULE_OPENCURLY (otherlv_5= 'name' ( (lv_longName_6_0= RULE_STRING ) ) ruleENDLINE )? (otherlv_8= 'wbsDeliverable' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1080:7: {...}? => ( ( (lv_description_1_0= RULE_ML_COMMENT ) )? otherlv_2= 'CheckPoint' ( (lv_name_3_0= RULE_ID ) ) this_OPENCURLY_4= RULE_OPENCURLY (otherlv_5= 'name' ( (lv_longName_6_0= RULE_STRING ) ) ruleENDLINE )? (otherlv_8= 'wbsDeliverable' ( ( ruleQualifiedName ) )* ruleENDLINE )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCheckPoint", "true");
            	    }
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1080:16: ( ( (lv_description_1_0= RULE_ML_COMMENT ) )? otherlv_2= 'CheckPoint' ( (lv_name_3_0= RULE_ID ) ) this_OPENCURLY_4= RULE_OPENCURLY (otherlv_5= 'name' ( (lv_longName_6_0= RULE_STRING ) ) ruleENDLINE )? (otherlv_8= 'wbsDeliverable' ( ( ruleQualifiedName ) )* ruleENDLINE )? )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1080:17: ( (lv_description_1_0= RULE_ML_COMMENT ) )? otherlv_2= 'CheckPoint' ( (lv_name_3_0= RULE_ID ) ) this_OPENCURLY_4= RULE_OPENCURLY (otherlv_5= 'name' ( (lv_longName_6_0= RULE_STRING ) ) ruleENDLINE )? (otherlv_8= 'wbsDeliverable' ( ( ruleQualifiedName ) )* ruleENDLINE )?
            	    {
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1080:17: ( (lv_description_1_0= RULE_ML_COMMENT ) )?
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==RULE_ML_COMMENT) ) {
            	        alt26=1;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1081:1: (lv_description_1_0= RULE_ML_COMMENT )
            	            {
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1081:1: (lv_description_1_0= RULE_ML_COMMENT )
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1082:3: lv_description_1_0= RULE_ML_COMMENT
            	            {
            	            lv_description_1_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_ruleCheckPoint2259); 

            	            			newLeafNode(lv_description_1_0, grammarAccess.getCheckPointAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getCheckPointRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"description",
            	                    		lv_description_1_0, 
            	                    		"ML_COMMENT");
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleCheckPoint2277); 

            	        	newLeafNode(otherlv_2, grammarAccess.getCheckPointAccess().getCheckPointKeyword_0_1());
            	        
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1102:1: ( (lv_name_3_0= RULE_ID ) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1103:1: (lv_name_3_0= RULE_ID )
            	    {
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1103:1: (lv_name_3_0= RULE_ID )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1104:3: lv_name_3_0= RULE_ID
            	    {
            	    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCheckPoint2294); 

            	    			newLeafNode(lv_name_3_0, grammarAccess.getCheckPointAccess().getNameIDTerminalRuleCall_0_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getCheckPointRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"name",
            	            		lv_name_3_0, 
            	            		"ID");
            	    	    

            	    }


            	    }

            	    this_OPENCURLY_4=(Token)match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_ruleCheckPoint2310); 
            	     
            	        newLeafNode(this_OPENCURLY_4, grammarAccess.getCheckPointAccess().getOPENCURLYTerminalRuleCall_0_3()); 
            	        
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1124:1: (otherlv_5= 'name' ( (lv_longName_6_0= RULE_STRING ) ) ruleENDLINE )?
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==14) ) {
            	        alt27=1;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1124:3: otherlv_5= 'name' ( (lv_longName_6_0= RULE_STRING ) ) ruleENDLINE
            	            {
            	            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleCheckPoint2322); 

            	                	newLeafNode(otherlv_5, grammarAccess.getCheckPointAccess().getNameKeyword_0_4_0());
            	                
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1128:1: ( (lv_longName_6_0= RULE_STRING ) )
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1129:1: (lv_longName_6_0= RULE_STRING )
            	            {
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1129:1: (lv_longName_6_0= RULE_STRING )
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1130:3: lv_longName_6_0= RULE_STRING
            	            {
            	            lv_longName_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCheckPoint2339); 

            	            			newLeafNode(lv_longName_6_0, grammarAccess.getCheckPointAccess().getLongNameSTRINGTerminalRuleCall_0_4_1_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getCheckPointRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"longName",
            	                    		lv_longName_6_0, 
            	                    		"STRING");
            	            	    

            	            }


            	            }

            	             
            	                    newCompositeNode(grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_0_4_2()); 
            	                
            	            pushFollow(FOLLOW_ruleENDLINE_in_ruleCheckPoint2360);
            	            ruleENDLINE();

            	            state._fsp--;

            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }
            	            break;

            	    }

            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1154:3: (otherlv_8= 'wbsDeliverable' ( ( ruleQualifiedName ) )* ruleENDLINE )?
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0==29) ) {
            	        alt29=1;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1154:5: otherlv_8= 'wbsDeliverable' ( ( ruleQualifiedName ) )* ruleENDLINE
            	            {
            	            otherlv_8=(Token)match(input,29,FOLLOW_29_in_ruleCheckPoint2374); 

            	                	newLeafNode(otherlv_8, grammarAccess.getCheckPointAccess().getWbsDeliverableKeyword_0_5_0());
            	                
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1158:1: ( ( ruleQualifiedName ) )*
            	            loop28:
            	            do {
            	                int alt28=2;
            	                int LA28_0 = input.LA(1);

            	                if ( (LA28_0==RULE_ID) ) {
            	                    alt28=1;
            	                }


            	                switch (alt28) {
            	            	case 1 :
            	            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1159:1: ( ruleQualifiedName )
            	            	    {
            	            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1159:1: ( ruleQualifiedName )
            	            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1160:3: ruleQualifiedName
            	            	    {

            	            	    			if (current==null) {
            	            	    	            current = createModelElement(grammarAccess.getCheckPointRule());
            	            	    	        }
            	            	            
            	            	     
            	            	    	        newCompositeNode(grammarAccess.getCheckPointAccess().getWbsDeliverableWBSDeliverableCrossReference_0_5_1_0()); 
            	            	    	    
            	            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleCheckPoint2397);
            	            	    ruleQualifiedName();

            	            	    state._fsp--;

            	            	     
            	            	    	        afterParserOrEnumRuleCall();
            	            	    	    

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop28;
            	                }
            	            } while (true);

            	             
            	                    newCompositeNode(grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_0_5_2()); 
            	                
            	            pushFollow(FOLLOW_ruleENDLINE_in_ruleCheckPoint2414);
            	            ruleENDLINE();

            	            state._fsp--;

            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCheckPointAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1188:4: ({...}? => ( ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_12= 'date' ( (lv_end_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'completeness' ( (lv_completeness_21_0= RULE_INT ) ) otherlv_22= '%' ruleENDLINE (otherlv_24= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) ) ) ) )+ {...}?) ) ) this_CLOSEDCURLY_27= RULE_CLOSEDCURLY ) ) ) )
            	    {
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1188:4: ({...}? => ( ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_12= 'date' ( (lv_end_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'completeness' ( (lv_completeness_21_0= RULE_INT ) ) otherlv_22= '%' ruleENDLINE (otherlv_24= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) ) ) ) )+ {...}?) ) ) this_CLOSEDCURLY_27= RULE_CLOSEDCURLY ) ) ) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1189:5: {...}? => ( ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_12= 'date' ( (lv_end_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'completeness' ( (lv_completeness_21_0= RULE_INT ) ) otherlv_22= '%' ruleENDLINE (otherlv_24= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) ) ) ) )+ {...}?) ) ) this_CLOSEDCURLY_27= RULE_CLOSEDCURLY ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleCheckPoint", "getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup(), 1)");
            	    }
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1189:105: ( ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_12= 'date' ( (lv_end_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'completeness' ( (lv_completeness_21_0= RULE_INT ) ) otherlv_22= '%' ruleENDLINE (otherlv_24= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) ) ) ) )+ {...}?) ) ) this_CLOSEDCURLY_27= RULE_CLOSEDCURLY ) ) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1190:6: ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_12= 'date' ( (lv_end_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'completeness' ( (lv_completeness_21_0= RULE_INT ) ) otherlv_22= '%' ruleENDLINE (otherlv_24= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) ) ) ) )+ {...}?) ) ) this_CLOSEDCURLY_27= RULE_CLOSEDCURLY ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCheckPointAccess().getUnorderedGroup(), 1);
            	    	 				
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1193:6: ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_12= 'date' ( (lv_end_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'completeness' ( (lv_completeness_21_0= RULE_INT ) ) otherlv_22= '%' ruleENDLINE (otherlv_24= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) ) ) ) )+ {...}?) ) ) this_CLOSEDCURLY_27= RULE_CLOSEDCURLY ) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1193:7: {...}? => ( ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_12= 'date' ( (lv_end_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'completeness' ( (lv_completeness_21_0= RULE_INT ) ) otherlv_22= '%' ruleENDLINE (otherlv_24= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) ) ) ) )+ {...}?) ) ) this_CLOSEDCURLY_27= RULE_CLOSEDCURLY )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCheckPoint", "true");
            	    }
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1193:16: ( ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_12= 'date' ( (lv_end_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'completeness' ( (lv_completeness_21_0= RULE_INT ) ) otherlv_22= '%' ruleENDLINE (otherlv_24= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) ) ) ) )+ {...}?) ) ) this_CLOSEDCURLY_27= RULE_CLOSEDCURLY )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1193:17: ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_12= 'date' ( (lv_end_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'completeness' ( (lv_completeness_21_0= RULE_INT ) ) otherlv_22= '%' ruleENDLINE (otherlv_24= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) ) ) ) )+ {...}?) ) ) this_CLOSEDCURLY_27= RULE_CLOSEDCURLY
            	    {
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1193:17: ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_12= 'date' ( (lv_end_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'completeness' ( (lv_completeness_21_0= RULE_INT ) ) otherlv_22= '%' ruleENDLINE (otherlv_24= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) ) ) ) )+ {...}?) ) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1195:1: ( ( ( ({...}? => ( ({...}? => ( (otherlv_12= 'date' ( (lv_end_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'completeness' ( (lv_completeness_21_0= RULE_INT ) ) otherlv_22= '%' ruleENDLINE (otherlv_24= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) ) ) ) )+ {...}?) )
            	    {
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1195:1: ( ( ( ({...}? => ( ({...}? => ( (otherlv_12= 'date' ( (lv_end_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'completeness' ( (lv_completeness_21_0= RULE_INT ) ) otherlv_22= '%' ruleENDLINE (otherlv_24= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) ) ) ) )+ {...}?) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1196:2: ( ( ({...}? => ( ({...}? => ( (otherlv_12= 'date' ( (lv_end_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'completeness' ( (lv_completeness_21_0= RULE_INT ) ) otherlv_22= '%' ruleENDLINE (otherlv_24= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) ) ) ) )+ {...}?)
            	    {
            	     
            	    	  getUnorderedGroupHelper().enter(grammarAccess.getCheckPointAccess().getUnorderedGroup_1_0());
            	    	
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1199:2: ( ( ({...}? => ( ({...}? => ( (otherlv_12= 'date' ( (lv_end_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'completeness' ( (lv_completeness_21_0= RULE_INT ) ) otherlv_22= '%' ruleENDLINE (otherlv_24= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) ) ) ) )+ {...}?)
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1200:3: ( ({...}? => ( ({...}? => ( (otherlv_12= 'date' ( (lv_end_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'completeness' ( (lv_completeness_21_0= RULE_INT ) ) otherlv_22= '%' ruleENDLINE (otherlv_24= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) ) ) ) )+ {...}?
            	    {
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1200:3: ( ({...}? => ( ({...}? => ( (otherlv_12= 'date' ( (lv_end_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'completeness' ( (lv_completeness_21_0= RULE_INT ) ) otherlv_22= '%' ruleENDLINE (otherlv_24= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) ) ) ) )+
            	    int cnt33=0;
            	    loop33:
            	    do {
            	        int alt33=3;
            	        int LA33_0 = input.LA(1);

            	        if ( LA33_0 >=30 && LA33_0<=31 && getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_1_0(), 0) ) {
            	            alt33=1;
            	        }
            	        else if ( LA33_0 ==33 && getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_1_0(), 1) ) {
            	            alt33=2;
            	        }


            	        switch (alt33) {
            	    	case 1 :
            	    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1202:4: ({...}? => ( ({...}? => ( (otherlv_12= 'date' ( (lv_end_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) ) )
            	    	    {
            	    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1202:4: ({...}? => ( ({...}? => ( (otherlv_12= 'date' ( (lv_end_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) ) )
            	    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1203:5: {...}? => ( ({...}? => ( (otherlv_12= 'date' ( (lv_end_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) )
            	    	    {
            	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_1_0(), 0) ) {
            	    	        throw new FailedPredicateException(input, "ruleCheckPoint", "getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_1_0(), 0)");
            	    	    }
            	    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1203:109: ( ({...}? => ( (otherlv_12= 'date' ( (lv_end_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) ) )
            	    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1204:6: ({...}? => ( (otherlv_12= 'date' ( (lv_end_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) )
            	    	    {
            	    	     
            	    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCheckPointAccess().getUnorderedGroup_1_0(), 0);
            	    	    	 				
            	    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1207:6: ({...}? => ( (otherlv_12= 'date' ( (lv_end_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) ) )
            	    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1207:7: {...}? => ( (otherlv_12= 'date' ( (lv_end_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleCheckPoint", "true");
            	    	    }
            	    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1207:16: ( (otherlv_12= 'date' ( (lv_end_13_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE ) )
            	    	    int alt30=2;
            	    	    int LA30_0 = input.LA(1);

            	    	    if ( (LA30_0==30) ) {
            	    	        alt30=1;
            	    	    }
            	    	    else if ( (LA30_0==31) ) {
            	    	        alt30=2;
            	    	    }
            	    	    else {
            	    	        NoViableAltException nvae =
            	    	            new NoViableAltException("", 30, 0, input);

            	    	        throw nvae;
            	    	    }
            	    	    switch (alt30) {
            	    	        case 1 :
            	    	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1207:17: (otherlv_12= 'date' ( (lv_end_13_0= RULE_STRING ) ) ruleENDLINE )
            	    	            {
            	    	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1207:17: (otherlv_12= 'date' ( (lv_end_13_0= RULE_STRING ) ) ruleENDLINE )
            	    	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1207:19: otherlv_12= 'date' ( (lv_end_13_0= RULE_STRING ) ) ruleENDLINE
            	    	            {
            	    	            otherlv_12=(Token)match(input,30,FOLLOW_30_in_ruleCheckPoint2530); 

            	    	                	newLeafNode(otherlv_12, grammarAccess.getCheckPointAccess().getDateKeyword_1_0_0_0_0());
            	    	                
            	    	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1211:1: ( (lv_end_13_0= RULE_STRING ) )
            	    	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1212:1: (lv_end_13_0= RULE_STRING )
            	    	            {
            	    	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1212:1: (lv_end_13_0= RULE_STRING )
            	    	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1213:3: lv_end_13_0= RULE_STRING
            	    	            {
            	    	            lv_end_13_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCheckPoint2547); 

            	    	            			newLeafNode(lv_end_13_0, grammarAccess.getCheckPointAccess().getEndSTRINGTerminalRuleCall_1_0_0_0_1_0()); 
            	    	            		

            	    	            	        if (current==null) {
            	    	            	            current = createModelElement(grammarAccess.getCheckPointRule());
            	    	            	        }
            	    	                   		setWithLastConsumed(
            	    	                   			current, 
            	    	                   			"end",
            	    	                    		lv_end_13_0, 
            	    	                    		"STRING");
            	    	            	    

            	    	            }


            	    	            }

            	    	             
            	    	                    newCompositeNode(grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_1_0_0_0_2()); 
            	    	                
            	    	            pushFollow(FOLLOW_ruleENDLINE_in_ruleCheckPoint2568);
            	    	            ruleENDLINE();

            	    	            state._fsp--;

            	    	             
            	    	                    afterParserOrEnumRuleCall();
            	    	                

            	    	            }


            	    	            }
            	    	            break;
            	    	        case 2 :
            	    	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1238:6: (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE )
            	    	            {
            	    	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1238:6: (otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE )
            	    	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1238:8: otherlv_15= 'after' ( ( ruleQualifiedName ) ) otherlv_17= 'offset' ( (lv_offset_18_0= RULE_INT ) ) ruleENDLINE
            	    	            {
            	    	            otherlv_15=(Token)match(input,31,FOLLOW_31_in_ruleCheckPoint2587); 

            	    	                	newLeafNode(otherlv_15, grammarAccess.getCheckPointAccess().getAfterKeyword_1_0_0_1_0());
            	    	                
            	    	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1242:1: ( ( ruleQualifiedName ) )
            	    	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1243:1: ( ruleQualifiedName )
            	    	            {
            	    	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1243:1: ( ruleQualifiedName )
            	    	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1244:3: ruleQualifiedName
            	    	            {

            	    	            			if (current==null) {
            	    	            	            current = createModelElement(grammarAccess.getCheckPointRule());
            	    	            	        }
            	    	                    
            	    	             
            	    	            	        newCompositeNode(grammarAccess.getCheckPointAccess().getAfterActivityElementCrossReference_1_0_0_1_1_0()); 
            	    	            	    
            	    	            pushFollow(FOLLOW_ruleQualifiedName_in_ruleCheckPoint2610);
            	    	            ruleQualifiedName();

            	    	            state._fsp--;

            	    	             
            	    	            	        afterParserOrEnumRuleCall();
            	    	            	    

            	    	            }


            	    	            }

            	    	            otherlv_17=(Token)match(input,32,FOLLOW_32_in_ruleCheckPoint2622); 

            	    	                	newLeafNode(otherlv_17, grammarAccess.getCheckPointAccess().getOffsetKeyword_1_0_0_1_2());
            	    	                
            	    	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1261:1: ( (lv_offset_18_0= RULE_INT ) )
            	    	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1262:1: (lv_offset_18_0= RULE_INT )
            	    	            {
            	    	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1262:1: (lv_offset_18_0= RULE_INT )
            	    	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1263:3: lv_offset_18_0= RULE_INT
            	    	            {
            	    	            lv_offset_18_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCheckPoint2639); 

            	    	            			newLeafNode(lv_offset_18_0, grammarAccess.getCheckPointAccess().getOffsetINTTerminalRuleCall_1_0_0_1_3_0()); 
            	    	            		

            	    	            	        if (current==null) {
            	    	            	            current = createModelElement(grammarAccess.getCheckPointRule());
            	    	            	        }
            	    	                   		setWithLastConsumed(
            	    	                   			current, 
            	    	                   			"offset",
            	    	                    		lv_offset_18_0, 
            	    	                    		"INT");
            	    	            	    

            	    	            }


            	    	            }

            	    	             
            	    	                    newCompositeNode(grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_1_0_0_1_4()); 
            	    	                
            	    	            pushFollow(FOLLOW_ruleENDLINE_in_ruleCheckPoint2660);
            	    	            ruleENDLINE();

            	    	            state._fsp--;

            	    	             
            	    	                    afterParserOrEnumRuleCall();
            	    	                

            	    	            }


            	    	            }
            	    	            break;

            	    	    }


            	    	    }

            	    	     
            	    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCheckPointAccess().getUnorderedGroup_1_0());
            	    	    	 				

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1294:4: ({...}? => ( ({...}? => (otherlv_20= 'completeness' ( (lv_completeness_21_0= RULE_INT ) ) otherlv_22= '%' ruleENDLINE (otherlv_24= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) ) ) )
            	    	    {
            	    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1294:4: ({...}? => ( ({...}? => (otherlv_20= 'completeness' ( (lv_completeness_21_0= RULE_INT ) ) otherlv_22= '%' ruleENDLINE (otherlv_24= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) ) ) )
            	    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1295:5: {...}? => ( ({...}? => (otherlv_20= 'completeness' ( (lv_completeness_21_0= RULE_INT ) ) otherlv_22= '%' ruleENDLINE (otherlv_24= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) ) )
            	    	    {
            	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_1_0(), 1) ) {
            	    	        throw new FailedPredicateException(input, "ruleCheckPoint", "getUnorderedGroupHelper().canSelect(grammarAccess.getCheckPointAccess().getUnorderedGroup_1_0(), 1)");
            	    	    }
            	    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1295:109: ( ({...}? => (otherlv_20= 'completeness' ( (lv_completeness_21_0= RULE_INT ) ) otherlv_22= '%' ruleENDLINE (otherlv_24= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) ) )
            	    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1296:6: ({...}? => (otherlv_20= 'completeness' ( (lv_completeness_21_0= RULE_INT ) ) otherlv_22= '%' ruleENDLINE (otherlv_24= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) )
            	    	    {
            	    	     
            	    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getCheckPointAccess().getUnorderedGroup_1_0(), 1);
            	    	    	 				
            	    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1299:6: ({...}? => (otherlv_20= 'completeness' ( (lv_completeness_21_0= RULE_INT ) ) otherlv_22= '%' ruleENDLINE (otherlv_24= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? ) )
            	    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1299:7: {...}? => (otherlv_20= 'completeness' ( (lv_completeness_21_0= RULE_INT ) ) otherlv_22= '%' ruleENDLINE (otherlv_24= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleCheckPoint", "true");
            	    	    }
            	    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1299:16: (otherlv_20= 'completeness' ( (lv_completeness_21_0= RULE_INT ) ) otherlv_22= '%' ruleENDLINE (otherlv_24= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )? )
            	    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1299:18: otherlv_20= 'completeness' ( (lv_completeness_21_0= RULE_INT ) ) otherlv_22= '%' ruleENDLINE (otherlv_24= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )?
            	    	    {
            	    	    otherlv_20=(Token)match(input,33,FOLLOW_33_in_ruleCheckPoint2728); 

            	    	        	newLeafNode(otherlv_20, grammarAccess.getCheckPointAccess().getCompletenessKeyword_1_0_1_0());
            	    	        
            	    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1303:1: ( (lv_completeness_21_0= RULE_INT ) )
            	    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1304:1: (lv_completeness_21_0= RULE_INT )
            	    	    {
            	    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1304:1: (lv_completeness_21_0= RULE_INT )
            	    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1305:3: lv_completeness_21_0= RULE_INT
            	    	    {
            	    	    lv_completeness_21_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCheckPoint2745); 

            	    	    			newLeafNode(lv_completeness_21_0, grammarAccess.getCheckPointAccess().getCompletenessINTTerminalRuleCall_1_0_1_1_0()); 
            	    	    		

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getCheckPointRule());
            	    	    	        }
            	    	           		setWithLastConsumed(
            	    	           			current, 
            	    	           			"completeness",
            	    	            		lv_completeness_21_0, 
            	    	            		"INT");
            	    	    	    

            	    	    }


            	    	    }

            	    	    otherlv_22=(Token)match(input,34,FOLLOW_34_in_ruleCheckPoint2762); 

            	    	        	newLeafNode(otherlv_22, grammarAccess.getCheckPointAccess().getPercentSignKeyword_1_0_1_2());
            	    	        
            	    	     
            	    	            newCompositeNode(grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_1_0_1_3()); 
            	    	        
            	    	    pushFollow(FOLLOW_ruleENDLINE_in_ruleCheckPoint2778);
            	    	    ruleENDLINE();

            	    	    state._fsp--;

            	    	     
            	    	            afterParserOrEnumRuleCall();
            	    	        
            	    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1333:1: (otherlv_24= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )?
            	    	    int alt32=2;
            	    	    int LA32_0 = input.LA(1);

            	    	    if ( (LA32_0==22) ) {
            	    	        alt32=1;
            	    	    }
            	    	    switch (alt32) {
            	    	        case 1 :
            	    	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1333:3: otherlv_24= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE
            	    	            {
            	    	            otherlv_24=(Token)match(input,22,FOLLOW_22_in_ruleCheckPoint2790); 

            	    	                	newLeafNode(otherlv_24, grammarAccess.getCheckPointAccess().getDependsOnKeyword_1_0_1_4_0());
            	    	                
            	    	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1337:1: ( ( ruleQualifiedName ) )*
            	    	            loop31:
            	    	            do {
            	    	                int alt31=2;
            	    	                int LA31_0 = input.LA(1);

            	    	                if ( (LA31_0==RULE_ID) ) {
            	    	                    alt31=1;
            	    	                }


            	    	                switch (alt31) {
            	    	            	case 1 :
            	    	            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1338:1: ( ruleQualifiedName )
            	    	            	    {
            	    	            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1338:1: ( ruleQualifiedName )
            	    	            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1339:3: ruleQualifiedName
            	    	            	    {

            	    	            	    			if (current==null) {
            	    	            	    	            current = createModelElement(grammarAccess.getCheckPointRule());
            	    	            	    	        }
            	    	            	            
            	    	            	     
            	    	            	    	        newCompositeNode(grammarAccess.getCheckPointAccess().getDependenciesActivityElementCrossReference_1_0_1_4_1_0()); 
            	    	            	    	    
            	    	            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleCheckPoint2813);
            	    	            	    ruleQualifiedName();

            	    	            	    state._fsp--;

            	    	            	     
            	    	            	    	        afterParserOrEnumRuleCall();
            	    	            	    	    

            	    	            	    }


            	    	            	    }
            	    	            	    break;

            	    	            	default :
            	    	            	    break loop31;
            	    	                }
            	    	            } while (true);

            	    	             
            	    	                    newCompositeNode(grammarAccess.getCheckPointAccess().getENDLINEParserRuleCall_1_0_1_4_2()); 
            	    	                
            	    	            pushFollow(FOLLOW_ruleENDLINE_in_ruleCheckPoint2830);
            	    	            ruleENDLINE();

            	    	            state._fsp--;

            	    	             
            	    	                    afterParserOrEnumRuleCall();
            	    	                

            	    	            }
            	    	            break;

            	    	    }


            	    	    }


            	    	    }

            	    	     
            	    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCheckPointAccess().getUnorderedGroup_1_0());
            	    	    	 				

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt33 >= 1 ) break loop33;
            	                EarlyExitException eee =
            	                    new EarlyExitException(33, input);
            	                throw eee;
            	        }
            	        cnt33++;
            	    } while (true);

            	    if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getCheckPointAccess().getUnorderedGroup_1_0()) ) {
            	        throw new FailedPredicateException(input, "ruleCheckPoint", "getUnorderedGroupHelper().canLeave(grammarAccess.getCheckPointAccess().getUnorderedGroup_1_0())");
            	    }

            	    }


            	    }

            	     
            	    	  getUnorderedGroupHelper().leave(grammarAccess.getCheckPointAccess().getUnorderedGroup_1_0());
            	    	

            	    }

            	    this_CLOSEDCURLY_27=(Token)match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_ruleCheckPoint2889); 
            	     
            	        newLeafNode(this_CLOSEDCURLY_27, grammarAccess.getCheckPointAccess().getCLOSEDCURLYTerminalRuleCall_1_1()); 
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCheckPointAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt34 >= 1 ) break loop34;
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getCheckPointAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleCheckPoint", "getUnorderedGroupHelper().canLeave(grammarAccess.getCheckPointAccess().getUnorderedGroup())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getCheckPointAccess().getUnorderedGroup());
            	

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCheckPoint"


    // $ANTLR start "entryRuleResourceInvolvement"
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1402:1: entryRuleResourceInvolvement returns [EObject current=null] : iv_ruleResourceInvolvement= ruleResourceInvolvement EOF ;
    public final EObject entryRuleResourceInvolvement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceInvolvement = null;


        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1403:2: (iv_ruleResourceInvolvement= ruleResourceInvolvement EOF )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1404:2: iv_ruleResourceInvolvement= ruleResourceInvolvement EOF
            {
             newCompositeNode(grammarAccess.getResourceInvolvementRule()); 
            pushFollow(FOLLOW_ruleResourceInvolvement_in_entryRuleResourceInvolvement2970);
            iv_ruleResourceInvolvement=ruleResourceInvolvement();

            state._fsp--;

             current =iv_ruleResourceInvolvement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceInvolvement2980); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleResourceInvolvement"


    // $ANTLR start "ruleResourceInvolvement"
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1411:1: ruleResourceInvolvement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'at' ( (lv_occupation_2_0= RULE_INT ) ) otherlv_3= '%' )? (otherlv_4= 'as' ( (lv_responsibility_5_0= ruleResponsibility ) ) )? ruleENDLINE ) ;
    public final EObject ruleResourceInvolvement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_occupation_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Enumerator lv_responsibility_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1414:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'at' ( (lv_occupation_2_0= RULE_INT ) ) otherlv_3= '%' )? (otherlv_4= 'as' ( (lv_responsibility_5_0= ruleResponsibility ) ) )? ruleENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1415:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'at' ( (lv_occupation_2_0= RULE_INT ) ) otherlv_3= '%' )? (otherlv_4= 'as' ( (lv_responsibility_5_0= ruleResponsibility ) ) )? ruleENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1415:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'at' ( (lv_occupation_2_0= RULE_INT ) ) otherlv_3= '%' )? (otherlv_4= 'as' ( (lv_responsibility_5_0= ruleResponsibility ) ) )? ruleENDLINE )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1415:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'at' ( (lv_occupation_2_0= RULE_INT ) ) otherlv_3= '%' )? (otherlv_4= 'as' ( (lv_responsibility_5_0= ruleResponsibility ) ) )? ruleENDLINE
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1415:2: ( (otherlv_0= RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1416:1: (otherlv_0= RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1416:1: (otherlv_0= RULE_ID )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1417:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getResourceInvolvementRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResourceInvolvement3025); 

            		newLeafNode(otherlv_0, grammarAccess.getResourceInvolvementAccess().getResourceResourceCrossReference_0_0()); 
            	

            }


            }

            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1428:2: (otherlv_1= 'at' ( (lv_occupation_2_0= RULE_INT ) ) otherlv_3= '%' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==35) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1428:4: otherlv_1= 'at' ( (lv_occupation_2_0= RULE_INT ) ) otherlv_3= '%'
                    {
                    otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleResourceInvolvement3038); 

                        	newLeafNode(otherlv_1, grammarAccess.getResourceInvolvementAccess().getAtKeyword_1_0());
                        
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1432:1: ( (lv_occupation_2_0= RULE_INT ) )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1433:1: (lv_occupation_2_0= RULE_INT )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1433:1: (lv_occupation_2_0= RULE_INT )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1434:3: lv_occupation_2_0= RULE_INT
                    {
                    lv_occupation_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleResourceInvolvement3055); 

                    			newLeafNode(lv_occupation_2_0, grammarAccess.getResourceInvolvementAccess().getOccupationINTTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getResourceInvolvementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"occupation",
                            		lv_occupation_2_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,34,FOLLOW_34_in_ruleResourceInvolvement3072); 

                        	newLeafNode(otherlv_3, grammarAccess.getResourceInvolvementAccess().getPercentSignKeyword_1_2());
                        

                    }
                    break;

            }

            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1454:3: (otherlv_4= 'as' ( (lv_responsibility_5_0= ruleResponsibility ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==36) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1454:5: otherlv_4= 'as' ( (lv_responsibility_5_0= ruleResponsibility ) )
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_36_in_ruleResourceInvolvement3087); 

                        	newLeafNode(otherlv_4, grammarAccess.getResourceInvolvementAccess().getAsKeyword_2_0());
                        
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1458:1: ( (lv_responsibility_5_0= ruleResponsibility ) )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1459:1: (lv_responsibility_5_0= ruleResponsibility )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1459:1: (lv_responsibility_5_0= ruleResponsibility )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1460:3: lv_responsibility_5_0= ruleResponsibility
                    {
                     
                    	        newCompositeNode(grammarAccess.getResourceInvolvementAccess().getResponsibilityResponsibilityEnumRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleResponsibility_in_ruleResourceInvolvement3108);
                    lv_responsibility_5_0=ruleResponsibility();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getResourceInvolvementRule());
                    	        }
                           		set(
                           			current, 
                           			"responsibility",
                            		lv_responsibility_5_0, 
                            		"Responsibility");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getResourceInvolvementAccess().getENDLINEParserRuleCall_3()); 
                
            pushFollow(FOLLOW_ruleENDLINE_in_ruleResourceInvolvement3126);
            ruleENDLINE();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResourceInvolvement"


    // $ANTLR start "entryRuleActivity"
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1492:1: entryRuleActivity returns [EObject current=null] : iv_ruleActivity= ruleActivity EOF ;
    public final EObject entryRuleActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity = null;


        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1493:2: (iv_ruleActivity= ruleActivity EOF )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1494:2: iv_ruleActivity= ruleActivity EOF
            {
             newCompositeNode(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_ruleActivity_in_entryRuleActivity3161);
            iv_ruleActivity=ruleActivity();

            state._fsp--;

             current =iv_ruleActivity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivity3171); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActivity"


    // $ANTLR start "ruleActivity"
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1501:1: ruleActivity returns [EObject current=null] : ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Activity' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? (otherlv_7= 'involves' this_OPENCURLY_8= RULE_OPENCURLY ( (lv_involvedResources_9_0= ruleResourceInvolvement ) )* this_CLOSEDCURLY_10= RULE_CLOSEDCURLY )? (otherlv_11= 'wbsActivity' ( ( ruleQualifiedName ) )* ruleENDLINE )? ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_15= 'starts' ( (lv_start_16_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_18= 'after' ( ( ruleQualifiedName ) ) otherlv_20= 'offset' ( (lv_offset_21_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_23= 'ends' ( (lv_end_24_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_26= 'duration' ( (lv_duration_27_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_29= 'completeness' ( (lv_completeness_30_0= RULE_INT ) ) otherlv_31= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?) ) ) this_CLOSEDCURLY_36= RULE_CLOSEDCURLY ) ;
    public final EObject ruleActivity() throws RecognitionException {
        EObject current = null;

        Token lv_description_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token this_OPENCURLY_3=null;
        Token otherlv_4=null;
        Token lv_longName_5_0=null;
        Token otherlv_7=null;
        Token this_OPENCURLY_8=null;
        Token this_CLOSEDCURLY_10=null;
        Token otherlv_11=null;
        Token otherlv_15=null;
        Token lv_start_16_0=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token lv_offset_21_0=null;
        Token otherlv_23=null;
        Token lv_end_24_0=null;
        Token otherlv_26=null;
        Token lv_duration_27_0=null;
        Token otherlv_29=null;
        Token lv_completeness_30_0=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token this_CLOSEDCURLY_36=null;
        EObject lv_involvedResources_9_0 = null;


         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1504:28: ( ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Activity' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? (otherlv_7= 'involves' this_OPENCURLY_8= RULE_OPENCURLY ( (lv_involvedResources_9_0= ruleResourceInvolvement ) )* this_CLOSEDCURLY_10= RULE_CLOSEDCURLY )? (otherlv_11= 'wbsActivity' ( ( ruleQualifiedName ) )* ruleENDLINE )? ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_15= 'starts' ( (lv_start_16_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_18= 'after' ( ( ruleQualifiedName ) ) otherlv_20= 'offset' ( (lv_offset_21_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_23= 'ends' ( (lv_end_24_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_26= 'duration' ( (lv_duration_27_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_29= 'completeness' ( (lv_completeness_30_0= RULE_INT ) ) otherlv_31= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?) ) ) this_CLOSEDCURLY_36= RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1505:1: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Activity' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? (otherlv_7= 'involves' this_OPENCURLY_8= RULE_OPENCURLY ( (lv_involvedResources_9_0= ruleResourceInvolvement ) )* this_CLOSEDCURLY_10= RULE_CLOSEDCURLY )? (otherlv_11= 'wbsActivity' ( ( ruleQualifiedName ) )* ruleENDLINE )? ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_15= 'starts' ( (lv_start_16_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_18= 'after' ( ( ruleQualifiedName ) ) otherlv_20= 'offset' ( (lv_offset_21_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_23= 'ends' ( (lv_end_24_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_26= 'duration' ( (lv_duration_27_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_29= 'completeness' ( (lv_completeness_30_0= RULE_INT ) ) otherlv_31= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?) ) ) this_CLOSEDCURLY_36= RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1505:1: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Activity' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? (otherlv_7= 'involves' this_OPENCURLY_8= RULE_OPENCURLY ( (lv_involvedResources_9_0= ruleResourceInvolvement ) )* this_CLOSEDCURLY_10= RULE_CLOSEDCURLY )? (otherlv_11= 'wbsActivity' ( ( ruleQualifiedName ) )* ruleENDLINE )? ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_15= 'starts' ( (lv_start_16_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_18= 'after' ( ( ruleQualifiedName ) ) otherlv_20= 'offset' ( (lv_offset_21_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_23= 'ends' ( (lv_end_24_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_26= 'duration' ( (lv_duration_27_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_29= 'completeness' ( (lv_completeness_30_0= RULE_INT ) ) otherlv_31= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?) ) ) this_CLOSEDCURLY_36= RULE_CLOSEDCURLY )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1505:2: ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Activity' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )? (otherlv_7= 'involves' this_OPENCURLY_8= RULE_OPENCURLY ( (lv_involvedResources_9_0= ruleResourceInvolvement ) )* this_CLOSEDCURLY_10= RULE_CLOSEDCURLY )? (otherlv_11= 'wbsActivity' ( ( ruleQualifiedName ) )* ruleENDLINE )? ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_15= 'starts' ( (lv_start_16_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_18= 'after' ( ( ruleQualifiedName ) ) otherlv_20= 'offset' ( (lv_offset_21_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_23= 'ends' ( (lv_end_24_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_26= 'duration' ( (lv_duration_27_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_29= 'completeness' ( (lv_completeness_30_0= RULE_INT ) ) otherlv_31= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?) ) ) this_CLOSEDCURLY_36= RULE_CLOSEDCURLY
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1505:2: ( (lv_description_0_0= RULE_ML_COMMENT ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ML_COMMENT) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1506:1: (lv_description_0_0= RULE_ML_COMMENT )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1506:1: (lv_description_0_0= RULE_ML_COMMENT )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1507:3: lv_description_0_0= RULE_ML_COMMENT
                    {
                    lv_description_0_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_ruleActivity3213); 

                    			newLeafNode(lv_description_0_0, grammarAccess.getActivityAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActivityRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_0_0, 
                            		"ML_COMMENT");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleActivity3231); 

                	newLeafNode(otherlv_1, grammarAccess.getActivityAccess().getActivityKeyword_1());
                
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1527:1: ( (lv_name_2_0= RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1528:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1528:1: (lv_name_2_0= RULE_ID )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1529:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActivity3248); 

            			newLeafNode(lv_name_2_0, grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActivityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            this_OPENCURLY_3=(Token)match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_ruleActivity3264); 
             
                newLeafNode(this_OPENCURLY_3, grammarAccess.getActivityAccess().getOPENCURLYTerminalRuleCall_3()); 
                
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1549:1: (otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==14) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1549:3: otherlv_4= 'name' ( (lv_longName_5_0= RULE_STRING ) ) ruleENDLINE
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleActivity3276); 

                        	newLeafNode(otherlv_4, grammarAccess.getActivityAccess().getNameKeyword_4_0());
                        
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1553:1: ( (lv_longName_5_0= RULE_STRING ) )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1554:1: (lv_longName_5_0= RULE_STRING )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1554:1: (lv_longName_5_0= RULE_STRING )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1555:3: lv_longName_5_0= RULE_STRING
                    {
                    lv_longName_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActivity3293); 

                    			newLeafNode(lv_longName_5_0, grammarAccess.getActivityAccess().getLongNameSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActivityRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"longName",
                            		lv_longName_5_0, 
                            		"STRING");
                    	    

                    }


                    }

                     
                            newCompositeNode(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_4_2()); 
                        
                    pushFollow(FOLLOW_ruleENDLINE_in_ruleActivity3314);
                    ruleENDLINE();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1579:3: (otherlv_7= 'involves' this_OPENCURLY_8= RULE_OPENCURLY ( (lv_involvedResources_9_0= ruleResourceInvolvement ) )* this_CLOSEDCURLY_10= RULE_CLOSEDCURLY )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==38) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1579:5: otherlv_7= 'involves' this_OPENCURLY_8= RULE_OPENCURLY ( (lv_involvedResources_9_0= ruleResourceInvolvement ) )* this_CLOSEDCURLY_10= RULE_CLOSEDCURLY
                    {
                    otherlv_7=(Token)match(input,38,FOLLOW_38_in_ruleActivity3328); 

                        	newLeafNode(otherlv_7, grammarAccess.getActivityAccess().getInvolvesKeyword_5_0());
                        
                    this_OPENCURLY_8=(Token)match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_ruleActivity3339); 
                     
                        newLeafNode(this_OPENCURLY_8, grammarAccess.getActivityAccess().getOPENCURLYTerminalRuleCall_5_1()); 
                        
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1587:1: ( (lv_involvedResources_9_0= ruleResourceInvolvement ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==RULE_ID) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1588:1: (lv_involvedResources_9_0= ruleResourceInvolvement )
                    	    {
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1588:1: (lv_involvedResources_9_0= ruleResourceInvolvement )
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1589:3: lv_involvedResources_9_0= ruleResourceInvolvement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityAccess().getInvolvedResourcesResourceInvolvementParserRuleCall_5_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleResourceInvolvement_in_ruleActivity3359);
                    	    lv_involvedResources_9_0=ruleResourceInvolvement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getActivityRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"involvedResources",
                    	            		lv_involvedResources_9_0, 
                    	            		"ResourceInvolvement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    this_CLOSEDCURLY_10=(Token)match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_ruleActivity3371); 
                     
                        newLeafNode(this_CLOSEDCURLY_10, grammarAccess.getActivityAccess().getCLOSEDCURLYTerminalRuleCall_5_3()); 
                        

                    }
                    break;

            }

            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1609:3: (otherlv_11= 'wbsActivity' ( ( ruleQualifiedName ) )* ruleENDLINE )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==21) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1609:5: otherlv_11= 'wbsActivity' ( ( ruleQualifiedName ) )* ruleENDLINE
                    {
                    otherlv_11=(Token)match(input,21,FOLLOW_21_in_ruleActivity3385); 

                        	newLeafNode(otherlv_11, grammarAccess.getActivityAccess().getWbsActivityKeyword_6_0());
                        
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1613:1: ( ( ruleQualifiedName ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==RULE_ID) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1614:1: ( ruleQualifiedName )
                    	    {
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1614:1: ( ruleQualifiedName )
                    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1615:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getActivityRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getActivityAccess().getWbsActivityWBSActivityCrossReference_6_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleActivity3408);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                     
                            newCompositeNode(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_6_2()); 
                        
                    pushFollow(FOLLOW_ruleENDLINE_in_ruleActivity3425);
                    ruleENDLINE();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1636:3: ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_15= 'starts' ( (lv_start_16_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_18= 'after' ( ( ruleQualifiedName ) ) otherlv_20= 'offset' ( (lv_offset_21_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_23= 'ends' ( (lv_end_24_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_26= 'duration' ( (lv_duration_27_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_29= 'completeness' ( (lv_completeness_30_0= RULE_INT ) ) otherlv_31= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?) ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1638:1: ( ( ( ({...}? => ( ({...}? => ( (otherlv_15= 'starts' ( (lv_start_16_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_18= 'after' ( ( ruleQualifiedName ) ) otherlv_20= 'offset' ( (lv_offset_21_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_23= 'ends' ( (lv_end_24_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_26= 'duration' ( (lv_duration_27_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_29= 'completeness' ( (lv_completeness_30_0= RULE_INT ) ) otherlv_31= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?) )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1638:1: ( ( ( ({...}? => ( ({...}? => ( (otherlv_15= 'starts' ( (lv_start_16_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_18= 'after' ( ( ruleQualifiedName ) ) otherlv_20= 'offset' ( (lv_offset_21_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_23= 'ends' ( (lv_end_24_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_26= 'duration' ( (lv_duration_27_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_29= 'completeness' ( (lv_completeness_30_0= RULE_INT ) ) otherlv_31= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1639:2: ( ( ({...}? => ( ({...}? => ( (otherlv_15= 'starts' ( (lv_start_16_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_18= 'after' ( ( ruleQualifiedName ) ) otherlv_20= 'offset' ( (lv_offset_21_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_23= 'ends' ( (lv_end_24_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_26= 'duration' ( (lv_duration_27_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_29= 'completeness' ( (lv_completeness_30_0= RULE_INT ) ) otherlv_31= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getActivityAccess().getUnorderedGroup_7());
            	
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1642:2: ( ( ({...}? => ( ({...}? => ( (otherlv_15= 'starts' ( (lv_start_16_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_18= 'after' ( ( ruleQualifiedName ) ) otherlv_20= 'offset' ( (lv_offset_21_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_23= 'ends' ( (lv_end_24_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_26= 'duration' ( (lv_duration_27_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_29= 'completeness' ( (lv_completeness_30_0= RULE_INT ) ) otherlv_31= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?)
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1643:3: ( ({...}? => ( ({...}? => ( (otherlv_15= 'starts' ( (lv_start_16_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_18= 'after' ( ( ruleQualifiedName ) ) otherlv_20= 'offset' ( (lv_offset_21_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_23= 'ends' ( (lv_end_24_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_26= 'duration' ( (lv_duration_27_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_29= 'completeness' ( (lv_completeness_30_0= RULE_INT ) ) otherlv_31= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+ {...}?
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1643:3: ( ({...}? => ( ({...}? => ( (otherlv_15= 'starts' ( (lv_start_16_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_18= 'after' ( ( ruleQualifiedName ) ) otherlv_20= 'offset' ( (lv_offset_21_0= RULE_INT ) ) ruleENDLINE ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_23= 'ends' ( (lv_end_24_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_26= 'duration' ( (lv_duration_27_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_29= 'completeness' ( (lv_completeness_30_0= RULE_INT ) ) otherlv_31= '%' ruleENDLINE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) ) )+
            int cnt46=0;
            loop46:
            do {
                int alt46=4;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==31||LA46_0==39) && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_7(), 0) ) {
                    alt46=1;
                }
                else if ( LA46_0 >=40 && LA46_0<=41 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_7(), 1) ) {
                    alt46=2;
                }
                else if ( LA46_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_7(), 2) ) {
                    alt46=3;
                }


                switch (alt46) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1645:4: ({...}? => ( ({...}? => ( (otherlv_15= 'starts' ( (lv_start_16_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_18= 'after' ( ( ruleQualifiedName ) ) otherlv_20= 'offset' ( (lv_offset_21_0= RULE_INT ) ) ruleENDLINE ) ) ) ) )
            	    {
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1645:4: ({...}? => ( ({...}? => ( (otherlv_15= 'starts' ( (lv_start_16_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_18= 'after' ( ( ruleQualifiedName ) ) otherlv_20= 'offset' ( (lv_offset_21_0= RULE_INT ) ) ruleENDLINE ) ) ) ) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1646:5: {...}? => ( ({...}? => ( (otherlv_15= 'starts' ( (lv_start_16_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_18= 'after' ( ( ruleQualifiedName ) ) otherlv_20= 'offset' ( (lv_offset_21_0= RULE_INT ) ) ruleENDLINE ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_7(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleActivity", "getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_7(), 0)");
            	    }
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1646:105: ( ({...}? => ( (otherlv_15= 'starts' ( (lv_start_16_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_18= 'after' ( ( ruleQualifiedName ) ) otherlv_20= 'offset' ( (lv_offset_21_0= RULE_INT ) ) ruleENDLINE ) ) ) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1647:6: ({...}? => ( (otherlv_15= 'starts' ( (lv_start_16_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_18= 'after' ( ( ruleQualifiedName ) ) otherlv_20= 'offset' ( (lv_offset_21_0= RULE_INT ) ) ruleENDLINE ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActivityAccess().getUnorderedGroup_7(), 0);
            	    	 				
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1650:6: ({...}? => ( (otherlv_15= 'starts' ( (lv_start_16_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_18= 'after' ( ( ruleQualifiedName ) ) otherlv_20= 'offset' ( (lv_offset_21_0= RULE_INT ) ) ruleENDLINE ) ) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1650:7: {...}? => ( (otherlv_15= 'starts' ( (lv_start_16_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_18= 'after' ( ( ruleQualifiedName ) ) otherlv_20= 'offset' ( (lv_offset_21_0= RULE_INT ) ) ruleENDLINE ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActivity", "true");
            	    }
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1650:16: ( (otherlv_15= 'starts' ( (lv_start_16_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_18= 'after' ( ( ruleQualifiedName ) ) otherlv_20= 'offset' ( (lv_offset_21_0= RULE_INT ) ) ruleENDLINE ) )
            	    int alt43=2;
            	    int LA43_0 = input.LA(1);

            	    if ( (LA43_0==39) ) {
            	        alt43=1;
            	    }
            	    else if ( (LA43_0==31) ) {
            	        alt43=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 43, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt43) {
            	        case 1 :
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1650:17: (otherlv_15= 'starts' ( (lv_start_16_0= RULE_STRING ) ) ruleENDLINE )
            	            {
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1650:17: (otherlv_15= 'starts' ( (lv_start_16_0= RULE_STRING ) ) ruleENDLINE )
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1650:19: otherlv_15= 'starts' ( (lv_start_16_0= RULE_STRING ) ) ruleENDLINE
            	            {
            	            otherlv_15=(Token)match(input,39,FOLLOW_39_in_ruleActivity3485); 

            	                	newLeafNode(otherlv_15, grammarAccess.getActivityAccess().getStartsKeyword_7_0_0_0());
            	                
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1654:1: ( (lv_start_16_0= RULE_STRING ) )
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1655:1: (lv_start_16_0= RULE_STRING )
            	            {
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1655:1: (lv_start_16_0= RULE_STRING )
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1656:3: lv_start_16_0= RULE_STRING
            	            {
            	            lv_start_16_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActivity3502); 

            	            			newLeafNode(lv_start_16_0, grammarAccess.getActivityAccess().getStartSTRINGTerminalRuleCall_7_0_0_1_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getActivityRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"start",
            	                    		lv_start_16_0, 
            	                    		"STRING");
            	            	    

            	            }


            	            }

            	             
            	                    newCompositeNode(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_7_0_0_2()); 
            	                
            	            pushFollow(FOLLOW_ruleENDLINE_in_ruleActivity3523);
            	            ruleENDLINE();

            	            state._fsp--;

            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1681:6: (otherlv_18= 'after' ( ( ruleQualifiedName ) ) otherlv_20= 'offset' ( (lv_offset_21_0= RULE_INT ) ) ruleENDLINE )
            	            {
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1681:6: (otherlv_18= 'after' ( ( ruleQualifiedName ) ) otherlv_20= 'offset' ( (lv_offset_21_0= RULE_INT ) ) ruleENDLINE )
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1681:8: otherlv_18= 'after' ( ( ruleQualifiedName ) ) otherlv_20= 'offset' ( (lv_offset_21_0= RULE_INT ) ) ruleENDLINE
            	            {
            	            otherlv_18=(Token)match(input,31,FOLLOW_31_in_ruleActivity3542); 

            	                	newLeafNode(otherlv_18, grammarAccess.getActivityAccess().getAfterKeyword_7_0_1_0());
            	                
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1685:1: ( ( ruleQualifiedName ) )
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1686:1: ( ruleQualifiedName )
            	            {
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1686:1: ( ruleQualifiedName )
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1687:3: ruleQualifiedName
            	            {

            	            			if (current==null) {
            	            	            current = createModelElement(grammarAccess.getActivityRule());
            	            	        }
            	                    
            	             
            	            	        newCompositeNode(grammarAccess.getActivityAccess().getAfterActivityElementCrossReference_7_0_1_1_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleQualifiedName_in_ruleActivity3565);
            	            ruleQualifiedName();

            	            state._fsp--;

            	             
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }

            	            otherlv_20=(Token)match(input,32,FOLLOW_32_in_ruleActivity3577); 

            	                	newLeafNode(otherlv_20, grammarAccess.getActivityAccess().getOffsetKeyword_7_0_1_2());
            	                
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1704:1: ( (lv_offset_21_0= RULE_INT ) )
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1705:1: (lv_offset_21_0= RULE_INT )
            	            {
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1705:1: (lv_offset_21_0= RULE_INT )
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1706:3: lv_offset_21_0= RULE_INT
            	            {
            	            lv_offset_21_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleActivity3594); 

            	            			newLeafNode(lv_offset_21_0, grammarAccess.getActivityAccess().getOffsetINTTerminalRuleCall_7_0_1_3_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getActivityRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"offset",
            	                    		lv_offset_21_0, 
            	                    		"INT");
            	            	    

            	            }


            	            }

            	             
            	                    newCompositeNode(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_7_0_1_4()); 
            	                
            	            pushFollow(FOLLOW_ruleENDLINE_in_ruleActivity3615);
            	            ruleENDLINE();

            	            state._fsp--;

            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }


            	            }
            	            break;

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActivityAccess().getUnorderedGroup_7());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1737:4: ({...}? => ( ({...}? => ( ( (otherlv_23= 'ends' ( (lv_end_24_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_26= 'duration' ( (lv_duration_27_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_29= 'completeness' ( (lv_completeness_30_0= RULE_INT ) ) otherlv_31= '%' ruleENDLINE ) ) ) )
            	    {
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1737:4: ({...}? => ( ({...}? => ( ( (otherlv_23= 'ends' ( (lv_end_24_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_26= 'duration' ( (lv_duration_27_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_29= 'completeness' ( (lv_completeness_30_0= RULE_INT ) ) otherlv_31= '%' ruleENDLINE ) ) ) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1738:5: {...}? => ( ({...}? => ( ( (otherlv_23= 'ends' ( (lv_end_24_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_26= 'duration' ( (lv_duration_27_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_29= 'completeness' ( (lv_completeness_30_0= RULE_INT ) ) otherlv_31= '%' ruleENDLINE ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_7(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleActivity", "getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_7(), 1)");
            	    }
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1738:105: ( ({...}? => ( ( (otherlv_23= 'ends' ( (lv_end_24_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_26= 'duration' ( (lv_duration_27_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_29= 'completeness' ( (lv_completeness_30_0= RULE_INT ) ) otherlv_31= '%' ruleENDLINE ) ) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1739:6: ({...}? => ( ( (otherlv_23= 'ends' ( (lv_end_24_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_26= 'duration' ( (lv_duration_27_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_29= 'completeness' ( (lv_completeness_30_0= RULE_INT ) ) otherlv_31= '%' ruleENDLINE ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActivityAccess().getUnorderedGroup_7(), 1);
            	    	 				
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1742:6: ({...}? => ( ( (otherlv_23= 'ends' ( (lv_end_24_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_26= 'duration' ( (lv_duration_27_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_29= 'completeness' ( (lv_completeness_30_0= RULE_INT ) ) otherlv_31= '%' ruleENDLINE ) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1742:7: {...}? => ( ( (otherlv_23= 'ends' ( (lv_end_24_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_26= 'duration' ( (lv_duration_27_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_29= 'completeness' ( (lv_completeness_30_0= RULE_INT ) ) otherlv_31= '%' ruleENDLINE )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActivity", "true");
            	    }
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1742:16: ( ( (otherlv_23= 'ends' ( (lv_end_24_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_26= 'duration' ( (lv_duration_27_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_29= 'completeness' ( (lv_completeness_30_0= RULE_INT ) ) otherlv_31= '%' ruleENDLINE )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1742:17: ( (otherlv_23= 'ends' ( (lv_end_24_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_26= 'duration' ( (lv_duration_27_0= RULE_INT ) ) ruleENDLINE ) ) otherlv_29= 'completeness' ( (lv_completeness_30_0= RULE_INT ) ) otherlv_31= '%' ruleENDLINE
            	    {
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1742:17: ( (otherlv_23= 'ends' ( (lv_end_24_0= RULE_STRING ) ) ruleENDLINE ) | (otherlv_26= 'duration' ( (lv_duration_27_0= RULE_INT ) ) ruleENDLINE ) )
            	    int alt44=2;
            	    int LA44_0 = input.LA(1);

            	    if ( (LA44_0==40) ) {
            	        alt44=1;
            	    }
            	    else if ( (LA44_0==41) ) {
            	        alt44=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 44, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt44) {
            	        case 1 :
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1742:18: (otherlv_23= 'ends' ( (lv_end_24_0= RULE_STRING ) ) ruleENDLINE )
            	            {
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1742:18: (otherlv_23= 'ends' ( (lv_end_24_0= RULE_STRING ) ) ruleENDLINE )
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1742:20: otherlv_23= 'ends' ( (lv_end_24_0= RULE_STRING ) ) ruleENDLINE
            	            {
            	            otherlv_23=(Token)match(input,40,FOLLOW_40_in_ruleActivity3685); 

            	                	newLeafNode(otherlv_23, grammarAccess.getActivityAccess().getEndsKeyword_7_1_0_0_0());
            	                
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1746:1: ( (lv_end_24_0= RULE_STRING ) )
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1747:1: (lv_end_24_0= RULE_STRING )
            	            {
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1747:1: (lv_end_24_0= RULE_STRING )
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1748:3: lv_end_24_0= RULE_STRING
            	            {
            	            lv_end_24_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActivity3702); 

            	            			newLeafNode(lv_end_24_0, grammarAccess.getActivityAccess().getEndSTRINGTerminalRuleCall_7_1_0_0_1_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getActivityRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"end",
            	                    		lv_end_24_0, 
            	                    		"STRING");
            	            	    

            	            }


            	            }

            	             
            	                    newCompositeNode(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_7_1_0_0_2()); 
            	                
            	            pushFollow(FOLLOW_ruleENDLINE_in_ruleActivity3723);
            	            ruleENDLINE();

            	            state._fsp--;

            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1773:6: (otherlv_26= 'duration' ( (lv_duration_27_0= RULE_INT ) ) ruleENDLINE )
            	            {
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1773:6: (otherlv_26= 'duration' ( (lv_duration_27_0= RULE_INT ) ) ruleENDLINE )
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1773:8: otherlv_26= 'duration' ( (lv_duration_27_0= RULE_INT ) ) ruleENDLINE
            	            {
            	            otherlv_26=(Token)match(input,41,FOLLOW_41_in_ruleActivity3742); 

            	                	newLeafNode(otherlv_26, grammarAccess.getActivityAccess().getDurationKeyword_7_1_0_1_0());
            	                
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1777:1: ( (lv_duration_27_0= RULE_INT ) )
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1778:1: (lv_duration_27_0= RULE_INT )
            	            {
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1778:1: (lv_duration_27_0= RULE_INT )
            	            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1779:3: lv_duration_27_0= RULE_INT
            	            {
            	            lv_duration_27_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleActivity3759); 

            	            			newLeafNode(lv_duration_27_0, grammarAccess.getActivityAccess().getDurationINTTerminalRuleCall_7_1_0_1_1_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getActivityRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"duration",
            	                    		lv_duration_27_0, 
            	                    		"INT");
            	            	    

            	            }


            	            }

            	             
            	                    newCompositeNode(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_7_1_0_1_2()); 
            	                
            	            pushFollow(FOLLOW_ruleENDLINE_in_ruleActivity3780);
            	            ruleENDLINE();

            	            state._fsp--;

            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_29=(Token)match(input,33,FOLLOW_33_in_ruleActivity3793); 

            	        	newLeafNode(otherlv_29, grammarAccess.getActivityAccess().getCompletenessKeyword_7_1_1());
            	        
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1807:1: ( (lv_completeness_30_0= RULE_INT ) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1808:1: (lv_completeness_30_0= RULE_INT )
            	    {
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1808:1: (lv_completeness_30_0= RULE_INT )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1809:3: lv_completeness_30_0= RULE_INT
            	    {
            	    lv_completeness_30_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleActivity3810); 

            	    			newLeafNode(lv_completeness_30_0, grammarAccess.getActivityAccess().getCompletenessINTTerminalRuleCall_7_1_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getActivityRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"completeness",
            	            		lv_completeness_30_0, 
            	            		"INT");
            	    	    

            	    }


            	    }

            	    otherlv_31=(Token)match(input,34,FOLLOW_34_in_ruleActivity3827); 

            	        	newLeafNode(otherlv_31, grammarAccess.getActivityAccess().getPercentSignKeyword_7_1_3());
            	        
            	     
            	            newCompositeNode(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_7_1_4()); 
            	        
            	    pushFollow(FOLLOW_ruleENDLINE_in_ruleActivity3843);
            	    ruleENDLINE();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActivityAccess().getUnorderedGroup_7());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1844:4: ({...}? => ( ({...}? => (otherlv_33= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) )
            	    {
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1844:4: ({...}? => ( ({...}? => (otherlv_33= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) ) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1845:5: {...}? => ( ({...}? => (otherlv_33= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_7(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleActivity", "getUnorderedGroupHelper().canSelect(grammarAccess.getActivityAccess().getUnorderedGroup_7(), 2)");
            	    }
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1845:105: ( ({...}? => (otherlv_33= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) ) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1846:6: ({...}? => (otherlv_33= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActivityAccess().getUnorderedGroup_7(), 2);
            	    	 				
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1849:6: ({...}? => (otherlv_33= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE ) )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1849:7: {...}? => (otherlv_33= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActivity", "true");
            	    }
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1849:16: (otherlv_33= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE )
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1849:18: otherlv_33= 'dependsOn' ( ( ruleQualifiedName ) )* ruleENDLINE
            	    {
            	    otherlv_33=(Token)match(input,22,FOLLOW_22_in_ruleActivity3910); 

            	        	newLeafNode(otherlv_33, grammarAccess.getActivityAccess().getDependsOnKeyword_7_2_0());
            	        
            	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1853:1: ( ( ruleQualifiedName ) )*
            	    loop45:
            	    do {
            	        int alt45=2;
            	        int LA45_0 = input.LA(1);

            	        if ( (LA45_0==RULE_ID) ) {
            	            alt45=1;
            	        }


            	        switch (alt45) {
            	    	case 1 :
            	    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1854:1: ( ruleQualifiedName )
            	    	    {
            	    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1854:1: ( ruleQualifiedName )
            	    	    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1855:3: ruleQualifiedName
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getActivityRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getActivityAccess().getDependenciesActivityElementCrossReference_7_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleActivity3933);
            	    	    ruleQualifiedName();

            	    	    state._fsp--;

            	    	     
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop45;
            	        }
            	    } while (true);

            	     
            	            newCompositeNode(grammarAccess.getActivityAccess().getENDLINEParserRuleCall_7_2_2()); 
            	        
            	    pushFollow(FOLLOW_ruleENDLINE_in_ruleActivity3950);
            	    ruleENDLINE();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActivityAccess().getUnorderedGroup_7());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt46 >= 1 ) break loop46;
                        EarlyExitException eee =
                            new EarlyExitException(46, input);
                        throw eee;
                }
                cnt46++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getActivityAccess().getUnorderedGroup_7()) ) {
                throw new FailedPredicateException(input, "ruleActivity", "getUnorderedGroupHelper().canLeave(grammarAccess.getActivityAccess().getUnorderedGroup_7())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getActivityAccess().getUnorderedGroup_7());
            	

            }

            this_CLOSEDCURLY_36=(Token)match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_ruleActivity4007); 
             
                newLeafNode(this_CLOSEDCURLY_36, grammarAccess.getActivityAccess().getCLOSEDCURLYTerminalRuleCall_8()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActivity"


    // $ANTLR start "ruleResponsibility"
    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1905:1: ruleResponsibility returns [Enumerator current=null] : ( (enumLiteral_0= 'RESPONSIBLE' ) | (enumLiteral_1= 'ACCOUNTABLE' ) | (enumLiteral_2= 'CONSULTED' ) | (enumLiteral_3= 'INFORMED' ) ) ;
    public final Enumerator ruleResponsibility() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1907:28: ( ( (enumLiteral_0= 'RESPONSIBLE' ) | (enumLiteral_1= 'ACCOUNTABLE' ) | (enumLiteral_2= 'CONSULTED' ) | (enumLiteral_3= 'INFORMED' ) ) )
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1908:1: ( (enumLiteral_0= 'RESPONSIBLE' ) | (enumLiteral_1= 'ACCOUNTABLE' ) | (enumLiteral_2= 'CONSULTED' ) | (enumLiteral_3= 'INFORMED' ) )
            {
            // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1908:1: ( (enumLiteral_0= 'RESPONSIBLE' ) | (enumLiteral_1= 'ACCOUNTABLE' ) | (enumLiteral_2= 'CONSULTED' ) | (enumLiteral_3= 'INFORMED' ) )
            int alt47=4;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt47=1;
                }
                break;
            case 43:
                {
                alt47=2;
                }
                break;
            case 44:
                {
                alt47=3;
                }
                break;
            case 45:
                {
                alt47=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1908:2: (enumLiteral_0= 'RESPONSIBLE' )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1908:2: (enumLiteral_0= 'RESPONSIBLE' )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1908:4: enumLiteral_0= 'RESPONSIBLE'
                    {
                    enumLiteral_0=(Token)match(input,42,FOLLOW_42_in_ruleResponsibility4058); 

                            current = grammarAccess.getResponsibilityAccess().getRESPONSIBLEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getResponsibilityAccess().getRESPONSIBLEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1914:6: (enumLiteral_1= 'ACCOUNTABLE' )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1914:6: (enumLiteral_1= 'ACCOUNTABLE' )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1914:8: enumLiteral_1= 'ACCOUNTABLE'
                    {
                    enumLiteral_1=(Token)match(input,43,FOLLOW_43_in_ruleResponsibility4075); 

                            current = grammarAccess.getResponsibilityAccess().getACCOUNTABLEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getResponsibilityAccess().getACCOUNTABLEEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1920:6: (enumLiteral_2= 'CONSULTED' )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1920:6: (enumLiteral_2= 'CONSULTED' )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1920:8: enumLiteral_2= 'CONSULTED'
                    {
                    enumLiteral_2=(Token)match(input,44,FOLLOW_44_in_ruleResponsibility4092); 

                            current = grammarAccess.getResponsibilityAccess().getCONSULTEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getResponsibilityAccess().getCONSULTEDEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1926:6: (enumLiteral_3= 'INFORMED' )
                    {
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1926:6: (enumLiteral_3= 'INFORMED' )
                    // ../com.lowcoupling.mdpm.lng.plan/src-gen/com/lowcoupling/mdpm/lng/plan/parser/antlr/internal/InternalPlan.g:1926:8: enumLiteral_3= 'INFORMED'
                    {
                    enumLiteral_3=(Token)match(input,45,FOLLOW_45_in_ruleResponsibility4109); 

                            current = grammarAccess.getResponsibilityAccess().getINFORMEDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getResponsibilityAccess().getINFORMEDEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResponsibility"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_ruleProgram128 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleProgram147 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProgram164 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_ruleProgram180 = new BitSet(new long[]{0x000000000201C110L});
    public static final BitSet FOLLOW_14_in_ruleProgram192 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProgram209 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleProgram230 = new BitSet(new long[]{0x0000000002018110L});
    public static final BitSet FOLLOW_rulePlanImport_in_ruleProgram253 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleProgram269 = new BitSet(new long[]{0x0000000002018110L});
    public static final BitSet FOLLOW_15_in_ruleProgram283 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleProgram306 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleProgram322 = new BitSet(new long[]{0x0000000000018110L});
    public static final BitSet FOLLOW_ruleProject_in_ruleProgram344 = new BitSet(new long[]{0x0000000000010110L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_ruleProgram356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProject_in_ruleProgram384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProject_in_entryRuleProject420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProject430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_ruleProject472 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleProject490 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProject507 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_ruleProject523 = new BitSet(new long[]{0x00000022D3964110L});
    public static final BitSet FOLLOW_14_in_ruleProject535 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProject552 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleProject573 = new BitSet(new long[]{0x00000022D3960110L});
    public static final BitSet FOLLOW_ruleWBSImport_in_ruleProject596 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleProject608 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleProject631 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleProject647 = new BitSet(new long[]{0x00000022D3160110L});
    public static final BitSet FOLLOW_ruleResourcesImport_in_ruleProject670 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleProject686 = new BitSet(new long[]{0x00000022D2160110L});
    public static final BitSet FOLLOW_rulePlanImport_in_ruleProject709 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleProject725 = new BitSet(new long[]{0x00000022D2160110L});
    public static final BitSet FOLLOW_17_in_ruleProject739 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_ruleProject750 = new BitSet(new long[]{0x0000000000080100L});
    public static final BitSet FOLLOW_ruleAssumption_in_ruleProject770 = new BitSet(new long[]{0x0000000000080100L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_ruleProject782 = new BitSet(new long[]{0x00000022D0140110L});
    public static final BitSet FOLLOW_18_in_ruleProject796 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_ruleProject807 = new BitSet(new long[]{0x0000000000080100L});
    public static final BitSet FOLLOW_ruleConstraint_in_ruleProject827 = new BitSet(new long[]{0x0000000000080100L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_ruleProject839 = new BitSet(new long[]{0x00000022D0100110L});
    public static final BitSet FOLLOW_ruleActivityElement_in_ruleProject861 = new BitSet(new long[]{0x00000022D0100110L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_ruleProject873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssumption_in_entryRuleAssumption908 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssumption918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleAssumption955 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAssumption972 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleAssumption993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint1028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleConstraint1075 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstraint1092 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleConstraint1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityGroup_in_entryRuleActivityGroup1148 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivityGroup1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_ruleActivityGroup1200 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleActivityGroup1218 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivityGroup1235 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_ruleActivityGroup1251 = new BitSet(new long[]{0x00000022D0704110L});
    public static final BitSet FOLLOW_14_in_ruleActivityGroup1263 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActivityGroup1280 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleActivityGroup1301 = new BitSet(new long[]{0x00000022D0700110L});
    public static final BitSet FOLLOW_21_in_ruleActivityGroup1315 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleActivityGroup1338 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleActivityGroup1355 = new BitSet(new long[]{0x00000022D0500110L});
    public static final BitSet FOLLOW_22_in_ruleActivityGroup1369 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleActivityGroup1392 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleActivityGroup1409 = new BitSet(new long[]{0x00000022D0100110L});
    public static final BitSet FOLLOW_ruleActivityElement_in_ruleActivityGroup1431 = new BitSet(new long[]{0x00000022D0100110L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_ruleActivityGroup1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSImport_in_entryRuleWBSImport1478 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWBSImport1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleWBSImport1525 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWBSImport1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourcesImport_in_entryRuleResourcesImport1583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourcesImport1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleResourcesImport1630 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResourcesImport1647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlanImport_in_entryRulePlanImport1688 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlanImport1698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rulePlanImport1735 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePlanImport1752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1794 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1845 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleQualifiedName1864 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1879 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleActivityElement_in_entryRuleActivityElement1928 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivityElement1938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_ruleActivityElement1985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckPoint_in_ruleActivityElement2012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityGroup_in_ruleActivityElement2039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENDLINE_in_entryRuleENDLINE2075 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleENDLINE2086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleENDLINE2123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckPoint_in_entryRuleCheckPoint2162 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckPoint2172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_ruleCheckPoint2259 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleCheckPoint2277 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCheckPoint2294 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_ruleCheckPoint2310 = new BitSet(new long[]{0x00000002F0004012L});
    public static final BitSet FOLLOW_14_in_ruleCheckPoint2322 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCheckPoint2339 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleCheckPoint2360 = new BitSet(new long[]{0x00000002F0000012L});
    public static final BitSet FOLLOW_29_in_ruleCheckPoint2374 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCheckPoint2397 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleCheckPoint2414 = new BitSet(new long[]{0x00000002D0000012L});
    public static final BitSet FOLLOW_30_in_ruleCheckPoint2530 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCheckPoint2547 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleCheckPoint2568 = new BitSet(new long[]{0x00000002C0000100L});
    public static final BitSet FOLLOW_31_in_ruleCheckPoint2587 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCheckPoint2610 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleCheckPoint2622 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCheckPoint2639 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleCheckPoint2660 = new BitSet(new long[]{0x00000002C0000100L});
    public static final BitSet FOLLOW_33_in_ruleCheckPoint2728 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCheckPoint2745 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleCheckPoint2762 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleCheckPoint2778 = new BitSet(new long[]{0x00000002C0400100L});
    public static final BitSet FOLLOW_22_in_ruleCheckPoint2790 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCheckPoint2813 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleCheckPoint2830 = new BitSet(new long[]{0x00000002C0000100L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_ruleCheckPoint2889 = new BitSet(new long[]{0x00000002D0000012L});
    public static final BitSet FOLLOW_ruleResourceInvolvement_in_entryRuleResourceInvolvement2970 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceInvolvement2980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResourceInvolvement3025 = new BitSet(new long[]{0x0000001808000000L});
    public static final BitSet FOLLOW_35_in_ruleResourceInvolvement3038 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleResourceInvolvement3055 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleResourceInvolvement3072 = new BitSet(new long[]{0x0000001008000000L});
    public static final BitSet FOLLOW_36_in_ruleResourceInvolvement3087 = new BitSet(new long[]{0x00003C0000000000L});
    public static final BitSet FOLLOW_ruleResponsibility_in_ruleResourceInvolvement3108 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleResourceInvolvement3126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity3161 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivity3171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_ruleActivity3213 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleActivity3231 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivity3248 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_ruleActivity3264 = new BitSet(new long[]{0x000003C080604000L});
    public static final BitSet FOLLOW_14_in_ruleActivity3276 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActivity3293 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleActivity3314 = new BitSet(new long[]{0x000003C080600000L});
    public static final BitSet FOLLOW_38_in_ruleActivity3328 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_ruleActivity3339 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_ruleResourceInvolvement_in_ruleActivity3359 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_ruleActivity3371 = new BitSet(new long[]{0x0000038080600000L});
    public static final BitSet FOLLOW_21_in_ruleActivity3385 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleActivity3408 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleActivity3425 = new BitSet(new long[]{0x0000038080400000L});
    public static final BitSet FOLLOW_39_in_ruleActivity3485 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActivity3502 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleActivity3523 = new BitSet(new long[]{0x0000038080400100L});
    public static final BitSet FOLLOW_31_in_ruleActivity3542 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleActivity3565 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleActivity3577 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleActivity3594 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleActivity3615 = new BitSet(new long[]{0x0000038080400100L});
    public static final BitSet FOLLOW_40_in_ruleActivity3685 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActivity3702 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleActivity3723 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_41_in_ruleActivity3742 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleActivity3759 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleActivity3780 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleActivity3793 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleActivity3810 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleActivity3827 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleActivity3843 = new BitSet(new long[]{0x0000038080400100L});
    public static final BitSet FOLLOW_22_in_ruleActivity3910 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleActivity3933 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_ruleENDLINE_in_ruleActivity3950 = new BitSet(new long[]{0x0000038080400100L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_ruleActivity4007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleResponsibility4058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleResponsibility4075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleResponsibility4092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleResponsibility4109 = new BitSet(new long[]{0x0000000000000002L});

}
