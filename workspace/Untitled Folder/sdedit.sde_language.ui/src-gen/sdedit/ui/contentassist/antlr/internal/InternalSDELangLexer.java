package sdedit.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSDELangLexer extends Lexer {
    public static final int T__40=40;
    public static final int RULE_ID=4;
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
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=6;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__19=19;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=7;
    public static final int T__16=16;
    public static final int T__33=33;
    public static final int T__15=15;
    public static final int T__34=34;
    public static final int T__18=18;
    public static final int T__35=35;
    public static final int T__17=17;
    public static final int T__36=36;
    public static final int T__12=12;
    public static final int T__37=37;
    public static final int T__11=11;
    public static final int T__38=38;
    public static final int T__14=14;
    public static final int T__39=39;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators

    public InternalSDELangLexer() {;} 
    public InternalSDELangLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSDELangLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:11:7: ( 'a' )
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:11:9: 'a'
            {
            match('a'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:12:7: ( 'p' )
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:12:9: 'p'
            {
            match('p'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:13:7: ( 'r' )
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:13:9: 'r'
            {
            match('r'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:14:7: ( 'x' )
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:14:9: 'x'
            {
            match('x'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:15:7: ( 'IS NOT' )
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:15:9: 'IS NOT'
            {
            match("IS NOT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:16:7: ( 'IS' )
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:16:9: 'IS'
            {
            match("IS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:17:7: ( '!=' )
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:17:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:18:7: ( '==' )
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:18:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:19:7: ( '<' )
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:19:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:20:7: ( '>' )
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:20:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:21:7: ( '<=' )
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:21:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:22:7: ( '>=' )
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:22:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:23:7: ( '!' )
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:23:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:24:7: ( '||' )
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:24:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:25:7: ( '&&' )
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:25:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:26:7: ( 'and' )
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:26:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:27:7: ( '^' )
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:27:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:28:7: ( 'or' )
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:28:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:29:7: ( ':' )
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:29:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:30:7: ( '[' )
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:30:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:31:7: ( ']' )
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:31:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:32:7: ( '.' )
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:32:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:33:7: ( '(' )
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:33:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:34:7: ( ')' )
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:34:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:35:7: ( '=' )
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:35:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:36:7: ( ',' )
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:36:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:37:7: ( '[c:alt' )
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:37:9: '[c:alt'
            {
            match("[c:alt"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:38:7: ( '[/c]' )
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:38:9: '[/c]'
            {
            match("[/c]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:39:7: ( '--[else]' )
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:39:9: '--[else]'
            {
            match("--[else]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:40:7: ( '[c:loop' )
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:40:9: '[c:loop'
            {
            match("[c:loop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:41:7: ( '[c:opt' )
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:41:9: '[c:opt'
            {
            match("[c:opt"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:2475:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:2475:19: '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('#'); 
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:2475:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:2475:23: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:2475:39: ( ( '\\r' )? '\\n' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\n'||LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:2475:40: ( '\\r' )? '\\n'
                    {
                    // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:2475:40: ( '\\r' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='\r') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:2475:40: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:2477:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:2477:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:2477:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:2477:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:2477:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:2479:10: ( ( '0' .. '9' )+ )
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:2479:12: ( '0' .. '9' )+
            {
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:2479:12: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:2479:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:2481:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:2481:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:2481:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:2481:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:2481:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:2481:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:2481:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:2481:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:2481:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:2481:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:2481:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:2483:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:2483:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:2483:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:2483:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:2485:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:2485:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:2485:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:2487:16: ( . )
            // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:2487:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=38;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:1:184: T__40
                {
                mT__40(); 

                }
                break;
            case 31 :
                // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:1:190: T__41
                {
                mT__41(); 

                }
                break;
            case 32 :
                // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:1:196: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 33 :
                // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:1:212: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 34 :
                // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:1:220: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 35 :
                // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:1:229: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 36 :
                // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:1:241: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 37 :
                // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:1:257: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 38 :
                // ../sdedit.sde_language.ui/src-gen/sdedit/ui/contentassist/antlr/internal/InternalSDELang.g:1:265: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\37\1\41\1\42\1\43\1\40\1\46\1\50\1\52\1\54\2\35\1\57"+
        "\1\40\1\uffff\1\64\5\uffff\1\35\3\uffff\3\35\2\uffff\1\40\5\uffff"+
        "\1\102\13\uffff\1\103\17\uffff\1\105\10\uffff";
    static final String DFA12_eofS =
        "\111\uffff";
    static final String DFA12_minS =
        "\1\0\4\60\1\123\4\75\1\174\1\46\1\101\1\162\1\uffff\1\57\5\uffff"+
        "\1\55\3\uffff\2\0\1\52\2\uffff\1\144\5\uffff\1\40\13\uffff\1\60"+
        "\1\uffff\1\72\15\uffff\1\60\3\uffff\1\141\4\uffff";
    static final String DFA12_maxS =
        "\1\uffff\4\172\1\123\4\75\1\174\1\46\1\172\1\162\1\uffff\1\143\5"+
        "\uffff\1\55\3\uffff\2\uffff\1\52\2\uffff\1\144\5\uffff\1\172\13"+
        "\uffff\1\172\1\uffff\1\72\15\uffff\1\172\3\uffff\1\157\4\uffff";
    static final String DFA12_acceptS =
        "\16\uffff\1\23\1\uffff\1\25\1\26\1\27\1\30\1\32\1\uffff\1\40\1\41"+
        "\1\42\3\uffff\1\45\1\46\1\uffff\1\1\1\41\1\2\1\3\1\4\1\uffff\1\7"+
        "\1\15\1\10\1\31\1\13\1\11\1\14\1\12\1\16\1\17\1\21\1\uffff\1\23"+
        "\1\uffff\1\34\1\24\1\25\1\26\1\27\1\30\1\32\1\35\1\40\1\42\1\43"+
        "\1\44\1\45\1\uffff\1\5\1\6\1\22\1\uffff\1\20\1\33\1\36\1\37";
    static final String DFA12_specialS =
        "\1\1\30\uffff\1\2\1\0\56\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\35\2\34\2\35\1\34\22\35\1\34\1\6\1\31\1\26\2\35\1\13\1\32"+
            "\1\22\1\23\2\35\1\24\1\25\1\21\1\33\12\30\1\16\1\35\1\10\1\7"+
            "\1\11\2\35\10\27\1\5\21\27\1\17\1\35\1\20\1\14\1\27\1\35\1\1"+
            "\15\27\1\15\1\2\1\27\1\3\5\27\1\4\2\27\1\35\1\12\uff83\35",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\15\40\1\36\14\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\44",
            "\1\45",
            "\1\47",
            "\1\51",
            "\1\53",
            "\1\55",
            "\1\56",
            "\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\60",
            "",
            "\1\63\63\uffff\1\62",
            "",
            "",
            "",
            "",
            "",
            "\1\72",
            "",
            "",
            "",
            "\0\75",
            "\0\75",
            "\1\76",
            "",
            "",
            "\1\100",
            "",
            "",
            "",
            "",
            "",
            "\1\101\17\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\1\104",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "",
            "",
            "\1\106\12\uffff\1\107\2\uffff\1\110",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_26 = input.LA(1);

                        s = -1;
                        if ( ((LA12_26>='\u0000' && LA12_26<='\uFFFF')) ) {s = 61;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='a') ) {s = 1;}

                        else if ( (LA12_0=='p') ) {s = 2;}

                        else if ( (LA12_0=='r') ) {s = 3;}

                        else if ( (LA12_0=='x') ) {s = 4;}

                        else if ( (LA12_0=='I') ) {s = 5;}

                        else if ( (LA12_0=='!') ) {s = 6;}

                        else if ( (LA12_0=='=') ) {s = 7;}

                        else if ( (LA12_0=='<') ) {s = 8;}

                        else if ( (LA12_0=='>') ) {s = 9;}

                        else if ( (LA12_0=='|') ) {s = 10;}

                        else if ( (LA12_0=='&') ) {s = 11;}

                        else if ( (LA12_0=='^') ) {s = 12;}

                        else if ( (LA12_0=='o') ) {s = 13;}

                        else if ( (LA12_0==':') ) {s = 14;}

                        else if ( (LA12_0=='[') ) {s = 15;}

                        else if ( (LA12_0==']') ) {s = 16;}

                        else if ( (LA12_0=='.') ) {s = 17;}

                        else if ( (LA12_0=='(') ) {s = 18;}

                        else if ( (LA12_0==')') ) {s = 19;}

                        else if ( (LA12_0==',') ) {s = 20;}

                        else if ( (LA12_0=='-') ) {s = 21;}

                        else if ( (LA12_0=='#') ) {s = 22;}

                        else if ( ((LA12_0>='A' && LA12_0<='H')||(LA12_0>='J' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='b' && LA12_0<='n')||LA12_0=='q'||(LA12_0>='s' && LA12_0<='w')||(LA12_0>='y' && LA12_0<='z')) ) {s = 23;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 24;}

                        else if ( (LA12_0=='\"') ) {s = 25;}

                        else if ( (LA12_0=='\'') ) {s = 26;}

                        else if ( (LA12_0=='/') ) {s = 27;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 28;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||(LA12_0>='$' && LA12_0<='%')||(LA12_0>='*' && LA12_0<='+')||LA12_0==';'||(LA12_0>='?' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||LA12_0=='{'||(LA12_0>='}' && LA12_0<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_25 = input.LA(1);

                        s = -1;
                        if ( ((LA12_25>='\u0000' && LA12_25<='\uFFFF')) ) {s = 61;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}