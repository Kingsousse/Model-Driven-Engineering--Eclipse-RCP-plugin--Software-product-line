/**
 */
package sdedit.sDELang.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sdedit.sDELang.Condition;
import sdedit.sDELang.ConditionElm;
import sdedit.sDELang.ConditionlistRight;
import sdedit.sDELang.SDELangPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sdedit.sDELang.impl.ConditionImpl#getCondLeft <em>Cond Left</em>}</li>
 *   <li>{@link sdedit.sDELang.impl.ConditionImpl#getConlistRight <em>Conlist Right</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionImpl extends MinimalEObjectImpl.Container implements Condition
{
  /**
   * The cached value of the '{@link #getCondLeft() <em>Cond Left</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondLeft()
   * @generated
   * @ordered
   */
  protected EList<ConditionElm> condLeft;

  /**
   * The cached value of the '{@link #getConlistRight() <em>Conlist Right</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConlistRight()
   * @generated
   * @ordered
   */
  protected EList<ConditionlistRight> conlistRight;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConditionImpl()
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
    return SDELangPackage.Literals.CONDITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ConditionElm> getCondLeft()
  {
    if (condLeft == null)
    {
      condLeft = new EObjectContainmentEList<ConditionElm>(ConditionElm.class, this, SDELangPackage.CONDITION__COND_LEFT);
    }
    return condLeft;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ConditionlistRight> getConlistRight()
  {
    if (conlistRight == null)
    {
      conlistRight = new EObjectContainmentEList<ConditionlistRight>(ConditionlistRight.class, this, SDELangPackage.CONDITION__CONLIST_RIGHT);
    }
    return conlistRight;
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
      case SDELangPackage.CONDITION__COND_LEFT:
        return ((InternalEList<?>)getCondLeft()).basicRemove(otherEnd, msgs);
      case SDELangPackage.CONDITION__CONLIST_RIGHT:
        return ((InternalEList<?>)getConlistRight()).basicRemove(otherEnd, msgs);
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
      case SDELangPackage.CONDITION__COND_LEFT:
        return getCondLeft();
      case SDELangPackage.CONDITION__CONLIST_RIGHT:
        return getConlistRight();
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
      case SDELangPackage.CONDITION__COND_LEFT:
        getCondLeft().clear();
        getCondLeft().addAll((Collection<? extends ConditionElm>)newValue);
        return;
      case SDELangPackage.CONDITION__CONLIST_RIGHT:
        getConlistRight().clear();
        getConlistRight().addAll((Collection<? extends ConditionlistRight>)newValue);
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
      case SDELangPackage.CONDITION__COND_LEFT:
        getCondLeft().clear();
        return;
      case SDELangPackage.CONDITION__CONLIST_RIGHT:
        getConlistRight().clear();
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
      case SDELangPackage.CONDITION__COND_LEFT:
        return condLeft != null && !condLeft.isEmpty();
      case SDELangPackage.CONDITION__CONLIST_RIGHT:
        return conlistRight != null && !conlistRight.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ConditionImpl
