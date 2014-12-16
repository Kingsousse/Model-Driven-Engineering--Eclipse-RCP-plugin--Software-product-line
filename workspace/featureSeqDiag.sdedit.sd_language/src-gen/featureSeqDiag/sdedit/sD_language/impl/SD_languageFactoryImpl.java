/**
 */
package featureSeqDiag.sdedit.sD_language.impl;

import featureSeqDiag.sdedit.sD_language.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SD_languageFactoryImpl extends EFactoryImpl implements SD_languageFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SD_languageFactory init()
  {
    try
    {
      SD_languageFactory theSD_languageFactory = (SD_languageFactory)EPackage.Registry.INSTANCE.getEFactory(SD_languagePackage.eNS_URI);
      if (theSD_languageFactory != null)
      {
        return theSD_languageFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SD_languageFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SD_languageFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SD_languagePackage.SD_EDIT_MODEL: return createSDEditModel();
      case SD_languagePackage.SD_EDIT_OBJ: return createSDEditObj();
      case SD_languagePackage.SD_EDIT_OBJNAME: return createSDEditObjname();
      case SD_languagePackage.SD_EDIT_COMBINABLE_DIAG_ELT: return createSDEditCombinableDiagElt();
      case SD_languagePackage.SD_EDIT_CALL: return createSDEditCall();
      case SD_languagePackage.SD_EDIT_COMBINED_FRAGMENT: return createSDEditCombinedFragment();
      case SD_languagePackage.SD_EDIT_ALT: return createSDEditAlt();
      case SD_languagePackage.SD_EDIT_LOOP: return createSDEditLoop();
      case SD_languagePackage.SD_EDIT_OPT: return createSDEditOpt();
      case SD_languagePackage.CONDITION: return createCondition();
      case SD_languagePackage.CONDITIONLIST_RIGHT: return createConditionlistRight();
      case SD_languagePackage.CONDITION_ELM: return createConditionElm();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SDEditModel createSDEditModel()
  {
    SDEditModelImpl sdEditModel = new SDEditModelImpl();
    return sdEditModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SDEditObj createSDEditObj()
  {
    SDEditObjImpl sdEditObj = new SDEditObjImpl();
    return sdEditObj;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SDEditObjname createSDEditObjname()
  {
    SDEditObjnameImpl sdEditObjname = new SDEditObjnameImpl();
    return sdEditObjname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SDEditCombinableDiagElt createSDEditCombinableDiagElt()
  {
    SDEditCombinableDiagEltImpl sdEditCombinableDiagElt = new SDEditCombinableDiagEltImpl();
    return sdEditCombinableDiagElt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SDEditCall createSDEditCall()
  {
    SDEditCallImpl sdEditCall = new SDEditCallImpl();
    return sdEditCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SDEditCombinedFragment createSDEditCombinedFragment()
  {
    SDEditCombinedFragmentImpl sdEditCombinedFragment = new SDEditCombinedFragmentImpl();
    return sdEditCombinedFragment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SDEditAlt createSDEditAlt()
  {
    SDEditAltImpl sdEditAlt = new SDEditAltImpl();
    return sdEditAlt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SDEditLoop createSDEditLoop()
  {
    SDEditLoopImpl sdEditLoop = new SDEditLoopImpl();
    return sdEditLoop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SDEditOpt createSDEditOpt()
  {
    SDEditOptImpl sdEditOpt = new SDEditOptImpl();
    return sdEditOpt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition createCondition()
  {
    ConditionImpl condition = new ConditionImpl();
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionlistRight createConditionlistRight()
  {
    ConditionlistRightImpl conditionlistRight = new ConditionlistRightImpl();
    return conditionlistRight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionElm createConditionElm()
  {
    ConditionElmImpl conditionElm = new ConditionElmImpl();
    return conditionElm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SD_languagePackage getSD_languagePackage()
  {
    return (SD_languagePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SD_languagePackage getPackage()
  {
    return SD_languagePackage.eINSTANCE;
  }

} //SD_languageFactoryImpl
