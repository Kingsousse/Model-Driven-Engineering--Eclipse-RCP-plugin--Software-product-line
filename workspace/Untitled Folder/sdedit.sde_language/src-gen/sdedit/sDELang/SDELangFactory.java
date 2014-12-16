/**
 */
package sdedit.sDELang;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see sdedit.sDELang.SDELangPackage
 * @generated
 */
public interface SDELangFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SDELangFactory eINSTANCE = sdedit.sDELang.impl.SDELangFactoryImpl.init();

  /**
   * Returns a new object of class '<em>SD Edit Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SD Edit Model</em>'.
   * @generated
   */
  SDEditModel createSDEditModel();

  /**
   * Returns a new object of class '<em>SD Edit Obj</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SD Edit Obj</em>'.
   * @generated
   */
  SDEditObj createSDEditObj();

  /**
   * Returns a new object of class '<em>SD Edit Objname</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SD Edit Objname</em>'.
   * @generated
   */
  SDEditObjname createSDEditObjname();

  /**
   * Returns a new object of class '<em>SD Edit Combinable Diag Elt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SD Edit Combinable Diag Elt</em>'.
   * @generated
   */
  SDEditCombinableDiagElt createSDEditCombinableDiagElt();

  /**
   * Returns a new object of class '<em>SD Edit Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SD Edit Call</em>'.
   * @generated
   */
  SDEditCall createSDEditCall();

  /**
   * Returns a new object of class '<em>SD Edit Combined Fragment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SD Edit Combined Fragment</em>'.
   * @generated
   */
  SDEditCombinedFragment createSDEditCombinedFragment();

  /**
   * Returns a new object of class '<em>SD Edit Alt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SD Edit Alt</em>'.
   * @generated
   */
  SDEditAlt createSDEditAlt();

  /**
   * Returns a new object of class '<em>SD Edit Loop</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SD Edit Loop</em>'.
   * @generated
   */
  SDEditLoop createSDEditLoop();

  /**
   * Returns a new object of class '<em>SD Edit Opt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SD Edit Opt</em>'.
   * @generated
   */
  SDEditOpt createSDEditOpt();

  /**
   * Returns a new object of class '<em>Condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Condition</em>'.
   * @generated
   */
  Condition createCondition();

  /**
   * Returns a new object of class '<em>Conditionlist Right</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Conditionlist Right</em>'.
   * @generated
   */
  ConditionlistRight createConditionlistRight();

  /**
   * Returns a new object of class '<em>Condition Elm</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Condition Elm</em>'.
   * @generated
   */
  ConditionElm createConditionElm();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SDELangPackage getSDELangPackage();

} //SDELangFactory
