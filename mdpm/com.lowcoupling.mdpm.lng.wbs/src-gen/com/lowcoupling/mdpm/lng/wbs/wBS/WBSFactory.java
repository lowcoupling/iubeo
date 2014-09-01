/**
 */
package com.lowcoupling.mdpm.lng.wbs.wBS;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.lowcoupling.mdpm.lng.wbs.wBS.WBSPackage
 * @generated
 */
public interface WBSFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  WBSFactory eINSTANCE = com.lowcoupling.mdpm.lng.wbs.wBS.impl.WBSFactoryImpl.init();

  /**
   * Returns a new object of class '<em>WBS</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>WBS</em>'.
   * @generated
   */
  WBS createWBS();

  /**
   * Returns a new object of class '<em>Program</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Program</em>'.
   * @generated
   */
  WBSProgram createWBSProgram();

  /**
   * Returns a new object of class '<em>Project</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Project</em>'.
   * @generated
   */
  WBSProject createWBSProject();

  /**
   * Returns a new object of class '<em>Node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node</em>'.
   * @generated
   */
  WBSNode createWBSNode();

  /**
   * Returns a new object of class '<em>Activity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Activity</em>'.
   * @generated
   */
  WBSActivity createWBSActivity();

  /**
   * Returns a new object of class '<em>Work Package</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Work Package</em>'.
   * @generated
   */
  WBSWorkPackage createWBSWorkPackage();

  /**
   * Returns a new object of class '<em>Deliverable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Deliverable</em>'.
   * @generated
   */
  WBSDeliverable createWBSDeliverable();

  /**
   * Returns a new object of class '<em>Requirement Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Requirement Import</em>'.
   * @generated
   */
  RequirementImport createRequirementImport();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  WBSPackage getWBSPackage();

} //WBSFactory
