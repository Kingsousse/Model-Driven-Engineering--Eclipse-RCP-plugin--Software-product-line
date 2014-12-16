/**
 */
package featureSeqDiag.sdcombin.sDC_language;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Prog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link featureSeqDiag.sdcombin.sDC_language.SequenceProg#getFeatures <em>Features</em>}</li>
 *   <li>{@link featureSeqDiag.sdcombin.sDC_language.SequenceProg#getContexte <em>Contexte</em>}</li>
 * </ul>
 * </p>
 *
 * @see featureSeqDiag.sdcombin.sDC_language.SDC_languagePackage#getSequenceProg()
 * @model
 * @generated
 */
public interface SequenceProg extends EObject
{
  /**
   * Returns the value of the '<em><b>Features</b></em>' containment reference list.
   * The list contents are of type {@link featureSeqDiag.sdcombin.sDC_language.Feature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' containment reference list.
   * @see featureSeqDiag.sdcombin.sDC_language.SDC_languagePackage#getSequenceProg_Features()
   * @model containment="true"
   * @generated
   */
  EList<Feature> getFeatures();

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
   * @see featureSeqDiag.sdcombin.sDC_language.SDC_languagePackage#getSequenceProg_Contexte()
   * @model containment="true"
   * @generated
   */
  EList<Contexte> getContexte();

} // SequenceProg
