/*
* generated by Xtext
*/
package featureSeqDiag.sdcombin.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import featureSeqDiag.sdcombin.services.SDC_languageGrammarAccess;

public class SDC_languageParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private SDC_languageGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected featureSeqDiag.sdcombin.parser.antlr.internal.InternalSDC_languageParser createParser(XtextTokenStream stream) {
		return new featureSeqDiag.sdcombin.parser.antlr.internal.InternalSDC_languageParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "SequenceProg";
	}
	
	public SDC_languageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SDC_languageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}