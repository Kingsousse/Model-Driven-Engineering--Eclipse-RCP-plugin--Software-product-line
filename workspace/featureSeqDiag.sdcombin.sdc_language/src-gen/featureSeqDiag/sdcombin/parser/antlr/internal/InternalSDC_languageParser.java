package featureSeqDiag.sdcombin.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import featureSeqDiag.sdcombin.services.SDC_languageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSDC_languageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Features {'", "'}'", "'Combination {'", "'loop ['", "'] {'", "'seq'", "'alt ['", "'else'", "'opt ['"
    };
    public static final int T__19=19;
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
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


        public InternalSDC_languageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSDC_languageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSDC_languageParser.tokenNames; }
    public String getGrammarFileName() { return "../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g"; }



     	private SDC_languageGrammarAccess grammarAccess;
     	
        public InternalSDC_languageParser(TokenStream input, SDC_languageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "SequenceProg";	
       	}
       	
       	@Override
       	protected SDC_languageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSequenceProg"
    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:67:1: entryRuleSequenceProg returns [EObject current=null] : iv_ruleSequenceProg= ruleSequenceProg EOF ;
    public final EObject entryRuleSequenceProg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceProg = null;


        try {
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:68:2: (iv_ruleSequenceProg= ruleSequenceProg EOF )
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:69:2: iv_ruleSequenceProg= ruleSequenceProg EOF
            {
             newCompositeNode(grammarAccess.getSequenceProgRule()); 
            pushFollow(FOLLOW_ruleSequenceProg_in_entryRuleSequenceProg75);
            iv_ruleSequenceProg=ruleSequenceProg();

            state._fsp--;

             current =iv_ruleSequenceProg; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequenceProg85); 

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
    // $ANTLR end "entryRuleSequenceProg"


    // $ANTLR start "ruleSequenceProg"
    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:76:1: ruleSequenceProg returns [EObject current=null] : ( (otherlv_0= 'Features {' ( (lv_features_1_0= ruleFeature ) )+ otherlv_2= '}' ) (otherlv_3= 'Combination {' ( (lv_contexte_4_0= ruleContexte ) )+ otherlv_5= '}' ) ) ;
    public final EObject ruleSequenceProg() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_features_1_0 = null;

        EObject lv_contexte_4_0 = null;


         enterRule(); 
            
        try {
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:79:28: ( ( (otherlv_0= 'Features {' ( (lv_features_1_0= ruleFeature ) )+ otherlv_2= '}' ) (otherlv_3= 'Combination {' ( (lv_contexte_4_0= ruleContexte ) )+ otherlv_5= '}' ) ) )
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:80:1: ( (otherlv_0= 'Features {' ( (lv_features_1_0= ruleFeature ) )+ otherlv_2= '}' ) (otherlv_3= 'Combination {' ( (lv_contexte_4_0= ruleContexte ) )+ otherlv_5= '}' ) )
            {
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:80:1: ( (otherlv_0= 'Features {' ( (lv_features_1_0= ruleFeature ) )+ otherlv_2= '}' ) (otherlv_3= 'Combination {' ( (lv_contexte_4_0= ruleContexte ) )+ otherlv_5= '}' ) )
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:80:2: (otherlv_0= 'Features {' ( (lv_features_1_0= ruleFeature ) )+ otherlv_2= '}' ) (otherlv_3= 'Combination {' ( (lv_contexte_4_0= ruleContexte ) )+ otherlv_5= '}' )
            {
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:80:2: (otherlv_0= 'Features {' ( (lv_features_1_0= ruleFeature ) )+ otherlv_2= '}' )
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:80:4: otherlv_0= 'Features {' ( (lv_features_1_0= ruleFeature ) )+ otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleSequenceProg123); 

                	newLeafNode(otherlv_0, grammarAccess.getSequenceProgAccess().getFeaturesKeyword_0_0());
                
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:84:1: ( (lv_features_1_0= ruleFeature ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:85:1: (lv_features_1_0= ruleFeature )
            	    {
            	    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:85:1: (lv_features_1_0= ruleFeature )
            	    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:86:3: lv_features_1_0= ruleFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSequenceProgAccess().getFeaturesFeatureParserRuleCall_0_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFeature_in_ruleSequenceProg144);
            	    lv_features_1_0=ruleFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSequenceProgRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_1_0, 
            	            		"Feature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleSequenceProg157); 

                	newLeafNode(otherlv_2, grammarAccess.getSequenceProgAccess().getRightCurlyBracketKeyword_0_2());
                

            }

            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:106:2: (otherlv_3= 'Combination {' ( (lv_contexte_4_0= ruleContexte ) )+ otherlv_5= '}' )
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:106:4: otherlv_3= 'Combination {' ( (lv_contexte_4_0= ruleContexte ) )+ otherlv_5= '}'
            {
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleSequenceProg171); 

                	newLeafNode(otherlv_3, grammarAccess.getSequenceProgAccess().getCombinationKeyword_1_0());
                
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:110:1: ( (lv_contexte_4_0= ruleContexte ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||LA2_0==14||LA2_0==17||LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:111:1: (lv_contexte_4_0= ruleContexte )
            	    {
            	    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:111:1: (lv_contexte_4_0= ruleContexte )
            	    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:112:3: lv_contexte_4_0= ruleContexte
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSequenceProgAccess().getContexteContexteParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleContexte_in_ruleSequenceProg192);
            	    lv_contexte_4_0=ruleContexte();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSequenceProgRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"contexte",
            	            		lv_contexte_4_0, 
            	            		"Contexte");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleSequenceProg205); 

                	newLeafNode(otherlv_5, grammarAccess.getSequenceProgAccess().getRightCurlyBracketKeyword_1_2());
                

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
    // $ANTLR end "ruleSequenceProg"


    // $ANTLR start "entryRuleFeature"
    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:140:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:141:2: (iv_ruleFeature= ruleFeature EOF )
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:142:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature242);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature252); 

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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:149:1: ruleFeature returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:152:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:153:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:153:1: ( (lv_name_0_0= RULE_ID ) )
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:154:1: (lv_name_0_0= RULE_ID )
            {
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:154:1: (lv_name_0_0= RULE_ID )
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:155:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeature293); 

            			newLeafNode(lv_name_0_0, grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFeatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleContexte"
    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:179:1: entryRuleContexte returns [EObject current=null] : iv_ruleContexte= ruleContexte EOF ;
    public final EObject entryRuleContexte() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContexte = null;


        try {
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:180:2: (iv_ruleContexte= ruleContexte EOF )
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:181:2: iv_ruleContexte= ruleContexte EOF
            {
             newCompositeNode(grammarAccess.getContexteRule()); 
            pushFollow(FOLLOW_ruleContexte_in_entryRuleContexte333);
            iv_ruleContexte=ruleContexte();

            state._fsp--;

             current =iv_ruleContexte; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContexte343); 

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
    // $ANTLR end "entryRuleContexte"


    // $ANTLR start "ruleContexte"
    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:188:1: ruleContexte returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_sequence_1_0= ruleSequence ) )? ) | ( (lv_alternative_2_0= ruleAlternative ) ) | ( (lv_loop_3_0= ruleLoop ) ) | ( (lv_option_4_0= ruleOption ) ) ) ;
    public final EObject ruleContexte() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_sequence_1_0 = null;

        EObject lv_alternative_2_0 = null;

        EObject lv_loop_3_0 = null;

        EObject lv_option_4_0 = null;


         enterRule(); 
            
        try {
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:191:28: ( ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_sequence_1_0= ruleSequence ) )? ) | ( (lv_alternative_2_0= ruleAlternative ) ) | ( (lv_loop_3_0= ruleLoop ) ) | ( (lv_option_4_0= ruleOption ) ) ) )
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:192:1: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_sequence_1_0= ruleSequence ) )? ) | ( (lv_alternative_2_0= ruleAlternative ) ) | ( (lv_loop_3_0= ruleLoop ) ) | ( (lv_option_4_0= ruleOption ) ) )
            {
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:192:1: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_sequence_1_0= ruleSequence ) )? ) | ( (lv_alternative_2_0= ruleAlternative ) ) | ( (lv_loop_3_0= ruleLoop ) ) | ( (lv_option_4_0= ruleOption ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt4=1;
                }
                break;
            case 17:
                {
                alt4=2;
                }
                break;
            case 14:
                {
                alt4=3;
                }
                break;
            case 19:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:192:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_sequence_1_0= ruleSequence ) )? )
                    {
                    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:192:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_sequence_1_0= ruleSequence ) )? )
                    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:192:3: ( (otherlv_0= RULE_ID ) ) ( (lv_sequence_1_0= ruleSequence ) )?
                    {
                    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:192:3: ( (otherlv_0= RULE_ID ) )
                    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:193:1: (otherlv_0= RULE_ID )
                    {
                    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:193:1: (otherlv_0= RULE_ID )
                    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:194:3: otherlv_0= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getContexteRule());
                    	        }
                            
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContexte389); 

                    		newLeafNode(otherlv_0, grammarAccess.getContexteAccess().getObjofFeatureCrossReference_0_0_0()); 
                    	

                    }


                    }

                    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:205:2: ( (lv_sequence_1_0= ruleSequence ) )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==16) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:206:1: (lv_sequence_1_0= ruleSequence )
                            {
                            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:206:1: (lv_sequence_1_0= ruleSequence )
                            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:207:3: lv_sequence_1_0= ruleSequence
                            {
                             
                            	        newCompositeNode(grammarAccess.getContexteAccess().getSequenceSequenceParserRuleCall_0_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleSequence_in_ruleContexte410);
                            lv_sequence_1_0=ruleSequence();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getContexteRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"sequence",
                                    		lv_sequence_1_0, 
                                    		"Sequence");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:224:6: ( (lv_alternative_2_0= ruleAlternative ) )
                    {
                    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:224:6: ( (lv_alternative_2_0= ruleAlternative ) )
                    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:225:1: (lv_alternative_2_0= ruleAlternative )
                    {
                    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:225:1: (lv_alternative_2_0= ruleAlternative )
                    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:226:3: lv_alternative_2_0= ruleAlternative
                    {
                     
                    	        newCompositeNode(grammarAccess.getContexteAccess().getAlternativeAlternativeParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAlternative_in_ruleContexte439);
                    lv_alternative_2_0=ruleAlternative();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContexteRule());
                    	        }
                           		set(
                           			current, 
                           			"alternative",
                            		lv_alternative_2_0, 
                            		"Alternative");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:243:6: ( (lv_loop_3_0= ruleLoop ) )
                    {
                    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:243:6: ( (lv_loop_3_0= ruleLoop ) )
                    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:244:1: (lv_loop_3_0= ruleLoop )
                    {
                    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:244:1: (lv_loop_3_0= ruleLoop )
                    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:245:3: lv_loop_3_0= ruleLoop
                    {
                     
                    	        newCompositeNode(grammarAccess.getContexteAccess().getLoopLoopParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLoop_in_ruleContexte466);
                    lv_loop_3_0=ruleLoop();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContexteRule());
                    	        }
                           		set(
                           			current, 
                           			"loop",
                            		lv_loop_3_0, 
                            		"Loop");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:262:6: ( (lv_option_4_0= ruleOption ) )
                    {
                    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:262:6: ( (lv_option_4_0= ruleOption ) )
                    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:263:1: (lv_option_4_0= ruleOption )
                    {
                    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:263:1: (lv_option_4_0= ruleOption )
                    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:264:3: lv_option_4_0= ruleOption
                    {
                     
                    	        newCompositeNode(grammarAccess.getContexteAccess().getOptionOptionParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOption_in_ruleContexte493);
                    lv_option_4_0=ruleOption();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContexteRule());
                    	        }
                           		set(
                           			current, 
                           			"option",
                            		lv_option_4_0, 
                            		"Option");
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
    // $ANTLR end "ruleContexte"


    // $ANTLR start "entryRuleCondition"
    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:288:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:289:2: (iv_ruleCondition= ruleCondition EOF )
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:290:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition529);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition539); 

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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:297:1: ruleCondition returns [EObject current=null] : ( (lv_condition_0_0= RULE_STRING ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token lv_condition_0_0=null;

         enterRule(); 
            
        try {
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:300:28: ( ( (lv_condition_0_0= RULE_STRING ) ) )
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:301:1: ( (lv_condition_0_0= RULE_STRING ) )
            {
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:301:1: ( (lv_condition_0_0= RULE_STRING ) )
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:302:1: (lv_condition_0_0= RULE_STRING )
            {
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:302:1: (lv_condition_0_0= RULE_STRING )
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:303:3: lv_condition_0_0= RULE_STRING
            {
            lv_condition_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCondition580); 

            			newLeafNode(lv_condition_0_0, grammarAccess.getConditionAccess().getConditionSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConditionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"condition",
                    		lv_condition_0_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleLoop"
    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:327:1: entryRuleLoop returns [EObject current=null] : iv_ruleLoop= ruleLoop EOF ;
    public final EObject entryRuleLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop = null;


        try {
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:328:2: (iv_ruleLoop= ruleLoop EOF )
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:329:2: iv_ruleLoop= ruleLoop EOF
            {
             newCompositeNode(grammarAccess.getLoopRule()); 
            pushFollow(FOLLOW_ruleLoop_in_entryRuleLoop620);
            iv_ruleLoop=ruleLoop();

            state._fsp--;

             current =iv_ruleLoop; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoop630); 

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
    // $ANTLR end "entryRuleLoop"


    // $ANTLR start "ruleLoop"
    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:336:1: ruleLoop returns [EObject current=null] : (otherlv_0= 'loop [' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= '] {' ( (lv_contexte_3_0= ruleContexte ) )+ otherlv_4= '}' ) ;
    public final EObject ruleLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_condition_1_0 = null;

        EObject lv_contexte_3_0 = null;


         enterRule(); 
            
        try {
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:339:28: ( (otherlv_0= 'loop [' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= '] {' ( (lv_contexte_3_0= ruleContexte ) )+ otherlv_4= '}' ) )
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:340:1: (otherlv_0= 'loop [' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= '] {' ( (lv_contexte_3_0= ruleContexte ) )+ otherlv_4= '}' )
            {
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:340:1: (otherlv_0= 'loop [' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= '] {' ( (lv_contexte_3_0= ruleContexte ) )+ otherlv_4= '}' )
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:340:3: otherlv_0= 'loop [' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= '] {' ( (lv_contexte_3_0= ruleContexte ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleLoop667); 

                	newLeafNode(otherlv_0, grammarAccess.getLoopAccess().getLoopKeyword_0());
                
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:344:1: ( (lv_condition_1_0= ruleCondition ) )
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:345:1: (lv_condition_1_0= ruleCondition )
            {
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:345:1: (lv_condition_1_0= ruleCondition )
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:346:3: lv_condition_1_0= ruleCondition
            {
             
            	        newCompositeNode(grammarAccess.getLoopAccess().getConditionConditionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleCondition_in_ruleLoop688);
            lv_condition_1_0=ruleCondition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLoopRule());
            	        }
                   		set(
                   			current, 
                   			"condition",
                    		lv_condition_1_0, 
                    		"Condition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleLoop700); 

                	newLeafNode(otherlv_2, grammarAccess.getLoopAccess().getRightSquareBracketSpaceLeftCurlyBracketKeyword_2());
                
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:366:1: ( (lv_contexte_3_0= ruleContexte ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||LA5_0==14||LA5_0==17||LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:367:1: (lv_contexte_3_0= ruleContexte )
            	    {
            	    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:367:1: (lv_contexte_3_0= ruleContexte )
            	    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:368:3: lv_contexte_3_0= ruleContexte
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLoopAccess().getContexteContexteParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleContexte_in_ruleLoop721);
            	    lv_contexte_3_0=ruleContexte();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLoopRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"contexte",
            	            		lv_contexte_3_0, 
            	            		"Contexte");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleLoop734); 

                	newLeafNode(otherlv_4, grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleLoop"


    // $ANTLR start "entryRuleSequence"
    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:396:1: entryRuleSequence returns [EObject current=null] : iv_ruleSequence= ruleSequence EOF ;
    public final EObject entryRuleSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequence = null;


        try {
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:397:2: (iv_ruleSequence= ruleSequence EOF )
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:398:2: iv_ruleSequence= ruleSequence EOF
            {
             newCompositeNode(grammarAccess.getSequenceRule()); 
            pushFollow(FOLLOW_ruleSequence_in_entryRuleSequence770);
            iv_ruleSequence=ruleSequence();

            state._fsp--;

             current =iv_ruleSequence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequence780); 

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
    // $ANTLR end "entryRuleSequence"


    // $ANTLR start "ruleSequence"
    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:405:1: ruleSequence returns [EObject current=null] : (otherlv_0= 'seq' ( (otherlv_1= RULE_ID ) ) )+ ;
    public final EObject ruleSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:408:28: ( (otherlv_0= 'seq' ( (otherlv_1= RULE_ID ) ) )+ )
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:409:1: (otherlv_0= 'seq' ( (otherlv_1= RULE_ID ) ) )+
            {
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:409:1: (otherlv_0= 'seq' ( (otherlv_1= RULE_ID ) ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:409:3: otherlv_0= 'seq' ( (otherlv_1= RULE_ID ) )
            	    {
            	    otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleSequence817); 

            	        	newLeafNode(otherlv_0, grammarAccess.getSequenceAccess().getSeqKeyword_0());
            	        
            	    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:413:1: ( (otherlv_1= RULE_ID ) )
            	    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:414:1: (otherlv_1= RULE_ID )
            	    {
            	    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:414:1: (otherlv_1= RULE_ID )
            	    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:415:3: otherlv_1= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSequenceRule());
            	    	        }
            	            
            	    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSequence837); 

            	    		newLeafNode(otherlv_1, grammarAccess.getSequenceAccess().getObjofRFeatureCrossReference_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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
    // $ANTLR end "ruleSequence"


    // $ANTLR start "entryRuleAlternative"
    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:434:1: entryRuleAlternative returns [EObject current=null] : iv_ruleAlternative= ruleAlternative EOF ;
    public final EObject entryRuleAlternative() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlternative = null;


        try {
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:435:2: (iv_ruleAlternative= ruleAlternative EOF )
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:436:2: iv_ruleAlternative= ruleAlternative EOF
            {
             newCompositeNode(grammarAccess.getAlternativeRule()); 
            pushFollow(FOLLOW_ruleAlternative_in_entryRuleAlternative874);
            iv_ruleAlternative=ruleAlternative();

            state._fsp--;

             current =iv_ruleAlternative; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlternative884); 

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
    // $ANTLR end "entryRuleAlternative"


    // $ANTLR start "ruleAlternative"
    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:443:1: ruleAlternative returns [EObject current=null] : (otherlv_0= 'alt [' ( (lv_conditionAlt_1_0= ruleCondition ) ) otherlv_2= '] {' ( (lv_contexteIF_3_0= ruleContexte ) )* otherlv_4= 'else' ( (lv_contexteELSE_5_0= ruleContexte ) )* otherlv_6= '}' ) ;
    public final EObject ruleAlternative() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_conditionAlt_1_0 = null;

        EObject lv_contexteIF_3_0 = null;

        EObject lv_contexteELSE_5_0 = null;


         enterRule(); 
            
        try {
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:446:28: ( (otherlv_0= 'alt [' ( (lv_conditionAlt_1_0= ruleCondition ) ) otherlv_2= '] {' ( (lv_contexteIF_3_0= ruleContexte ) )* otherlv_4= 'else' ( (lv_contexteELSE_5_0= ruleContexte ) )* otherlv_6= '}' ) )
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:447:1: (otherlv_0= 'alt [' ( (lv_conditionAlt_1_0= ruleCondition ) ) otherlv_2= '] {' ( (lv_contexteIF_3_0= ruleContexte ) )* otherlv_4= 'else' ( (lv_contexteELSE_5_0= ruleContexte ) )* otherlv_6= '}' )
            {
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:447:1: (otherlv_0= 'alt [' ( (lv_conditionAlt_1_0= ruleCondition ) ) otherlv_2= '] {' ( (lv_contexteIF_3_0= ruleContexte ) )* otherlv_4= 'else' ( (lv_contexteELSE_5_0= ruleContexte ) )* otherlv_6= '}' )
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:447:3: otherlv_0= 'alt [' ( (lv_conditionAlt_1_0= ruleCondition ) ) otherlv_2= '] {' ( (lv_contexteIF_3_0= ruleContexte ) )* otherlv_4= 'else' ( (lv_contexteELSE_5_0= ruleContexte ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleAlternative921); 

                	newLeafNode(otherlv_0, grammarAccess.getAlternativeAccess().getAltKeyword_0());
                
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:451:1: ( (lv_conditionAlt_1_0= ruleCondition ) )
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:452:1: (lv_conditionAlt_1_0= ruleCondition )
            {
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:452:1: (lv_conditionAlt_1_0= ruleCondition )
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:453:3: lv_conditionAlt_1_0= ruleCondition
            {
             
            	        newCompositeNode(grammarAccess.getAlternativeAccess().getConditionAltConditionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleCondition_in_ruleAlternative942);
            lv_conditionAlt_1_0=ruleCondition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAlternativeRule());
            	        }
                   		set(
                   			current, 
                   			"conditionAlt",
                    		lv_conditionAlt_1_0, 
                    		"Condition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleAlternative954); 

                	newLeafNode(otherlv_2, grammarAccess.getAlternativeAccess().getRightSquareBracketSpaceLeftCurlyBracketKeyword_2());
                
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:473:1: ( (lv_contexteIF_3_0= ruleContexte ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==14||LA7_0==17||LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:474:1: (lv_contexteIF_3_0= ruleContexte )
            	    {
            	    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:474:1: (lv_contexteIF_3_0= ruleContexte )
            	    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:475:3: lv_contexteIF_3_0= ruleContexte
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAlternativeAccess().getContexteIFContexteParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleContexte_in_ruleAlternative975);
            	    lv_contexteIF_3_0=ruleContexte();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAlternativeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"contexteIF",
            	            		lv_contexteIF_3_0, 
            	            		"Contexte");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleAlternative988); 

                	newLeafNode(otherlv_4, grammarAccess.getAlternativeAccess().getElseKeyword_4());
                
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:495:1: ( (lv_contexteELSE_5_0= ruleContexte ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==14||LA8_0==17||LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:496:1: (lv_contexteELSE_5_0= ruleContexte )
            	    {
            	    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:496:1: (lv_contexteELSE_5_0= ruleContexte )
            	    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:497:3: lv_contexteELSE_5_0= ruleContexte
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAlternativeAccess().getContexteELSEContexteParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleContexte_in_ruleAlternative1009);
            	    lv_contexteELSE_5_0=ruleContexte();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAlternativeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"contexteELSE",
            	            		lv_contexteELSE_5_0, 
            	            		"Contexte");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_6=(Token)match(input,12,FOLLOW_12_in_ruleAlternative1022); 

                	newLeafNode(otherlv_6, grammarAccess.getAlternativeAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleAlternative"


    // $ANTLR start "entryRuleOption"
    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:525:1: entryRuleOption returns [EObject current=null] : iv_ruleOption= ruleOption EOF ;
    public final EObject entryRuleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption = null;


        try {
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:526:2: (iv_ruleOption= ruleOption EOF )
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:527:2: iv_ruleOption= ruleOption EOF
            {
             newCompositeNode(grammarAccess.getOptionRule()); 
            pushFollow(FOLLOW_ruleOption_in_entryRuleOption1058);
            iv_ruleOption=ruleOption();

            state._fsp--;

             current =iv_ruleOption; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOption1068); 

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
    // $ANTLR end "entryRuleOption"


    // $ANTLR start "ruleOption"
    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:534:1: ruleOption returns [EObject current=null] : (otherlv_0= 'opt [' ( (lv_conditionOpt_1_0= ruleCondition ) ) otherlv_2= '] {' ( (lv_contexte_3_0= ruleContexte ) )+ otherlv_4= '}' ) ;
    public final EObject ruleOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_conditionOpt_1_0 = null;

        EObject lv_contexte_3_0 = null;


         enterRule(); 
            
        try {
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:537:28: ( (otherlv_0= 'opt [' ( (lv_conditionOpt_1_0= ruleCondition ) ) otherlv_2= '] {' ( (lv_contexte_3_0= ruleContexte ) )+ otherlv_4= '}' ) )
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:538:1: (otherlv_0= 'opt [' ( (lv_conditionOpt_1_0= ruleCondition ) ) otherlv_2= '] {' ( (lv_contexte_3_0= ruleContexte ) )+ otherlv_4= '}' )
            {
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:538:1: (otherlv_0= 'opt [' ( (lv_conditionOpt_1_0= ruleCondition ) ) otherlv_2= '] {' ( (lv_contexte_3_0= ruleContexte ) )+ otherlv_4= '}' )
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:538:3: otherlv_0= 'opt [' ( (lv_conditionOpt_1_0= ruleCondition ) ) otherlv_2= '] {' ( (lv_contexte_3_0= ruleContexte ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleOption1105); 

                	newLeafNode(otherlv_0, grammarAccess.getOptionAccess().getOptKeyword_0());
                
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:542:1: ( (lv_conditionOpt_1_0= ruleCondition ) )
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:543:1: (lv_conditionOpt_1_0= ruleCondition )
            {
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:543:1: (lv_conditionOpt_1_0= ruleCondition )
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:544:3: lv_conditionOpt_1_0= ruleCondition
            {
             
            	        newCompositeNode(grammarAccess.getOptionAccess().getConditionOptConditionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleCondition_in_ruleOption1126);
            lv_conditionOpt_1_0=ruleCondition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOptionRule());
            	        }
                   		set(
                   			current, 
                   			"conditionOpt",
                    		lv_conditionOpt_1_0, 
                    		"Condition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleOption1138); 

                	newLeafNode(otherlv_2, grammarAccess.getOptionAccess().getRightSquareBracketSpaceLeftCurlyBracketKeyword_2());
                
            // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:564:1: ( (lv_contexte_3_0= ruleContexte ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==14||LA9_0==17||LA9_0==19) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:565:1: (lv_contexte_3_0= ruleContexte )
            	    {
            	    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:565:1: (lv_contexte_3_0= ruleContexte )
            	    // ../featureSeqDiag.sdcombin.sdc_language/src-gen/featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.g:566:3: lv_contexte_3_0= ruleContexte
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOptionAccess().getContexteContexteParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleContexte_in_ruleOption1159);
            	    lv_contexte_3_0=ruleContexte();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOptionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"contexte",
            	            		lv_contexte_3_0, 
            	            		"Contexte");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleOption1172); 

                	newLeafNode(otherlv_4, grammarAccess.getOptionAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleOption"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSequenceProg_in_entryRuleSequenceProg75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequenceProg85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleSequenceProg123 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleSequenceProg144 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_12_in_ruleSequenceProg157 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSequenceProg171 = new BitSet(new long[]{0x00000000000A4010L});
    public static final BitSet FOLLOW_ruleContexte_in_ruleSequenceProg192 = new BitSet(new long[]{0x00000000000A5010L});
    public static final BitSet FOLLOW_12_in_ruleSequenceProg205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeature293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContexte_in_entryRuleContexte333 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContexte343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContexte389 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleSequence_in_ruleContexte410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternative_in_ruleContexte439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoop_in_ruleContexte466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_ruleContexte493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition529 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCondition580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoop_in_entryRuleLoop620 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoop630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleLoop667 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleLoop688 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleLoop700 = new BitSet(new long[]{0x00000000000A4010L});
    public static final BitSet FOLLOW_ruleContexte_in_ruleLoop721 = new BitSet(new long[]{0x00000000000A5010L});
    public static final BitSet FOLLOW_12_in_ruleLoop734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_entryRuleSequence770 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequence780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleSequence817 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSequence837 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleAlternative_in_entryRuleAlternative874 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlternative884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleAlternative921 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleAlternative942 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAlternative954 = new BitSet(new long[]{0x00000000000E4010L});
    public static final BitSet FOLLOW_ruleContexte_in_ruleAlternative975 = new BitSet(new long[]{0x00000000000E4010L});
    public static final BitSet FOLLOW_18_in_ruleAlternative988 = new BitSet(new long[]{0x00000000000A5010L});
    public static final BitSet FOLLOW_ruleContexte_in_ruleAlternative1009 = new BitSet(new long[]{0x00000000000A5010L});
    public static final BitSet FOLLOW_12_in_ruleAlternative1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_entryRuleOption1058 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOption1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleOption1105 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleOption1126 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleOption1138 = new BitSet(new long[]{0x00000000000A4010L});
    public static final BitSet FOLLOW_ruleContexte_in_ruleOption1159 = new BitSet(new long[]{0x00000000000A5010L});
    public static final BitSet FOLLOW_12_in_ruleOption1172 = new BitSet(new long[]{0x0000000000000002L});

}