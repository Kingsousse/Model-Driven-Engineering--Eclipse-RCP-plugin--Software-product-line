/*
* generated by Xtext
*/
package featureSeqDiag.sdcombin.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class SDC_languageAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("featureSeqDiag/sdcombin/parser/antlr/internal/InternalSDC_language.tokens");
	}
}