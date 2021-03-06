/*
* generated by Xtext
*/
package sdedit.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import sdedit.services.SDELangGrammarAccess;

public class SDELangParser extends AbstractContentAssistParser {
	
	@Inject
	private SDELangGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected sdedit.ui.contentassist.antlr.internal.InternalSDELangParser createParser() {
		sdedit.ui.contentassist.antlr.internal.InternalSDELangParser result = new sdedit.ui.contentassist.antlr.internal.InternalSDELangParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getSDEditObjAccess().getAlternatives_3_1(), "rule__SDEditObj__Alternatives_3_1");
					put(grammarAccess.getSDEditCombinableDiagEltAccess().getAlternatives(), "rule__SDEditCombinableDiagElt__Alternatives");
					put(grammarAccess.getSDEditCombinedFragmentAccess().getAlternatives(), "rule__SDEditCombinedFragment__Alternatives");
					put(grammarAccess.getConditionlistRightAccess().getAlternatives_0(), "rule__ConditionlistRight__Alternatives_0");
					put(grammarAccess.getConditionElmAccess().getAlternatives(), "rule__ConditionElm__Alternatives");
					put(grammarAccess.getSDEditModelAccess().getGroup(), "rule__SDEditModel__Group__0");
					put(grammarAccess.getSDEditObjAccess().getGroup(), "rule__SDEditObj__Group__0");
					put(grammarAccess.getSDEditObjAccess().getGroup_3(), "rule__SDEditObj__Group_3__0");
					put(grammarAccess.getSDEditCallAccess().getGroup(), "rule__SDEditCall__Group__0");
					put(grammarAccess.getSDEditCallAccess().getGroup_2(), "rule__SDEditCall__Group_2__0");
					put(grammarAccess.getSDEditCallAccess().getGroup_7(), "rule__SDEditCall__Group_7__0");
					put(grammarAccess.getSDEditCallAccess().getGroup_7_1(), "rule__SDEditCall__Group_7_1__0");
					put(grammarAccess.getSDEditAltAccess().getGroup(), "rule__SDEditAlt__Group__0");
					put(grammarAccess.getSDEditAltAccess().getGroup_4(), "rule__SDEditAlt__Group_4__0");
					put(grammarAccess.getSDEditLoopAccess().getGroup(), "rule__SDEditLoop__Group__0");
					put(grammarAccess.getSDEditOptAccess().getGroup(), "rule__SDEditOpt__Group__0");
					put(grammarAccess.getConditionAccess().getGroup(), "rule__Condition__Group__0");
					put(grammarAccess.getConditionlistRightAccess().getGroup(), "rule__ConditionlistRight__Group__0");
					put(grammarAccess.getSDEditModelAccess().getElementsAssignment_0(), "rule__SDEditModel__ElementsAssignment_0");
					put(grammarAccess.getSDEditModelAccess().getElementsAssignment_1(), "rule__SDEditModel__ElementsAssignment_1");
					put(grammarAccess.getSDEditObjAccess().getObjNameAssignment_0(), "rule__SDEditObj__ObjNameAssignment_0");
					put(grammarAccess.getSDEditObjAccess().getTypeAssignment_2(), "rule__SDEditObj__TypeAssignment_2");
					put(grammarAccess.getSDEditObjnameAccess().getNameAssignment(), "rule__SDEditObjname__NameAssignment");
					put(grammarAccess.getSDEditCallAccess().getCallerAssignment_0(), "rule__SDEditCall__CallerAssignment_0");
					put(grammarAccess.getSDEditCallAccess().getReturnMessageAssignment_2_0(), "rule__SDEditCall__ReturnMessageAssignment_2_0");
					put(grammarAccess.getSDEditCallAccess().getCalledAssignment_3(), "rule__SDEditCall__CalledAssignment_3");
					put(grammarAccess.getSDEditCallAccess().getNameAssignment_5(), "rule__SDEditCall__NameAssignment_5");
					put(grammarAccess.getSDEditCallAccess().getParamsAssignment_7_0(), "rule__SDEditCall__ParamsAssignment_7_0");
					put(grammarAccess.getSDEditCallAccess().getParamListsAssignment_7_1_1(), "rule__SDEditCall__ParamListsAssignment_7_1_1");
					put(grammarAccess.getSDEditAltAccess().getCondAltAssignment_1(), "rule__SDEditAlt__CondAltAssignment_1");
					put(grammarAccess.getSDEditAltAccess().getConseqAssignment_3(), "rule__SDEditAlt__ConseqAssignment_3");
					put(grammarAccess.getSDEditAltAccess().getAltersAssignment_4_1(), "rule__SDEditAlt__AltersAssignment_4_1");
					put(grammarAccess.getSDEditLoopAccess().getCondLoopAssignment_1(), "rule__SDEditLoop__CondLoopAssignment_1");
					put(grammarAccess.getSDEditLoopAccess().getBodyAssignment_3(), "rule__SDEditLoop__BodyAssignment_3");
					put(grammarAccess.getSDEditOptAccess().getCondOptAssignment_1(), "rule__SDEditOpt__CondOptAssignment_1");
					put(grammarAccess.getSDEditOptAccess().getOptsAssignment_3(), "rule__SDEditOpt__OptsAssignment_3");
					put(grammarAccess.getConditionAccess().getCondLeftAssignment_0(), "rule__Condition__CondLeftAssignment_0");
					put(grammarAccess.getConditionAccess().getConlistRightAssignment_1(), "rule__Condition__ConlistRightAssignment_1");
					put(grammarAccess.getConditionlistRightAccess().getCondRightAssignment_1(), "rule__ConditionlistRight__CondRightAssignment_1");
					put(grammarAccess.getConditionElmAccess().getOperandNAssignment_0(), "rule__ConditionElm__OperandNAssignment_0");
					put(grammarAccess.getConditionElmAccess().getOperandStrAssignment_1(), "rule__ConditionElm__OperandStrAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			sdedit.ui.contentassist.antlr.internal.InternalSDELangParser typedParser = (sdedit.ui.contentassist.antlr.internal.InternalSDELangParser) parser;
			typedParser.entryRuleSDEditModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public SDELangGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SDELangGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
