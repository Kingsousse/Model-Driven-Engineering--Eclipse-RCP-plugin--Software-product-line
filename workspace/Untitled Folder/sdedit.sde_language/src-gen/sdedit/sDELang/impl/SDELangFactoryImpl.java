/**
 */
package sdedit.sDELang.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sdedit.sDELang.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SDELangFactoryImpl extends EFactoryImpl implements SDELangFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SDELangFactory init()
  {
    try
    {
      SDELangFactory theSDELangFactory = (SDELangFactory)EPackage.Registry.INSTANCE.getEFactory(SDELangPackage.eNS_URI);
      if (theSDELangFactory != null)
      {
        return theSDELangFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SDELangFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SDELangFactoryImpl()
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
      case SDELangPackage.SD_EDIT_MODEL: return createSDEditModel();
      case SDELangPackage.SD_EDIT_OBJ: return createSDEditObj();
      case SDELangPackage.SD_EDIT_OBJNAME: return createSDEditObjname();
      case SDELangPackage.SD_EDIT_COMBINABLE_DIAG_ELT: return createSDEditCombinableDiagElt();
      case SDELangPackage.SD_EDIT_CALL: return createSDEditCall();
      case SDELangPackage.SD_EDIT_COMBINED_FRAGMENT: return createSDEditCombinedFragment();
      case SDELangPackage.SD_EDIT_ALT: return createSDEditAlt();
      case SDELangPackage.SD_EDIT_LOOP: return createSDEditLoop();
      case SDELangPackage.SD_EDIT_OPT: return createSDEditOpt();
      case SDELangPackage.CONDITION: return createCondition();
      case SDELangPackage.CONDITIONLIST_RIGHT: return createConditionlistRight();
      case SDELangPackage.CONDITION_ELM: return createConditionElm();
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
  public SDELangPackage getSDELangPackage()
  {
    return (SDELangPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SDELangPackage getPackage()
  {
    return SDELangPackage.eINSTANCE;
  }

} //SDELangFactoryImpl
