/*
* generated by Xtext
*/
package featureSeqDiag.sdedit.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import featureSeqDiag.sdedit.services.SD_languageGrammarAccess;

public class SD_languageParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private SD_languageGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected featureSeqDiag.sdedit.parser.antlr.internal.InternalSD_languageParser createParser(XtextTokenStream stream) {
		return new featureSeqDiag.sdedit.parser.antlr.internal.InternalSD_languageParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "SDEditModel";
	}
	
	public SD_languageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SD_languageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
