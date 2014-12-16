/**
 */
package featureSeqDiag.sdcombin.sDC_language.util;

import featureSeqDiag.sdcombin.sDC_language.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see featureSeqDiag.sdcombin.sDC_language.SDC_languagePackage
 * @generated
 */
public class SDC_languageAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SDC_languagePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SDC_languageAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SDC_languagePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SDC_languageSwitch<Adapter> modelSwitch =
    new SDC_languageSwitch<Adapter>()
    {
      @Override
      public Adapter caseSequenceProg(SequenceProg object)
      {
        return createSequenceProgAdapter();
      }
      @Override
      public Adapter caseFeature(Feature object)
      {
        return createFeatureAdapter();
      }
      @Override
      public Adapter caseContexte(Contexte object)
      {
        return createContexteAdapter();
      }
      @Override
      public Adapter caseCondition(Condition object)
      {
        return createConditionAdapter();
      }
      @Override
      public Adapter caseLoop(Loop object)
      {
        return createLoopAdapter();
      }
      @Override
      public Adapter caseSequence(Sequence object)
      {
        return createSequenceAdapter();
      }
      @Override
      public Adapter caseAlternative(Alternative object)
      {
        return createAlternativeAdapter();
      }
      @Override
      public Adapter caseOption(Option object)
      {
        return createOptionAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link featureSeqDiag.sdcombin.sDC_language.SequenceProg <em>Sequence Prog</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see featureSeqDiag.sdcombin.sDC_language.SequenceProg
   * @generated
   */
  public Adapter createSequenceProgAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link featureSeqDiag.sdcombin.sDC_language.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see featureSeqDiag.sdcombin.sDC_language.Feature
   * @generated
   */
  public Adapter createFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link featureSeqDiag.sdcombin.sDC_language.Contexte <em>Contexte</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see featureSeqDiag.sdcombin.sDC_language.Contexte
   * @generated
   */
  public Adapter createContexteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link featureSeqDiag.sdcombin.sDC_language.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see featureSeqDiag.sdcombin.sDC_language.Condition
   * @generated
   */
  public Adapter createConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link featureSeqDiag.sdcombin.sDC_language.Loop <em>Loop</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see featureSeqDiag.sdcombin.sDC_language.Loop
   * @generated
   */
  public Adapter createLoopAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link featureSeqDiag.sdcombin.sDC_language.Sequence <em>Sequence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see featureSeqDiag.sdcombin.sDC_language.Sequence
   * @generated
   */
  public Adapter createSequenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link featureSeqDiag.sdcombin.sDC_language.Alternative <em>Alternative</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see featureSeqDiag.sdcombin.sDC_language.Alternative
   * @generated
   */
  public Adapter createAlternativeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link featureSeqDiag.sdcombin.sDC_language.Option <em>Option</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see featureSeqDiag.sdcombin.sDC_language.Option
   * @generated
   */
  public Adapter createOptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //SDC_languageAdapterFactory
