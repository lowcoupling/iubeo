/**
 */
package com.lowcoupling.mdpm.lng.rml.rML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>REQ Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.lowcoupling.mdpm.lng.rml.rML.REQPackage#getPackage <em>Package</em>}</li>
 *   <li>{@link com.lowcoupling.mdpm.lng.rml.rML.REQPackage#getRequirements <em>Requirements</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.lowcoupling.mdpm.lng.rml.rML.RMLPackage#getREQPackage()
 * @model
 * @generated
 */
public interface REQPackage extends REQNode
{
  /**
   * Returns the value of the '<em><b>Package</b></em>' containment reference list.
   * The list contents are of type {@link com.lowcoupling.mdpm.lng.rml.rML.REQPackage}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Package</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package</em>' containment reference list.
   * @see com.lowcoupling.mdpm.lng.rml.rML.RMLPackage#getREQPackage_Package()
   * @model containment="true"
   * @generated
   */
  EList<REQPackage> getPackage();

  /**
   * Returns the value of the '<em><b>Requirements</b></em>' containment reference list.
   * The list contents are of type {@link com.lowcoupling.mdpm.lng.rml.rML.REQRequirement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Requirements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Requirements</em>' containment reference list.
   * @see com.lowcoupling.mdpm.lng.rml.rML.RMLPackage#getREQPackage_Requirements()
   * @model containment="true"
   * @generated
   */
  EList<REQRequirement> getRequirements();

} // REQPackage
