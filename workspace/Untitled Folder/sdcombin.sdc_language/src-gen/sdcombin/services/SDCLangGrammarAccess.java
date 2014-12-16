/*
* generated by Xtext
*/
package sdcombin.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class SDCLangGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class SequenceProgElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SequenceProg");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final Keyword cFeaturesKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cFeaturesAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cFeaturesFeatureParserRuleCall_0_1_0 = (RuleCall)cFeaturesAssignment_0_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_0_2 = (Keyword)cGroup_0.eContents().get(2);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cCombinationKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cContexteAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cContexteContexteParserRuleCall_1_1_0 = (RuleCall)cContexteAssignment_1_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		
		//SequenceProg:
		//	("Features {" features+=Feature+ "}") ("Combination {" contexte+=Contexte+ "}");
		public ParserRule getRule() { return rule; }

		//("Features {" features+=Feature+ "}") ("Combination {" contexte+=Contexte+ "}")
		public Group getGroup() { return cGroup; }

		//"Features {" features+=Feature+ "}"
		public Group getGroup_0() { return cGroup_0; }

		//"Features {"
		public Keyword getFeaturesKeyword_0_0() { return cFeaturesKeyword_0_0; }

		//features+=Feature+
		public Assignment getFeaturesAssignment_0_1() { return cFeaturesAssignment_0_1; }

		//Feature
		public RuleCall getFeaturesFeatureParserRuleCall_0_1_0() { return cFeaturesFeatureParserRuleCall_0_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_0_2() { return cRightCurlyBracketKeyword_0_2; }

		//"Combination {" contexte+=Contexte+ "}"
		public Group getGroup_1() { return cGroup_1; }

		//"Combination {"
		public Keyword getCombinationKeyword_1_0() { return cCombinationKeyword_1_0; }

		//contexte+=Contexte+
		public Assignment getContexteAssignment_1_1() { return cContexteAssignment_1_1; }

		//Contexte
		public RuleCall getContexteContexteParserRuleCall_1_1_0() { return cContexteContexteParserRuleCall_1_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_1_2() { return cRightCurlyBracketKeyword_1_2; }
	}

	public class FeatureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Feature");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//Feature:
		//	name=ID;
		public ParserRule getRule() { return rule; }

		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}

	public class ContexteElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Contexte");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Assignment cObjofAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final CrossReference cObjofFeatureCrossReference_0_0_0 = (CrossReference)cObjofAssignment_0_0.eContents().get(0);
		private final RuleCall cObjofFeatureIDTerminalRuleCall_0_0_0_1 = (RuleCall)cObjofFeatureCrossReference_0_0_0.eContents().get(1);
		private final Assignment cSequenceAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cSequenceSequenceParserRuleCall_0_1_0 = (RuleCall)cSequenceAssignment_0_1.eContents().get(0);
		private final Assignment cAlternativeAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cAlternativeAlternativeParserRuleCall_1_0 = (RuleCall)cAlternativeAssignment_1.eContents().get(0);
		private final Assignment cLoopAssignment_2 = (Assignment)cAlternatives.eContents().get(2);
		private final RuleCall cLoopLoopParserRuleCall_2_0 = (RuleCall)cLoopAssignment_2.eContents().get(0);
		private final Assignment cOptionAssignment_3 = (Assignment)cAlternatives.eContents().get(3);
		private final RuleCall cOptionOptionParserRuleCall_3_0 = (RuleCall)cOptionAssignment_3.eContents().get(0);
		
		//Contexte:
		//	objof=[Feature] sequence=Sequence? | alternative=Alternative | loop=Loop | option=Option;
		public ParserRule getRule() { return rule; }

		//objof=[Feature] sequence=Sequence? | alternative=Alternative | loop=Loop | option=Option
		public Alternatives getAlternatives() { return cAlternatives; }

		//objof=[Feature] sequence=Sequence?
		public Group getGroup_0() { return cGroup_0; }

		//objof=[Feature]
		public Assignment getObjofAssignment_0_0() { return cObjofAssignment_0_0; }

		//[Feature]
		public CrossReference getObjofFeatureCrossReference_0_0_0() { return cObjofFeatureCrossReference_0_0_0; }

		//ID
		public RuleCall getObjofFeatureIDTerminalRuleCall_0_0_0_1() { return cObjofFeatureIDTerminalRuleCall_0_0_0_1; }

		//sequence=Sequence?
		public Assignment getSequenceAssignment_0_1() { return cSequenceAssignment_0_1; }

		//Sequence
		public RuleCall getSequenceSequenceParserRuleCall_0_1_0() { return cSequenceSequenceParserRuleCall_0_1_0; }

		//alternative=Alternative
		public Assignment getAlternativeAssignment_1() { return cAlternativeAssignment_1; }

		//Alternative
		public RuleCall getAlternativeAlternativeParserRuleCall_1_0() { return cAlternativeAlternativeParserRuleCall_1_0; }

		//loop=Loop
		public Assignment getLoopAssignment_2() { return cLoopAssignment_2; }

		//Loop
		public RuleCall getLoopLoopParserRuleCall_2_0() { return cLoopLoopParserRuleCall_2_0; }

		//option=Option
		public Assignment getOptionAssignment_3() { return cOptionAssignment_3; }

		//Option
		public RuleCall getOptionOptionParserRuleCall_3_0() { return cOptionOptionParserRuleCall_3_0; }
	}

	public class ConditionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Condition");
		private final Assignment cConditionAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cConditionSTRINGTerminalRuleCall_0 = (RuleCall)cConditionAssignment.eContents().get(0);
		
		//Condition:
		//	condition=STRING;
		public ParserRule getRule() { return rule; }

		//condition=STRING
		public Assignment getConditionAssignment() { return cConditionAssignment; }

		//STRING
		public RuleCall getConditionSTRINGTerminalRuleCall_0() { return cConditionSTRINGTerminalRuleCall_0; }
	}

	public class LoopElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Loop");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLoopKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cConditionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cConditionConditionParserRuleCall_1_0 = (RuleCall)cConditionAssignment_1.eContents().get(0);
		private final Keyword cRightSquareBracketSpaceLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cContexteAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cContexteContexteParserRuleCall_3_0 = (RuleCall)cContexteAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Loop:
		//	"loop [" condition=Condition "] {" contexte+=Contexte+ "}";
		public ParserRule getRule() { return rule; }

		//"loop [" condition=Condition "] {" contexte+=Contexte+ "}"
		public Group getGroup() { return cGroup; }

		//"loop ["
		public Keyword getLoopKeyword_0() { return cLoopKeyword_0; }

		//condition=Condition
		public Assignment getConditionAssignment_1() { return cConditionAssignment_1; }

		//Condition
		public RuleCall getConditionConditionParserRuleCall_1_0() { return cConditionConditionParserRuleCall_1_0; }

		//"] {"
		public Keyword getRightSquareBracketSpaceLeftCurlyBracketKeyword_2() { return cRightSquareBracketSpaceLeftCurlyBracketKeyword_2; }

		//contexte+=Contexte+
		public Assignment getContexteAssignment_3() { return cContexteAssignment_3; }

		//Contexte
		public RuleCall getContexteContexteParserRuleCall_3_0() { return cContexteContexteParserRuleCall_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}

	public class SequenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Sequence");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSeqKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cObjofRAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cObjofRFeatureCrossReference_1_0 = (CrossReference)cObjofRAssignment_1.eContents().get(0);
		private final RuleCall cObjofRFeatureIDTerminalRuleCall_1_0_1 = (RuleCall)cObjofRFeatureCrossReference_1_0.eContents().get(1);
		
		//Sequence:
		//	("seq" objofR+=[Feature])+;
		public ParserRule getRule() { return rule; }

		//("seq" objofR+=[Feature])+
		public Group getGroup() { return cGroup; }

		//"seq"
		public Keyword getSeqKeyword_0() { return cSeqKeyword_0; }

		//objofR+=[Feature]
		public Assignment getObjofRAssignment_1() { return cObjofRAssignment_1; }

		//[Feature]
		public CrossReference getObjofRFeatureCrossReference_1_0() { return cObjofRFeatureCrossReference_1_0; }

		//ID
		public RuleCall getObjofRFeatureIDTerminalRuleCall_1_0_1() { return cObjofRFeatureIDTerminalRuleCall_1_0_1; }
	}

	public class AlternativeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Alternative");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAltKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cConditionAltAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cConditionAltConditionParserRuleCall_1_0 = (RuleCall)cConditionAltAssignment_1.eContents().get(0);
		private final Keyword cRightSquareBracketSpaceLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cContexteIFAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cContexteIFContexteParserRuleCall_3_0 = (RuleCall)cContexteIFAssignment_3.eContents().get(0);
		private final Keyword cElseKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cContexteELSEAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cContexteELSEContexteParserRuleCall_5_0 = (RuleCall)cContexteELSEAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Alternative:
		//	"alt [" conditionAlt=Condition "] {" contexteIF+=Contexte* "else" contexteELSE+=Contexte* "}";
		public ParserRule getRule() { return rule; }

		//"alt [" conditionAlt=Condition "] {" contexteIF+=Contexte* "else" contexteELSE+=Contexte* "}"
		public Group getGroup() { return cGroup; }

		//"alt ["
		public Keyword getAltKeyword_0() { return cAltKeyword_0; }

		//conditionAlt=Condition
		public Assignment getConditionAltAssignment_1() { return cConditionAltAssignment_1; }

		//Condition
		public RuleCall getConditionAltConditionParserRuleCall_1_0() { return cConditionAltConditionParserRuleCall_1_0; }

		//"] {"
		public Keyword getRightSquareBracketSpaceLeftCurlyBracketKeyword_2() { return cRightSquareBracketSpaceLeftCurlyBracketKeyword_2; }

		//contexteIF+=Contexte*
		public Assignment getContexteIFAssignment_3() { return cContexteIFAssignment_3; }

		//Contexte
		public RuleCall getContexteIFContexteParserRuleCall_3_0() { return cContexteIFContexteParserRuleCall_3_0; }

		//"else"
		public Keyword getElseKeyword_4() { return cElseKeyword_4; }

		//contexteELSE+=Contexte*
		public Assignment getContexteELSEAssignment_5() { return cContexteELSEAssignment_5; }

		//Contexte
		public RuleCall getContexteELSEContexteParserRuleCall_5_0() { return cContexteELSEContexteParserRuleCall_5_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}

	public class OptionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Option");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cOptKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cConditionOptAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cConditionOptConditionParserRuleCall_1_0 = (RuleCall)cConditionOptAssignment_1.eContents().get(0);
		private final Keyword cRightSquareBracketSpaceLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cContexteAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cContexteContexteParserRuleCall_3_0 = (RuleCall)cContexteAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Option:
		//	"opt [" conditionOpt=Condition "] {" contexte+=Contexte+ "}";
		public ParserRule getRule() { return rule; }

		//"opt [" conditionOpt=Condition "] {" contexte+=Contexte+ "}"
		public Group getGroup() { return cGroup; }

		//"opt ["
		public Keyword getOptKeyword_0() { return cOptKeyword_0; }

		//conditionOpt=Condition
		public Assignment getConditionOptAssignment_1() { return cConditionOptAssignment_1; }

		//Condition
		public RuleCall getConditionOptConditionParserRuleCall_1_0() { return cConditionOptConditionParserRuleCall_1_0; }

		//"] {"
		public Keyword getRightSquareBracketSpaceLeftCurlyBracketKeyword_2() { return cRightSquareBracketSpaceLeftCurlyBracketKeyword_2; }

		//contexte+=Contexte+
		public Assignment getContexteAssignment_3() { return cContexteAssignment_3; }

		//Contexte
		public RuleCall getContexteContexteParserRuleCall_3_0() { return cContexteContexteParserRuleCall_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	
	
	private SequenceProgElements pSequenceProg;
	private FeatureElements pFeature;
	private ContexteElements pContexte;
	private ConditionElements pCondition;
	private LoopElements pLoop;
	private SequenceElements pSequence;
	private AlternativeElements pAlternative;
	private OptionElements pOption;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public SDCLangGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("sdcombin.SDCLang".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//SequenceProg:
	//	("Features {" features+=Feature+ "}") ("Combination {" contexte+=Contexte+ "}");
	public SequenceProgElements getSequenceProgAccess() {
		return (pSequenceProg != null) ? pSequenceProg : (pSequenceProg = new SequenceProgElements());
	}
	
	public ParserRule getSequenceProgRule() {
		return getSequenceProgAccess().getRule();
	}

	//Feature:
	//	name=ID;
	public FeatureElements getFeatureAccess() {
		return (pFeature != null) ? pFeature : (pFeature = new FeatureElements());
	}
	
	public ParserRule getFeatureRule() {
		return getFeatureAccess().getRule();
	}

	//Contexte:
	//	objof=[Feature] sequence=Sequence? | alternative=Alternative | loop=Loop | option=Option;
	public ContexteElements getContexteAccess() {
		return (pContexte != null) ? pContexte : (pContexte = new ContexteElements());
	}
	
	public ParserRule getContexteRule() {
		return getContexteAccess().getRule();
	}

	//Condition:
	//	condition=STRING;
	public ConditionElements getConditionAccess() {
		return (pCondition != null) ? pCondition : (pCondition = new ConditionElements());
	}
	
	public ParserRule getConditionRule() {
		return getConditionAccess().getRule();
	}

	//Loop:
	//	"loop [" condition=Condition "] {" contexte+=Contexte+ "}";
	public LoopElements getLoopAccess() {
		return (pLoop != null) ? pLoop : (pLoop = new LoopElements());
	}
	
	public ParserRule getLoopRule() {
		return getLoopAccess().getRule();
	}

	//Sequence:
	//	("seq" objofR+=[Feature])+;
	public SequenceElements getSequenceAccess() {
		return (pSequence != null) ? pSequence : (pSequence = new SequenceElements());
	}
	
	public ParserRule getSequenceRule() {
		return getSequenceAccess().getRule();
	}

	//Alternative:
	//	"alt [" conditionAlt=Condition "] {" contexteIF+=Contexte* "else" contexteELSE+=Contexte* "}";
	public AlternativeElements getAlternativeAccess() {
		return (pAlternative != null) ? pAlternative : (pAlternative = new AlternativeElements());
	}
	
	public ParserRule getAlternativeRule() {
		return getAlternativeAccess().getRule();
	}

	//Option:
	//	"opt [" conditionOpt=Condition "] {" contexte+=Contexte+ "}";
	public OptionElements getOptionAccess() {
		return (pOption != null) ? pOption : (pOption = new OptionElements());
	}
	
	public ParserRule getOptionRule() {
		return getOptionAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
