/**
 */
package featureSeqDiag.sdedit.sD_language;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SD Edit Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link featureSeqDiag.sdedit.sD_language.SDEditCall#getCaller <em>Caller</em>}</li>
 *   <li>{@link featureSeqDiag.sdedit.sD_language.SDEditCall#getReturnMessage <em>Return Message</em>}</li>
 *   <li>{@link featureSeqDiag.sdedit.sD_language.SDEditCall#getCalled <em>Called</em>}</li>
 *   <li>{@link featureSeqDiag.sdedit.sD_language.SDEditCall#getName <em>Name</em>}</li>
 *   <li>{@link featureSeqDiag.sdedit.sD_language.SDEditCall#getParams <em>Params</em>}</li>
 *   <li>{@link featureSeqDiag.sdedit.sD_language.SDEditCall#getParamLists <em>Param Lists</em>}</li>
 * </ul>
 * </p>
 *
 * @see featureSeqDiag.sdedit.sD_language.SD_languagePackage#getSDEditCall()
 * @model
 * @generated
 */
public interface SDEditCall extends SDEditCombinableDiagElt
{
  /**
   * Returns the value of the '<em><b>Caller</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Caller</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Caller</em>' reference.
   * @see #setCaller(SDEditObjname)
   * @see featureSeqDiag.sdedit.sD_language.SD_languagePackage#getSDEditCall_Caller()
   * @model
   * @generated
   */
  SDEditObjname getCaller();

  /**
   * Sets the value of the '{@link featureSeqDiag.sdedit.sD_language.SDEditCall#getCaller <em>Caller</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Caller</em>' reference.
   * @see #getCaller()
   * @generated
   */
  void setCaller(SDEditObjname value);

  /**
   * Returns the value of the '<em><b>Return Message</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Message</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Message</em>' attribute.
   * @see #setReturnMessage(String)
   * @see featureSeqDiag.sdedit.sD_language.SD_languagePackage#getSDEditCall_ReturnMessage()
   * @model
   * @generated
   */
  String getReturnMessage();

  /**
   * Sets the value of the '{@link featureSeqDiag.sdedit.sD_language.SDEditCall#getReturnMessage <em>Return Message</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Message</em>' attribute.
   * @see #getReturnMessage()
   * @generated
   */
  void setReturnMessage(String value);

  /**
   * Returns the value of the '<em><b>Called</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Called</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Called</em>' reference.
   * @see #setCalled(SDEditObjname)
   * @see featureSeqDiag.sdedit.sD_language.SD_languagePackage#getSDEditCall_Called()
   * @model
   * @generated
   */
  SDEditObjname getCalled();

  /**
   * Sets the value of the '{@link featureSeqDiag.sdedit.sD_language.SDEditCall#getCalled <em>Called</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Called</em>' reference.
   * @see #getCalled()
   * @generated
   */
  void setCalled(SDEditObjname value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see featureSeqDiag.sdedit.sD_language.SD_languagePackage#getSDEditCall_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link featureSeqDiag.sdedit.sD_language.SDEditCall#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' attribute.
   * @see #setParams(String)
   * @see featureSeqDiag.sdedit.sD_language.SD_languagePackage#getSDEditCall_Params()
   * @model
   * @generated
   */
  String getParams();

  /**
   * Sets the value of the '{@link featureSeqDiag.sdedit.sD_language.SDEditCall#getParams <em>Params</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Params</em>' attribute.
   * @see #getParams()
   * @generated
   */
  void setParams(String value);

  /**
   * Returns the value of the '<em><b>Param Lists</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Param Lists</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param Lists</em>' attribute list.
   * @see featureSeqDiag.sdedit.sD_language.SD_languagePackage#getSDEditCall_ParamLists()
   * @model unique="false"
   * @generated
   */
  EList<String> getParamLists();

} // SDEditCall
