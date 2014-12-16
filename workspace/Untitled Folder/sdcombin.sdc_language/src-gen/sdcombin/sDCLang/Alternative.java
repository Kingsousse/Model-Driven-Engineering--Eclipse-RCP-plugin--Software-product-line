/**
 */
package sdcombin.sDCLang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alternative</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sdcombin.sDCLang.Alternative#getConditionAlt <em>Condition Alt</em>}</li>
 *   <li>{@link sdcombin.sDCLang.Alternative#getContexteIF <em>Contexte IF</em>}</li>
 *   <li>{@link sdcombin.sDCLang.Alternative#getContexteELSE <em>Contexte ELSE</em>}</li>
 * </ul>
 * </p>
 *
 * @see sdcombin.sDCLang.SDCLangPackage#getAlternative()
 * @model
 * @generated
 */
public interface Alternative extends EObject
{
  /**
   * Returns the value of the '<em><b>Condition Alt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition Alt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition Alt</em>' containment reference.
   * @see #setConditionAlt(Condition)
   * @see sdcombin.sDCLang.SDCLangPackage#getAlternative_ConditionAlt()
   * @model containment="true"
   * @generated
   */
  Condition getConditionAlt();

  /**
   * Sets the value of the '{@link sdcombin.sDCLang.Alternative#getConditionAlt <em>Condition Alt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition Alt</em>' containment reference.
   * @see #getConditionAlt()
   * @generated
   */
  void setConditionAlt(Condition value);

  /**
   * Returns the value of the '<em><b>Contexte IF</b></em>' containment reference list.
   * The list contents are of type {@link sdcombin.sDCLang.Contexte}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contexte IF</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contexte IF</em>' containment reference list.
   * @see sdcombin.sDCLang.SDCLangPackage#getAlternative_ContexteIF()
   * @model containment="true"
   * @generated
   */
  EList<Contexte> getContexteIF();

  /**
   * Returns the value of the '<em><b>Contexte ELSE</b></em>' containment reference list.
   * The list contents are of type {@link sdcombin.sDCLang.Contexte}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contexte ELSE</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contexte ELSE</em>' containment reference list.
   * @see sdcombin.sDCLang.SDCLangPackage#getAlternative_ContexteELSE()
   * @model containment="true"
   * @generated
   */
  EList<Contexte> getContexteELSE();

} // Alternative
