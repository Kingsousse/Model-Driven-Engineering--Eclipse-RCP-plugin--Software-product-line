/**
 */
package featureSeqDiag.sdcombin.sDC_language.impl;

import featureSeqDiag.sdcombin.sDC_language.Alternative;
import featureSeqDiag.sdcombin.sDC_language.Condition;
import featureSeqDiag.sdcombin.sDC_language.Contexte;
import featureSeqDiag.sdcombin.sDC_language.Feature;
import featureSeqDiag.sdcombin.sDC_language.Loop;
import featureSeqDiag.sdcombin.sDC_language.Option;
import featureSeqDiag.sdcombin.sDC_language.SDC_languageFactory;
import featureSeqDiag.sdcombin.sDC_language.SDC_languagePackage;
import featureSeqDiag.sdcombin.sDC_language.Sequence;
import featureSeqDiag.sdcombin.sDC_language.SequenceProg;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SDC_languagePackageImpl extends EPackageImpl implements SDC_languagePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sequenceProgEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contexteEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass loopEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sequenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alternativeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass optionEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see featureSeqDiag.sdcombin.sDC_language.SDC_languagePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SDC_languagePackageImpl()
  {
    super(eNS_URI, SDC_languageFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link SDC_languagePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SDC_languagePackage init()
  {
    if (isInited) return (SDC_languagePackage)EPackage.Registry.INSTANCE.getEPackage(SDC_languagePackage.eNS_URI);

    // Obtain or create and register package
    SDC_languagePackageImpl theSDC_languagePackage = (SDC_languagePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SDC_languagePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SDC_languagePackageImpl());

    isInited = true;

    // Create package meta-data objects
    theSDC_languagePackage.createPackageContents();

    // Initialize created meta-data
    theSDC_languagePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSDC_languagePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SDC_languagePackage.eNS_URI, theSDC_languagePackage);
    return theSDC_languagePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSequenceProg()
  {
    return sequenceProgEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSequenceProg_Features()
  {
    return (EReference)sequenceProgEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSequenceProg_Contexte()
  {
    return (EReference)sequenceProgEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeature()
  {
    return featureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFeature_Name()
  {
    return (EAttribute)featureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContexte()
  {
    return contexteEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContexte_Objof()
  {
    return (EReference)contexteEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContexte_Sequence()
  {
    return (EReference)contexteEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContexte_Alternative()
  {
    return (EReference)contexteEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContexte_Loop()
  {
    return (EReference)contexteEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContexte_Option()
  {
    return (EReference)contexteEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCondition()
  {
    return conditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCondition_Condition()
  {
    return (EAttribute)conditionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLoop()
  {
    return loopEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLoop_Condition()
  {
    return (EReference)loopEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLoop_Contexte()
  {
    return (EReference)loopEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSequence()
  {
    return sequenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSequence_ObjofR()
  {
    return (EReference)sequenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAlternative()
  {
    return alternativeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlternative_ConditionAlt()
  {
    return (EReference)alternativeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlternative_ContexteIF()
  {
    return (EReference)alternativeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlternative_ContexteELSE()
  {
    return (EReference)alternativeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOption()
  {
    return optionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOption_ConditionOpt()
  {
    return (EReference)optionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOption_Contexte()
  {
    return (EReference)optionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SDC_languageFactory getSDC_languageFactory()
  {
    return (SDC_languageFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    sequenceProgEClass = createEClass(SEQUENCE_PROG);
    createEReference(sequenceProgEClass, SEQUENCE_PROG__FEATURES);
    createEReference(sequenceProgEClass, SEQUENCE_PROG__CONTEXTE);

    featureEClass = createEClass(FEATURE);
    createEAttribute(featureEClass, FEATURE__NAME);

    contexteEClass = createEClass(CONTEXTE);
    createEReference(contexteEClass, CONTEXTE__OBJOF);
    createEReference(contexteEClass, CONTEXTE__SEQUENCE);
    createEReference(contexteEClass, CONTEXTE__ALTERNATIVE);
    createEReference(contexteEClass, CONTEXTE__LOOP);
    createEReference(contexteEClass, CONTEXTE__OPTION);

    conditionEClass = createEClass(CONDITION);
    createEAttribute(conditionEClass, CONDITION__CONDITION);

    loopEClass = createEClass(LOOP);
    createEReference(loopEClass, LOOP__CONDITION);
    createEReference(loopEClass, LOOP__CONTEXTE);

    sequenceEClass = createEClass(SEQUENCE);
    createEReference(sequenceEClass, SEQUENCE__OBJOF_R);

    alternativeEClass = createEClass(ALTERNATIVE);
    createEReference(alternativeEClass, ALTERNATIVE__CONDITION_ALT);
    createEReference(alternativeEClass, ALTERNATIVE__CONTEXTE_IF);
    createEReference(alternativeEClass, ALTERNATIVE__CONTEXTE_ELSE);

    optionEClass = createEClass(OPTION);
    createEReference(optionEClass, OPTION__CONDITION_OPT);
    createEReference(optionEClass, OPTION__CONTEXTE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(sequenceProgEClass, SequenceProg.class, "SequenceProg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSequenceProg_Features(), this.getFeature(), null, "features", null, 0, -1, SequenceProg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSequenceProg_Contexte(), this.getContexte(), null, "contexte", null, 0, -1, SequenceProg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(contexteEClass, Contexte.class, "Contexte", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getContexte_Objof(), this.getFeature(), null, "objof", null, 0, 1, Contexte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContexte_Sequence(), this.getSequence(), null, "sequence", null, 0, 1, Contexte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContexte_Alternative(), this.getAlternative(), null, "alternative", null, 0, 1, Contexte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContexte_Loop(), this.getLoop(), null, "loop", null, 0, 1, Contexte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContexte_Option(), this.getOption(), null, "option", null, 0, 1, Contexte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCondition_Condition(), ecorePackage.getEString(), "condition", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(loopEClass, Loop.class, "Loop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLoop_Condition(), this.getCondition(), null, "condition", null, 0, 1, Loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLoop_Contexte(), this.getContexte(), null, "contexte", null, 0, -1, Loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sequenceEClass, Sequence.class, "Sequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSequence_ObjofR(), this.getFeature(), null, "objofR", null, 0, -1, Sequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alternativeEClass, Alternative.class, "Alternative", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAlternative_ConditionAlt(), this.getCondition(), null, "conditionAlt", null, 0, 1, Alternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAlternative_ContexteIF(), this.getContexte(), null, "contexteIF", null, 0, -1, Alternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAlternative_ContexteELSE(), this.getContexte(), null, "contexteELSE", null, 0, -1, Alternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(optionEClass, Option.class, "Option", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOption_ConditionOpt(), this.getCondition(), null, "conditionOpt", null, 0, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOption_Contexte(), this.getContexte(), null, "contexte", null, 0, -1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //SDC_languagePackageImpl
