package featureSeqDiag.sdedit.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import featureSeqDiag.sdedit.sD_language.Condition;
import featureSeqDiag.sdedit.sD_language.ConditionElm;
import featureSeqDiag.sdedit.sD_language.ConditionlistRight;
import featureSeqDiag.sdedit.sD_language.SDEditAlt;
import featureSeqDiag.sdedit.sD_language.SDEditCall;
import featureSeqDiag.sdedit.sD_language.SDEditLoop;
import featureSeqDiag.sdedit.sD_language.SDEditModel;
import featureSeqDiag.sdedit.sD_language.SDEditObj;
import featureSeqDiag.sdedit.sD_language.SDEditObjname;
import featureSeqDiag.sdedit.sD_language.SDEditOpt;
import featureSeqDiag.sdedit.sD_language.SD_languagePackage;
import featureSeqDiag.sdedit.services.SD_languageGrammarAccess;
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
public class SD_languageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SD_languageGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SD_languagePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SD_languagePackage.CONDITION:
				if(context == grammarAccess.getConditionRule()) {
					sequence_Condition(context, (Condition) semanticObject); 
					return; 
				}
				else break;
			case SD_languagePackage.CONDITION_ELM:
				if(context == grammarAccess.getConditionElmRule()) {
					sequence_ConditionElm(context, (ConditionElm) semanticObject); 
					return; 
				}
				else break;
			case SD_languagePackage.CONDITIONLIST_RIGHT:
				if(context == grammarAccess.getConditionlistRightRule()) {
					sequence_ConditionlistRight(context, (ConditionlistRight) semanticObject); 
					return; 
				}
				else break;
			case SD_languagePackage.SD_EDIT_ALT:
				if(context == grammarAccess.getSDEditAltRule() ||
				   context == grammarAccess.getSDEditCombinableDiagEltRule() ||
				   context == grammarAccess.getSDEditCombinedFragmentRule()) {
					sequence_SDEditAlt(context, (SDEditAlt) semanticObject); 
					return; 
				}
				else break;
			case SD_languagePackage.SD_EDIT_CALL:
				if(context == grammarAccess.getSDEditCallRule() ||
				   context == grammarAccess.getSDEditCombinableDiagEltRule()) {
					sequence_SDEditCall(context, (SDEditCall) semanticObject); 
					return; 
				}
				else break;
			case SD_languagePackage.SD_EDIT_LOOP:
				if(context == grammarAccess.getSDEditCombinableDiagEltRule() ||
				   context == grammarAccess.getSDEditCombinedFragmentRule() ||
				   context == grammarAccess.getSDEditLoopRule()) {
					sequence_SDEditLoop(context, (SDEditLoop) semanticObject); 
					return; 
				}
				else break;
			case SD_languagePackage.SD_EDIT_MODEL:
				if(context == grammarAccess.getSDEditModelRule()) {
					sequence_SDEditModel(context, (SDEditModel) semanticObject); 
					return; 
				}
				else break;
			case SD_languagePackage.SD_EDIT_OBJ:
				if(context == grammarAccess.getSDEditObjRule()) {
					sequence_SDEditObj(context, (SDEditObj) semanticObject); 
					return; 
				}
				else break;
			case SD_languagePackage.SD_EDIT_OBJNAME:
				if(context == grammarAccess.getSDEditObjnameRule()) {
					sequence_SDEditObjname(context, (SDEditObjname) semanticObject); 
					return; 
				}
				else break;
			case SD_languagePackage.SD_EDIT_OPT:
				if(context == grammarAccess.getSDEditCombinableDiagEltRule() ||
				   context == grammarAccess.getSDEditCombinedFragmentRule() ||
				   context == grammarAccess.getSDEditOptRule()) {
					sequence_SDEditOpt(context, (SDEditOpt) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (operandN=INT | operandStr=ID)
	 */
	protected void sequence_ConditionElm(EObject context, ConditionElm semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (condLeft+=ConditionElm+ conlistRight+=ConditionlistRight*)
	 */
	protected void sequence_Condition(EObject context, Condition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     condRight=ConditionElm
	 */
	protected void sequence_ConditionlistRight(EObject context, ConditionlistRight semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SD_languagePackage.Literals.CONDITIONLIST_RIGHT__COND_RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SD_languagePackage.Literals.CONDITIONLIST_RIGHT__COND_RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConditionlistRightAccess().getCondRightConditionElmParserRuleCall_1_0(), semanticObject.getCondRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (condAlt=Condition conseq+=SDEditCombinableDiagElt+ alters+=SDEditCombinableDiagElt*)
	 */
	protected void sequence_SDEditAlt(EObject context, SDEditAlt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (caller=[SDEditObjname|ID] returnMessage=ID? called=[SDEditObjname|ID] name=ID (params=ID paramLists+=ID*)?)
	 */
	protected void sequence_SDEditCall(EObject context, SDEditCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (condLoop=Condition body+=SDEditCombinableDiagElt+)
	 */
	protected void sequence_SDEditLoop(EObject context, SDEditLoop semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (elements+=SDEditObj* elements+=SDEditCombinableDiagElt*)
	 */
	protected void sequence_SDEditModel(EObject context, SDEditModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (objName=SDEditObjname type=ID)
	 */
	protected void sequence_SDEditObj(EObject context, SDEditObj semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SD_languagePackage.Literals.SD_EDIT_OBJ__OBJ_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SD_languagePackage.Literals.SD_EDIT_OBJ__OBJ_NAME));
			if(transientValues.isValueTransient(semanticObject, SD_languagePackage.Literals.SD_EDIT_OBJ__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SD_languagePackage.Literals.SD_EDIT_OBJ__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSDEditObjAccess().getObjNameSDEditObjnameParserRuleCall_0_0(), semanticObject.getObjName());
		feeder.accept(grammarAccess.getSDEditObjAccess().getTypeIDTerminalRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_SDEditObjname(EObject context, SDEditObjname semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SD_languagePackage.Literals.SD_EDIT_OBJNAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SD_languagePackage.Literals.SD_EDIT_OBJNAME__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSDEditObjnameAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (condOpt=Condition opts+=SDEditCombinableDiagElt+)
	 */
	protected void sequence_SDEditOpt(EObject context, SDEditOpt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
