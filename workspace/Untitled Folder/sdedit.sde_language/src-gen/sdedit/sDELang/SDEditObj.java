/**
 */
package sdedit.sDELang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SD Edit Obj</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sdedit.sDELang.SDEditObj#getObjName <em>Obj Name</em>}</li>
 *   <li>{@link sdedit.sDELang.SDEditObj#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see sdedit.sDELang.SDELangPackage#getSDEditObj()
 * @model
 * @generated
 */
public interface SDEditObj extends EObject
{
  /**
   * Returns the value of the '<em><b>Obj Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Obj Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Obj Name</em>' containment reference.
   * @see #setObjName(SDEditObjname)
   * @see sdedit.sDELang.SDELangPackage#getSDEditObj_ObjName()
   * @model containment="true"
   * @generated
   */
  SDEditObjname getObjName();

  /**
   * Sets the value of the '{@link sdedit.sDELang.SDEditObj#getObjName <em>Obj Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Obj Name</em>' containment reference.
   * @see #getObjName()
   * @generated
   */
  void setObjName(SDEditObjname value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see sdedit.sDELang.SDELangPackage#getSDEditObj_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link sdedit.sDELang.SDEditObj#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

} // SDEditObj
