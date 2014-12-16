/**
 */
package sdcombin.sDCLang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sdcombin.sDCLang.Option#getConditionOpt <em>Condition Opt</em>}</li>
 *   <li>{@link sdcombin.sDCLang.Option#getContexte <em>Contexte</em>}</li>
 * </ul>
 * </p>
 *
 * @see sdcombin.sDCLang.SDCLangPackage#getOption()
 * @model
 * @generated
 */
public interface Option extends EObject
{
  /**
   * Returns the value of the '<em><b>Condition Opt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition Opt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition Opt</em>' containment reference.
   * @see #setConditionOpt(Condition)
   * @see sdcombin.sDCLang.SDCLangPackage#getOption_ConditionOpt()
   * @model containment="true"
   * @generated
   */
  Condition getConditionOpt();

  /**
   * Sets the value of the '{@link sdcombin.sDCLang.Option#getConditionOpt <em>Condition Opt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition Opt</em>' containment reference.
   * @see #getConditionOpt()
   * @generated
   */
  void setConditionOpt(Condition value);

  /**
   * Returns the value of the '<em><b>Contexte</b></em>' containment reference list.
   * The list contents are of type {@link sdcombin.sDCLang.Contexte}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contexte</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contexte</em>' containment reference list.
   * @see sdcombin.sDCLang.SDCLangPackage#getOption_Contexte()
   * @model containment="true"
   * @generated
   */
  EList<Contexte> getContexte();

} // Option
