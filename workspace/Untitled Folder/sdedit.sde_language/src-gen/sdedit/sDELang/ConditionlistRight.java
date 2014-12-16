/**
 */
package sdedit.sDELang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditionlist Right</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sdedit.sDELang.ConditionlistRight#getCondRight <em>Cond Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see sdedit.sDELang.SDELangPackage#getConditionlistRight()
 * @model
 * @generated
 */
public interface ConditionlistRight extends EObject
{
  /**
   * Returns the value of the '<em><b>Cond Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cond Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cond Right</em>' containment reference.
   * @see #setCondRight(ConditionElm)
   * @see sdedit.sDELang.SDELangPackage#getConditionlistRight_CondRight()
   * @model containment="true"
   * @generated
   */
  ConditionElm getCondRight();

  /**
   * Sets the value of the '{@link sdedit.sDELang.ConditionlistRight#getCondRight <em>Cond Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cond Right</em>' containment reference.
   * @see #getCondRight()
   * @generated
   */
  void setCondRight(ConditionElm value);

} // ConditionlistRight
