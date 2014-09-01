/**
 */
package com.lowcoupling.mdpm.lng.wbs.wBS;

import com.lowcoupling.mdpm.lng.rml.rML.REQNode;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.lowcoupling.mdpm.lng.wbs.wBS.WBSNode#getDescription <em>Description</em>}</li>
 *   <li>{@link com.lowcoupling.mdpm.lng.wbs.wBS.WBSNode#getName <em>Name</em>}</li>
 *   <li>{@link com.lowcoupling.mdpm.lng.wbs.wBS.WBSNode#getWbsNodes <em>Wbs Nodes</em>}</li>
 *   <li>{@link com.lowcoupling.mdpm.lng.wbs.wBS.WBSNode#getRequirements <em>Requirements</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.lowcoupling.mdpm.lng.wbs.wBS.WBSPackage#getWBSNode()
 * @model
 * @generated
 */
public interface WBSNode extends EObject
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
   * @see com.lowcoupling.mdpm.lng.wbs.wBS.WBSPackage#getWBSNode_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link com.lowcoupling.mdpm.lng.wbs.wBS.WBSNode#getDescription <em>Description</em>}' attribute.
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
   * @see com.lowcoupling.mdpm.lng.wbs.wBS.WBSPackage#getWBSNode_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.lowcoupling.mdpm.lng.wbs.wBS.WBSNode#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Wbs Nodes</b></em>' containment reference list.
   * The list contents are of type {@link com.lowcoupling.mdpm.lng.wbs.wBS.WBSNode}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wbs Nodes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Wbs Nodes</em>' containment reference list.
   * @see com.lowcoupling.mdpm.lng.wbs.wBS.WBSPackage#getWBSNode_WbsNodes()
   * @model containment="true"
   * @generated
   */
  EList<WBSNode> getWbsNodes();

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
   * @see com.lowcoupling.mdpm.lng.wbs.wBS.WBSPackage#getWBSNode_Requirements()
   * @model
   * @generated
   */
  EList<REQNode> getRequirements();

} // WBSNode
