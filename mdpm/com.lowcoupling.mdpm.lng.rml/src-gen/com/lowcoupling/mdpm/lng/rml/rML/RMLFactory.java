/**
 */
package com.lowcoupling.mdpm.lng.rml.rML;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.lowcoupling.mdpm.lng.rml.rML.RMLPackage
 * @generated
 */
public interface RMLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RMLFactory eINSTANCE = com.lowcoupling.mdpm.lng.rml.rML.impl.RMLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>REQ Package</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>REQ Package</em>'.
   * @generated
   */
  REQPackage createREQPackage();

  /**
   * Returns a new object of class '<em>REQ Requirement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>REQ Requirement</em>'.
   * @generated
   */
  REQRequirement createREQRequirement();

  /**
   * Returns a new object of class '<em>REQ Node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>REQ Node</em>'.
   * @generated
   */
  REQNode createREQNode();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  RMLPackage getRMLPackage();

} //RMLFactory
