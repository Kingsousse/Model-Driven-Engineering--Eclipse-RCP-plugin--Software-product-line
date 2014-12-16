/**
 */
package featureSeqDiag.sdcombin.sDC_language;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see featureSeqDiag.sdcombin.sDC_language.SDC_languageFactory
 * @model kind="package"
 * @generated
 */
public interface SDC_languagePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "sDC_language";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.sdcombin.featureSeqDiag/SDC_language";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "sDC_language";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SDC_languagePackage eINSTANCE = featureSeqDiag.sdcombin.sDC_language.impl.SDC_languagePackageImpl.init();

  /**
   * The meta object id for the '{@link featureSeqDiag.sdcombin.sDC_language.impl.SequenceProgImpl <em>Sequence Prog</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see featureSeqDiag.sdcombin.sDC_language.impl.SequenceProgImpl
   * @see featureSeqDiag.sdcombin.sDC_language.impl.SDC_languagePackageImpl#getSequenceProg()
   * @generated
   */
  int SEQUENCE_PROG = 0;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_PROG__FEATURES = 0;

  /**
   * The feature id for the '<em><b>Contexte</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_PROG__CONTEXTE = 1;

  /**
   * The number of structural features of the '<em>Sequence Prog</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_PROG_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link featureSeqDiag.sdcombin.sDC_language.impl.FeatureImpl <em>Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see featureSeqDiag.sdcombin.sDC_language.impl.FeatureImpl
   * @see featureSeqDiag.sdcombin.sDC_language.impl.SDC_languagePackageImpl#getFeature()
   * @generated
   */
  int FEATURE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__NAME = 0;

  /**
   * The number of structural features of the '<em>Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link featureSeqDiag.sdcombin.sDC_language.impl.ContexteImpl <em>Contexte</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see featureSeqDiag.sdcombin.sDC_language.impl.ContexteImpl
   * @see featureSeqDiag.sdcombin.sDC_language.impl.SDC_languagePackageImpl#getContexte()
   * @generated
   */
  int CONTEXTE = 2;

  /**
   * The feature id for the '<em><b>Objof</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXTE__OBJOF = 0;

  /**
   * The feature id for the '<em><b>Sequence</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXTE__SEQUENCE = 1;

  /**
   * The feature id for the '<em><b>Alternative</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXTE__ALTERNATIVE = 2;

  /**
   * The feature id for the '<em><b>Loop</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXTE__LOOP = 3;

  /**
   * The feature id for the '<em><b>Option</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXTE__OPTION = 4;

  /**
   * The number of structural features of the '<em>Contexte</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXTE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link featureSeqDiag.sdcombin.sDC_language.impl.ConditionImpl <em>Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see featureSeqDiag.sdcombin.sDC_language.impl.ConditionImpl
   * @see featureSeqDiag.sdcombin.sDC_language.impl.SDC_languagePackageImpl#getCondition()
   * @generated
   */
  int CONDITION = 3;

  /**
   * The feature id for the '<em><b>Condition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__CONDITION = 0;

  /**
   * The number of structural features of the '<em>Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link featureSeqDiag.sdcombin.sDC_language.impl.LoopImpl <em>Loop</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see featureSeqDiag.sdcombin.sDC_language.impl.LoopImpl
   * @see featureSeqDiag.sdcombin.sDC_language.impl.SDC_languagePackageImpl#getLoop()
   * @generated
   */
  int LOOP = 4;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP__CONDITION = 0;

  /**
   * The feature id for the '<em><b>Contexte</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP__CONTEXTE = 1;

  /**
   * The number of structural features of the '<em>Loop</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link featureSeqDiag.sdcombin.sDC_language.impl.SequenceImpl <em>Sequence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see featureSeqDiag.sdcombin.sDC_language.impl.SequenceImpl
   * @see featureSeqDiag.sdcombin.sDC_language.impl.SDC_languagePackageImpl#getSequence()
   * @generated
   */
  int SEQUENCE = 5;

  /**
   * The feature id for the '<em><b>Objof R</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE__OBJOF_R = 0;

  /**
   * The number of structural features of the '<em>Sequence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link featureSeqDiag.sdcombin.sDC_language.impl.AlternativeImpl <em>Alternative</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see featureSeqDiag.sdcombin.sDC_language.impl.AlternativeImpl
   * @see featureSeqDiag.sdcombin.sDC_language.impl.SDC_languagePackageImpl#getAlternative()
   * @generated
   */
  int ALTERNATIVE = 6;

  /**
   * The feature id for the '<em><b>Condition Alt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTERNATIVE__CONDITION_ALT = 0;

  /**
   * The feature id for the '<em><b>Contexte IF</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTERNATIVE__CONTEXTE_IF = 1;

  /**
   * The feature id for the '<em><b>Contexte ELSE</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTERNATIVE__CONTEXTE_ELSE = 2;

  /**
   * The number of structural features of the '<em>Alternative</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTERNATIVE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link featureSeqDiag.sdcombin.sDC_language.impl.OptionImpl <em>Option</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see featureSeqDiag.sdcombin.sDC_language.impl.OptionImpl
   * @see featureSeqDiag.sdcombin.sDC_language.impl.SDC_languagePackageImpl#getOption()
   * @generated
   */
  int OPTION = 7;

  /**
   * The feature id for the '<em><b>Condition Opt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION__CONDITION_OPT = 0;

  /**
   * The feature id for the '<em><b>Contexte</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION__CONTEXTE = 1;

  /**
   * The number of structural features of the '<em>Option</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTION_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link featureSeqDiag.sdcombin.sDC_language.SequenceProg <em>Sequence Prog</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sequence Prog</em>'.
   * @see featureSeqDiag.sdcombin.sDC_language.SequenceProg
   * @generated
   */
  EClass getSequenceProg();

  /**
   * Returns the meta object for the containment reference list '{@link featureSeqDiag.sdcombin.sDC_language.SequenceProg#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features</em>'.
   * @see featureSeqDiag.sdcombin.sDC_language.SequenceProg#getFeatures()
   * @see #getSequenceProg()
   * @generated
   */
  EReference getSequenceProg_Features();

  /**
   * Returns the meta object for the containment reference list '{@link featureSeqDiag.sdcombin.sDC_language.SequenceProg#getContexte <em>Contexte</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contexte</em>'.
   * @see featureSeqDiag.sdcombin.sDC_language.SequenceProg#getContexte()
   * @see #getSequenceProg()
   * @generated
   */
  EReference getSequenceProg_Contexte();

  /**
   * Returns the meta object for class '{@link featureSeqDiag.sdcombin.sDC_language.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature</em>'.
   * @see featureSeqDiag.sdcombin.sDC_language.Feature
   * @generated
   */
  EClass getFeature();

  /**
   * Returns the meta object for the attribute '{@link featureSeqDiag.sdcombin.sDC_language.Feature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see featureSeqDiag.sdcombin.sDC_language.Feature#getName()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Name();

  /**
   * Returns the meta object for class '{@link featureSeqDiag.sdcombin.sDC_language.Contexte <em>Contexte</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Contexte</em>'.
   * @see featureSeqDiag.sdcombin.sDC_language.Contexte
   * @generated
   */
  EClass getContexte();

  /**
   * Returns the meta object for the reference '{@link featureSeqDiag.sdcombin.sDC_language.Contexte#getObjof <em>Objof</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Objof</em>'.
   * @see featureSeqDiag.sdcombin.sDC_language.Contexte#getObjof()
   * @see #getContexte()
   * @generated
   */
  EReference getContexte_Objof();

  /**
   * Returns the meta object for the containment reference '{@link featureSeqDiag.sdcombin.sDC_language.Contexte#getSequence <em>Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sequence</em>'.
   * @see featureSeqDiag.sdcombin.sDC_language.Contexte#getSequence()
   * @see #getContexte()
   * @generated
   */
  EReference getContexte_Sequence();

  /**
   * Returns the meta object for the containment reference '{@link featureSeqDiag.sdcombin.sDC_language.Contexte#getAlternative <em>Alternative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Alternative</em>'.
   * @see featureSeqDiag.sdcombin.sDC_language.Contexte#getAlternative()
   * @see #getContexte()
   * @generated
   */
  EReference getContexte_Alternative();

  /**
   * Returns the meta object for the containment reference '{@link featureSeqDiag.sdcombin.sDC_language.Contexte#getLoop <em>Loop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Loop</em>'.
   * @see featureSeqDiag.sdcombin.sDC_language.Contexte#getLoop()
   * @see #getContexte()
   * @generated
   */
  EReference getContexte_Loop();

  /**
   * Returns the meta object for the containment reference '{@link featureSeqDiag.sdcombin.sDC_language.Contexte#getOption <em>Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Option</em>'.
   * @see featureSeqDiag.sdcombin.sDC_language.Contexte#getOption()
   * @see #getContexte()
   * @generated
   */
  EReference getContexte_Option();

  /**
   * Returns the meta object for class '{@link featureSeqDiag.sdcombin.sDC_language.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition</em>'.
   * @see featureSeqDiag.sdcombin.sDC_language.Condition
   * @generated
   */
  EClass getCondition();

  /**
   * Returns the meta object for the attribute '{@link featureSeqDiag.sdcombin.sDC_language.Condition#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Condition</em>'.
   * @see featureSeqDiag.sdcombin.sDC_language.Condition#getCondition()
   * @see #getCondition()
   * @generated
   */
  EAttribute getCondition_Condition();

  /**
   * Returns the meta object for class '{@link featureSeqDiag.sdcombin.sDC_language.Loop <em>Loop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Loop</em>'.
   * @see featureSeqDiag.sdcombin.sDC_language.Loop
   * @generated
   */
  EClass getLoop();

  /**
   * Returns the meta object for the containment reference '{@link featureSeqDiag.sdcombin.sDC_language.Loop#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see featureSeqDiag.sdcombin.sDC_language.Loop#getCondition()
   * @see #getLoop()
   * @generated
   */
  EReference getLoop_Condition();

  /**
   * Returns the meta object for the containment reference list '{@link featureSeqDiag.sdcombin.sDC_language.Loop#getContexte <em>Contexte</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contexte</em>'.
   * @see featureSeqDiag.sdcombin.sDC_language.Loop#getContexte()
   * @see #getLoop()
   * @generated
   */
  EReference getLoop_Contexte();

  /**
   * Returns the meta object for class '{@link featureSeqDiag.sdcombin.sDC_language.Sequence <em>Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sequence</em>'.
   * @see featureSeqDiag.sdcombin.sDC_language.Sequence
   * @generated
   */
  EClass getSequence();

  /**
   * Returns the meta object for the reference list '{@link featureSeqDiag.sdcombin.sDC_language.Sequence#getObjofR <em>Objof R</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Objof R</em>'.
   * @see featureSeqDiag.sdcombin.sDC_language.Sequence#getObjofR()
   * @see #getSequence()
   * @generated
   */
  EReference getSequence_ObjofR();

  /**
   * Returns the meta object for class '{@link featureSeqDiag.sdcombin.sDC_language.Alternative <em>Alternative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Alternative</em>'.
   * @see featureSeqDiag.sdcombin.sDC_language.Alternative
   * @generated
   */
  EClass getAlternative();

  /**
   * Returns the meta object for the containment reference '{@link featureSeqDiag.sdcombin.sDC_language.Alternative#getConditionAlt <em>Condition Alt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition Alt</em>'.
   * @see featureSeqDiag.sdcombin.sDC_language.Alternative#getConditionAlt()
   * @see #getAlternative()
   * @generated
   */
  EReference getAlternative_ConditionAlt();

  /**
   * Returns the meta object for the containment reference list '{@link featureSeqDiag.sdcombin.sDC_language.Alternative#getContexteIF <em>Contexte IF</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contexte IF</em>'.
   * @see featureSeqDiag.sdcombin.sDC_language.Alternative#getContexteIF()
   * @see #getAlternative()
   * @generated
   */
  EReference getAlternative_ContexteIF();

  /**
   * Returns the meta object for the containment reference list '{@link featureSeqDiag.sdcombin.sDC_language.Alternative#getContexteELSE <em>Contexte ELSE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contexte ELSE</em>'.
   * @see featureSeqDiag.sdcombin.sDC_language.Alternative#getContexteELSE()
   * @see #getAlternative()
   * @generated
   */
  EReference getAlternative_ContexteELSE();

  /**
   * Returns the meta object for class '{@link featureSeqDiag.sdcombin.sDC_language.Option <em>Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Option</em>'.
   * @see featureSeqDiag.sdcombin.sDC_language.Option
   * @generated
   */
  EClass getOption();

  /**
   * Returns the meta object for the containment reference '{@link featureSeqDiag.sdcombin.sDC_language.Option#getConditionOpt <em>Condition Opt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition Opt</em>'.
   * @see featureSeqDiag.sdcombin.sDC_language.Option#getConditionOpt()
   * @see #getOption()
   * @generated
   */
  EReference getOption_ConditionOpt();

  /**
   * Returns the meta object for the containment reference list '{@link featureSeqDiag.sdcombin.sDC_language.Option#getContexte <em>Contexte</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contexte</em>'.
   * @see featureSeqDiag.sdcombin.sDC_language.Option#getContexte()
   * @see #getOption()
   * @generated
   */
  EReference getOption_Contexte();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SDC_languageFactory getSDC_languageFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link featureSeqDiag.sdcombin.sDC_language.impl.SequenceProgImpl <em>Sequence Prog</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see featureSeqDiag.sdcombin.sDC_language.impl.SequenceProgImpl
     * @see featureSeqDiag.sdcombin.sDC_language.impl.SDC_languagePackageImpl#getSequenceProg()
     * @generated
     */
    EClass SEQUENCE_PROG = eINSTANCE.getSequenceProg();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQUENCE_PROG__FEATURES = eINSTANCE.getSequenceProg_Features();

    /**
     * The meta object literal for the '<em><b>Contexte</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQUENCE_PROG__CONTEXTE = eINSTANCE.getSequenceProg_Contexte();

    /**
     * The meta object literal for the '{@link featureSeqDiag.sdcombin.sDC_language.impl.FeatureImpl <em>Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see featureSeqDiag.sdcombin.sDC_language.impl.FeatureImpl
     * @see featureSeqDiag.sdcombin.sDC_language.impl.SDC_languagePackageImpl#getFeature()
     * @generated
     */
    EClass FEATURE = eINSTANCE.getFeature();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

    /**
     * The meta object literal for the '{@link featureSeqDiag.sdcombin.sDC_language.impl.ContexteImpl <em>Contexte</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see featureSeqDiag.sdcombin.sDC_language.impl.ContexteImpl
     * @see featureSeqDiag.sdcombin.sDC_language.impl.SDC_languagePackageImpl#getContexte()
     * @generated
     */
    EClass CONTEXTE = eINSTANCE.getContexte();

    /**
     * The meta object literal for the '<em><b>Objof</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTEXTE__OBJOF = eINSTANCE.getContexte_Objof();

    /**
     * The meta object literal for the '<em><b>Sequence</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTEXTE__SEQUENCE = eINSTANCE.getContexte_Sequence();

    /**
     * The meta object literal for the '<em><b>Alternative</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTEXTE__ALTERNATIVE = eINSTANCE.getContexte_Alternative();

    /**
     * The meta object literal for the '<em><b>Loop</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTEXTE__LOOP = eINSTANCE.getContexte_Loop();

    /**
     * The meta object literal for the '<em><b>Option</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTEXTE__OPTION = eINSTANCE.getContexte_Option();

    /**
     * The meta object literal for the '{@link featureSeqDiag.sdcombin.sDC_language.impl.ConditionImpl <em>Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see featureSeqDiag.sdcombin.sDC_language.impl.ConditionImpl
     * @see featureSeqDiag.sdcombin.sDC_language.impl.SDC_languagePackageImpl#getCondition()
     * @generated
     */
    EClass CONDITION = eINSTANCE.getCondition();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION__CONDITION = eINSTANCE.getCondition_Condition();

    /**
     * The meta object literal for the '{@link featureSeqDiag.sdcombin.sDC_language.impl.LoopImpl <em>Loop</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see featureSeqDiag.sdcombin.sDC_language.impl.LoopImpl
     * @see featureSeqDiag.sdcombin.sDC_language.impl.SDC_languagePackageImpl#getLoop()
     * @generated
     */
    EClass LOOP = eINSTANCE.getLoop();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOOP__CONDITION = eINSTANCE.getLoop_Condition();

    /**
     * The meta object literal for the '<em><b>Contexte</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOOP__CONTEXTE = eINSTANCE.getLoop_Contexte();

    /**
     * The meta object literal for the '{@link featureSeqDiag.sdcombin.sDC_language.impl.SequenceImpl <em>Sequence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see featureSeqDiag.sdcombin.sDC_language.impl.SequenceImpl
     * @see featureSeqDiag.sdcombin.sDC_language.impl.SDC_languagePackageImpl#getSequence()
     * @generated
     */
    EClass SEQUENCE = eINSTANCE.getSequence();

    /**
     * The meta object literal for the '<em><b>Objof R</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQUENCE__OBJOF_R = eINSTANCE.getSequence_ObjofR();

    /**
     * The meta object literal for the '{@link featureSeqDiag.sdcombin.sDC_language.impl.AlternativeImpl <em>Alternative</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see featureSeqDiag.sdcombin.sDC_language.impl.AlternativeImpl
     * @see featureSeqDiag.sdcombin.sDC_language.impl.SDC_languagePackageImpl#getAlternative()
     * @generated
     */
    EClass ALTERNATIVE = eINSTANCE.getAlternative();

    /**
     * The meta object literal for the '<em><b>Condition Alt</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALTERNATIVE__CONDITION_ALT = eINSTANCE.getAlternative_ConditionAlt();

    /**
     * The meta object literal for the '<em><b>Contexte IF</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALTERNATIVE__CONTEXTE_IF = eINSTANCE.getAlternative_ContexteIF();

    /**
     * The meta object literal for the '<em><b>Contexte ELSE</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALTERNATIVE__CONTEXTE_ELSE = eINSTANCE.getAlternative_ContexteELSE();

    /**
     * The meta object literal for the '{@link featureSeqDiag.sdcombin.sDC_language.impl.OptionImpl <em>Option</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see featureSeqDiag.sdcombin.sDC_language.impl.OptionImpl
     * @see featureSeqDiag.sdcombin.sDC_language.impl.SDC_languagePackageImpl#getOption()
     * @generated
     */
    EClass OPTION = eINSTANCE.getOption();

    /**
     * The meta object literal for the '<em><b>Condition Opt</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPTION__CONDITION_OPT = eINSTANCE.getOption_ConditionOpt();

    /**
     * The meta object literal for the '<em><b>Contexte</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPTION__CONTEXTE = eINSTANCE.getOption_Contexte();

  }

} //SDC_languagePackage
