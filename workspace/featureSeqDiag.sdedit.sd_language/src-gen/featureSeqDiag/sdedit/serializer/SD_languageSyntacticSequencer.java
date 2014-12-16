package featureSeqDiag.sdedit.serializer;

import com.google.inject.Inject;
import featureSeqDiag.sdedit.services.SD_languageGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class SD_languageSyntacticSequencer extends AbstractSyntacticSequencer {

	protected SD_languageGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ConditionlistRight_AmpersandAmpersandKeyword_0_10_or_AndKeyword_0_11_or_CircumflexAccentKeyword_0_12_or_EqualsSignEqualsSignKeyword_0_3_or_ExclamationMarkEqualsSignKeyword_0_2_or_ExclamationMarkKeyword_0_8_or_GreaterThanSignEqualsSignKeyword_0_7_or_GreaterThanSignKeyword_0_5_or_ISKeyword_0_1_or_ISNOTKeyword_0_0_or_LessThanSignEqualsSignKeyword_0_6_or_LessThanSignKeyword_0_4_or_OrKeyword_0_13_or_VerticalLineVerticalLineKeyword_0_9;
	protected AbstractElementAlias match_SDEditAlt_ElseKeyword_4_0_a;
	protected AbstractElementAlias match_SDEditAlt_ElseKeyword_4_0_p;
	protected AbstractElementAlias match_SDEditObj___LeftSquareBracketKeyword_3_0___AKeyword_3_1_0_or_PKeyword_3_1_1_or_RKeyword_3_1_2_or_XKeyword_3_1_3___RightSquareBracketKeyword_3_2__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SD_languageGrammarAccess) access;
		match_ConditionlistRight_AmpersandAmpersandKeyword_0_10_or_AndKeyword_0_11_or_CircumflexAccentKeyword_0_12_or_EqualsSignEqualsSignKeyword_0_3_or_ExclamationMarkEqualsSignKeyword_0_2_or_ExclamationMarkKeyword_0_8_or_GreaterThanSignEqualsSignKeyword_0_7_or_GreaterThanSignKeyword_0_5_or_ISKeyword_0_1_or_ISNOTKeyword_0_0_or_LessThanSignEqualsSignKeyword_0_6_or_LessThanSignKeyword_0_4_or_OrKeyword_0_13_or_VerticalLineVerticalLineKeyword_0_9 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getConditionlistRightAccess().getAmpersandAmpersandKeyword_0_10()), new TokenAlias(false, false, grammarAccess.getConditionlistRightAccess().getAndKeyword_0_11()), new TokenAlias(false, false, grammarAccess.getConditionlistRightAccess().getCircumflexAccentKeyword_0_12()), new TokenAlias(false, false, grammarAccess.getConditionlistRightAccess().getEqualsSignEqualsSignKeyword_0_3()), new TokenAlias(false, false, grammarAccess.getConditionlistRightAccess().getExclamationMarkEqualsSignKeyword_0_2()), new TokenAlias(false, false, grammarAccess.getConditionlistRightAccess().getExclamationMarkKeyword_0_8()), new TokenAlias(false, false, grammarAccess.getConditionlistRightAccess().getGreaterThanSignEqualsSignKeyword_0_7()), new TokenAlias(false, false, grammarAccess.getConditionlistRightAccess().getGreaterThanSignKeyword_0_5()), new TokenAlias(false, false, grammarAccess.getConditionlistRightAccess().getISKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getConditionlistRightAccess().getISNOTKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getConditionlistRightAccess().getLessThanSignEqualsSignKeyword_0_6()), new TokenAlias(false, false, grammarAccess.getConditionlistRightAccess().getLessThanSignKeyword_0_4()), new TokenAlias(false, false, grammarAccess.getConditionlistRightAccess().getOrKeyword_0_13()), new TokenAlias(false, false, grammarAccess.getConditionlistRightAccess().getVerticalLineVerticalLineKeyword_0_9()));
		match_SDEditAlt_ElseKeyword_4_0_a = new TokenAlias(true, true, grammarAccess.getSDEditAltAccess().getElseKeyword_4_0());
		match_SDEditAlt_ElseKeyword_4_0_p = new TokenAlias(true, false, grammarAccess.getSDEditAltAccess().getElseKeyword_4_0());
		match_SDEditObj___LeftSquareBracketKeyword_3_0___AKeyword_3_1_0_or_PKeyword_3_1_1_or_RKeyword_3_1_2_or_XKeyword_3_1_3___RightSquareBracketKeyword_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getSDEditObjAccess().getLeftSquareBracketKeyword_3_0()), new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getSDEditObjAccess().getAKeyword_3_1_0()), new TokenAlias(false, false, grammarAccess.getSDEditObjAccess().getPKeyword_3_1_1()), new TokenAlias(false, false, grammarAccess.getSDEditObjAccess().getRKeyword_3_1_2()), new TokenAlias(false, false, grammarAccess.getSDEditObjAccess().getXKeyword_3_1_3())), new TokenAlias(false, false, grammarAccess.getSDEditObjAccess().getRightSquareBracketKeyword_3_2()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_ConditionlistRight_AmpersandAmpersandKeyword_0_10_or_AndKeyword_0_11_or_CircumflexAccentKeyword_0_12_or_EqualsSignEqualsSignKeyword_0_3_or_ExclamationMarkEqualsSignKeyword_0_2_or_ExclamationMarkKeyword_0_8_or_GreaterThanSignEqualsSignKeyword_0_7_or_GreaterThanSignKeyword_0_5_or_ISKeyword_0_1_or_ISNOTKeyword_0_0_or_LessThanSignEqualsSignKeyword_0_6_or_LessThanSignKeyword_0_4_or_OrKeyword_0_13_or_VerticalLineVerticalLineKeyword_0_9.equals(syntax))
				emit_ConditionlistRight_AmpersandAmpersandKeyword_0_10_or_AndKeyword_0_11_or_CircumflexAccentKeyword_0_12_or_EqualsSignEqualsSignKeyword_0_3_or_ExclamationMarkEqualsSignKeyword_0_2_or_ExclamationMarkKeyword_0_8_or_GreaterThanSignEqualsSignKeyword_0_7_or_GreaterThanSignKeyword_0_5_or_ISKeyword_0_1_or_ISNOTKeyword_0_0_or_LessThanSignEqualsSignKeyword_0_6_or_LessThanSignKeyword_0_4_or_OrKeyword_0_13_or_VerticalLineVerticalLineKeyword_0_9(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SDEditAlt_ElseKeyword_4_0_a.equals(syntax))
				emit_SDEditAlt_ElseKeyword_4_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SDEditAlt_ElseKeyword_4_0_p.equals(syntax))
				emit_SDEditAlt_ElseKeyword_4_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SDEditObj___LeftSquareBracketKeyword_3_0___AKeyword_3_1_0_or_PKeyword_3_1_1_or_RKeyword_3_1_2_or_XKeyword_3_1_3___RightSquareBracketKeyword_3_2__q.equals(syntax))
				emit_SDEditObj___LeftSquareBracketKeyword_3_0___AKeyword_3_1_0_or_PKeyword_3_1_1_or_RKeyword_3_1_2_or_XKeyword_3_1_3___RightSquareBracketKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     (
	     'IS NOT' | 
	     'IS' | 
	     '>' | 
	     '&&' | 
	     '^' | 
	     '!' | 
	     '==' | 
	     '||' | 
	     '>=' | 
	     'or' | 
	     'and' | 
	     '<=' | 
	     '<' | 
	     '!='
	 )
	 */
	protected void emit_ConditionlistRight_AmpersandAmpersandKeyword_0_10_or_AndKeyword_0_11_or_CircumflexAccentKeyword_0_12_or_EqualsSignEqualsSignKeyword_0_3_or_ExclamationMarkEqualsSignKeyword_0_2_or_ExclamationMarkKeyword_0_8_or_GreaterThanSignEqualsSignKeyword_0_7_or_GreaterThanSignKeyword_0_5_or_ISKeyword_0_1_or_ISNOTKeyword_0_0_or_LessThanSignEqualsSignKeyword_0_6_or_LessThanSignKeyword_0_4_or_OrKeyword_0_13_or_VerticalLineVerticalLineKeyword_0_9(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '--[else]'*
	 */
	protected void emit_SDEditAlt_ElseKeyword_4_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '--[else]'+
	 */
	protected void emit_SDEditAlt_ElseKeyword_4_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('[' ('x' | 'a' | 'p' | 'r') ']')?
	 */
	protected void emit_SDEditObj___LeftSquareBracketKeyword_3_0___AKeyword_3_1_0_or_PKeyword_3_1_1_or_RKeyword_3_1_2_or_XKeyword_3_1_3___RightSquareBracketKeyword_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
