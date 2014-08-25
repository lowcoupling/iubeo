package com.lowcoupling.mdpm.lng.pbs.parser.antlr.internal; 

import org.antlr.runtime.BitSet;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;

import com.lowcoupling.mdpm.lng.pbs.services.PBSGrammarAccess;

@SuppressWarnings("all")
public class InternalPBSParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ML_COMMENT", "RULE_ID", "RULE_OPENCURLY", "RULE_CLOSEDCURLY", "RULE_ENDLINE", "RULE_INT", "RULE_STRING", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Product '", "'Part '"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=10;
    public static final int T__15=15;
    public static final int RULE_CLOSEDCURLY=7;
    public static final int T__14=14;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_INT=9;
    public static final int RULE_OPENCURLY=6;
    public static final int RULE_WS=12;
    public static final int RULE_SL_COMMENT=11;
    public static final int EOF=-1;
    public static final int RULE_ENDLINE=8;
    public static final int RULE_ML_COMMENT=4;

    // delegates
    // delegators


        public InternalPBSParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPBSParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPBSParser.tokenNames; }
    public String getGrammarFileName() { return "../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g"; }



     	private PBSGrammarAccess grammarAccess;
     	
        public InternalPBSParser(TokenStream input, PBSGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "PBS";	
       	}
       	
       	@Override
       	protected PBSGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRulePBS"
    // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:67:1: entryRulePBS returns [EObject current=null] : iv_rulePBS= rulePBS EOF ;
    public final EObject entryRulePBS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePBS = null;


        try {
            // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:68:2: (iv_rulePBS= rulePBS EOF )
            // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:69:2: iv_rulePBS= rulePBS EOF
            {
             newCompositeNode(grammarAccess.getPBSRule()); 
            pushFollow(FOLLOW_rulePBS_in_entryRulePBS75);
            iv_rulePBS=rulePBS();

            state._fsp--;

             current =iv_rulePBS; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePBS85); 

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
    // $ANTLR end "entryRulePBS"


    // $ANTLR start "rulePBS"
    // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:76:1: rulePBS returns [EObject current=null] : this_Product_0= ruleProduct ;
    public final EObject rulePBS() throws RecognitionException {
        EObject current = null;

        EObject this_Product_0 = null;


         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:79:28: (this_Product_0= ruleProduct )
            // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:81:5: this_Product_0= ruleProduct
            {
             
                    newCompositeNode(grammarAccess.getPBSAccess().getProductParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleProduct_in_rulePBS131);
            this_Product_0=ruleProduct();

            state._fsp--;

             
                    current = this_Product_0; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "rulePBS"


    // $ANTLR start "entryRuleProduct"
    // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:97:1: entryRuleProduct returns [EObject current=null] : iv_ruleProduct= ruleProduct EOF ;
    public final EObject entryRuleProduct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProduct = null;


        try {
            // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:98:2: (iv_ruleProduct= ruleProduct EOF )
            // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:99:2: iv_ruleProduct= ruleProduct EOF
            {
             newCompositeNode(grammarAccess.getProductRule()); 
            pushFollow(FOLLOW_ruleProduct_in_entryRuleProduct165);
            iv_ruleProduct=ruleProduct();

            state._fsp--;

             current =iv_ruleProduct; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProduct175); 

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
    // $ANTLR end "entryRuleProduct"


    // $ANTLR start "ruleProduct"
    // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:106:1: ruleProduct returns [EObject current=null] : ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Product ' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY ( (lv_parts_4_0= rulePart ) )* this_CLOSEDCURLY_5= RULE_CLOSEDCURLY ) ;
    public final EObject ruleProduct() throws RecognitionException {
        EObject current = null;

        Token lv_description_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token this_OPENCURLY_3=null;
        Token this_CLOSEDCURLY_5=null;
        EObject lv_parts_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:109:28: ( ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Product ' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY ( (lv_parts_4_0= rulePart ) )* this_CLOSEDCURLY_5= RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:110:1: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Product ' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY ( (lv_parts_4_0= rulePart ) )* this_CLOSEDCURLY_5= RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:110:1: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Product ' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY ( (lv_parts_4_0= rulePart ) )* this_CLOSEDCURLY_5= RULE_CLOSEDCURLY )
            // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:110:2: ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Product ' ( (lv_name_2_0= RULE_ID ) ) this_OPENCURLY_3= RULE_OPENCURLY ( (lv_parts_4_0= rulePart ) )* this_CLOSEDCURLY_5= RULE_CLOSEDCURLY
            {
            // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:110:2: ( (lv_description_0_0= RULE_ML_COMMENT ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ML_COMMENT) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:111:1: (lv_description_0_0= RULE_ML_COMMENT )
                    {
                    // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:111:1: (lv_description_0_0= RULE_ML_COMMENT )
                    // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:112:3: lv_description_0_0= RULE_ML_COMMENT
                    {
                    lv_description_0_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_ruleProduct217); 

                    			newLeafNode(lv_description_0_0, grammarAccess.getProductAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProductRule());
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

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleProduct235); 

                	newLeafNode(otherlv_1, grammarAccess.getProductAccess().getProductKeyword_1());
                
            // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:132:1: ( (lv_name_2_0= RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:133:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:133:1: (lv_name_2_0= RULE_ID )
            // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:134:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProduct252); 

            			newLeafNode(lv_name_2_0, grammarAccess.getProductAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProductRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            this_OPENCURLY_3=(Token)match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_ruleProduct268); 
             
                newLeafNode(this_OPENCURLY_3, grammarAccess.getProductAccess().getOPENCURLYTerminalRuleCall_3()); 
                
            // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:154:1: ( (lv_parts_4_0= rulePart ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ML_COMMENT||LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:155:1: (lv_parts_4_0= rulePart )
            	    {
            	    // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:155:1: (lv_parts_4_0= rulePart )
            	    // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:156:3: lv_parts_4_0= rulePart
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProductAccess().getPartsPartParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePart_in_ruleProduct288);
            	    lv_parts_4_0=rulePart();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProductRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"parts",
            	            		lv_parts_4_0, 
            	            		"Part");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            this_CLOSEDCURLY_5=(Token)match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_ruleProduct300); 
             
                newLeafNode(this_CLOSEDCURLY_5, grammarAccess.getProductAccess().getCLOSEDCURLYTerminalRuleCall_5()); 
                

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
    // $ANTLR end "ruleProduct"


    // $ANTLR start "entryRulePart"
    // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:184:1: entryRulePart returns [EObject current=null] : iv_rulePart= rulePart EOF ;
    public final EObject entryRulePart() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePart = null;


        try {
            // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:185:2: (iv_rulePart= rulePart EOF )
            // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:186:2: iv_rulePart= rulePart EOF
            {
             newCompositeNode(grammarAccess.getPartRule()); 
            pushFollow(FOLLOW_rulePart_in_entryRulePart335);
            iv_rulePart=rulePart();

            state._fsp--;

             current =iv_rulePart; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePart345); 

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
    // $ANTLR end "entryRulePart"


    // $ANTLR start "rulePart"
    // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:193:1: rulePart returns [EObject current=null] : ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Part ' ( (lv_name_2_0= RULE_ID ) ) ( (this_OPENCURLY_3= RULE_OPENCURLY ( (lv_parts_4_0= rulePart ) )* this_CLOSEDCURLY_5= RULE_CLOSEDCURLY ) | this_ENDLINE_6= RULE_ENDLINE ) ) ;
    public final EObject rulePart() throws RecognitionException {
        EObject current = null;

        Token lv_description_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token this_OPENCURLY_3=null;
        Token this_CLOSEDCURLY_5=null;
        Token this_ENDLINE_6=null;
        EObject lv_parts_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:196:28: ( ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Part ' ( (lv_name_2_0= RULE_ID ) ) ( (this_OPENCURLY_3= RULE_OPENCURLY ( (lv_parts_4_0= rulePart ) )* this_CLOSEDCURLY_5= RULE_CLOSEDCURLY ) | this_ENDLINE_6= RULE_ENDLINE ) ) )
            // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:197:1: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Part ' ( (lv_name_2_0= RULE_ID ) ) ( (this_OPENCURLY_3= RULE_OPENCURLY ( (lv_parts_4_0= rulePart ) )* this_CLOSEDCURLY_5= RULE_CLOSEDCURLY ) | this_ENDLINE_6= RULE_ENDLINE ) )
            {
            // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:197:1: ( ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Part ' ( (lv_name_2_0= RULE_ID ) ) ( (this_OPENCURLY_3= RULE_OPENCURLY ( (lv_parts_4_0= rulePart ) )* this_CLOSEDCURLY_5= RULE_CLOSEDCURLY ) | this_ENDLINE_6= RULE_ENDLINE ) )
            // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:197:2: ( (lv_description_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'Part ' ( (lv_name_2_0= RULE_ID ) ) ( (this_OPENCURLY_3= RULE_OPENCURLY ( (lv_parts_4_0= rulePart ) )* this_CLOSEDCURLY_5= RULE_CLOSEDCURLY ) | this_ENDLINE_6= RULE_ENDLINE )
            {
            // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:197:2: ( (lv_description_0_0= RULE_ML_COMMENT ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ML_COMMENT) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:198:1: (lv_description_0_0= RULE_ML_COMMENT )
                    {
                    // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:198:1: (lv_description_0_0= RULE_ML_COMMENT )
                    // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:199:3: lv_description_0_0= RULE_ML_COMMENT
                    {
                    lv_description_0_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_rulePart387); 

                    			newLeafNode(lv_description_0_0, grammarAccess.getPartAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPartRule());
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

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_rulePart405); 

                	newLeafNode(otherlv_1, grammarAccess.getPartAccess().getPartKeyword_1());
                
            // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:219:1: ( (lv_name_2_0= RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:220:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:220:1: (lv_name_2_0= RULE_ID )
            // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:221:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePart422); 

            			newLeafNode(lv_name_2_0, grammarAccess.getPartAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPartRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:237:2: ( (this_OPENCURLY_3= RULE_OPENCURLY ( (lv_parts_4_0= rulePart ) )* this_CLOSEDCURLY_5= RULE_CLOSEDCURLY ) | this_ENDLINE_6= RULE_ENDLINE )
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
                    // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:237:3: (this_OPENCURLY_3= RULE_OPENCURLY ( (lv_parts_4_0= rulePart ) )* this_CLOSEDCURLY_5= RULE_CLOSEDCURLY )
                    {
                    // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:237:3: (this_OPENCURLY_3= RULE_OPENCURLY ( (lv_parts_4_0= rulePart ) )* this_CLOSEDCURLY_5= RULE_CLOSEDCURLY )
                    // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:237:4: this_OPENCURLY_3= RULE_OPENCURLY ( (lv_parts_4_0= rulePart ) )* this_CLOSEDCURLY_5= RULE_CLOSEDCURLY
                    {
                    this_OPENCURLY_3=(Token)match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_rulePart440); 
                     
                        newLeafNode(this_OPENCURLY_3, grammarAccess.getPartAccess().getOPENCURLYTerminalRuleCall_3_0_0()); 
                        
                    // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:241:1: ( (lv_parts_4_0= rulePart ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_ML_COMMENT||LA4_0==15) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:242:1: (lv_parts_4_0= rulePart )
                    	    {
                    	    // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:242:1: (lv_parts_4_0= rulePart )
                    	    // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:243:3: lv_parts_4_0= rulePart
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPartAccess().getPartsPartParserRuleCall_3_0_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePart_in_rulePart460);
                    	    lv_parts_4_0=rulePart();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPartRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parts",
                    	            		lv_parts_4_0, 
                    	            		"Part");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    this_CLOSEDCURLY_5=(Token)match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_rulePart472); 
                     
                        newLeafNode(this_CLOSEDCURLY_5, grammarAccess.getPartAccess().getCLOSEDCURLYTerminalRuleCall_3_0_2()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.mdpm.lng.pbs/src-gen/com/lowcoupling/mdpm/lng/pbs/parser/antlr/internal/InternalPBS.g:264:6: this_ENDLINE_6= RULE_ENDLINE
                    {
                    this_ENDLINE_6=(Token)match(input,RULE_ENDLINE,FOLLOW_RULE_ENDLINE_in_rulePart489); 
                     
                        newLeafNode(this_ENDLINE_6, grammarAccess.getPartAccess().getENDLINETerminalRuleCall_3_1()); 
                        

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
    // $ANTLR end "rulePart"

    // Delegated rules


 

    public static final BitSet FOLLOW_rulePBS_in_entryRulePBS75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePBS85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProduct_in_rulePBS131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProduct_in_entryRuleProduct165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProduct175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_ruleProduct217 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleProduct235 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProduct252 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_ruleProduct268 = new BitSet(new long[]{0x0000000000008090L});
    public static final BitSet FOLLOW_rulePart_in_ruleProduct288 = new BitSet(new long[]{0x0000000000008090L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_ruleProduct300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePart_in_entryRulePart335 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePart345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_rulePart387 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePart405 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePart422 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_rulePart440 = new BitSet(new long[]{0x0000000000008090L});
    public static final BitSet FOLLOW_rulePart_in_rulePart460 = new BitSet(new long[]{0x0000000000008090L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_rulePart472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ENDLINE_in_rulePart489 = new BitSet(new long[]{0x0000000000000002L});

}