/**
 */
package featureSeqDiag.sdcombin.sDC_language.impl;

import featureSeqDiag.sdcombin.sDC_language.Alternative;
import featureSeqDiag.sdcombin.sDC_language.Contexte;
import featureSeqDiag.sdcombin.sDC_language.Feature;
import featureSeqDiag.sdcombin.sDC_language.Loop;
import featureSeqDiag.sdcombin.sDC_language.Option;
import featureSeqDiag.sdcombin.sDC_language.SDC_languagePackage;
import featureSeqDiag.sdcombin.sDC_language.Sequence;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contexte</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link featureSeqDiag.sdcombin.sDC_language.impl.ContexteImpl#getObjof <em>Objof</em>}</li>
 *   <li>{@link featureSeqDiag.sdcombin.sDC_language.impl.ContexteImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link featureSeqDiag.sdcombin.sDC_language.impl.ContexteImpl#getAlternative <em>Alternative</em>}</li>
 *   <li>{@link featureSeqDiag.sdcombin.sDC_language.impl.ContexteImpl#getLoop <em>Loop</em>}</li>
 *   <li>{@link featureSeqDiag.sdcombin.sDC_language.impl.ContexteImpl#getOption <em>Option</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContexteImpl extends MinimalEObjectImpl.Container implements Contexte
{
  /**
   * The cached value of the '{@link #getObjof() <em>Objof</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjof()
   * @generated
   * @ordered
   */
  protected Feature objof;

  /**
   * The cached value of the '{@link #getSequence() <em>Sequence</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSequence()
   * @generated
   * @ordered
   */
  protected Sequence sequence;

  /**
   * The cached value of the '{@link #getAlternative() <em>Alternative</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlternative()
   * @generated
   * @ordered
   */
  protected Alternative alternative;

  /**
   * The cached value of the '{@link #getLoop() <em>Loop</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLoop()
   * @generated
   * @ordered
   */
  protected Loop loop;

  /**
   * The cached value of the '{@link #getOption() <em>Option</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOption()
   * @generated
   * @ordered
   */
  protected Option option;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContexteImpl()
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
    return SDC_languagePackage.Literals.CONTEXTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature getObjof()
  {
    if (objof != null && objof.eIsProxy())
    {
      InternalEObject oldObjof = (InternalEObject)objof;
      objof = (Feature)eResolveProxy(oldObjof);
      if (objof != oldObjof)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SDC_languagePackage.CONTEXTE__OBJOF, oldObjof, objof));
      }
    }
    return objof;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature basicGetObjof()
  {
    return objof;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObjof(Feature newObjof)
  {
    Feature oldObjof = objof;
    objof = newObjof;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SDC_languagePackage.CONTEXTE__OBJOF, oldObjof, objof));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sequence getSequence()
  {
    return sequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSequence(Sequence newSequence, NotificationChain msgs)
  {
    Sequence oldSequence = sequence;
    sequence = newSequence;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SDC_languagePackage.CONTEXTE__SEQUENCE, oldSequence, newSequence);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSequence(Sequence newSequence)
  {
    if (newSequence != sequence)
    {
      NotificationChain msgs = null;
      if (sequence != null)
        msgs = ((InternalEObject)sequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SDC_languagePackage.CONTEXTE__SEQUENCE, null, msgs);
      if (newSequence != null)
        msgs = ((InternalEObject)newSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SDC_languagePackage.CONTEXTE__SEQUENCE, null, msgs);
      msgs = basicSetSequence(newSequence, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SDC_languagePackage.CONTEXTE__SEQUENCE, newSequence, newSequence));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Alternative getAlternative()
  {
    return alternative;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAlternative(Alternative newAlternative, NotificationChain msgs)
  {
    Alternative oldAlternative = alternative;
    alternative = newAlternative;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SDC_languagePackage.CONTEXTE__ALTERNATIVE, oldAlternative, newAlternative);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlternative(Alternative newAlternative)
  {
    if (newAlternative != alternative)
    {
      NotificationChain msgs = null;
      if (alternative != null)
        msgs = ((InternalEObject)alternative).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SDC_languagePackage.CONTEXTE__ALTERNATIVE, null, msgs);
      if (newAlternative != null)
        msgs = ((InternalEObject)newAlternative).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SDC_languagePackage.CONTEXTE__ALTERNATIVE, null, msgs);
      msgs = basicSetAlternative(newAlternative, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SDC_languagePackage.CONTEXTE__ALTERNATIVE, newAlternative, newAlternative));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Loop getLoop()
  {
    return loop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLoop(Loop newLoop, NotificationChain msgs)
  {
    Loop oldLoop = loop;
    loop = newLoop;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SDC_languagePackage.CONTEXTE__LOOP, oldLoop, newLoop);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLoop(Loop newLoop)
  {
    if (newLoop != loop)
    {
      NotificationChain msgs = null;
      if (loop != null)
        msgs = ((InternalEObject)loop).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SDC_languagePackage.CONTEXTE__LOOP, null, msgs);
      if (newLoop != null)
        msgs = ((InternalEObject)newLoop).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SDC_languagePackage.CONTEXTE__LOOP, null, msgs);
      msgs = basicSetLoop(newLoop, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SDC_languagePackage.CONTEXTE__LOOP, newLoop, newLoop));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Option getOption()
  {
    return option;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOption(Option newOption, NotificationChain msgs)
  {
    Option oldOption = option;
    option = newOption;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SDC_languagePackage.CONTEXTE__OPTION, oldOption, newOption);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOption(Option newOption)
  {
    if (newOption != option)
    {
      NotificationChain msgs = null;
      if (option != null)
        msgs = ((InternalEObject)option).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SDC_languagePackage.CONTEXTE__OPTION, null, msgs);
      if (newOption != null)
        msgs = ((InternalEObject)newOption).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SDC_languagePackage.CONTEXTE__OPTION, null, msgs);
      msgs = basicSetOption(newOption, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SDC_languagePackage.CONTEXTE__OPTION, newOption, newOption));
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
      case SDC_languagePackage.CONTEXTE__SEQUENCE:
        return basicSetSequence(null, msgs);
      case SDC_languagePackage.CONTEXTE__ALTERNATIVE:
        return basicSetAlternative(null, msgs);
      case SDC_languagePackage.CONTEXTE__LOOP:
        return basicSetLoop(null, msgs);
      case SDC_languagePackage.CONTEXTE__OPTION:
        return basicSetOption(null, msgs);
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
      case SDC_languagePackage.CONTEXTE__OBJOF:
        if (resolve) return getObjof();
        return basicGetObjof();
      case SDC_languagePackage.CONTEXTE__SEQUENCE:
        return getSequence();
      case SDC_languagePackage.CONTEXTE__ALTERNATIVE:
        return getAlternative();
      case SDC_languagePackage.CONTEXTE__LOOP:
        return getLoop();
      case SDC_languagePackage.CONTEXTE__OPTION:
        return getOption();
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
      case SDC_languagePackage.CONTEXTE__OBJOF:
        setObjof((Feature)newValue);
        return;
      case SDC_languagePackage.CONTEXTE__SEQUENCE:
        setSequence((Sequence)newValue);
        return;
      case SDC_languagePackage.CONTEXTE__ALTERNATIVE:
        setAlternative((Alternative)newValue);
        return;
      case SDC_languagePackage.CONTEXTE__LOOP:
        setLoop((Loop)newValue);
        return;
      case SDC_languagePackage.CONTEXTE__OPTION:
        setOption((Option)newValue);
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
      case SDC_languagePackage.CONTEXTE__OBJOF:
        setObjof((Feature)null);
        return;
      case SDC_languagePackage.CONTEXTE__SEQUENCE:
        setSequence((Sequence)null);
        return;
      case SDC_languagePackage.CONTEXTE__ALTERNATIVE:
        setAlternative((Alternative)null);
        return;
      case SDC_languagePackage.CONTEXTE__LOOP:
        setLoop((Loop)null);
        return;
      case SDC_languagePackage.CONTEXTE__OPTION:
        setOption((Option)null);
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
      case SDC_languagePackage.CONTEXTE__OBJOF:
        return objof != null;
      case SDC_languagePackage.CONTEXTE__SEQUENCE:
        return sequence != null;
      case SDC_languagePackage.CONTEXTE__ALTERNATIVE:
        return alternative != null;
      case SDC_languagePackage.CONTEXTE__LOOP:
        return loop != null;
      case SDC_languagePackage.CONTEXTE__OPTION:
        return option != null;
    }
    return super.eIsSet(featureID);
  }

} //ContexteImpl
