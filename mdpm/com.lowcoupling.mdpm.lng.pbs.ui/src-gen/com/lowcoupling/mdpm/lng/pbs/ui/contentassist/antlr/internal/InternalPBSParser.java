package com.lowcoupling.mdpm.lng.pbs.ui.contentassist.antlr.internal; 

import org.antlr.runtime.BitSet;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.TokenStream;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.lowcoupling.mdpm.lng.pbs.services.PBSGrammarAccess;

@SuppressWarnings("all")
public class InternalPBSParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ENDLINE", "RULE_OPENCURLY", "RULE_CLOSEDCURLY", "RULE_ML_COMMENT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Product '", "'Part '"
    };
    public static final int RULE_ID=8;
    public static final int RULE_STRING=10;
    public static final int T__15=15;
    public static final int RULE_CLOSEDCURLY=6;
    public static final int T__14=14;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_INT=9;
    public static final int RULE_OPENCURLY=5;
    public static final int RULE_WS=12;
    public static final int RULE_SL_COMMENT=11;
    public static final int EOF=-1;
    public static final int RULE_ENDLINE=4;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalPBSParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPBSParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPBSParser.tokenNames; }
    public String getGrammarFileName() { return "../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g"; }


     
     	private PBSGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(PBSGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRulePBS"
    // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:60:1: entryRulePBS : rulePBS EOF ;
    public final void entryRulePBS() throws RecognitionException {
        try {
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:61:1: ( rulePBS EOF )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:62:1: rulePBS EOF
            {
             before(grammarAccess.getPBSRule()); 
            pushFollow(FOLLOW_rulePBS_in_entryRulePBS61);
            rulePBS();

            state._fsp--;

             after(grammarAccess.getPBSRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePBS68); 

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
    // $ANTLR end "entryRulePBS"


    // $ANTLR start "rulePBS"
    // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:69:1: rulePBS : ( ruleProduct ) ;
    public final void rulePBS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:73:2: ( ( ruleProduct ) )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:74:1: ( ruleProduct )
            {
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:74:1: ( ruleProduct )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:75:1: ruleProduct
            {
             before(grammarAccess.getPBSAccess().getProductParserRuleCall()); 
            pushFollow(FOLLOW_ruleProduct_in_rulePBS94);
            ruleProduct();

            state._fsp--;

             after(grammarAccess.getPBSAccess().getProductParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePBS"


    // $ANTLR start "entryRuleProduct"
    // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:88:1: entryRuleProduct : ruleProduct EOF ;
    public final void entryRuleProduct() throws RecognitionException {
        try {
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:89:1: ( ruleProduct EOF )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:90:1: ruleProduct EOF
            {
             before(grammarAccess.getProductRule()); 
            pushFollow(FOLLOW_ruleProduct_in_entryRuleProduct120);
            ruleProduct();

            state._fsp--;

             after(grammarAccess.getProductRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProduct127); 

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
    // $ANTLR end "entryRuleProduct"


    // $ANTLR start "ruleProduct"
    // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:97:1: ruleProduct : ( ( rule__Product__Group__0 ) ) ;
    public final void ruleProduct() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:101:2: ( ( ( rule__Product__Group__0 ) ) )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:102:1: ( ( rule__Product__Group__0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:102:1: ( ( rule__Product__Group__0 ) )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:103:1: ( rule__Product__Group__0 )
            {
             before(grammarAccess.getProductAccess().getGroup()); 
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:104:1: ( rule__Product__Group__0 )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:104:2: rule__Product__Group__0
            {
            pushFollow(FOLLOW_rule__Product__Group__0_in_ruleProduct153);
            rule__Product__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProductAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProduct"


    // $ANTLR start "entryRulePart"
    // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:116:1: entryRulePart : rulePart EOF ;
    public final void entryRulePart() throws RecognitionException {
        try {
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:117:1: ( rulePart EOF )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:118:1: rulePart EOF
            {
             before(grammarAccess.getPartRule()); 
            pushFollow(FOLLOW_rulePart_in_entryRulePart180);
            rulePart();

            state._fsp--;

             after(grammarAccess.getPartRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePart187); 

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
    // $ANTLR end "entryRulePart"


    // $ANTLR start "rulePart"
    // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:125:1: rulePart : ( ( rule__Part__Group__0 ) ) ;
    public final void rulePart() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:129:2: ( ( ( rule__Part__Group__0 ) ) )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:130:1: ( ( rule__Part__Group__0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:130:1: ( ( rule__Part__Group__0 ) )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:131:1: ( rule__Part__Group__0 )
            {
             before(grammarAccess.getPartAccess().getGroup()); 
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:132:1: ( rule__Part__Group__0 )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:132:2: rule__Part__Group__0
            {
            pushFollow(FOLLOW_rule__Part__Group__0_in_rulePart213);
            rule__Part__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPartAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePart"


    // $ANTLR start "rule__Part__Alternatives_3"
    // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:144:1: rule__Part__Alternatives_3 : ( ( ( rule__Part__Group_3_0__0 ) ) | ( RULE_ENDLINE ) );
    public final void rule__Part__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:148:1: ( ( ( rule__Part__Group_3_0__0 ) ) | ( RULE_ENDLINE ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_OPENCURLY) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ENDLINE) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:149:1: ( ( rule__Part__Group_3_0__0 ) )
                    {
                    // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:149:1: ( ( rule__Part__Group_3_0__0 ) )
                    // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:150:1: ( rule__Part__Group_3_0__0 )
                    {
                     before(grammarAccess.getPartAccess().getGroup_3_0()); 
                    // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:151:1: ( rule__Part__Group_3_0__0 )
                    // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:151:2: rule__Part__Group_3_0__0
                    {
                    pushFollow(FOLLOW_rule__Part__Group_3_0__0_in_rule__Part__Alternatives_3249);
                    rule__Part__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPartAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:155:6: ( RULE_ENDLINE )
                    {
                    // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:155:6: ( RULE_ENDLINE )
                    // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:156:1: RULE_ENDLINE
                    {
                     before(grammarAccess.getPartAccess().getENDLINETerminalRuleCall_3_1()); 
                    match(input,RULE_ENDLINE,FOLLOW_RULE_ENDLINE_in_rule__Part__Alternatives_3267); 
                     after(grammarAccess.getPartAccess().getENDLINETerminalRuleCall_3_1()); 

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
    // $ANTLR end "rule__Part__Alternatives_3"


    // $ANTLR start "rule__Product__Group__0"
    // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:168:1: rule__Product__Group__0 : rule__Product__Group__0__Impl rule__Product__Group__1 ;
    public final void rule__Product__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:172:1: ( rule__Product__Group__0__Impl rule__Product__Group__1 )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:173:2: rule__Product__Group__0__Impl rule__Product__Group__1
            {
            pushFollow(FOLLOW_rule__Product__Group__0__Impl_in_rule__Product__Group__0297);
            rule__Product__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Product__Group__1_in_rule__Product__Group__0300);
            rule__Product__Group__1();

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
    // $ANTLR end "rule__Product__Group__0"


    // $ANTLR start "rule__Product__Group__0__Impl"
    // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:180:1: rule__Product__Group__0__Impl : ( ( rule__Product__DescriptionAssignment_0 )? ) ;
    public final void rule__Product__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:184:1: ( ( ( rule__Product__DescriptionAssignment_0 )? ) )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:185:1: ( ( rule__Product__DescriptionAssignment_0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:185:1: ( ( rule__Product__DescriptionAssignment_0 )? )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:186:1: ( rule__Product__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getProductAccess().getDescriptionAssignment_0()); 
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:187:1: ( rule__Product__DescriptionAssignment_0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ML_COMMENT) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:187:2: rule__Product__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Product__DescriptionAssignment_0_in_rule__Product__Group__0__Impl327);
                    rule__Product__DescriptionAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProductAccess().getDescriptionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Product__Group__0__Impl"


    // $ANTLR start "rule__Product__Group__1"
    // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:197:1: rule__Product__Group__1 : rule__Product__Group__1__Impl rule__Product__Group__2 ;
    public final void rule__Product__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:201:1: ( rule__Product__Group__1__Impl rule__Product__Group__2 )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:202:2: rule__Product__Group__1__Impl rule__Product__Group__2
            {
            pushFollow(FOLLOW_rule__Product__Group__1__Impl_in_rule__Product__Group__1358);
            rule__Product__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Product__Group__2_in_rule__Product__Group__1361);
            rule__Product__Group__2();

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
    // $ANTLR end "rule__Product__Group__1"


    // $ANTLR start "rule__Product__Group__1__Impl"
    // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:209:1: rule__Product__Group__1__Impl : ( 'Product ' ) ;
    public final void rule__Product__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:213:1: ( ( 'Product ' ) )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:214:1: ( 'Product ' )
            {
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:214:1: ( 'Product ' )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:215:1: 'Product '
            {
             before(grammarAccess.getProductAccess().getProductKeyword_1()); 
            match(input,14,FOLLOW_14_in_rule__Product__Group__1__Impl389); 
             after(grammarAccess.getProductAccess().getProductKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Product__Group__1__Impl"


    // $ANTLR start "rule__Product__Group__2"
    // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:228:1: rule__Product__Group__2 : rule__Product__Group__2__Impl rule__Product__Group__3 ;
    public final void rule__Product__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:232:1: ( rule__Product__Group__2__Impl rule__Product__Group__3 )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:233:2: rule__Product__Group__2__Impl rule__Product__Group__3
            {
            pushFollow(FOLLOW_rule__Product__Group__2__Impl_in_rule__Product__Group__2420);
            rule__Product__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Product__Group__3_in_rule__Product__Group__2423);
            rule__Product__Group__3();

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
    // $ANTLR end "rule__Product__Group__2"


    // $ANTLR start "rule__Product__Group__2__Impl"
    // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:240:1: rule__Product__Group__2__Impl : ( ( rule__Product__NameAssignment_2 ) ) ;
    public final void rule__Product__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:244:1: ( ( ( rule__Product__NameAssignment_2 ) ) )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:245:1: ( ( rule__Product__NameAssignment_2 ) )
            {
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:245:1: ( ( rule__Product__NameAssignment_2 ) )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:246:1: ( rule__Product__NameAssignment_2 )
            {
             before(grammarAccess.getProductAccess().getNameAssignment_2()); 
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:247:1: ( rule__Product__NameAssignment_2 )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:247:2: rule__Product__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Product__NameAssignment_2_in_rule__Product__Group__2__Impl450);
            rule__Product__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProductAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Product__Group__2__Impl"


    // $ANTLR start "rule__Product__Group__3"
    // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:257:1: rule__Product__Group__3 : rule__Product__Group__3__Impl rule__Product__Group__4 ;
    public final void rule__Product__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:261:1: ( rule__Product__Group__3__Impl rule__Product__Group__4 )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:262:2: rule__Product__Group__3__Impl rule__Product__Group__4
            {
            pushFollow(FOLLOW_rule__Product__Group__3__Impl_in_rule__Product__Group__3480);
            rule__Product__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Product__Group__4_in_rule__Product__Group__3483);
            rule__Product__Group__4();

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
    // $ANTLR end "rule__Product__Group__3"


    // $ANTLR start "rule__Product__Group__3__Impl"
    // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:269:1: rule__Product__Group__3__Impl : ( RULE_OPENCURLY ) ;
    public final void rule__Product__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:273:1: ( ( RULE_OPENCURLY ) )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:274:1: ( RULE_OPENCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:274:1: ( RULE_OPENCURLY )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:275:1: RULE_OPENCURLY
            {
             before(grammarAccess.getProductAccess().getOPENCURLYTerminalRuleCall_3()); 
            match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_rule__Product__Group__3__Impl510); 
             after(grammarAccess.getProductAccess().getOPENCURLYTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Product__Group__3__Impl"


    // $ANTLR start "rule__Product__Group__4"
    // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:286:1: rule__Product__Group__4 : rule__Product__Group__4__Impl rule__Product__Group__5 ;
    public final void rule__Product__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:290:1: ( rule__Product__Group__4__Impl rule__Product__Group__5 )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:291:2: rule__Product__Group__4__Impl rule__Product__Group__5
            {
            pushFollow(FOLLOW_rule__Product__Group__4__Impl_in_rule__Product__Group__4539);
            rule__Product__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Product__Group__5_in_rule__Product__Group__4542);
            rule__Product__Group__5();

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
    // $ANTLR end "rule__Product__Group__4"


    // $ANTLR start "rule__Product__Group__4__Impl"
    // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:298:1: rule__Product__Group__4__Impl : ( ( rule__Product__PartsAssignment_4 )* ) ;
    public final void rule__Product__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:302:1: ( ( ( rule__Product__PartsAssignment_4 )* ) )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:303:1: ( ( rule__Product__PartsAssignment_4 )* )
            {
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:303:1: ( ( rule__Product__PartsAssignment_4 )* )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:304:1: ( rule__Product__PartsAssignment_4 )*
            {
             before(grammarAccess.getProductAccess().getPartsAssignment_4()); 
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:305:1: ( rule__Product__PartsAssignment_4 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ML_COMMENT||LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:305:2: rule__Product__PartsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Product__PartsAssignment_4_in_rule__Product__Group__4__Impl569);
            	    rule__Product__PartsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getProductAccess().getPartsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Product__Group__4__Impl"


    // $ANTLR start "rule__Product__Group__5"
    // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:315:1: rule__Product__Group__5 : rule__Product__Group__5__Impl ;
    public final void rule__Product__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:319:1: ( rule__Product__Group__5__Impl )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:320:2: rule__Product__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Product__Group__5__Impl_in_rule__Product__Group__5600);
            rule__Product__Group__5__Impl();

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
    // $ANTLR end "rule__Product__Group__5"


    // $ANTLR start "rule__Product__Group__5__Impl"
    // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:326:1: rule__Product__Group__5__Impl : ( RULE_CLOSEDCURLY ) ;
    public final void rule__Product__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:330:1: ( ( RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:331:1: ( RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:331:1: ( RULE_CLOSEDCURLY )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:332:1: RULE_CLOSEDCURLY
            {
             before(grammarAccess.getProductAccess().getCLOSEDCURLYTerminalRuleCall_5()); 
            match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_rule__Product__Group__5__Impl627); 
             after(grammarAccess.getProductAccess().getCLOSEDCURLYTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Product__Group__5__Impl"


    // $ANTLR start "rule__Part__Group__0"
    // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:355:1: rule__Part__Group__0 : rule__Part__Group__0__Impl rule__Part__Group__1 ;
    public final void rule__Part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:359:1: ( rule__Part__Group__0__Impl rule__Part__Group__1 )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:360:2: rule__Part__Group__0__Impl rule__Part__Group__1
            {
            pushFollow(FOLLOW_rule__Part__Group__0__Impl_in_rule__Part__Group__0668);
            rule__Part__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Part__Group__1_in_rule__Part__Group__0671);
            rule__Part__Group__1();

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
    // $ANTLR end "rule__Part__Group__0"


    // $ANTLR start "rule__Part__Group__0__Impl"
    // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:367:1: rule__Part__Group__0__Impl : ( ( rule__Part__DescriptionAssignment_0 )? ) ;
    public final void rule__Part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:371:1: ( ( ( rule__Part__DescriptionAssignment_0 )? ) )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:372:1: ( ( rule__Part__DescriptionAssignment_0 )? )
            {
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:372:1: ( ( rule__Part__DescriptionAssignment_0 )? )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:373:1: ( rule__Part__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getPartAccess().getDescriptionAssignment_0()); 
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:374:1: ( rule__Part__DescriptionAssignment_0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ML_COMMENT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:374:2: rule__Part__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Part__DescriptionAssignment_0_in_rule__Part__Group__0__Impl698);
                    rule__Part__DescriptionAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPartAccess().getDescriptionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Part__Group__0__Impl"


    // $ANTLR start "rule__Part__Group__1"
    // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:384:1: rule__Part__Group__1 : rule__Part__Group__1__Impl rule__Part__Group__2 ;
    public final void rule__Part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:388:1: ( rule__Part__Group__1__Impl rule__Part__Group__2 )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:389:2: rule__Part__Group__1__Impl rule__Part__Group__2
            {
            pushFollow(FOLLOW_rule__Part__Group__1__Impl_in_rule__Part__Group__1729);
            rule__Part__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Part__Group__2_in_rule__Part__Group__1732);
            rule__Part__Group__2();

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
    // $ANTLR end "rule__Part__Group__1"


    // $ANTLR start "rule__Part__Group__1__Impl"
    // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:396:1: rule__Part__Group__1__Impl : ( 'Part ' ) ;
    public final void rule__Part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:400:1: ( ( 'Part ' ) )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:401:1: ( 'Part ' )
            {
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:401:1: ( 'Part ' )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:402:1: 'Part '
            {
             before(grammarAccess.getPartAccess().getPartKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__Part__Group__1__Impl760); 
             after(grammarAccess.getPartAccess().getPartKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Part__Group__1__Impl"


    // $ANTLR start "rule__Part__Group__2"
    // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:415:1: rule__Part__Group__2 : rule__Part__Group__2__Impl rule__Part__Group__3 ;
    public final void rule__Part__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:419:1: ( rule__Part__Group__2__Impl rule__Part__Group__3 )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:420:2: rule__Part__Group__2__Impl rule__Part__Group__3
            {
            pushFollow(FOLLOW_rule__Part__Group__2__Impl_in_rule__Part__Group__2791);
            rule__Part__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Part__Group__3_in_rule__Part__Group__2794);
            rule__Part__Group__3();

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
    // $ANTLR end "rule__Part__Group__2"


    // $ANTLR start "rule__Part__Group__2__Impl"
    // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:427:1: rule__Part__Group__2__Impl : ( ( rule__Part__NameAssignment_2 ) ) ;
    public final void rule__Part__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:431:1: ( ( ( rule__Part__NameAssignment_2 ) ) )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:432:1: ( ( rule__Part__NameAssignment_2 ) )
            {
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:432:1: ( ( rule__Part__NameAssignment_2 ) )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:433:1: ( rule__Part__NameAssignment_2 )
            {
             before(grammarAccess.getPartAccess().getNameAssignment_2()); 
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:434:1: ( rule__Part__NameAssignment_2 )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:434:2: rule__Part__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Part__NameAssignment_2_in_rule__Part__Group__2__Impl821);
            rule__Part__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPartAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Part__Group__2__Impl"


    // $ANTLR start "rule__Part__Group__3"
    // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:444:1: rule__Part__Group__3 : rule__Part__Group__3__Impl ;
    public final void rule__Part__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:448:1: ( rule__Part__Group__3__Impl )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:449:2: rule__Part__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Part__Group__3__Impl_in_rule__Part__Group__3851);
            rule__Part__Group__3__Impl();

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
    // $ANTLR end "rule__Part__Group__3"


    // $ANTLR start "rule__Part__Group__3__Impl"
    // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:455:1: rule__Part__Group__3__Impl : ( ( rule__Part__Alternatives_3 ) ) ;
    public final void rule__Part__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:459:1: ( ( ( rule__Part__Alternatives_3 ) ) )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:460:1: ( ( rule__Part__Alternatives_3 ) )
            {
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:460:1: ( ( rule__Part__Alternatives_3 ) )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:461:1: ( rule__Part__Alternatives_3 )
            {
             before(grammarAccess.getPartAccess().getAlternatives_3()); 
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:462:1: ( rule__Part__Alternatives_3 )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:462:2: rule__Part__Alternatives_3
            {
            pushFollow(FOLLOW_rule__Part__Alternatives_3_in_rule__Part__Group__3__Impl878);
            rule__Part__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getPartAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Part__Group__3__Impl"


    // $ANTLR start "rule__Part__Group_3_0__0"
    // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:480:1: rule__Part__Group_3_0__0 : rule__Part__Group_3_0__0__Impl rule__Part__Group_3_0__1 ;
    public final void rule__Part__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:484:1: ( rule__Part__Group_3_0__0__Impl rule__Part__Group_3_0__1 )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:485:2: rule__Part__Group_3_0__0__Impl rule__Part__Group_3_0__1
            {
            pushFollow(FOLLOW_rule__Part__Group_3_0__0__Impl_in_rule__Part__Group_3_0__0916);
            rule__Part__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Part__Group_3_0__1_in_rule__Part__Group_3_0__0919);
            rule__Part__Group_3_0__1();

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
    // $ANTLR end "rule__Part__Group_3_0__0"


    // $ANTLR start "rule__Part__Group_3_0__0__Impl"
    // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:492:1: rule__Part__Group_3_0__0__Impl : ( RULE_OPENCURLY ) ;
    public final void rule__Part__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:496:1: ( ( RULE_OPENCURLY ) )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:497:1: ( RULE_OPENCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:497:1: ( RULE_OPENCURLY )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:498:1: RULE_OPENCURLY
            {
             before(grammarAccess.getPartAccess().getOPENCURLYTerminalRuleCall_3_0_0()); 
            match(input,RULE_OPENCURLY,FOLLOW_RULE_OPENCURLY_in_rule__Part__Group_3_0__0__Impl946); 
             after(grammarAccess.getPartAccess().getOPENCURLYTerminalRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Part__Group_3_0__0__Impl"


    // $ANTLR start "rule__Part__Group_3_0__1"
    // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:509:1: rule__Part__Group_3_0__1 : rule__Part__Group_3_0__1__Impl rule__Part__Group_3_0__2 ;
    public final void rule__Part__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:513:1: ( rule__Part__Group_3_0__1__Impl rule__Part__Group_3_0__2 )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:514:2: rule__Part__Group_3_0__1__Impl rule__Part__Group_3_0__2
            {
            pushFollow(FOLLOW_rule__Part__Group_3_0__1__Impl_in_rule__Part__Group_3_0__1975);
            rule__Part__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Part__Group_3_0__2_in_rule__Part__Group_3_0__1978);
            rule__Part__Group_3_0__2();

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
    // $ANTLR end "rule__Part__Group_3_0__1"


    // $ANTLR start "rule__Part__Group_3_0__1__Impl"
    // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:521:1: rule__Part__Group_3_0__1__Impl : ( ( rule__Part__PartsAssignment_3_0_1 )* ) ;
    public final void rule__Part__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:525:1: ( ( ( rule__Part__PartsAssignment_3_0_1 )* ) )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:526:1: ( ( rule__Part__PartsAssignment_3_0_1 )* )
            {
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:526:1: ( ( rule__Part__PartsAssignment_3_0_1 )* )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:527:1: ( rule__Part__PartsAssignment_3_0_1 )*
            {
             before(grammarAccess.getPartAccess().getPartsAssignment_3_0_1()); 
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:528:1: ( rule__Part__PartsAssignment_3_0_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ML_COMMENT||LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:528:2: rule__Part__PartsAssignment_3_0_1
            	    {
            	    pushFollow(FOLLOW_rule__Part__PartsAssignment_3_0_1_in_rule__Part__Group_3_0__1__Impl1005);
            	    rule__Part__PartsAssignment_3_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getPartAccess().getPartsAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Part__Group_3_0__1__Impl"


    // $ANTLR start "rule__Part__Group_3_0__2"
    // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:538:1: rule__Part__Group_3_0__2 : rule__Part__Group_3_0__2__Impl ;
    public final void rule__Part__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:542:1: ( rule__Part__Group_3_0__2__Impl )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:543:2: rule__Part__Group_3_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Part__Group_3_0__2__Impl_in_rule__Part__Group_3_0__21036);
            rule__Part__Group_3_0__2__Impl();

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
    // $ANTLR end "rule__Part__Group_3_0__2"


    // $ANTLR start "rule__Part__Group_3_0__2__Impl"
    // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:549:1: rule__Part__Group_3_0__2__Impl : ( RULE_CLOSEDCURLY ) ;
    public final void rule__Part__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:553:1: ( ( RULE_CLOSEDCURLY ) )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:554:1: ( RULE_CLOSEDCURLY )
            {
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:554:1: ( RULE_CLOSEDCURLY )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:555:1: RULE_CLOSEDCURLY
            {
             before(grammarAccess.getPartAccess().getCLOSEDCURLYTerminalRuleCall_3_0_2()); 
            match(input,RULE_CLOSEDCURLY,FOLLOW_RULE_CLOSEDCURLY_in_rule__Part__Group_3_0__2__Impl1063); 
             after(grammarAccess.getPartAccess().getCLOSEDCURLYTerminalRuleCall_3_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Part__Group_3_0__2__Impl"


    // $ANTLR start "rule__Product__DescriptionAssignment_0"
    // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:573:1: rule__Product__DescriptionAssignment_0 : ( RULE_ML_COMMENT ) ;
    public final void rule__Product__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:577:1: ( ( RULE_ML_COMMENT ) )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:578:1: ( RULE_ML_COMMENT )
            {
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:578:1: ( RULE_ML_COMMENT )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:579:1: RULE_ML_COMMENT
            {
             before(grammarAccess.getProductAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_rule__Product__DescriptionAssignment_01103); 
             after(grammarAccess.getProductAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Product__DescriptionAssignment_0"


    // $ANTLR start "rule__Product__NameAssignment_2"
    // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:588:1: rule__Product__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Product__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:592:1: ( ( RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:593:1: ( RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:593:1: ( RULE_ID )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:594:1: RULE_ID
            {
             before(grammarAccess.getProductAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Product__NameAssignment_21134); 
             after(grammarAccess.getProductAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Product__NameAssignment_2"


    // $ANTLR start "rule__Product__PartsAssignment_4"
    // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:603:1: rule__Product__PartsAssignment_4 : ( rulePart ) ;
    public final void rule__Product__PartsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:607:1: ( ( rulePart ) )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:608:1: ( rulePart )
            {
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:608:1: ( rulePart )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:609:1: rulePart
            {
             before(grammarAccess.getProductAccess().getPartsPartParserRuleCall_4_0()); 
            pushFollow(FOLLOW_rulePart_in_rule__Product__PartsAssignment_41165);
            rulePart();

            state._fsp--;

             after(grammarAccess.getProductAccess().getPartsPartParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Product__PartsAssignment_4"


    // $ANTLR start "rule__Part__DescriptionAssignment_0"
    // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:618:1: rule__Part__DescriptionAssignment_0 : ( RULE_ML_COMMENT ) ;
    public final void rule__Part__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:622:1: ( ( RULE_ML_COMMENT ) )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:623:1: ( RULE_ML_COMMENT )
            {
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:623:1: ( RULE_ML_COMMENT )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:624:1: RULE_ML_COMMENT
            {
             before(grammarAccess.getPartAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_rule__Part__DescriptionAssignment_01196); 
             after(grammarAccess.getPartAccess().getDescriptionML_COMMENTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Part__DescriptionAssignment_0"


    // $ANTLR start "rule__Part__NameAssignment_2"
    // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:633:1: rule__Part__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Part__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:637:1: ( ( RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:638:1: ( RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:638:1: ( RULE_ID )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:639:1: RULE_ID
            {
             before(grammarAccess.getPartAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Part__NameAssignment_21227); 
             after(grammarAccess.getPartAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Part__NameAssignment_2"


    // $ANTLR start "rule__Part__PartsAssignment_3_0_1"
    // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:648:1: rule__Part__PartsAssignment_3_0_1 : ( rulePart ) ;
    public final void rule__Part__PartsAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:652:1: ( ( rulePart ) )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:653:1: ( rulePart )
            {
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:653:1: ( rulePart )
            // ../com.lowcoupling.mdpm.lng.pbs.ui/src-gen/com/lowcoupling/mdpm/lng/pbs/ui/contentassist/antlr/internal/InternalPBS.g:654:1: rulePart
            {
             before(grammarAccess.getPartAccess().getPartsPartParserRuleCall_3_0_1_0()); 
            pushFollow(FOLLOW_rulePart_in_rule__Part__PartsAssignment_3_0_11258);
            rulePart();

            state._fsp--;

             after(grammarAccess.getPartAccess().getPartsPartParserRuleCall_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Part__PartsAssignment_3_0_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_rulePBS_in_entryRulePBS61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePBS68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProduct_in_rulePBS94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProduct_in_entryRuleProduct120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProduct127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Product__Group__0_in_ruleProduct153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePart_in_entryRulePart180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePart187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__Group__0_in_rulePart213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__Group_3_0__0_in_rule__Part__Alternatives_3249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ENDLINE_in_rule__Part__Alternatives_3267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Product__Group__0__Impl_in_rule__Product__Group__0297 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Product__Group__1_in_rule__Product__Group__0300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Product__DescriptionAssignment_0_in_rule__Product__Group__0__Impl327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Product__Group__1__Impl_in_rule__Product__Group__1358 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Product__Group__2_in_rule__Product__Group__1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Product__Group__1__Impl389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Product__Group__2__Impl_in_rule__Product__Group__2420 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Product__Group__3_in_rule__Product__Group__2423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Product__NameAssignment_2_in_rule__Product__Group__2__Impl450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Product__Group__3__Impl_in_rule__Product__Group__3480 = new BitSet(new long[]{0x00000000000080C0L});
    public static final BitSet FOLLOW_rule__Product__Group__4_in_rule__Product__Group__3483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_rule__Product__Group__3__Impl510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Product__Group__4__Impl_in_rule__Product__Group__4539 = new BitSet(new long[]{0x00000000000080C0L});
    public static final BitSet FOLLOW_rule__Product__Group__5_in_rule__Product__Group__4542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Product__PartsAssignment_4_in_rule__Product__Group__4__Impl569 = new BitSet(new long[]{0x0000000000008082L});
    public static final BitSet FOLLOW_rule__Product__Group__5__Impl_in_rule__Product__Group__5600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_rule__Product__Group__5__Impl627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__Group__0__Impl_in_rule__Part__Group__0668 = new BitSet(new long[]{0x0000000000008080L});
    public static final BitSet FOLLOW_rule__Part__Group__1_in_rule__Part__Group__0671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__DescriptionAssignment_0_in_rule__Part__Group__0__Impl698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__Group__1__Impl_in_rule__Part__Group__1729 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Part__Group__2_in_rule__Part__Group__1732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Part__Group__1__Impl760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__Group__2__Impl_in_rule__Part__Group__2791 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Part__Group__3_in_rule__Part__Group__2794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__NameAssignment_2_in_rule__Part__Group__2__Impl821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__Group__3__Impl_in_rule__Part__Group__3851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__Alternatives_3_in_rule__Part__Group__3__Impl878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__Group_3_0__0__Impl_in_rule__Part__Group_3_0__0916 = new BitSet(new long[]{0x00000000000080C0L});
    public static final BitSet FOLLOW_rule__Part__Group_3_0__1_in_rule__Part__Group_3_0__0919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPENCURLY_in_rule__Part__Group_3_0__0__Impl946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__Group_3_0__1__Impl_in_rule__Part__Group_3_0__1975 = new BitSet(new long[]{0x00000000000080C0L});
    public static final BitSet FOLLOW_rule__Part__Group_3_0__2_in_rule__Part__Group_3_0__1978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__PartsAssignment_3_0_1_in_rule__Part__Group_3_0__1__Impl1005 = new BitSet(new long[]{0x0000000000008082L});
    public static final BitSet FOLLOW_rule__Part__Group_3_0__2__Impl_in_rule__Part__Group_3_0__21036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLOSEDCURLY_in_rule__Part__Group_3_0__2__Impl1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_rule__Product__DescriptionAssignment_01103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Product__NameAssignment_21134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePart_in_rule__Product__PartsAssignment_41165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_rule__Part__DescriptionAssignment_01196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Part__NameAssignment_21227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePart_in_rule__Part__PartsAssignment_3_0_11258 = new BitSet(new long[]{0x0000000000000002L});

}