/**
 */
package featureSeqDiag.sdedit.sD_language;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SD Edit Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link featureSeqDiag.sdedit.sD_language.SDEditLoop#getCondLoop <em>Cond Loop</em>}</li>
 *   <li>{@link featureSeqDiag.sdedit.sD_language.SDEditLoop#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see featureSeqDiag.sdedit.sD_language.SD_languagePackage#getSDEditLoop()
 * @model
 * @generated
 */
public interface SDEditLoop extends SDEditCombinedFragment
{
  /**
   * Returns the value of the '<em><b>Cond Loop</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cond Loop</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cond Loop</em>' containment reference.
   * @see #setCondLoop(Condition)
   * @see featureSeqDiag.sdedit.sD_language.SD_languagePackage#getSDEditLoop_CondLoop()
   * @model containment="true"
   * @generated
   */
  Condition getCondLoop();

  /**
   * Sets the value of the '{@link featureSeqDiag.sdedit.sD_language.SDEditLoop#getCondLoop <em>Cond Loop</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cond Loop</em>' containment reference.
   * @see #getCondLoop()
   * @generated
   */
  void setCondLoop(Condition value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference list.
   * The list contents are of type {@link featureSeqDiag.sdedit.sD_language.SDEditCombinableDiagElt}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference list.
   * @see featureSeqDiag.sdedit.sD_language.SD_languagePackage#getSDEditLoop_Body()
   * @model containment="true"
   * @generated
   */
  EList<SDEditCombinableDiagElt> getBody();

} // SDEditLoop
