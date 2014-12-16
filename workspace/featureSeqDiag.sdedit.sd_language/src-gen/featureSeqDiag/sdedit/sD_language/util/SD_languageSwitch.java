/**
 */
package featureSeqDiag.sdedit.sD_language.util;

import featureSeqDiag.sdedit.sD_language.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see featureSeqDiag.sdedit.sD_language.SD_languagePackage
 * @generated
 */
public class SD_languageSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SD_languagePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SD_languageSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = SD_languagePackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case SD_languagePackage.SD_EDIT_MODEL:
      {
        SDEditModel sdEditModel = (SDEditModel)theEObject;
        T result = caseSDEditModel(sdEditModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SD_languagePackage.SD_EDIT_OBJ:
      {
        SDEditObj sdEditObj = (SDEditObj)theEObject;
        T result = caseSDEditObj(sdEditObj);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SD_languagePackage.SD_EDIT_OBJNAME:
      {
        SDEditObjname sdEditObjname = (SDEditObjname)theEObject;
        T result = caseSDEditObjname(sdEditObjname);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SD_languagePackage.SD_EDIT_COMBINABLE_DIAG_ELT:
      {
        SDEditCombinableDiagElt sdEditCombinableDiagElt = (SDEditCombinableDiagElt)theEObject;
        T result = caseSDEditCombinableDiagElt(sdEditCombinableDiagElt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SD_languagePackage.SD_EDIT_CALL:
      {
        SDEditCall sdEditCall = (SDEditCall)theEObject;
        T result = caseSDEditCall(sdEditCall);
        if (result == null) result = caseSDEditCombinableDiagElt(sdEditCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SD_languagePackage.SD_EDIT_COMBINED_FRAGMENT:
      {
        SDEditCombinedFragment sdEditCombinedFragment = (SDEditCombinedFragment)theEObject;
        T result = caseSDEditCombinedFragment(sdEditCombinedFragment);
        if (result == null) result = caseSDEditCombinableDiagElt(sdEditCombinedFragment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SD_languagePackage.SD_EDIT_ALT:
      {
        SDEditAlt sdEditAlt = (SDEditAlt)theEObject;
        T result = caseSDEditAlt(sdEditAlt);
        if (result == null) result = caseSDEditCombinedFragment(sdEditAlt);
        if (result == null) result = caseSDEditCombinableDiagElt(sdEditAlt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SD_languagePackage.SD_EDIT_LOOP:
      {
        SDEditLoop sdEditLoop = (SDEditLoop)theEObject;
        T result = caseSDEditLoop(sdEditLoop);
        if (result == null) result = caseSDEditCombinedFragment(sdEditLoop);
        if (result == null) result = caseSDEditCombinableDiagElt(sdEditLoop);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SD_languagePackage.SD_EDIT_OPT:
      {
        SDEditOpt sdEditOpt = (SDEditOpt)theEObject;
        T result = caseSDEditOpt(sdEditOpt);
        if (result == null) result = caseSDEditCombinedFragment(sdEditOpt);
        if (result == null) result = caseSDEditCombinableDiagElt(sdEditOpt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SD_languagePackage.CONDITION:
      {
        Condition condition = (Condition)theEObject;
        T result = caseCondition(condition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SD_languagePackage.CONDITIONLIST_RIGHT:
      {
        ConditionlistRight conditionlistRight = (ConditionlistRight)theEObject;
        T result = caseConditionlistRight(conditionlistRight);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SD_languagePackage.CONDITION_ELM:
      {
        ConditionElm conditionElm = (ConditionElm)theEObject;
        T result = caseConditionElm(conditionElm);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SD Edit Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SD Edit Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSDEditModel(SDEditModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SD Edit Obj</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SD Edit Obj</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSDEditObj(SDEditObj object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SD Edit Objname</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SD Edit Objname</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSDEditObjname(SDEditObjname object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SD Edit Combinable Diag Elt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SD Edit Combinable Diag Elt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSDEditCombinableDiagElt(SDEditCombinableDiagElt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SD Edit Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SD Edit Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSDEditCall(SDEditCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SD Edit Combined Fragment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SD Edit Combined Fragment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSDEditCombinedFragment(SDEditCombinedFragment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SD Edit Alt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SD Edit Alt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSDEditAlt(SDEditAlt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SD Edit Loop</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SD Edit Loop</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSDEditLoop(SDEditLoop object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SD Edit Opt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SD Edit Opt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSDEditOpt(SDEditOpt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCondition(Condition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Conditionlist Right</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Conditionlist Right</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConditionlistRight(ConditionlistRight object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Condition Elm</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Condition Elm</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConditionElm(ConditionElm object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //SD_languageSwitch
