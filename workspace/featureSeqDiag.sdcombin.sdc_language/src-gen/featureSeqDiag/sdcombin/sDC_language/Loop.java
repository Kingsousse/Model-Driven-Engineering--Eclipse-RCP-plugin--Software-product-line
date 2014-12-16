/**
 */
package featureSeqDiag.sdcombin.sDC_language;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link featureSeqDiag.sdcombin.sDC_language.Loop#getCondition <em>Condition</em>}</li>
 *   <li>{@link featureSeqDiag.sdcombin.sDC_language.Loop#getContexte <em>Contexte</em>}</li>
 * </ul>
 * </p>
 *
 * @see featureSeqDiag.sdcombin.sDC_language.SDC_languagePackage#getLoop()
 * @model
 * @generated
 */
public interface Loop extends EObject
{
  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(Condition)
   * @see featureSeqDiag.sdcombin.sDC_language.SDC_languagePackage#getLoop_Condition()
   * @model containment="true"
   * @generated
   */
  Condition getCondition();

  /**
   * Sets the value of the '{@link featureSeqDiag.sdcombin.sDC_language.Loop#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(Condition value);

  /**
   * Returns the value of the '<em><b>Contexte</b></em>' containment reference list.
   * The list contents are of type {@link featureSeqDiag.sdcombin.sDC_language.Contexte}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contexte</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contexte</em>' containment reference list.
   * @see featureSeqDiag.sdcombin.sDC_language.SDC_languagePackage#getLoop_Contexte()
   * @model containment="true"
   * @generated
   */
  EList<Contexte> getContexte();

} // Loop
