/**
 */
package sdcombin.sDCLang.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import sdcombin.sDCLang.Feature;
import sdcombin.sDCLang.SDCLangPackage;
import sdcombin.sDCLang.Sequence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sdcombin.sDCLang.impl.SequenceImpl#getObjofR <em>Objof R</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SequenceImpl extends MinimalEObjectImpl.Container implements Sequence
{
  /**
   * The cached value of the '{@link #getObjofR() <em>Objof R</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjofR()
   * @generated
   * @ordered
   */
  protected EList<Feature> objofR;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SequenceImpl()
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
    return SDCLangPackage.Literals.SEQUENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Feature> getObjofR()
  {
    if (objofR == null)
    {
      objofR = new EObjectResolvingEList<Feature>(Feature.class, this, SDCLangPackage.SEQUENCE__OBJOF_R);
    }
    return objofR;
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
      case SDCLangPackage.SEQUENCE__OBJOF_R:
        return getObjofR();
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
      case SDCLangPackage.SEQUENCE__OBJOF_R:
        getObjofR().clear();
        getObjofR().addAll((Collection<? extends Feature>)newValue);
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
      case SDCLangPackage.SEQUENCE__OBJOF_R:
        getObjofR().clear();
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
      case SDCLangPackage.SEQUENCE__OBJOF_R:
        return objofR != null && !objofR.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SequenceImpl
