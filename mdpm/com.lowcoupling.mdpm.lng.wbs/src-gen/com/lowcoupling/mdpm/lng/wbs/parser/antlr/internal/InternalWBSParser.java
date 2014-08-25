package com.lowcoupling.mdpm.lng.wbs.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.lowcoupling.mdpm.lng.wbs.services.WBSGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWBSParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ML_COMMENT", "RULE_ID", "RULE_OPENCURLY", "RULE_ENDLINE", "RULE_CLOSEDCURLY", "RULE_STRING", "RULE_INT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Program '", "'requirements'", "'Project '", "'Activity '", "'WorkPackage '", "'Deliverable '", "'.'", "'req_import'"
    };
    public static final int RULE_ENDLINE=7;
    public static final int RULE_OPENCURLY=6;
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_CLOSEDCURLY=8;
    public static final int RULE_ID=5;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_INT=10;
    public static final int RULE_ML_COMMENT=4;
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
    public String getGrammarFileName() { return "../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g"; }



     	private WBSGrammarAccess grammarAccess;
     	
        public InternalWBSParser(TokenStream input, WBSGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "WBS";	
       	}
       	
       	@Override
       	protected WBSGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleWBS"
    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:67:1: entryRuleWBS returns [EObject current=null] : iv_ruleWBS= ruleWBS EOF ;
    public final EObject entryRuleWBS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWBS = null;


        try {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:68:2: (iv_ruleWBS= ruleWBS EOF )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:69:2: iv_ruleWBS= ruleWBS EOF
            {
             newCompositeNode(grammarAccess.getWBSRule()); 
            pushFollow(FOLLOW_ruleWBS_in_entryRuleWBS75);
            iv_ruleWBS=ruleWBS();

            state._fsp--;

             current =iv_ruleWBS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWBS85); 

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
    // $ANTLR end "entryRuleWBS"


    // $ANTLR start "ruleWBS"
    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:76:1: ruleWBS returns [EObject current=null] : (this_WBSProgram_0= ruleWBSProgram | this_WBSProject_1= ruleWBSProject ) ;
    public final EObject ruleWBS() throws RecognitionException {
        EObject current = null;

        EObject this_WBSProgram_0 = null;

        EObject this_WBSProject_1 = null;


         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:79:28: ( (this_WBSProgram_0= ruleWBSProgram | this_WBSProject_1= ruleWBSProject ) )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:80:1: (this_WBSProgram_0= ruleWBSProgram | this_WBSProject_1= ruleWBSProject )
            {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:80:1: (this_WBSProgram_0= ruleWBSProgram | this_WBSProject_1= ruleWBSProject )
            int alt1=2;
            switch ( input.LA(1) ) {
            case RULE_ML_COMMENT:
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==16) ) {
                    alt1=2;
                }
                else if ( (LA1_1==14) ) {
                    alt1=1;
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
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:81:5: this_WBSProgram_0= ruleWBSProgram
                    {
                     
                            newCompositeNode(grammarAccess.getWBSAccess().getWBSProgramParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleWBSProgram_in_ruleWBS132);
                    this_WBSProgram_0=ruleWBSProgram();

                    state._fsp--;

                     
                            current = this_WBSProgram_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:91:5: this_WBSProject_1= ruleWBSProject
                    {
                     
                            newCompositeNode(grammarAccess.getWBSAccess().getWBSProjectParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleWBSProject_in_ruleWBS159);
                    this_WBSProject_1=ruleWBSProject();

                    state._fsp--;

                     
                            current = this_WBSProject_1; 
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
    // $ANTLR end "ruleWBS"


    // $ANTLR start "entryRuleWBSProgram"
    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:107:1: entryRuleWBSProgram returns [EObject current=null] : iv_ruleWBSProgram= ruleWBSProgram EOF ;
    public final EObject entryRuleWBSProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWBSProgram = null;


        try {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:108:2: (iv_ruleWBSProgram= ruleWBSProgram EOF )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:109:2: iv_ruleWBSProgram= ruleWBSProgram EOF
            {
             newCompositeNode(grammarAccess.getWBSProgramRule()); 
            pushFollow(FOLLOW_ruleWBSProgram_in_entryRuleWBSProgram194);
            iv_ruleWBSProgram=ruleWBSProgram();

            state._fsp--;

             current =iv_ruleWBSProgram; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWBSProgram204); 

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
    // $ANTLR end "entryRuleWBSProgram"


    // $ANTLR start "ruleWBSProgram"
    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:116:1: ruleWBSProgram returns [EObject current=null] : ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Program ' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY ( ( (lv_requirementsModel_4_0= ruleRequirementImport ) ) this_ENDLINE_5= RULE_ENDLINE )* ( (lv_projects_6_0= ruleWBSProject ) )* (otherlv_7= 'requirements' this_OPENCURLY_8= RULE_OPENCURLY ( ( ( ruleQualifiedName ) ) this_ENDLINE_10= RULE_ENDLINE )? this_CLOSEDCURLY_11= RULE_CLOSEDCURLY )? this_CLOSEDCURLY_12= RULE_CLOSEDCURLY ) ;
    public final EObject ruleWBSProgram() throws RecognitionException {
        EObject current = null;

        Token lv_description_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token this_OPENCURLY_3=null;
        Token this_ENDLINE_5=null;
        Token otherlv_7=null;
        Token this_OPENCURLY_8=null;
        Token this_ENDLINE_10=null;
        Token this_CLOSEDCURLY_11=null;
        Token this_CLOSEDCURLY_12=null;
        EObject lv_requirementsModel_4_0 = null;

        EObject lv_projects_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:119:28: ( ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Program ' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY ( ( (lv_requirementsModel_4_0= ruleRequirementImport ) ) this_ENDLINE_5= RULE_ENDLINE )* ( (lv_projects_6_0= ruleWBSProject ) )* (otherlv_7= 'requirements' this_OPENCURLY_8= RULE_OPENCURLY ( ( ( ruleQualifiedName ) ) this_ENDLINE_10= RULE_ENDLINE )? this_CLOSEDCURLY_11= RULE_CLOSEDCURLY )? this_CLOSEDCURLY_12= RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:120:1: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Program ' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY ( ( (lv_requirementsModel_4_0= ruleRequirementImport ) ) this_ENDLINE_5= RULE_ENDLINE )* ( (lv_projects_6_0= ruleWBSProject ) )* (otherlv_7= 'requirements' this_OPENCURLY_8= RULE_OPENCURLY ( ( ( ruleQualifiedName ) ) this_ENDLINE_10= RULE_ENDLINE )? this_CLOSEDCURLY_11= RULE_CLOSEDCURLY )? this_CLOSEDCURLY_12= RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:120:1: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Program ' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY ( ( (lv_requirementsModel_4_0= ruleRequirementImport ) ) this_ENDLINE_5= RULE_ENDLINE )* ( (lv_projects_6_0= ruleWBSProject ) )* (otherlv_7= 'requirements' this_OPENCURLY_8= RULE_OPENCURLY ( ( ( ruleQualifiedName ) ) this_ENDLINE_10= RULE_ENDLINE )? this_CLOSEDCURLY_11= RULE_CLOSEDCURLY )? this_CLOSEDCURLY_12= RULE_CLOSEDCURLY )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:120:2: ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Program ' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY ( ( (lv_requirementsModel_4_0= ruleRequirementImport ) ) this_ENDLINE_5= RULE_ENDLINE )* ( (lv_projects_6_0= ruleWBSProject ) )* (otherlv_7= 'requirements' this_OPENCURLY_8= RULE_OPENCURLY ( ( ( ruleQualifiedName ) ) this_ENDLINE_10= RULE_ENDLINE )? this_CLOSEDCURLY_11= RULE_CLOSEDCURLY )? this_CLOSEDCURLY_12= RULE_CLOSEDCURLY
            {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:120:2: ( (lv_description_0_0= RULE_ML_COMMENT ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ML_COMMENT) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:121:1: (lv_description_0_0= RULE_ML_COMMENT )
                    {
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:121:1: (lv_description_0_0= RULE_ML_COMMENT )
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:122:3: lv_description_0_0= RULE_ML_COMMENT
                    {
                    lv_description_0_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_ruleWBSProgram246); 

                    			newLeafNode(lv_description_0_0, grammarAccess.getWBSProgramAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWBSProgramRule());
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

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleWBSProgram264); 

                	newLeafNode(otherlv_1, grammarAccess.getWBSProgramAccess().getProgramKeyword_1());
                
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:142:1: ( (lv_name_2_0= RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:143:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:143:1: (lv_name_2_0= RULE_ID )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:144:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWBSProgram281); 

            			newLeafNode(lv_name_2_0, grammarAccess.getWBSProgramAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWBSProgramRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            this_OPENCURLY_3=(Token)match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_ruleWBSProgram297); 
             
                newLeafNode(this_OPENCURLY_3, grammarAccess.getWBSProgramAccess().getOPENCURLYTerminalRuleCall_3()); 
                
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:164:1: ( ( (lv_requirementsModel_4_0= ruleRequirementImport ) ) this_ENDLINE_5= RULE_ENDLINE )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==21) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:164:2: ( (lv_requirementsModel_4_0= ruleRequirementImport ) ) this_ENDLINE_5= RULE_ENDLINE
            	    {
            	    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:164:2: ( (lv_requirementsModel_4_0= ruleRequirementImport ) )
            	    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:165:1: (lv_requirementsModel_4_0= ruleRequirementImport )
            	    {
            	    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:165:1: (lv_requirementsModel_4_0= ruleRequirementImport )
            	    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:166:3: lv_requirementsModel_4_0= ruleRequirementImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWBSProgramAccess().getRequirementsModelRequirementImportParserRuleCall_4_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRequirementImport_in_ruleWBSProgram318);
            	    lv_requirementsModel_4_0=ruleRequirementImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWBSProgramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"requirementsModel",
            	            		lv_requirementsModel_4_0, 
            	            		"RequirementImport");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    this_ENDLINE_5=(Token)match(input,RULE_ENDLINE,FOLLOW_RULE_ENDLINE_in_ruleWBSProgram329); 
            	     
            	        newLeafNode(this_ENDLINE_5, grammarAccess.getWBSProgramAccess().getENDLINETerminalRuleCall_4_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:186:3: ( (lv_projects_6_0= ruleWBSProject ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ML_COMMENT||LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:187:1: (lv_projects_6_0= ruleWBSProject )
            	    {
            	    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:187:1: (lv_projects_6_0= ruleWBSProject )
            	    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:188:3: lv_projects_6_0= ruleWBSProject
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWBSProgramAccess().getProjectsWBSProjectParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWBSProject_in_ruleWBSProgram351);
            	    lv_projects_6_0=ruleWBSProject();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWBSProgramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"projects",
            	            		lv_projects_6_0, 
            	            		"WBSProject");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:204:3: (otherlv_7= 'requirements' this_OPENCURLY_8= RULE_OPENCURLY ( ( ( ruleQualifiedName ) ) this_ENDLINE_10= RULE_ENDLINE )? this_CLOSEDCURLY_11= RULE_CLOSEDCURLY )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:204:5: otherlv_7= 'requirements' this_OPENCURLY_8= RULE_OPENCURLY ( ( ( ruleQualifiedName ) ) this_ENDLINE_10= RULE_ENDLINE )? this_CLOSEDCURLY_11= RULE_CLOSEDCURLY
                    {
                    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleWBSProgram365); 

                        	newLeafNode(otherlv_7, grammarAccess.getWBSProgramAccess().getRequirementsKeyword_6_0());
                        
                    this_OPENCURLY_8=(Token)match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_ruleWBSProgram376); 
                     
                        newLeafNode(this_OPENCURLY_8, grammarAccess.getWBSProgramAccess().getOPENCURLYTerminalRuleCall_6_1()); 
                        
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:212:1: ( ( ( ruleQualifiedName ) ) this_ENDLINE_10= RULE_ENDLINE )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==RULE_ID) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:212:2: ( ( ruleQualifiedName ) ) this_ENDLINE_10= RULE_ENDLINE
                            {
                            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:212:2: ( ( ruleQualifiedName ) )
                            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:213:1: ( ruleQualifiedName )
                            {
                            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:213:1: ( ruleQualifiedName )
                            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:214:3: ruleQualifiedName
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getWBSProgramRule());
                            	        }
                                    
                             
                            	        newCompositeNode(grammarAccess.getWBSProgramAccess().getRequirementsREQNodeCrossReference_6_2_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleQualifiedName_in_ruleWBSProgram399);
                            ruleQualifiedName();

                            state._fsp--;

                             
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            this_ENDLINE_10=(Token)match(input,RULE_ENDLINE,FOLLOW_RULE_ENDLINE_in_ruleWBSProgram410); 
                             
                                newLeafNode(this_ENDLINE_10, grammarAccess.getWBSProgramAccess().getENDLINETerminalRuleCall_6_2_1()); 
                                

                            }
                            break;

                    }

                    this_CLOSEDCURLY_11=(Token)match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_ruleWBSProgram422); 
                     
                        newLeafNode(this_CLOSEDCURLY_11, grammarAccess.getWBSProgramAccess().getCLOSEDCURLYTerminalRuleCall_6_3()); 
                        

                    }
                    break;

            }

            this_CLOSEDCURLY_12=(Token)match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_ruleWBSProgram434); 
             
                newLeafNode(this_CLOSEDCURLY_12, grammarAccess.getWBSProgramAccess().getCLOSEDCURLYTerminalRuleCall_7()); 
                

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
    // $ANTLR end "ruleWBSProgram"


    // $ANTLR start "entryRuleWBSProject"
    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:247:1: entryRuleWBSProject returns [EObject current=null] : iv_ruleWBSProject= ruleWBSProject EOF ;
    public final EObject entryRuleWBSProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWBSProject = null;


        try {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:248:2: (iv_ruleWBSProject= ruleWBSProject EOF )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:249:2: iv_ruleWBSProject= ruleWBSProject EOF
            {
             newCompositeNode(grammarAccess.getWBSProjectRule()); 
            pushFollow(FOLLOW_ruleWBSProject_in_entryRuleWBSProject469);
            iv_ruleWBSProject=ruleWBSProject();

            state._fsp--;

             current =iv_ruleWBSProject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWBSProject479); 

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
    // $ANTLR end "entryRuleWBSProject"


    // $ANTLR start "ruleWBSProject"
    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:256:1: ruleWBSProject returns [EObject current=null] : ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Project ' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY ( ( (lv_requirementsModel_4_0= ruleRequirementImport ) ) this_ENDLINE_5= RULE_ENDLINE )* ( (lv_wbsNodes_6_0= ruleWBSNode ) )* (otherlv_7= 'requirements' this_OPENCURLY_8= RULE_OPENCURLY ( ( ( ruleQualifiedName ) ) this_ENDLINE_10= RULE_ENDLINE )? this_CLOSEDCURLY_11= RULE_CLOSEDCURLY )? this_CLOSEDCURLY_12= RULE_CLOSEDCURLY ) ;
    public final EObject ruleWBSProject() throws RecognitionException {
        EObject current = null;

        Token lv_description_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token this_OPENCURLY_3=null;
        Token this_ENDLINE_5=null;
        Token otherlv_7=null;
        Token this_OPENCURLY_8=null;
        Token this_ENDLINE_10=null;
        Token this_CLOSEDCURLY_11=null;
        Token this_CLOSEDCURLY_12=null;
        EObject lv_requirementsModel_4_0 = null;

        EObject lv_wbsNodes_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:259:28: ( ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Project ' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY ( ( (lv_requirementsModel_4_0= ruleRequirementImport ) ) this_ENDLINE_5= RULE_ENDLINE )* ( (lv_wbsNodes_6_0= ruleWBSNode ) )* (otherlv_7= 'requirements' this_OPENCURLY_8= RULE_OPENCURLY ( ( ( ruleQualifiedName ) ) this_ENDLINE_10= RULE_ENDLINE )? this_CLOSEDCURLY_11= RULE_CLOSEDCURLY )? this_CLOSEDCURLY_12= RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:260:1: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Project ' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY ( ( (lv_requirementsModel_4_0= ruleRequirementImport ) ) this_ENDLINE_5= RULE_ENDLINE )* ( (lv_wbsNodes_6_0= ruleWBSNode ) )* (otherlv_7= 'requirements' this_OPENCURLY_8= RULE_OPENCURLY ( ( ( ruleQualifiedName ) ) this_ENDLINE_10= RULE_ENDLINE )? this_CLOSEDCURLY_11= RULE_CLOSEDCURLY )? this_CLOSEDCURLY_12= RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:260:1: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Project ' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY ( ( (lv_requirementsModel_4_0= ruleRequirementImport ) ) this_ENDLINE_5= RULE_ENDLINE )* ( (lv_wbsNodes_6_0= ruleWBSNode ) )* (otherlv_7= 'requirements' this_OPENCURLY_8= RULE_OPENCURLY ( ( ( ruleQualifiedName ) ) this_ENDLINE_10= RULE_ENDLINE )? this_CLOSEDCURLY_11= RULE_CLOSEDCURLY )? this_CLOSEDCURLY_12= RULE_CLOSEDCURLY )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:260:2: ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Project ' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY ( ( (lv_requirementsModel_4_0= ruleRequirementImport ) ) this_ENDLINE_5= RULE_ENDLINE )* ( (lv_wbsNodes_6_0= ruleWBSNode ) )* (otherlv_7= 'requirements' this_OPENCURLY_8= RULE_OPENCURLY ( ( ( ruleQualifiedName ) ) this_ENDLINE_10= RULE_ENDLINE )? this_CLOSEDCURLY_11= RULE_CLOSEDCURLY )? this_CLOSEDCURLY_12= RULE_CLOSEDCURLY
            {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:260:2: ( (lv_description_0_0= RULE_ML_COMMENT ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ML_COMMENT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:261:1: (lv_description_0_0= RULE_ML_COMMENT )
                    {
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:261:1: (lv_description_0_0= RULE_ML_COMMENT )
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:262:3: lv_description_0_0= RULE_ML_COMMENT
                    {
                    lv_description_0_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_ruleWBSProject521); 

                    			newLeafNode(lv_description_0_0, grammarAccess.getWBSProjectAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWBSProjectRule());
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

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleWBSProject539); 

                	newLeafNode(otherlv_1, grammarAccess.getWBSProjectAccess().getProjectKeyword_1());
                
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:282:1: ( (lv_name_2_0= RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:283:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:283:1: (lv_name_2_0= RULE_ID )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:284:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWBSProject556); 

            			newLeafNode(lv_name_2_0, grammarAccess.getWBSProjectAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWBSProjectRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            this_OPENCURLY_3=(Token)match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_ruleWBSProject572); 
             
                newLeafNode(this_OPENCURLY_3, grammarAccess.getWBSProjectAccess().getOPENCURLYTerminalRuleCall_3()); 
                
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:304:1: ( ( (lv_requirementsModel_4_0= ruleRequirementImport ) ) this_ENDLINE_5= RULE_ENDLINE )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:304:2: ( (lv_requirementsModel_4_0= ruleRequirementImport ) ) this_ENDLINE_5= RULE_ENDLINE
            	    {
            	    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:304:2: ( (lv_requirementsModel_4_0= ruleRequirementImport ) )
            	    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:305:1: (lv_requirementsModel_4_0= ruleRequirementImport )
            	    {
            	    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:305:1: (lv_requirementsModel_4_0= ruleRequirementImport )
            	    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:306:3: lv_requirementsModel_4_0= ruleRequirementImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWBSProjectAccess().getRequirementsModelRequirementImportParserRuleCall_4_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRequirementImport_in_ruleWBSProject593);
            	    lv_requirementsModel_4_0=ruleRequirementImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWBSProjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"requirementsModel",
            	            		lv_requirementsModel_4_0, 
            	            		"RequirementImport");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    this_ENDLINE_5=(Token)match(input,RULE_ENDLINE,FOLLOW_RULE_ENDLINE_in_ruleWBSProject604); 
            	     
            	        newLeafNode(this_ENDLINE_5, grammarAccess.getWBSProjectAccess().getENDLINETerminalRuleCall_4_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:326:3: ( (lv_wbsNodes_6_0= ruleWBSNode ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ML_COMMENT||(LA9_0>=17 && LA9_0<=19)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:327:1: (lv_wbsNodes_6_0= ruleWBSNode )
            	    {
            	    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:327:1: (lv_wbsNodes_6_0= ruleWBSNode )
            	    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:328:3: lv_wbsNodes_6_0= ruleWBSNode
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWBSProjectAccess().getWbsNodesWBSNodeParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWBSNode_in_ruleWBSProject626);
            	    lv_wbsNodes_6_0=ruleWBSNode();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWBSProjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"wbsNodes",
            	            		lv_wbsNodes_6_0, 
            	            		"WBSNode");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:344:3: (otherlv_7= 'requirements' this_OPENCURLY_8= RULE_OPENCURLY ( ( ( ruleQualifiedName ) ) this_ENDLINE_10= RULE_ENDLINE )? this_CLOSEDCURLY_11= RULE_CLOSEDCURLY )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:344:5: otherlv_7= 'requirements' this_OPENCURLY_8= RULE_OPENCURLY ( ( ( ruleQualifiedName ) ) this_ENDLINE_10= RULE_ENDLINE )? this_CLOSEDCURLY_11= RULE_CLOSEDCURLY
                    {
                    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleWBSProject640); 

                        	newLeafNode(otherlv_7, grammarAccess.getWBSProjectAccess().getRequirementsKeyword_6_0());
                        
                    this_OPENCURLY_8=(Token)match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_ruleWBSProject651); 
                     
                        newLeafNode(this_OPENCURLY_8, grammarAccess.getWBSProjectAccess().getOPENCURLYTerminalRuleCall_6_1()); 
                        
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:352:1: ( ( ( ruleQualifiedName ) ) this_ENDLINE_10= RULE_ENDLINE )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==RULE_ID) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:352:2: ( ( ruleQualifiedName ) ) this_ENDLINE_10= RULE_ENDLINE
                            {
                            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:352:2: ( ( ruleQualifiedName ) )
                            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:353:1: ( ruleQualifiedName )
                            {
                            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:353:1: ( ruleQualifiedName )
                            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:354:3: ruleQualifiedName
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getWBSProjectRule());
                            	        }
                                    
                             
                            	        newCompositeNode(grammarAccess.getWBSProjectAccess().getRequirementsREQNodeCrossReference_6_2_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleQualifiedName_in_ruleWBSProject674);
                            ruleQualifiedName();

                            state._fsp--;

                             
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            this_ENDLINE_10=(Token)match(input,RULE_ENDLINE,FOLLOW_RULE_ENDLINE_in_ruleWBSProject685); 
                             
                                newLeafNode(this_ENDLINE_10, grammarAccess.getWBSProjectAccess().getENDLINETerminalRuleCall_6_2_1()); 
                                

                            }
                            break;

                    }

                    this_CLOSEDCURLY_11=(Token)match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_ruleWBSProject697); 
                     
                        newLeafNode(this_CLOSEDCURLY_11, grammarAccess.getWBSProjectAccess().getCLOSEDCURLYTerminalRuleCall_6_3()); 
                        

                    }
                    break;

            }

            this_CLOSEDCURLY_12=(Token)match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_ruleWBSProject709); 
             
                newLeafNode(this_CLOSEDCURLY_12, grammarAccess.getWBSProjectAccess().getCLOSEDCURLYTerminalRuleCall_7()); 
                

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
    // $ANTLR end "ruleWBSProject"


    // $ANTLR start "entryRuleWBSNode"
    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:387:1: entryRuleWBSNode returns [EObject current=null] : iv_ruleWBSNode= ruleWBSNode EOF ;
    public final EObject entryRuleWBSNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWBSNode = null;


        try {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:388:2: (iv_ruleWBSNode= ruleWBSNode EOF )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:389:2: iv_ruleWBSNode= ruleWBSNode EOF
            {
             newCompositeNode(grammarAccess.getWBSNodeRule()); 
            pushFollow(FOLLOW_ruleWBSNode_in_entryRuleWBSNode744);
            iv_ruleWBSNode=ruleWBSNode();

            state._fsp--;

             current =iv_ruleWBSNode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWBSNode754); 

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
    // $ANTLR end "entryRuleWBSNode"


    // $ANTLR start "ruleWBSNode"
    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:396:1: ruleWBSNode returns [EObject current=null] : (this_WBSActivity_0= ruleWBSActivity | this_WBSWorkPackage_1= ruleWBSWorkPackage | this_WBSDeliverable_2= ruleWBSDeliverable ) ;
    public final EObject ruleWBSNode() throws RecognitionException {
        EObject current = null;

        EObject this_WBSActivity_0 = null;

        EObject this_WBSWorkPackage_1 = null;

        EObject this_WBSDeliverable_2 = null;


         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:399:28: ( (this_WBSActivity_0= ruleWBSActivity | this_WBSWorkPackage_1= ruleWBSWorkPackage | this_WBSDeliverable_2= ruleWBSDeliverable ) )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:400:1: (this_WBSActivity_0= ruleWBSActivity | this_WBSWorkPackage_1= ruleWBSWorkPackage | this_WBSDeliverable_2= ruleWBSDeliverable )
            {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:400:1: (this_WBSActivity_0= ruleWBSActivity | this_WBSWorkPackage_1= ruleWBSWorkPackage | this_WBSDeliverable_2= ruleWBSDeliverable )
            int alt12=3;
            switch ( input.LA(1) ) {
            case RULE_ML_COMMENT:
                {
                switch ( input.LA(2) ) {
                case 18:
                    {
                    alt12=2;
                    }
                    break;
                case 19:
                    {
                    alt12=3;
                    }
                    break;
                case 17:
                    {
                    alt12=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }

                }
                break;
            case 17:
                {
                alt12=1;
                }
                break;
            case 18:
                {
                alt12=2;
                }
                break;
            case 19:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:401:5: this_WBSActivity_0= ruleWBSActivity
                    {
                     
                            newCompositeNode(grammarAccess.getWBSNodeAccess().getWBSActivityParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleWBSActivity_in_ruleWBSNode801);
                    this_WBSActivity_0=ruleWBSActivity();

                    state._fsp--;

                     
                            current = this_WBSActivity_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:411:5: this_WBSWorkPackage_1= ruleWBSWorkPackage
                    {
                     
                            newCompositeNode(grammarAccess.getWBSNodeAccess().getWBSWorkPackageParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleWBSWorkPackage_in_ruleWBSNode828);
                    this_WBSWorkPackage_1=ruleWBSWorkPackage();

                    state._fsp--;

                     
                            current = this_WBSWorkPackage_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:421:5: this_WBSDeliverable_2= ruleWBSDeliverable
                    {
                     
                            newCompositeNode(grammarAccess.getWBSNodeAccess().getWBSDeliverableParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleWBSDeliverable_in_ruleWBSNode855);
                    this_WBSDeliverable_2=ruleWBSDeliverable();

                    state._fsp--;

                     
                            current = this_WBSDeliverable_2; 
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
    // $ANTLR end "ruleWBSNode"


    // $ANTLR start "entryRuleWBSActivity"
    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:437:1: entryRuleWBSActivity returns [EObject current=null] : iv_ruleWBSActivity= ruleWBSActivity EOF ;
    public final EObject entryRuleWBSActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWBSActivity = null;


        try {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:438:2: (iv_ruleWBSActivity= ruleWBSActivity EOF )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:439:2: iv_ruleWBSActivity= ruleWBSActivity EOF
            {
             newCompositeNode(grammarAccess.getWBSActivityRule()); 
            pushFollow(FOLLOW_ruleWBSActivity_in_entryRuleWBSActivity890);
            iv_ruleWBSActivity=ruleWBSActivity();

            state._fsp--;

             current =iv_ruleWBSActivity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWBSActivity900); 

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
    // $ANTLR end "entryRuleWBSActivity"


    // $ANTLR start "ruleWBSActivity"
    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:446:1: ruleWBSActivity returns [EObject current=null] : ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Activity ' ( (lv_name_2_0= RULE_ID ) ) ( (this_OPENCURLY_3= RULE_OPENCURLY ( (lv_wbsNodes_4_0= ruleWBSNode ) )* (otherlv_5= 'requirements' this_OPENCURLY_6= RULE_OPENCURLY ( ( ( ruleQualifiedName ) ) this_ENDLINE_8= RULE_ENDLINE )? this_CLOSEDCURLY_9= RULE_CLOSEDCURLY )? this_CLOSEDCURLY_10= RULE_CLOSEDCURLY ) | this_ENDLINE_11= RULE_ENDLINE ) ) ;
    public final EObject ruleWBSActivity() throws RecognitionException {
        EObject current = null;

        Token lv_description_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token this_OPENCURLY_3=null;
        Token otherlv_5=null;
        Token this_OPENCURLY_6=null;
        Token this_ENDLINE_8=null;
        Token this_CLOSEDCURLY_9=null;
        Token this_CLOSEDCURLY_10=null;
        Token this_ENDLINE_11=null;
        EObject lv_wbsNodes_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:449:28: ( ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Activity ' ( (lv_name_2_0= RULE_ID ) ) ( (this_OPENCURLY_3= RULE_OPENCURLY ( (lv_wbsNodes_4_0= ruleWBSNode ) )* (otherlv_5= 'requirements' this_OPENCURLY_6= RULE_OPENCURLY ( ( ( ruleQualifiedName ) ) this_ENDLINE_8= RULE_ENDLINE )? this_CLOSEDCURLY_9= RULE_CLOSEDCURLY )? this_CLOSEDCURLY_10= RULE_CLOSEDCURLY ) | this_ENDLINE_11= RULE_ENDLINE ) ) )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:450:1: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Activity ' ( (lv_name_2_0= RULE_ID ) ) ( (this_OPENCURLY_3= RULE_OPENCURLY ( (lv_wbsNodes_4_0= ruleWBSNode ) )* (otherlv_5= 'requirements' this_OPENCURLY_6= RULE_OPENCURLY ( ( ( ruleQualifiedName ) ) this_ENDLINE_8= RULE_ENDLINE )? this_CLOSEDCURLY_9= RULE_CLOSEDCURLY )? this_CLOSEDCURLY_10= RULE_CLOSEDCURLY ) | this_ENDLINE_11= RULE_ENDLINE ) )
            {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:450:1: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Activity ' ( (lv_name_2_0= RULE_ID ) ) ( (this_OPENCURLY_3= RULE_OPENCURLY ( (lv_wbsNodes_4_0= ruleWBSNode ) )* (otherlv_5= 'requirements' this_OPENCURLY_6= RULE_OPENCURLY ( ( ( ruleQualifiedName ) ) this_ENDLINE_8= RULE_ENDLINE )? this_CLOSEDCURLY_9= RULE_CLOSEDCURLY )? this_CLOSEDCURLY_10= RULE_CLOSEDCURLY ) | this_ENDLINE_11= RULE_ENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:450:2: ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Activity ' ( (lv_name_2_0= RULE_ID ) ) ( (this_OPENCURLY_3= RULE_OPENCURLY ( (lv_wbsNodes_4_0= ruleWBSNode ) )* (otherlv_5= 'requirements' this_OPENCURLY_6= RULE_OPENCURLY ( ( ( ruleQualifiedName ) ) this_ENDLINE_8= RULE_ENDLINE )? this_CLOSEDCURLY_9= RULE_CLOSEDCURLY )? this_CLOSEDCURLY_10= RULE_CLOSEDCURLY ) | this_ENDLINE_11= RULE_ENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:450:2: ( (lv_description_0_0= RULE_ML_COMMENT ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ML_COMMENT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:451:1: (lv_description_0_0= RULE_ML_COMMENT )
                    {
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:451:1: (lv_description_0_0= RULE_ML_COMMENT )
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:452:3: lv_description_0_0= RULE_ML_COMMENT
                    {
                    lv_description_0_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_ruleWBSActivity942); 

                    			newLeafNode(lv_description_0_0, grammarAccess.getWBSActivityAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWBSActivityRule());
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

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleWBSActivity960); 

                	newLeafNode(otherlv_1, grammarAccess.getWBSActivityAccess().getActivityKeyword_1());
                
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:472:1: ( (lv_name_2_0= RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:473:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:473:1: (lv_name_2_0= RULE_ID )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:474:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWBSActivity977); 

            			newLeafNode(lv_name_2_0, grammarAccess.getWBSActivityAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWBSActivityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:490:2: ( (this_OPENCURLY_3= RULE_OPENCURLY ( (lv_wbsNodes_4_0= ruleWBSNode ) )* (otherlv_5= 'requirements' this_OPENCURLY_6= RULE_OPENCURLY ( ( ( ruleQualifiedName ) ) this_ENDLINE_8= RULE_ENDLINE )? this_CLOSEDCURLY_9= RULE_CLOSEDCURLY )? this_CLOSEDCURLY_10= RULE_CLOSEDCURLY ) | this_ENDLINE_11= RULE_ENDLINE )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_OPENCURLY) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_ENDLINE) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:490:3: (this_OPENCURLY_3= RULE_OPENCURLY ( (lv_wbsNodes_4_0= ruleWBSNode ) )* (otherlv_5= 'requirements' this_OPENCURLY_6= RULE_OPENCURLY ( ( ( ruleQualifiedName ) ) this_ENDLINE_8= RULE_ENDLINE )? this_CLOSEDCURLY_9= RULE_CLOSEDCURLY )? this_CLOSEDCURLY_10= RULE_CLOSEDCURLY )
                    {
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:490:3: (this_OPENCURLY_3= RULE_OPENCURLY ( (lv_wbsNodes_4_0= ruleWBSNode ) )* (otherlv_5= 'requirements' this_OPENCURLY_6= RULE_OPENCURLY ( ( ( ruleQualifiedName ) ) this_ENDLINE_8= RULE_ENDLINE )? this_CLOSEDCURLY_9= RULE_CLOSEDCURLY )? this_CLOSEDCURLY_10= RULE_CLOSEDCURLY )
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:490:4: this_OPENCURLY_3= RULE_OPENCURLY ( (lv_wbsNodes_4_0= ruleWBSNode ) )* (otherlv_5= 'requirements' this_OPENCURLY_6= RULE_OPENCURLY ( ( ( ruleQualifiedName ) ) this_ENDLINE_8= RULE_ENDLINE )? this_CLOSEDCURLY_9= RULE_CLOSEDCURLY )? this_CLOSEDCURLY_10= RULE_CLOSEDCURLY
                    {
                    this_OPENCURLY_3=(Token)match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_ruleWBSActivity995); 
                     
                        newLeafNode(this_OPENCURLY_3, grammarAccess.getWBSActivityAccess().getOPENCURLYTerminalRuleCall_3_0_0()); 
                        
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:494:1: ( (lv_wbsNodes_4_0= ruleWBSNode ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==RULE_ML_COMMENT||(LA14_0>=17 && LA14_0<=19)) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:495:1: (lv_wbsNodes_4_0= ruleWBSNode )
                    	    {
                    	    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:495:1: (lv_wbsNodes_4_0= ruleWBSNode )
                    	    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:496:3: lv_wbsNodes_4_0= ruleWBSNode
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getWBSActivityAccess().getWbsNodesWBSNodeParserRuleCall_3_0_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleWBSNode_in_ruleWBSActivity1015);
                    	    lv_wbsNodes_4_0=ruleWBSNode();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getWBSActivityRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"wbsNodes",
                    	            		lv_wbsNodes_4_0, 
                    	            		"WBSNode");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:512:3: (otherlv_5= 'requirements' this_OPENCURLY_6= RULE_OPENCURLY ( ( ( ruleQualifiedName ) ) this_ENDLINE_8= RULE_ENDLINE )? this_CLOSEDCURLY_9= RULE_CLOSEDCURLY )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==15) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:512:5: otherlv_5= 'requirements' this_OPENCURLY_6= RULE_OPENCURLY ( ( ( ruleQualifiedName ) ) this_ENDLINE_8= RULE_ENDLINE )? this_CLOSEDCURLY_9= RULE_CLOSEDCURLY
                            {
                            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleWBSActivity1029); 

                                	newLeafNode(otherlv_5, grammarAccess.getWBSActivityAccess().getRequirementsKeyword_3_0_2_0());
                                
                            this_OPENCURLY_6=(Token)match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_ruleWBSActivity1040); 
                             
                                newLeafNode(this_OPENCURLY_6, grammarAccess.getWBSActivityAccess().getOPENCURLYTerminalRuleCall_3_0_2_1()); 
                                
                            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:520:1: ( ( ( ruleQualifiedName ) ) this_ENDLINE_8= RULE_ENDLINE )?
                            int alt15=2;
                            int LA15_0 = input.LA(1);

                            if ( (LA15_0==RULE_ID) ) {
                                alt15=1;
                            }
                            switch (alt15) {
                                case 1 :
                                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:520:2: ( ( ruleQualifiedName ) ) this_ENDLINE_8= RULE_ENDLINE
                                    {
                                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:520:2: ( ( ruleQualifiedName ) )
                                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:521:1: ( ruleQualifiedName )
                                    {
                                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:521:1: ( ruleQualifiedName )
                                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:522:3: ruleQualifiedName
                                    {

                                    			if (current==null) {
                                    	            current = createModelElement(grammarAccess.getWBSActivityRule());
                                    	        }
                                            
                                     
                                    	        newCompositeNode(grammarAccess.getWBSActivityAccess().getRequirementsREQNodeCrossReference_3_0_2_2_0_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleWBSActivity1063);
                                    ruleQualifiedName();

                                    state._fsp--;

                                     
                                    	        afterParserOrEnumRuleCall();
                                    	    

                                    }


                                    }

                                    this_ENDLINE_8=(Token)match(input,RULE_ENDLINE,FOLLOW_RULE_ENDLINE_in_ruleWBSActivity1074); 
                                     
                                        newLeafNode(this_ENDLINE_8, grammarAccess.getWBSActivityAccess().getENDLINETerminalRuleCall_3_0_2_2_1()); 
                                        

                                    }
                                    break;

                            }

                            this_CLOSEDCURLY_9=(Token)match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_ruleWBSActivity1086); 
                             
                                newLeafNode(this_CLOSEDCURLY_9, grammarAccess.getWBSActivityAccess().getCLOSEDCURLYTerminalRuleCall_3_0_2_3()); 
                                

                            }
                            break;

                    }

                    this_CLOSEDCURLY_10=(Token)match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_ruleWBSActivity1098); 
                     
                        newLeafNode(this_CLOSEDCURLY_10, grammarAccess.getWBSActivityAccess().getCLOSEDCURLYTerminalRuleCall_3_0_3()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:548:6: this_ENDLINE_11= RULE_ENDLINE
                    {
                    this_ENDLINE_11=(Token)match(input,RULE_ENDLINE,FOLLOW_RULE_ENDLINE_in_ruleWBSActivity1115); 
                     
                        newLeafNode(this_ENDLINE_11, grammarAccess.getWBSActivityAccess().getENDLINETerminalRuleCall_3_1()); 
                        

                    }
                    break;

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
    // $ANTLR end "ruleWBSActivity"


    // $ANTLR start "entryRuleWBSWorkPackage"
    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:560:1: entryRuleWBSWorkPackage returns [EObject current=null] : iv_ruleWBSWorkPackage= ruleWBSWorkPackage EOF ;
    public final EObject entryRuleWBSWorkPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWBSWorkPackage = null;


        try {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:561:2: (iv_ruleWBSWorkPackage= ruleWBSWorkPackage EOF )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:562:2: iv_ruleWBSWorkPackage= ruleWBSWorkPackage EOF
            {
             newCompositeNode(grammarAccess.getWBSWorkPackageRule()); 
            pushFollow(FOLLOW_ruleWBSWorkPackage_in_entryRuleWBSWorkPackage1151);
            iv_ruleWBSWorkPackage=ruleWBSWorkPackage();

            state._fsp--;

             current =iv_ruleWBSWorkPackage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWBSWorkPackage1161); 

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
    // $ANTLR end "entryRuleWBSWorkPackage"


    // $ANTLR start "ruleWBSWorkPackage"
    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:569:1: ruleWBSWorkPackage returns [EObject current=null] : ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'WorkPackage ' ( (lv_name_2_0= RULE_ID ) ) ( (this_OPENCURLY_3= RULE_OPENCURLY ( (lv_wbsNodes_4_0= ruleWBSNode ) )* (otherlv_5= 'requirements' this_OPENCURLY_6= RULE_OPENCURLY ( ( ( ruleQualifiedName ) ) this_ENDLINE_8= RULE_ENDLINE )? this_CLOSEDCURLY_9= RULE_CLOSEDCURLY )? this_CLOSEDCURLY_10= RULE_CLOSEDCURLY ) | this_ENDLINE_11= RULE_ENDLINE ) ) ;
    public final EObject ruleWBSWorkPackage() throws RecognitionException {
        EObject current = null;

        Token lv_description_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token this_OPENCURLY_3=null;
        Token otherlv_5=null;
        Token this_OPENCURLY_6=null;
        Token this_ENDLINE_8=null;
        Token this_CLOSEDCURLY_9=null;
        Token this_CLOSEDCURLY_10=null;
        Token this_ENDLINE_11=null;
        EObject lv_wbsNodes_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:572:28: ( ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'WorkPackage ' ( (lv_name_2_0= RULE_ID ) ) ( (this_OPENCURLY_3= RULE_OPENCURLY ( (lv_wbsNodes_4_0= ruleWBSNode ) )* (otherlv_5= 'requirements' this_OPENCURLY_6= RULE_OPENCURLY ( ( ( ruleQualifiedName ) ) this_ENDLINE_8= RULE_ENDLINE )? this_CLOSEDCURLY_9= RULE_CLOSEDCURLY )? this_CLOSEDCURLY_10= RULE_CLOSEDCURLY ) | this_ENDLINE_11= RULE_ENDLINE ) ) )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:573:1: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'WorkPackage ' ( (lv_name_2_0= RULE_ID ) ) ( (this_OPENCURLY_3= RULE_OPENCURLY ( (lv_wbsNodes_4_0= ruleWBSNode ) )* (otherlv_5= 'requirements' this_OPENCURLY_6= RULE_OPENCURLY ( ( ( ruleQualifiedName ) ) this_ENDLINE_8= RULE_ENDLINE )? this_CLOSEDCURLY_9= RULE_CLOSEDCURLY )? this_CLOSEDCURLY_10= RULE_CLOSEDCURLY ) | this_ENDLINE_11= RULE_ENDLINE ) )
            {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:573:1: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'WorkPackage ' ( (lv_name_2_0= RULE_ID ) ) ( (this_OPENCURLY_3= RULE_OPENCURLY ( (lv_wbsNodes_4_0= ruleWBSNode ) )* (otherlv_5= 'requirements' this_OPENCURLY_6= RULE_OPENCURLY ( ( ( ruleQualifiedName ) ) this_ENDLINE_8= RULE_ENDLINE )? this_CLOSEDCURLY_9= RULE_CLOSEDCURLY )? this_CLOSEDCURLY_10= RULE_CLOSEDCURLY ) | this_ENDLINE_11= RULE_ENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:573:2: ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'WorkPackage ' ( (lv_name_2_0= RULE_ID ) ) ( (this_OPENCURLY_3= RULE_OPENCURLY ( (lv_wbsNodes_4_0= ruleWBSNode ) )* (otherlv_5= 'requirements' this_OPENCURLY_6= RULE_OPENCURLY ( ( ( ruleQualifiedName ) ) this_ENDLINE_8= RULE_ENDLINE )? this_CLOSEDCURLY_9= RULE_CLOSEDCURLY )? this_CLOSEDCURLY_10= RULE_CLOSEDCURLY ) | this_ENDLINE_11= RULE_ENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:573:2: ( (lv_description_0_0= RULE_ML_COMMENT ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ML_COMMENT) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:574:1: (lv_description_0_0= RULE_ML_COMMENT )
                    {
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:574:1: (lv_description_0_0= RULE_ML_COMMENT )
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:575:3: lv_description_0_0= RULE_ML_COMMENT
                    {
                    lv_description_0_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_ruleWBSWorkPackage1203); 

                    			newLeafNode(lv_description_0_0, grammarAccess.getWBSWorkPackageAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWBSWorkPackageRule());
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

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleWBSWorkPackage1221); 

                	newLeafNode(otherlv_1, grammarAccess.getWBSWorkPackageAccess().getWorkPackageKeyword_1());
                
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:595:1: ( (lv_name_2_0= RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:596:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:596:1: (lv_name_2_0= RULE_ID )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:597:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWBSWorkPackage1238); 

            			newLeafNode(lv_name_2_0, grammarAccess.getWBSWorkPackageAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWBSWorkPackageRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:613:2: ( (this_OPENCURLY_3= RULE_OPENCURLY ( (lv_wbsNodes_4_0= ruleWBSNode ) )* (otherlv_5= 'requirements' this_OPENCURLY_6= RULE_OPENCURLY ( ( ( ruleQualifiedName ) ) this_ENDLINE_8= RULE_ENDLINE )? this_CLOSEDCURLY_9= RULE_CLOSEDCURLY )? this_CLOSEDCURLY_10= RULE_CLOSEDCURLY ) | this_ENDLINE_11= RULE_ENDLINE )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_OPENCURLY) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_ENDLINE) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:613:3: (this_OPENCURLY_3= RULE_OPENCURLY ( (lv_wbsNodes_4_0= ruleWBSNode ) )* (otherlv_5= 'requirements' this_OPENCURLY_6= RULE_OPENCURLY ( ( ( ruleQualifiedName ) ) this_ENDLINE_8= RULE_ENDLINE )? this_CLOSEDCURLY_9= RULE_CLOSEDCURLY )? this_CLOSEDCURLY_10= RULE_CLOSEDCURLY )
                    {
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:613:3: (this_OPENCURLY_3= RULE_OPENCURLY ( (lv_wbsNodes_4_0= ruleWBSNode ) )* (otherlv_5= 'requirements' this_OPENCURLY_6= RULE_OPENCURLY ( ( ( ruleQualifiedName ) ) this_ENDLINE_8= RULE_ENDLINE )? this_CLOSEDCURLY_9= RULE_CLOSEDCURLY )? this_CLOSEDCURLY_10= RULE_CLOSEDCURLY )
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:613:4: this_OPENCURLY_3= RULE_OPENCURLY ( (lv_wbsNodes_4_0= ruleWBSNode ) )* (otherlv_5= 'requirements' this_OPENCURLY_6= RULE_OPENCURLY ( ( ( ruleQualifiedName ) ) this_ENDLINE_8= RULE_ENDLINE )? this_CLOSEDCURLY_9= RULE_CLOSEDCURLY )? this_CLOSEDCURLY_10= RULE_CLOSEDCURLY
                    {
                    this_OPENCURLY_3=(Token)match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_ruleWBSWorkPackage1256); 
                     
                        newLeafNode(this_OPENCURLY_3, grammarAccess.getWBSWorkPackageAccess().getOPENCURLYTerminalRuleCall_3_0_0()); 
                        
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:617:1: ( (lv_wbsNodes_4_0= ruleWBSNode ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==RULE_ML_COMMENT||(LA19_0>=17 && LA19_0<=19)) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:618:1: (lv_wbsNodes_4_0= ruleWBSNode )
                    	    {
                    	    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:618:1: (lv_wbsNodes_4_0= ruleWBSNode )
                    	    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:619:3: lv_wbsNodes_4_0= ruleWBSNode
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getWBSWorkPackageAccess().getWbsNodesWBSNodeParserRuleCall_3_0_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleWBSNode_in_ruleWBSWorkPackage1276);
                    	    lv_wbsNodes_4_0=ruleWBSNode();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getWBSWorkPackageRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"wbsNodes",
                    	            		lv_wbsNodes_4_0, 
                    	            		"WBSNode");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:635:3: (otherlv_5= 'requirements' this_OPENCURLY_6= RULE_OPENCURLY ( ( ( ruleQualifiedName ) ) this_ENDLINE_8= RULE_ENDLINE )? this_CLOSEDCURLY_9= RULE_CLOSEDCURLY )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==15) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:635:5: otherlv_5= 'requirements' this_OPENCURLY_6= RULE_OPENCURLY ( ( ( ruleQualifiedName ) ) this_ENDLINE_8= RULE_ENDLINE )? this_CLOSEDCURLY_9= RULE_CLOSEDCURLY
                            {
                            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleWBSWorkPackage1290); 

                                	newLeafNode(otherlv_5, grammarAccess.getWBSWorkPackageAccess().getRequirementsKeyword_3_0_2_0());
                                
                            this_OPENCURLY_6=(Token)match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_ruleWBSWorkPackage1301); 
                             
                                newLeafNode(this_OPENCURLY_6, grammarAccess.getWBSWorkPackageAccess().getOPENCURLYTerminalRuleCall_3_0_2_1()); 
                                
                            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:643:1: ( ( ( ruleQualifiedName ) ) this_ENDLINE_8= RULE_ENDLINE )?
                            int alt20=2;
                            int LA20_0 = input.LA(1);

                            if ( (LA20_0==RULE_ID) ) {
                                alt20=1;
                            }
                            switch (alt20) {
                                case 1 :
                                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:643:2: ( ( ruleQualifiedName ) ) this_ENDLINE_8= RULE_ENDLINE
                                    {
                                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:643:2: ( ( ruleQualifiedName ) )
                                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:644:1: ( ruleQualifiedName )
                                    {
                                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:644:1: ( ruleQualifiedName )
                                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:645:3: ruleQualifiedName
                                    {

                                    			if (current==null) {
                                    	            current = createModelElement(grammarAccess.getWBSWorkPackageRule());
                                    	        }
                                            
                                     
                                    	        newCompositeNode(grammarAccess.getWBSWorkPackageAccess().getRequirementsREQNodeCrossReference_3_0_2_2_0_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleWBSWorkPackage1324);
                                    ruleQualifiedName();

                                    state._fsp--;

                                     
                                    	        afterParserOrEnumRuleCall();
                                    	    

                                    }


                                    }

                                    this_ENDLINE_8=(Token)match(input,RULE_ENDLINE,FOLLOW_RULE_ENDLINE_in_ruleWBSWorkPackage1335); 
                                     
                                        newLeafNode(this_ENDLINE_8, grammarAccess.getWBSWorkPackageAccess().getENDLINETerminalRuleCall_3_0_2_2_1()); 
                                        

                                    }
                                    break;

                            }

                            this_CLOSEDCURLY_9=(Token)match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_ruleWBSWorkPackage1347); 
                             
                                newLeafNode(this_CLOSEDCURLY_9, grammarAccess.getWBSWorkPackageAccess().getCLOSEDCURLYTerminalRuleCall_3_0_2_3()); 
                                

                            }
                            break;

                    }

                    this_CLOSEDCURLY_10=(Token)match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_ruleWBSWorkPackage1359); 
                     
                        newLeafNode(this_CLOSEDCURLY_10, grammarAccess.getWBSWorkPackageAccess().getCLOSEDCURLYTerminalRuleCall_3_0_3()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:671:6: this_ENDLINE_11= RULE_ENDLINE
                    {
                    this_ENDLINE_11=(Token)match(input,RULE_ENDLINE,FOLLOW_RULE_ENDLINE_in_ruleWBSWorkPackage1376); 
                     
                        newLeafNode(this_ENDLINE_11, grammarAccess.getWBSWorkPackageAccess().getENDLINETerminalRuleCall_3_1()); 
                        

                    }
                    break;

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
    // $ANTLR end "ruleWBSWorkPackage"


    // $ANTLR start "entryRuleWBSDeliverable"
    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:683:1: entryRuleWBSDeliverable returns [EObject current=null] : iv_ruleWBSDeliverable= ruleWBSDeliverable EOF ;
    public final EObject entryRuleWBSDeliverable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWBSDeliverable = null;


        try {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:684:2: (iv_ruleWBSDeliverable= ruleWBSDeliverable EOF )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:685:2: iv_ruleWBSDeliverable= ruleWBSDeliverable EOF
            {
             newCompositeNode(grammarAccess.getWBSDeliverableRule()); 
            pushFollow(FOLLOW_ruleWBSDeliverable_in_entryRuleWBSDeliverable1412);
            iv_ruleWBSDeliverable=ruleWBSDeliverable();

            state._fsp--;

             current =iv_ruleWBSDeliverable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWBSDeliverable1422); 

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
    // $ANTLR end "entryRuleWBSDeliverable"


    // $ANTLR start "ruleWBSDeliverable"
    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:692:1: ruleWBSDeliverable returns [EObject current=null] : ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Deliverable ' ( (lv_name_2_0= RULE_ID ) ) ( (this_OPENCURLY_3= RULE_OPENCURLY ( (lv_wbsNodes_4_0= ruleWBSNode ) )* (otherlv_5= 'requirements' this_OPENCURLY_6= RULE_OPENCURLY ( ( ( ruleQualifiedName ) ) this_ENDLINE_8= RULE_ENDLINE )? this_CLOSEDCURLY_9= RULE_CLOSEDCURLY )? this_CLOSEDCURLY_10= RULE_CLOSEDCURLY ) | this_ENDLINE_11= RULE_ENDLINE ) ) ;
    public final EObject ruleWBSDeliverable() throws RecognitionException {
        EObject current = null;

        Token lv_description_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token this_OPENCURLY_3=null;
        Token otherlv_5=null;
        Token this_OPENCURLY_6=null;
        Token this_ENDLINE_8=null;
        Token this_CLOSEDCURLY_9=null;
        Token this_CLOSEDCURLY_10=null;
        Token this_ENDLINE_11=null;
        EObject lv_wbsNodes_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:695:28: ( ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Deliverable ' ( (lv_name_2_0= RULE_ID ) ) ( (this_OPENCURLY_3= RULE_OPENCURLY ( (lv_wbsNodes_4_0= ruleWBSNode ) )* (otherlv_5= 'requirements' this_OPENCURLY_6= RULE_OPENCURLY ( ( ( ruleQualifiedName ) ) this_ENDLINE_8= RULE_ENDLINE )? this_CLOSEDCURLY_9= RULE_CLOSEDCURLY )? this_CLOSEDCURLY_10= RULE_CLOSEDCURLY ) | this_ENDLINE_11= RULE_ENDLINE ) ) )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:696:1: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Deliverable ' ( (lv_name_2_0= RULE_ID ) ) ( (this_OPENCURLY_3= RULE_OPENCURLY ( (lv_wbsNodes_4_0= ruleWBSNode ) )* (otherlv_5= 'requirements' this_OPENCURLY_6= RULE_OPENCURLY ( ( ( ruleQualifiedName ) ) this_ENDLINE_8= RULE_ENDLINE )? this_CLOSEDCURLY_9= RULE_CLOSEDCURLY )? this_CLOSEDCURLY_10= RULE_CLOSEDCURLY ) | this_ENDLINE_11= RULE_ENDLINE ) )
            {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:696:1: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Deliverable ' ( (lv_name_2_0= RULE_ID ) ) ( (this_OPENCURLY_3= RULE_OPENCURLY ( (lv_wbsNodes_4_0= ruleWBSNode ) )* (otherlv_5= 'requirements' this_OPENCURLY_6= RULE_OPENCURLY ( ( ( ruleQualifiedName ) ) this_ENDLINE_8= RULE_ENDLINE )? this_CLOSEDCURLY_9= RULE_CLOSEDCURLY )? this_CLOSEDCURLY_10= RULE_CLOSEDCURLY ) | this_ENDLINE_11= RULE_ENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:696:2: ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Deliverable ' ( (lv_name_2_0= RULE_ID ) ) ( (this_OPENCURLY_3= RULE_OPENCURLY ( (lv_wbsNodes_4_0= ruleWBSNode ) )* (otherlv_5= 'requirements' this_OPENCURLY_6= RULE_OPENCURLY ( ( ( ruleQualifiedName ) ) this_ENDLINE_8= RULE_ENDLINE )? this_CLOSEDCURLY_9= RULE_CLOSEDCURLY )? this_CLOSEDCURLY_10= RULE_CLOSEDCURLY ) | this_ENDLINE_11= RULE_ENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:696:2: ( (lv_description_0_0= RULE_ML_COMMENT ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ML_COMMENT) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:697:1: (lv_description_0_0= RULE_ML_COMMENT )
                    {
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:697:1: (lv_description_0_0= RULE_ML_COMMENT )
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:698:3: lv_description_0_0= RULE_ML_COMMENT
                    {
                    lv_description_0_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_ruleWBSDeliverable1464); 

                    			newLeafNode(lv_description_0_0, grammarAccess.getWBSDeliverableAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWBSDeliverableRule());
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

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleWBSDeliverable1482); 

                	newLeafNode(otherlv_1, grammarAccess.getWBSDeliverableAccess().getDeliverableKeyword_1());
                
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:718:1: ( (lv_name_2_0= RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:719:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:719:1: (lv_name_2_0= RULE_ID )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:720:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWBSDeliverable1499); 

            			newLeafNode(lv_name_2_0, grammarAccess.getWBSDeliverableAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWBSDeliverableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:736:2: ( (this_OPENCURLY_3= RULE_OPENCURLY ( (lv_wbsNodes_4_0= ruleWBSNode ) )* (otherlv_5= 'requirements' this_OPENCURLY_6= RULE_OPENCURLY ( ( ( ruleQualifiedName ) ) this_ENDLINE_8= RULE_ENDLINE )? this_CLOSEDCURLY_9= RULE_CLOSEDCURLY )? this_CLOSEDCURLY_10= RULE_CLOSEDCURLY ) | this_ENDLINE_11= RULE_ENDLINE )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_OPENCURLY) ) {
                alt27=1;
            }
            else if ( (LA27_0==RULE_ENDLINE) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:736:3: (this_OPENCURLY_3= RULE_OPENCURLY ( (lv_wbsNodes_4_0= ruleWBSNode ) )* (otherlv_5= 'requirements' this_OPENCURLY_6= RULE_OPENCURLY ( ( ( ruleQualifiedName ) ) this_ENDLINE_8= RULE_ENDLINE )? this_CLOSEDCURLY_9= RULE_CLOSEDCURLY )? this_CLOSEDCURLY_10= RULE_CLOSEDCURLY )
                    {
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:736:3: (this_OPENCURLY_3= RULE_OPENCURLY ( (lv_wbsNodes_4_0= ruleWBSNode ) )* (otherlv_5= 'requirements' this_OPENCURLY_6= RULE_OPENCURLY ( ( ( ruleQualifiedName ) ) this_ENDLINE_8= RULE_ENDLINE )? this_CLOSEDCURLY_9= RULE_CLOSEDCURLY )? this_CLOSEDCURLY_10= RULE_CLOSEDCURLY )
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:736:4: this_OPENCURLY_3= RULE_OPENCURLY ( (lv_wbsNodes_4_0= ruleWBSNode ) )* (otherlv_5= 'requirements' this_OPENCURLY_6= RULE_OPENCURLY ( ( ( ruleQualifiedName ) ) this_ENDLINE_8= RULE_ENDLINE )? this_CLOSEDCURLY_9= RULE_CLOSEDCURLY )? this_CLOSEDCURLY_10= RULE_CLOSEDCURLY
                    {
                    this_OPENCURLY_3=(Token)match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_ruleWBSDeliverable1517); 
                     
                        newLeafNode(this_OPENCURLY_3, grammarAccess.getWBSDeliverableAccess().getOPENCURLYTerminalRuleCall_3_0_0()); 
                        
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:740:1: ( (lv_wbsNodes_4_0= ruleWBSNode ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==RULE_ML_COMMENT||(LA24_0>=17 && LA24_0<=19)) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:741:1: (lv_wbsNodes_4_0= ruleWBSNode )
                    	    {
                    	    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:741:1: (lv_wbsNodes_4_0= ruleWBSNode )
                    	    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:742:3: lv_wbsNodes_4_0= ruleWBSNode
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getWBSDeliverableAccess().getWbsNodesWBSNodeParserRuleCall_3_0_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleWBSNode_in_ruleWBSDeliverable1537);
                    	    lv_wbsNodes_4_0=ruleWBSNode();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getWBSDeliverableRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"wbsNodes",
                    	            		lv_wbsNodes_4_0, 
                    	            		"WBSNode");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:758:3: (otherlv_5= 'requirements' this_OPENCURLY_6= RULE_OPENCURLY ( ( ( ruleQualifiedName ) ) this_ENDLINE_8= RULE_ENDLINE )? this_CLOSEDCURLY_9= RULE_CLOSEDCURLY )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==15) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:758:5: otherlv_5= 'requirements' this_OPENCURLY_6= RULE_OPENCURLY ( ( ( ruleQualifiedName ) ) this_ENDLINE_8= RULE_ENDLINE )? this_CLOSEDCURLY_9= RULE_CLOSEDCURLY
                            {
                            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleWBSDeliverable1551); 

                                	newLeafNode(otherlv_5, grammarAccess.getWBSDeliverableAccess().getRequirementsKeyword_3_0_2_0());
                                
                            this_OPENCURLY_6=(Token)match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_ruleWBSDeliverable1562); 
                             
                                newLeafNode(this_OPENCURLY_6, grammarAccess.getWBSDeliverableAccess().getOPENCURLYTerminalRuleCall_3_0_2_1()); 
                                
                            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:766:1: ( ( ( ruleQualifiedName ) ) this_ENDLINE_8= RULE_ENDLINE )?
                            int alt25=2;
                            int LA25_0 = input.LA(1);

                            if ( (LA25_0==RULE_ID) ) {
                                alt25=1;
                            }
                            switch (alt25) {
                                case 1 :
                                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:766:2: ( ( ruleQualifiedName ) ) this_ENDLINE_8= RULE_ENDLINE
                                    {
                                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:766:2: ( ( ruleQualifiedName ) )
                                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:767:1: ( ruleQualifiedName )
                                    {
                                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:767:1: ( ruleQualifiedName )
                                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:768:3: ruleQualifiedName
                                    {

                                    			if (current==null) {
                                    	            current = createModelElement(grammarAccess.getWBSDeliverableRule());
                                    	        }
                                            
                                     
                                    	        newCompositeNode(grammarAccess.getWBSDeliverableAccess().getRequirementsREQNodeCrossReference_3_0_2_2_0_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleWBSDeliverable1585);
                                    ruleQualifiedName();

                                    state._fsp--;

                                     
                                    	        afterParserOrEnumRuleCall();
                                    	    

                                    }


                                    }

                                    this_ENDLINE_8=(Token)match(input,RULE_ENDLINE,FOLLOW_RULE_ENDLINE_in_ruleWBSDeliverable1596); 
                                     
                                        newLeafNode(this_ENDLINE_8, grammarAccess.getWBSDeliverableAccess().getENDLINETerminalRuleCall_3_0_2_2_1()); 
                                        

                                    }
                                    break;

                            }

                            this_CLOSEDCURLY_9=(Token)match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_ruleWBSDeliverable1608); 
                             
                                newLeafNode(this_CLOSEDCURLY_9, grammarAccess.getWBSDeliverableAccess().getCLOSEDCURLYTerminalRuleCall_3_0_2_3()); 
                                

                            }
                            break;

                    }

                    this_CLOSEDCURLY_10=(Token)match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_ruleWBSDeliverable1620); 
                     
                        newLeafNode(this_CLOSEDCURLY_10, grammarAccess.getWBSDeliverableAccess().getCLOSEDCURLYTerminalRuleCall_3_0_3()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:794:6: this_ENDLINE_11= RULE_ENDLINE
                    {
                    this_ENDLINE_11=(Token)match(input,RULE_ENDLINE,FOLLOW_RULE_ENDLINE_in_ruleWBSDeliverable1637); 
                     
                        newLeafNode(this_ENDLINE_11, grammarAccess.getWBSDeliverableAccess().getENDLINETerminalRuleCall_3_1()); 
                        

                    }
                    break;

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
    // $ANTLR end "ruleWBSDeliverable"


    // $ANTLR start "entryRuleQualifiedName"
    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:806:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:807:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:808:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1674);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1685); 

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
    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:815:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:818:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:819:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:819:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:819:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1725); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:826:1: (kw= '.' this_ID_2= RULE_ID )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==20) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:827:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,20,FOLLOW_20_in_ruleQualifiedName1744); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1759); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop28;
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


    // $ANTLR start "entryRuleRequirementImport"
    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:847:1: entryRuleRequirementImport returns [EObject current=null] : iv_ruleRequirementImport= ruleRequirementImport EOF ;
    public final EObject entryRuleRequirementImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirementImport = null;


        try {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:848:2: (iv_ruleRequirementImport= ruleRequirementImport EOF )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:849:2: iv_ruleRequirementImport= ruleRequirementImport EOF
            {
             newCompositeNode(grammarAccess.getRequirementImportRule()); 
            pushFollow(FOLLOW_ruleRequirementImport_in_entryRuleRequirementImport1806);
            iv_ruleRequirementImport=ruleRequirementImport();

            state._fsp--;

             current =iv_ruleRequirementImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequirementImport1816); 

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
    // $ANTLR end "entryRuleRequirementImport"


    // $ANTLR start "ruleRequirementImport"
    // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:856:1: ruleRequirementImport returns [EObject current=null] : (otherlv_0= 'req_import' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleRequirementImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;

         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:859:28: ( (otherlv_0= 'req_import' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:860:1: (otherlv_0= 'req_import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:860:1: (otherlv_0= 'req_import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:860:3: otherlv_0= 'req_import' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleRequirementImport1853); 

                	newLeafNode(otherlv_0, grammarAccess.getRequirementImportAccess().getReq_importKeyword_0());
                
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:864:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:865:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:865:1: (lv_importURI_1_0= RULE_STRING )
            // ../com.lowcoupling.mdpm.lng.wbs/src-gen/com/lowcoupling/mdpm/lng/wbs/parser/antlr/internal/InternalWBS.g:866:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRequirementImport1870); 

            			newLeafNode(lv_importURI_1_0, grammarAccess.getRequirementImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRequirementImportRule());
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
    // $ANTLR end "ruleRequirementImport"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleWBS_in_entryRuleWBS75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWBS85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSProgram_in_ruleWBS132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSProject_in_ruleWBS159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSProgram_in_entryRuleWBSProgram194 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWBSProgram204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_ruleWBSProgram246 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleWBSProgram264 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWBSProgram281 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_ruleWBSProgram297 = new BitSet(new long[]{0x0000000000218110L});
    public static final BitSet FOLLOW_ruleRequirementImport_in_ruleWBSProgram318 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ENDLINE_in_ruleWBSProgram329 = new BitSet(new long[]{0x0000000000218110L});
    public static final BitSet FOLLOW_ruleWBSProject_in_ruleWBSProgram351 = new BitSet(new long[]{0x0000000000018110L});
    public static final BitSet FOLLOW_15_in_ruleWBSProgram365 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_ruleWBSProgram376 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleWBSProgram399 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ENDLINE_in_ruleWBSProgram410 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_ruleWBSProgram422 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_ruleWBSProgram434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSProject_in_entryRuleWBSProject469 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWBSProject479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_ruleWBSProject521 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleWBSProject539 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWBSProject556 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_ruleWBSProject572 = new BitSet(new long[]{0x00000000002E8110L});
    public static final BitSet FOLLOW_ruleRequirementImport_in_ruleWBSProject593 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ENDLINE_in_ruleWBSProject604 = new BitSet(new long[]{0x00000000002E8110L});
    public static final BitSet FOLLOW_ruleWBSNode_in_ruleWBSProject626 = new BitSet(new long[]{0x00000000000E8110L});
    public static final BitSet FOLLOW_15_in_ruleWBSProject640 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_ruleWBSProject651 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleWBSProject674 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ENDLINE_in_ruleWBSProject685 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_ruleWBSProject697 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_ruleWBSProject709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSNode_in_entryRuleWBSNode744 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWBSNode754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSActivity_in_ruleWBSNode801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSWorkPackage_in_ruleWBSNode828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSDeliverable_in_ruleWBSNode855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSActivity_in_entryRuleWBSActivity890 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWBSActivity900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_ruleWBSActivity942 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleWBSActivity960 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWBSActivity977 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_ruleWBSActivity995 = new BitSet(new long[]{0x00000000000E8110L});
    public static final BitSet FOLLOW_ruleWBSNode_in_ruleWBSActivity1015 = new BitSet(new long[]{0x00000000000E8110L});
    public static final BitSet FOLLOW_15_in_ruleWBSActivity1029 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_ruleWBSActivity1040 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleWBSActivity1063 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ENDLINE_in_ruleWBSActivity1074 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_ruleWBSActivity1086 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_ruleWBSActivity1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ENDLINE_in_ruleWBSActivity1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSWorkPackage_in_entryRuleWBSWorkPackage1151 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWBSWorkPackage1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_ruleWBSWorkPackage1203 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleWBSWorkPackage1221 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWBSWorkPackage1238 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_ruleWBSWorkPackage1256 = new BitSet(new long[]{0x00000000000E8110L});
    public static final BitSet FOLLOW_ruleWBSNode_in_ruleWBSWorkPackage1276 = new BitSet(new long[]{0x00000000000E8110L});
    public static final BitSet FOLLOW_15_in_ruleWBSWorkPackage1290 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_ruleWBSWorkPackage1301 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleWBSWorkPackage1324 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ENDLINE_in_ruleWBSWorkPackage1335 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_ruleWBSWorkPackage1347 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_ruleWBSWorkPackage1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ENDLINE_in_ruleWBSWorkPackage1376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWBSDeliverable_in_entryRuleWBSDeliverable1412 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWBSDeliverable1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_ruleWBSDeliverable1464 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleWBSDeliverable1482 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWBSDeliverable1499 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_ruleWBSDeliverable1517 = new BitSet(new long[]{0x00000000000E8110L});
    public static final BitSet FOLLOW_ruleWBSNode_in_ruleWBSDeliverable1537 = new BitSet(new long[]{0x00000000000E8110L});
    public static final BitSet FOLLOW_15_in_ruleWBSDeliverable1551 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_ruleWBSDeliverable1562 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleWBSDeliverable1585 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ENDLINE_in_ruleWBSDeliverable1596 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_ruleWBSDeliverable1608 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_ruleWBSDeliverable1620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ENDLINE_in_ruleWBSDeliverable1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1674 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1725 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleQualifiedName1744 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1759 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleRequirementImport_in_entryRuleRequirementImport1806 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequirementImport1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleRequirementImport1853 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRequirementImport1870 = new BitSet(new long[]{0x0000000000000002L});

}