/**
 */
package featureSeqDiag.sdedit.sD_language.impl;

import featureSeqDiag.sdedit.sD_language.Condition;
import featureSeqDiag.sdedit.sD_language.ConditionElm;
import featureSeqDiag.sdedit.sD_language.ConditionlistRight;
import featureSeqDiag.sdedit.sD_language.SDEditAlt;
import featureSeqDiag.sdedit.sD_language.SDEditCall;
import featureSeqDiag.sdedit.sD_language.SDEditCombinableDiagElt;
import featureSeqDiag.sdedit.sD_language.SDEditCombinedFragment;
import featureSeqDiag.sdedit.sD_language.SDEditLoop;
import featureSeqDiag.sdedit.sD_language.SDEditModel;
import featureSeqDiag.sdedit.sD_language.SDEditObj;
import featureSeqDiag.sdedit.sD_language.SDEditObjname;
import featureSeqDiag.sdedit.sD_language.SDEditOpt;
import featureSeqDiag.sdedit.sD_language.SD_languageFactory;
import featureSeqDiag.sdedit.sD_language.SD_languagePackage;

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
public class SD_languagePackageImpl extends EPackageImpl implements SD_languagePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sdEditModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sdEditObjEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sdEditObjnameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sdEditCombinableDiagEltEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sdEditCallEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sdEditCombinedFragmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sdEditAltEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sdEditLoopEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sdEditOptEClass = null;

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
  private EClass conditionlistRightEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditionElmEClass = null;

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
   * @see featureSeqDiag.sdedit.sD_language.SD_languagePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SD_languagePackageImpl()
  {
    super(eNS_URI, SD_languageFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link SD_languagePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SD_languagePackage init()
  {
    if (isInited) return (SD_languagePackage)EPackage.Registry.INSTANCE.getEPackage(SD_languagePackage.eNS_URI);

    // Obtain or create and register package
    SD_languagePackageImpl theSD_languagePackage = (SD_languagePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SD_languagePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SD_languagePackageImpl());

    isInited = true;

    // Create package meta-data objects
    theSD_languagePackage.createPackageContents();

    // Initialize created meta-data
    theSD_languagePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSD_languagePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SD_languagePackage.eNS_URI, theSD_languagePackage);
    return theSD_languagePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSDEditModel()
  {
    return sdEditModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSDEditModel_Elements()
  {
    return (EReference)sdEditModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSDEditObj()
  {
    return sdEditObjEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSDEditObj_ObjName()
  {
    return (EReference)sdEditObjEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSDEditObj_Type()
  {
    return (EAttribute)sdEditObjEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSDEditObjname()
  {
    return sdEditObjnameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSDEditObjname_Name()
  {
    return (EAttribute)sdEditObjnameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSDEditCombinableDiagElt()
  {
    return sdEditCombinableDiagEltEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSDEditCall()
  {
    return sdEditCallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSDEditCall_Caller()
  {
    return (EReference)sdEditCallEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSDEditCall_ReturnMessage()
  {
    return (EAttribute)sdEditCallEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSDEditCall_Called()
  {
    return (EReference)sdEditCallEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSDEditCall_Name()
  {
    return (EAttribute)sdEditCallEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSDEditCall_Params()
  {
    return (EAttribute)sdEditCallEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSDEditCall_ParamLists()
  {
    return (EAttribute)sdEditCallEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSDEditCombinedFragment()
  {
    return sdEditCombinedFragmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSDEditAlt()
  {
    return sdEditAltEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSDEditAlt_CondAlt()
  {
    return (EReference)sdEditAltEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSDEditAlt_Conseq()
  {
    return (EReference)sdEditAltEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSDEditAlt_Alters()
  {
    return (EReference)sdEditAltEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSDEditLoop()
  {
    return sdEditLoopEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSDEditLoop_CondLoop()
  {
    return (EReference)sdEditLoopEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSDEditLoop_Body()
  {
    return (EReference)sdEditLoopEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSDEditOpt()
  {
    return sdEditOptEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSDEditOpt_CondOpt()
  {
    return (EReference)sdEditOptEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSDEditOpt_Opts()
  {
    return (EReference)sdEditOptEClass.getEStructuralFeatures().get(1);
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
  public EReference getCondition_CondLeft()
  {
    return (EReference)conditionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCondition_ConlistRight()
  {
    return (EReference)conditionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConditionlistRight()
  {
    return conditionlistRightEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConditionlistRight_CondRight()
  {
    return (EReference)conditionlistRightEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConditionElm()
  {
    return conditionElmEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConditionElm_OperandN()
  {
    return (EAttribute)conditionElmEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConditionElm_OperandStr()
  {
    return (EAttribute)conditionElmEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SD_languageFactory getSD_languageFactory()
  {
    return (SD_languageFactory)getEFactoryInstance();
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
    sdEditModelEClass = createEClass(SD_EDIT_MODEL);
    createEReference(sdEditModelEClass, SD_EDIT_MODEL__ELEMENTS);

    sdEditObjEClass = createEClass(SD_EDIT_OBJ);
    createEReference(sdEditObjEClass, SD_EDIT_OBJ__OBJ_NAME);
    createEAttribute(sdEditObjEClass, SD_EDIT_OBJ__TYPE);

    sdEditObjnameEClass = createEClass(SD_EDIT_OBJNAME);
    createEAttribute(sdEditObjnameEClass, SD_EDIT_OBJNAME__NAME);

    sdEditCombinableDiagEltEClass = createEClass(SD_EDIT_COMBINABLE_DIAG_ELT);

    sdEditCallEClass = createEClass(SD_EDIT_CALL);
    createEReference(sdEditCallEClass, SD_EDIT_CALL__CALLER);
    createEAttribute(sdEditCallEClass, SD_EDIT_CALL__RETURN_MESSAGE);
    createEReference(sdEditCallEClass, SD_EDIT_CALL__CALLED);
    createEAttribute(sdEditCallEClass, SD_EDIT_CALL__NAME);
    createEAttribute(sdEditCallEClass, SD_EDIT_CALL__PARAMS);
    createEAttribute(sdEditCallEClass, SD_EDIT_CALL__PARAM_LISTS);

    sdEditCombinedFragmentEClass = createEClass(SD_EDIT_COMBINED_FRAGMENT);

    sdEditAltEClass = createEClass(SD_EDIT_ALT);
    createEReference(sdEditAltEClass, SD_EDIT_ALT__COND_ALT);
    createEReference(sdEditAltEClass, SD_EDIT_ALT__CONSEQ);
    createEReference(sdEditAltEClass, SD_EDIT_ALT__ALTERS);

    sdEditLoopEClass = createEClass(SD_EDIT_LOOP);
    createEReference(sdEditLoopEClass, SD_EDIT_LOOP__COND_LOOP);
    createEReference(sdEditLoopEClass, SD_EDIT_LOOP__BODY);

    sdEditOptEClass = createEClass(SD_EDIT_OPT);
    createEReference(sdEditOptEClass, SD_EDIT_OPT__COND_OPT);
    createEReference(sdEditOptEClass, SD_EDIT_OPT__OPTS);

    conditionEClass = createEClass(CONDITION);
    createEReference(conditionEClass, CONDITION__COND_LEFT);
    createEReference(conditionEClass, CONDITION__CONLIST_RIGHT);

    conditionlistRightEClass = createEClass(CONDITIONLIST_RIGHT);
    createEReference(conditionlistRightEClass, CONDITIONLIST_RIGHT__COND_RIGHT);

    conditionElmEClass = createEClass(CONDITION_ELM);
    createEAttribute(conditionElmEClass, CONDITION_ELM__OPERAND_N);
    createEAttribute(conditionElmEClass, CONDITION_ELM__OPERAND_STR);
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
    sdEditCallEClass.getESuperTypes().add(this.getSDEditCombinableDiagElt());
    sdEditCombinedFragmentEClass.getESuperTypes().add(this.getSDEditCombinableDiagElt());
    sdEditAltEClass.getESuperTypes().add(this.getSDEditCombinedFragment());
    sdEditLoopEClass.getESuperTypes().add(this.getSDEditCombinedFragment());
    sdEditOptEClass.getESuperTypes().add(this.getSDEditCombinedFragment());

    // Initialize classes and features; add operations and parameters
    initEClass(sdEditModelEClass, SDEditModel.class, "SDEditModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSDEditModel_Elements(), ecorePackage.getEObject(), null, "elements", null, 0, -1, SDEditModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sdEditObjEClass, SDEditObj.class, "SDEditObj", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSDEditObj_ObjName(), this.getSDEditObjname(), null, "objName", null, 0, 1, SDEditObj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSDEditObj_Type(), ecorePackage.getEString(), "type", null, 0, 1, SDEditObj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sdEditObjnameEClass, SDEditObjname.class, "SDEditObjname", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSDEditObjname_Name(), ecorePackage.getEString(), "name", null, 0, 1, SDEditObjname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sdEditCombinableDiagEltEClass, SDEditCombinableDiagElt.class, "SDEditCombinableDiagElt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(sdEditCallEClass, SDEditCall.class, "SDEditCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSDEditCall_Caller(), this.getSDEditObjname(), null, "caller", null, 0, 1, SDEditCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSDEditCall_ReturnMessage(), ecorePackage.getEString(), "returnMessage", null, 0, 1, SDEditCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSDEditCall_Called(), this.getSDEditObjname(), null, "called", null, 0, 1, SDEditCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSDEditCall_Name(), ecorePackage.getEString(), "name", null, 0, 1, SDEditCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSDEditCall_Params(), ecorePackage.getEString(), "params", null, 0, 1, SDEditCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSDEditCall_ParamLists(), ecorePackage.getEString(), "paramLists", null, 0, -1, SDEditCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sdEditCombinedFragmentEClass, SDEditCombinedFragment.class, "SDEditCombinedFragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(sdEditAltEClass, SDEditAlt.class, "SDEditAlt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSDEditAlt_CondAlt(), this.getCondition(), null, "condAlt", null, 0, 1, SDEditAlt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSDEditAlt_Conseq(), this.getSDEditCombinableDiagElt(), null, "conseq", null, 0, -1, SDEditAlt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSDEditAlt_Alters(), this.getSDEditCombinableDiagElt(), null, "alters", null, 0, -1, SDEditAlt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sdEditLoopEClass, SDEditLoop.class, "SDEditLoop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSDEditLoop_CondLoop(), this.getCondition(), null, "condLoop", null, 0, 1, SDEditLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSDEditLoop_Body(), this.getSDEditCombinableDiagElt(), null, "body", null, 0, -1, SDEditLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sdEditOptEClass, SDEditOpt.class, "SDEditOpt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSDEditOpt_CondOpt(), this.getCondition(), null, "condOpt", null, 0, 1, SDEditOpt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSDEditOpt_Opts(), this.getSDEditCombinableDiagElt(), null, "opts", null, 0, -1, SDEditOpt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCondition_CondLeft(), this.getConditionElm(), null, "condLeft", null, 0, -1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCondition_ConlistRight(), this.getConditionlistRight(), null, "conlistRight", null, 0, -1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conditionlistRightEClass, ConditionlistRight.class, "ConditionlistRight", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConditionlistRight_CondRight(), this.getConditionElm(), null, "condRight", null, 0, 1, ConditionlistRight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conditionElmEClass, ConditionElm.class, "ConditionElm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConditionElm_OperandN(), ecorePackage.getEInt(), "operandN", null, 0, 1, ConditionElm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConditionElm_OperandStr(), ecorePackage.getEString(), "operandStr", null, 0, 1, ConditionElm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //SD_languagePackageImpl
