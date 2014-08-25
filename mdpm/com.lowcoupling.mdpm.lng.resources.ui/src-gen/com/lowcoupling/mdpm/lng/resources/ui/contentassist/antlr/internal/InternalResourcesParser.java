package com.lowcoupling.mdpm.lng.resources.ui.contentassist.antlr.internal; 

import org.antlr.runtime.BitSet;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.TokenStream;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.lowcoupling.mdpm.lng.resources.services.ResourcesGrammarAccess;

@SuppressWarnings("all")
public class InternalResourcesParser extends AbstractInternalContentAssistParser {
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
    public String getGrammarFileName() { return "../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g"; }


     
     	private ResourcesGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ResourcesGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleResources"
    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:60:1: entryRuleResources : ruleResources EOF ;
    public final void entryRuleResources() throws RecognitionException {
        try {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:61:1: ( ruleResources EOF )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:62:1: ruleResources EOF
            {
             before(grammarAccess.getResourcesRule()); 
            pushFollow(FOLLOW_ruleResources_in_entryRuleResources61);
            ruleResources();

            state._fsp--;

             after(grammarAccess.getResourcesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResources68); 

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
    // $ANTLR end "entryRuleResources"


    // $ANTLR start "ruleResources"
    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:69:1: ruleResources : ( ( rule__Resources__Group__0 ) ) ;
    public final void ruleResources() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:73:2: ( ( ( rule__Resources__Group__0 ) ) )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:74:1: ( ( rule__Resources__Group__0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:74:1: ( ( rule__Resources__Group__0 ) )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:75:1: ( rule__Resources__Group__0 )
            {
             before(grammarAccess.getResourcesAccess().getGroup()); 
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:76:1: ( rule__Resources__Group__0 )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:76:2: rule__Resources__Group__0
            {
            pushFollow(FOLLOW_rule__Resources__Group__0_in_ruleResources94);
            rule__Resources__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResourcesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResources"


    // $ANTLR start "entryRuleResourceGroup"
    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:88:1: entryRuleResourceGroup : ruleResourceGroup EOF ;
    public final void entryRuleResourceGroup() throws RecognitionException {
        try {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:89:1: ( ruleResourceGroup EOF )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:90:1: ruleResourceGroup EOF
            {
             before(grammarAccess.getResourceGroupRule()); 
            pushFollow(FOLLOW_ruleResourceGroup_in_entryRuleResourceGroup121);
            ruleResourceGroup();

            state._fsp--;

             after(grammarAccess.getResourceGroupRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceGroup128); 

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
    // $ANTLR end "entryRuleResourceGroup"


    // $ANTLR start "ruleResourceGroup"
    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:97:1: ruleResourceGroup : ( ( rule__ResourceGroup__Group__0 ) ) ;
    public final void ruleResourceGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:101:2: ( ( ( rule__ResourceGroup__Group__0 ) ) )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:102:1: ( ( rule__ResourceGroup__Group__0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:102:1: ( ( rule__ResourceGroup__Group__0 ) )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:103:1: ( rule__ResourceGroup__Group__0 )
            {
             before(grammarAccess.getResourceGroupAccess().getGroup()); 
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:104:1: ( rule__ResourceGroup__Group__0 )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:104:2: rule__ResourceGroup__Group__0
            {
            pushFollow(FOLLOW_rule__ResourceGroup__Group__0_in_ruleResourceGroup154);
            rule__ResourceGroup__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResourceGroupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResourceGroup"


    // $ANTLR start "entryRuleResource"
    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:116:1: entryRuleResource : ruleResource EOF ;
    public final void entryRuleResource() throws RecognitionException {
        try {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:117:1: ( ruleResource EOF )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:118:1: ruleResource EOF
            {
             before(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_ruleResource_in_entryRuleResource181);
            ruleResource();

            state._fsp--;

             after(grammarAccess.getResourceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResource188); 

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
    // $ANTLR end "entryRuleResource"


    // $ANTLR start "ruleResource"
    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:125:1: ruleResource : ( ( rule__Resource__Group__0 ) ) ;
    public final void ruleResource() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:129:2: ( ( ( rule__Resource__Group__0 ) ) )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:130:1: ( ( rule__Resource__Group__0 ) )
            {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:130:1: ( ( rule__Resource__Group__0 ) )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:131:1: ( rule__Resource__Group__0 )
            {
             before(grammarAccess.getResourceAccess().getGroup()); 
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:132:1: ( rule__Resource__Group__0 )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:132:2: rule__Resource__Group__0
            {
            pushFollow(FOLLOW_rule__Resource__Group__0_in_ruleResource214);
            rule__Resource__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResource"


    // $ANTLR start "rule__Resources__Group__0"
    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:146:1: rule__Resources__Group__0 : rule__Resources__Group__0__Impl rule__Resources__Group__1 ;
    public final void rule__Resources__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:150:1: ( rule__Resources__Group__0__Impl rule__Resources__Group__1 )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:151:2: rule__Resources__Group__0__Impl rule__Resources__Group__1
            {
            pushFollow(FOLLOW_rule__Resources__Group__0__Impl_in_rule__Resources__Group__0248);
            rule__Resources__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resources__Group__1_in_rule__Resources__Group__0251);
            rule__Resources__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group__0"


    // $ANTLR start "rule__Resources__Group__0__Impl"
    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:158:1: rule__Resources__Group__0__Impl : ( ( rule__Resources__ResourceGroupsAssignment_0 )* ) ;
    public final void rule__Resources__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:162:1: ( ( ( rule__Resources__ResourceGroupsAssignment_0 )* ) )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:163:1: ( ( rule__Resources__ResourceGroupsAssignment_0 )* )
            {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:163:1: ( ( rule__Resources__ResourceGroupsAssignment_0 )* )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:164:1: ( rule__Resources__ResourceGroupsAssignment_0 )*
            {
             before(grammarAccess.getResourcesAccess().getResourceGroupsAssignment_0()); 
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:165:1: ( rule__Resources__ResourceGroupsAssignment_0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:165:2: rule__Resources__ResourceGroupsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Resources__ResourceGroupsAssignment_0_in_rule__Resources__Group__0__Impl278);
            	    rule__Resources__ResourceGroupsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getResourcesAccess().getResourceGroupsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group__0__Impl"


    // $ANTLR start "rule__Resources__Group__1"
    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:175:1: rule__Resources__Group__1 : rule__Resources__Group__1__Impl ;
    public final void rule__Resources__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:179:1: ( rule__Resources__Group__1__Impl )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:180:2: rule__Resources__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Resources__Group__1__Impl_in_rule__Resources__Group__1309);
            rule__Resources__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group__1"


    // $ANTLR start "rule__Resources__Group__1__Impl"
    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:186:1: rule__Resources__Group__1__Impl : ( ( rule__Resources__ResourcesAssignment_1 )* ) ;
    public final void rule__Resources__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:190:1: ( ( ( rule__Resources__ResourcesAssignment_1 )* ) )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:191:1: ( ( rule__Resources__ResourcesAssignment_1 )* )
            {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:191:1: ( ( rule__Resources__ResourcesAssignment_1 )* )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:192:1: ( rule__Resources__ResourcesAssignment_1 )*
            {
             before(grammarAccess.getResourcesAccess().getResourcesAssignment_1()); 
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:193:1: ( rule__Resources__ResourcesAssignment_1 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:193:2: rule__Resources__ResourcesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Resources__ResourcesAssignment_1_in_rule__Resources__Group__1__Impl336);
            	    rule__Resources__ResourcesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getResourcesAccess().getResourcesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group__1__Impl"


    // $ANTLR start "rule__ResourceGroup__Group__0"
    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:207:1: rule__ResourceGroup__Group__0 : rule__ResourceGroup__Group__0__Impl rule__ResourceGroup__Group__1 ;
    public final void rule__ResourceGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:211:1: ( rule__ResourceGroup__Group__0__Impl rule__ResourceGroup__Group__1 )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:212:2: rule__ResourceGroup__Group__0__Impl rule__ResourceGroup__Group__1
            {
            pushFollow(FOLLOW_rule__ResourceGroup__Group__0__Impl_in_rule__ResourceGroup__Group__0371);
            rule__ResourceGroup__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceGroup__Group__1_in_rule__ResourceGroup__Group__0374);
            rule__ResourceGroup__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceGroup__Group__0"


    // $ANTLR start "rule__ResourceGroup__Group__0__Impl"
    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:219:1: rule__ResourceGroup__Group__0__Impl : ( 'Group' ) ;
    public final void rule__ResourceGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:223:1: ( ( 'Group' ) )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:224:1: ( 'Group' )
            {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:224:1: ( 'Group' )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:225:1: 'Group'
            {
             before(grammarAccess.getResourceGroupAccess().getGroupKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__ResourceGroup__Group__0__Impl402); 
             after(grammarAccess.getResourceGroupAccess().getGroupKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceGroup__Group__0__Impl"


    // $ANTLR start "rule__ResourceGroup__Group__1"
    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:238:1: rule__ResourceGroup__Group__1 : rule__ResourceGroup__Group__1__Impl rule__ResourceGroup__Group__2 ;
    public final void rule__ResourceGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:242:1: ( rule__ResourceGroup__Group__1__Impl rule__ResourceGroup__Group__2 )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:243:2: rule__ResourceGroup__Group__1__Impl rule__ResourceGroup__Group__2
            {
            pushFollow(FOLLOW_rule__ResourceGroup__Group__1__Impl_in_rule__ResourceGroup__Group__1433);
            rule__ResourceGroup__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceGroup__Group__2_in_rule__ResourceGroup__Group__1436);
            rule__ResourceGroup__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceGroup__Group__1"


    // $ANTLR start "rule__ResourceGroup__Group__1__Impl"
    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:250:1: rule__ResourceGroup__Group__1__Impl : ( ( rule__ResourceGroup__NameAssignment_1 ) ) ;
    public final void rule__ResourceGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:254:1: ( ( ( rule__ResourceGroup__NameAssignment_1 ) ) )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:255:1: ( ( rule__ResourceGroup__NameAssignment_1 ) )
            {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:255:1: ( ( rule__ResourceGroup__NameAssignment_1 ) )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:256:1: ( rule__ResourceGroup__NameAssignment_1 )
            {
             before(grammarAccess.getResourceGroupAccess().getNameAssignment_1()); 
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:257:1: ( rule__ResourceGroup__NameAssignment_1 )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:257:2: rule__ResourceGroup__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ResourceGroup__NameAssignment_1_in_rule__ResourceGroup__Group__1__Impl463);
            rule__ResourceGroup__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getResourceGroupAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceGroup__Group__1__Impl"


    // $ANTLR start "rule__ResourceGroup__Group__2"
    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:267:1: rule__ResourceGroup__Group__2 : rule__ResourceGroup__Group__2__Impl rule__ResourceGroup__Group__3 ;
    public final void rule__ResourceGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:271:1: ( rule__ResourceGroup__Group__2__Impl rule__ResourceGroup__Group__3 )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:272:2: rule__ResourceGroup__Group__2__Impl rule__ResourceGroup__Group__3
            {
            pushFollow(FOLLOW_rule__ResourceGroup__Group__2__Impl_in_rule__ResourceGroup__Group__2493);
            rule__ResourceGroup__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceGroup__Group__3_in_rule__ResourceGroup__Group__2496);
            rule__ResourceGroup__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceGroup__Group__2"


    // $ANTLR start "rule__ResourceGroup__Group__2__Impl"
    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:279:1: rule__ResourceGroup__Group__2__Impl : ( '{' ) ;
    public final void rule__ResourceGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:283:1: ( ( '{' ) )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:284:1: ( '{' )
            {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:284:1: ( '{' )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:285:1: '{'
            {
             before(grammarAccess.getResourceGroupAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__ResourceGroup__Group__2__Impl524); 
             after(grammarAccess.getResourceGroupAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceGroup__Group__2__Impl"


    // $ANTLR start "rule__ResourceGroup__Group__3"
    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:298:1: rule__ResourceGroup__Group__3 : rule__ResourceGroup__Group__3__Impl rule__ResourceGroup__Group__4 ;
    public final void rule__ResourceGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:302:1: ( rule__ResourceGroup__Group__3__Impl rule__ResourceGroup__Group__4 )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:303:2: rule__ResourceGroup__Group__3__Impl rule__ResourceGroup__Group__4
            {
            pushFollow(FOLLOW_rule__ResourceGroup__Group__3__Impl_in_rule__ResourceGroup__Group__3555);
            rule__ResourceGroup__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceGroup__Group__4_in_rule__ResourceGroup__Group__3558);
            rule__ResourceGroup__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceGroup__Group__3"


    // $ANTLR start "rule__ResourceGroup__Group__3__Impl"
    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:310:1: rule__ResourceGroup__Group__3__Impl : ( 'id' ) ;
    public final void rule__ResourceGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:314:1: ( ( 'id' ) )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:315:1: ( 'id' )
            {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:315:1: ( 'id' )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:316:1: 'id'
            {
             before(grammarAccess.getResourceGroupAccess().getIdKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__ResourceGroup__Group__3__Impl586); 
             after(grammarAccess.getResourceGroupAccess().getIdKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceGroup__Group__3__Impl"


    // $ANTLR start "rule__ResourceGroup__Group__4"
    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:329:1: rule__ResourceGroup__Group__4 : rule__ResourceGroup__Group__4__Impl rule__ResourceGroup__Group__5 ;
    public final void rule__ResourceGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:333:1: ( rule__ResourceGroup__Group__4__Impl rule__ResourceGroup__Group__5 )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:334:2: rule__ResourceGroup__Group__4__Impl rule__ResourceGroup__Group__5
            {
            pushFollow(FOLLOW_rule__ResourceGroup__Group__4__Impl_in_rule__ResourceGroup__Group__4617);
            rule__ResourceGroup__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceGroup__Group__5_in_rule__ResourceGroup__Group__4620);
            rule__ResourceGroup__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceGroup__Group__4"


    // $ANTLR start "rule__ResourceGroup__Group__4__Impl"
    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:341:1: rule__ResourceGroup__Group__4__Impl : ( ( rule__ResourceGroup__IdAssignment_4 ) ) ;
    public final void rule__ResourceGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:345:1: ( ( ( rule__ResourceGroup__IdAssignment_4 ) ) )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:346:1: ( ( rule__ResourceGroup__IdAssignment_4 ) )
            {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:346:1: ( ( rule__ResourceGroup__IdAssignment_4 ) )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:347:1: ( rule__ResourceGroup__IdAssignment_4 )
            {
             before(grammarAccess.getResourceGroupAccess().getIdAssignment_4()); 
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:348:1: ( rule__ResourceGroup__IdAssignment_4 )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:348:2: rule__ResourceGroup__IdAssignment_4
            {
            pushFollow(FOLLOW_rule__ResourceGroup__IdAssignment_4_in_rule__ResourceGroup__Group__4__Impl647);
            rule__ResourceGroup__IdAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getResourceGroupAccess().getIdAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceGroup__Group__4__Impl"


    // $ANTLR start "rule__ResourceGroup__Group__5"
    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:358:1: rule__ResourceGroup__Group__5 : rule__ResourceGroup__Group__5__Impl rule__ResourceGroup__Group__6 ;
    public final void rule__ResourceGroup__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:362:1: ( rule__ResourceGroup__Group__5__Impl rule__ResourceGroup__Group__6 )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:363:2: rule__ResourceGroup__Group__5__Impl rule__ResourceGroup__Group__6
            {
            pushFollow(FOLLOW_rule__ResourceGroup__Group__5__Impl_in_rule__ResourceGroup__Group__5677);
            rule__ResourceGroup__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceGroup__Group__6_in_rule__ResourceGroup__Group__5680);
            rule__ResourceGroup__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceGroup__Group__5"


    // $ANTLR start "rule__ResourceGroup__Group__5__Impl"
    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:370:1: rule__ResourceGroup__Group__5__Impl : ( ';' ) ;
    public final void rule__ResourceGroup__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:374:1: ( ( ';' ) )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:375:1: ( ';' )
            {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:375:1: ( ';' )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:376:1: ';'
            {
             before(grammarAccess.getResourceGroupAccess().getSemicolonKeyword_5()); 
            match(input,14,FOLLOW_14_in_rule__ResourceGroup__Group__5__Impl708); 
             after(grammarAccess.getResourceGroupAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceGroup__Group__5__Impl"


    // $ANTLR start "rule__ResourceGroup__Group__6"
    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:389:1: rule__ResourceGroup__Group__6 : rule__ResourceGroup__Group__6__Impl rule__ResourceGroup__Group__7 ;
    public final void rule__ResourceGroup__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:393:1: ( rule__ResourceGroup__Group__6__Impl rule__ResourceGroup__Group__7 )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:394:2: rule__ResourceGroup__Group__6__Impl rule__ResourceGroup__Group__7
            {
            pushFollow(FOLLOW_rule__ResourceGroup__Group__6__Impl_in_rule__ResourceGroup__Group__6739);
            rule__ResourceGroup__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceGroup__Group__7_in_rule__ResourceGroup__Group__6742);
            rule__ResourceGroup__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceGroup__Group__6"


    // $ANTLR start "rule__ResourceGroup__Group__6__Impl"
    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:401:1: rule__ResourceGroup__Group__6__Impl : ( 'cost' ) ;
    public final void rule__ResourceGroup__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:405:1: ( ( 'cost' ) )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:406:1: ( 'cost' )
            {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:406:1: ( 'cost' )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:407:1: 'cost'
            {
             before(grammarAccess.getResourceGroupAccess().getCostKeyword_6()); 
            match(input,15,FOLLOW_15_in_rule__ResourceGroup__Group__6__Impl770); 
             after(grammarAccess.getResourceGroupAccess().getCostKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceGroup__Group__6__Impl"


    // $ANTLR start "rule__ResourceGroup__Group__7"
    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:420:1: rule__ResourceGroup__Group__7 : rule__ResourceGroup__Group__7__Impl rule__ResourceGroup__Group__8 ;
    public final void rule__ResourceGroup__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:424:1: ( rule__ResourceGroup__Group__7__Impl rule__ResourceGroup__Group__8 )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:425:2: rule__ResourceGroup__Group__7__Impl rule__ResourceGroup__Group__8
            {
            pushFollow(FOLLOW_rule__ResourceGroup__Group__7__Impl_in_rule__ResourceGroup__Group__7801);
            rule__ResourceGroup__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceGroup__Group__8_in_rule__ResourceGroup__Group__7804);
            rule__ResourceGroup__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceGroup__Group__7"


    // $ANTLR start "rule__ResourceGroup__Group__7__Impl"
    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:432:1: rule__ResourceGroup__Group__7__Impl : ( ( rule__ResourceGroup__CostAssignment_7 ) ) ;
    public final void rule__ResourceGroup__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:436:1: ( ( ( rule__ResourceGroup__CostAssignment_7 ) ) )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:437:1: ( ( rule__ResourceGroup__CostAssignment_7 ) )
            {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:437:1: ( ( rule__ResourceGroup__CostAssignment_7 ) )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:438:1: ( rule__ResourceGroup__CostAssignment_7 )
            {
             before(grammarAccess.getResourceGroupAccess().getCostAssignment_7()); 
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:439:1: ( rule__ResourceGroup__CostAssignment_7 )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:439:2: rule__ResourceGroup__CostAssignment_7
            {
            pushFollow(FOLLOW_rule__ResourceGroup__CostAssignment_7_in_rule__ResourceGroup__Group__7__Impl831);
            rule__ResourceGroup__CostAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getResourceGroupAccess().getCostAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceGroup__Group__7__Impl"


    // $ANTLR start "rule__ResourceGroup__Group__8"
    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:449:1: rule__ResourceGroup__Group__8 : rule__ResourceGroup__Group__8__Impl rule__ResourceGroup__Group__9 ;
    public final void rule__ResourceGroup__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:453:1: ( rule__ResourceGroup__Group__8__Impl rule__ResourceGroup__Group__9 )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:454:2: rule__ResourceGroup__Group__8__Impl rule__ResourceGroup__Group__9
            {
            pushFollow(FOLLOW_rule__ResourceGroup__Group__8__Impl_in_rule__ResourceGroup__Group__8861);
            rule__ResourceGroup__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceGroup__Group__9_in_rule__ResourceGroup__Group__8864);
            rule__ResourceGroup__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceGroup__Group__8"


    // $ANTLR start "rule__ResourceGroup__Group__8__Impl"
    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:461:1: rule__ResourceGroup__Group__8__Impl : ( ( rule__ResourceGroup__CostLabelAssignment_8 )? ) ;
    public final void rule__ResourceGroup__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:465:1: ( ( ( rule__ResourceGroup__CostLabelAssignment_8 )? ) )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:466:1: ( ( rule__ResourceGroup__CostLabelAssignment_8 )? )
            {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:466:1: ( ( rule__ResourceGroup__CostLabelAssignment_8 )? )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:467:1: ( rule__ResourceGroup__CostLabelAssignment_8 )?
            {
             before(grammarAccess.getResourceGroupAccess().getCostLabelAssignment_8()); 
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:468:1: ( rule__ResourceGroup__CostLabelAssignment_8 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:468:2: rule__ResourceGroup__CostLabelAssignment_8
                    {
                    pushFollow(FOLLOW_rule__ResourceGroup__CostLabelAssignment_8_in_rule__ResourceGroup__Group__8__Impl891);
                    rule__ResourceGroup__CostLabelAssignment_8();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getResourceGroupAccess().getCostLabelAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceGroup__Group__8__Impl"


    // $ANTLR start "rule__ResourceGroup__Group__9"
    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:478:1: rule__ResourceGroup__Group__9 : rule__ResourceGroup__Group__9__Impl rule__ResourceGroup__Group__10 ;
    public final void rule__ResourceGroup__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:482:1: ( rule__ResourceGroup__Group__9__Impl rule__ResourceGroup__Group__10 )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:483:2: rule__ResourceGroup__Group__9__Impl rule__ResourceGroup__Group__10
            {
            pushFollow(FOLLOW_rule__ResourceGroup__Group__9__Impl_in_rule__ResourceGroup__Group__9922);
            rule__ResourceGroup__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceGroup__Group__10_in_rule__ResourceGroup__Group__9925);
            rule__ResourceGroup__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceGroup__Group__9"


    // $ANTLR start "rule__ResourceGroup__Group__9__Impl"
    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:490:1: rule__ResourceGroup__Group__9__Impl : ( ';' ) ;
    public final void rule__ResourceGroup__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:494:1: ( ( ';' ) )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:495:1: ( ';' )
            {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:495:1: ( ';' )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:496:1: ';'
            {
             before(grammarAccess.getResourceGroupAccess().getSemicolonKeyword_9()); 
            match(input,14,FOLLOW_14_in_rule__ResourceGroup__Group__9__Impl953); 
             after(grammarAccess.getResourceGroupAccess().getSemicolonKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceGroup__Group__9__Impl"


    // $ANTLR start "rule__ResourceGroup__Group__10"
    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:509:1: rule__ResourceGroup__Group__10 : rule__ResourceGroup__Group__10__Impl rule__ResourceGroup__Group__11 ;
    public final void rule__ResourceGroup__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:513:1: ( rule__ResourceGroup__Group__10__Impl rule__ResourceGroup__Group__11 )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:514:2: rule__ResourceGroup__Group__10__Impl rule__ResourceGroup__Group__11
            {
            pushFollow(FOLLOW_rule__ResourceGroup__Group__10__Impl_in_rule__ResourceGroup__Group__10984);
            rule__ResourceGroup__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceGroup__Group__11_in_rule__ResourceGroup__Group__10987);
            rule__ResourceGroup__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceGroup__Group__10"


    // $ANTLR start "rule__ResourceGroup__Group__10__Impl"
    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:521:1: rule__ResourceGroup__Group__10__Impl : ( 'type' ) ;
    public final void rule__ResourceGroup__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:525:1: ( ( 'type' ) )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:526:1: ( 'type' )
            {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:526:1: ( 'type' )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:527:1: 'type'
            {
             before(grammarAccess.getResourceGroupAccess().getTypeKeyword_10()); 
            match(input,16,FOLLOW_16_in_rule__ResourceGroup__Group__10__Impl1015); 
             after(grammarAccess.getResourceGroupAccess().getTypeKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceGroup__Group__10__Impl"


    // $ANTLR start "rule__ResourceGroup__Group__11"
    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:540:1: rule__ResourceGroup__Group__11 : rule__ResourceGroup__Group__11__Impl rule__ResourceGroup__Group__12 ;
    public final void rule__ResourceGroup__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:544:1: ( rule__ResourceGroup__Group__11__Impl rule__ResourceGroup__Group__12 )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:545:2: rule__ResourceGroup__Group__11__Impl rule__ResourceGroup__Group__12
            {
            pushFollow(FOLLOW_rule__ResourceGroup__Group__11__Impl_in_rule__ResourceGroup__Group__111046);
            rule__ResourceGroup__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceGroup__Group__12_in_rule__ResourceGroup__Group__111049);
            rule__ResourceGroup__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceGroup__Group__11"


    // $ANTLR start "rule__ResourceGroup__Group__11__Impl"
    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:552:1: rule__ResourceGroup__Group__11__Impl : ( ( rule__ResourceGroup__TypeAssignment_11 ) ) ;
    public final void rule__ResourceGroup__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:556:1: ( ( ( rule__ResourceGroup__TypeAssignment_11 ) ) )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:557:1: ( ( rule__ResourceGroup__TypeAssignment_11 ) )
            {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:557:1: ( ( rule__ResourceGroup__TypeAssignment_11 ) )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:558:1: ( rule__ResourceGroup__TypeAssignment_11 )
            {
             before(grammarAccess.getResourceGroupAccess().getTypeAssignment_11()); 
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:559:1: ( rule__ResourceGroup__TypeAssignment_11 )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:559:2: rule__ResourceGroup__TypeAssignment_11
            {
            pushFollow(FOLLOW_rule__ResourceGroup__TypeAssignment_11_in_rule__ResourceGroup__Group__11__Impl1076);
            rule__ResourceGroup__TypeAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getResourceGroupAccess().getTypeAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceGroup__Group__11__Impl"


    // $ANTLR start "rule__ResourceGroup__Group__12"
    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:569:1: rule__ResourceGroup__Group__12 : rule__ResourceGroup__Group__12__Impl rule__ResourceGroup__Group__13 ;
    public final void rule__ResourceGroup__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:573:1: ( rule__ResourceGroup__Group__12__Impl rule__ResourceGroup__Group__13 )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:574:2: rule__ResourceGroup__Group__12__Impl rule__ResourceGroup__Group__13
            {
            pushFollow(FOLLOW_rule__ResourceGroup__Group__12__Impl_in_rule__ResourceGroup__Group__121106);
            rule__ResourceGroup__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceGroup__Group__13_in_rule__ResourceGroup__Group__121109);
            rule__ResourceGroup__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceGroup__Group__12"


    // $ANTLR start "rule__ResourceGroup__Group__12__Impl"
    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:581:1: rule__ResourceGroup__Group__12__Impl : ( ';' ) ;
    public final void rule__ResourceGroup__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:585:1: ( ( ';' ) )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:586:1: ( ';' )
            {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:586:1: ( ';' )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:587:1: ';'
            {
             before(grammarAccess.getResourceGroupAccess().getSemicolonKeyword_12()); 
            match(input,14,FOLLOW_14_in_rule__ResourceGroup__Group__12__Impl1137); 
             after(grammarAccess.getResourceGroupAccess().getSemicolonKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceGroup__Group__12__Impl"


    // $ANTLR start "rule__ResourceGroup__Group__13"
    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:600:1: rule__ResourceGroup__Group__13 : rule__ResourceGroup__Group__13__Impl ;
    public final void rule__ResourceGroup__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:604:1: ( rule__ResourceGroup__Group__13__Impl )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:605:2: rule__ResourceGroup__Group__13__Impl
            {
            pushFollow(FOLLOW_rule__ResourceGroup__Group__13__Impl_in_rule__ResourceGroup__Group__131168);
            rule__ResourceGroup__Group__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceGroup__Group__13"


    // $ANTLR start "rule__ResourceGroup__Group__13__Impl"
    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:611:1: rule__ResourceGroup__Group__13__Impl : ( '}' ) ;
    public final void rule__ResourceGroup__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:615:1: ( ( '}' ) )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:616:1: ( '}' )
            {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:616:1: ( '}' )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:617:1: '}'
            {
             before(grammarAccess.getResourceGroupAccess().getRightCurlyBracketKeyword_13()); 
            match(input,17,FOLLOW_17_in_rule__ResourceGroup__Group__13__Impl1196); 
             after(grammarAccess.getResourceGroupAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceGroup__Group__13__Impl"


    // $ANTLR start "rule__Resource__Group__0"
    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:658:1: rule__Resource__Group__0 : rule__Resource__Group__0__Impl rule__Resource__Group__1 ;
    public final void rule__Resource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:662:1: ( rule__Resource__Group__0__Impl rule__Resource__Group__1 )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:663:2: rule__Resource__Group__0__Impl rule__Resource__Group__1
            {
            pushFollow(FOLLOW_rule__Resource__Group__0__Impl_in_rule__Resource__Group__01255);
            rule__Resource__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__1_in_rule__Resource__Group__01258);
            rule__Resource__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__0"


    // $ANTLR start "rule__Resource__Group__0__Impl"
    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:670:1: rule__Resource__Group__0__Impl : ( 'Resource' ) ;
    public final void rule__Resource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:674:1: ( ( 'Resource' ) )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:675:1: ( 'Resource' )
            {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:675:1: ( 'Resource' )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:676:1: 'Resource'
            {
             before(grammarAccess.getResourceAccess().getResourceKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Resource__Group__0__Impl1286); 
             after(grammarAccess.getResourceAccess().getResourceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__0__Impl"


    // $ANTLR start "rule__Resource__Group__1"
    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:689:1: rule__Resource__Group__1 : rule__Resource__Group__1__Impl rule__Resource__Group__2 ;
    public final void rule__Resource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:693:1: ( rule__Resource__Group__1__Impl rule__Resource__Group__2 )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:694:2: rule__Resource__Group__1__Impl rule__Resource__Group__2
            {
            pushFollow(FOLLOW_rule__Resource__Group__1__Impl_in_rule__Resource__Group__11317);
            rule__Resource__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__2_in_rule__Resource__Group__11320);
            rule__Resource__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__1"


    // $ANTLR start "rule__Resource__Group__1__Impl"
    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:701:1: rule__Resource__Group__1__Impl : ( ( rule__Resource__NameAssignment_1 ) ) ;
    public final void rule__Resource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:705:1: ( ( ( rule__Resource__NameAssignment_1 ) ) )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:706:1: ( ( rule__Resource__NameAssignment_1 ) )
            {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:706:1: ( ( rule__Resource__NameAssignment_1 ) )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:707:1: ( rule__Resource__NameAssignment_1 )
            {
             before(grammarAccess.getResourceAccess().getNameAssignment_1()); 
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:708:1: ( rule__Resource__NameAssignment_1 )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:708:2: rule__Resource__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Resource__NameAssignment_1_in_rule__Resource__Group__1__Impl1347);
            rule__Resource__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__1__Impl"


    // $ANTLR start "rule__Resource__Group__2"
    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:718:1: rule__Resource__Group__2 : rule__Resource__Group__2__Impl rule__Resource__Group__3 ;
    public final void rule__Resource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:722:1: ( rule__Resource__Group__2__Impl rule__Resource__Group__3 )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:723:2: rule__Resource__Group__2__Impl rule__Resource__Group__3
            {
            pushFollow(FOLLOW_rule__Resource__Group__2__Impl_in_rule__Resource__Group__21377);
            rule__Resource__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__3_in_rule__Resource__Group__21380);
            rule__Resource__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__2"


    // $ANTLR start "rule__Resource__Group__2__Impl"
    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:730:1: rule__Resource__Group__2__Impl : ( '{' ) ;
    public final void rule__Resource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:734:1: ( ( '{' ) )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:735:1: ( '{' )
            {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:735:1: ( '{' )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:736:1: '{'
            {
             before(grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Resource__Group__2__Impl1408); 
             after(grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__2__Impl"


    // $ANTLR start "rule__Resource__Group__3"
    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:749:1: rule__Resource__Group__3 : rule__Resource__Group__3__Impl rule__Resource__Group__4 ;
    public final void rule__Resource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:753:1: ( rule__Resource__Group__3__Impl rule__Resource__Group__4 )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:754:2: rule__Resource__Group__3__Impl rule__Resource__Group__4
            {
            pushFollow(FOLLOW_rule__Resource__Group__3__Impl_in_rule__Resource__Group__31439);
            rule__Resource__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__4_in_rule__Resource__Group__31442);
            rule__Resource__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__3"


    // $ANTLR start "rule__Resource__Group__3__Impl"
    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:761:1: rule__Resource__Group__3__Impl : ( 'type' ) ;
    public final void rule__Resource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:765:1: ( ( 'type' ) )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:766:1: ( 'type' )
            {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:766:1: ( 'type' )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:767:1: 'type'
            {
             before(grammarAccess.getResourceAccess().getTypeKeyword_3()); 
            match(input,16,FOLLOW_16_in_rule__Resource__Group__3__Impl1470); 
             after(grammarAccess.getResourceAccess().getTypeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__3__Impl"


    // $ANTLR start "rule__Resource__Group__4"
    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:780:1: rule__Resource__Group__4 : rule__Resource__Group__4__Impl rule__Resource__Group__5 ;
    public final void rule__Resource__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:784:1: ( rule__Resource__Group__4__Impl rule__Resource__Group__5 )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:785:2: rule__Resource__Group__4__Impl rule__Resource__Group__5
            {
            pushFollow(FOLLOW_rule__Resource__Group__4__Impl_in_rule__Resource__Group__41501);
            rule__Resource__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__5_in_rule__Resource__Group__41504);
            rule__Resource__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__4"


    // $ANTLR start "rule__Resource__Group__4__Impl"
    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:792:1: rule__Resource__Group__4__Impl : ( ( rule__Resource__TypeAssignment_4 ) ) ;
    public final void rule__Resource__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:796:1: ( ( ( rule__Resource__TypeAssignment_4 ) ) )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:797:1: ( ( rule__Resource__TypeAssignment_4 ) )
            {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:797:1: ( ( rule__Resource__TypeAssignment_4 ) )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:798:1: ( rule__Resource__TypeAssignment_4 )
            {
             before(grammarAccess.getResourceAccess().getTypeAssignment_4()); 
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:799:1: ( rule__Resource__TypeAssignment_4 )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:799:2: rule__Resource__TypeAssignment_4
            {
            pushFollow(FOLLOW_rule__Resource__TypeAssignment_4_in_rule__Resource__Group__4__Impl1531);
            rule__Resource__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__4__Impl"


    // $ANTLR start "rule__Resource__Group__5"
    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:809:1: rule__Resource__Group__5 : rule__Resource__Group__5__Impl rule__Resource__Group__6 ;
    public final void rule__Resource__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:813:1: ( rule__Resource__Group__5__Impl rule__Resource__Group__6 )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:814:2: rule__Resource__Group__5__Impl rule__Resource__Group__6
            {
            pushFollow(FOLLOW_rule__Resource__Group__5__Impl_in_rule__Resource__Group__51561);
            rule__Resource__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__6_in_rule__Resource__Group__51564);
            rule__Resource__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__5"


    // $ANTLR start "rule__Resource__Group__5__Impl"
    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:821:1: rule__Resource__Group__5__Impl : ( ';' ) ;
    public final void rule__Resource__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:825:1: ( ( ';' ) )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:826:1: ( ';' )
            {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:826:1: ( ';' )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:827:1: ';'
            {
             before(grammarAccess.getResourceAccess().getSemicolonKeyword_5()); 
            match(input,14,FOLLOW_14_in_rule__Resource__Group__5__Impl1592); 
             after(grammarAccess.getResourceAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__5__Impl"


    // $ANTLR start "rule__Resource__Group__6"
    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:840:1: rule__Resource__Group__6 : rule__Resource__Group__6__Impl ;
    public final void rule__Resource__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:844:1: ( rule__Resource__Group__6__Impl )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:845:2: rule__Resource__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Resource__Group__6__Impl_in_rule__Resource__Group__61623);
            rule__Resource__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__6"


    // $ANTLR start "rule__Resource__Group__6__Impl"
    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:851:1: rule__Resource__Group__6__Impl : ( '}' ) ;
    public final void rule__Resource__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:855:1: ( ( '}' ) )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:856:1: ( '}' )
            {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:856:1: ( '}' )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:857:1: '}'
            {
             before(grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_17_in_rule__Resource__Group__6__Impl1651); 
             after(grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__6__Impl"


    // $ANTLR start "rule__Resources__ResourceGroupsAssignment_0"
    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:885:1: rule__Resources__ResourceGroupsAssignment_0 : ( ruleResourceGroup ) ;
    public final void rule__Resources__ResourceGroupsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:889:1: ( ( ruleResourceGroup ) )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:890:1: ( ruleResourceGroup )
            {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:890:1: ( ruleResourceGroup )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:891:1: ruleResourceGroup
            {
             before(grammarAccess.getResourcesAccess().getResourceGroupsResourceGroupParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleResourceGroup_in_rule__Resources__ResourceGroupsAssignment_01701);
            ruleResourceGroup();

            state._fsp--;

             after(grammarAccess.getResourcesAccess().getResourceGroupsResourceGroupParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__ResourceGroupsAssignment_0"


    // $ANTLR start "rule__Resources__ResourcesAssignment_1"
    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:900:1: rule__Resources__ResourcesAssignment_1 : ( ruleResource ) ;
    public final void rule__Resources__ResourcesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:904:1: ( ( ruleResource ) )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:905:1: ( ruleResource )
            {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:905:1: ( ruleResource )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:906:1: ruleResource
            {
             before(grammarAccess.getResourcesAccess().getResourcesResourceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleResource_in_rule__Resources__ResourcesAssignment_11732);
            ruleResource();

            state._fsp--;

             after(grammarAccess.getResourcesAccess().getResourcesResourceParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__ResourcesAssignment_1"


    // $ANTLR start "rule__ResourceGroup__NameAssignment_1"
    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:915:1: rule__ResourceGroup__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ResourceGroup__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:919:1: ( ( RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:920:1: ( RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:920:1: ( RULE_ID )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:921:1: RULE_ID
            {
             before(grammarAccess.getResourceGroupAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ResourceGroup__NameAssignment_11763); 
             after(grammarAccess.getResourceGroupAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceGroup__NameAssignment_1"


    // $ANTLR start "rule__ResourceGroup__IdAssignment_4"
    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:930:1: rule__ResourceGroup__IdAssignment_4 : ( RULE_ID ) ;
    public final void rule__ResourceGroup__IdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:934:1: ( ( RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:935:1: ( RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:935:1: ( RULE_ID )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:936:1: RULE_ID
            {
             before(grammarAccess.getResourceGroupAccess().getIdIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ResourceGroup__IdAssignment_41794); 
             after(grammarAccess.getResourceGroupAccess().getIdIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceGroup__IdAssignment_4"


    // $ANTLR start "rule__ResourceGroup__CostAssignment_7"
    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:945:1: rule__ResourceGroup__CostAssignment_7 : ( RULE_INT ) ;
    public final void rule__ResourceGroup__CostAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:949:1: ( ( RULE_INT ) )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:950:1: ( RULE_INT )
            {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:950:1: ( RULE_INT )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:951:1: RULE_INT
            {
             before(grammarAccess.getResourceGroupAccess().getCostINTTerminalRuleCall_7_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ResourceGroup__CostAssignment_71825); 
             after(grammarAccess.getResourceGroupAccess().getCostINTTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceGroup__CostAssignment_7"


    // $ANTLR start "rule__ResourceGroup__CostLabelAssignment_8"
    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:960:1: rule__ResourceGroup__CostLabelAssignment_8 : ( RULE_STRING ) ;
    public final void rule__ResourceGroup__CostLabelAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:964:1: ( ( RULE_STRING ) )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:965:1: ( RULE_STRING )
            {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:965:1: ( RULE_STRING )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:966:1: RULE_STRING
            {
             before(grammarAccess.getResourceGroupAccess().getCostLabelSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ResourceGroup__CostLabelAssignment_81856); 
             after(grammarAccess.getResourceGroupAccess().getCostLabelSTRINGTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceGroup__CostLabelAssignment_8"


    // $ANTLR start "rule__ResourceGroup__TypeAssignment_11"
    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:975:1: rule__ResourceGroup__TypeAssignment_11 : ( RULE_STRING ) ;
    public final void rule__ResourceGroup__TypeAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:979:1: ( ( RULE_STRING ) )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:980:1: ( RULE_STRING )
            {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:980:1: ( RULE_STRING )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:981:1: RULE_STRING
            {
             before(grammarAccess.getResourceGroupAccess().getTypeSTRINGTerminalRuleCall_11_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ResourceGroup__TypeAssignment_111887); 
             after(grammarAccess.getResourceGroupAccess().getTypeSTRINGTerminalRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceGroup__TypeAssignment_11"


    // $ANTLR start "rule__Resource__NameAssignment_1"
    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:990:1: rule__Resource__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Resource__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:994:1: ( ( RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:995:1: ( RULE_ID )
            {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:995:1: ( RULE_ID )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:996:1: RULE_ID
            {
             before(grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Resource__NameAssignment_11918); 
             after(grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__NameAssignment_1"


    // $ANTLR start "rule__Resource__TypeAssignment_4"
    // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:1005:1: rule__Resource__TypeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Resource__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:1009:1: ( ( ( RULE_ID ) ) )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:1010:1: ( ( RULE_ID ) )
            {
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:1010:1: ( ( RULE_ID ) )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:1011:1: ( RULE_ID )
            {
             before(grammarAccess.getResourceAccess().getTypeResourceGroupCrossReference_4_0()); 
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:1012:1: ( RULE_ID )
            // ../com.lowcoupling.mdpm.lng.resources.ui/src-gen/com/lowcoupling/mdpm/lng/resources/ui/contentassist/antlr/internal/InternalResources.g:1013:1: RULE_ID
            {
             before(grammarAccess.getResourceAccess().getTypeResourceGroupIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Resource__TypeAssignment_41953); 
             after(grammarAccess.getResourceAccess().getTypeResourceGroupIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getResourceAccess().getTypeResourceGroupCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__TypeAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleResources_in_entryRuleResources61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResources68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resources__Group__0_in_ruleResources94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceGroup_in_entryRuleResourceGroup121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceGroup128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceGroup__Group__0_in_ruleResourceGroup154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_entryRuleResource181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResource188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__0_in_ruleResource214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resources__Group__0__Impl_in_rule__Resources__Group__0248 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Resources__Group__1_in_rule__Resources__Group__0251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resources__ResourceGroupsAssignment_0_in_rule__Resources__Group__0__Impl278 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__Resources__Group__1__Impl_in_rule__Resources__Group__1309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resources__ResourcesAssignment_1_in_rule__Resources__Group__1__Impl336 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__ResourceGroup__Group__0__Impl_in_rule__ResourceGroup__Group__0371 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ResourceGroup__Group__1_in_rule__ResourceGroup__Group__0374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__ResourceGroup__Group__0__Impl402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceGroup__Group__1__Impl_in_rule__ResourceGroup__Group__1433 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__ResourceGroup__Group__2_in_rule__ResourceGroup__Group__1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceGroup__NameAssignment_1_in_rule__ResourceGroup__Group__1__Impl463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceGroup__Group__2__Impl_in_rule__ResourceGroup__Group__2493 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ResourceGroup__Group__3_in_rule__ResourceGroup__Group__2496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ResourceGroup__Group__2__Impl524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceGroup__Group__3__Impl_in_rule__ResourceGroup__Group__3555 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ResourceGroup__Group__4_in_rule__ResourceGroup__Group__3558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ResourceGroup__Group__3__Impl586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceGroup__Group__4__Impl_in_rule__ResourceGroup__Group__4617 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ResourceGroup__Group__5_in_rule__ResourceGroup__Group__4620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceGroup__IdAssignment_4_in_rule__ResourceGroup__Group__4__Impl647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceGroup__Group__5__Impl_in_rule__ResourceGroup__Group__5677 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ResourceGroup__Group__6_in_rule__ResourceGroup__Group__5680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ResourceGroup__Group__5__Impl708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceGroup__Group__6__Impl_in_rule__ResourceGroup__Group__6739 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ResourceGroup__Group__7_in_rule__ResourceGroup__Group__6742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ResourceGroup__Group__6__Impl770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceGroup__Group__7__Impl_in_rule__ResourceGroup__Group__7801 = new BitSet(new long[]{0x0000000000004040L});
    public static final BitSet FOLLOW_rule__ResourceGroup__Group__8_in_rule__ResourceGroup__Group__7804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceGroup__CostAssignment_7_in_rule__ResourceGroup__Group__7__Impl831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceGroup__Group__8__Impl_in_rule__ResourceGroup__Group__8861 = new BitSet(new long[]{0x0000000000004040L});
    public static final BitSet FOLLOW_rule__ResourceGroup__Group__9_in_rule__ResourceGroup__Group__8864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceGroup__CostLabelAssignment_8_in_rule__ResourceGroup__Group__8__Impl891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceGroup__Group__9__Impl_in_rule__ResourceGroup__Group__9922 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ResourceGroup__Group__10_in_rule__ResourceGroup__Group__9925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ResourceGroup__Group__9__Impl953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceGroup__Group__10__Impl_in_rule__ResourceGroup__Group__10984 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ResourceGroup__Group__11_in_rule__ResourceGroup__Group__10987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ResourceGroup__Group__10__Impl1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceGroup__Group__11__Impl_in_rule__ResourceGroup__Group__111046 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ResourceGroup__Group__12_in_rule__ResourceGroup__Group__111049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceGroup__TypeAssignment_11_in_rule__ResourceGroup__Group__11__Impl1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceGroup__Group__12__Impl_in_rule__ResourceGroup__Group__121106 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__ResourceGroup__Group__13_in_rule__ResourceGroup__Group__121109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ResourceGroup__Group__12__Impl1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceGroup__Group__13__Impl_in_rule__ResourceGroup__Group__131168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ResourceGroup__Group__13__Impl1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__0__Impl_in_rule__Resource__Group__01255 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Resource__Group__1_in_rule__Resource__Group__01258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Resource__Group__0__Impl1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__1__Impl_in_rule__Resource__Group__11317 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Resource__Group__2_in_rule__Resource__Group__11320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__NameAssignment_1_in_rule__Resource__Group__1__Impl1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__2__Impl_in_rule__Resource__Group__21377 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Resource__Group__3_in_rule__Resource__Group__21380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Resource__Group__2__Impl1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__3__Impl_in_rule__Resource__Group__31439 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Resource__Group__4_in_rule__Resource__Group__31442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Resource__Group__3__Impl1470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__4__Impl_in_rule__Resource__Group__41501 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Resource__Group__5_in_rule__Resource__Group__41504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__TypeAssignment_4_in_rule__Resource__Group__4__Impl1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__5__Impl_in_rule__Resource__Group__51561 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Resource__Group__6_in_rule__Resource__Group__51564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Resource__Group__5__Impl1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__6__Impl_in_rule__Resource__Group__61623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Resource__Group__6__Impl1651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceGroup_in_rule__Resources__ResourceGroupsAssignment_01701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_rule__Resources__ResourcesAssignment_11732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ResourceGroup__NameAssignment_11763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ResourceGroup__IdAssignment_41794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ResourceGroup__CostAssignment_71825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ResourceGroup__CostLabelAssignment_81856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ResourceGroup__TypeAssignment_111887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Resource__NameAssignment_11918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Resource__TypeAssignment_41953 = new BitSet(new long[]{0x0000000000000002L});

}