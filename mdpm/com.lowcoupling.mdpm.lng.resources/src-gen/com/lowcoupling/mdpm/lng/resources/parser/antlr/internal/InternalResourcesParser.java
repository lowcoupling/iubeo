package com.lowcoupling.mdpm.lng.resources.parser.antlr.internal; 

import org.antlr.runtime.BitSet;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;

import com.lowcoupling.mdpm.lng.resources.services.ResourcesGrammarAccess;

@SuppressWarnings("all")
public class InternalResourcesParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Group'", "'{'", "'id'", "';'", "'cost'", "'type'", "'}'", "'Resource'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalResourcesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalResourcesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalResourcesParser.tokenNames; }
    public String getGrammarFileName() { return "../com.lowcoupling.mdpm.lng.resources/src-gen/com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.g"; }



     	private ResourcesGrammarAccess grammarAccess;
     	
        public InternalResourcesParser(TokenStream input, ResourcesGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Resources";	
       	}
       	
       	@Override
       	protected ResourcesGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleResources"
    // ../com.lowcoupling.mdpm.lng.resources/src-gen/com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.g:67:1: entryRuleResources returns [EObject current=null] : iv_ruleResources= ruleResources EOF ;
    public final EObject entryRuleResources() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResources = null;


        try {
            // ../com.lowcoupling.mdpm.lng.resources/src-gen/com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.g:68:2: (iv_ruleResources= ruleResources EOF )
            // ../com.lowcoupling.mdpm.lng.resources/src-gen/com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.g:69:2: iv_ruleResources= ruleResources EOF
            {
             newCompositeNode(grammarAccess.getResourcesRule()); 
            pushFollow(FOLLOW_ruleResources_in_entryRuleResources75);
            iv_ruleResources=ruleResources();

            state._fsp--;

             current =iv_ruleResources; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResources85); 

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
    // $ANTLR end "entryRuleResources"


    // $ANTLR start "ruleResources"
    // ../com.lowcoupling.mdpm.lng.resources/src-gen/com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.g:76:1: ruleResources returns [EObject current=null] : ( ( (lv_resourceGroups_0_0= ruleResourceGroup ) )* ( (lv_resources_1_0= ruleResource ) )* ) ;
    public final EObject ruleResources() throws RecognitionException {
        EObject current = null;

        EObject lv_resourceGroups_0_0 = null;

        EObject lv_resources_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.resources/src-gen/com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.g:79:28: ( ( ( (lv_resourceGroups_0_0= ruleResourceGroup ) )* ( (lv_resources_1_0= ruleResource ) )* ) )
            // ../com.lowcoupling.mdpm.lng.resources/src-gen/com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.g:80:1: ( ( (lv_resourceGroups_0_0= ruleResourceGroup ) )* ( (lv_resources_1_0= ruleResource ) )* )
            {
            // ../com.lowcoupling.mdpm.lng.resources/src-gen/com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.g:80:1: ( ( (lv_resourceGroups_0_0= ruleResourceGroup ) )* ( (lv_resources_1_0= ruleResource ) )* )
            // ../com.lowcoupling.mdpm.lng.resources/src-gen/com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.g:80:2: ( (lv_resourceGroups_0_0= ruleResourceGroup ) )* ( (lv_resources_1_0= ruleResource ) )*
            {
            // ../com.lowcoupling.mdpm.lng.resources/src-gen/com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.g:80:2: ( (lv_resourceGroups_0_0= ruleResourceGroup ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.resources/src-gen/com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.g:81:1: (lv_resourceGroups_0_0= ruleResourceGroup )
            	    {
            	    // ../com.lowcoupling.mdpm.lng.resources/src-gen/com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.g:81:1: (lv_resourceGroups_0_0= ruleResourceGroup )
            	    // ../com.lowcoupling.mdpm.lng.resources/src-gen/com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.g:82:3: lv_resourceGroups_0_0= ruleResourceGroup
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getResourcesAccess().getResourceGroupsResourceGroupParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleResourceGroup_in_ruleResources131);
            	    lv_resourceGroups_0_0=ruleResourceGroup();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getResourcesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"resourceGroups",
            	            		lv_resourceGroups_0_0, 
            	            		"ResourceGroup");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../com.lowcoupling.mdpm.lng.resources/src-gen/com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.g:98:3: ( (lv_resources_1_0= ruleResource ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.resources/src-gen/com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.g:99:1: (lv_resources_1_0= ruleResource )
            	    {
            	    // ../com.lowcoupling.mdpm.lng.resources/src-gen/com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.g:99:1: (lv_resources_1_0= ruleResource )
            	    // ../com.lowcoupling.mdpm.lng.resources/src-gen/com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.g:100:3: lv_resources_1_0= ruleResource
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getResourcesAccess().getResourcesResourceParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleResource_in_ruleResources153);
            	    lv_resources_1_0=ruleResource();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getResourcesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"resources",
            	            		lv_resources_1_0, 
            	            		"Resource");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleResources"


    // $ANTLR start "entryRuleResourceGroup"
    // ../com.lowcoupling.mdpm.lng.resources/src-gen/com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.g:124:1: entryRuleResourceGroup returns [EObject current=null] : iv_ruleResourceGroup= ruleResourceGroup EOF ;
    public final EObject entryRuleResourceGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceGroup = null;


        try {
            // ../com.lowcoupling.mdpm.lng.resources/src-gen/com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.g:125:2: (iv_ruleResourceGroup= ruleResourceGroup EOF )
            // ../com.lowcoupling.mdpm.lng.resources/src-gen/com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.g:126:2: iv_ruleResourceGroup= ruleResourceGroup EOF
            {
             newCompositeNode(grammarAccess.getResourceGroupRule()); 
            pushFollow(FOLLOW_ruleResourceGroup_in_entryRuleResourceGroup190);
            iv_ruleResourceGroup=ruleResourceGroup();

            state._fsp--;

             current =iv_ruleResourceGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceGroup200); 

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
    // $ANTLR end "entryRuleResourceGroup"


    // $ANTLR start "ruleResourceGroup"
    // ../com.lowcoupling.mdpm.lng.resources/src-gen/com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.g:133:1: ruleResourceGroup returns [EObject current=null] : (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'id' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'cost' ( (lv_cost_7_0= RULE_INT ) ) ( (lv_costLabel_8_0= RULE_STRING ) )? otherlv_9= ';' otherlv_10= 'type' ( (lv_type_11_0= RULE_STRING ) ) otherlv_12= ';' otherlv_13= '}' ) ;
    public final EObject ruleResourceGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_id_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_cost_7_0=null;
        Token lv_costLabel_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_type_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;

         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.resources/src-gen/com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.g:136:28: ( (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'id' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'cost' ( (lv_cost_7_0= RULE_INT ) ) ( (lv_costLabel_8_0= RULE_STRING ) )? otherlv_9= ';' otherlv_10= 'type' ( (lv_type_11_0= RULE_STRING ) ) otherlv_12= ';' otherlv_13= '}' ) )
            // ../com.lowcoupling.mdpm.lng.resources/src-gen/com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.g:137:1: (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'id' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'cost' ( (lv_cost_7_0= RULE_INT ) ) ( (lv_costLabel_8_0= RULE_STRING ) )? otherlv_9= ';' otherlv_10= 'type' ( (lv_type_11_0= RULE_STRING ) ) otherlv_12= ';' otherlv_13= '}' )
            {
            // ../com.lowcoupling.mdpm.lng.resources/src-gen/com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.g:137:1: (otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'id' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'cost' ( (lv_cost_7_0= RULE_INT ) ) ( (lv_costLabel_8_0= RULE_STRING ) )? otherlv_9= ';' otherlv_10= 'type' ( (lv_type_11_0= RULE_STRING ) ) otherlv_12= ';' otherlv_13= '}' )
            // ../com.lowcoupling.mdpm.lng.resources/src-gen/com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.g:137:3: otherlv_0= 'Group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'id' ( (lv_id_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'cost' ( (lv_cost_7_0= RULE_INT ) ) ( (lv_costLabel_8_0= RULE_STRING ) )? otherlv_9= ';' otherlv_10= 'type' ( (lv_type_11_0= RULE_STRING ) ) otherlv_12= ';' otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleResourceGroup237); 

                	newLeafNode(otherlv_0, grammarAccess.getResourceGroupAccess().getGroupKeyword_0());
                
            // ../com.lowcoupling.mdpm.lng.resources/src-gen/com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.g:141:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.resources/src-gen/com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.g:142:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.resources/src-gen/com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.g:142:1: (lv_name_1_0= RULE_ID )
            // ../com.lowcoupling.mdpm.lng.resources/src-gen/com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.g:143:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResourceGroup254); 

            			newLeafNode(lv_name_1_0, grammarAccess.getResourceGroupAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getResourceGroupRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleResourceGroup271); 

                	newLeafNode(otherlv_2, grammarAccess.getResourceGroupAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleResourceGroup283); 

                	newLeafNode(otherlv_3, grammarAccess.getResourceGroupAccess().getIdKeyword_3());
                
            // ../com.lowcoupling.mdpm.lng.resources/src-gen/com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.g:167:1: ( (lv_id_4_0= RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.resources/src-gen/com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.g:168:1: (lv_id_4_0= RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.resources/src-gen/com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.g:168:1: (lv_id_4_0= RULE_ID )
            // ../com.lowcoupling.mdpm.lng.resources/src-gen/com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.g:169:3: lv_id_4_0= RULE_ID
            {
            lv_id_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResourceGroup300); 

            			newLeafNode(lv_id_4_0, grammarAccess.getResourceGroupAccess().getIdIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getResourceGroupRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_4_0, 
                    		"ID");
            	    

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleResourceGroup317); 

                	newLeafNode(otherlv_5, grammarAccess.getResourceGroupAccess().getSemicolonKeyword_5());
                
            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleResourceGroup329); 

                	newLeafNode(otherlv_6, grammarAccess.getResourceGroupAccess().getCostKeyword_6());
                
            // ../com.lowcoupling.mdpm.lng.resources/src-gen/com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.g:193:1: ( (lv_cost_7_0= RULE_INT ) )
            // ../com.lowcoupling.mdpm.lng.resources/src-gen/com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.g:194:1: (lv_cost_7_0= RULE_INT )
            {
            // ../com.lowcoupling.mdpm.lng.resources/src-gen/com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.g:194:1: (lv_cost_7_0= RULE_INT )
            // ../com.lowcoupling.mdpm.lng.resources/src-gen/com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.g:195:3: lv_cost_7_0= RULE_INT
            {
            lv_cost_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleResourceGroup346); 

            			newLeafNode(lv_cost_7_0, grammarAccess.getResourceGroupAccess().getCostINTTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getResourceGroupRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"cost",
                    		lv_cost_7_0, 
                    		"INT");
            	    

            }


            }

            // ../com.lowcoupling.mdpm.lng.resources/src-gen/com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.g:211:2: ( (lv_costLabel_8_0= RULE_STRING ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.resources/src-gen/com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.g:212:1: (lv_costLabel_8_0= RULE_STRING )
                    {
                    // ../com.lowcoupling.mdpm.lng.resources/src-gen/com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.g:212:1: (lv_costLabel_8_0= RULE_STRING )
                    // ../com.lowcoupling.mdpm.lng.resources/src-gen/com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.g:213:3: lv_costLabel_8_0= RULE_STRING
                    {
                    lv_costLabel_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResourceGroup368); 

                    			newLeafNode(lv_costLabel_8_0, grammarAccess.getResourceGroupAccess().getCostLabelSTRINGTerminalRuleCall_8_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getResourceGroupRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"costLabel",
                            		lv_costLabel_8_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleResourceGroup386); 

                	newLeafNode(otherlv_9, grammarAccess.getResourceGroupAccess().getSemicolonKeyword_9());
                
            otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleResourceGroup398); 

                	newLeafNode(otherlv_10, grammarAccess.getResourceGroupAccess().getTypeKeyword_10());
                
            // ../com.lowcoupling.mdpm.lng.resources/src-gen/com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.g:237:1: ( (lv_type_11_0= RULE_STRING ) )
            // ../com.lowcoupling.mdpm.lng.resources/src-gen/com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.g:238:1: (lv_type_11_0= RULE_STRING )
            {
            // ../com.lowcoupling.mdpm.lng.resources/src-gen/com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.g:238:1: (lv_type_11_0= RULE_STRING )
            // ../com.lowcoupling.mdpm.lng.resources/src-gen/com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.g:239:3: lv_type_11_0= RULE_STRING
            {
            lv_type_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResourceGroup415); 

            			newLeafNode(lv_type_11_0, grammarAccess.getResourceGroupAccess().getTypeSTRINGTerminalRuleCall_11_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getResourceGroupRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_11_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_12=(Token)match(input,14,FOLLOW_14_in_ruleResourceGroup432); 

                	newLeafNode(otherlv_12, grammarAccess.getResourceGroupAccess().getSemicolonKeyword_12());
                
            otherlv_13=(Token)match(input,17,FOLLOW_17_in_ruleResourceGroup444); 

                	newLeafNode(otherlv_13, grammarAccess.getResourceGroupAccess().getRightCurlyBracketKeyword_13());
                

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
    // $ANTLR end "ruleResourceGroup"


    // $ANTLR start "entryRuleResource"
    // ../com.lowcoupling.mdpm.lng.resources/src-gen/com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.g:271:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // ../com.lowcoupling.mdpm.lng.resources/src-gen/com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.g:272:2: (iv_ruleResource= ruleResource EOF )
            // ../com.lowcoupling.mdpm.lng.resources/src-gen/com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.g:273:2: iv_ruleResource= ruleResource EOF
            {
             newCompositeNode(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_ruleResource_in_entryRuleResource480);
            iv_ruleResource=ruleResource();

            state._fsp--;

             current =iv_ruleResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResource490); 

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
    // $ANTLR end "entryRuleResource"


    // $ANTLR start "ruleResource"
    // ../com.lowcoupling.mdpm.lng.resources/src-gen/com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.g:280:1: ruleResource returns [EObject current=null] : (otherlv_0= 'Resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' otherlv_6= '}' ) ;
    public final EObject ruleResource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.resources/src-gen/com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.g:283:28: ( (otherlv_0= 'Resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' otherlv_6= '}' ) )
            // ../com.lowcoupling.mdpm.lng.resources/src-gen/com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.g:284:1: (otherlv_0= 'Resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' otherlv_6= '}' )
            {
            // ../com.lowcoupling.mdpm.lng.resources/src-gen/com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.g:284:1: (otherlv_0= 'Resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' otherlv_6= '}' )
            // ../com.lowcoupling.mdpm.lng.resources/src-gen/com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.g:284:3: otherlv_0= 'Resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleResource527); 

                	newLeafNode(otherlv_0, grammarAccess.getResourceAccess().getResourceKeyword_0());
                
            // ../com.lowcoupling.mdpm.lng.resources/src-gen/com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.g:288:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.resources/src-gen/com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.g:289:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.resources/src-gen/com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.g:289:1: (lv_name_1_0= RULE_ID )
            // ../com.lowcoupling.mdpm.lng.resources/src-gen/com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.g:290:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResource544); 

            			newLeafNode(lv_name_1_0, grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getResourceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleResource561); 

                	newLeafNode(otherlv_2, grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleResource573); 

                	newLeafNode(otherlv_3, grammarAccess.getResourceAccess().getTypeKeyword_3());
                
            // ../com.lowcoupling.mdpm.lng.resources/src-gen/com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.g:314:1: ( (otherlv_4= RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.resources/src-gen/com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.g:315:1: (otherlv_4= RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.resources/src-gen/com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.g:315:1: (otherlv_4= RULE_ID )
            // ../com.lowcoupling.mdpm.lng.resources/src-gen/com/lowcoupling/mdpm/lng/resources/parser/antlr/internal/InternalResources.g:316:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getResourceRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResource593); 

            		newLeafNode(otherlv_4, grammarAccess.getResourceAccess().getTypeResourceGroupCrossReference_4_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleResource605); 

                	newLeafNode(otherlv_5, grammarAccess.getResourceAccess().getSemicolonKeyword_5());
                
            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleResource617); 

                	newLeafNode(otherlv_6, grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleResource"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleResources_in_entryRuleResources75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResources85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceGroup_in_ruleResources131 = new BitSet(new long[]{0x0000000000040802L});
    public static final BitSet FOLLOW_ruleResource_in_ruleResources153 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleResourceGroup_in_entryRuleResourceGroup190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceGroup200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleResourceGroup237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResourceGroup254 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleResourceGroup271 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleResourceGroup283 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResourceGroup300 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleResourceGroup317 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleResourceGroup329 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleResourceGroup346 = new BitSet(new long[]{0x0000000000004040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResourceGroup368 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleResourceGroup386 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleResourceGroup398 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResourceGroup415 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleResourceGroup432 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleResourceGroup444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_entryRuleResource480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResource490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleResource527 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResource544 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleResource561 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleResource573 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResource593 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleResource605 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleResource617 = new BitSet(new long[]{0x0000000000000002L});

}