/**
 */
package com.lowcoupling.mdpm.lng.wbs.wBS.util;

import com.lowcoupling.mdpm.lng.wbs.wBS.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.lowcoupling.mdpm.lng.wbs.wBS.WBSPackage
 * @generated
 */
public class WBSAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static WBSPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WBSAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = WBSPackage.eINSTANCE;
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
  protected WBSSwitch<Adapter> modelSwitch =
    new WBSSwitch<Adapter>()
    {
      @Override
      public Adapter caseWBS(WBS object)
      {
        return createWBSAdapter();
      }
      @Override
      public Adapter caseWBSProgram(WBSProgram object)
      {
        return createWBSProgramAdapter();
      }
      @Override
      public Adapter caseWBSProject(WBSProject object)
      {
        return createWBSProjectAdapter();
      }
      @Override
      public Adapter caseWBSNode(WBSNode object)
      {
        return createWBSNodeAdapter();
      }
      @Override
      public Adapter caseWBSActivity(WBSActivity object)
      {
        return createWBSActivityAdapter();
      }
      @Override
      public Adapter caseWBSWorkPackage(WBSWorkPackage object)
      {
        return createWBSWorkPackageAdapter();
      }
      @Override
      public Adapter caseWBSDeliverable(WBSDeliverable object)
      {
        return createWBSDeliverableAdapter();
      }
      @Override
      public Adapter caseRequirementImport(RequirementImport object)
      {
        return createRequirementImportAdapter();
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
   * Creates a new adapter for an object of class '{@link com.lowcoupling.mdpm.lng.wbs.wBS.WBS <em>WBS</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.lowcoupling.mdpm.lng.wbs.wBS.WBS
   * @generated
   */
  public Adapter createWBSAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.lowcoupling.mdpm.lng.wbs.wBS.WBSProgram <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.lowcoupling.mdpm.lng.wbs.wBS.WBSProgram
   * @generated
   */
  public Adapter createWBSProgramAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.lowcoupling.mdpm.lng.wbs.wBS.WBSProject <em>Project</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.lowcoupling.mdpm.lng.wbs.wBS.WBSProject
   * @generated
   */
  public Adapter createWBSProjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.lowcoupling.mdpm.lng.wbs.wBS.WBSNode <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.lowcoupling.mdpm.lng.wbs.wBS.WBSNode
   * @generated
   */
  public Adapter createWBSNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.lowcoupling.mdpm.lng.wbs.wBS.WBSActivity <em>Activity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.lowcoupling.mdpm.lng.wbs.wBS.WBSActivity
   * @generated
   */
  public Adapter createWBSActivityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.lowcoupling.mdpm.lng.wbs.wBS.WBSWorkPackage <em>Work Package</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.lowcoupling.mdpm.lng.wbs.wBS.WBSWorkPackage
   * @generated
   */
  public Adapter createWBSWorkPackageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.lowcoupling.mdpm.lng.wbs.wBS.WBSDeliverable <em>Deliverable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.lowcoupling.mdpm.lng.wbs.wBS.WBSDeliverable
   * @generated
   */
  public Adapter createWBSDeliverableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.lowcoupling.mdpm.lng.wbs.wBS.RequirementImport <em>Requirement Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.lowcoupling.mdpm.lng.wbs.wBS.RequirementImport
   * @generated
   */
  public Adapter createRequirementImportAdapter()
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

} //WBSAdapterFactory
