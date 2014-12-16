/**
 */
package sdcombin.sDCLang.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sdcombin.sDCLang.Contexte;
import sdcombin.sDCLang.Feature;
import sdcombin.sDCLang.SDCLangPackage;
import sdcombin.sDCLang.SequenceProg;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Prog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sdcombin.sDCLang.impl.SequenceProgImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link sdcombin.sDCLang.impl.SequenceProgImpl#getContexte <em>Contexte</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SequenceProgImpl extends MinimalEObjectImpl.Container implements SequenceProg
{
  /**
   * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeatures()
   * @generated
   * @ordered
   */
  protected EList<Feature> features;

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
  protected SequenceProgImpl()
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
    return SDCLangPackage.Literals.SEQUENCE_PROG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Feature> getFeatures()
  {
    if (features == null)
    {
      features = new EObjectContainmentEList<Feature>(Feature.class, this, SDCLangPackage.SEQUENCE_PROG__FEATURES);
    }
    return features;
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
      contexte = new EObjectContainmentEList<Contexte>(Contexte.class, this, SDCLangPackage.SEQUENCE_PROG__CONTEXTE);
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
      case SDCLangPackage.SEQUENCE_PROG__FEATURES:
        return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
      case SDCLangPackage.SEQUENCE_PROG__CONTEXTE:
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
      case SDCLangPackage.SEQUENCE_PROG__FEATURES:
        return getFeatures();
      case SDCLangPackage.SEQUENCE_PROG__CONTEXTE:
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
      case SDCLangPackage.SEQUENCE_PROG__FEATURES:
        getFeatures().clear();
        getFeatures().addAll((Collection<? extends Feature>)newValue);
        return;
      case SDCLangPackage.SEQUENCE_PROG__CONTEXTE:
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
      case SDCLangPackage.SEQUENCE_PROG__FEATURES:
        getFeatures().clear();
        return;
      case SDCLangPackage.SEQUENCE_PROG__CONTEXTE:
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
      case SDCLangPackage.SEQUENCE_PROG__FEATURES:
        return features != null && !features.isEmpty();
      case SDCLangPackage.SEQUENCE_PROG__CONTEXTE:
        return contexte != null && !contexte.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SequenceProgImpl
