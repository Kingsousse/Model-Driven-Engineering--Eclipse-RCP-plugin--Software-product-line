/**
 */
package sdedit.sDELang;

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
 * @see sdedit.sDELang.SDELangFactory
 * @model kind="package"
 * @generated
 */
public interface SDELangPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "sDELang";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.SDELang.sdedit";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "sDELang";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SDELangPackage eINSTANCE = sdedit.sDELang.impl.SDELangPackageImpl.init();

  /**
   * The meta object id for the '{@link sdedit.sDELang.impl.SDEditModelImpl <em>SD Edit Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sdedit.sDELang.impl.SDEditModelImpl
   * @see sdedit.sDELang.impl.SDELangPackageImpl#getSDEditModel()
   * @generated
   */
  int SD_EDIT_MODEL = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SD_EDIT_MODEL__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>SD Edit Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SD_EDIT_MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link sdedit.sDELang.impl.SDEditObjImpl <em>SD Edit Obj</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sdedit.sDELang.impl.SDEditObjImpl
   * @see sdedit.sDELang.impl.SDELangPackageImpl#getSDEditObj()
   * @generated
   */
  int SD_EDIT_OBJ = 1;

  /**
   * The feature id for the '<em><b>Obj Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SD_EDIT_OBJ__OBJ_NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SD_EDIT_OBJ__TYPE = 1;

  /**
   * The number of structural features of the '<em>SD Edit Obj</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SD_EDIT_OBJ_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sdedit.sDELang.impl.SDEditObjnameImpl <em>SD Edit Objname</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sdedit.sDELang.impl.SDEditObjnameImpl
   * @see sdedit.sDELang.impl.SDELangPackageImpl#getSDEditObjname()
   * @generated
   */
  int SD_EDIT_OBJNAME = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SD_EDIT_OBJNAME__NAME = 0;

  /**
   * The number of structural features of the '<em>SD Edit Objname</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SD_EDIT_OBJNAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link sdedit.sDELang.impl.SDEditCombinableDiagEltImpl <em>SD Edit Combinable Diag Elt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sdedit.sDELang.impl.SDEditCombinableDiagEltImpl
   * @see sdedit.sDELang.impl.SDELangPackageImpl#getSDEditCombinableDiagElt()
   * @generated
   */
  int SD_EDIT_COMBINABLE_DIAG_ELT = 3;

  /**
   * The number of structural features of the '<em>SD Edit Combinable Diag Elt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SD_EDIT_COMBINABLE_DIAG_ELT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link sdedit.sDELang.impl.SDEditCallImpl <em>SD Edit Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sdedit.sDELang.impl.SDEditCallImpl
   * @see sdedit.sDELang.impl.SDELangPackageImpl#getSDEditCall()
   * @generated
   */
  int SD_EDIT_CALL = 4;

  /**
   * The feature id for the '<em><b>Caller</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SD_EDIT_CALL__CALLER = SD_EDIT_COMBINABLE_DIAG_ELT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Return Message</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SD_EDIT_CALL__RETURN_MESSAGE = SD_EDIT_COMBINABLE_DIAG_ELT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Called</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SD_EDIT_CALL__CALLED = SD_EDIT_COMBINABLE_DIAG_ELT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SD_EDIT_CALL__NAME = SD_EDIT_COMBINABLE_DIAG_ELT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Params</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SD_EDIT_CALL__PARAMS = SD_EDIT_COMBINABLE_DIAG_ELT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Param Lists</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SD_EDIT_CALL__PARAM_LISTS = SD_EDIT_COMBINABLE_DIAG_ELT_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>SD Edit Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SD_EDIT_CALL_FEATURE_COUNT = SD_EDIT_COMBINABLE_DIAG_ELT_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link sdedit.sDELang.impl.SDEditCombinedFragmentImpl <em>SD Edit Combined Fragment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sdedit.sDELang.impl.SDEditCombinedFragmentImpl
   * @see sdedit.sDELang.impl.SDELangPackageImpl#getSDEditCombinedFragment()
   * @generated
   */
  int SD_EDIT_COMBINED_FRAGMENT = 5;

  /**
   * The number of structural features of the '<em>SD Edit Combined Fragment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SD_EDIT_COMBINED_FRAGMENT_FEATURE_COUNT = SD_EDIT_COMBINABLE_DIAG_ELT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link sdedit.sDELang.impl.SDEditAltImpl <em>SD Edit Alt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sdedit.sDELang.impl.SDEditAltImpl
   * @see sdedit.sDELang.impl.SDELangPackageImpl#getSDEditAlt()
   * @generated
   */
  int SD_EDIT_ALT = 6;

  /**
   * The feature id for the '<em><b>Cond Alt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SD_EDIT_ALT__COND_ALT = SD_EDIT_COMBINED_FRAGMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Conseq</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SD_EDIT_ALT__CONSEQ = SD_EDIT_COMBINED_FRAGMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Alters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SD_EDIT_ALT__ALTERS = SD_EDIT_COMBINED_FRAGMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>SD Edit Alt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SD_EDIT_ALT_FEATURE_COUNT = SD_EDIT_COMBINED_FRAGMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link sdedit.sDELang.impl.SDEditLoopImpl <em>SD Edit Loop</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sdedit.sDELang.impl.SDEditLoopImpl
   * @see sdedit.sDELang.impl.SDELangPackageImpl#getSDEditLoop()
   * @generated
   */
  int SD_EDIT_LOOP = 7;

  /**
   * The feature id for the '<em><b>Cond Loop</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SD_EDIT_LOOP__COND_LOOP = SD_EDIT_COMBINED_FRAGMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SD_EDIT_LOOP__BODY = SD_EDIT_COMBINED_FRAGMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>SD Edit Loop</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SD_EDIT_LOOP_FEATURE_COUNT = SD_EDIT_COMBINED_FRAGMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link sdedit.sDELang.impl.SDEditOptImpl <em>SD Edit Opt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sdedit.sDELang.impl.SDEditOptImpl
   * @see sdedit.sDELang.impl.SDELangPackageImpl#getSDEditOpt()
   * @generated
   */
  int SD_EDIT_OPT = 8;

  /**
   * The feature id for the '<em><b>Cond Opt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SD_EDIT_OPT__COND_OPT = SD_EDIT_COMBINED_FRAGMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Opts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SD_EDIT_OPT__OPTS = SD_EDIT_COMBINED_FRAGMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>SD Edit Opt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SD_EDIT_OPT_FEATURE_COUNT = SD_EDIT_COMBINED_FRAGMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link sdedit.sDELang.impl.ConditionImpl <em>Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sdedit.sDELang.impl.ConditionImpl
   * @see sdedit.sDELang.impl.SDELangPackageImpl#getCondition()
   * @generated
   */
  int CONDITION = 9;

  /**
   * The feature id for the '<em><b>Cond Left</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__COND_LEFT = 0;

  /**
   * The feature id for the '<em><b>Conlist Right</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__CONLIST_RIGHT = 1;

  /**
   * The number of structural features of the '<em>Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link sdedit.sDELang.impl.ConditionlistRightImpl <em>Conditionlist Right</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sdedit.sDELang.impl.ConditionlistRightImpl
   * @see sdedit.sDELang.impl.SDELangPackageImpl#getConditionlistRight()
   * @generated
   */
  int CONDITIONLIST_RIGHT = 10;

  /**
   * The feature id for the '<em><b>Cond Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONLIST_RIGHT__COND_RIGHT = 0;

  /**
   * The number of structural features of the '<em>Conditionlist Right</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONLIST_RIGHT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link sdedit.sDELang.impl.ConditionElmImpl <em>Condition Elm</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sdedit.sDELang.impl.ConditionElmImpl
   * @see sdedit.sDELang.impl.SDELangPackageImpl#getConditionElm()
   * @generated
   */
  int CONDITION_ELM = 11;

  /**
   * The feature id for the '<em><b>Operand N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_ELM__OPERAND_N = 0;

  /**
   * The feature id for the '<em><b>Operand Str</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_ELM__OPERAND_STR = 1;

  /**
   * The number of structural features of the '<em>Condition Elm</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_ELM_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link sdedit.sDELang.SDEditModel <em>SD Edit Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SD Edit Model</em>'.
   * @see sdedit.sDELang.SDEditModel
   * @generated
   */
  EClass getSDEditModel();

  /**
   * Returns the meta object for the containment reference list '{@link sdedit.sDELang.SDEditModel#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see sdedit.sDELang.SDEditModel#getElements()
   * @see #getSDEditModel()
   * @generated
   */
  EReference getSDEditModel_Elements();

  /**
   * Returns the meta object for class '{@link sdedit.sDELang.SDEditObj <em>SD Edit Obj</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SD Edit Obj</em>'.
   * @see sdedit.sDELang.SDEditObj
   * @generated
   */
  EClass getSDEditObj();

  /**
   * Returns the meta object for the containment reference '{@link sdedit.sDELang.SDEditObj#getObjName <em>Obj Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Obj Name</em>'.
   * @see sdedit.sDELang.SDEditObj#getObjName()
   * @see #getSDEditObj()
   * @generated
   */
  EReference getSDEditObj_ObjName();

  /**
   * Returns the meta object for the attribute '{@link sdedit.sDELang.SDEditObj#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see sdedit.sDELang.SDEditObj#getType()
   * @see #getSDEditObj()
   * @generated
   */
  EAttribute getSDEditObj_Type();

  /**
   * Returns the meta object for class '{@link sdedit.sDELang.SDEditObjname <em>SD Edit Objname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SD Edit Objname</em>'.
   * @see sdedit.sDELang.SDEditObjname
   * @generated
   */
  EClass getSDEditObjname();

  /**
   * Returns the meta object for the attribute '{@link sdedit.sDELang.SDEditObjname#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sdedit.sDELang.SDEditObjname#getName()
   * @see #getSDEditObjname()
   * @generated
   */
  EAttribute getSDEditObjname_Name();

  /**
   * Returns the meta object for class '{@link sdedit.sDELang.SDEditCombinableDiagElt <em>SD Edit Combinable Diag Elt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SD Edit Combinable Diag Elt</em>'.
   * @see sdedit.sDELang.SDEditCombinableDiagElt
   * @generated
   */
  EClass getSDEditCombinableDiagElt();

  /**
   * Returns the meta object for class '{@link sdedit.sDELang.SDEditCall <em>SD Edit Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SD Edit Call</em>'.
   * @see sdedit.sDELang.SDEditCall
   * @generated
   */
  EClass getSDEditCall();

  /**
   * Returns the meta object for the reference '{@link sdedit.sDELang.SDEditCall#getCaller <em>Caller</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Caller</em>'.
   * @see sdedit.sDELang.SDEditCall#getCaller()
   * @see #getSDEditCall()
   * @generated
   */
  EReference getSDEditCall_Caller();

  /**
   * Returns the meta object for the attribute '{@link sdedit.sDELang.SDEditCall#getReturnMessage <em>Return Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Return Message</em>'.
   * @see sdedit.sDELang.SDEditCall#getReturnMessage()
   * @see #getSDEditCall()
   * @generated
   */
  EAttribute getSDEditCall_ReturnMessage();

  /**
   * Returns the meta object for the reference '{@link sdedit.sDELang.SDEditCall#getCalled <em>Called</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Called</em>'.
   * @see sdedit.sDELang.SDEditCall#getCalled()
   * @see #getSDEditCall()
   * @generated
   */
  EReference getSDEditCall_Called();

  /**
   * Returns the meta object for the attribute '{@link sdedit.sDELang.SDEditCall#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sdedit.sDELang.SDEditCall#getName()
   * @see #getSDEditCall()
   * @generated
   */
  EAttribute getSDEditCall_Name();

  /**
   * Returns the meta object for the attribute '{@link sdedit.sDELang.SDEditCall#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Params</em>'.
   * @see sdedit.sDELang.SDEditCall#getParams()
   * @see #getSDEditCall()
   * @generated
   */
  EAttribute getSDEditCall_Params();

  /**
   * Returns the meta object for the attribute list '{@link sdedit.sDELang.SDEditCall#getParamLists <em>Param Lists</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Param Lists</em>'.
   * @see sdedit.sDELang.SDEditCall#getParamLists()
   * @see #getSDEditCall()
   * @generated
   */
  EAttribute getSDEditCall_ParamLists();

  /**
   * Returns the meta object for class '{@link sdedit.sDELang.SDEditCombinedFragment <em>SD Edit Combined Fragment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SD Edit Combined Fragment</em>'.
   * @see sdedit.sDELang.SDEditCombinedFragment
   * @generated
   */
  EClass getSDEditCombinedFragment();

  /**
   * Returns the meta object for class '{@link sdedit.sDELang.SDEditAlt <em>SD Edit Alt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SD Edit Alt</em>'.
   * @see sdedit.sDELang.SDEditAlt
   * @generated
   */
  EClass getSDEditAlt();

  /**
   * Returns the meta object for the containment reference '{@link sdedit.sDELang.SDEditAlt#getCondAlt <em>Cond Alt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cond Alt</em>'.
   * @see sdedit.sDELang.SDEditAlt#getCondAlt()
   * @see #getSDEditAlt()
   * @generated
   */
  EReference getSDEditAlt_CondAlt();

  /**
   * Returns the meta object for the containment reference list '{@link sdedit.sDELang.SDEditAlt#getConseq <em>Conseq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Conseq</em>'.
   * @see sdedit.sDELang.SDEditAlt#getConseq()
   * @see #getSDEditAlt()
   * @generated
   */
  EReference getSDEditAlt_Conseq();

  /**
   * Returns the meta object for the containment reference list '{@link sdedit.sDELang.SDEditAlt#getAlters <em>Alters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Alters</em>'.
   * @see sdedit.sDELang.SDEditAlt#getAlters()
   * @see #getSDEditAlt()
   * @generated
   */
  EReference getSDEditAlt_Alters();

  /**
   * Returns the meta object for class '{@link sdedit.sDELang.SDEditLoop <em>SD Edit Loop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SD Edit Loop</em>'.
   * @see sdedit.sDELang.SDEditLoop
   * @generated
   */
  EClass getSDEditLoop();

  /**
   * Returns the meta object for the containment reference '{@link sdedit.sDELang.SDEditLoop#getCondLoop <em>Cond Loop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cond Loop</em>'.
   * @see sdedit.sDELang.SDEditLoop#getCondLoop()
   * @see #getSDEditLoop()
   * @generated
   */
  EReference getSDEditLoop_CondLoop();

  /**
   * Returns the meta object for the containment reference list '{@link sdedit.sDELang.SDEditLoop#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Body</em>'.
   * @see sdedit.sDELang.SDEditLoop#getBody()
   * @see #getSDEditLoop()
   * @generated
   */
  EReference getSDEditLoop_Body();

  /**
   * Returns the meta object for class '{@link sdedit.sDELang.SDEditOpt <em>SD Edit Opt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SD Edit Opt</em>'.
   * @see sdedit.sDELang.SDEditOpt
   * @generated
   */
  EClass getSDEditOpt();

  /**
   * Returns the meta object for the containment reference '{@link sdedit.sDELang.SDEditOpt#getCondOpt <em>Cond Opt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cond Opt</em>'.
   * @see sdedit.sDELang.SDEditOpt#getCondOpt()
   * @see #getSDEditOpt()
   * @generated
   */
  EReference getSDEditOpt_CondOpt();

  /**
   * Returns the meta object for the containment reference list '{@link sdedit.sDELang.SDEditOpt#getOpts <em>Opts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Opts</em>'.
   * @see sdedit.sDELang.SDEditOpt#getOpts()
   * @see #getSDEditOpt()
   * @generated
   */
  EReference getSDEditOpt_Opts();

  /**
   * Returns the meta object for class '{@link sdedit.sDELang.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition</em>'.
   * @see sdedit.sDELang.Condition
   * @generated
   */
  EClass getCondition();

  /**
   * Returns the meta object for the containment reference list '{@link sdedit.sDELang.Condition#getCondLeft <em>Cond Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cond Left</em>'.
   * @see sdedit.sDELang.Condition#getCondLeft()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_CondLeft();

  /**
   * Returns the meta object for the containment reference list '{@link sdedit.sDELang.Condition#getConlistRight <em>Conlist Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Conlist Right</em>'.
   * @see sdedit.sDELang.Condition#getConlistRight()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_ConlistRight();

  /**
   * Returns the meta object for class '{@link sdedit.sDELang.ConditionlistRight <em>Conditionlist Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conditionlist Right</em>'.
   * @see sdedit.sDELang.ConditionlistRight
   * @generated
   */
  EClass getConditionlistRight();

  /**
   * Returns the meta object for the containment reference '{@link sdedit.sDELang.ConditionlistRight#getCondRight <em>Cond Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cond Right</em>'.
   * @see sdedit.sDELang.ConditionlistRight#getCondRight()
   * @see #getConditionlistRight()
   * @generated
   */
  EReference getConditionlistRight_CondRight();

  /**
   * Returns the meta object for class '{@link sdedit.sDELang.ConditionElm <em>Condition Elm</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition Elm</em>'.
   * @see sdedit.sDELang.ConditionElm
   * @generated
   */
  EClass getConditionElm();

  /**
   * Returns the meta object for the attribute '{@link sdedit.sDELang.ConditionElm#getOperandN <em>Operand N</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operand N</em>'.
   * @see sdedit.sDELang.ConditionElm#getOperandN()
   * @see #getConditionElm()
   * @generated
   */
  EAttribute getConditionElm_OperandN();

  /**
   * Returns the meta object for the attribute '{@link sdedit.sDELang.ConditionElm#getOperandStr <em>Operand Str</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operand Str</em>'.
   * @see sdedit.sDELang.ConditionElm#getOperandStr()
   * @see #getConditionElm()
   * @generated
   */
  EAttribute getConditionElm_OperandStr();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SDELangFactory getSDELangFactory();

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
     * The meta object literal for the '{@link sdedit.sDELang.impl.SDEditModelImpl <em>SD Edit Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sdedit.sDELang.impl.SDEditModelImpl
     * @see sdedit.sDELang.impl.SDELangPackageImpl#getSDEditModel()
     * @generated
     */
    EClass SD_EDIT_MODEL = eINSTANCE.getSDEditModel();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SD_EDIT_MODEL__ELEMENTS = eINSTANCE.getSDEditModel_Elements();

    /**
     * The meta object literal for the '{@link sdedit.sDELang.impl.SDEditObjImpl <em>SD Edit Obj</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sdedit.sDELang.impl.SDEditObjImpl
     * @see sdedit.sDELang.impl.SDELangPackageImpl#getSDEditObj()
     * @generated
     */
    EClass SD_EDIT_OBJ = eINSTANCE.getSDEditObj();

    /**
     * The meta object literal for the '<em><b>Obj Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SD_EDIT_OBJ__OBJ_NAME = eINSTANCE.getSDEditObj_ObjName();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SD_EDIT_OBJ__TYPE = eINSTANCE.getSDEditObj_Type();

    /**
     * The meta object literal for the '{@link sdedit.sDELang.impl.SDEditObjnameImpl <em>SD Edit Objname</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sdedit.sDELang.impl.SDEditObjnameImpl
     * @see sdedit.sDELang.impl.SDELangPackageImpl#getSDEditObjname()
     * @generated
     */
    EClass SD_EDIT_OBJNAME = eINSTANCE.getSDEditObjname();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SD_EDIT_OBJNAME__NAME = eINSTANCE.getSDEditObjname_Name();

    /**
     * The meta object literal for the '{@link sdedit.sDELang.impl.SDEditCombinableDiagEltImpl <em>SD Edit Combinable Diag Elt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sdedit.sDELang.impl.SDEditCombinableDiagEltImpl
     * @see sdedit.sDELang.impl.SDELangPackageImpl#getSDEditCombinableDiagElt()
     * @generated
     */
    EClass SD_EDIT_COMBINABLE_DIAG_ELT = eINSTANCE.getSDEditCombinableDiagElt();

    /**
     * The meta object literal for the '{@link sdedit.sDELang.impl.SDEditCallImpl <em>SD Edit Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sdedit.sDELang.impl.SDEditCallImpl
     * @see sdedit.sDELang.impl.SDELangPackageImpl#getSDEditCall()
     * @generated
     */
    EClass SD_EDIT_CALL = eINSTANCE.getSDEditCall();

    /**
     * The meta object literal for the '<em><b>Caller</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SD_EDIT_CALL__CALLER = eINSTANCE.getSDEditCall_Caller();

    /**
     * The meta object literal for the '<em><b>Return Message</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SD_EDIT_CALL__RETURN_MESSAGE = eINSTANCE.getSDEditCall_ReturnMessage();

    /**
     * The meta object literal for the '<em><b>Called</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SD_EDIT_CALL__CALLED = eINSTANCE.getSDEditCall_Called();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SD_EDIT_CALL__NAME = eINSTANCE.getSDEditCall_Name();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SD_EDIT_CALL__PARAMS = eINSTANCE.getSDEditCall_Params();

    /**
     * The meta object literal for the '<em><b>Param Lists</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SD_EDIT_CALL__PARAM_LISTS = eINSTANCE.getSDEditCall_ParamLists();

    /**
     * The meta object literal for the '{@link sdedit.sDELang.impl.SDEditCombinedFragmentImpl <em>SD Edit Combined Fragment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sdedit.sDELang.impl.SDEditCombinedFragmentImpl
     * @see sdedit.sDELang.impl.SDELangPackageImpl#getSDEditCombinedFragment()
     * @generated
     */
    EClass SD_EDIT_COMBINED_FRAGMENT = eINSTANCE.getSDEditCombinedFragment();

    /**
     * The meta object literal for the '{@link sdedit.sDELang.impl.SDEditAltImpl <em>SD Edit Alt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sdedit.sDELang.impl.SDEditAltImpl
     * @see sdedit.sDELang.impl.SDELangPackageImpl#getSDEditAlt()
     * @generated
     */
    EClass SD_EDIT_ALT = eINSTANCE.getSDEditAlt();

    /**
     * The meta object literal for the '<em><b>Cond Alt</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SD_EDIT_ALT__COND_ALT = eINSTANCE.getSDEditAlt_CondAlt();

    /**
     * The meta object literal for the '<em><b>Conseq</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SD_EDIT_ALT__CONSEQ = eINSTANCE.getSDEditAlt_Conseq();

    /**
     * The meta object literal for the '<em><b>Alters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SD_EDIT_ALT__ALTERS = eINSTANCE.getSDEditAlt_Alters();

    /**
     * The meta object literal for the '{@link sdedit.sDELang.impl.SDEditLoopImpl <em>SD Edit Loop</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sdedit.sDELang.impl.SDEditLoopImpl
     * @see sdedit.sDELang.impl.SDELangPackageImpl#getSDEditLoop()
     * @generated
     */
    EClass SD_EDIT_LOOP = eINSTANCE.getSDEditLoop();

    /**
     * The meta object literal for the '<em><b>Cond Loop</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SD_EDIT_LOOP__COND_LOOP = eINSTANCE.getSDEditLoop_CondLoop();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SD_EDIT_LOOP__BODY = eINSTANCE.getSDEditLoop_Body();

    /**
     * The meta object literal for the '{@link sdedit.sDELang.impl.SDEditOptImpl <em>SD Edit Opt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sdedit.sDELang.impl.SDEditOptImpl
     * @see sdedit.sDELang.impl.SDELangPackageImpl#getSDEditOpt()
     * @generated
     */
    EClass SD_EDIT_OPT = eINSTANCE.getSDEditOpt();

    /**
     * The meta object literal for the '<em><b>Cond Opt</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SD_EDIT_OPT__COND_OPT = eINSTANCE.getSDEditOpt_CondOpt();

    /**
     * The meta object literal for the '<em><b>Opts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SD_EDIT_OPT__OPTS = eINSTANCE.getSDEditOpt_Opts();

    /**
     * The meta object literal for the '{@link sdedit.sDELang.impl.ConditionImpl <em>Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sdedit.sDELang.impl.ConditionImpl
     * @see sdedit.sDELang.impl.SDELangPackageImpl#getCondition()
     * @generated
     */
    EClass CONDITION = eINSTANCE.getCondition();

    /**
     * The meta object literal for the '<em><b>Cond Left</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__COND_LEFT = eINSTANCE.getCondition_CondLeft();

    /**
     * The meta object literal for the '<em><b>Conlist Right</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__CONLIST_RIGHT = eINSTANCE.getCondition_ConlistRight();

    /**
     * The meta object literal for the '{@link sdedit.sDELang.impl.ConditionlistRightImpl <em>Conditionlist Right</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sdedit.sDELang.impl.ConditionlistRightImpl
     * @see sdedit.sDELang.impl.SDELangPackageImpl#getConditionlistRight()
     * @generated
     */
    EClass CONDITIONLIST_RIGHT = eINSTANCE.getConditionlistRight();

    /**
     * The meta object literal for the '<em><b>Cond Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONLIST_RIGHT__COND_RIGHT = eINSTANCE.getConditionlistRight_CondRight();

    /**
     * The meta object literal for the '{@link sdedit.sDELang.impl.ConditionElmImpl <em>Condition Elm</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sdedit.sDELang.impl.ConditionElmImpl
     * @see sdedit.sDELang.impl.SDELangPackageImpl#getConditionElm()
     * @generated
     */
    EClass CONDITION_ELM = eINSTANCE.getConditionElm();

    /**
     * The meta object literal for the '<em><b>Operand N</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION_ELM__OPERAND_N = eINSTANCE.getConditionElm_OperandN();

    /**
     * The meta object literal for the '<em><b>Operand Str</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION_ELM__OPERAND_STR = eINSTANCE.getConditionElm_OperandStr();

  }

} //SDELangPackage