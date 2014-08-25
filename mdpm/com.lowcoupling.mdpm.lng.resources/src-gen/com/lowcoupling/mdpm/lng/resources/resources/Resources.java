/**
 */
package com.lowcoupling.mdpm.lng.resources.resources;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resources</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.lowcoupling.mdpm.lng.resources.resources.Resources#getResourceGroups <em>Resource Groups</em>}</li>
 *   <li>{@link com.lowcoupling.mdpm.lng.resources.resources.Resources#getResources <em>Resources</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.lowcoupling.mdpm.lng.resources.resources.ResourcesPackage#getResources()
 * @model
 * @generated
 */
public interface Resources extends EObject
{
  /**
   * Returns the value of the '<em><b>Resource Groups</b></em>' containment reference list.
   * The list contents are of type {@link com.lowcoupling.mdpm.lng.resources.resources.ResourceGroup}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resource Groups</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resource Groups</em>' containment reference list.
   * @see com.lowcoupling.mdpm.lng.resources.resources.ResourcesPackage#getResources_ResourceGroups()
   * @model containment="true"
   * @generated
   */
  EList<ResourceGroup> getResourceGroups();

  /**
   * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
   * The list contents are of type {@link com.lowcoupling.mdpm.lng.resources.resources.Resource}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resources</em>' containment reference list.
   * @see com.lowcoupling.mdpm.lng.resources.resources.ResourcesPackage#getResources_Resources()
   * @model containment="true"
   * @generated
   */
  EList<Resource> getResources();

} // Resources
