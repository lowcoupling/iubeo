package com.lowcoupling.mdpm.lng.rml.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.lowcoupling.mdpm.lng.rml.services.RMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRMLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'{'", "'}'", "'req'", "';'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int T__15=15;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalRMLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRMLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRMLParser.tokenNames; }
    public String getGrammarFileName() { return "../com.lowcoupling.mdpm.lng.rml/src-gen/com/lowcoupling/mdpm/lng/rml/parser/antlr/internal/InternalRML.g"; }



     	private RMLGrammarAccess grammarAccess;
     	
        public InternalRMLParser(TokenStream input, RMLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected RMLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../com.lowcoupling.mdpm.lng.rml/src-gen/com/lowcoupling/mdpm/lng/rml/parser/antlr/internal/InternalRML.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../com.lowcoupling.mdpm.lng.rml/src-gen/com/lowcoupling/mdpm/lng/rml/parser/antlr/internal/InternalRML.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../com.lowcoupling.mdpm.lng.rml/src-gen/com/lowcoupling/mdpm/lng/rml/parser/antlr/internal/InternalRML.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../com.lowcoupling.mdpm.lng.rml/src-gen/com/lowcoupling/mdpm/lng/rml/parser/antlr/internal/InternalRML.g:76:1: ruleModel returns [EObject current=null] : ( (lv_packages_0_0= ruleREQPackage ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_packages_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.rml/src-gen/com/lowcoupling/mdpm/lng/rml/parser/antlr/internal/InternalRML.g:79:28: ( ( (lv_packages_0_0= ruleREQPackage ) )* )
            // ../com.lowcoupling.mdpm.lng.rml/src-gen/com/lowcoupling/mdpm/lng/rml/parser/antlr/internal/InternalRML.g:80:1: ( (lv_packages_0_0= ruleREQPackage ) )*
            {
            // ../com.lowcoupling.mdpm.lng.rml/src-gen/com/lowcoupling/mdpm/lng/rml/parser/antlr/internal/InternalRML.g:80:1: ( (lv_packages_0_0= ruleREQPackage ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.rml/src-gen/com/lowcoupling/mdpm/lng/rml/parser/antlr/internal/InternalRML.g:81:1: (lv_packages_0_0= ruleREQPackage )
            	    {
            	    // ../com.lowcoupling.mdpm.lng.rml/src-gen/com/lowcoupling/mdpm/lng/rml/parser/antlr/internal/InternalRML.g:81:1: (lv_packages_0_0= ruleREQPackage )
            	    // ../com.lowcoupling.mdpm.lng.rml/src-gen/com/lowcoupling/mdpm/lng/rml/parser/antlr/internal/InternalRML.g:82:3: lv_packages_0_0= ruleREQPackage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getPackagesREQPackageParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleREQPackage_in_ruleModel130);
            	    lv_packages_0_0=ruleREQPackage();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"packages",
            	            		lv_packages_0_0, 
            	            		"REQPackage");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleREQPackage"
    // ../com.lowcoupling.mdpm.lng.rml/src-gen/com/lowcoupling/mdpm/lng/rml/parser/antlr/internal/InternalRML.g:106:1: entryRuleREQPackage returns [EObject current=null] : iv_ruleREQPackage= ruleREQPackage EOF ;
    public final EObject entryRuleREQPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleREQPackage = null;


        try {
            // ../com.lowcoupling.mdpm.lng.rml/src-gen/com/lowcoupling/mdpm/lng/rml/parser/antlr/internal/InternalRML.g:107:2: (iv_ruleREQPackage= ruleREQPackage EOF )
            // ../com.lowcoupling.mdpm.lng.rml/src-gen/com/lowcoupling/mdpm/lng/rml/parser/antlr/internal/InternalRML.g:108:2: iv_ruleREQPackage= ruleREQPackage EOF
            {
             newCompositeNode(grammarAccess.getREQPackageRule()); 
            pushFollow(FOLLOW_ruleREQPackage_in_entryRuleREQPackage166);
            iv_ruleREQPackage=ruleREQPackage();

            state._fsp--;

             current =iv_ruleREQPackage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleREQPackage176); 

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
    // $ANTLR end "entryRuleREQPackage"


    // $ANTLR start "ruleREQPackage"
    // ../com.lowcoupling.mdpm.lng.rml/src-gen/com/lowcoupling/mdpm/lng/rml/parser/antlr/internal/InternalRML.g:115:1: ruleREQPackage returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_package_3_0= ruleREQPackage ) )* ( (lv_requirements_4_0= ruleREQRequirement ) )* otherlv_5= '}' ) ;
    public final EObject ruleREQPackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_package_3_0 = null;

        EObject lv_requirements_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.rml/src-gen/com/lowcoupling/mdpm/lng/rml/parser/antlr/internal/InternalRML.g:118:28: ( (otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_package_3_0= ruleREQPackage ) )* ( (lv_requirements_4_0= ruleREQRequirement ) )* otherlv_5= '}' ) )
            // ../com.lowcoupling.mdpm.lng.rml/src-gen/com/lowcoupling/mdpm/lng/rml/parser/antlr/internal/InternalRML.g:119:1: (otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_package_3_0= ruleREQPackage ) )* ( (lv_requirements_4_0= ruleREQRequirement ) )* otherlv_5= '}' )
            {
            // ../com.lowcoupling.mdpm.lng.rml/src-gen/com/lowcoupling/mdpm/lng/rml/parser/antlr/internal/InternalRML.g:119:1: (otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_package_3_0= ruleREQPackage ) )* ( (lv_requirements_4_0= ruleREQRequirement ) )* otherlv_5= '}' )
            // ../com.lowcoupling.mdpm.lng.rml/src-gen/com/lowcoupling/mdpm/lng/rml/parser/antlr/internal/InternalRML.g:119:3: otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_package_3_0= ruleREQPackage ) )* ( (lv_requirements_4_0= ruleREQRequirement ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleREQPackage213); 

                	newLeafNode(otherlv_0, grammarAccess.getREQPackageAccess().getPackageKeyword_0());
                
            // ../com.lowcoupling.mdpm.lng.rml/src-gen/com/lowcoupling/mdpm/lng/rml/parser/antlr/internal/InternalRML.g:123:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.rml/src-gen/com/lowcoupling/mdpm/lng/rml/parser/antlr/internal/InternalRML.g:124:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.rml/src-gen/com/lowcoupling/mdpm/lng/rml/parser/antlr/internal/InternalRML.g:124:1: (lv_name_1_0= RULE_ID )
            // ../com.lowcoupling.mdpm.lng.rml/src-gen/com/lowcoupling/mdpm/lng/rml/parser/antlr/internal/InternalRML.g:125:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleREQPackage230); 

            			newLeafNode(lv_name_1_0, grammarAccess.getREQPackageAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getREQPackageRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleREQPackage247); 

                	newLeafNode(otherlv_2, grammarAccess.getREQPackageAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.lowcoupling.mdpm.lng.rml/src-gen/com/lowcoupling/mdpm/lng/rml/parser/antlr/internal/InternalRML.g:145:1: ( (lv_package_3_0= ruleREQPackage ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.rml/src-gen/com/lowcoupling/mdpm/lng/rml/parser/antlr/internal/InternalRML.g:146:1: (lv_package_3_0= ruleREQPackage )
            	    {
            	    // ../com.lowcoupling.mdpm.lng.rml/src-gen/com/lowcoupling/mdpm/lng/rml/parser/antlr/internal/InternalRML.g:146:1: (lv_package_3_0= ruleREQPackage )
            	    // ../com.lowcoupling.mdpm.lng.rml/src-gen/com/lowcoupling/mdpm/lng/rml/parser/antlr/internal/InternalRML.g:147:3: lv_package_3_0= ruleREQPackage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getREQPackageAccess().getPackageREQPackageParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleREQPackage_in_ruleREQPackage268);
            	    lv_package_3_0=ruleREQPackage();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getREQPackageRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"package",
            	            		lv_package_3_0, 
            	            		"REQPackage");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../com.lowcoupling.mdpm.lng.rml/src-gen/com/lowcoupling/mdpm/lng/rml/parser/antlr/internal/InternalRML.g:163:3: ( (lv_requirements_4_0= ruleREQRequirement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.rml/src-gen/com/lowcoupling/mdpm/lng/rml/parser/antlr/internal/InternalRML.g:164:1: (lv_requirements_4_0= ruleREQRequirement )
            	    {
            	    // ../com.lowcoupling.mdpm.lng.rml/src-gen/com/lowcoupling/mdpm/lng/rml/parser/antlr/internal/InternalRML.g:164:1: (lv_requirements_4_0= ruleREQRequirement )
            	    // ../com.lowcoupling.mdpm.lng.rml/src-gen/com/lowcoupling/mdpm/lng/rml/parser/antlr/internal/InternalRML.g:165:3: lv_requirements_4_0= ruleREQRequirement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getREQPackageAccess().getRequirementsREQRequirementParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleREQRequirement_in_ruleREQPackage290);
            	    lv_requirements_4_0=ruleREQRequirement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getREQPackageRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"requirements",
            	            		lv_requirements_4_0, 
            	            		"REQRequirement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleREQPackage303); 

                	newLeafNode(otherlv_5, grammarAccess.getREQPackageAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleREQPackage"


    // $ANTLR start "entryRuleREQRequirement"
    // ../com.lowcoupling.mdpm.lng.rml/src-gen/com/lowcoupling/mdpm/lng/rml/parser/antlr/internal/InternalRML.g:193:1: entryRuleREQRequirement returns [EObject current=null] : iv_ruleREQRequirement= ruleREQRequirement EOF ;
    public final EObject entryRuleREQRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleREQRequirement = null;


        try {
            // ../com.lowcoupling.mdpm.lng.rml/src-gen/com/lowcoupling/mdpm/lng/rml/parser/antlr/internal/InternalRML.g:194:2: (iv_ruleREQRequirement= ruleREQRequirement EOF )
            // ../com.lowcoupling.mdpm.lng.rml/src-gen/com/lowcoupling/mdpm/lng/rml/parser/antlr/internal/InternalRML.g:195:2: iv_ruleREQRequirement= ruleREQRequirement EOF
            {
             newCompositeNode(grammarAccess.getREQRequirementRule()); 
            pushFollow(FOLLOW_ruleREQRequirement_in_entryRuleREQRequirement339);
            iv_ruleREQRequirement=ruleREQRequirement();

            state._fsp--;

             current =iv_ruleREQRequirement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleREQRequirement349); 

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
    // $ANTLR end "entryRuleREQRequirement"


    // $ANTLR start "ruleREQRequirement"
    // ../com.lowcoupling.mdpm.lng.rml/src-gen/com/lowcoupling/mdpm/lng/rml/parser/antlr/internal/InternalRML.g:202:1: ruleREQRequirement returns [EObject current=null] : (otherlv_0= 'req' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) otherlv_3= ';' ) ;
    public final EObject ruleREQRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_text_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.rml/src-gen/com/lowcoupling/mdpm/lng/rml/parser/antlr/internal/InternalRML.g:205:28: ( (otherlv_0= 'req' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) otherlv_3= ';' ) )
            // ../com.lowcoupling.mdpm.lng.rml/src-gen/com/lowcoupling/mdpm/lng/rml/parser/antlr/internal/InternalRML.g:206:1: (otherlv_0= 'req' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) otherlv_3= ';' )
            {
            // ../com.lowcoupling.mdpm.lng.rml/src-gen/com/lowcoupling/mdpm/lng/rml/parser/antlr/internal/InternalRML.g:206:1: (otherlv_0= 'req' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) otherlv_3= ';' )
            // ../com.lowcoupling.mdpm.lng.rml/src-gen/com/lowcoupling/mdpm/lng/rml/parser/antlr/internal/InternalRML.g:206:3: otherlv_0= 'req' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleREQRequirement386); 

                	newLeafNode(otherlv_0, grammarAccess.getREQRequirementAccess().getReqKeyword_0());
                
            // ../com.lowcoupling.mdpm.lng.rml/src-gen/com/lowcoupling/mdpm/lng/rml/parser/antlr/internal/InternalRML.g:210:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.rml/src-gen/com/lowcoupling/mdpm/lng/rml/parser/antlr/internal/InternalRML.g:211:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.rml/src-gen/com/lowcoupling/mdpm/lng/rml/parser/antlr/internal/InternalRML.g:211:1: (lv_name_1_0= RULE_ID )
            // ../com.lowcoupling.mdpm.lng.rml/src-gen/com/lowcoupling/mdpm/lng/rml/parser/antlr/internal/InternalRML.g:212:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleREQRequirement403); 

            			newLeafNode(lv_name_1_0, grammarAccess.getREQRequirementAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getREQRequirementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.lowcoupling.mdpm.lng.rml/src-gen/com/lowcoupling/mdpm/lng/rml/parser/antlr/internal/InternalRML.g:228:2: ( (lv_text_2_0= RULE_STRING ) )
            // ../com.lowcoupling.mdpm.lng.rml/src-gen/com/lowcoupling/mdpm/lng/rml/parser/antlr/internal/InternalRML.g:229:1: (lv_text_2_0= RULE_STRING )
            {
            // ../com.lowcoupling.mdpm.lng.rml/src-gen/com/lowcoupling/mdpm/lng/rml/parser/antlr/internal/InternalRML.g:229:1: (lv_text_2_0= RULE_STRING )
            // ../com.lowcoupling.mdpm.lng.rml/src-gen/com/lowcoupling/mdpm/lng/rml/parser/antlr/internal/InternalRML.g:230:3: lv_text_2_0= RULE_STRING
            {
            lv_text_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleREQRequirement425); 

            			newLeafNode(lv_text_2_0, grammarAccess.getREQRequirementAccess().getTextSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getREQRequirementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"text",
                    		lv_text_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleREQRequirement442); 

                	newLeafNode(otherlv_3, grammarAccess.getREQRequirementAccess().getSemicolonKeyword_3());
                

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
    // $ANTLR end "ruleREQRequirement"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREQPackage_in_ruleModel130 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleREQPackage_in_entryRuleREQPackage166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleREQPackage176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleREQPackage213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleREQPackage230 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleREQPackage247 = new BitSet(new long[]{0x0000000000006800L});
    public static final BitSet FOLLOW_ruleREQPackage_in_ruleREQPackage268 = new BitSet(new long[]{0x0000000000006800L});
    public static final BitSet FOLLOW_ruleREQRequirement_in_ruleREQPackage290 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleREQPackage303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREQRequirement_in_entryRuleREQRequirement339 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleREQRequirement349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleREQRequirement386 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleREQRequirement403 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleREQRequirement425 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleREQRequirement442 = new BitSet(new long[]{0x0000000000000002L});

}