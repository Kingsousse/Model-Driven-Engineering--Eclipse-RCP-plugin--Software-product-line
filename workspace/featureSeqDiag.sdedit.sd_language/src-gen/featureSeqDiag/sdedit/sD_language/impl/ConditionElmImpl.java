/**
 */
package featureSeqDiag.sdedit.sD_language.impl;

import featureSeqDiag.sdedit.sD_language.ConditionElm;
import featureSeqDiag.sdedit.sD_language.SD_languagePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition Elm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link featureSeqDiag.sdedit.sD_language.impl.ConditionElmImpl#getOperandN <em>Operand N</em>}</li>
 *   <li>{@link featureSeqDiag.sdedit.sD_language.impl.ConditionElmImpl#getOperandStr <em>Operand Str</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionElmImpl extends MinimalEObjectImpl.Container implements ConditionElm
{
  /**
   * The default value of the '{@link #getOperandN() <em>Operand N</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperandN()
   * @generated
   * @ordered
   */
  protected static final int OPERAND_N_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getOperandN() <em>Operand N</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperandN()
   * @generated
   * @ordered
   */
  protected int operandN = OPERAND_N_EDEFAULT;

  /**
   * The default value of the '{@link #getOperandStr() <em>Operand Str</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperandStr()
   * @generated
   * @ordered
   */
  protected static final String OPERAND_STR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOperandStr() <em>Operand Str</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperandStr()
   * @generated
   * @ordered
   */
  protected String operandStr = OPERAND_STR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConditionElmImpl()
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
    return SD_languagePackage.Literals.CONDITION_ELM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getOperandN()
  {
    return operandN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperandN(int newOperandN)
  {
    int oldOperandN = operandN;
    operandN = newOperandN;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SD_languagePackage.CONDITION_ELM__OPERAND_N, oldOperandN, operandN));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOperandStr()
  {
    return operandStr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperandStr(String newOperandStr)
  {
    String oldOperandStr = operandStr;
    operandStr = newOperandStr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SD_languagePackage.CONDITION_ELM__OPERAND_STR, oldOperandStr, operandStr));
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
      case SD_languagePackage.CONDITION_ELM__OPERAND_N:
        return getOperandN();
      case SD_languagePackage.CONDITION_ELM__OPERAND_STR:
        return getOperandStr();
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
      case SD_languagePackage.CONDITION_ELM__OPERAND_N:
        setOperandN((Integer)newValue);
        return;
      case SD_languagePackage.CONDITION_ELM__OPERAND_STR:
        setOperandStr((String)newValue);
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
      case SD_languagePackage.CONDITION_ELM__OPERAND_N:
        setOperandN(OPERAND_N_EDEFAULT);
        return;
      case SD_languagePackage.CONDITION_ELM__OPERAND_STR:
        setOperandStr(OPERAND_STR_EDEFAULT);
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
      case SD_languagePackage.CONDITION_ELM__OPERAND_N:
        return operandN != OPERAND_N_EDEFAULT;
      case SD_languagePackage.CONDITION_ELM__OPERAND_STR:
        return OPERAND_STR_EDEFAULT == null ? operandStr != null : !OPERAND_STR_EDEFAULT.equals(operandStr);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (operandN: ");
    result.append(operandN);
    result.append(", operandStr: ");
    result.append(operandStr);
    result.append(')');
    return result.toString();
  }

} //ConditionElmImpl
