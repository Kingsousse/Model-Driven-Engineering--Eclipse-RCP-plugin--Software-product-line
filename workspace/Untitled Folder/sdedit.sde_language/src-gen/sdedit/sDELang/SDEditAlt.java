/**
 */
package sdedit.sDELang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SD Edit Alt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sdedit.sDELang.SDEditAlt#getCondAlt <em>Cond Alt</em>}</li>
 *   <li>{@link sdedit.sDELang.SDEditAlt#getConseq <em>Conseq</em>}</li>
 *   <li>{@link sdedit.sDELang.SDEditAlt#getAlters <em>Alters</em>}</li>
 * </ul>
 * </p>
 *
 * @see sdedit.sDELang.SDELangPackage#getSDEditAlt()
 * @model
 * @generated
 */
public interface SDEditAlt extends SDEditCombinedFragment
{
  /**
   * Returns the value of the '<em><b>Cond Alt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cond Alt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cond Alt</em>' containment reference.
   * @see #setCondAlt(Condition)
   * @see sdedit.sDELang.SDELangPackage#getSDEditAlt_CondAlt()
   * @model containment="true"
   * @generated
   */
  Condition getCondAlt();

  /**
   * Sets the value of the '{@link sdedit.sDELang.SDEditAlt#getCondAlt <em>Cond Alt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cond Alt</em>' containment reference.
   * @see #getCondAlt()
   * @generated
   */
  void setCondAlt(Condition value);

  /**
   * Returns the value of the '<em><b>Conseq</b></em>' containment reference list.
   * The list contents are of type {@link sdedit.sDELang.SDEditCombinableDiagElt}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conseq</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conseq</em>' containment reference list.
   * @see sdedit.sDELang.SDELangPackage#getSDEditAlt_Conseq()
   * @model containment="true"
   * @generated
   */
  EList<SDEditCombinableDiagElt> getConseq();

  /**
   * Returns the value of the '<em><b>Alters</b></em>' containment reference list.
   * The list contents are of type {@link sdedit.sDELang.SDEditCombinableDiagElt}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alters</em>' containment reference list.
   * @see sdedit.sDELang.SDELangPackage#getSDEditAlt_Alters()
   * @model containment="true"
   * @generated
   */
  EList<SDEditCombinableDiagElt> getAlters();

} // SDEditAlt