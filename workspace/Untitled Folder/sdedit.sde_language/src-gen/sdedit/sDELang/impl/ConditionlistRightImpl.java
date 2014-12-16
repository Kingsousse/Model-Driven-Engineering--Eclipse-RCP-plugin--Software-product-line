/**
 */
package sdedit.sDELang.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import sdedit.sDELang.ConditionElm;
import sdedit.sDELang.ConditionlistRight;
import sdedit.sDELang.SDELangPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditionlist Right</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sdedit.sDELang.impl.ConditionlistRightImpl#getCondRight <em>Cond Right</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionlistRightImpl extends MinimalEObjectImpl.Container implements ConditionlistRight
{
  /**
   * The cached value of the '{@link #getCondRight() <em>Cond Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondRight()
   * @generated
   * @ordered
   */
  protected ConditionElm condRight;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConditionlistRightImpl()
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
    return SDELangPackage.Literals.CONDITIONLIST_RIGHT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionElm getCondRight()
  {
    return condRight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondRight(ConditionElm newCondRight, NotificationChain msgs)
  {
    ConditionElm oldCondRight = condRight;
    condRight = newCondRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SDELangPackage.CONDITIONLIST_RIGHT__COND_RIGHT, oldCondRight, newCondRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondRight(ConditionElm newCondRight)
  {
    if (newCondRight != condRight)
    {
      NotificationChain msgs = null;
      if (condRight != null)
        msgs = ((InternalEObject)condRight).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SDELangPackage.CONDITIONLIST_RIGHT__COND_RIGHT, null, msgs);
      if (newCondRight != null)
        msgs = ((InternalEObject)newCondRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SDELangPackage.CONDITIONLIST_RIGHT__COND_RIGHT, null, msgs);
      msgs = basicSetCondRight(newCondRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SDELangPackage.CONDITIONLIST_RIGHT__COND_RIGHT, newCondRight, newCondRight));
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
      case SDELangPackage.CONDITIONLIST_RIGHT__COND_RIGHT:
        return basicSetCondRight(null, msgs);
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
      case SDELangPackage.CONDITIONLIST_RIGHT__COND_RIGHT:
        return getCondRight();
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
      case SDELangPackage.CONDITIONLIST_RIGHT__COND_RIGHT:
        setCondRight((ConditionElm)newValue);
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
      case SDELangPackage.CONDITIONLIST_RIGHT__COND_RIGHT:
        setCondRight((ConditionElm)null);
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
      case SDELangPackage.CONDITIONLIST_RIGHT__COND_RIGHT:
        return condRight != null;
    }
    return super.eIsSet(featureID);
  }

} //ConditionlistRightImpl
