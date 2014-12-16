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

import sdcombin.sDCLang.Alternative;
import sdcombin.sDCLang.Condition;
import sdcombin.sDCLang.Contexte;
import sdcombin.sDCLang.SDCLangPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alternative</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sdcombin.sDCLang.impl.AlternativeImpl#getConditionAlt <em>Condition Alt</em>}</li>
 *   <li>{@link sdcombin.sDCLang.impl.AlternativeImpl#getContexteIF <em>Contexte IF</em>}</li>
 *   <li>{@link sdcombin.sDCLang.impl.AlternativeImpl#getContexteELSE <em>Contexte ELSE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlternativeImpl extends MinimalEObjectImpl.Container implements Alternative
{
  /**
   * The cached value of the '{@link #getConditionAlt() <em>Condition Alt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditionAlt()
   * @generated
   * @ordered
   */
  protected Condition conditionAlt;

  /**
   * The cached value of the '{@link #getContexteIF() <em>Contexte IF</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContexteIF()
   * @generated
   * @ordered
   */
  protected EList<Contexte> contexteIF;

  /**
   * The cached value of the '{@link #getContexteELSE() <em>Contexte ELSE</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContexteELSE()
   * @generated
   * @ordered
   */
  protected EList<Contexte> contexteELSE;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AlternativeImpl()
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
    return SDCLangPackage.Literals.ALTERNATIVE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition getConditionAlt()
  {
    return conditionAlt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConditionAlt(Condition newConditionAlt, NotificationChain msgs)
  {
    Condition oldConditionAlt = conditionAlt;
    conditionAlt = newConditionAlt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SDCLangPackage.ALTERNATIVE__CONDITION_ALT, oldConditionAlt, newConditionAlt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConditionAlt(Condition newConditionAlt)
  {
    if (newConditionAlt != conditionAlt)
    {
      NotificationChain msgs = null;
      if (conditionAlt != null)
        msgs = ((InternalEObject)conditionAlt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SDCLangPackage.ALTERNATIVE__CONDITION_ALT, null, msgs);
      if (newConditionAlt != null)
        msgs = ((InternalEObject)newConditionAlt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SDCLangPackage.ALTERNATIVE__CONDITION_ALT, null, msgs);
      msgs = basicSetConditionAlt(newConditionAlt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SDCLangPackage.ALTERNATIVE__CONDITION_ALT, newConditionAlt, newConditionAlt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Contexte> getContexteIF()
  {
    if (contexteIF == null)
    {
      contexteIF = new EObjectContainmentEList<Contexte>(Contexte.class, this, SDCLangPackage.ALTERNATIVE__CONTEXTE_IF);
    }
    return contexteIF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Contexte> getContexteELSE()
  {
    if (contexteELSE == null)
    {
      contexteELSE = new EObjectContainmentEList<Contexte>(Contexte.class, this, SDCLangPackage.ALTERNATIVE__CONTEXTE_ELSE);
    }
    return contexteELSE;
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
      case SDCLangPackage.ALTERNATIVE__CONDITION_ALT:
        return basicSetConditionAlt(null, msgs);
      case SDCLangPackage.ALTERNATIVE__CONTEXTE_IF:
        return ((InternalEList<?>)getContexteIF()).basicRemove(otherEnd, msgs);
      case SDCLangPackage.ALTERNATIVE__CONTEXTE_ELSE:
        return ((InternalEList<?>)getContexteELSE()).basicRemove(otherEnd, msgs);
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
      case SDCLangPackage.ALTERNATIVE__CONDITION_ALT:
        return getConditionAlt();
      case SDCLangPackage.ALTERNATIVE__CONTEXTE_IF:
        return getContexteIF();
      case SDCLangPackage.ALTERNATIVE__CONTEXTE_ELSE:
        return getContexteELSE();
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
      case SDCLangPackage.ALTERNATIVE__CONDITION_ALT:
        setConditionAlt((Condition)newValue);
        return;
      case SDCLangPackage.ALTERNATIVE__CONTEXTE_IF:
        getContexteIF().clear();
        getContexteIF().addAll((Collection<? extends Contexte>)newValue);
        return;
      case SDCLangPackage.ALTERNATIVE__CONTEXTE_ELSE:
        getContexteELSE().clear();
        getContexteELSE().addAll((Collection<? extends Contexte>)newValue);
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
      case SDCLangPackage.ALTERNATIVE__CONDITION_ALT:
        setConditionAlt((Condition)null);
        return;
      case SDCLangPackage.ALTERNATIVE__CONTEXTE_IF:
        getContexteIF().clear();
        return;
      case SDCLangPackage.ALTERNATIVE__CONTEXTE_ELSE:
        getContexteELSE().clear();
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
      case SDCLangPackage.ALTERNATIVE__CONDITION_ALT:
        return conditionAlt != null;
      case SDCLangPackage.ALTERNATIVE__CONTEXTE_IF:
        return contexteIF != null && !contexteIF.isEmpty();
      case SDCLangPackage.ALTERNATIVE__CONTEXTE_ELSE:
        return contexteELSE != null && !contexteELSE.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AlternativeImpl
