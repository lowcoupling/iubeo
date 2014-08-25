/**
 */
package com.lowcoupling.mdpm.lng.resources.resources;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.lowcoupling.mdpm.lng.resources.resources.ResourcesPackage
 * @generated
 */
public interface ResourcesFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ResourcesFactory eINSTANCE = com.lowcoupling.mdpm.lng.resources.resources.impl.ResourcesFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Resources</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Resources</em>'.
   * @generated
   */
  Resources createResources();

  /**
   * Returns a new object of class '<em>Resource Group</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Resource Group</em>'.
   * @generated
   */
  ResourceGroup createResourceGroup();

  /**
   * Returns a new object of class '<em>Resource</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Resource</em>'.
   * @generated
   */
  Resource createResource();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ResourcesPackage getResourcesPackage();

} //ResourcesFactory
