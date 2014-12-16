/**
 */
package sdcombin.sDCLang.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sdcombin.sDCLang.Condition;
import sdcombin.sDCLang.Contexte;
import sdcombin.sDCLang.Loop;
import sdcombin.sDCLang.SDCLangPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sdcombin.sDCLang.impl.LoopImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link sdcombin.sDCLang.impl.LoopImpl#getContexte <em>Contexte</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LoopImpl extends MinimalEObjectImpl.Container implements Loop
{
  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected Condition condition;

  /**
   * The cached value of the '{@link #getContexte() <em>Contexte</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContexte()
   * @generated
   * @ordered
   */
  protected EList<Contexte> contexte;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LoopImpl()
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
    return SDCLangPackage.Literals.LOOP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(Condition newCondition, NotificationChain msgs)
  {
    Condition oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SDCLangPackage.LOOP__CONDITION, oldCondition, newCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondition(Condition newCondition)
  {
    if (newCondition != condition)
    {
      NotificationChain msgs = null;
      if (condition != null)
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SDCLangPackage.LOOP__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SDCLangPackage.LOOP__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SDCLangPackage.LOOP__CONDITION, newCondition, newCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Contexte> getContexte()
  {
    if (contexte == null)
    {
      contexte = new EObjectContainmentEList<Contexte>(Contexte.class, this, SDCLangPackage.LOOP__CONTEXTE);
    }
    return contexte;
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
      case SDCLangPackage.LOOP__CONDITION:
        return basicSetCondition(null, msgs);
      case SDCLangPackage.LOOP__CONTEXTE:
        return ((InternalEList<?>)getContexte()).basicRemove(otherEnd, msgs);
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
      case SDCLangPackage.LOOP__CONDITION:
        return getCondition();
      case SDCLangPackage.LOOP__CONTEXTE:
        return getContexte();
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
      case SDCLangPackage.LOOP__CONDITION:
        setCondition((Condition)newValue);
        return;
      case SDCLangPackage.LOOP__CONTEXTE:
        getContexte().clear();
        getContexte().addAll((Collection<? extends Contexte>)newValue);
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
      case SDCLangPackage.LOOP__CONDITION:
        setCondition((Condition)null);
        return;
      case SDCLangPackage.LOOP__CONTEXTE:
        getContexte().clear();
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
      case SDCLangPackage.LOOP__CONDITION:
        return condition != null;
      case SDCLangPackage.LOOP__CONTEXTE:
        return contexte != null && !contexte.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //LoopImpl
