/**
 */
package sdcombin.sDCLang;

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
 *   <li>{@link sdcombin.sDCLang.SequenceProg#getFeatures <em>Features</em>}</li>
 *   <li>{@link sdcombin.sDCLang.SequenceProg#getContexte <em>Contexte</em>}</li>
 * </ul>
 * </p>
 *
 * @see sdcombin.sDCLang.SDCLangPackage#getSequenceProg()
 * @model
 * @generated
 */
public interface SequenceProg extends EObject
{
  /**
   * Returns the value of the '<em><b>Features</b></em>' containment reference list.
   * The list contents are of type {@link sdcombin.sDCLang.Feature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' containment reference list.
   * @see sdcombin.sDCLang.SDCLangPackage#getSequenceProg_Features()
   * @model containment="true"
   * @generated
   */
  EList<Feature> getFeatures();

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
   * @see sdcombin.sDCLang.SDCLangPackage#getSequenceProg_Contexte()
   * @model containment="true"
   * @generated
   */
  EList<Contexte> getContexte();

} // SequenceProg
