/**
 */
package com.lowcoupling.mdpm.lng.resources.resources;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.lowcoupling.mdpm.lng.resources.resources.ResourceGroup#getName <em>Name</em>}</li>
 *   <li>{@link com.lowcoupling.mdpm.lng.resources.resources.ResourceGroup#getId <em>Id</em>}</li>
 *   <li>{@link com.lowcoupling.mdpm.lng.resources.resources.ResourceGroup#getCost <em>Cost</em>}</li>
 *   <li>{@link com.lowcoupling.mdpm.lng.resources.resources.ResourceGroup#getCostLabel <em>Cost Label</em>}</li>
 *   <li>{@link com.lowcoupling.mdpm.lng.resources.resources.ResourceGroup#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.lowcoupling.mdpm.lng.resources.resources.ResourcesPackage#getResourceGroup()
 * @model
 * @generated
 */
public interface ResourceGroup extends EObject
{
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
   * @see com.lowcoupling.mdpm.lng.resources.resources.ResourcesPackage#getResourceGroup_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.lowcoupling.mdpm.lng.resources.resources.ResourceGroup#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see com.lowcoupling.mdpm.lng.resources.resources.ResourcesPackage#getResourceGroup_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link com.lowcoupling.mdpm.lng.resources.resources.ResourceGroup#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Cost</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cost</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cost</em>' attribute.
   * @see #setCost(int)
   * @see com.lowcoupling.mdpm.lng.resources.resources.ResourcesPackage#getResourceGroup_Cost()
   * @model
   * @generated
   */
  int getCost();

  /**
   * Sets the value of the '{@link com.lowcoupling.mdpm.lng.resources.resources.ResourceGroup#getCost <em>Cost</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cost</em>' attribute.
   * @see #getCost()
   * @generated
   */
  void setCost(int value);

  /**
   * Returns the value of the '<em><b>Cost Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cost Label</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cost Label</em>' attribute.
   * @see #setCostLabel(String)
   * @see com.lowcoupling.mdpm.lng.resources.resources.ResourcesPackage#getResourceGroup_CostLabel()
   * @model
   * @generated
   */
  String getCostLabel();

  /**
   * Sets the value of the '{@link com.lowcoupling.mdpm.lng.resources.resources.ResourceGroup#getCostLabel <em>Cost Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cost Label</em>' attribute.
   * @see #getCostLabel()
   * @generated
   */
  void setCostLabel(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see com.lowcoupling.mdpm.lng.resources.resources.ResourcesPackage#getResourceGroup_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link com.lowcoupling.mdpm.lng.resources.resources.ResourceGroup#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

} // ResourceGroup
