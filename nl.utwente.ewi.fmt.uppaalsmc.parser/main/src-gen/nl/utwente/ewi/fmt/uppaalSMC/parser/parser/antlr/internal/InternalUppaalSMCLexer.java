package nl.utwente.ewi.fmt.uppaalSMC.parser.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUppaalSMCLexer extends Lexer {
    public static final int T__144=144;
    public static final int T__143=143;
    public static final int T__146=146;
    public static final int T__50=50;
    public static final int T__145=145;
    public static final int T__140=140;
    public static final int T__142=142;
    public static final int T__141=141;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__137=137;
    public static final int T__52=52;
    public static final int T__136=136;
    public static final int T__53=53;
    public static final int T__139=139;
    public static final int T__54=54;
    public static final int T__138=138;
    public static final int T__133=133;
    public static final int T__132=132;
    public static final int T__60=60;
    public static final int T__135=135;
    public static final int T__61=61;
    public static final int T__134=134;
    public static final int RULE_ID=4;
    public static final int T__131=131;
    public static final int T__130=130;
    public static final int RULE_INT=11;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__67=67;
    public static final int T__129=129;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__126=126;
    public static final int RULE_DOUBLE_STR=10;
    public static final int T__63=63;
    public static final int T__125=125;
    public static final int T__64=64;
    public static final int T__128=128;
    public static final int T__65=65;
    public static final int T__127=127;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__150=150;
    public static final int RULE_INT_STR=9;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__148=148;
    public static final int T__41=41;
    public static final int T__147=147;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__149=149;
    public static final int RULE_QUERIES=5;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int RULE_CHAN=7;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__122=122;
    public static final int T__70=70;
    public static final int T__121=121;
    public static final int T__71=71;
    public static final int T__124=124;
    public static final int T__72=72;
    public static final int T__123=123;
    public static final int T__120=120;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=14;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int RULE_CLOCK=8;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators

    public InternalUppaalSMCLexer() {;} 
    public InternalUppaalSMCLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalUppaalSMCLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalUppaalSMC.g"; }

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:11:7: ( '<?xml' )
            // InternalUppaalSMC.g:11:9: '<?xml'
            {
            match("<?xml"); 


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
            // InternalUppaalSMC.g:12:7: ( 'version=\"1.0\"' )
            // InternalUppaalSMC.g:12:9: 'version=\"1.0\"'
            {
            match("version=\"1.0\""); 


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
            // InternalUppaalSMC.g:13:7: ( 'encoding=\"utf-8\"?>' )
            // InternalUppaalSMC.g:13:9: 'encoding=\"utf-8\"?>'
            {
            match("encoding=\"utf-8\"?>"); 


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
            // InternalUppaalSMC.g:14:7: ( '<!DOCTYPE' )
            // InternalUppaalSMC.g:14:9: '<!DOCTYPE'
            {
            match("<!DOCTYPE"); 


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
            // InternalUppaalSMC.g:15:7: ( '\\'-//Uppaal' )
            // InternalUppaalSMC.g:15:9: '\\'-//Uppaal'
            {
            match("'-//Uppaal"); 


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
            // InternalUppaalSMC.g:16:7: ( 'Team//DTD' )
            // InternalUppaalSMC.g:16:9: 'Team//DTD'
            {
            match("Team//DTD"); 


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
            // InternalUppaalSMC.g:17:7: ( 'Flat' )
            // InternalUppaalSMC.g:17:9: 'Flat'
            {
            match("Flat"); 


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
            // InternalUppaalSMC.g:18:7: ( 'System' )
            // InternalUppaalSMC.g:18:9: 'System'
            {
            match("System"); 


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
            // InternalUppaalSMC.g:19:7: ( '1.1//EN\\'' )
            // InternalUppaalSMC.g:19:9: '1.1//EN\\''
            {
            match("1.1//EN'"); 


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
            // InternalUppaalSMC.g:20:7: ( '\\'http://www.it.uu.se/research/group/darts/uppaal/flat-1_2.dtd\\'' )
            // InternalUppaalSMC.g:20:9: '\\'http://www.it.uu.se/research/group/darts/uppaal/flat-1_2.dtd\\''
            {
            match("'http://www.it.uu.se/research/group/darts/uppaal/flat-1_2.dtd'"); 


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
            // InternalUppaalSMC.g:21:7: ( '>' )
            // InternalUppaalSMC.g:21:9: '>'
            {
            match('>'); 

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
            // InternalUppaalSMC.g:22:7: ( '<nta>' )
            // InternalUppaalSMC.g:22:9: '<nta>'
            {
            match("<nta>"); 


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
            // InternalUppaalSMC.g:23:7: ( '</nta>' )
            // InternalUppaalSMC.g:23:9: '</nta>'
            {
            match("</nta>"); 


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
            // InternalUppaalSMC.g:24:7: ( '=' )
            // InternalUppaalSMC.g:24:9: '='
            {
            match('='); 

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
            // InternalUppaalSMC.g:25:7: ( '<declaration>' )
            // InternalUppaalSMC.g:25:9: '<declaration>'
            {
            match("<declaration>"); 


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
            // InternalUppaalSMC.g:26:7: ( '</declaration>' )
            // InternalUppaalSMC.g:26:9: '</declaration>'
            {
            match("</declaration>"); 


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
            // InternalUppaalSMC.g:27:7: ( '<system>' )
            // InternalUppaalSMC.g:27:9: '<system>'
            {
            match("<system>"); 


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
            // InternalUppaalSMC.g:28:7: ( '</system>' )
            // InternalUppaalSMC.g:28:9: '</system>'
            {
            match("</system>"); 


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
            // InternalUppaalSMC.g:29:7: ( ';' )
            // InternalUppaalSMC.g:29:9: ';'
            {
            match(';'); 

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
            // InternalUppaalSMC.g:30:7: ( '(' )
            // InternalUppaalSMC.g:30:9: '('
            {
            match('('); 

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
            // InternalUppaalSMC.g:31:7: ( ',' )
            // InternalUppaalSMC.g:31:9: ','
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
            // InternalUppaalSMC.g:32:7: ( ')' )
            // InternalUppaalSMC.g:32:9: ')'
            {
            match(')'); 

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
            // InternalUppaalSMC.g:33:7: ( 'urgent' )
            // InternalUppaalSMC.g:33:9: 'urgent'
            {
            match("urgent"); 


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
            // InternalUppaalSMC.g:34:7: ( 'broadcast' )
            // InternalUppaalSMC.g:34:9: 'broadcast'
            {
            match("broadcast"); 


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
            // InternalUppaalSMC.g:35:7: ( '&amp;' )
            // InternalUppaalSMC.g:35:9: '&amp;'
            {
            match("&amp;"); 


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
            // InternalUppaalSMC.g:36:7: ( 'typedef' )
            // InternalUppaalSMC.g:36:9: 'typedef'
            {
            match("typedef"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:37:7: ( '[' )
            // InternalUppaalSMC.g:37:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:38:7: ( ']' )
            // InternalUppaalSMC.g:38:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:39:7: ( '{' )
            // InternalUppaalSMC.g:39:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:40:7: ( '}' )
            // InternalUppaalSMC.g:40:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:41:7: ( 'system' )
            // InternalUppaalSMC.g:41:9: 'system'
            {
            match("system"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:42:7: ( '&lt;' )
            // InternalUppaalSMC.g:42:9: '&lt;'
            {
            match("&lt;"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:43:7: ( 'progress' )
            // InternalUppaalSMC.g:43:9: 'progress'
            {
            match("progress"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:44:7: ( 'priority' )
            // InternalUppaalSMC.g:44:9: 'priority'
            {
            match("priority"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:45:7: ( '<' )
            // InternalUppaalSMC.g:45:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:46:7: ( 'default' )
            // InternalUppaalSMC.g:46:9: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:47:7: ( '<template>' )
            // InternalUppaalSMC.g:47:9: '<template>'
            {
            match("<template>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:48:7: ( '<name' )
            // InternalUppaalSMC.g:48:9: '<name'
            {
            match("<name"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:49:7: ( '</name>' )
            // InternalUppaalSMC.g:49:9: '</name>'
            {
            match("</name>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:50:7: ( '<parameter>' )
            // InternalUppaalSMC.g:50:9: '<parameter>'
            {
            match("<parameter>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:51:7: ( '</parameter>' )
            // InternalUppaalSMC.g:51:9: '</parameter>'
            {
            match("</parameter>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:52:7: ( '<init' )
            // InternalUppaalSMC.g:52:9: '<init'
            {
            match("<init"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:53:7: ( 'ref' )
            // InternalUppaalSMC.g:53:9: 'ref'
            {
            match("ref"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:54:7: ( '/>' )
            // InternalUppaalSMC.g:54:9: '/>'
            {
            match("/>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:55:7: ( '</template>' )
            // InternalUppaalSMC.g:55:9: '</template>'
            {
            match("</template>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:56:7: ( ':=' )
            // InternalUppaalSMC.g:56:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:57:7: ( '<branchpoint' )
            // InternalUppaalSMC.g:57:9: '<branchpoint'
            {
            match("<branchpoint"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:58:7: ( 'color' )
            // InternalUppaalSMC.g:58:9: 'color'
            {
            match("color"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:59:7: ( '</branchpoint>' )
            // InternalUppaalSMC.g:59:9: '</branchpoint>'
            {
            match("</branchpoint>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:60:7: ( '<location' )
            // InternalUppaalSMC.g:60:9: '<location'
            {
            match("<location"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:61:7: ( '<label' )
            // InternalUppaalSMC.g:61:9: '<label'
            {
            match("<label"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:62:7: ( 'kind=\"invariant\"' )
            // InternalUppaalSMC.g:62:9: 'kind=\"invariant\"'
            {
            match("kind=\"invariant\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:63:7: ( '</label>' )
            // InternalUppaalSMC.g:63:9: '</label>'
            {
            match("</label>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:64:7: ( '</location>' )
            // InternalUppaalSMC.g:64:9: '</location>'
            {
            match("</location>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:65:7: ( 'kind=\"exponentialrate\"' )
            // InternalUppaalSMC.g:65:9: 'kind=\"exponentialrate\"'
            {
            match("kind=\"exponentialrate\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:66:7: ( '<transition' )
            // InternalUppaalSMC.g:66:9: '<transition'
            {
            match("<transition"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:67:7: ( '<source' )
            // InternalUppaalSMC.g:67:9: '<source'
            {
            match("<source"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:68:7: ( '<target' )
            // InternalUppaalSMC.g:68:9: '<target'
            {
            match("<target"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:69:7: ( 'kind=\"select\"' )
            // InternalUppaalSMC.g:69:9: 'kind=\"select\"'
            {
            match("kind=\"select\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:70:7: ( 'kind=\"guard\"' )
            // InternalUppaalSMC.g:70:9: 'kind=\"guard\"'
            {
            match("kind=\"guard\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:71:7: ( 'kind=\"synchronisation\"' )
            // InternalUppaalSMC.g:71:9: 'kind=\"synchronisation\"'
            {
            match("kind=\"synchronisation\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:72:7: ( 'kind=\"assignment\"' )
            // InternalUppaalSMC.g:72:9: 'kind=\"assignment\"'
            {
            match("kind=\"assignment\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:73:7: ( '<nail' )
            // InternalUppaalSMC.g:73:9: '<nail'
            {
            match("<nail"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:74:7: ( '</transition>' )
            // InternalUppaalSMC.g:74:9: '</transition>'
            {
            match("</transition>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:75:7: ( 'kind=\"probability\"' )
            // InternalUppaalSMC.g:75:9: 'kind=\"probability\"'
            {
            match("kind=\"probability\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:76:7: ( ':' )
            // InternalUppaalSMC.g:76:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:77:7: ( 'scalar' )
            // InternalUppaalSMC.g:77:9: 'scalar'
            {
            match("scalar"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:78:7: ( 'struct' )
            // InternalUppaalSMC.g:78:9: 'struct'
            {
            match("struct"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:79:7: ( 'for' )
            // InternalUppaalSMC.g:79:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:80:7: ( 'while' )
            // InternalUppaalSMC.g:80:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:81:7: ( 'do' )
            // InternalUppaalSMC.g:81:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:82:7: ( 'if' )
            // InternalUppaalSMC.g:82:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:83:7: ( 'else' )
            // InternalUppaalSMC.g:83:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:84:7: ( 'return' )
            // InternalUppaalSMC.g:84:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:85:7: ( '?' )
            // InternalUppaalSMC.g:85:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:86:7: ( '!' )
            // InternalUppaalSMC.g:86:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:87:7: ( 'not' )
            // InternalUppaalSMC.g:87:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:88:7: ( '+' )
            // InternalUppaalSMC.g:88:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:89:7: ( '-' )
            // InternalUppaalSMC.g:89:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:90:7: ( '.' )
            // InternalUppaalSMC.g:90:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:91:7: ( 'true' )
            // InternalUppaalSMC.g:91:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:92:7: ( 'false' )
            // InternalUppaalSMC.g:92:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:93:7: ( '\\'' )
            // InternalUppaalSMC.g:93:9: '\\''
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:94:7: ( 'const' )
            // InternalUppaalSMC.g:94:9: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:95:8: ( 'meta' )
            // InternalUppaalSMC.g:95:10: 'meta'
            {
            match("meta"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:96:8: ( 'CALL_BY_REFERENCE' )
            // InternalUppaalSMC.g:96:10: 'CALL_BY_REFERENCE'
            {
            match("CALL_BY_REFERENCE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:97:8: ( '<urgent/>' )
            // InternalUppaalSMC.g:97:10: '<urgent/>'
            {
            match("<urgent/>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:98:8: ( '<committed/>' )
            // InternalUppaalSMC.g:98:10: '<committed/>'
            {
            match("<committed/>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:99:8: ( 'DEFAULT' )
            // InternalUppaalSMC.g:99:10: 'DEFAULT'
            {
            match("DEFAULT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:100:8: ( 'WHITE' )
            // InternalUppaalSMC.g:100:10: 'WHITE'
            {
            match("WHITE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:101:8: ( 'LIGHTGREY' )
            // InternalUppaalSMC.g:101:10: 'LIGHTGREY'
            {
            match("LIGHTGREY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:102:8: ( 'DARKGREY' )
            // InternalUppaalSMC.g:102:10: 'DARKGREY'
            {
            match("DARKGREY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:103:8: ( 'BLACK' )
            // InternalUppaalSMC.g:103:10: 'BLACK'
            {
            match("BLACK"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:104:8: ( 'BLUE' )
            // InternalUppaalSMC.g:104:10: 'BLUE'
            {
            match("BLUE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:105:8: ( 'CYAN' )
            // InternalUppaalSMC.g:105:10: 'CYAN'
            {
            match("CYAN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:106:8: ( 'GREEN' )
            // InternalUppaalSMC.g:106:10: 'GREEN'
            {
            match("GREEN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:107:8: ( 'MAGENTA' )
            // InternalUppaalSMC.g:107:10: 'MAGENTA'
            {
            match("MAGENTA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:108:8: ( 'ORANGE' )
            // InternalUppaalSMC.g:108:10: 'ORANGE'
            {
            match("ORANGE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:109:8: ( 'PINK' )
            // InternalUppaalSMC.g:109:10: 'PINK'
            {
            match("PINK"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:110:8: ( 'RED' )
            // InternalUppaalSMC.g:110:10: 'RED'
            {
            match("RED"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:111:8: ( 'YELLOW' )
            // InternalUppaalSMC.g:111:10: 'YELLOW'
            {
            match("YELLOW"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:112:8: ( 'SELF_DEFINED' )
            // InternalUppaalSMC.g:112:10: 'SELF_DEFINED'
            {
            match("SELF_DEFINED"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:113:8: ( 'exists' )
            // InternalUppaalSMC.g:113:10: 'exists'
            {
            match("exists"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__118"

    // $ANTLR start "T__119"
    public final void mT__119() throws RecognitionException {
        try {
            int _type = T__119;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:114:8: ( 'forall' )
            // InternalUppaalSMC.g:114:10: 'forall'
            {
            match("forall"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__119"

    // $ANTLR start "T__120"
    public final void mT__120() throws RecognitionException {
        try {
            int _type = T__120;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:115:8: ( '+=' )
            // InternalUppaalSMC.g:115:10: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__120"

    // $ANTLR start "T__121"
    public final void mT__121() throws RecognitionException {
        try {
            int _type = T__121;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:116:8: ( '-=' )
            // InternalUppaalSMC.g:116:10: '-='
            {
            match("-="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__121"

    // $ANTLR start "T__122"
    public final void mT__122() throws RecognitionException {
        try {
            int _type = T__122;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:117:8: ( '*=' )
            // InternalUppaalSMC.g:117:10: '*='
            {
            match("*="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__122"

    // $ANTLR start "T__123"
    public final void mT__123() throws RecognitionException {
        try {
            int _type = T__123;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:118:8: ( '/=' )
            // InternalUppaalSMC.g:118:10: '/='
            {
            match("/="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__123"

    // $ANTLR start "T__124"
    public final void mT__124() throws RecognitionException {
        try {
            int _type = T__124;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:119:8: ( '%=' )
            // InternalUppaalSMC.g:119:10: '%='
            {
            match("%="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__124"

    // $ANTLR start "T__125"
    public final void mT__125() throws RecognitionException {
        try {
            int _type = T__125;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:120:8: ( '&amp;=' )
            // InternalUppaalSMC.g:120:10: '&amp;='
            {
            match("&amp;="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__125"

    // $ANTLR start "T__126"
    public final void mT__126() throws RecognitionException {
        try {
            int _type = T__126;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:121:8: ( '|=' )
            // InternalUppaalSMC.g:121:10: '|='
            {
            match("|="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__126"

    // $ANTLR start "T__127"
    public final void mT__127() throws RecognitionException {
        try {
            int _type = T__127;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:122:8: ( '&lt;&lt;=' )
            // InternalUppaalSMC.g:122:10: '&lt;&lt;='
            {
            match("&lt;&lt;="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__127"

    // $ANTLR start "T__128"
    public final void mT__128() throws RecognitionException {
        try {
            int _type = T__128;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:123:8: ( '&gt;&gt;=' )
            // InternalUppaalSMC.g:123:10: '&gt;&gt;='
            {
            match("&gt;&gt;="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__128"

    // $ANTLR start "T__129"
    public final void mT__129() throws RecognitionException {
        try {
            int _type = T__129;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:124:8: ( '^=' )
            // InternalUppaalSMC.g:124:10: '^='
            {
            match("^="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__129"

    // $ANTLR start "T__130"
    public final void mT__130() throws RecognitionException {
        try {
            int _type = T__130;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:125:8: ( 'or' )
            // InternalUppaalSMC.g:125:10: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__130"

    // $ANTLR start "T__131"
    public final void mT__131() throws RecognitionException {
        try {
            int _type = T__131;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:126:8: ( '||' )
            // InternalUppaalSMC.g:126:10: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__131"

    // $ANTLR start "T__132"
    public final void mT__132() throws RecognitionException {
        try {
            int _type = T__132;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:127:8: ( 'imply' )
            // InternalUppaalSMC.g:127:10: 'imply'
            {
            match("imply"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__132"

    // $ANTLR start "T__133"
    public final void mT__133() throws RecognitionException {
        try {
            int _type = T__133;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:128:8: ( 'and' )
            // InternalUppaalSMC.g:128:10: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__133"

    // $ANTLR start "T__134"
    public final void mT__134() throws RecognitionException {
        try {
            int _type = T__134;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:129:8: ( '&amp;&amp;' )
            // InternalUppaalSMC.g:129:10: '&amp;&amp;'
            {
            match("&amp;&amp;"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__134"

    // $ANTLR start "T__135"
    public final void mT__135() throws RecognitionException {
        try {
            int _type = T__135;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:130:8: ( '|' )
            // InternalUppaalSMC.g:130:10: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__135"

    // $ANTLR start "T__136"
    public final void mT__136() throws RecognitionException {
        try {
            int _type = T__136;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:131:8: ( '^' )
            // InternalUppaalSMC.g:131:10: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__136"

    // $ANTLR start "T__137"
    public final void mT__137() throws RecognitionException {
        try {
            int _type = T__137;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:132:8: ( '==' )
            // InternalUppaalSMC.g:132:10: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__137"

    // $ANTLR start "T__138"
    public final void mT__138() throws RecognitionException {
        try {
            int _type = T__138;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:133:8: ( '!=' )
            // InternalUppaalSMC.g:133:10: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__138"

    // $ANTLR start "T__139"
    public final void mT__139() throws RecognitionException {
        try {
            int _type = T__139;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:134:8: ( '&gt;' )
            // InternalUppaalSMC.g:134:10: '&gt;'
            {
            match("&gt;"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__139"

    // $ANTLR start "T__140"
    public final void mT__140() throws RecognitionException {
        try {
            int _type = T__140;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:135:8: ( '&gt;=' )
            // InternalUppaalSMC.g:135:10: '&gt;='
            {
            match("&gt;="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__140"

    // $ANTLR start "T__141"
    public final void mT__141() throws RecognitionException {
        try {
            int _type = T__141;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:136:8: ( '&lt;=' )
            // InternalUppaalSMC.g:136:10: '&lt;='
            {
            match("&lt;="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__141"

    // $ANTLR start "T__142"
    public final void mT__142() throws RecognitionException {
        try {
            int _type = T__142;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:137:8: ( '&lt;?' )
            // InternalUppaalSMC.g:137:10: '&lt;?'
            {
            match("&lt;?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__142"

    // $ANTLR start "T__143"
    public final void mT__143() throws RecognitionException {
        try {
            int _type = T__143;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:138:8: ( '&gt;?' )
            // InternalUppaalSMC.g:138:10: '&gt;?'
            {
            match("&gt;?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__143"

    // $ANTLR start "T__144"
    public final void mT__144() throws RecognitionException {
        try {
            int _type = T__144;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:139:8: ( '&lt;&lt;' )
            // InternalUppaalSMC.g:139:10: '&lt;&lt;'
            {
            match("&lt;&lt;"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__144"

    // $ANTLR start "T__145"
    public final void mT__145() throws RecognitionException {
        try {
            int _type = T__145;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:140:8: ( '&gt;&gt;' )
            // InternalUppaalSMC.g:140:10: '&gt;&gt;'
            {
            match("&gt;&gt;"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__145"

    // $ANTLR start "T__146"
    public final void mT__146() throws RecognitionException {
        try {
            int _type = T__146;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:141:8: ( '*' )
            // InternalUppaalSMC.g:141:10: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__146"

    // $ANTLR start "T__147"
    public final void mT__147() throws RecognitionException {
        try {
            int _type = T__147;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:142:8: ( '/' )
            // InternalUppaalSMC.g:142:10: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__147"

    // $ANTLR start "T__148"
    public final void mT__148() throws RecognitionException {
        try {
            int _type = T__148;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:143:8: ( '%' )
            // InternalUppaalSMC.g:143:10: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__148"

    // $ANTLR start "T__149"
    public final void mT__149() throws RecognitionException {
        try {
            int _type = T__149;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:144:8: ( '++' )
            // InternalUppaalSMC.g:144:10: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__149"

    // $ANTLR start "T__150"
    public final void mT__150() throws RecognitionException {
        try {
            int _type = T__150;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:145:8: ( '--' )
            // InternalUppaalSMC.g:145:10: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__150"

    // $ANTLR start "RULE_QUERIES"
    public final void mRULE_QUERIES() throws RecognitionException {
        try {
            int _type = RULE_QUERIES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:8986:14: ( '<queries>' ( options {greedy=false; } : . )* '</queries>' )
            // InternalUppaalSMC.g:8986:16: '<queries>' ( options {greedy=false; } : . )* '</queries>'
            {
            match("<queries>"); 

            // InternalUppaalSMC.g:8986:28: ( options {greedy=false; } : . )*
            loop1:
            do {
                int alt1=2;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // InternalUppaalSMC.g:8986:56: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match("</queries>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_QUERIES"

    // $ANTLR start "RULE_INT_STR"
    public final void mRULE_INT_STR() throws RecognitionException {
        try {
            int _type = RULE_INT_STR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:8988:14: ( ( '0' .. '9' )+ )
            // InternalUppaalSMC.g:8988:16: ( '0' .. '9' )+
            {
            // InternalUppaalSMC.g:8988:16: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalUppaalSMC.g:8988:17: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT_STR"

    // $ANTLR start "RULE_DOUBLE_STR"
    public final void mRULE_DOUBLE_STR() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE_STR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:8990:17: ( RULE_INT_STR '.' RULE_INT_STR )
            // InternalUppaalSMC.g:8990:19: RULE_INT_STR '.' RULE_INT_STR
            {
            mRULE_INT_STR(); 
            match('.'); 
            mRULE_INT_STR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE_STR"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:8992:13: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalUppaalSMC.g:8992:15: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalUppaalSMC.g:8992:19: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\\') ) {
                    alt3=1;
                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFF')) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalUppaalSMC.g:8992:20: '\\\\' .
            	    {
            	    match('\\'); 
            	    matchAny(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalUppaalSMC.g:8992:27: ~ ( ( '\\\\' | '\"' ) )
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
            	    break loop3;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_CLOCK"
    public final void mRULE_CLOCK() throws RecognitionException {
        try {
            int _type = RULE_CLOCK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:8994:12: ( 'clock' )
            // InternalUppaalSMC.g:8994:14: 'clock'
            {
            match("clock"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CLOCK"

    // $ANTLR start "RULE_CHAN"
    public final void mRULE_CHAN() throws RecognitionException {
        try {
            int _type = RULE_CHAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:8996:11: ( 'chan' )
            // InternalUppaalSMC.g:8996:13: 'chan'
            {
            match("chan"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CHAN"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:8998:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalUppaalSMC.g:8998:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalUppaalSMC.g:8998:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalUppaalSMC.g:8998:11: '^'
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

            // InternalUppaalSMC.g:8998:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalUppaalSMC.g:
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
            // InternalUppaalSMC.g:9000:10: ( ( '0' .. '9' )+ )
            // InternalUppaalSMC.g:9000:12: ( '0' .. '9' )+
            {
            // InternalUppaalSMC.g:9000:12: ( '0' .. '9' )+
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
            	    // InternalUppaalSMC.g:9000:13: '0' .. '9'
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

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:9002:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalUppaalSMC.g:9002:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalUppaalSMC.g:9002:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalUppaalSMC.g:9002:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
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

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:9004:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalUppaalSMC.g:9004:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalUppaalSMC.g:9004:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalUppaalSMC.g:9004:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop8;
                }
            } while (true);

            // InternalUppaalSMC.g:9004:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalUppaalSMC.g:9004:41: ( '\\r' )? '\\n'
                    {
                    // InternalUppaalSMC.g:9004:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalUppaalSMC.g:9004:41: '\\r'
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

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUppaalSMC.g:9006:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalUppaalSMC.g:9006:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalUppaalSMC.g:9006:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalUppaalSMC.g:
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
            // InternalUppaalSMC.g:9008:16: ( . )
            // InternalUppaalSMC.g:9008:18: .
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
        // InternalUppaalSMC.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | RULE_QUERIES | RULE_INT_STR | RULE_DOUBLE_STR | RULE_STRING | RULE_CLOCK | RULE_CHAN | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=147;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalUppaalSMC.g:1:10: T__16
                {
                mT__16(); 

                }
                break;
            case 2 :
                // InternalUppaalSMC.g:1:16: T__17
                {
                mT__17(); 

                }
                break;
            case 3 :
                // InternalUppaalSMC.g:1:22: T__18
                {
                mT__18(); 

                }
                break;
            case 4 :
                // InternalUppaalSMC.g:1:28: T__19
                {
                mT__19(); 

                }
                break;
            case 5 :
                // InternalUppaalSMC.g:1:34: T__20
                {
                mT__20(); 

                }
                break;
            case 6 :
                // InternalUppaalSMC.g:1:40: T__21
                {
                mT__21(); 

                }
                break;
            case 7 :
                // InternalUppaalSMC.g:1:46: T__22
                {
                mT__22(); 

                }
                break;
            case 8 :
                // InternalUppaalSMC.g:1:52: T__23
                {
                mT__23(); 

                }
                break;
            case 9 :
                // InternalUppaalSMC.g:1:58: T__24
                {
                mT__24(); 

                }
                break;
            case 10 :
                // InternalUppaalSMC.g:1:64: T__25
                {
                mT__25(); 

                }
                break;
            case 11 :
                // InternalUppaalSMC.g:1:70: T__26
                {
                mT__26(); 

                }
                break;
            case 12 :
                // InternalUppaalSMC.g:1:76: T__27
                {
                mT__27(); 

                }
                break;
            case 13 :
                // InternalUppaalSMC.g:1:82: T__28
                {
                mT__28(); 

                }
                break;
            case 14 :
                // InternalUppaalSMC.g:1:88: T__29
                {
                mT__29(); 

                }
                break;
            case 15 :
                // InternalUppaalSMC.g:1:94: T__30
                {
                mT__30(); 

                }
                break;
            case 16 :
                // InternalUppaalSMC.g:1:100: T__31
                {
                mT__31(); 

                }
                break;
            case 17 :
                // InternalUppaalSMC.g:1:106: T__32
                {
                mT__32(); 

                }
                break;
            case 18 :
                // InternalUppaalSMC.g:1:112: T__33
                {
                mT__33(); 

                }
                break;
            case 19 :
                // InternalUppaalSMC.g:1:118: T__34
                {
                mT__34(); 

                }
                break;
            case 20 :
                // InternalUppaalSMC.g:1:124: T__35
                {
                mT__35(); 

                }
                break;
            case 21 :
                // InternalUppaalSMC.g:1:130: T__36
                {
                mT__36(); 

                }
                break;
            case 22 :
                // InternalUppaalSMC.g:1:136: T__37
                {
                mT__37(); 

                }
                break;
            case 23 :
                // InternalUppaalSMC.g:1:142: T__38
                {
                mT__38(); 

                }
                break;
            case 24 :
                // InternalUppaalSMC.g:1:148: T__39
                {
                mT__39(); 

                }
                break;
            case 25 :
                // InternalUppaalSMC.g:1:154: T__40
                {
                mT__40(); 

                }
                break;
            case 26 :
                // InternalUppaalSMC.g:1:160: T__41
                {
                mT__41(); 

                }
                break;
            case 27 :
                // InternalUppaalSMC.g:1:166: T__42
                {
                mT__42(); 

                }
                break;
            case 28 :
                // InternalUppaalSMC.g:1:172: T__43
                {
                mT__43(); 

                }
                break;
            case 29 :
                // InternalUppaalSMC.g:1:178: T__44
                {
                mT__44(); 

                }
                break;
            case 30 :
                // InternalUppaalSMC.g:1:184: T__45
                {
                mT__45(); 

                }
                break;
            case 31 :
                // InternalUppaalSMC.g:1:190: T__46
                {
                mT__46(); 

                }
                break;
            case 32 :
                // InternalUppaalSMC.g:1:196: T__47
                {
                mT__47(); 

                }
                break;
            case 33 :
                // InternalUppaalSMC.g:1:202: T__48
                {
                mT__48(); 

                }
                break;
            case 34 :
                // InternalUppaalSMC.g:1:208: T__49
                {
                mT__49(); 

                }
                break;
            case 35 :
                // InternalUppaalSMC.g:1:214: T__50
                {
                mT__50(); 

                }
                break;
            case 36 :
                // InternalUppaalSMC.g:1:220: T__51
                {
                mT__51(); 

                }
                break;
            case 37 :
                // InternalUppaalSMC.g:1:226: T__52
                {
                mT__52(); 

                }
                break;
            case 38 :
                // InternalUppaalSMC.g:1:232: T__53
                {
                mT__53(); 

                }
                break;
            case 39 :
                // InternalUppaalSMC.g:1:238: T__54
                {
                mT__54(); 

                }
                break;
            case 40 :
                // InternalUppaalSMC.g:1:244: T__55
                {
                mT__55(); 

                }
                break;
            case 41 :
                // InternalUppaalSMC.g:1:250: T__56
                {
                mT__56(); 

                }
                break;
            case 42 :
                // InternalUppaalSMC.g:1:256: T__57
                {
                mT__57(); 

                }
                break;
            case 43 :
                // InternalUppaalSMC.g:1:262: T__58
                {
                mT__58(); 

                }
                break;
            case 44 :
                // InternalUppaalSMC.g:1:268: T__59
                {
                mT__59(); 

                }
                break;
            case 45 :
                // InternalUppaalSMC.g:1:274: T__60
                {
                mT__60(); 

                }
                break;
            case 46 :
                // InternalUppaalSMC.g:1:280: T__61
                {
                mT__61(); 

                }
                break;
            case 47 :
                // InternalUppaalSMC.g:1:286: T__62
                {
                mT__62(); 

                }
                break;
            case 48 :
                // InternalUppaalSMC.g:1:292: T__63
                {
                mT__63(); 

                }
                break;
            case 49 :
                // InternalUppaalSMC.g:1:298: T__64
                {
                mT__64(); 

                }
                break;
            case 50 :
                // InternalUppaalSMC.g:1:304: T__65
                {
                mT__65(); 

                }
                break;
            case 51 :
                // InternalUppaalSMC.g:1:310: T__66
                {
                mT__66(); 

                }
                break;
            case 52 :
                // InternalUppaalSMC.g:1:316: T__67
                {
                mT__67(); 

                }
                break;
            case 53 :
                // InternalUppaalSMC.g:1:322: T__68
                {
                mT__68(); 

                }
                break;
            case 54 :
                // InternalUppaalSMC.g:1:328: T__69
                {
                mT__69(); 

                }
                break;
            case 55 :
                // InternalUppaalSMC.g:1:334: T__70
                {
                mT__70(); 

                }
                break;
            case 56 :
                // InternalUppaalSMC.g:1:340: T__71
                {
                mT__71(); 

                }
                break;
            case 57 :
                // InternalUppaalSMC.g:1:346: T__72
                {
                mT__72(); 

                }
                break;
            case 58 :
                // InternalUppaalSMC.g:1:352: T__73
                {
                mT__73(); 

                }
                break;
            case 59 :
                // InternalUppaalSMC.g:1:358: T__74
                {
                mT__74(); 

                }
                break;
            case 60 :
                // InternalUppaalSMC.g:1:364: T__75
                {
                mT__75(); 

                }
                break;
            case 61 :
                // InternalUppaalSMC.g:1:370: T__76
                {
                mT__76(); 

                }
                break;
            case 62 :
                // InternalUppaalSMC.g:1:376: T__77
                {
                mT__77(); 

                }
                break;
            case 63 :
                // InternalUppaalSMC.g:1:382: T__78
                {
                mT__78(); 

                }
                break;
            case 64 :
                // InternalUppaalSMC.g:1:388: T__79
                {
                mT__79(); 

                }
                break;
            case 65 :
                // InternalUppaalSMC.g:1:394: T__80
                {
                mT__80(); 

                }
                break;
            case 66 :
                // InternalUppaalSMC.g:1:400: T__81
                {
                mT__81(); 

                }
                break;
            case 67 :
                // InternalUppaalSMC.g:1:406: T__82
                {
                mT__82(); 

                }
                break;
            case 68 :
                // InternalUppaalSMC.g:1:412: T__83
                {
                mT__83(); 

                }
                break;
            case 69 :
                // InternalUppaalSMC.g:1:418: T__84
                {
                mT__84(); 

                }
                break;
            case 70 :
                // InternalUppaalSMC.g:1:424: T__85
                {
                mT__85(); 

                }
                break;
            case 71 :
                // InternalUppaalSMC.g:1:430: T__86
                {
                mT__86(); 

                }
                break;
            case 72 :
                // InternalUppaalSMC.g:1:436: T__87
                {
                mT__87(); 

                }
                break;
            case 73 :
                // InternalUppaalSMC.g:1:442: T__88
                {
                mT__88(); 

                }
                break;
            case 74 :
                // InternalUppaalSMC.g:1:448: T__89
                {
                mT__89(); 

                }
                break;
            case 75 :
                // InternalUppaalSMC.g:1:454: T__90
                {
                mT__90(); 

                }
                break;
            case 76 :
                // InternalUppaalSMC.g:1:460: T__91
                {
                mT__91(); 

                }
                break;
            case 77 :
                // InternalUppaalSMC.g:1:466: T__92
                {
                mT__92(); 

                }
                break;
            case 78 :
                // InternalUppaalSMC.g:1:472: T__93
                {
                mT__93(); 

                }
                break;
            case 79 :
                // InternalUppaalSMC.g:1:478: T__94
                {
                mT__94(); 

                }
                break;
            case 80 :
                // InternalUppaalSMC.g:1:484: T__95
                {
                mT__95(); 

                }
                break;
            case 81 :
                // InternalUppaalSMC.g:1:490: T__96
                {
                mT__96(); 

                }
                break;
            case 82 :
                // InternalUppaalSMC.g:1:496: T__97
                {
                mT__97(); 

                }
                break;
            case 83 :
                // InternalUppaalSMC.g:1:502: T__98
                {
                mT__98(); 

                }
                break;
            case 84 :
                // InternalUppaalSMC.g:1:508: T__99
                {
                mT__99(); 

                }
                break;
            case 85 :
                // InternalUppaalSMC.g:1:514: T__100
                {
                mT__100(); 

                }
                break;
            case 86 :
                // InternalUppaalSMC.g:1:521: T__101
                {
                mT__101(); 

                }
                break;
            case 87 :
                // InternalUppaalSMC.g:1:528: T__102
                {
                mT__102(); 

                }
                break;
            case 88 :
                // InternalUppaalSMC.g:1:535: T__103
                {
                mT__103(); 

                }
                break;
            case 89 :
                // InternalUppaalSMC.g:1:542: T__104
                {
                mT__104(); 

                }
                break;
            case 90 :
                // InternalUppaalSMC.g:1:549: T__105
                {
                mT__105(); 

                }
                break;
            case 91 :
                // InternalUppaalSMC.g:1:556: T__106
                {
                mT__106(); 

                }
                break;
            case 92 :
                // InternalUppaalSMC.g:1:563: T__107
                {
                mT__107(); 

                }
                break;
            case 93 :
                // InternalUppaalSMC.g:1:570: T__108
                {
                mT__108(); 

                }
                break;
            case 94 :
                // InternalUppaalSMC.g:1:577: T__109
                {
                mT__109(); 

                }
                break;
            case 95 :
                // InternalUppaalSMC.g:1:584: T__110
                {
                mT__110(); 

                }
                break;
            case 96 :
                // InternalUppaalSMC.g:1:591: T__111
                {
                mT__111(); 

                }
                break;
            case 97 :
                // InternalUppaalSMC.g:1:598: T__112
                {
                mT__112(); 

                }
                break;
            case 98 :
                // InternalUppaalSMC.g:1:605: T__113
                {
                mT__113(); 

                }
                break;
            case 99 :
                // InternalUppaalSMC.g:1:612: T__114
                {
                mT__114(); 

                }
                break;
            case 100 :
                // InternalUppaalSMC.g:1:619: T__115
                {
                mT__115(); 

                }
                break;
            case 101 :
                // InternalUppaalSMC.g:1:626: T__116
                {
                mT__116(); 

                }
                break;
            case 102 :
                // InternalUppaalSMC.g:1:633: T__117
                {
                mT__117(); 

                }
                break;
            case 103 :
                // InternalUppaalSMC.g:1:640: T__118
                {
                mT__118(); 

                }
                break;
            case 104 :
                // InternalUppaalSMC.g:1:647: T__119
                {
                mT__119(); 

                }
                break;
            case 105 :
                // InternalUppaalSMC.g:1:654: T__120
                {
                mT__120(); 

                }
                break;
            case 106 :
                // InternalUppaalSMC.g:1:661: T__121
                {
                mT__121(); 

                }
                break;
            case 107 :
                // InternalUppaalSMC.g:1:668: T__122
                {
                mT__122(); 

                }
                break;
            case 108 :
                // InternalUppaalSMC.g:1:675: T__123
                {
                mT__123(); 

                }
                break;
            case 109 :
                // InternalUppaalSMC.g:1:682: T__124
                {
                mT__124(); 

                }
                break;
            case 110 :
                // InternalUppaalSMC.g:1:689: T__125
                {
                mT__125(); 

                }
                break;
            case 111 :
                // InternalUppaalSMC.g:1:696: T__126
                {
                mT__126(); 

                }
                break;
            case 112 :
                // InternalUppaalSMC.g:1:703: T__127
                {
                mT__127(); 

                }
                break;
            case 113 :
                // InternalUppaalSMC.g:1:710: T__128
                {
                mT__128(); 

                }
                break;
            case 114 :
                // InternalUppaalSMC.g:1:717: T__129
                {
                mT__129(); 

                }
                break;
            case 115 :
                // InternalUppaalSMC.g:1:724: T__130
                {
                mT__130(); 

                }
                break;
            case 116 :
                // InternalUppaalSMC.g:1:731: T__131
                {
                mT__131(); 

                }
                break;
            case 117 :
                // InternalUppaalSMC.g:1:738: T__132
                {
                mT__132(); 

                }
                break;
            case 118 :
                // InternalUppaalSMC.g:1:745: T__133
                {
                mT__133(); 

                }
                break;
            case 119 :
                // InternalUppaalSMC.g:1:752: T__134
                {
                mT__134(); 

                }
                break;
            case 120 :
                // InternalUppaalSMC.g:1:759: T__135
                {
                mT__135(); 

                }
                break;
            case 121 :
                // InternalUppaalSMC.g:1:766: T__136
                {
                mT__136(); 

                }
                break;
            case 122 :
                // InternalUppaalSMC.g:1:773: T__137
                {
                mT__137(); 

                }
                break;
            case 123 :
                // InternalUppaalSMC.g:1:780: T__138
                {
                mT__138(); 

                }
                break;
            case 124 :
                // InternalUppaalSMC.g:1:787: T__139
                {
                mT__139(); 

                }
                break;
            case 125 :
                // InternalUppaalSMC.g:1:794: T__140
                {
                mT__140(); 

                }
                break;
            case 126 :
                // InternalUppaalSMC.g:1:801: T__141
                {
                mT__141(); 

                }
                break;
            case 127 :
                // InternalUppaalSMC.g:1:808: T__142
                {
                mT__142(); 

                }
                break;
            case 128 :
                // InternalUppaalSMC.g:1:815: T__143
                {
                mT__143(); 

                }
                break;
            case 129 :
                // InternalUppaalSMC.g:1:822: T__144
                {
                mT__144(); 

                }
                break;
            case 130 :
                // InternalUppaalSMC.g:1:829: T__145
                {
                mT__145(); 

                }
                break;
            case 131 :
                // InternalUppaalSMC.g:1:836: T__146
                {
                mT__146(); 

                }
                break;
            case 132 :
                // InternalUppaalSMC.g:1:843: T__147
                {
                mT__147(); 

                }
                break;
            case 133 :
                // InternalUppaalSMC.g:1:850: T__148
                {
                mT__148(); 

                }
                break;
            case 134 :
                // InternalUppaalSMC.g:1:857: T__149
                {
                mT__149(); 

                }
                break;
            case 135 :
                // InternalUppaalSMC.g:1:864: T__150
                {
                mT__150(); 

                }
                break;
            case 136 :
                // InternalUppaalSMC.g:1:871: RULE_QUERIES
                {
                mRULE_QUERIES(); 

                }
                break;
            case 137 :
                // InternalUppaalSMC.g:1:884: RULE_INT_STR
                {
                mRULE_INT_STR(); 

                }
                break;
            case 138 :
                // InternalUppaalSMC.g:1:897: RULE_DOUBLE_STR
                {
                mRULE_DOUBLE_STR(); 

                }
                break;
            case 139 :
                // InternalUppaalSMC.g:1:913: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 140 :
                // InternalUppaalSMC.g:1:925: RULE_CLOCK
                {
                mRULE_CLOCK(); 

                }
                break;
            case 141 :
                // InternalUppaalSMC.g:1:936: RULE_CHAN
                {
                mRULE_CHAN(); 

                }
                break;
            case 142 :
                // InternalUppaalSMC.g:1:946: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 143 :
                // InternalUppaalSMC.g:1:954: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 144 :
                // InternalUppaalSMC.g:1:963: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 145 :
                // InternalUppaalSMC.g:1:979: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 146 :
                // InternalUppaalSMC.g:1:995: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 147 :
                // InternalUppaalSMC.g:1:1003: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA1_eotS =
        "\14\uffff";
    static final String DFA1_eofS =
        "\14\uffff";
    static final String DFA1_minS =
        "\2\0\1\uffff\10\0\1\uffff";
    static final String DFA1_maxS =
        "\2\uffff\1\uffff\10\uffff\1\uffff";
    static final String DFA1_acceptS =
        "\2\uffff\1\1\10\uffff\1\2";
    static final String DFA1_specialS =
        "\1\0\1\1\1\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\uffff}>";
    static final String[] DFA1_transitionS = {
            "\74\2\1\1\uffc3\2",
            "\57\2\1\3\uffd0\2",
            "",
            "\161\2\1\4\uff8e\2",
            "\165\2\1\5\uff8a\2",
            "\145\2\1\6\uff9a\2",
            "\162\2\1\7\uff8d\2",
            "\151\2\1\10\uff96\2",
            "\145\2\1\11\uff9a\2",
            "\163\2\1\12\uff8c\2",
            "\76\2\1\13\uffc1\2",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "()* loopback of 8986:28: ( options {greedy=false; } : . )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA1_0 = input.LA(1);

                        s = -1;
                        if ( (LA1_0=='<') ) {s = 1;}

                        else if ( ((LA1_0>='\u0000' && LA1_0<=';')||(LA1_0>='=' && LA1_0<='\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_1 = input.LA(1);

                        s = -1;
                        if ( (LA1_1=='/') ) {s = 3;}

                        else if ( ((LA1_1>='\u0000' && LA1_1<='.')||(LA1_1>='0' && LA1_1<='\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA1_3 = input.LA(1);

                        s = -1;
                        if ( (LA1_3=='q') ) {s = 4;}

                        else if ( ((LA1_3>='\u0000' && LA1_3<='p')||(LA1_3>='r' && LA1_3<='\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA1_4 = input.LA(1);

                        s = -1;
                        if ( (LA1_4=='u') ) {s = 5;}

                        else if ( ((LA1_4>='\u0000' && LA1_4<='t')||(LA1_4>='v' && LA1_4<='\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA1_5 = input.LA(1);

                        s = -1;
                        if ( (LA1_5=='e') ) {s = 6;}

                        else if ( ((LA1_5>='\u0000' && LA1_5<='d')||(LA1_5>='f' && LA1_5<='\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA1_6 = input.LA(1);

                        s = -1;
                        if ( (LA1_6=='r') ) {s = 7;}

                        else if ( ((LA1_6>='\u0000' && LA1_6<='q')||(LA1_6>='s' && LA1_6<='\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA1_7 = input.LA(1);

                        s = -1;
                        if ( (LA1_7=='i') ) {s = 8;}

                        else if ( ((LA1_7>='\u0000' && LA1_7<='h')||(LA1_7>='j' && LA1_7<='\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA1_8 = input.LA(1);

                        s = -1;
                        if ( (LA1_8=='e') ) {s = 9;}

                        else if ( ((LA1_8>='\u0000' && LA1_8<='d')||(LA1_8>='f' && LA1_8<='\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA1_9 = input.LA(1);

                        s = -1;
                        if ( (LA1_9=='s') ) {s = 10;}

                        else if ( ((LA1_9>='\u0000' && LA1_9<='r')||(LA1_9>='t' && LA1_9<='\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA1_10 = input.LA(1);

                        s = -1;
                        if ( (LA1_10=='>') ) {s = 11;}

                        else if ( ((LA1_10>='\u0000' && LA1_10<='=')||(LA1_10>='?' && LA1_10<='\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 1, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA12_eotS =
        "\1\uffff\1\115\2\117\1\125\3\117\1\133\1\uffff\1\137\4\uffff\2\117\1\76\1\117\4\uffff\4\117\1\172\1\174\5\117\1\uffff\1\u0088\1\117\1\u008c\1\u008f\1\uffff\14\117\1\u00a0\1\u00a2\1\u00a5\1\u00a7\2\117\1\133\1\76\22\uffff\1\117\1\uffff\3\117\3\uffff\4\117\2\uffff\1\133\7\uffff\2\117\3\uffff\2\117\4\uffff\5\117\1\u00d3\1\117\7\uffff\7\117\1\u00de\1\117\3\uffff\1\117\7\uffff\16\117\11\uffff\1\u00f0\1\117\23\uffff\10\117\1\u00aa\2\117\3\uffff\10\117\1\uffff\1\u0110\6\117\1\u0118\2\117\1\uffff\1\117\1\u011c\15\117\1\u012a\1\117\1\uffff\1\u012c\10\uffff\2\117\1\u012f\2\117\1\u0132\2\117\1\uffff\2\117\1\uffff\1\u013b\1\u013f\1\117\1\u0141\6\117\1\uffff\4\117\1\u014c\2\117\1\uffff\3\117\1\uffff\1\u0152\1\117\1\u0154\5\117\1\u015a\3\117\1\u015e\1\uffff\1\117\1\uffff\2\117\1\uffff\1\117\2\uffff\4\117\1\u0169\10\uffff\1\117\1\uffff\7\117\1\u0174\1\u0175\1\u0176\2\uffff\1\117\1\u0179\1\u017a\1\u017b\1\uffff\1\117\1\uffff\2\117\1\u017f\1\117\1\u0181\1\uffff\1\u0182\2\117\1\uffff\3\117\1\u0188\1\u0189\1\117\1\u018b\1\117\5\uffff\1\117\1\u0190\1\u0191\1\u0192\3\117\1\u0196\4\uffff\1\u019d\3\uffff\3\117\1\uffff\1\117\2\uffff\1\117\1\u01a3\1\u01a4\2\117\2\uffff\1\117\1\uffff\1\117\2\uffff\1\u01ab\3\uffff\2\117\1\u01ae\10\uffff\1\117\1\u01b2\2\117\1\u01b5\3\uffff\3\117\1\u01ba\1\u01bc\1\uffff\1\u01bd\1\u01be\3\uffff\1\117\1\uffff\1\u01c0\1\117\2\uffff\1\117\1\u01c3\6\uffff\1\117\1\uffff\1\u01c5\1\117\1\uffff\1\117\1\uffff\2\117\1\u01ca\1\117\1\uffff\4\117\1\u01d0\1\uffff";
    static final String DFA12_eofS =
        "\u01d1\uffff";
    static final String DFA12_minS =
        "\1\0\1\41\1\145\1\154\1\55\1\145\1\154\1\105\1\56\1\uffff\1\75\4\uffff\2\162\1\141\1\162\4\uffff\1\143\1\162\2\145\1\52\1\75\1\150\1\151\1\141\1\150\1\146\1\uffff\1\75\1\157\1\53\1\55\1\uffff\1\145\2\101\1\110\1\111\1\114\1\122\1\101\1\122\1\111\2\105\4\75\1\162\1\156\1\56\1\0\5\uffff\1\141\1\142\1\uffff\1\157\1\141\3\uffff\1\141\4\uffff\1\162\1\uffff\1\143\1\163\1\151\3\uffff\2\141\1\163\1\114\1\60\1\uffff\1\56\7\uffff\1\147\1\157\1\155\2\164\1\160\1\165\4\uffff\1\163\1\141\1\162\1\151\1\146\1\60\1\146\7\uffff\1\154\1\157\1\141\1\156\1\162\1\154\1\151\1\60\1\160\3\uffff\1\164\7\uffff\1\164\1\114\1\101\1\106\1\122\1\111\1\107\1\101\1\105\1\107\1\101\1\116\1\104\1\114\11\uffff\1\60\1\144\4\uffff\1\151\1\141\3\uffff\1\145\1\uffff\1\141\7\uffff\1\163\1\157\1\145\1\163\1\155\2\164\1\106\1\57\1\145\1\141\1\160\2\73\2\145\1\164\1\154\1\165\1\147\1\157\1\141\1\uffff\1\60\1\165\1\157\1\163\1\143\1\156\1\144\1\60\1\163\1\154\1\uffff\1\154\1\60\1\141\1\114\1\116\1\101\1\113\1\124\1\110\1\103\3\105\1\116\1\113\1\60\1\114\1\uffff\1\60\10\uffff\1\151\1\144\1\60\1\164\1\57\1\60\1\145\1\137\1\uffff\1\156\1\144\1\73\2\46\1\144\1\60\1\145\1\141\1\143\2\162\1\165\1\uffff\2\162\1\164\1\153\1\60\1\75\1\154\1\uffff\2\145\1\171\1\uffff\1\60\1\137\1\60\1\125\1\107\1\105\1\124\1\113\1\60\2\116\1\107\1\60\1\uffff\1\117\1\uffff\1\157\1\151\1\uffff\1\163\2\uffff\1\155\1\104\1\164\1\143\1\46\1\154\3\uffff\1\147\3\uffff\1\145\1\uffff\1\155\1\162\1\164\1\145\1\151\1\154\1\156\3\60\1\uffff\1\42\1\154\3\60\1\uffff\1\102\1\uffff\1\114\1\122\1\60\1\107\1\60\1\uffff\1\60\1\124\1\105\1\uffff\1\127\2\156\2\60\1\105\1\60\1\141\3\uffff\2\164\1\146\3\60\1\163\2\164\1\60\3\uffff\1\141\1\60\3\uffff\1\131\1\124\1\105\1\uffff\1\122\2\uffff\1\101\2\60\1\75\1\147\2\uffff\1\106\1\uffff\1\163\2\73\1\60\3\uffff\1\163\1\171\1\60\3\uffff\1\145\4\uffff\1\137\1\60\1\131\1\105\1\60\3\uffff\1\75\1\111\1\164\2\75\1\uffff\2\60\3\uffff\1\122\1\uffff\1\60\1\131\2\uffff\1\116\1\60\6\uffff\1\105\1\uffff\1\60\1\105\1\uffff\1\106\1\uffff\1\104\1\105\1\60\1\122\1\uffff\1\105\1\116\1\103\1\105\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\165\1\145\1\170\1\150\1\145\1\154\1\171\1\71\1\uffff\1\75\4\uffff\2\162\1\154\1\171\4\uffff\1\171\1\162\1\157\1\145\1\76\1\75\1\157\1\151\1\157\1\150\1\155\1\uffff\1\75\1\157\2\75\1\uffff\1\145\1\131\1\105\1\110\1\111\1\114\1\122\1\101\1\122\1\111\2\105\2\75\1\174\1\172\1\162\1\156\1\71\1\uffff\5\uffff\2\164\1\uffff\1\171\1\162\3\uffff\1\157\4\uffff\1\162\1\uffff\1\143\1\163\1\151\3\uffff\2\141\1\163\1\114\1\71\1\uffff\1\71\7\uffff\1\147\1\157\1\155\2\164\1\160\1\165\4\uffff\1\163\1\141\1\162\1\157\1\146\1\172\1\164\7\uffff\1\156\1\157\1\141\1\156\1\162\1\154\1\151\1\172\1\160\3\uffff\1\164\7\uffff\1\164\1\114\1\101\1\106\1\122\1\111\1\107\1\125\1\105\1\107\1\101\1\116\1\104\1\114\11\uffff\1\172\1\144\4\uffff\1\155\1\164\3\uffff\1\162\1\uffff\1\157\7\uffff\1\163\1\157\1\145\1\163\1\155\2\164\1\106\1\57\1\145\1\141\1\160\2\73\2\145\1\164\1\154\1\165\1\147\1\157\1\141\1\uffff\1\172\1\165\1\157\1\163\1\143\1\156\1\144\1\172\1\163\1\154\1\uffff\1\154\1\172\1\141\1\114\1\116\1\101\1\113\1\124\1\110\1\103\3\105\1\116\1\113\1\172\1\114\1\uffff\1\172\10\uffff\1\151\1\144\1\172\1\164\1\57\1\172\1\145\1\137\1\uffff\1\156\1\144\1\73\2\77\1\144\1\172\1\145\1\141\1\143\2\162\1\165\1\uffff\2\162\1\164\1\153\1\172\1\75\1\154\1\uffff\2\145\1\171\1\uffff\1\172\1\137\1\172\1\125\1\107\1\105\1\124\1\113\1\172\2\116\1\107\1\172\1\uffff\1\117\1\uffff\1\157\1\151\1\uffff\1\163\2\uffff\1\155\1\104\1\164\1\143\1\75\1\154\3\uffff\1\147\3\uffff\1\145\1\uffff\1\155\1\162\1\164\1\145\1\151\1\154\1\156\3\172\1\uffff\1\42\1\154\3\172\1\uffff\1\102\1\uffff\1\114\1\122\1\172\1\107\1\172\1\uffff\1\172\1\124\1\105\1\uffff\1\127\2\156\2\172\1\105\1\172\1\141\3\uffff\2\164\1\146\3\172\1\163\2\164\1\172\3\uffff\1\163\1\172\3\uffff\1\131\1\124\1\105\1\uffff\1\122\2\uffff\1\101\2\172\1\75\1\147\2\uffff\1\106\1\uffff\1\163\2\73\1\172\3\uffff\1\163\1\171\1\172\3\uffff\1\171\4\uffff\1\137\1\172\1\131\1\105\1\172\3\uffff\1\75\1\111\1\164\2\75\1\uffff\2\172\3\uffff\1\122\1\uffff\1\172\1\131\2\uffff\1\116\1\172\6\uffff\1\105\1\uffff\1\172\1\105\1\uffff\1\106\1\uffff\1\104\1\105\1\172\1\122\1\uffff\1\105\1\116\1\103\1\105\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\11\uffff\1\13\1\uffff\1\23\1\24\1\25\1\26\4\uffff\1\33\1\34\1\35\1\36\13\uffff\1\113\4\uffff\1\120\24\uffff\1\u008e\1\u0092\1\u0093\1\1\1\4\2\uffff\1\17\2\uffff\1\50\1\52\1\57\1\uffff\1\127\1\130\1\u0088\1\43\1\uffff\1\u008e\3\uffff\1\5\1\12\1\123\5\uffff\1\u0089\1\uffff\1\13\1\172\1\16\1\23\1\24\1\25\1\26\7\uffff\1\33\1\34\1\35\1\36\7\uffff\1\54\1\154\1\u0090\1\u0091\1\u0084\1\56\1\102\11\uffff\1\113\1\173\1\114\1\uffff\1\151\1\u0086\1\116\1\152\1\u0087\1\117\1\120\16\uffff\1\153\1\u0083\1\155\1\u0085\1\157\1\164\1\170\1\162\1\171\2\uffff\1\u008a\1\u008b\1\u0092\1\14\2\uffff\1\20\1\22\1\51\1\uffff\1\61\1\uffff\1\21\1\71\1\45\1\70\1\72\1\62\1\63\26\uffff\1\107\12\uffff\1\110\21\uffff\1\163\1\uffff\1\46\1\77\1\15\1\47\1\55\1\100\1\65\1\66\10\uffff\1\11\15\uffff\1\53\7\uffff\1\105\3\uffff\1\115\15\uffff\1\144\1\uffff\1\166\2\uffff\1\111\1\uffff\1\6\1\7\6\uffff\1\176\1\177\1\40\1\uffff\1\175\1\u0080\1\174\1\uffff\1\121\12\uffff\1\u008d\5\uffff\1\125\1\uffff\1\137\5\uffff\1\136\3\uffff\1\143\10\uffff\1\156\1\167\1\31\12\uffff\1\60\1\124\1\u008c\2\uffff\1\122\1\106\1\165\3\uffff\1\132\1\uffff\1\135\1\140\5\uffff\1\147\1\10\1\uffff\1\27\4\uffff\1\37\1\103\1\104\3\uffff\1\112\1\64\1\67\1\uffff\1\74\1\76\1\101\1\150\5\uffff\1\142\1\145\1\2\5\uffff\1\32\2\uffff\1\44\1\73\1\75\1\uffff\1\131\2\uffff\1\141\1\3\2\uffff\1\160\1\u0081\1\161\1\u0082\1\41\1\42\1\uffff\1\134\2\uffff\1\30\1\uffff\1\133\4\uffff\1\146\5\uffff\1\126";
    static final String DFA12_specialS =
        "\1\1\72\uffff\1\0\u0195\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\76\2\75\2\76\1\75\22\76\1\75\1\43\1\73\2\76\1\65\1\21\1\4\1\14\1\16\1\64\1\45\1\15\1\46\1\47\1\33\1\72\1\10\10\72\1\34\1\13\1\1\1\12\1\11\1\42\1\76\1\74\1\55\1\51\1\52\1\74\1\6\1\56\4\74\1\54\1\57\1\74\1\60\1\61\1\74\1\62\1\7\1\5\2\74\1\53\1\74\1\63\1\74\1\23\1\76\1\24\1\67\1\74\1\76\1\71\1\20\1\35\1\31\1\3\1\37\2\74\1\41\1\74\1\36\1\74\1\50\1\44\1\70\1\30\1\74\1\32\1\27\1\22\1\17\1\2\1\40\3\74\1\25\1\66\1\26\uff82\76",
            "\1\100\15\uffff\1\102\17\uffff\1\77\42\uffff\1\110\1\113\1\103\4\uffff\1\107\2\uffff\1\111\1\uffff\1\101\1\uffff\1\106\1\114\1\uffff\1\104\1\105\1\112",
            "\1\116",
            "\1\121\1\uffff\1\120\11\uffff\1\122",
            "\1\123\72\uffff\1\124",
            "\1\126",
            "\1\127",
            "\1\131\63\uffff\1\130",
            "\1\132\1\uffff\12\134",
            "",
            "\1\136",
            "",
            "",
            "",
            "",
            "\1\144",
            "\1\145",
            "\1\146\5\uffff\1\150\4\uffff\1\147",
            "\1\152\6\uffff\1\151",
            "",
            "",
            "",
            "",
            "\1\160\20\uffff\1\161\4\uffff\1\157",
            "\1\162",
            "\1\163\11\uffff\1\164",
            "\1\165",
            "\1\170\4\uffff\1\171\15\uffff\1\167\1\166",
            "\1\173",
            "\1\177\3\uffff\1\176\2\uffff\1\175",
            "\1\u0080",
            "\1\u0082\15\uffff\1\u0081",
            "\1\u0083",
            "\1\u0084\6\uffff\1\u0085",
            "",
            "\1\u0087",
            "\1\u0089",
            "\1\u008b\21\uffff\1\u008a",
            "\1\u008e\17\uffff\1\u008d",
            "",
            "\1\u0091",
            "\1\u0092\27\uffff\1\u0093",
            "\1\u0095\3\uffff\1\u0094",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a1",
            "\1\u00a3\76\uffff\1\u00a4",
            "\1\u00a6\3\uffff\32\117\4\uffff\1\117\1\uffff\32\117",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa\1\uffff\12\134",
            "\0\u00ab",
            "",
            "",
            "",
            "",
            "",
            "\1\u00ae\22\uffff\1\u00ad",
            "\1\u00b4\1\uffff\1\u00b0\7\uffff\1\u00b5\1\uffff\1\u00af\1\uffff\1\u00b2\2\uffff\1\u00b1\1\u00b3",
            "",
            "\1\u00b7\11\uffff\1\u00b6",
            "\1\u00ba\3\uffff\1\u00b8\14\uffff\1\u00b9",
            "",
            "",
            "",
            "\1\u00bc\15\uffff\1\u00bb",
            "",
            "",
            "",
            "",
            "\1\u00bd",
            "",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "",
            "",
            "",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00aa\1\u00c5\10\u00aa",
            "",
            "\1\u00aa\1\uffff\12\134",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "",
            "",
            "",
            "",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d1\5\uffff\1\u00d0",
            "\1\u00d2",
            "\12\117\7\uffff\32\117\4\uffff\1\117\1\uffff\32\117",
            "\1\u00d4\15\uffff\1\u00d5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00d6\1\uffff\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\12\117\7\uffff\32\117\4\uffff\1\117\1\uffff\32\117",
            "\1\u00df",
            "",
            "",
            "",
            "\1\u00e0",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8\23\uffff\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\117\7\uffff\32\117\4\uffff\1\117\1\uffff\32\117",
            "\1\u00f1",
            "",
            "",
            "",
            "",
            "\1\u00f3\3\uffff\1\u00f2",
            "\1\u00f5\22\uffff\1\u00f4",
            "",
            "",
            "",
            "\1\u00f6\14\uffff\1\u00f7",
            "",
            "\1\u00f8\15\uffff\1\u00f9",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "",
            "\12\117\7\uffff\32\117\4\uffff\1\117\1\uffff\32\117",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\12\117\7\uffff\32\117\4\uffff\1\117\1\uffff\1\u0117\31\117",
            "\1\u0119",
            "\1\u011a",
            "",
            "\1\u011b",
            "\12\117\7\uffff\32\117\4\uffff\1\117\1\uffff\32\117",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\12\117\7\uffff\32\117\4\uffff\1\117\1\uffff\32\117",
            "\1\u012b",
            "",
            "\12\117\7\uffff\32\117\4\uffff\1\117\1\uffff\32\117",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u012d",
            "\1\u012e",
            "\12\117\7\uffff\32\117\4\uffff\1\117\1\uffff\32\117",
            "\1\u0130",
            "\1\u0131",
            "\12\117\7\uffff\32\117\4\uffff\1\117\1\uffff\32\117",
            "\1\u0133",
            "\1\u0134",
            "",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138\26\uffff\1\u0139\1\uffff\1\u013a",
            "\1\u013c\26\uffff\1\u013d\1\uffff\1\u013e",
            "\1\u0140",
            "\12\117\7\uffff\32\117\4\uffff\1\117\1\uffff\32\117",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\12\117\7\uffff\32\117\4\uffff\1\117\1\uffff\32\117",
            "\1\u014d",
            "\1\u014e",
            "",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "",
            "\12\117\7\uffff\32\117\4\uffff\1\117\1\uffff\32\117",
            "\1\u0153",
            "\12\117\7\uffff\32\117\4\uffff\1\117\1\uffff\32\117",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\12\117\7\uffff\32\117\4\uffff\1\117\1\uffff\32\117",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "\12\117\7\uffff\32\117\4\uffff\1\117\1\uffff\32\117",
            "",
            "\1\u015f",
            "",
            "\1\u0160",
            "\1\u0161",
            "",
            "\1\u0162",
            "",
            "",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\1\u0168\26\uffff\1\u0167",
            "\1\u016a",
            "",
            "",
            "",
            "\1\u016b",
            "",
            "",
            "",
            "\1\u016c",
            "",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "\12\117\7\uffff\32\117\4\uffff\1\117\1\uffff\32\117",
            "\12\117\7\uffff\32\117\4\uffff\1\117\1\uffff\32\117",
            "\12\117\7\uffff\32\117\4\uffff\1\117\1\uffff\32\117",
            "",
            "\1\u0177",
            "\1\u0178",
            "\12\117\7\uffff\32\117\4\uffff\1\117\1\uffff\32\117",
            "\12\117\7\uffff\32\117\4\uffff\1\117\1\uffff\32\117",
            "\12\117\7\uffff\32\117\4\uffff\1\117\1\uffff\32\117",
            "",
            "\1\u017c",
            "",
            "\1\u017d",
            "\1\u017e",
            "\12\117\7\uffff\32\117\4\uffff\1\117\1\uffff\32\117",
            "\1\u0180",
            "\12\117\7\uffff\32\117\4\uffff\1\117\1\uffff\32\117",
            "",
            "\12\117\7\uffff\32\117\4\uffff\1\117\1\uffff\32\117",
            "\1\u0183",
            "\1\u0184",
            "",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "\12\117\7\uffff\32\117\4\uffff\1\117\1\uffff\32\117",
            "\12\117\7\uffff\32\117\4\uffff\1\117\1\uffff\32\117",
            "\1\u018a",
            "\12\117\7\uffff\32\117\4\uffff\1\117\1\uffff\32\117",
            "\1\u018c",
            "",
            "",
            "",
            "\1\u018d",
            "\1\u018e",
            "\1\u018f",
            "\12\117\7\uffff\32\117\4\uffff\1\117\1\uffff\32\117",
            "\12\117\7\uffff\32\117\4\uffff\1\117\1\uffff\32\117",
            "\12\117\7\uffff\32\117\4\uffff\1\117\1\uffff\32\117",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "\12\117\7\uffff\32\117\4\uffff\1\117\1\uffff\32\117",
            "",
            "",
            "",
            "\1\u019b\3\uffff\1\u0198\1\uffff\1\u019a\1\uffff\1\u0197\6\uffff\1\u019c\2\uffff\1\u0199",
            "\12\117\7\uffff\32\117\4\uffff\1\117\1\uffff\32\117",
            "",
            "",
            "",
            "\1\u019e",
            "\1\u019f",
            "\1\u01a0",
            "",
            "\1\u01a1",
            "",
            "",
            "\1\u01a2",
            "\12\117\7\uffff\32\117\4\uffff\1\117\1\uffff\32\117",
            "\12\117\7\uffff\32\117\4\uffff\1\117\1\uffff\32\117",
            "\1\u01a5",
            "\1\u01a6",
            "",
            "",
            "\1\u01a7",
            "",
            "\1\u01a8",
            "\1\u01a9",
            "\1\u01aa",
            "\12\117\7\uffff\32\117\4\uffff\1\117\1\uffff\32\117",
            "",
            "",
            "",
            "\1\u01ac",
            "\1\u01ad",
            "\12\117\7\uffff\32\117\4\uffff\1\117\1\uffff\32\117",
            "",
            "",
            "",
            "\1\u01af\23\uffff\1\u01b0",
            "",
            "",
            "",
            "",
            "\1\u01b1",
            "\12\117\7\uffff\32\117\4\uffff\1\117\1\uffff\32\117",
            "\1\u01b3",
            "\1\u01b4",
            "\12\117\7\uffff\32\117\4\uffff\1\117\1\uffff\32\117",
            "",
            "",
            "",
            "\1\u01b6",
            "\1\u01b7",
            "\1\u01b8",
            "\1\u01b9",
            "\1\u01bb",
            "",
            "\12\117\7\uffff\32\117\4\uffff\1\117\1\uffff\32\117",
            "\12\117\7\uffff\32\117\4\uffff\1\117\1\uffff\32\117",
            "",
            "",
            "",
            "\1\u01bf",
            "",
            "\12\117\7\uffff\32\117\4\uffff\1\117\1\uffff\32\117",
            "\1\u01c1",
            "",
            "",
            "\1\u01c2",
            "\12\117\7\uffff\32\117\4\uffff\1\117\1\uffff\32\117",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u01c4",
            "",
            "\12\117\7\uffff\32\117\4\uffff\1\117\1\uffff\32\117",
            "\1\u01c6",
            "",
            "\1\u01c7",
            "",
            "\1\u01c8",
            "\1\u01c9",
            "\12\117\7\uffff\32\117\4\uffff\1\117\1\uffff\32\117",
            "\1\u01cb",
            "",
            "\1\u01cc",
            "\1\u01cd",
            "\1\u01ce",
            "\1\u01cf",
            "\12\117\7\uffff\32\117\4\uffff\1\117\1\uffff\32\117",
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
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | RULE_QUERIES | RULE_INT_STR | RULE_DOUBLE_STR | RULE_STRING | RULE_CLOCK | RULE_CHAN | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_59 = input.LA(1);

                        s = -1;
                        if ( ((LA12_59>='\u0000' && LA12_59<='\uFFFF')) ) {s = 171;}

                        else s = 62;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='<') ) {s = 1;}

                        else if ( (LA12_0=='v') ) {s = 2;}

                        else if ( (LA12_0=='e') ) {s = 3;}

                        else if ( (LA12_0=='\'') ) {s = 4;}

                        else if ( (LA12_0=='T') ) {s = 5;}

                        else if ( (LA12_0=='F') ) {s = 6;}

                        else if ( (LA12_0=='S') ) {s = 7;}

                        else if ( (LA12_0=='1') ) {s = 8;}

                        else if ( (LA12_0=='>') ) {s = 9;}

                        else if ( (LA12_0=='=') ) {s = 10;}

                        else if ( (LA12_0==';') ) {s = 11;}

                        else if ( (LA12_0=='(') ) {s = 12;}

                        else if ( (LA12_0==',') ) {s = 13;}

                        else if ( (LA12_0==')') ) {s = 14;}

                        else if ( (LA12_0=='u') ) {s = 15;}

                        else if ( (LA12_0=='b') ) {s = 16;}

                        else if ( (LA12_0=='&') ) {s = 17;}

                        else if ( (LA12_0=='t') ) {s = 18;}

                        else if ( (LA12_0=='[') ) {s = 19;}

                        else if ( (LA12_0==']') ) {s = 20;}

                        else if ( (LA12_0=='{') ) {s = 21;}

                        else if ( (LA12_0=='}') ) {s = 22;}

                        else if ( (LA12_0=='s') ) {s = 23;}

                        else if ( (LA12_0=='p') ) {s = 24;}

                        else if ( (LA12_0=='d') ) {s = 25;}

                        else if ( (LA12_0=='r') ) {s = 26;}

                        else if ( (LA12_0=='/') ) {s = 27;}

                        else if ( (LA12_0==':') ) {s = 28;}

                        else if ( (LA12_0=='c') ) {s = 29;}

                        else if ( (LA12_0=='k') ) {s = 30;}

                        else if ( (LA12_0=='f') ) {s = 31;}

                        else if ( (LA12_0=='w') ) {s = 32;}

                        else if ( (LA12_0=='i') ) {s = 33;}

                        else if ( (LA12_0=='?') ) {s = 34;}

                        else if ( (LA12_0=='!') ) {s = 35;}

                        else if ( (LA12_0=='n') ) {s = 36;}

                        else if ( (LA12_0=='+') ) {s = 37;}

                        else if ( (LA12_0=='-') ) {s = 38;}

                        else if ( (LA12_0=='.') ) {s = 39;}

                        else if ( (LA12_0=='m') ) {s = 40;}

                        else if ( (LA12_0=='C') ) {s = 41;}

                        else if ( (LA12_0=='D') ) {s = 42;}

                        else if ( (LA12_0=='W') ) {s = 43;}

                        else if ( (LA12_0=='L') ) {s = 44;}

                        else if ( (LA12_0=='B') ) {s = 45;}

                        else if ( (LA12_0=='G') ) {s = 46;}

                        else if ( (LA12_0=='M') ) {s = 47;}

                        else if ( (LA12_0=='O') ) {s = 48;}

                        else if ( (LA12_0=='P') ) {s = 49;}

                        else if ( (LA12_0=='R') ) {s = 50;}

                        else if ( (LA12_0=='Y') ) {s = 51;}

                        else if ( (LA12_0=='*') ) {s = 52;}

                        else if ( (LA12_0=='%') ) {s = 53;}

                        else if ( (LA12_0=='|') ) {s = 54;}

                        else if ( (LA12_0=='^') ) {s = 55;}

                        else if ( (LA12_0=='o') ) {s = 56;}

                        else if ( (LA12_0=='a') ) {s = 57;}

                        else if ( (LA12_0=='0'||(LA12_0>='2' && LA12_0<='9')) ) {s = 58;}

                        else if ( (LA12_0=='\"') ) {s = 59;}

                        else if ( (LA12_0=='A'||LA12_0=='E'||(LA12_0>='H' && LA12_0<='K')||LA12_0=='N'||LA12_0=='Q'||(LA12_0>='U' && LA12_0<='V')||LA12_0=='X'||LA12_0=='Z'||LA12_0=='_'||(LA12_0>='g' && LA12_0<='h')||LA12_0=='j'||LA12_0=='l'||LA12_0=='q'||(LA12_0>='x' && LA12_0<='z')) ) {s = 60;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 61;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||(LA12_0>='#' && LA12_0<='$')||LA12_0=='@'||LA12_0=='\\'||LA12_0=='`'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 62;}

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