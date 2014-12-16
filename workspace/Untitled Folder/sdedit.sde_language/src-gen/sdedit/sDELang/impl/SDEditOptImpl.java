/**
 */
package sdedit.sDELang.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sdedit.sDELang.Condition;
import sdedit.sDELang.SDELangPackage;
import sdedit.sDELang.SDEditCombinableDiagElt;
import sdedit.sDELang.SDEditOpt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SD Edit Opt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sdedit.sDELang.impl.SDEditOptImpl#getCondOpt <em>Cond Opt</em>}</li>
 *   <li>{@link sdedit.sDELang.impl.SDEditOptImpl#getOpts <em>Opts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SDEditOptImpl extends SDEditCombinedFragmentImpl implements SDEditOpt
{
  /**
   * The cached value of the '{@link #getCondOpt() <em>Cond Opt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondOpt()
   * @generated
   * @ordered
   */
  protected Condition condOpt;

  /**
   * The cached value of the '{@link #getOpts() <em>Opts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpts()
   * @generated
   * @ordered
   */
  protected EList<SDEditCombinableDiagElt> opts;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SDEditOptImpl()
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
    return SDELangPackage.Literals.SD_EDIT_OPT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition getCondOpt()
  {
    return condOpt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondOpt(Condition newCondOpt, NotificationChain msgs)
  {
    Condition oldCondOpt = condOpt;
    condOpt = newCondOpt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SDELangPackage.SD_EDIT_OPT__COND_OPT, oldCondOpt, newCondOpt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondOpt(Condition newCondOpt)
  {
    if (newCondOpt != condOpt)
    {
      NotificationChain msgs = null;
      if (condOpt != null)
        msgs = ((InternalEObject)condOpt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SDELangPackage.SD_EDIT_OPT__COND_OPT, null, msgs);
      if (newCondOpt != null)
        msgs = ((InternalEObject)newCondOpt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SDELangPackage.SD_EDIT_OPT__COND_OPT, null, msgs);
      msgs = basicSetCondOpt(newCondOpt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SDELangPackage.SD_EDIT_OPT__COND_OPT, newCondOpt, newCondOpt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SDEditCombinableDiagElt> getOpts()
  {
    if (opts == null)
    {
      opts = new EObjectContainmentEList<SDEditCombinableDiagElt>(SDEditCombinableDiagElt.class, this, SDELangPackage.SD_EDIT_OPT__OPTS);
    }
    return opts;
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
      case SDELangPackage.SD_EDIT_OPT__COND_OPT:
        return basicSetCondOpt(null, msgs);
      case SDELangPackage.SD_EDIT_OPT__OPTS:
        return ((InternalEList<?>)getOpts()).basicRemove(otherEnd, msgs);
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
      case SDELangPackage.SD_EDIT_OPT__COND_OPT:
        return getCondOpt();
      case SDELangPackage.SD_EDIT_OPT__OPTS:
        return getOpts();
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
      case SDELangPackage.SD_EDIT_OPT__COND_OPT:
        setCondOpt((Condition)newValue);
        return;
      case SDELangPackage.SD_EDIT_OPT__OPTS:
        getOpts().clear();
        getOpts().addAll((Collection<? extends SDEditCombinableDiagElt>)newValue);
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
      case SDELangPackage.SD_EDIT_OPT__COND_OPT:
        setCondOpt((Condition)null);
        return;
      case SDELangPackage.SD_EDIT_OPT__OPTS:
        getOpts().clear();
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
      case SDELangPackage.SD_EDIT_OPT__COND_OPT:
        return condOpt != null;
      case SDELangPackage.SD_EDIT_OPT__OPTS:
        return opts != null && !opts.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SDEditOptImpl
