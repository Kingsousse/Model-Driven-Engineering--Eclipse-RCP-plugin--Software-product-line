/**
 */
package featureSeqDiag.sdcombin.sDC_language.impl;

import featureSeqDiag.sdcombin.sDC_language.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SDC_languageFactoryImpl extends EFactoryImpl implements SDC_languageFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SDC_languageFactory init()
  {
    try
    {
      SDC_languageFactory theSDC_languageFactory = (SDC_languageFactory)EPackage.Registry.INSTANCE.getEFactory(SDC_languagePackage.eNS_URI);
      if (theSDC_languageFactory != null)
      {
        return theSDC_languageFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SDC_languageFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SDC_languageFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SDC_languagePackage.SEQUENCE_PROG: return createSequenceProg();
      case SDC_languagePackage.FEATURE: return createFeature();
      case SDC_languagePackage.CONTEXTE: return createContexte();
      case SDC_languagePackage.CONDITION: return createCondition();
      case SDC_languagePackage.LOOP: return createLoop();
      case SDC_languagePackage.SEQUENCE: return createSequence();
      case SDC_languagePackage.ALTERNATIVE: return createAlternative();
      case SDC_languagePackage.OPTION: return createOption();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SequenceProg createSequenceProg()
  {
    SequenceProgImpl sequenceProg = new SequenceProgImpl();
    return sequenceProg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature createFeature()
  {
    FeatureImpl feature = new FeatureImpl();
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Contexte createContexte()
  {
    ContexteImpl contexte = new ContexteImpl();
    return contexte;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition createCondition()
  {
    ConditionImpl condition = new ConditionImpl();
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Loop createLoop()
  {
    LoopImpl loop = new LoopImpl();
    return loop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sequence createSequence()
  {
    SequenceImpl sequence = new SequenceImpl();
    return sequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Alternative createAlternative()
  {
    AlternativeImpl alternative = new AlternativeImpl();
    return alternative;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Option createOption()
  {
    OptionImpl option = new OptionImpl();
    return option;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SDC_languagePackage getSDC_languagePackage()
  {
    return (SDC_languagePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SDC_languagePackage getPackage()
  {
    return SDC_languagePackage.eINSTANCE;
  }

} //SDC_languageFactoryImpl
