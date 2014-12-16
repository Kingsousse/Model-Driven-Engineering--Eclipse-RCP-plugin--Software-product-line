/**
 */
package featureSeqDiag.sdcombin.sDC_language;

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
 *   <li>{@link featureSeqDiag.sdcombin.sDC_language.Alternative#getConditionAlt <em>Condition Alt</em>}</li>
 *   <li>{@link featureSeqDiag.sdcombin.sDC_language.Alternative#getContexteIF <em>Contexte IF</em>}</li>
 *   <li>{@link featureSeqDiag.sdcombin.sDC_language.Alternative#getContexteELSE <em>Contexte ELSE</em>}</li>
 * </ul>
 * </p>
 *
 * @see featureSeqDiag.sdcombin.sDC_language.SDC_languagePackage#getAlternative()
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
   * @see featureSeqDiag.sdcombin.sDC_language.SDC_languagePackage#getAlternative_ConditionAlt()
   * @model containment="true"
   * @generated
   */
  Condition getConditionAlt();

  /**
   * Sets the value of the '{@link featureSeqDiag.sdcombin.sDC_language.Alternative#getConditionAlt <em>Condition Alt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition Alt</em>' containment reference.
   * @see #getConditionAlt()
   * @generated
   */
  void setConditionAlt(Condition value);

  /**
   * Returns the value of the '<em><b>Contexte IF</b></em>' containment reference list.
   * The list contents are of type {@link featureSeqDiag.sdcombin.sDC_language.Contexte}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contexte IF</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contexte IF</em>' containment reference list.
   * @see featureSeqDiag.sdcombin.sDC_language.SDC_languagePackage#getAlternative_ContexteIF()
   * @model containment="true"
   * @generated
   */
  EList<Contexte> getContexteIF();

  /**
   * Returns the value of the '<em><b>Contexte ELSE</b></em>' containment reference list.
   * The list contents are of type {@link featureSeqDiag.sdcombin.sDC_language.Contexte}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contexte ELSE</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contexte ELSE</em>' containment reference list.
   * @see featureSeqDiag.sdcombin.sDC_language.SDC_languagePackage#getAlternative_ContexteELSE()
   * @model containment="true"
   * @generated
   */
  EList<Contexte> getContexteELSE();

} // Alternative
