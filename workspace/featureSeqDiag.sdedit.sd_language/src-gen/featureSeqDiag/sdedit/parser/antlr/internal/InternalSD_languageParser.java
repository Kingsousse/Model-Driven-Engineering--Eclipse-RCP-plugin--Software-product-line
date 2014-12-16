package featureSeqDiag.sdedit.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import featureSeqDiag.sdedit.services.SD_languageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSD_languageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_SL_COMMENT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':'", "'['", "'a'", "'p'", "'r'", "'x'", "']'", "'='", "'.'", "'('", "','", "')'", "'[c:alt'", "'--[else]'", "'[/c]'", "'[c:loop'", "'[c:opt'", "'IS NOT'", "'IS'", "'!='", "'=='", "'<'", "'>'", "'<='", "'>='", "'!'", "'||'", "'&&'", "'and'", "'^'", "'or'"
    };
    public static final int RULE_ID=4;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=6;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=7;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__11=11;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalSD_languageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSD_languageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSD_languageParser.tokenNames; }
    public String getGrammarFileName() { return "../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g"; }



     	private SD_languageGrammarAccess grammarAccess;
     	
        public InternalSD_languageParser(TokenStream input, SD_languageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "SDEditModel";	
       	}
       	
       	@Override
       	protected SD_languageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSDEditModel"
    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:67:1: entryRuleSDEditModel returns [EObject current=null] : iv_ruleSDEditModel= ruleSDEditModel EOF ;
    public final EObject entryRuleSDEditModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSDEditModel = null;


        try {
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:68:2: (iv_ruleSDEditModel= ruleSDEditModel EOF )
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:69:2: iv_ruleSDEditModel= ruleSDEditModel EOF
            {
             newCompositeNode(grammarAccess.getSDEditModelRule()); 
            pushFollow(FOLLOW_ruleSDEditModel_in_entryRuleSDEditModel75);
            iv_ruleSDEditModel=ruleSDEditModel();

            state._fsp--;

             current =iv_ruleSDEditModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSDEditModel85); 

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
    // $ANTLR end "entryRuleSDEditModel"


    // $ANTLR start "ruleSDEditModel"
    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:76:1: ruleSDEditModel returns [EObject current=null] : ( ( (lv_elements_0_0= ruleSDEditObj ) )* ( (lv_elements_1_0= ruleSDEditCombinableDiagElt ) )* ) ;
    public final EObject ruleSDEditModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;

        EObject lv_elements_1_0 = null;


         enterRule(); 
            
        try {
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:79:28: ( ( ( (lv_elements_0_0= ruleSDEditObj ) )* ( (lv_elements_1_0= ruleSDEditCombinableDiagElt ) )* ) )
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:80:1: ( ( (lv_elements_0_0= ruleSDEditObj ) )* ( (lv_elements_1_0= ruleSDEditCombinableDiagElt ) )* )
            {
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:80:1: ( ( (lv_elements_0_0= ruleSDEditObj ) )* ( (lv_elements_1_0= ruleSDEditCombinableDiagElt ) )* )
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:80:2: ( (lv_elements_0_0= ruleSDEditObj ) )* ( (lv_elements_1_0= ruleSDEditCombinableDiagElt ) )*
            {
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:80:2: ( (lv_elements_0_0= ruleSDEditObj ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1==11) ) {
                        int LA1_3 = input.LA(3);

                        if ( (LA1_3==RULE_ID) ) {
                            int LA1_4 = input.LA(4);

                            if ( (LA1_4==EOF||LA1_4==RULE_ID||LA1_4==12||LA1_4==23||(LA1_4>=26 && LA1_4<=27)) ) {
                                alt1=1;
                            }


                        }


                    }


                }


                switch (alt1) {
            	case 1 :
            	    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:81:1: (lv_elements_0_0= ruleSDEditObj )
            	    {
            	    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:81:1: (lv_elements_0_0= ruleSDEditObj )
            	    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:82:3: lv_elements_0_0= ruleSDEditObj
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSDEditModelAccess().getElementsSDEditObjParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSDEditObj_in_ruleSDEditModel131);
            	    lv_elements_0_0=ruleSDEditObj();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSDEditModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_0_0, 
            	            		"SDEditObj");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:98:3: ( (lv_elements_1_0= ruleSDEditCombinableDiagElt ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||LA2_0==23||(LA2_0>=26 && LA2_0<=27)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:99:1: (lv_elements_1_0= ruleSDEditCombinableDiagElt )
            	    {
            	    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:99:1: (lv_elements_1_0= ruleSDEditCombinableDiagElt )
            	    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:100:3: lv_elements_1_0= ruleSDEditCombinableDiagElt
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSDEditModelAccess().getElementsSDEditCombinableDiagEltParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSDEditCombinableDiagElt_in_ruleSDEditModel153);
            	    lv_elements_1_0=ruleSDEditCombinableDiagElt();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSDEditModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_1_0, 
            	            		"SDEditCombinableDiagElt");
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
    // $ANTLR end "ruleSDEditModel"


    // $ANTLR start "entryRuleSDEditObj"
    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:124:1: entryRuleSDEditObj returns [EObject current=null] : iv_ruleSDEditObj= ruleSDEditObj EOF ;
    public final EObject entryRuleSDEditObj() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSDEditObj = null;


        try {
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:125:2: (iv_ruleSDEditObj= ruleSDEditObj EOF )
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:126:2: iv_ruleSDEditObj= ruleSDEditObj EOF
            {
             newCompositeNode(grammarAccess.getSDEditObjRule()); 
            pushFollow(FOLLOW_ruleSDEditObj_in_entryRuleSDEditObj190);
            iv_ruleSDEditObj=ruleSDEditObj();

            state._fsp--;

             current =iv_ruleSDEditObj; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSDEditObj200); 

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
    // $ANTLR end "entryRuleSDEditObj"


    // $ANTLR start "ruleSDEditObj"
    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:133:1: ruleSDEditObj returns [EObject current=null] : ( ( (lv_objName_0_0= ruleSDEditObjname ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) (otherlv_3= '[' (otherlv_4= 'a' | otherlv_5= 'p' | otherlv_6= 'r' | otherlv_7= 'x' ) otherlv_8= ']' )? ) ;
    public final EObject ruleSDEditObj() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_type_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_objName_0_0 = null;


         enterRule(); 
            
        try {
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:136:28: ( ( ( (lv_objName_0_0= ruleSDEditObjname ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) (otherlv_3= '[' (otherlv_4= 'a' | otherlv_5= 'p' | otherlv_6= 'r' | otherlv_7= 'x' ) otherlv_8= ']' )? ) )
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:137:1: ( ( (lv_objName_0_0= ruleSDEditObjname ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) (otherlv_3= '[' (otherlv_4= 'a' | otherlv_5= 'p' | otherlv_6= 'r' | otherlv_7= 'x' ) otherlv_8= ']' )? )
            {
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:137:1: ( ( (lv_objName_0_0= ruleSDEditObjname ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) (otherlv_3= '[' (otherlv_4= 'a' | otherlv_5= 'p' | otherlv_6= 'r' | otherlv_7= 'x' ) otherlv_8= ']' )? )
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:137:2: ( (lv_objName_0_0= ruleSDEditObjname ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_ID ) ) (otherlv_3= '[' (otherlv_4= 'a' | otherlv_5= 'p' | otherlv_6= 'r' | otherlv_7= 'x' ) otherlv_8= ']' )?
            {
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:137:2: ( (lv_objName_0_0= ruleSDEditObjname ) )
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:138:1: (lv_objName_0_0= ruleSDEditObjname )
            {
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:138:1: (lv_objName_0_0= ruleSDEditObjname )
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:139:3: lv_objName_0_0= ruleSDEditObjname
            {
             
            	        newCompositeNode(grammarAccess.getSDEditObjAccess().getObjNameSDEditObjnameParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleSDEditObjname_in_ruleSDEditObj246);
            lv_objName_0_0=ruleSDEditObjname();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSDEditObjRule());
            	        }
                   		set(
                   			current, 
                   			"objName",
                    		lv_objName_0_0, 
                    		"SDEditObjname");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleSDEditObj258); 

                	newLeafNode(otherlv_1, grammarAccess.getSDEditObjAccess().getColonKeyword_1());
                
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:159:1: ( (lv_type_2_0= RULE_ID ) )
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:160:1: (lv_type_2_0= RULE_ID )
            {
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:160:1: (lv_type_2_0= RULE_ID )
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:161:3: lv_type_2_0= RULE_ID
            {
            lv_type_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSDEditObj275); 

            			newLeafNode(lv_type_2_0, grammarAccess.getSDEditObjAccess().getTypeIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSDEditObjRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"ID");
            	    

            }


            }

            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:177:2: (otherlv_3= '[' (otherlv_4= 'a' | otherlv_5= 'p' | otherlv_6= 'r' | otherlv_7= 'x' ) otherlv_8= ']' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:177:4: otherlv_3= '[' (otherlv_4= 'a' | otherlv_5= 'p' | otherlv_6= 'r' | otherlv_7= 'x' ) otherlv_8= ']'
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleSDEditObj293); 

                        	newLeafNode(otherlv_3, grammarAccess.getSDEditObjAccess().getLeftSquareBracketKeyword_3_0());
                        
                    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:181:1: (otherlv_4= 'a' | otherlv_5= 'p' | otherlv_6= 'r' | otherlv_7= 'x' )
                    int alt3=4;
                    switch ( input.LA(1) ) {
                    case 13:
                        {
                        alt3=1;
                        }
                        break;
                    case 14:
                        {
                        alt3=2;
                        }
                        break;
                    case 15:
                        {
                        alt3=3;
                        }
                        break;
                    case 16:
                        {
                        alt3=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;
                    }

                    switch (alt3) {
                        case 1 :
                            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:181:3: otherlv_4= 'a'
                            {
                            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleSDEditObj306); 

                                	newLeafNode(otherlv_4, grammarAccess.getSDEditObjAccess().getAKeyword_3_1_0());
                                

                            }
                            break;
                        case 2 :
                            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:186:7: otherlv_5= 'p'
                            {
                            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleSDEditObj324); 

                                	newLeafNode(otherlv_5, grammarAccess.getSDEditObjAccess().getPKeyword_3_1_1());
                                

                            }
                            break;
                        case 3 :
                            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:191:7: otherlv_6= 'r'
                            {
                            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleSDEditObj342); 

                                	newLeafNode(otherlv_6, grammarAccess.getSDEditObjAccess().getRKeyword_3_1_2());
                                

                            }
                            break;
                        case 4 :
                            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:196:7: otherlv_7= 'x'
                            {
                            otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleSDEditObj360); 

                                	newLeafNode(otherlv_7, grammarAccess.getSDEditObjAccess().getXKeyword_3_1_3());
                                

                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleSDEditObj373); 

                        	newLeafNode(otherlv_8, grammarAccess.getSDEditObjAccess().getRightSquareBracketKeyword_3_2());
                        

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
    // $ANTLR end "ruleSDEditObj"


    // $ANTLR start "entryRuleSDEditObjname"
    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:212:1: entryRuleSDEditObjname returns [EObject current=null] : iv_ruleSDEditObjname= ruleSDEditObjname EOF ;
    public final EObject entryRuleSDEditObjname() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSDEditObjname = null;


        try {
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:213:2: (iv_ruleSDEditObjname= ruleSDEditObjname EOF )
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:214:2: iv_ruleSDEditObjname= ruleSDEditObjname EOF
            {
             newCompositeNode(grammarAccess.getSDEditObjnameRule()); 
            pushFollow(FOLLOW_ruleSDEditObjname_in_entryRuleSDEditObjname411);
            iv_ruleSDEditObjname=ruleSDEditObjname();

            state._fsp--;

             current =iv_ruleSDEditObjname; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSDEditObjname421); 

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
    // $ANTLR end "entryRuleSDEditObjname"


    // $ANTLR start "ruleSDEditObjname"
    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:221:1: ruleSDEditObjname returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleSDEditObjname() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:224:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:225:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:225:1: ( (lv_name_0_0= RULE_ID ) )
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:226:1: (lv_name_0_0= RULE_ID )
            {
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:226:1: (lv_name_0_0= RULE_ID )
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:227:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSDEditObjname462); 

            			newLeafNode(lv_name_0_0, grammarAccess.getSDEditObjnameAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSDEditObjnameRule());
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
    // $ANTLR end "ruleSDEditObjname"


    // $ANTLR start "entryRuleSDEditCombinableDiagElt"
    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:251:1: entryRuleSDEditCombinableDiagElt returns [EObject current=null] : iv_ruleSDEditCombinableDiagElt= ruleSDEditCombinableDiagElt EOF ;
    public final EObject entryRuleSDEditCombinableDiagElt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSDEditCombinableDiagElt = null;


        try {
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:252:2: (iv_ruleSDEditCombinableDiagElt= ruleSDEditCombinableDiagElt EOF )
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:253:2: iv_ruleSDEditCombinableDiagElt= ruleSDEditCombinableDiagElt EOF
            {
             newCompositeNode(grammarAccess.getSDEditCombinableDiagEltRule()); 
            pushFollow(FOLLOW_ruleSDEditCombinableDiagElt_in_entryRuleSDEditCombinableDiagElt502);
            iv_ruleSDEditCombinableDiagElt=ruleSDEditCombinableDiagElt();

            state._fsp--;

             current =iv_ruleSDEditCombinableDiagElt; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSDEditCombinableDiagElt512); 

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
    // $ANTLR end "entryRuleSDEditCombinableDiagElt"


    // $ANTLR start "ruleSDEditCombinableDiagElt"
    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:260:1: ruleSDEditCombinableDiagElt returns [EObject current=null] : (this_SDEditCall_0= ruleSDEditCall | this_SDEditCombinedFragment_1= ruleSDEditCombinedFragment ) ;
    public final EObject ruleSDEditCombinableDiagElt() throws RecognitionException {
        EObject current = null;

        EObject this_SDEditCall_0 = null;

        EObject this_SDEditCombinedFragment_1 = null;


         enterRule(); 
            
        try {
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:263:28: ( (this_SDEditCall_0= ruleSDEditCall | this_SDEditCombinedFragment_1= ruleSDEditCombinedFragment ) )
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:264:1: (this_SDEditCall_0= ruleSDEditCall | this_SDEditCombinedFragment_1= ruleSDEditCombinedFragment )
            {
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:264:1: (this_SDEditCall_0= ruleSDEditCall | this_SDEditCombinedFragment_1= ruleSDEditCombinedFragment )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==23||(LA5_0>=26 && LA5_0<=27)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:265:5: this_SDEditCall_0= ruleSDEditCall
                    {
                     
                            newCompositeNode(grammarAccess.getSDEditCombinableDiagEltAccess().getSDEditCallParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSDEditCall_in_ruleSDEditCombinableDiagElt559);
                    this_SDEditCall_0=ruleSDEditCall();

                    state._fsp--;

                     
                            current = this_SDEditCall_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:275:5: this_SDEditCombinedFragment_1= ruleSDEditCombinedFragment
                    {
                     
                            newCompositeNode(grammarAccess.getSDEditCombinableDiagEltAccess().getSDEditCombinedFragmentParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSDEditCombinedFragment_in_ruleSDEditCombinableDiagElt586);
                    this_SDEditCombinedFragment_1=ruleSDEditCombinedFragment();

                    state._fsp--;

                     
                            current = this_SDEditCombinedFragment_1; 
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
    // $ANTLR end "ruleSDEditCombinableDiagElt"


    // $ANTLR start "entryRuleSDEditCall"
    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:291:1: entryRuleSDEditCall returns [EObject current=null] : iv_ruleSDEditCall= ruleSDEditCall EOF ;
    public final EObject entryRuleSDEditCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSDEditCall = null;


        try {
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:292:2: (iv_ruleSDEditCall= ruleSDEditCall EOF )
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:293:2: iv_ruleSDEditCall= ruleSDEditCall EOF
            {
             newCompositeNode(grammarAccess.getSDEditCallRule()); 
            pushFollow(FOLLOW_ruleSDEditCall_in_entryRuleSDEditCall621);
            iv_ruleSDEditCall=ruleSDEditCall();

            state._fsp--;

             current =iv_ruleSDEditCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSDEditCall631); 

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
    // $ANTLR end "entryRuleSDEditCall"


    // $ANTLR start "ruleSDEditCall"
    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:300:1: ruleSDEditCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_returnMessage_2_0= RULE_ID ) ) otherlv_3= '=' )? ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '(' ( ( (lv_params_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_paramLists_10_0= RULE_ID ) ) )* )? otherlv_11= ')' ) ;
    public final EObject ruleSDEditCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_returnMessage_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;
        Token lv_params_8_0=null;
        Token otherlv_9=null;
        Token lv_paramLists_10_0=null;
        Token otherlv_11=null;

         enterRule(); 
            
        try {
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:303:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_returnMessage_2_0= RULE_ID ) ) otherlv_3= '=' )? ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '(' ( ( (lv_params_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_paramLists_10_0= RULE_ID ) ) )* )? otherlv_11= ')' ) )
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:304:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_returnMessage_2_0= RULE_ID ) ) otherlv_3= '=' )? ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '(' ( ( (lv_params_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_paramLists_10_0= RULE_ID ) ) )* )? otherlv_11= ')' )
            {
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:304:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_returnMessage_2_0= RULE_ID ) ) otherlv_3= '=' )? ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '(' ( ( (lv_params_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_paramLists_10_0= RULE_ID ) ) )* )? otherlv_11= ')' )
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:304:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_returnMessage_2_0= RULE_ID ) ) otherlv_3= '=' )? ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '(' ( ( (lv_params_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_paramLists_10_0= RULE_ID ) ) )* )? otherlv_11= ')'
            {
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:304:2: ( (otherlv_0= RULE_ID ) )
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:305:1: (otherlv_0= RULE_ID )
            {
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:305:1: (otherlv_0= RULE_ID )
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:306:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSDEditCallRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSDEditCall676); 

            		newLeafNode(otherlv_0, grammarAccess.getSDEditCallAccess().getCallerSDEditObjnameCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleSDEditCall688); 

                	newLeafNode(otherlv_1, grammarAccess.getSDEditCallAccess().getColonKeyword_1());
                
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:321:1: ( ( (lv_returnMessage_2_0= RULE_ID ) ) otherlv_3= '=' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==18) ) {
                    alt6=1;
                }
            }
            switch (alt6) {
                case 1 :
                    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:321:2: ( (lv_returnMessage_2_0= RULE_ID ) ) otherlv_3= '='
                    {
                    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:321:2: ( (lv_returnMessage_2_0= RULE_ID ) )
                    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:322:1: (lv_returnMessage_2_0= RULE_ID )
                    {
                    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:322:1: (lv_returnMessage_2_0= RULE_ID )
                    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:323:3: lv_returnMessage_2_0= RULE_ID
                    {
                    lv_returnMessage_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSDEditCall706); 

                    			newLeafNode(lv_returnMessage_2_0, grammarAccess.getSDEditCallAccess().getReturnMessageIDTerminalRuleCall_2_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSDEditCallRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"returnMessage",
                            		lv_returnMessage_2_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleSDEditCall723); 

                        	newLeafNode(otherlv_3, grammarAccess.getSDEditCallAccess().getEqualsSignKeyword_2_1());
                        

                    }
                    break;

            }

            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:343:3: ( (otherlv_4= RULE_ID ) )
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:344:1: (otherlv_4= RULE_ID )
            {
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:344:1: (otherlv_4= RULE_ID )
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:345:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSDEditCallRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSDEditCall745); 

            		newLeafNode(otherlv_4, grammarAccess.getSDEditCallAccess().getCalledSDEditObjnameCrossReference_3_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleSDEditCall757); 

                	newLeafNode(otherlv_5, grammarAccess.getSDEditCallAccess().getFullStopKeyword_4());
                
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:360:1: ( (lv_name_6_0= RULE_ID ) )
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:361:1: (lv_name_6_0= RULE_ID )
            {
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:361:1: (lv_name_6_0= RULE_ID )
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:362:3: lv_name_6_0= RULE_ID
            {
            lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSDEditCall774); 

            			newLeafNode(lv_name_6_0, grammarAccess.getSDEditCallAccess().getNameIDTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSDEditCallRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_6_0, 
                    		"ID");
            	    

            }


            }

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleSDEditCall791); 

                	newLeafNode(otherlv_7, grammarAccess.getSDEditCallAccess().getLeftParenthesisKeyword_6());
                
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:382:1: ( ( (lv_params_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_paramLists_10_0= RULE_ID ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:382:2: ( (lv_params_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_paramLists_10_0= RULE_ID ) ) )*
                    {
                    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:382:2: ( (lv_params_8_0= RULE_ID ) )
                    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:383:1: (lv_params_8_0= RULE_ID )
                    {
                    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:383:1: (lv_params_8_0= RULE_ID )
                    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:384:3: lv_params_8_0= RULE_ID
                    {
                    lv_params_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSDEditCall809); 

                    			newLeafNode(lv_params_8_0, grammarAccess.getSDEditCallAccess().getParamsIDTerminalRuleCall_7_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSDEditCallRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"params",
                            		lv_params_8_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:400:2: (otherlv_9= ',' ( (lv_paramLists_10_0= RULE_ID ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==21) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:400:4: otherlv_9= ',' ( (lv_paramLists_10_0= RULE_ID ) )
                    	    {
                    	    otherlv_9=(Token)match(input,21,FOLLOW_21_in_ruleSDEditCall827); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getSDEditCallAccess().getCommaKeyword_7_1_0());
                    	        
                    	    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:404:1: ( (lv_paramLists_10_0= RULE_ID ) )
                    	    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:405:1: (lv_paramLists_10_0= RULE_ID )
                    	    {
                    	    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:405:1: (lv_paramLists_10_0= RULE_ID )
                    	    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:406:3: lv_paramLists_10_0= RULE_ID
                    	    {
                    	    lv_paramLists_10_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSDEditCall844); 

                    	    			newLeafNode(lv_paramLists_10_0, grammarAccess.getSDEditCallAccess().getParamListsIDTerminalRuleCall_7_1_1_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getSDEditCallRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"paramLists",
                    	            		lv_paramLists_10_0, 
                    	            		"ID");
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,22,FOLLOW_22_in_ruleSDEditCall865); 

                	newLeafNode(otherlv_11, grammarAccess.getSDEditCallAccess().getRightParenthesisKeyword_8());
                

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
    // $ANTLR end "ruleSDEditCall"


    // $ANTLR start "entryRuleSDEditCombinedFragment"
    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:434:1: entryRuleSDEditCombinedFragment returns [EObject current=null] : iv_ruleSDEditCombinedFragment= ruleSDEditCombinedFragment EOF ;
    public final EObject entryRuleSDEditCombinedFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSDEditCombinedFragment = null;


        try {
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:435:2: (iv_ruleSDEditCombinedFragment= ruleSDEditCombinedFragment EOF )
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:436:2: iv_ruleSDEditCombinedFragment= ruleSDEditCombinedFragment EOF
            {
             newCompositeNode(grammarAccess.getSDEditCombinedFragmentRule()); 
            pushFollow(FOLLOW_ruleSDEditCombinedFragment_in_entryRuleSDEditCombinedFragment901);
            iv_ruleSDEditCombinedFragment=ruleSDEditCombinedFragment();

            state._fsp--;

             current =iv_ruleSDEditCombinedFragment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSDEditCombinedFragment911); 

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
    // $ANTLR end "entryRuleSDEditCombinedFragment"


    // $ANTLR start "ruleSDEditCombinedFragment"
    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:443:1: ruleSDEditCombinedFragment returns [EObject current=null] : (this_SDEditAlt_0= ruleSDEditAlt | this_SDEditLoop_1= ruleSDEditLoop | this_SDEditOpt_2= ruleSDEditOpt ) ;
    public final EObject ruleSDEditCombinedFragment() throws RecognitionException {
        EObject current = null;

        EObject this_SDEditAlt_0 = null;

        EObject this_SDEditLoop_1 = null;

        EObject this_SDEditOpt_2 = null;


         enterRule(); 
            
        try {
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:446:28: ( (this_SDEditAlt_0= ruleSDEditAlt | this_SDEditLoop_1= ruleSDEditLoop | this_SDEditOpt_2= ruleSDEditOpt ) )
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:447:1: (this_SDEditAlt_0= ruleSDEditAlt | this_SDEditLoop_1= ruleSDEditLoop | this_SDEditOpt_2= ruleSDEditOpt )
            {
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:447:1: (this_SDEditAlt_0= ruleSDEditAlt | this_SDEditLoop_1= ruleSDEditLoop | this_SDEditOpt_2= ruleSDEditOpt )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt9=1;
                }
                break;
            case 26:
                {
                alt9=2;
                }
                break;
            case 27:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:448:5: this_SDEditAlt_0= ruleSDEditAlt
                    {
                     
                            newCompositeNode(grammarAccess.getSDEditCombinedFragmentAccess().getSDEditAltParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSDEditAlt_in_ruleSDEditCombinedFragment958);
                    this_SDEditAlt_0=ruleSDEditAlt();

                    state._fsp--;

                     
                            current = this_SDEditAlt_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:458:5: this_SDEditLoop_1= ruleSDEditLoop
                    {
                     
                            newCompositeNode(grammarAccess.getSDEditCombinedFragmentAccess().getSDEditLoopParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSDEditLoop_in_ruleSDEditCombinedFragment985);
                    this_SDEditLoop_1=ruleSDEditLoop();

                    state._fsp--;

                     
                            current = this_SDEditLoop_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:468:5: this_SDEditOpt_2= ruleSDEditOpt
                    {
                     
                            newCompositeNode(grammarAccess.getSDEditCombinedFragmentAccess().getSDEditOptParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleSDEditOpt_in_ruleSDEditCombinedFragment1012);
                    this_SDEditOpt_2=ruleSDEditOpt();

                    state._fsp--;

                     
                            current = this_SDEditOpt_2; 
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
    // $ANTLR end "ruleSDEditCombinedFragment"


    // $ANTLR start "entryRuleSDEditAlt"
    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:484:1: entryRuleSDEditAlt returns [EObject current=null] : iv_ruleSDEditAlt= ruleSDEditAlt EOF ;
    public final EObject entryRuleSDEditAlt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSDEditAlt = null;


        try {
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:485:2: (iv_ruleSDEditAlt= ruleSDEditAlt EOF )
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:486:2: iv_ruleSDEditAlt= ruleSDEditAlt EOF
            {
             newCompositeNode(grammarAccess.getSDEditAltRule()); 
            pushFollow(FOLLOW_ruleSDEditAlt_in_entryRuleSDEditAlt1047);
            iv_ruleSDEditAlt=ruleSDEditAlt();

            state._fsp--;

             current =iv_ruleSDEditAlt; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSDEditAlt1057); 

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
    // $ANTLR end "entryRuleSDEditAlt"


    // $ANTLR start "ruleSDEditAlt"
    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:493:1: ruleSDEditAlt returns [EObject current=null] : (otherlv_0= '[c:alt' ( (lv_condAlt_1_0= ruleCondition ) ) otherlv_2= ']' ( (lv_conseq_3_0= ruleSDEditCombinableDiagElt ) )+ (otherlv_4= '--[else]' ( (lv_alters_5_0= ruleSDEditCombinableDiagElt ) )* )+ otherlv_6= '[/c]' ) ;
    public final EObject ruleSDEditAlt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_condAlt_1_0 = null;

        EObject lv_conseq_3_0 = null;

        EObject lv_alters_5_0 = null;


         enterRule(); 
            
        try {
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:496:28: ( (otherlv_0= '[c:alt' ( (lv_condAlt_1_0= ruleCondition ) ) otherlv_2= ']' ( (lv_conseq_3_0= ruleSDEditCombinableDiagElt ) )+ (otherlv_4= '--[else]' ( (lv_alters_5_0= ruleSDEditCombinableDiagElt ) )* )+ otherlv_6= '[/c]' ) )
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:497:1: (otherlv_0= '[c:alt' ( (lv_condAlt_1_0= ruleCondition ) ) otherlv_2= ']' ( (lv_conseq_3_0= ruleSDEditCombinableDiagElt ) )+ (otherlv_4= '--[else]' ( (lv_alters_5_0= ruleSDEditCombinableDiagElt ) )* )+ otherlv_6= '[/c]' )
            {
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:497:1: (otherlv_0= '[c:alt' ( (lv_condAlt_1_0= ruleCondition ) ) otherlv_2= ']' ( (lv_conseq_3_0= ruleSDEditCombinableDiagElt ) )+ (otherlv_4= '--[else]' ( (lv_alters_5_0= ruleSDEditCombinableDiagElt ) )* )+ otherlv_6= '[/c]' )
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:497:3: otherlv_0= '[c:alt' ( (lv_condAlt_1_0= ruleCondition ) ) otherlv_2= ']' ( (lv_conseq_3_0= ruleSDEditCombinableDiagElt ) )+ (otherlv_4= '--[else]' ( (lv_alters_5_0= ruleSDEditCombinableDiagElt ) )* )+ otherlv_6= '[/c]'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleSDEditAlt1094); 

                	newLeafNode(otherlv_0, grammarAccess.getSDEditAltAccess().getCAltKeyword_0());
                
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:501:1: ( (lv_condAlt_1_0= ruleCondition ) )
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:502:1: (lv_condAlt_1_0= ruleCondition )
            {
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:502:1: (lv_condAlt_1_0= ruleCondition )
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:503:3: lv_condAlt_1_0= ruleCondition
            {
             
            	        newCompositeNode(grammarAccess.getSDEditAltAccess().getCondAltConditionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleCondition_in_ruleSDEditAlt1115);
            lv_condAlt_1_0=ruleCondition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSDEditAltRule());
            	        }
                   		set(
                   			current, 
                   			"condAlt",
                    		lv_condAlt_1_0, 
                    		"Condition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleSDEditAlt1127); 

                	newLeafNode(otherlv_2, grammarAccess.getSDEditAltAccess().getRightSquareBracketKeyword_2());
                
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:523:1: ( (lv_conseq_3_0= ruleSDEditCombinableDiagElt ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==23||(LA10_0>=26 && LA10_0<=27)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:524:1: (lv_conseq_3_0= ruleSDEditCombinableDiagElt )
            	    {
            	    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:524:1: (lv_conseq_3_0= ruleSDEditCombinableDiagElt )
            	    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:525:3: lv_conseq_3_0= ruleSDEditCombinableDiagElt
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSDEditAltAccess().getConseqSDEditCombinableDiagEltParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSDEditCombinableDiagElt_in_ruleSDEditAlt1148);
            	    lv_conseq_3_0=ruleSDEditCombinableDiagElt();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSDEditAltRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"conseq",
            	            		lv_conseq_3_0, 
            	            		"SDEditCombinableDiagElt");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:541:3: (otherlv_4= '--[else]' ( (lv_alters_5_0= ruleSDEditCombinableDiagElt ) )* )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==24) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:541:5: otherlv_4= '--[else]' ( (lv_alters_5_0= ruleSDEditCombinableDiagElt ) )*
            	    {
            	    otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleSDEditAlt1162); 

            	        	newLeafNode(otherlv_4, grammarAccess.getSDEditAltAccess().getElseKeyword_4_0());
            	        
            	    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:545:1: ( (lv_alters_5_0= ruleSDEditCombinableDiagElt ) )*
            	    loop11:
            	    do {
            	        int alt11=2;
            	        int LA11_0 = input.LA(1);

            	        if ( (LA11_0==RULE_ID||LA11_0==23||(LA11_0>=26 && LA11_0<=27)) ) {
            	            alt11=1;
            	        }


            	        switch (alt11) {
            	    	case 1 :
            	    	    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:546:1: (lv_alters_5_0= ruleSDEditCombinableDiagElt )
            	    	    {
            	    	    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:546:1: (lv_alters_5_0= ruleSDEditCombinableDiagElt )
            	    	    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:547:3: lv_alters_5_0= ruleSDEditCombinableDiagElt
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getSDEditAltAccess().getAltersSDEditCombinableDiagEltParserRuleCall_4_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleSDEditCombinableDiagElt_in_ruleSDEditAlt1183);
            	    	    lv_alters_5_0=ruleSDEditCombinableDiagElt();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getSDEditAltRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"alters",
            	    	            		lv_alters_5_0, 
            	    	            		"SDEditCombinableDiagElt");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop11;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            otherlv_6=(Token)match(input,25,FOLLOW_25_in_ruleSDEditAlt1198); 

                	newLeafNode(otherlv_6, grammarAccess.getSDEditAltAccess().getCKeyword_5());
                

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
    // $ANTLR end "ruleSDEditAlt"


    // $ANTLR start "entryRuleSDEditLoop"
    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:575:1: entryRuleSDEditLoop returns [EObject current=null] : iv_ruleSDEditLoop= ruleSDEditLoop EOF ;
    public final EObject entryRuleSDEditLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSDEditLoop = null;


        try {
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:576:2: (iv_ruleSDEditLoop= ruleSDEditLoop EOF )
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:577:2: iv_ruleSDEditLoop= ruleSDEditLoop EOF
            {
             newCompositeNode(grammarAccess.getSDEditLoopRule()); 
            pushFollow(FOLLOW_ruleSDEditLoop_in_entryRuleSDEditLoop1234);
            iv_ruleSDEditLoop=ruleSDEditLoop();

            state._fsp--;

             current =iv_ruleSDEditLoop; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSDEditLoop1244); 

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
    // $ANTLR end "entryRuleSDEditLoop"


    // $ANTLR start "ruleSDEditLoop"
    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:584:1: ruleSDEditLoop returns [EObject current=null] : (otherlv_0= '[c:loop' ( (lv_condLoop_1_0= ruleCondition ) ) otherlv_2= ']' ( (lv_body_3_0= ruleSDEditCombinableDiagElt ) )+ otherlv_4= '[/c]' ) ;
    public final EObject ruleSDEditLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_condLoop_1_0 = null;

        EObject lv_body_3_0 = null;


         enterRule(); 
            
        try {
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:587:28: ( (otherlv_0= '[c:loop' ( (lv_condLoop_1_0= ruleCondition ) ) otherlv_2= ']' ( (lv_body_3_0= ruleSDEditCombinableDiagElt ) )+ otherlv_4= '[/c]' ) )
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:588:1: (otherlv_0= '[c:loop' ( (lv_condLoop_1_0= ruleCondition ) ) otherlv_2= ']' ( (lv_body_3_0= ruleSDEditCombinableDiagElt ) )+ otherlv_4= '[/c]' )
            {
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:588:1: (otherlv_0= '[c:loop' ( (lv_condLoop_1_0= ruleCondition ) ) otherlv_2= ']' ( (lv_body_3_0= ruleSDEditCombinableDiagElt ) )+ otherlv_4= '[/c]' )
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:588:3: otherlv_0= '[c:loop' ( (lv_condLoop_1_0= ruleCondition ) ) otherlv_2= ']' ( (lv_body_3_0= ruleSDEditCombinableDiagElt ) )+ otherlv_4= '[/c]'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleSDEditLoop1281); 

                	newLeafNode(otherlv_0, grammarAccess.getSDEditLoopAccess().getCLoopKeyword_0());
                
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:592:1: ( (lv_condLoop_1_0= ruleCondition ) )
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:593:1: (lv_condLoop_1_0= ruleCondition )
            {
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:593:1: (lv_condLoop_1_0= ruleCondition )
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:594:3: lv_condLoop_1_0= ruleCondition
            {
             
            	        newCompositeNode(grammarAccess.getSDEditLoopAccess().getCondLoopConditionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleCondition_in_ruleSDEditLoop1302);
            lv_condLoop_1_0=ruleCondition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSDEditLoopRule());
            	        }
                   		set(
                   			current, 
                   			"condLoop",
                    		lv_condLoop_1_0, 
                    		"Condition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleSDEditLoop1314); 

                	newLeafNode(otherlv_2, grammarAccess.getSDEditLoopAccess().getRightSquareBracketKeyword_2());
                
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:614:1: ( (lv_body_3_0= ruleSDEditCombinableDiagElt ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||LA13_0==23||(LA13_0>=26 && LA13_0<=27)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:615:1: (lv_body_3_0= ruleSDEditCombinableDiagElt )
            	    {
            	    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:615:1: (lv_body_3_0= ruleSDEditCombinableDiagElt )
            	    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:616:3: lv_body_3_0= ruleSDEditCombinableDiagElt
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSDEditLoopAccess().getBodySDEditCombinableDiagEltParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSDEditCombinableDiagElt_in_ruleSDEditLoop1335);
            	    lv_body_3_0=ruleSDEditCombinableDiagElt();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSDEditLoopRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"body",
            	            		lv_body_3_0, 
            	            		"SDEditCombinableDiagElt");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleSDEditLoop1348); 

                	newLeafNode(otherlv_4, grammarAccess.getSDEditLoopAccess().getCKeyword_4());
                

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
    // $ANTLR end "ruleSDEditLoop"


    // $ANTLR start "entryRuleSDEditOpt"
    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:644:1: entryRuleSDEditOpt returns [EObject current=null] : iv_ruleSDEditOpt= ruleSDEditOpt EOF ;
    public final EObject entryRuleSDEditOpt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSDEditOpt = null;


        try {
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:645:2: (iv_ruleSDEditOpt= ruleSDEditOpt EOF )
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:646:2: iv_ruleSDEditOpt= ruleSDEditOpt EOF
            {
             newCompositeNode(grammarAccess.getSDEditOptRule()); 
            pushFollow(FOLLOW_ruleSDEditOpt_in_entryRuleSDEditOpt1384);
            iv_ruleSDEditOpt=ruleSDEditOpt();

            state._fsp--;

             current =iv_ruleSDEditOpt; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSDEditOpt1394); 

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
    // $ANTLR end "entryRuleSDEditOpt"


    // $ANTLR start "ruleSDEditOpt"
    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:653:1: ruleSDEditOpt returns [EObject current=null] : (otherlv_0= '[c:opt' ( (lv_condOpt_1_0= ruleCondition ) ) otherlv_2= ']' ( (lv_opts_3_0= ruleSDEditCombinableDiagElt ) )+ otherlv_4= '[/c]' ) ;
    public final EObject ruleSDEditOpt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_condOpt_1_0 = null;

        EObject lv_opts_3_0 = null;


         enterRule(); 
            
        try {
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:656:28: ( (otherlv_0= '[c:opt' ( (lv_condOpt_1_0= ruleCondition ) ) otherlv_2= ']' ( (lv_opts_3_0= ruleSDEditCombinableDiagElt ) )+ otherlv_4= '[/c]' ) )
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:657:1: (otherlv_0= '[c:opt' ( (lv_condOpt_1_0= ruleCondition ) ) otherlv_2= ']' ( (lv_opts_3_0= ruleSDEditCombinableDiagElt ) )+ otherlv_4= '[/c]' )
            {
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:657:1: (otherlv_0= '[c:opt' ( (lv_condOpt_1_0= ruleCondition ) ) otherlv_2= ']' ( (lv_opts_3_0= ruleSDEditCombinableDiagElt ) )+ otherlv_4= '[/c]' )
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:657:3: otherlv_0= '[c:opt' ( (lv_condOpt_1_0= ruleCondition ) ) otherlv_2= ']' ( (lv_opts_3_0= ruleSDEditCombinableDiagElt ) )+ otherlv_4= '[/c]'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleSDEditOpt1431); 

                	newLeafNode(otherlv_0, grammarAccess.getSDEditOptAccess().getCOptKeyword_0());
                
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:661:1: ( (lv_condOpt_1_0= ruleCondition ) )
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:662:1: (lv_condOpt_1_0= ruleCondition )
            {
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:662:1: (lv_condOpt_1_0= ruleCondition )
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:663:3: lv_condOpt_1_0= ruleCondition
            {
             
            	        newCompositeNode(grammarAccess.getSDEditOptAccess().getCondOptConditionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleCondition_in_ruleSDEditOpt1452);
            lv_condOpt_1_0=ruleCondition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSDEditOptRule());
            	        }
                   		set(
                   			current, 
                   			"condOpt",
                    		lv_condOpt_1_0, 
                    		"Condition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleSDEditOpt1464); 

                	newLeafNode(otherlv_2, grammarAccess.getSDEditOptAccess().getRightSquareBracketKeyword_2());
                
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:683:1: ( (lv_opts_3_0= ruleSDEditCombinableDiagElt ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||LA14_0==23||(LA14_0>=26 && LA14_0<=27)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:684:1: (lv_opts_3_0= ruleSDEditCombinableDiagElt )
            	    {
            	    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:684:1: (lv_opts_3_0= ruleSDEditCombinableDiagElt )
            	    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:685:3: lv_opts_3_0= ruleSDEditCombinableDiagElt
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSDEditOptAccess().getOptsSDEditCombinableDiagEltParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSDEditCombinableDiagElt_in_ruleSDEditOpt1485);
            	    lv_opts_3_0=ruleSDEditCombinableDiagElt();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSDEditOptRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"opts",
            	            		lv_opts_3_0, 
            	            		"SDEditCombinableDiagElt");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleSDEditOpt1498); 

                	newLeafNode(otherlv_4, grammarAccess.getSDEditOptAccess().getCKeyword_4());
                

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
    // $ANTLR end "ruleSDEditOpt"


    // $ANTLR start "entryRuleCondition"
    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:713:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:714:2: (iv_ruleCondition= ruleCondition EOF )
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:715:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition1534);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition1544); 

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
    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:722:1: ruleCondition returns [EObject current=null] : ( ( (lv_condLeft_0_0= ruleConditionElm ) )+ ( (lv_conlistRight_1_0= ruleConditionlistRight ) )* ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject lv_condLeft_0_0 = null;

        EObject lv_conlistRight_1_0 = null;


         enterRule(); 
            
        try {
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:725:28: ( ( ( (lv_condLeft_0_0= ruleConditionElm ) )+ ( (lv_conlistRight_1_0= ruleConditionlistRight ) )* ) )
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:726:1: ( ( (lv_condLeft_0_0= ruleConditionElm ) )+ ( (lv_conlistRight_1_0= ruleConditionlistRight ) )* )
            {
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:726:1: ( ( (lv_condLeft_0_0= ruleConditionElm ) )+ ( (lv_conlistRight_1_0= ruleConditionlistRight ) )* )
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:726:2: ( (lv_condLeft_0_0= ruleConditionElm ) )+ ( (lv_conlistRight_1_0= ruleConditionlistRight ) )*
            {
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:726:2: ( (lv_condLeft_0_0= ruleConditionElm ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_INT)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:727:1: (lv_condLeft_0_0= ruleConditionElm )
            	    {
            	    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:727:1: (lv_condLeft_0_0= ruleConditionElm )
            	    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:728:3: lv_condLeft_0_0= ruleConditionElm
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConditionAccess().getCondLeftConditionElmParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConditionElm_in_ruleCondition1590);
            	    lv_condLeft_0_0=ruleConditionElm();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConditionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"condLeft",
            	            		lv_condLeft_0_0, 
            	            		"ConditionElm");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:744:3: ( (lv_conlistRight_1_0= ruleConditionlistRight ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=28 && LA16_0<=41)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:745:1: (lv_conlistRight_1_0= ruleConditionlistRight )
            	    {
            	    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:745:1: (lv_conlistRight_1_0= ruleConditionlistRight )
            	    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:746:3: lv_conlistRight_1_0= ruleConditionlistRight
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConditionAccess().getConlistRightConditionlistRightParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConditionlistRight_in_ruleCondition1612);
            	    lv_conlistRight_1_0=ruleConditionlistRight();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConditionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"conlistRight",
            	            		lv_conlistRight_1_0, 
            	            		"ConditionlistRight");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleConditionlistRight"
    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:770:1: entryRuleConditionlistRight returns [EObject current=null] : iv_ruleConditionlistRight= ruleConditionlistRight EOF ;
    public final EObject entryRuleConditionlistRight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionlistRight = null;


        try {
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:771:2: (iv_ruleConditionlistRight= ruleConditionlistRight EOF )
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:772:2: iv_ruleConditionlistRight= ruleConditionlistRight EOF
            {
             newCompositeNode(grammarAccess.getConditionlistRightRule()); 
            pushFollow(FOLLOW_ruleConditionlistRight_in_entryRuleConditionlistRight1649);
            iv_ruleConditionlistRight=ruleConditionlistRight();

            state._fsp--;

             current =iv_ruleConditionlistRight; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionlistRight1659); 

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
    // $ANTLR end "entryRuleConditionlistRight"


    // $ANTLR start "ruleConditionlistRight"
    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:779:1: ruleConditionlistRight returns [EObject current=null] : ( (otherlv_0= 'IS NOT' | otherlv_1= 'IS' | otherlv_2= '!=' | otherlv_3= '==' | otherlv_4= '<' | otherlv_5= '>' | otherlv_6= '<=' | otherlv_7= '>=' | otherlv_8= '!' | otherlv_9= '||' | otherlv_10= '&&' | otherlv_11= 'and' | otherlv_12= '^' | otherlv_13= 'or' ) ( (lv_condRight_14_0= ruleConditionElm ) ) ) ;
    public final EObject ruleConditionlistRight() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_condRight_14_0 = null;


         enterRule(); 
            
        try {
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:782:28: ( ( (otherlv_0= 'IS NOT' | otherlv_1= 'IS' | otherlv_2= '!=' | otherlv_3= '==' | otherlv_4= '<' | otherlv_5= '>' | otherlv_6= '<=' | otherlv_7= '>=' | otherlv_8= '!' | otherlv_9= '||' | otherlv_10= '&&' | otherlv_11= 'and' | otherlv_12= '^' | otherlv_13= 'or' ) ( (lv_condRight_14_0= ruleConditionElm ) ) ) )
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:783:1: ( (otherlv_0= 'IS NOT' | otherlv_1= 'IS' | otherlv_2= '!=' | otherlv_3= '==' | otherlv_4= '<' | otherlv_5= '>' | otherlv_6= '<=' | otherlv_7= '>=' | otherlv_8= '!' | otherlv_9= '||' | otherlv_10= '&&' | otherlv_11= 'and' | otherlv_12= '^' | otherlv_13= 'or' ) ( (lv_condRight_14_0= ruleConditionElm ) ) )
            {
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:783:1: ( (otherlv_0= 'IS NOT' | otherlv_1= 'IS' | otherlv_2= '!=' | otherlv_3= '==' | otherlv_4= '<' | otherlv_5= '>' | otherlv_6= '<=' | otherlv_7= '>=' | otherlv_8= '!' | otherlv_9= '||' | otherlv_10= '&&' | otherlv_11= 'and' | otherlv_12= '^' | otherlv_13= 'or' ) ( (lv_condRight_14_0= ruleConditionElm ) ) )
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:783:2: (otherlv_0= 'IS NOT' | otherlv_1= 'IS' | otherlv_2= '!=' | otherlv_3= '==' | otherlv_4= '<' | otherlv_5= '>' | otherlv_6= '<=' | otherlv_7= '>=' | otherlv_8= '!' | otherlv_9= '||' | otherlv_10= '&&' | otherlv_11= 'and' | otherlv_12= '^' | otherlv_13= 'or' ) ( (lv_condRight_14_0= ruleConditionElm ) )
            {
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:783:2: (otherlv_0= 'IS NOT' | otherlv_1= 'IS' | otherlv_2= '!=' | otherlv_3= '==' | otherlv_4= '<' | otherlv_5= '>' | otherlv_6= '<=' | otherlv_7= '>=' | otherlv_8= '!' | otherlv_9= '||' | otherlv_10= '&&' | otherlv_11= 'and' | otherlv_12= '^' | otherlv_13= 'or' )
            int alt17=14;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt17=1;
                }
                break;
            case 29:
                {
                alt17=2;
                }
                break;
            case 30:
                {
                alt17=3;
                }
                break;
            case 31:
                {
                alt17=4;
                }
                break;
            case 32:
                {
                alt17=5;
                }
                break;
            case 33:
                {
                alt17=6;
                }
                break;
            case 34:
                {
                alt17=7;
                }
                break;
            case 35:
                {
                alt17=8;
                }
                break;
            case 36:
                {
                alt17=9;
                }
                break;
            case 37:
                {
                alt17=10;
                }
                break;
            case 38:
                {
                alt17=11;
                }
                break;
            case 39:
                {
                alt17=12;
                }
                break;
            case 40:
                {
                alt17=13;
                }
                break;
            case 41:
                {
                alt17=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:783:4: otherlv_0= 'IS NOT'
                    {
                    otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleConditionlistRight1697); 

                        	newLeafNode(otherlv_0, grammarAccess.getConditionlistRightAccess().getISNOTKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:788:7: otherlv_1= 'IS'
                    {
                    otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleConditionlistRight1715); 

                        	newLeafNode(otherlv_1, grammarAccess.getConditionlistRightAccess().getISKeyword_0_1());
                        

                    }
                    break;
                case 3 :
                    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:793:7: otherlv_2= '!='
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleConditionlistRight1733); 

                        	newLeafNode(otherlv_2, grammarAccess.getConditionlistRightAccess().getExclamationMarkEqualsSignKeyword_0_2());
                        

                    }
                    break;
                case 4 :
                    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:798:7: otherlv_3= '=='
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleConditionlistRight1751); 

                        	newLeafNode(otherlv_3, grammarAccess.getConditionlistRightAccess().getEqualsSignEqualsSignKeyword_0_3());
                        

                    }
                    break;
                case 5 :
                    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:803:7: otherlv_4= '<'
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_32_in_ruleConditionlistRight1769); 

                        	newLeafNode(otherlv_4, grammarAccess.getConditionlistRightAccess().getLessThanSignKeyword_0_4());
                        

                    }
                    break;
                case 6 :
                    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:808:7: otherlv_5= '>'
                    {
                    otherlv_5=(Token)match(input,33,FOLLOW_33_in_ruleConditionlistRight1787); 

                        	newLeafNode(otherlv_5, grammarAccess.getConditionlistRightAccess().getGreaterThanSignKeyword_0_5());
                        

                    }
                    break;
                case 7 :
                    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:813:7: otherlv_6= '<='
                    {
                    otherlv_6=(Token)match(input,34,FOLLOW_34_in_ruleConditionlistRight1805); 

                        	newLeafNode(otherlv_6, grammarAccess.getConditionlistRightAccess().getLessThanSignEqualsSignKeyword_0_6());
                        

                    }
                    break;
                case 8 :
                    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:818:7: otherlv_7= '>='
                    {
                    otherlv_7=(Token)match(input,35,FOLLOW_35_in_ruleConditionlistRight1823); 

                        	newLeafNode(otherlv_7, grammarAccess.getConditionlistRightAccess().getGreaterThanSignEqualsSignKeyword_0_7());
                        

                    }
                    break;
                case 9 :
                    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:823:7: otherlv_8= '!'
                    {
                    otherlv_8=(Token)match(input,36,FOLLOW_36_in_ruleConditionlistRight1841); 

                        	newLeafNode(otherlv_8, grammarAccess.getConditionlistRightAccess().getExclamationMarkKeyword_0_8());
                        

                    }
                    break;
                case 10 :
                    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:828:7: otherlv_9= '||'
                    {
                    otherlv_9=(Token)match(input,37,FOLLOW_37_in_ruleConditionlistRight1859); 

                        	newLeafNode(otherlv_9, grammarAccess.getConditionlistRightAccess().getVerticalLineVerticalLineKeyword_0_9());
                        

                    }
                    break;
                case 11 :
                    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:833:7: otherlv_10= '&&'
                    {
                    otherlv_10=(Token)match(input,38,FOLLOW_38_in_ruleConditionlistRight1877); 

                        	newLeafNode(otherlv_10, grammarAccess.getConditionlistRightAccess().getAmpersandAmpersandKeyword_0_10());
                        

                    }
                    break;
                case 12 :
                    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:838:7: otherlv_11= 'and'
                    {
                    otherlv_11=(Token)match(input,39,FOLLOW_39_in_ruleConditionlistRight1895); 

                        	newLeafNode(otherlv_11, grammarAccess.getConditionlistRightAccess().getAndKeyword_0_11());
                        

                    }
                    break;
                case 13 :
                    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:843:7: otherlv_12= '^'
                    {
                    otherlv_12=(Token)match(input,40,FOLLOW_40_in_ruleConditionlistRight1913); 

                        	newLeafNode(otherlv_12, grammarAccess.getConditionlistRightAccess().getCircumflexAccentKeyword_0_12());
                        

                    }
                    break;
                case 14 :
                    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:848:7: otherlv_13= 'or'
                    {
                    otherlv_13=(Token)match(input,41,FOLLOW_41_in_ruleConditionlistRight1931); 

                        	newLeafNode(otherlv_13, grammarAccess.getConditionlistRightAccess().getOrKeyword_0_13());
                        

                    }
                    break;

            }

            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:852:2: ( (lv_condRight_14_0= ruleConditionElm ) )
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:853:1: (lv_condRight_14_0= ruleConditionElm )
            {
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:853:1: (lv_condRight_14_0= ruleConditionElm )
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:854:3: lv_condRight_14_0= ruleConditionElm
            {
             
            	        newCompositeNode(grammarAccess.getConditionlistRightAccess().getCondRightConditionElmParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleConditionElm_in_ruleConditionlistRight1953);
            lv_condRight_14_0=ruleConditionElm();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConditionlistRightRule());
            	        }
                   		set(
                   			current, 
                   			"condRight",
                    		lv_condRight_14_0, 
                    		"ConditionElm");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleConditionlistRight"


    // $ANTLR start "entryRuleConditionElm"
    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:878:1: entryRuleConditionElm returns [EObject current=null] : iv_ruleConditionElm= ruleConditionElm EOF ;
    public final EObject entryRuleConditionElm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionElm = null;


        try {
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:879:2: (iv_ruleConditionElm= ruleConditionElm EOF )
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:880:2: iv_ruleConditionElm= ruleConditionElm EOF
            {
             newCompositeNode(grammarAccess.getConditionElmRule()); 
            pushFollow(FOLLOW_ruleConditionElm_in_entryRuleConditionElm1989);
            iv_ruleConditionElm=ruleConditionElm();

            state._fsp--;

             current =iv_ruleConditionElm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionElm1999); 

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
    // $ANTLR end "entryRuleConditionElm"


    // $ANTLR start "ruleConditionElm"
    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:887:1: ruleConditionElm returns [EObject current=null] : ( ( (lv_operandN_0_0= RULE_INT ) ) | ( (lv_operandStr_1_0= RULE_ID ) ) ) ;
    public final EObject ruleConditionElm() throws RecognitionException {
        EObject current = null;

        Token lv_operandN_0_0=null;
        Token lv_operandStr_1_0=null;

         enterRule(); 
            
        try {
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:890:28: ( ( ( (lv_operandN_0_0= RULE_INT ) ) | ( (lv_operandStr_1_0= RULE_ID ) ) ) )
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:891:1: ( ( (lv_operandN_0_0= RULE_INT ) ) | ( (lv_operandStr_1_0= RULE_ID ) ) )
            {
            // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:891:1: ( ( (lv_operandN_0_0= RULE_INT ) ) | ( (lv_operandStr_1_0= RULE_ID ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_INT) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_ID) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:891:2: ( (lv_operandN_0_0= RULE_INT ) )
                    {
                    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:891:2: ( (lv_operandN_0_0= RULE_INT ) )
                    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:892:1: (lv_operandN_0_0= RULE_INT )
                    {
                    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:892:1: (lv_operandN_0_0= RULE_INT )
                    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:893:3: lv_operandN_0_0= RULE_INT
                    {
                    lv_operandN_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleConditionElm2041); 

                    			newLeafNode(lv_operandN_0_0, grammarAccess.getConditionElmAccess().getOperandNINTTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConditionElmRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"operandN",
                            		lv_operandN_0_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:910:6: ( (lv_operandStr_1_0= RULE_ID ) )
                    {
                    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:910:6: ( (lv_operandStr_1_0= RULE_ID ) )
                    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:911:1: (lv_operandStr_1_0= RULE_ID )
                    {
                    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:911:1: (lv_operandStr_1_0= RULE_ID )
                    // ../featureSeqDiag.sdedit.sd_language/src-gen/featureSeqDiag/sdedit/parser/antlr/internal/InternalSD_language.g:912:3: lv_operandStr_1_0= RULE_ID
                    {
                    lv_operandStr_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConditionElm2069); 

                    			newLeafNode(lv_operandStr_1_0, grammarAccess.getConditionElmAccess().getOperandStrIDTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConditionElmRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"operandStr",
                            		lv_operandStr_1_0, 
                            		"ID");
                    	    

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
    // $ANTLR end "ruleConditionElm"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSDEditModel_in_entryRuleSDEditModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSDEditModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSDEditObj_in_ruleSDEditModel131 = new BitSet(new long[]{0x000000000C800012L});
    public static final BitSet FOLLOW_ruleSDEditCombinableDiagElt_in_ruleSDEditModel153 = new BitSet(new long[]{0x000000000C800012L});
    public static final BitSet FOLLOW_ruleSDEditObj_in_entryRuleSDEditObj190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSDEditObj200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSDEditObjname_in_ruleSDEditObj246 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleSDEditObj258 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSDEditObj275 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleSDEditObj293 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_13_in_ruleSDEditObj306 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14_in_ruleSDEditObj324 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15_in_ruleSDEditObj342 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_16_in_ruleSDEditObj360 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSDEditObj373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSDEditObjname_in_entryRuleSDEditObjname411 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSDEditObjname421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSDEditObjname462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSDEditCombinableDiagElt_in_entryRuleSDEditCombinableDiagElt502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSDEditCombinableDiagElt512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSDEditCall_in_ruleSDEditCombinableDiagElt559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSDEditCombinedFragment_in_ruleSDEditCombinableDiagElt586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSDEditCall_in_entryRuleSDEditCall621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSDEditCall631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSDEditCall676 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleSDEditCall688 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSDEditCall706 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSDEditCall723 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSDEditCall745 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSDEditCall757 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSDEditCall774 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSDEditCall791 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSDEditCall809 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleSDEditCall827 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSDEditCall844 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_22_in_ruleSDEditCall865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSDEditCombinedFragment_in_entryRuleSDEditCombinedFragment901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSDEditCombinedFragment911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSDEditAlt_in_ruleSDEditCombinedFragment958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSDEditLoop_in_ruleSDEditCombinedFragment985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSDEditOpt_in_ruleSDEditCombinedFragment1012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSDEditAlt_in_entryRuleSDEditAlt1047 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSDEditAlt1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleSDEditAlt1094 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleSDEditAlt1115 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSDEditAlt1127 = new BitSet(new long[]{0x000000000C800010L});
    public static final BitSet FOLLOW_ruleSDEditCombinableDiagElt_in_ruleSDEditAlt1148 = new BitSet(new long[]{0x000000000D800010L});
    public static final BitSet FOLLOW_24_in_ruleSDEditAlt1162 = new BitSet(new long[]{0x000000000F800010L});
    public static final BitSet FOLLOW_ruleSDEditCombinableDiagElt_in_ruleSDEditAlt1183 = new BitSet(new long[]{0x000000000F800010L});
    public static final BitSet FOLLOW_25_in_ruleSDEditAlt1198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSDEditLoop_in_entryRuleSDEditLoop1234 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSDEditLoop1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleSDEditLoop1281 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleSDEditLoop1302 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSDEditLoop1314 = new BitSet(new long[]{0x000000000C800010L});
    public static final BitSet FOLLOW_ruleSDEditCombinableDiagElt_in_ruleSDEditLoop1335 = new BitSet(new long[]{0x000000000E800010L});
    public static final BitSet FOLLOW_25_in_ruleSDEditLoop1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSDEditOpt_in_entryRuleSDEditOpt1384 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSDEditOpt1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleSDEditOpt1431 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleSDEditOpt1452 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSDEditOpt1464 = new BitSet(new long[]{0x000000000C800010L});
    public static final BitSet FOLLOW_ruleSDEditCombinableDiagElt_in_ruleSDEditOpt1485 = new BitSet(new long[]{0x000000000E800010L});
    public static final BitSet FOLLOW_25_in_ruleSDEditOpt1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition1534 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition1544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionElm_in_ruleCondition1590 = new BitSet(new long[]{0x000003FFF0000032L});
    public static final BitSet FOLLOW_ruleConditionlistRight_in_ruleCondition1612 = new BitSet(new long[]{0x000003FFF0000002L});
    public static final BitSet FOLLOW_ruleConditionlistRight_in_entryRuleConditionlistRight1649 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionlistRight1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleConditionlistRight1697 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_29_in_ruleConditionlistRight1715 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_30_in_ruleConditionlistRight1733 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_31_in_ruleConditionlistRight1751 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_32_in_ruleConditionlistRight1769 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_33_in_ruleConditionlistRight1787 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_34_in_ruleConditionlistRight1805 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_35_in_ruleConditionlistRight1823 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_36_in_ruleConditionlistRight1841 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_37_in_ruleConditionlistRight1859 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_38_in_ruleConditionlistRight1877 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_39_in_ruleConditionlistRight1895 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_40_in_ruleConditionlistRight1913 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_41_in_ruleConditionlistRight1931 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleConditionElm_in_ruleConditionlistRight1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionElm_in_entryRuleConditionElm1989 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionElm1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleConditionElm2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConditionElm2069 = new BitSet(new long[]{0x0000000000000002L});

}