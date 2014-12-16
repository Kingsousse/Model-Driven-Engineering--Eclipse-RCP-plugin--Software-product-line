package featureSeqDiag.sdcombin.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import featureSeqDiag.sdcombin.sDC_language.Alternative;
import featureSeqDiag.sdcombin.sDC_language.Condition;
import featureSeqDiag.sdcombin.sDC_language.Contexte;
import featureSeqDiag.sdcombin.sDC_language.Feature;
import featureSeqDiag.sdcombin.sDC_language.Loop;
import featureSeqDiag.sdcombin.sDC_language.Option;
import featureSeqDiag.sdcombin.sDC_language.SDC_languagePackage;
import featureSeqDiag.sdcombin.sDC_language.Sequence;
import featureSeqDiag.sdcombin.sDC_language.SequenceProg;
import featureSeqDiag.sdcombin.services.SDC_languageGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class SDC_languageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SDC_languageGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SDC_languagePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SDC_languagePackage.ALTERNATIVE:
				if(context == grammarAccess.getAlternativeRule()) {
					sequence_Alternative(context, (Alternative) semanticObject); 
					return; 
				}
				else break;
			case SDC_languagePackage.CONDITION:
				if(context == grammarAccess.getConditionRule()) {
					sequence_Condition(context, (Condition) semanticObject); 
					return; 
				}
				else break;
			case SDC_languagePackage.CONTEXTE:
				if(context == grammarAccess.getContexteRule()) {
					sequence_Contexte(context, (Contexte) semanticObject); 
					return; 
				}
				else break;
			case SDC_languagePackage.FEATURE:
				if(context == grammarAccess.getFeatureRule()) {
					sequence_Feature(context, (Feature) semanticObject); 
					return; 
				}
				else break;
			case SDC_languagePackage.LOOP:
				if(context == grammarAccess.getLoopRule()) {
					sequence_Loop(context, (Loop) semanticObject); 
					return; 
				}
				else break;
			case SDC_languagePackage.OPTION:
				if(context == grammarAccess.getOptionRule()) {
					sequence_Option(context, (Option) semanticObject); 
					return; 
				}
				else break;
			case SDC_languagePackage.SEQUENCE:
				if(context == grammarAccess.getSequenceRule()) {
					sequence_Sequence(context, (Sequence) semanticObject); 
					return; 
				}
				else break;
			case SDC_languagePackage.SEQUENCE_PROG:
				if(context == grammarAccess.getSequenceProgRule()) {
					sequence_SequenceProg(context, (SequenceProg) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (conditionAlt=Condition contexteIF+=Contexte* contexteELSE+=Contexte*)
	 */
	protected void sequence_Alternative(EObject context, Alternative semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     condition=STRING
	 */
	protected void sequence_Condition(EObject context, Condition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SDC_languagePackage.Literals.CONDITION__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SDC_languagePackage.Literals.CONDITION__CONDITION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConditionAccess().getConditionSTRINGTerminalRuleCall_0(), semanticObject.getCondition());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((objof=[Feature|ID] sequence=Sequence?) | alternative=Alternative | loop=Loop | option=Option)
	 */
	protected void sequence_Contexte(EObject context, Contexte semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Feature(EObject context, Feature semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SDC_languagePackage.Literals.FEATURE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SDC_languagePackage.Literals.FEATURE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (condition=Condition contexte+=Contexte+)
	 */
	protected void sequence_Loop(EObject context, Loop semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (conditionOpt=Condition contexte+=Contexte+)
	 */
	protected void sequence_Option(EObject context, Option semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (features+=Feature+ contexte+=Contexte+)
	 */
	protected void sequence_SequenceProg(EObject context, SequenceProg semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     objofR+=[Feature|ID]+
	 */
	protected void sequence_Sequence(EObject context, Sequence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
