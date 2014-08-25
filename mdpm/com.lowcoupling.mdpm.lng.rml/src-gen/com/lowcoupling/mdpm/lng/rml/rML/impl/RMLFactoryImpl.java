/**
 */
package com.lowcoupling.mdpm.lng.rml.rML.impl;

import com.lowcoupling.mdpm.lng.rml.rML.*;

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
public class RMLFactoryImpl extends EFactoryImpl implements RMLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RMLFactory init()
  {
    try
    {
      RMLFactory theRMLFactory = (RMLFactory)EPackage.Registry.INSTANCE.getEFactory(RMLPackage.eNS_URI);
      if (theRMLFactory != null)
      {
        return theRMLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RMLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RMLFactoryImpl()
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
      case RMLPackage.MODEL: return createModel();
      case RMLPackage.REQ_PACKAGE: return createREQPackage();
      case RMLPackage.REQ_REQUIREMENT: return createREQRequirement();
      case RMLPackage.REQ_NODE: return createREQNode();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public REQPackage createREQPackage()
  {
    REQPackageImpl reqPackage = new REQPackageImpl();
    return reqPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public REQRequirement createREQRequirement()
  {
    REQRequirementImpl reqRequirement = new REQRequirementImpl();
    return reqRequirement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public REQNode createREQNode()
  {
    REQNodeImpl reqNode = new REQNodeImpl();
    return reqNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RMLPackage getRMLPackage()
  {
    return (RMLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RMLPackage getPackage()
  {
    return RMLPackage.eINSTANCE;
  }

} //RMLFactoryImpl
