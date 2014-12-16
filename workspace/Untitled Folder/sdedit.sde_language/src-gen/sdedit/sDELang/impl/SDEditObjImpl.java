/**
 */
package sdedit.sDELang.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import sdedit.sDELang.SDELangPackage;
import sdedit.sDELang.SDEditObj;
import sdedit.sDELang.SDEditObjname;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SD Edit Obj</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sdedit.sDELang.impl.SDEditObjImpl#getObjName <em>Obj Name</em>}</li>
 *   <li>{@link sdedit.sDELang.impl.SDEditObjImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SDEditObjImpl extends MinimalEObjectImpl.Container implements SDEditObj
{
  /**
   * The cached value of the '{@link #getObjName() <em>Obj Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjName()
   * @generated
   * @ordered
   */
  protected SDEditObjname objName;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SDEditObjImpl()
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
    return SDELangPackage.Literals.SD_EDIT_OBJ;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SDEditObjname getObjName()
  {
    return objName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetObjName(SDEditObjname newObjName, NotificationChain msgs)
  {
    SDEditObjname oldObjName = objName;
    objName = newObjName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SDELangPackage.SD_EDIT_OBJ__OBJ_NAME, oldObjName, newObjName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObjName(SDEditObjname newObjName)
  {
    if (newObjName != objName)
    {
      NotificationChain msgs = null;
      if (objName != null)
        msgs = ((InternalEObject)objName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SDELangPackage.SD_EDIT_OBJ__OBJ_NAME, null, msgs);
      if (newObjName != null)
        msgs = ((InternalEObject)newObjName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SDELangPackage.SD_EDIT_OBJ__OBJ_NAME, null, msgs);
      msgs = basicSetObjName(newObjName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SDELangPackage.SD_EDIT_OBJ__OBJ_NAME, newObjName, newObjName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SDELangPackage.SD_EDIT_OBJ__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SDELangPackage.SD_EDIT_OBJ__OBJ_NAME:
        return basicSetObjName(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case SDELangPackage.SD_EDIT_OBJ__OBJ_NAME:
        return getObjName();
      case SDELangPackage.SD_EDIT_OBJ__TYPE:
        return getType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SDELangPackage.SD_EDIT_OBJ__OBJ_NAME:
        setObjName((SDEditObjname)newValue);
        return;
      case SDELangPackage.SD_EDIT_OBJ__TYPE:
        setType((String)newValue);
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
      case SDELangPackage.SD_EDIT_OBJ__OBJ_NAME:
        setObjName((SDEditObjname)null);
        return;
      case SDELangPackage.SD_EDIT_OBJ__TYPE:
        setType(TYPE_EDEFAULT);
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
      case SDELangPackage.SD_EDIT_OBJ__OBJ_NAME:
        return objName != null;
      case SDELangPackage.SD_EDIT_OBJ__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
    result.append(" (type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //SDEditObjImpl
