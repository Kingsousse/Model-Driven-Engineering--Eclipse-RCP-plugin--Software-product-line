/**
 */
package sdedit.sDELang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition Elm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sdedit.sDELang.ConditionElm#getOperandN <em>Operand N</em>}</li>
 *   <li>{@link sdedit.sDELang.ConditionElm#getOperandStr <em>Operand Str</em>}</li>
 * </ul>
 * </p>
 *
 * @see sdedit.sDELang.SDELangPackage#getConditionElm()
 * @model
 * @generated
 */
public interface ConditionElm extends EObject
{
  /**
   * Returns the value of the '<em><b>Operand N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operand N</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operand N</em>' attribute.
   * @see #setOperandN(int)
   * @see sdedit.sDELang.SDELangPackage#getConditionElm_OperandN()
   * @model
   * @generated
   */
  int getOperandN();

  /**
   * Sets the value of the '{@link sdedit.sDELang.ConditionElm#getOperandN <em>Operand N</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operand N</em>' attribute.
   * @see #getOperandN()
   * @generated
   */
  void setOperandN(int value);

  /**
   * Returns the value of the '<em><b>Operand Str</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operand Str</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operand Str</em>' attribute.
   * @see #setOperandStr(String)
   * @see sdedit.sDELang.SDELangPackage#getConditionElm_OperandStr()
   * @model
   * @generated
   */
  String getOperandStr();

  /**
   * Sets the value of the '{@link sdedit.sDELang.ConditionElm#getOperandStr <em>Operand Str</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operand Str</em>' attribute.
   * @see #getOperandStr()
   * @generated
   */
  void setOperandStr(String value);

} // ConditionElm
