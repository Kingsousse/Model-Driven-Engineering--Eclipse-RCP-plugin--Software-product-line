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
import sdedit.sDELang.SDEditAlt;
import sdedit.sDELang.SDEditCombinableDiagElt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SD Edit Alt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sdedit.sDELang.impl.SDEditAltImpl#getCondAlt <em>Cond Alt</em>}</li>
 *   <li>{@link sdedit.sDELang.impl.SDEditAltImpl#getConseq <em>Conseq</em>}</li>
 *   <li>{@link sdedit.sDELang.impl.SDEditAltImpl#getAlters <em>Alters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SDEditAltImpl extends SDEditCombinedFragmentImpl implements SDEditAlt
{
  /**
   * The cached value of the '{@link #getCondAlt() <em>Cond Alt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondAlt()
   * @generated
   * @ordered
   */
  protected Condition condAlt;

  /**
   * The cached value of the '{@link #getConseq() <em>Conseq</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConseq()
   * @generated
   * @ordered
   */
  protected EList<SDEditCombinableDiagElt> conseq;

  /**
   * The cached value of the '{@link #getAlters() <em>Alters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlters()
   * @generated
   * @ordered
   */
  protected EList<SDEditCombinableDiagElt> alters;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SDEditAltImpl()
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
    return SDELangPackage.Literals.SD_EDIT_ALT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition getCondAlt()
  {
    return condAlt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondAlt(Condition newCondAlt, NotificationChain msgs)
  {
    Condition oldCondAlt = condAlt;
    condAlt = newCondAlt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SDELangPackage.SD_EDIT_ALT__COND_ALT, oldCondAlt, newCondAlt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondAlt(Condition newCondAlt)
  {
    if (newCondAlt != condAlt)
    {
      NotificationChain msgs = null;
      if (condAlt != null)
        msgs = ((InternalEObject)condAlt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SDELangPackage.SD_EDIT_ALT__COND_ALT, null, msgs);
      if (newCondAlt != null)
        msgs = ((InternalEObject)newCondAlt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SDELangPackage.SD_EDIT_ALT__COND_ALT, null, msgs);
      msgs = basicSetCondAlt(newCondAlt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SDELangPackage.SD_EDIT_ALT__COND_ALT, newCondAlt, newCondAlt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SDEditCombinableDiagElt> getConseq()
  {
    if (conseq == null)
    {
      conseq = new EObjectContainmentEList<SDEditCombinableDiagElt>(SDEditCombinableDiagElt.class, this, SDELangPackage.SD_EDIT_ALT__CONSEQ);
    }
    return conseq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SDEditCombinableDiagElt> getAlters()
  {
    if (alters == null)
    {
      alters = new EObjectContainmentEList<SDEditCombinableDiagElt>(SDEditCombinableDiagElt.class, this, SDELangPackage.SD_EDIT_ALT__ALTERS);
    }
    return alters;
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
      case SDELangPackage.SD_EDIT_ALT__COND_ALT:
        return basicSetCondAlt(null, msgs);
      case SDELangPackage.SD_EDIT_ALT__CONSEQ:
        return ((InternalEList<?>)getConseq()).basicRemove(otherEnd, msgs);
      case SDELangPackage.SD_EDIT_ALT__ALTERS:
        return ((InternalEList<?>)getAlters()).basicRemove(otherEnd, msgs);
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
      case SDELangPackage.SD_EDIT_ALT__COND_ALT:
        return getCondAlt();
      case SDELangPackage.SD_EDIT_ALT__CONSEQ:
        return getConseq();
      case SDELangPackage.SD_EDIT_ALT__ALTERS:
        return getAlters();
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
      case SDELangPackage.SD_EDIT_ALT__COND_ALT:
        setCondAlt((Condition)newValue);
        return;
      case SDELangPackage.SD_EDIT_ALT__CONSEQ:
        getConseq().clear();
        getConseq().addAll((Collection<? extends SDEditCombinableDiagElt>)newValue);
        return;
      case SDELangPackage.SD_EDIT_ALT__ALTERS:
        getAlters().clear();
        getAlters().addAll((Collection<? extends SDEditCombinableDiagElt>)newValue);
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
      case SDELangPackage.SD_EDIT_ALT__COND_ALT:
        setCondAlt((Condition)null);
        return;
      case SDELangPackage.SD_EDIT_ALT__CONSEQ:
        getConseq().clear();
        return;
      case SDELangPackage.SD_EDIT_ALT__ALTERS:
        getAlters().clear();
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
      case SDELangPackage.SD_EDIT_ALT__COND_ALT:
        return condAlt != null;
      case SDELangPackage.SD_EDIT_ALT__CONSEQ:
        return conseq != null && !conseq.isEmpty();
      case SDELangPackage.SD_EDIT_ALT__ALTERS:
        return alters != null && !alters.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SDEditAltImpl
