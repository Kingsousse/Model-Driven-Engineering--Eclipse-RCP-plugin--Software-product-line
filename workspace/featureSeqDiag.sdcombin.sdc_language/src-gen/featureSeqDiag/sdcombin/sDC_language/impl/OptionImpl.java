/**
 */
package featureSeqDiag.sdcombin.sDC_language.impl;

import featureSeqDiag.sdcombin.sDC_language.Condition;
import featureSeqDiag.sdcombin.sDC_language.Contexte;
import featureSeqDiag.sdcombin.sDC_language.Option;
import featureSeqDiag.sdcombin.sDC_language.SDC_languagePackage;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link featureSeqDiag.sdcombin.sDC_language.impl.OptionImpl#getConditionOpt <em>Condition Opt</em>}</li>
 *   <li>{@link featureSeqDiag.sdcombin.sDC_language.impl.OptionImpl#getContexte <em>Contexte</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OptionImpl extends MinimalEObjectImpl.Container implements Option
{
  /**
   * The cached value of the '{@link #getConditionOpt() <em>Condition Opt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditionOpt()
   * @generated
   * @ordered
   */
  protected Condition conditionOpt;

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
  protected OptionImpl()
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
    return SDC_languagePackage.Literals.OPTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition getConditionOpt()
  {
    return conditionOpt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConditionOpt(Condition newConditionOpt, NotificationChain msgs)
  {
    Condition oldConditionOpt = conditionOpt;
    conditionOpt = newConditionOpt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SDC_languagePackage.OPTION__CONDITION_OPT, oldConditionOpt, newConditionOpt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConditionOpt(Condition newConditionOpt)
  {
    if (newConditionOpt != conditionOpt)
    {
      NotificationChain msgs = null;
      if (conditionOpt != null)
        msgs = ((InternalEObject)conditionOpt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SDC_languagePackage.OPTION__CONDITION_OPT, null, msgs);
      if (newConditionOpt != null)
        msgs = ((InternalEObject)newConditionOpt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SDC_languagePackage.OPTION__CONDITION_OPT, null, msgs);
      msgs = basicSetConditionOpt(newConditionOpt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SDC_languagePackage.OPTION__CONDITION_OPT, newConditionOpt, newConditionOpt));
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
      contexte = new EObjectContainmentEList<Contexte>(Contexte.class, this, SDC_languagePackage.OPTION__CONTEXTE);
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
      case SDC_languagePackage.OPTION__CONDITION_OPT:
        return basicSetConditionOpt(null, msgs);
      case SDC_languagePackage.OPTION__CONTEXTE:
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
      case SDC_languagePackage.OPTION__CONDITION_OPT:
        return getConditionOpt();
      case SDC_languagePackage.OPTION__CONTEXTE:
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
      case SDC_languagePackage.OPTION__CONDITION_OPT:
        setConditionOpt((Condition)newValue);
        return;
      case SDC_languagePackage.OPTION__CONTEXTE:
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
      case SDC_languagePackage.OPTION__CONDITION_OPT:
        setConditionOpt((Condition)null);
        return;
      case SDC_languagePackage.OPTION__CONTEXTE:
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
      case SDC_languagePackage.OPTION__CONDITION_OPT:
        return conditionOpt != null;
      case SDC_languagePackage.OPTION__CONTEXTE:
        return contexte != null && !contexte.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //OptionImpl
