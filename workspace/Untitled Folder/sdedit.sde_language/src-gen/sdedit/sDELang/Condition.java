/**
 */
package sdedit.sDELang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sdedit.sDELang.Condition#getCondLeft <em>Cond Left</em>}</li>
 *   <li>{@link sdedit.sDELang.Condition#getConlistRight <em>Conlist Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see sdedit.sDELang.SDELangPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject
{
  /**
   * Returns the value of the '<em><b>Cond Left</b></em>' containment reference list.
   * The list contents are of type {@link sdedit.sDELang.ConditionElm}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cond Left</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cond Left</em>' containment reference list.
   * @see sdedit.sDELang.SDELangPackage#getCondition_CondLeft()
   * @model containment="true"
   * @generated
   */
  EList<ConditionElm> getCondLeft();

  /**
   * Returns the value of the '<em><b>Conlist Right</b></em>' containment reference list.
   * The list contents are of type {@link sdedit.sDELang.ConditionlistRight}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conlist Right</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conlist Right</em>' containment reference list.
   * @see sdedit.sDELang.SDELangPackage#getCondition_ConlistRight()
   * @model containment="true"
   * @generated
   */
  EList<ConditionlistRight> getConlistRight();

} // Condition
