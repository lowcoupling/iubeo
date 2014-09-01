/**
 */
package com.lowcoupling.mdpm.lng.rml.rML;

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
 * @see com.lowcoupling.mdpm.lng.rml.rML.RMLFactory
 * @model kind="package"
 * @generated
 */
public interface RMLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "rML";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.lowcoupling.com/lng/rml/RML";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "rML";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RMLPackage eINSTANCE = com.lowcoupling.mdpm.lng.rml.rML.impl.RMLPackageImpl.init();

  /**
   * The meta object id for the '{@link com.lowcoupling.mdpm.lng.rml.rML.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.lowcoupling.mdpm.lng.rml.rML.impl.ModelImpl
   * @see com.lowcoupling.mdpm.lng.rml.rML.impl.RMLPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Packages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PACKAGES = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.lowcoupling.mdpm.lng.rml.rML.impl.REQNodeImpl <em>REQ Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.lowcoupling.mdpm.lng.rml.rML.impl.REQNodeImpl
   * @see com.lowcoupling.mdpm.lng.rml.rML.impl.RMLPackageImpl#getREQNode()
   * @generated
   */
  int REQ_NODE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQ_NODE__NAME = 0;

  /**
   * The number of structural features of the '<em>REQ Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQ_NODE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.lowcoupling.mdpm.lng.rml.rML.impl.REQPackageImpl <em>REQ Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.lowcoupling.mdpm.lng.rml.rML.impl.REQPackageImpl
   * @see com.lowcoupling.mdpm.lng.rml.rML.impl.RMLPackageImpl#getREQPackage()
   * @generated
   */
  int REQ_PACKAGE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQ_PACKAGE__NAME = REQ_NODE__NAME;

  /**
   * The feature id for the '<em><b>Package</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQ_PACKAGE__PACKAGE = REQ_NODE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQ_PACKAGE__REQUIREMENTS = REQ_NODE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>REQ Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQ_PACKAGE_FEATURE_COUNT = REQ_NODE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.lowcoupling.mdpm.lng.rml.rML.impl.REQRequirementImpl <em>REQ Requirement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.lowcoupling.mdpm.lng.rml.rML.impl.REQRequirementImpl
   * @see com.lowcoupling.mdpm.lng.rml.rML.impl.RMLPackageImpl#getREQRequirement()
   * @generated
   */
  int REQ_REQUIREMENT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQ_REQUIREMENT__NAME = REQ_NODE__NAME;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQ_REQUIREMENT__TEXT = REQ_NODE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>REQ Requirement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQ_REQUIREMENT_FEATURE_COUNT = REQ_NODE_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link com.lowcoupling.mdpm.lng.rml.rML.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see com.lowcoupling.mdpm.lng.rml.rML.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link com.lowcoupling.mdpm.lng.rml.rML.Model#getPackages <em>Packages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Packages</em>'.
   * @see com.lowcoupling.mdpm.lng.rml.rML.Model#getPackages()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Packages();

  /**
   * Returns the meta object for class '{@link com.lowcoupling.mdpm.lng.rml.rML.REQPackage <em>REQ Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>REQ Package</em>'.
   * @see com.lowcoupling.mdpm.lng.rml.rML.REQPackage
   * @generated
   */
  EClass getREQPackage();

  /**
   * Returns the meta object for the containment reference list '{@link com.lowcoupling.mdpm.lng.rml.rML.REQPackage#getPackage <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Package</em>'.
   * @see com.lowcoupling.mdpm.lng.rml.rML.REQPackage#getPackage()
   * @see #getREQPackage()
   * @generated
   */
  EReference getREQPackage_Package();

  /**
   * Returns the meta object for the containment reference list '{@link com.lowcoupling.mdpm.lng.rml.rML.REQPackage#getRequirements <em>Requirements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Requirements</em>'.
   * @see com.lowcoupling.mdpm.lng.rml.rML.REQPackage#getRequirements()
   * @see #getREQPackage()
   * @generated
   */
  EReference getREQPackage_Requirements();

  /**
   * Returns the meta object for class '{@link com.lowcoupling.mdpm.lng.rml.rML.REQRequirement <em>REQ Requirement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>REQ Requirement</em>'.
   * @see com.lowcoupling.mdpm.lng.rml.rML.REQRequirement
   * @generated
   */
  EClass getREQRequirement();

  /**
   * Returns the meta object for the attribute '{@link com.lowcoupling.mdpm.lng.rml.rML.REQRequirement#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see com.lowcoupling.mdpm.lng.rml.rML.REQRequirement#getText()
   * @see #getREQRequirement()
   * @generated
   */
  EAttribute getREQRequirement_Text();

  /**
   * Returns the meta object for class '{@link com.lowcoupling.mdpm.lng.rml.rML.REQNode <em>REQ Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>REQ Node</em>'.
   * @see com.lowcoupling.mdpm.lng.rml.rML.REQNode
   * @generated
   */
  EClass getREQNode();

  /**
   * Returns the meta object for the attribute '{@link com.lowcoupling.mdpm.lng.rml.rML.REQNode#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.lowcoupling.mdpm.lng.rml.rML.REQNode#getName()
   * @see #getREQNode()
   * @generated
   */
  EAttribute getREQNode_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  RMLFactory getRMLFactory();

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
     * The meta object literal for the '{@link com.lowcoupling.mdpm.lng.rml.rML.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.lowcoupling.mdpm.lng.rml.rML.impl.ModelImpl
     * @see com.lowcoupling.mdpm.lng.rml.rML.impl.RMLPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PACKAGES = eINSTANCE.getModel_Packages();

    /**
     * The meta object literal for the '{@link com.lowcoupling.mdpm.lng.rml.rML.impl.REQPackageImpl <em>REQ Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.lowcoupling.mdpm.lng.rml.rML.impl.REQPackageImpl
     * @see com.lowcoupling.mdpm.lng.rml.rML.impl.RMLPackageImpl#getREQPackage()
     * @generated
     */
    EClass REQ_PACKAGE = eINSTANCE.getREQPackage();

    /**
     * The meta object literal for the '<em><b>Package</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQ_PACKAGE__PACKAGE = eINSTANCE.getREQPackage_Package();

    /**
     * The meta object literal for the '<em><b>Requirements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQ_PACKAGE__REQUIREMENTS = eINSTANCE.getREQPackage_Requirements();

    /**
     * The meta object literal for the '{@link com.lowcoupling.mdpm.lng.rml.rML.impl.REQRequirementImpl <em>REQ Requirement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.lowcoupling.mdpm.lng.rml.rML.impl.REQRequirementImpl
     * @see com.lowcoupling.mdpm.lng.rml.rML.impl.RMLPackageImpl#getREQRequirement()
     * @generated
     */
    EClass REQ_REQUIREMENT = eINSTANCE.getREQRequirement();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQ_REQUIREMENT__TEXT = eINSTANCE.getREQRequirement_Text();

    /**
     * The meta object literal for the '{@link com.lowcoupling.mdpm.lng.rml.rML.impl.REQNodeImpl <em>REQ Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.lowcoupling.mdpm.lng.rml.rML.impl.REQNodeImpl
     * @see com.lowcoupling.mdpm.lng.rml.rML.impl.RMLPackageImpl#getREQNode()
     * @generated
     */
    EClass REQ_NODE = eINSTANCE.getREQNode();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQ_NODE__NAME = eINSTANCE.getREQNode_Name();

  }

} //RMLPackage
