/**
 */
package com.lowcoupling.mdpm.lng.wbs.wBS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.lowcoupling.mdpm.lng.wbs.wBS.WBSProgram#getProjects <em>Projects</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.lowcoupling.mdpm.lng.wbs.wBS.WBSPackage#getWBSProgram()
 * @model
 * @generated
 */
public interface WBSProgram extends WBS
{
  /**
   * Returns the value of the '<em><b>Projects</b></em>' containment reference list.
   * The list contents are of type {@link com.lowcoupling.mdpm.lng.wbs.wBS.WBSProject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Projects</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Projects</em>' containment reference list.
   * @see com.lowcoupling.mdpm.lng.wbs.wBS.WBSPackage#getWBSProgram_Projects()
   * @model containment="true"
   * @generated
   */
  EList<WBSProject> getProjects();

} // WBSProgram
