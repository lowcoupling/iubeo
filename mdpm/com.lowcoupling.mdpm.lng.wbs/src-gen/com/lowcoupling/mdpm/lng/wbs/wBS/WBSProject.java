/**
 */
package com.lowcoupling.mdpm.lng.wbs.wBS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.lowcoupling.mdpm.lng.wbs.wBS.WBSProject#getWbsNodes <em>Wbs Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.lowcoupling.mdpm.lng.wbs.wBS.WBSPackage#getWBSProject()
 * @model
 * @generated
 */
public interface WBSProject extends WBS
{
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
   * @see com.lowcoupling.mdpm.lng.wbs.wBS.WBSPackage#getWBSProject_WbsNodes()
   * @model containment="true"
   * @generated
   */
  EList<WBSNode> getWbsNodes();

} // WBSProject
