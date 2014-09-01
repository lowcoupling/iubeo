/**
 */
package com.lowcoupling.mdpm.lng.wbs.wBS.impl;

import com.lowcoupling.mdpm.lng.wbs.wBS.*;

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
public class WBSFactoryImpl extends EFactoryImpl implements WBSFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static WBSFactory init()
  {
    try
    {
      WBSFactory theWBSFactory = (WBSFactory)EPackage.Registry.INSTANCE.getEFactory(WBSPackage.eNS_URI);
      if (theWBSFactory != null)
      {
        return theWBSFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new WBSFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WBSFactoryImpl()
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
      case WBSPackage.WBS: return createWBS();
      case WBSPackage.WBS_PROGRAM: return createWBSProgram();
      case WBSPackage.WBS_PROJECT: return createWBSProject();
      case WBSPackage.WBS_NODE: return createWBSNode();
      case WBSPackage.WBS_ACTIVITY: return createWBSActivity();
      case WBSPackage.WBS_WORK_PACKAGE: return createWBSWorkPackage();
      case WBSPackage.WBS_DELIVERABLE: return createWBSDeliverable();
      case WBSPackage.REQUIREMENT_IMPORT: return createRequirementImport();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WBS createWBS()
  {
    WBSImpl wbs = new WBSImpl();
    return wbs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WBSProgram createWBSProgram()
  {
    WBSProgramImpl wbsProgram = new WBSProgramImpl();
    return wbsProgram;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WBSProject createWBSProject()
  {
    WBSProjectImpl wbsProject = new WBSProjectImpl();
    return wbsProject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WBSNode createWBSNode()
  {
    WBSNodeImpl wbsNode = new WBSNodeImpl();
    return wbsNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WBSActivity createWBSActivity()
  {
    WBSActivityImpl wbsActivity = new WBSActivityImpl();
    return wbsActivity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WBSWorkPackage createWBSWorkPackage()
  {
    WBSWorkPackageImpl wbsWorkPackage = new WBSWorkPackageImpl();
    return wbsWorkPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WBSDeliverable createWBSDeliverable()
  {
    WBSDeliverableImpl wbsDeliverable = new WBSDeliverableImpl();
    return wbsDeliverable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RequirementImport createRequirementImport()
  {
    RequirementImportImpl requirementImport = new RequirementImportImpl();
    return requirementImport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WBSPackage getWBSPackage()
  {
    return (WBSPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static WBSPackage getPackage()
  {
    return WBSPackage.eINSTANCE;
  }

} //WBSFactoryImpl
