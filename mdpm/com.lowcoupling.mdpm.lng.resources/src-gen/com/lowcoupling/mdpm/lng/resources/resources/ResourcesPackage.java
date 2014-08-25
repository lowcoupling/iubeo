/**
 */
package com.lowcoupling.mdpm.lng.resources.resources;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.lowcoupling.mdpm.lng.resources.resources.ResourcesFactory
 * @model kind="package"
 * @generated
 */
public interface ResourcesPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "resources";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.lowcoupling.com/mdpm/lng/resources/Resources";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "resources";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ResourcesPackage eINSTANCE = com.lowcoupling.mdpm.lng.resources.resources.impl.ResourcesPackageImpl.init();

  /**
   * The meta object id for the '{@link com.lowcoupling.mdpm.lng.resources.resources.impl.ResourcesImpl <em>Resources</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.lowcoupling.mdpm.lng.resources.resources.impl.ResourcesImpl
   * @see com.lowcoupling.mdpm.lng.resources.resources.impl.ResourcesPackageImpl#getResources()
   * @generated
   */
  int RESOURCES = 0;

  /**
   * The feature id for the '<em><b>Resource Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCES__RESOURCE_GROUPS = 0;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCES__RESOURCES = 1;

  /**
   * The number of structural features of the '<em>Resources</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCES_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.lowcoupling.mdpm.lng.resources.resources.impl.ResourceGroupImpl <em>Resource Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.lowcoupling.mdpm.lng.resources.resources.impl.ResourceGroupImpl
   * @see com.lowcoupling.mdpm.lng.resources.resources.impl.ResourcesPackageImpl#getResourceGroup()
   * @generated
   */
  int RESOURCE_GROUP = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_GROUP__NAME = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_GROUP__ID = 1;

  /**
   * The feature id for the '<em><b>Cost</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_GROUP__COST = 2;

  /**
   * The feature id for the '<em><b>Cost Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_GROUP__COST_LABEL = 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_GROUP__TYPE = 4;

  /**
   * The number of structural features of the '<em>Resource Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_GROUP_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link com.lowcoupling.mdpm.lng.resources.resources.impl.ResourceImpl <em>Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.lowcoupling.mdpm.lng.resources.resources.impl.ResourceImpl
   * @see com.lowcoupling.mdpm.lng.resources.resources.impl.ResourcesPackageImpl#getResource()
   * @generated
   */
  int RESOURCE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__TYPE = 1;

  /**
   * The number of structural features of the '<em>Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link com.lowcoupling.mdpm.lng.resources.resources.Resources <em>Resources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resources</em>'.
   * @see com.lowcoupling.mdpm.lng.resources.resources.Resources
   * @generated
   */
  EClass getResources();

  /**
   * Returns the meta object for the containment reference list '{@link com.lowcoupling.mdpm.lng.resources.resources.Resources#getResourceGroups <em>Resource Groups</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Resource Groups</em>'.
   * @see com.lowcoupling.mdpm.lng.resources.resources.Resources#getResourceGroups()
   * @see #getResources()
   * @generated
   */
  EReference getResources_ResourceGroups();

  /**
   * Returns the meta object for the containment reference list '{@link com.lowcoupling.mdpm.lng.resources.resources.Resources#getResources <em>Resources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Resources</em>'.
   * @see com.lowcoupling.mdpm.lng.resources.resources.Resources#getResources()
   * @see #getResources()
   * @generated
   */
  EReference getResources_Resources();

  /**
   * Returns the meta object for class '{@link com.lowcoupling.mdpm.lng.resources.resources.ResourceGroup <em>Resource Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resource Group</em>'.
   * @see com.lowcoupling.mdpm.lng.resources.resources.ResourceGroup
   * @generated
   */
  EClass getResourceGroup();

  /**
   * Returns the meta object for the attribute '{@link com.lowcoupling.mdpm.lng.resources.resources.ResourceGroup#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.lowcoupling.mdpm.lng.resources.resources.ResourceGroup#getName()
   * @see #getResourceGroup()
   * @generated
   */
  EAttribute getResourceGroup_Name();

  /**
   * Returns the meta object for the attribute '{@link com.lowcoupling.mdpm.lng.resources.resources.ResourceGroup#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see com.lowcoupling.mdpm.lng.resources.resources.ResourceGroup#getId()
   * @see #getResourceGroup()
   * @generated
   */
  EAttribute getResourceGroup_Id();

  /**
   * Returns the meta object for the attribute '{@link com.lowcoupling.mdpm.lng.resources.resources.ResourceGroup#getCost <em>Cost</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cost</em>'.
   * @see com.lowcoupling.mdpm.lng.resources.resources.ResourceGroup#getCost()
   * @see #getResourceGroup()
   * @generated
   */
  EAttribute getResourceGroup_Cost();

  /**
   * Returns the meta object for the attribute '{@link com.lowcoupling.mdpm.lng.resources.resources.ResourceGroup#getCostLabel <em>Cost Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cost Label</em>'.
   * @see com.lowcoupling.mdpm.lng.resources.resources.ResourceGroup#getCostLabel()
   * @see #getResourceGroup()
   * @generated
   */
  EAttribute getResourceGroup_CostLabel();

  /**
   * Returns the meta object for the attribute '{@link com.lowcoupling.mdpm.lng.resources.resources.ResourceGroup#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see com.lowcoupling.mdpm.lng.resources.resources.ResourceGroup#getType()
   * @see #getResourceGroup()
   * @generated
   */
  EAttribute getResourceGroup_Type();

  /**
   * Returns the meta object for class '{@link com.lowcoupling.mdpm.lng.resources.resources.Resource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resource</em>'.
   * @see com.lowcoupling.mdpm.lng.resources.resources.Resource
   * @generated
   */
  EClass getResource();

  /**
   * Returns the meta object for the attribute '{@link com.lowcoupling.mdpm.lng.resources.resources.Resource#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.lowcoupling.mdpm.lng.resources.resources.Resource#getName()
   * @see #getResource()
   * @generated
   */
  EAttribute getResource_Name();

  /**
   * Returns the meta object for the reference '{@link com.lowcoupling.mdpm.lng.resources.resources.Resource#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see com.lowcoupling.mdpm.lng.resources.resources.Resource#getType()
   * @see #getResource()
   * @generated
   */
  EReference getResource_Type();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ResourcesFactory getResourcesFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.lowcoupling.mdpm.lng.resources.resources.impl.ResourcesImpl <em>Resources</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.lowcoupling.mdpm.lng.resources.resources.impl.ResourcesImpl
     * @see com.lowcoupling.mdpm.lng.resources.resources.impl.ResourcesPackageImpl#getResources()
     * @generated
     */
    EClass RESOURCES = eINSTANCE.getResources();

    /**
     * The meta object literal for the '<em><b>Resource Groups</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCES__RESOURCE_GROUPS = eINSTANCE.getResources_ResourceGroups();

    /**
     * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCES__RESOURCES = eINSTANCE.getResources_Resources();

    /**
     * The meta object literal for the '{@link com.lowcoupling.mdpm.lng.resources.resources.impl.ResourceGroupImpl <em>Resource Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.lowcoupling.mdpm.lng.resources.resources.impl.ResourceGroupImpl
     * @see com.lowcoupling.mdpm.lng.resources.resources.impl.ResourcesPackageImpl#getResourceGroup()
     * @generated
     */
    EClass RESOURCE_GROUP = eINSTANCE.getResourceGroup();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE_GROUP__NAME = eINSTANCE.getResourceGroup_Name();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE_GROUP__ID = eINSTANCE.getResourceGroup_Id();

    /**
     * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE_GROUP__COST = eINSTANCE.getResourceGroup_Cost();

    /**
     * The meta object literal for the '<em><b>Cost Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE_GROUP__COST_LABEL = eINSTANCE.getResourceGroup_CostLabel();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE_GROUP__TYPE = eINSTANCE.getResourceGroup_Type();

    /**
     * The meta object literal for the '{@link com.lowcoupling.mdpm.lng.resources.resources.impl.ResourceImpl <em>Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.lowcoupling.mdpm.lng.resources.resources.impl.ResourceImpl
     * @see com.lowcoupling.mdpm.lng.resources.resources.impl.ResourcesPackageImpl#getResource()
     * @generated
     */
    EClass RESOURCE = eINSTANCE.getResource();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE__NAME = eINSTANCE.getResource_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCE__TYPE = eINSTANCE.getResource_Type();

  }

} //ResourcesPackage
