/**
 */
package featureSeqDiag.sdedit.sD_language.impl;

import featureSeqDiag.sdedit.sD_language.Condition;
import featureSeqDiag.sdedit.sD_language.SDEditCombinableDiagElt;
import featureSeqDiag.sdedit.sD_language.SDEditLoop;
import featureSeqDiag.sdedit.sD_language.SD_languagePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SD Edit Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link featureSeqDiag.sdedit.sD_language.impl.SDEditLoopImpl#getCondLoop <em>Cond Loop</em>}</li>
 *   <li>{@link featureSeqDiag.sdedit.sD_language.impl.SDEditLoopImpl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SDEditLoopImpl extends SDEditCombinedFragmentImpl implements SDEditLoop
{
  /**
   * The cached value of the '{@link #getCondLoop() <em>Cond Loop</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondLoop()
   * @generated
   * @ordered
   */
  protected Condition condLoop;

  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected EList<SDEditCombinableDiagElt> body;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SDEditLoopImpl()
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
    return SD_languagePackage.Literals.SD_EDIT_LOOP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition getCondLoop()
  {
    return condLoop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondLoop(Condition newCondLoop, NotificationChain msgs)
  {
    Condition oldCondLoop = condLoop;
    condLoop = newCondLoop;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SD_languagePackage.SD_EDIT_LOOP__COND_LOOP, oldCondLoop, newCondLoop);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondLoop(Condition newCondLoop)
  {
    if (newCondLoop != condLoop)
    {
      NotificationChain msgs = null;
      if (condLoop != null)
        msgs = ((InternalEObject)condLoop).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SD_languagePackage.SD_EDIT_LOOP__COND_LOOP, null, msgs);
      if (newCondLoop != null)
        msgs = ((InternalEObject)newCondLoop).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SD_languagePackage.SD_EDIT_LOOP__COND_LOOP, null, msgs);
      msgs = basicSetCondLoop(newCondLoop, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SD_languagePackage.SD_EDIT_LOOP__COND_LOOP, newCondLoop, newCondLoop));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SDEditCombinableDiagElt> getBody()
  {
    if (body == null)
    {
      body = new EObjectContainmentEList<SDEditCombinableDiagElt>(SDEditCombinableDiagElt.class, this, SD_languagePackage.SD_EDIT_LOOP__BODY);
    }
    return body;
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
      case SD_languagePackage.SD_EDIT_LOOP__COND_LOOP:
        return basicSetCondLoop(null, msgs);
      case SD_languagePackage.SD_EDIT_LOOP__BODY:
        return ((InternalEList<?>)getBody()).basicRemove(otherEnd, msgs);
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
      case SD_languagePackage.SD_EDIT_LOOP__COND_LOOP:
        return getCondLoop();
      case SD_languagePackage.SD_EDIT_LOOP__BODY:
        return getBody();
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
      case SD_languagePackage.SD_EDIT_LOOP__COND_LOOP:
        setCondLoop((Condition)newValue);
        return;
      case SD_languagePackage.SD_EDIT_LOOP__BODY:
        getBody().clear();
        getBody().addAll((Collection<? extends SDEditCombinableDiagElt>)newValue);
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
      case SD_languagePackage.SD_EDIT_LOOP__COND_LOOP:
        setCondLoop((Condition)null);
        return;
      case SD_languagePackage.SD_EDIT_LOOP__BODY:
        getBody().clear();
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
      case SD_languagePackage.SD_EDIT_LOOP__COND_LOOP:
        return condLoop != null;
      case SD_languagePackage.SD_EDIT_LOOP__BODY:
        return body != null && !body.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SDEditLoopImpl
