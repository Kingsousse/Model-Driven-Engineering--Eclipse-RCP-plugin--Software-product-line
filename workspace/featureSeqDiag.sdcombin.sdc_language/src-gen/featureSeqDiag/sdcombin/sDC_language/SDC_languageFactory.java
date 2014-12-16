/**
 */
package featureSeqDiag.sdcombin.sDC_language;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see featureSeqDiag.sdcombin.sDC_language.SDC_languagePackage
 * @generated
 */
public interface SDC_languageFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SDC_languageFactory eINSTANCE = featureSeqDiag.sdcombin.sDC_language.impl.SDC_languageFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Sequence Prog</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sequence Prog</em>'.
   * @generated
   */
  SequenceProg createSequenceProg();

  /**
   * Returns a new object of class '<em>Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature</em>'.
   * @generated
   */
  Feature createFeature();

  /**
   * Returns a new object of class '<em>Contexte</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Contexte</em>'.
   * @generated
   */
  Contexte createContexte();

  /**
   * Returns a new object of class '<em>Condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Condition</em>'.
   * @generated
   */
  Condition createCondition();

  /**
   * Returns a new object of class '<em>Loop</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Loop</em>'.
   * @generated
   */
  Loop createLoop();

  /**
   * Returns a new object of class '<em>Sequence</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sequence</em>'.
   * @generated
   */
  Sequence createSequence();

  /**
   * Returns a new object of class '<em>Alternative</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Alternative</em>'.
   * @generated
   */
  Alternative createAlternative();

  /**
   * Returns a new object of class '<em>Option</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Option</em>'.
   * @generated
   */
  Option createOption();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SDC_languagePackage getSDC_languagePackage();

} //SDC_languageFactory
