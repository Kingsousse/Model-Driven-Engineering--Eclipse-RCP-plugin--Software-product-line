/**
 */
package featureSeqDiag.sdcombin.sDC_language;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link featureSeqDiag.sdcombin.sDC_language.Sequence#getObjofR <em>Objof R</em>}</li>
 * </ul>
 * </p>
 *
 * @see featureSeqDiag.sdcombin.sDC_language.SDC_languagePackage#getSequence()
 * @model
 * @generated
 */
public interface Sequence extends EObject
{
  /**
   * Returns the value of the '<em><b>Objof R</b></em>' reference list.
   * The list contents are of type {@link featureSeqDiag.sdcombin.sDC_language.Feature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Objof R</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Objof R</em>' reference list.
   * @see featureSeqDiag.sdcombin.sDC_language.SDC_languagePackage#getSequence_ObjofR()
   * @model
   * @generated
   */
  EList<Feature> getObjofR();

} // Sequence
