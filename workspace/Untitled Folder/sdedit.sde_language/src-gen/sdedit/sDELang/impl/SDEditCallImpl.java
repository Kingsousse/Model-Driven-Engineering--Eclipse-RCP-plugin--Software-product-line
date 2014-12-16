/**
 */
package sdedit.sDELang.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import sdedit.sDELang.SDELangPackage;
import sdedit.sDELang.SDEditCall;
import sdedit.sDELang.SDEditObjname;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SD Edit Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sdedit.sDELang.impl.SDEditCallImpl#getCaller <em>Caller</em>}</li>
 *   <li>{@link sdedit.sDELang.impl.SDEditCallImpl#getReturnMessage <em>Return Message</em>}</li>
 *   <li>{@link sdedit.sDELang.impl.SDEditCallImpl#getCalled <em>Called</em>}</li>
 *   <li>{@link sdedit.sDELang.impl.SDEditCallImpl#getName <em>Name</em>}</li>
 *   <li>{@link sdedit.sDELang.impl.SDEditCallImpl#getParams <em>Params</em>}</li>
 *   <li>{@link sdedit.sDELang.impl.SDEditCallImpl#getParamLists <em>Param Lists</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SDEditCallImpl extends SDEditCombinableDiagEltImpl implements SDEditCall
{
  /**
   * The cached value of the '{@link #getCaller() <em>Caller</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCaller()
   * @generated
   * @ordered
   */
  protected SDEditObjname caller;

  /**
   * The default value of the '{@link #getReturnMessage() <em>Return Message</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnMessage()
   * @generated
   * @ordered
   */
  protected static final String RETURN_MESSAGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReturnMessage() <em>Return Message</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnMessage()
   * @generated
   * @ordered
   */
  protected String returnMessage = RETURN_MESSAGE_EDEFAULT;

  /**
   * The cached value of the '{@link #getCalled() <em>Called</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCalled()
   * @generated
   * @ordered
   */
  protected SDEditObjname called;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getParams() <em>Params</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected static final String PARAMS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getParams() <em>Params</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected String params = PARAMS_EDEFAULT;

  /**
   * The cached value of the '{@link #getParamLists() <em>Param Lists</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParamLists()
   * @generated
   * @ordered
   */
  protected EList<String> paramLists;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SDEditCallImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SDELangPackage.Literals.SD_EDIT_CALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SDEditObjname getCaller()
  {
    if (caller != null && caller.eIsProxy())
    {
      InternalEObject oldCaller = (InternalEObject)caller;
      caller = (SDEditObjname)eResolveProxy(oldCaller);
      if (caller != oldCaller)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SDELangPackage.SD_EDIT_CALL__CALLER, oldCaller, caller));
      }
    }
    return caller;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SDEditObjname basicGetCaller()
  {
    return caller;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCaller(SDEditObjname newCaller)
  {
    SDEditObjname oldCaller = caller;
    caller = newCaller;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SDELangPackage.SD_EDIT_CALL__CALLER, oldCaller, caller));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getReturnMessage()
  {
    return returnMessage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturnMessage(String newReturnMessage)
  {
    String oldReturnMessage = returnMessage;
    returnMessage = newReturnMessage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SDELangPackage.SD_EDIT_CALL__RETURN_MESSAGE, oldReturnMessage, returnMessage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SDEditObjname getCalled()
  {
    if (called != null && called.eIsProxy())
    {
      InternalEObject oldCalled = (InternalEObject)called;
      called = (SDEditObjname)eResolveProxy(oldCalled);
      if (called != oldCalled)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SDELangPackage.SD_EDIT_CALL__CALLED, oldCalled, called));
      }
    }
    return called;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SDEditObjname basicGetCalled()
  {
    return called;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCalled(SDEditObjname newCalled)
  {
    SDEditObjname oldCalled = called;
    called = newCalled;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SDELangPackage.SD_EDIT_CALL__CALLED, oldCalled, called));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SDELangPackage.SD_EDIT_CALL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getParams()
  {
    return params;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParams(String newParams)
  {
    String oldParams = params;
    params = newParams;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SDELangPackage.SD_EDIT_CALL__PARAMS, oldParams, params));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getParamLists()
  {
    if (paramLists == null)
    {
      paramLists = new EDataTypeEList<String>(String.class, this, SDELangPackage.SD_EDIT_CALL__PARAM_LISTS);
    }
    return paramLists;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SDELangPackage.SD_EDIT_CALL__CALLER:
        if (resolve) return getCaller();
        return basicGetCaller();
      case SDELangPackage.SD_EDIT_CALL__RETURN_MESSAGE:
        return getReturnMessage();
      case SDELangPackage.SD_EDIT_CALL__CALLED:
        if (resolve) return getCalled();
        return basicGetCalled();
      case SDELangPackage.SD_EDIT_CALL__NAME:
        return getName();
      case SDELangPackage.SD_EDIT_CALL__PARAMS:
        return getParams();
      case SDELangPackage.SD_EDIT_CALL__PARAM_LISTS:
        return getParamLists();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SDELangPackage.SD_EDIT_CALL__CALLER:
        setCaller((SDEditObjname)newValue);
        return;
      case SDELangPackage.SD_EDIT_CALL__RETURN_MESSAGE:
        setReturnMessage((String)newValue);
        return;
      case SDELangPackage.SD_EDIT_CALL__CALLED:
        setCalled((SDEditObjname)newValue);
        return;
      case SDELangPackage.SD_EDIT_CALL__NAME:
        setName((String)newValue);
        return;
      case SDELangPackage.SD_EDIT_CALL__PARAMS:
        setParams((String)newValue);
        return;
      case SDELangPackage.SD_EDIT_CALL__PARAM_LISTS:
        getParamLists().clear();
        getParamLists().addAll((Collection<? extends String>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SDELangPackage.SD_EDIT_CALL__CALLER:
        setCaller((SDEditObjname)null);
        return;
      case SDELangPackage.SD_EDIT_CALL__RETURN_MESSAGE:
        setReturnMessage(RETURN_MESSAGE_EDEFAULT);
        return;
      case SDELangPackage.SD_EDIT_CALL__CALLED:
        setCalled((SDEditObjname)null);
        return;
      case SDELangPackage.SD_EDIT_CALL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SDELangPackage.SD_EDIT_CALL__PARAMS:
        setParams(PARAMS_EDEFAULT);
        return;
      case SDELangPackage.SD_EDIT_CALL__PARAM_LISTS:
        getParamLists().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SDELangPackage.SD_EDIT_CALL__CALLER:
        return caller != null;
      case SDELangPackage.SD_EDIT_CALL__RETURN_MESSAGE:
        return RETURN_MESSAGE_EDEFAULT == null ? returnMessage != null : !RETURN_MESSAGE_EDEFAULT.equals(returnMessage);
      case SDELangPackage.SD_EDIT_CALL__CALLED:
        return called != null;
      case SDELangPackage.SD_EDIT_CALL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SDELangPackage.SD_EDIT_CALL__PARAMS:
        return PARAMS_EDEFAULT == null ? params != null : !PARAMS_EDEFAULT.equals(params);
      case SDELangPackage.SD_EDIT_CALL__PARAM_LISTS:
        return paramLists != null && !paramLists.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (returnMessage: ");
    result.append(returnMessage);
    result.append(", name: ");
    result.append(name);
    result.append(", params: ");
    result.append(params);
    result.append(", paramLists: ");
    result.append(paramLists);
    result.append(')');
    return result.toString();
  }

} //SDEditCallImpl
