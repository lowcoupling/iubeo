/**
 */
package com.lowcoupling.mdpm.lng.resources.resources.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.lowcoupling.mdpm.lng.resources.resources.Resource;
import com.lowcoupling.mdpm.lng.resources.resources.ResourceGroup;
import com.lowcoupling.mdpm.lng.resources.resources.Resources;
import com.lowcoupling.mdpm.lng.resources.resources.ResourcesFactory;
import com.lowcoupling.mdpm.lng.resources.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourcesFactoryImpl extends EFactoryImpl implements ResourcesFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ResourcesFactory init()
  {
    try
    {
      ResourcesFactory theResourcesFactory = (ResourcesFactory)EPackage.Registry.INSTANCE.getEFactory(ResourcesPackage.eNS_URI);
      if (theResourcesFactory != null)
      {
        return theResourcesFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ResourcesFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResourcesFactoryImpl()
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
      case ResourcesPackage.RESOURCES: return createResources();
      case ResourcesPackage.RESOURCE_GROUP: return createResourceGroup();
      case ResourcesPackage.RESOURCE: return createResource();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Resources createResources()
  {
    ResourcesImpl resources = new ResourcesImpl();
    return resources;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResourceGroup createResourceGroup()
  {
    ResourceGroupImpl resourceGroup = new ResourceGroupImpl();
    return resourceGroup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Resource createResource()
  {
    ResourceImpl resource = new ResourceImpl();
    return resource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResourcesPackage getResourcesPackage()
  {
    return (ResourcesPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ResourcesPackage getPackage()
  {
    return ResourcesPackage.eINSTANCE;
  }

} //ResourcesFactoryImpl
