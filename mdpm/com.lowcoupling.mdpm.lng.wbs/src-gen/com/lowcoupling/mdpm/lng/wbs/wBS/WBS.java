/**
 */
package com.lowcoupling.mdpm.lng.wbs.wBS;

import com.lowcoupling.mdpm.lng.rml.rML.REQNode;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WBS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.lowcoupling.mdpm.lng.wbs.wBS.WBS#getDescription <em>Description</em>}</li>
 *   <li>{@link com.lowcoupling.mdpm.lng.wbs.wBS.WBS#getName <em>Name</em>}</li>
 *   <li>{@link com.lowcoupling.mdpm.lng.wbs.wBS.WBS#getRequirementsModel <em>Requirements Model</em>}</li>
 *   <li>{@link com.lowcoupling.mdpm.lng.wbs.wBS.WBS#getRequirements <em>Requirements</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.lowcoupling.mdpm.lng.wbs.wBS.WBSPackage#getWBS()
 * @model
 * @generated
 */
public interface WBS extends EObject
{
  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see com.lowcoupling.mdpm.lng.wbs.wBS.WBSPackage#getWBS_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link com.lowcoupling.mdpm.lng.wbs.wBS.WBS#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.lowcoupling.mdpm.lng.wbs.wBS.WBSPackage#getWBS_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.lowcoupling.mdpm.lng.wbs.wBS.WBS#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Requirements Model</b></em>' containment reference list.
   * The list contents are of type {@link com.lowcoupling.mdpm.lng.wbs.wBS.RequirementImport}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Requirements Model</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Requirements Model</em>' containment reference list.
   * @see com.lowcoupling.mdpm.lng.wbs.wBS.WBSPackage#getWBS_RequirementsModel()
   * @model containment="true"
   * @generated
   */
  EList<RequirementImport> getRequirementsModel();

  /**
   * Returns the value of the '<em><b>Requirements</b></em>' reference list.
   * The list contents are of type {@link com.lowcoupling.mdpm.lng.rml.rML.REQNode}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Requirements</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Requirements</em>' reference list.
   * @see com.lowcoupling.mdpm.lng.wbs.wBS.WBSPackage#getWBS_Requirements()
   * @model
   * @generated
   */
  EList<REQNode> getRequirements();

} // WBS
