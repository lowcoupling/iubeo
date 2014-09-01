/**
 */
package com.lowcoupling.mdpm.lng.wbs.wBS;

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
 * @see com.lowcoupling.mdpm.lng.wbs.wBS.WBSFactory
 * @model kind="package"
 * @generated
 */
public interface WBSPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "wBS";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.lowcoupling.com/mdpm/lng/wbs/WBS";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "wBS";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  WBSPackage eINSTANCE = com.lowcoupling.mdpm.lng.wbs.wBS.impl.WBSPackageImpl.init();

  /**
   * The meta object id for the '{@link com.lowcoupling.mdpm.lng.wbs.wBS.impl.WBSImpl <em>WBS</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.lowcoupling.mdpm.lng.wbs.wBS.impl.WBSImpl
   * @see com.lowcoupling.mdpm.lng.wbs.wBS.impl.WBSPackageImpl#getWBS()
   * @generated
   */
  int WBS = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WBS__DESCRIPTION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WBS__NAME = 1;

  /**
   * The feature id for the '<em><b>Requirements Model</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WBS__REQUIREMENTS_MODEL = 2;

  /**
   * The feature id for the '<em><b>Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WBS__REQUIREMENTS = 3;

  /**
   * The number of structural features of the '<em>WBS</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WBS_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.lowcoupling.mdpm.lng.wbs.wBS.impl.WBSProgramImpl <em>Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.lowcoupling.mdpm.lng.wbs.wBS.impl.WBSProgramImpl
   * @see com.lowcoupling.mdpm.lng.wbs.wBS.impl.WBSPackageImpl#getWBSProgram()
   * @generated
   */
  int WBS_PROGRAM = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WBS_PROGRAM__DESCRIPTION = WBS__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WBS_PROGRAM__NAME = WBS__NAME;

  /**
   * The feature id for the '<em><b>Requirements Model</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WBS_PROGRAM__REQUIREMENTS_MODEL = WBS__REQUIREMENTS_MODEL;

  /**
   * The feature id for the '<em><b>Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WBS_PROGRAM__REQUIREMENTS = WBS__REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Projects</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WBS_PROGRAM__PROJECTS = WBS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WBS_PROGRAM_FEATURE_COUNT = WBS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.lowcoupling.mdpm.lng.wbs.wBS.impl.WBSProjectImpl <em>Project</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.lowcoupling.mdpm.lng.wbs.wBS.impl.WBSProjectImpl
   * @see com.lowcoupling.mdpm.lng.wbs.wBS.impl.WBSPackageImpl#getWBSProject()
   * @generated
   */
  int WBS_PROJECT = 2;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WBS_PROJECT__DESCRIPTION = WBS__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WBS_PROJECT__NAME = WBS__NAME;

  /**
   * The feature id for the '<em><b>Requirements Model</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WBS_PROJECT__REQUIREMENTS_MODEL = WBS__REQUIREMENTS_MODEL;

  /**
   * The feature id for the '<em><b>Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WBS_PROJECT__REQUIREMENTS = WBS__REQUIREMENTS;

  /**
   * The feature id for the '<em><b>Wbs Nodes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WBS_PROJECT__WBS_NODES = WBS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Project</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WBS_PROJECT_FEATURE_COUNT = WBS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.lowcoupling.mdpm.lng.wbs.wBS.impl.WBSNodeImpl <em>Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.lowcoupling.mdpm.lng.wbs.wBS.impl.WBSNodeImpl
   * @see com.lowcoupling.mdpm.lng.wbs.wBS.impl.WBSPackageImpl#getWBSNode()
   * @generated
   */
  int WBS_NODE = 3;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WBS_NODE__DESCRIPTION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WBS_NODE__NAME = 1;

  /**
   * The feature id for the '<em><b>Wbs Nodes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WBS_NODE__WBS_NODES = 2;

  /**
   * The feature id for the '<em><b>Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WBS_NODE__REQUIREMENTS = 3;

  /**
   * The number of structural features of the '<em>Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WBS_NODE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.lowcoupling.mdpm.lng.wbs.wBS.impl.WBSActivityImpl <em>Activity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.lowcoupling.mdpm.lng.wbs.wBS.impl.WBSActivityImpl
   * @see com.lowcoupling.mdpm.lng.wbs.wBS.impl.WBSPackageImpl#getWBSActivity()
   * @generated
   */
  int WBS_ACTIVITY = 4;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WBS_ACTIVITY__DESCRIPTION = WBS_NODE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WBS_ACTIVITY__NAME = WBS_NODE__NAME;

  /**
   * The feature id for the '<em><b>Wbs Nodes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WBS_ACTIVITY__WBS_NODES = WBS_NODE__WBS_NODES;

  /**
   * The feature id for the '<em><b>Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WBS_ACTIVITY__REQUIREMENTS = WBS_NODE__REQUIREMENTS;

  /**
   * The number of structural features of the '<em>Activity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WBS_ACTIVITY_FEATURE_COUNT = WBS_NODE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.lowcoupling.mdpm.lng.wbs.wBS.impl.WBSWorkPackageImpl <em>Work Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.lowcoupling.mdpm.lng.wbs.wBS.impl.WBSWorkPackageImpl
   * @see com.lowcoupling.mdpm.lng.wbs.wBS.impl.WBSPackageImpl#getWBSWorkPackage()
   * @generated
   */
  int WBS_WORK_PACKAGE = 5;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WBS_WORK_PACKAGE__DESCRIPTION = WBS_NODE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WBS_WORK_PACKAGE__NAME = WBS_NODE__NAME;

  /**
   * The feature id for the '<em><b>Wbs Nodes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WBS_WORK_PACKAGE__WBS_NODES = WBS_NODE__WBS_NODES;

  /**
   * The feature id for the '<em><b>Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WBS_WORK_PACKAGE__REQUIREMENTS = WBS_NODE__REQUIREMENTS;

  /**
   * The number of structural features of the '<em>Work Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WBS_WORK_PACKAGE_FEATURE_COUNT = WBS_NODE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.lowcoupling.mdpm.lng.wbs.wBS.impl.WBSDeliverableImpl <em>Deliverable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.lowcoupling.mdpm.lng.wbs.wBS.impl.WBSDeliverableImpl
   * @see com.lowcoupling.mdpm.lng.wbs.wBS.impl.WBSPackageImpl#getWBSDeliverable()
   * @generated
   */
  int WBS_DELIVERABLE = 6;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WBS_DELIVERABLE__DESCRIPTION = WBS_NODE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WBS_DELIVERABLE__NAME = WBS_NODE__NAME;

  /**
   * The feature id for the '<em><b>Wbs Nodes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WBS_DELIVERABLE__WBS_NODES = WBS_NODE__WBS_NODES;

  /**
   * The feature id for the '<em><b>Requirements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WBS_DELIVERABLE__REQUIREMENTS = WBS_NODE__REQUIREMENTS;

  /**
   * The number of structural features of the '<em>Deliverable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WBS_DELIVERABLE_FEATURE_COUNT = WBS_NODE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.lowcoupling.mdpm.lng.wbs.wBS.impl.RequirementImportImpl <em>Requirement Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.lowcoupling.mdpm.lng.wbs.wBS.impl.RequirementImportImpl
   * @see com.lowcoupling.mdpm.lng.wbs.wBS.impl.WBSPackageImpl#getRequirementImport()
   * @generated
   */
  int REQUIREMENT_IMPORT = 7;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT_IMPORT__IMPORT_URI = 0;

  /**
   * The number of structural features of the '<em>Requirement Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT_IMPORT_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link com.lowcoupling.mdpm.lng.wbs.wBS.WBS <em>WBS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>WBS</em>'.
   * @see com.lowcoupling.mdpm.lng.wbs.wBS.WBS
   * @generated
   */
  EClass getWBS();

  /**
   * Returns the meta object for the attribute '{@link com.lowcoupling.mdpm.lng.wbs.wBS.WBS#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see com.lowcoupling.mdpm.lng.wbs.wBS.WBS#getDescription()
   * @see #getWBS()
   * @generated
   */
  EAttribute getWBS_Description();

  /**
   * Returns the meta object for the attribute '{@link com.lowcoupling.mdpm.lng.wbs.wBS.WBS#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.lowcoupling.mdpm.lng.wbs.wBS.WBS#getName()
   * @see #getWBS()
   * @generated
   */
  EAttribute getWBS_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.lowcoupling.mdpm.lng.wbs.wBS.WBS#getRequirementsModel <em>Requirements Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Requirements Model</em>'.
   * @see com.lowcoupling.mdpm.lng.wbs.wBS.WBS#getRequirementsModel()
   * @see #getWBS()
   * @generated
   */
  EReference getWBS_RequirementsModel();

  /**
   * Returns the meta object for the reference list '{@link com.lowcoupling.mdpm.lng.wbs.wBS.WBS#getRequirements <em>Requirements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Requirements</em>'.
   * @see com.lowcoupling.mdpm.lng.wbs.wBS.WBS#getRequirements()
   * @see #getWBS()
   * @generated
   */
  EReference getWBS_Requirements();

  /**
   * Returns the meta object for class '{@link com.lowcoupling.mdpm.lng.wbs.wBS.WBSProgram <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Program</em>'.
   * @see com.lowcoupling.mdpm.lng.wbs.wBS.WBSProgram
   * @generated
   */
  EClass getWBSProgram();

  /**
   * Returns the meta object for the containment reference list '{@link com.lowcoupling.mdpm.lng.wbs.wBS.WBSProgram#getProjects <em>Projects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Projects</em>'.
   * @see com.lowcoupling.mdpm.lng.wbs.wBS.WBSProgram#getProjects()
   * @see #getWBSProgram()
   * @generated
   */
  EReference getWBSProgram_Projects();

  /**
   * Returns the meta object for class '{@link com.lowcoupling.mdpm.lng.wbs.wBS.WBSProject <em>Project</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Project</em>'.
   * @see com.lowcoupling.mdpm.lng.wbs.wBS.WBSProject
   * @generated
   */
  EClass getWBSProject();

  /**
   * Returns the meta object for the containment reference list '{@link com.lowcoupling.mdpm.lng.wbs.wBS.WBSProject#getWbsNodes <em>Wbs Nodes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Wbs Nodes</em>'.
   * @see com.lowcoupling.mdpm.lng.wbs.wBS.WBSProject#getWbsNodes()
   * @see #getWBSProject()
   * @generated
   */
  EReference getWBSProject_WbsNodes();

  /**
   * Returns the meta object for class '{@link com.lowcoupling.mdpm.lng.wbs.wBS.WBSNode <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node</em>'.
   * @see com.lowcoupling.mdpm.lng.wbs.wBS.WBSNode
   * @generated
   */
  EClass getWBSNode();

  /**
   * Returns the meta object for the attribute '{@link com.lowcoupling.mdpm.lng.wbs.wBS.WBSNode#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see com.lowcoupling.mdpm.lng.wbs.wBS.WBSNode#getDescription()
   * @see #getWBSNode()
   * @generated
   */
  EAttribute getWBSNode_Description();

  /**
   * Returns the meta object for the attribute '{@link com.lowcoupling.mdpm.lng.wbs.wBS.WBSNode#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.lowcoupling.mdpm.lng.wbs.wBS.WBSNode#getName()
   * @see #getWBSNode()
   * @generated
   */
  EAttribute getWBSNode_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.lowcoupling.mdpm.lng.wbs.wBS.WBSNode#getWbsNodes <em>Wbs Nodes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Wbs Nodes</em>'.
   * @see com.lowcoupling.mdpm.lng.wbs.wBS.WBSNode#getWbsNodes()
   * @see #getWBSNode()
   * @generated
   */
  EReference getWBSNode_WbsNodes();

  /**
   * Returns the meta object for the reference list '{@link com.lowcoupling.mdpm.lng.wbs.wBS.WBSNode#getRequirements <em>Requirements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Requirements</em>'.
   * @see com.lowcoupling.mdpm.lng.wbs.wBS.WBSNode#getRequirements()
   * @see #getWBSNode()
   * @generated
   */
  EReference getWBSNode_Requirements();

  /**
   * Returns the meta object for class '{@link com.lowcoupling.mdpm.lng.wbs.wBS.WBSActivity <em>Activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Activity</em>'.
   * @see com.lowcoupling.mdpm.lng.wbs.wBS.WBSActivity
   * @generated
   */
  EClass getWBSActivity();

  /**
   * Returns the meta object for class '{@link com.lowcoupling.mdpm.lng.wbs.wBS.WBSWorkPackage <em>Work Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Work Package</em>'.
   * @see com.lowcoupling.mdpm.lng.wbs.wBS.WBSWorkPackage
   * @generated
   */
  EClass getWBSWorkPackage();

  /**
   * Returns the meta object for class '{@link com.lowcoupling.mdpm.lng.wbs.wBS.WBSDeliverable <em>Deliverable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Deliverable</em>'.
   * @see com.lowcoupling.mdpm.lng.wbs.wBS.WBSDeliverable
   * @generated
   */
  EClass getWBSDeliverable();

  /**
   * Returns the meta object for class '{@link com.lowcoupling.mdpm.lng.wbs.wBS.RequirementImport <em>Requirement Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Requirement Import</em>'.
   * @see com.lowcoupling.mdpm.lng.wbs.wBS.RequirementImport
   * @generated
   */
  EClass getRequirementImport();

  /**
   * Returns the meta object for the attribute '{@link com.lowcoupling.mdpm.lng.wbs.wBS.RequirementImport#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see com.lowcoupling.mdpm.lng.wbs.wBS.RequirementImport#getImportURI()
   * @see #getRequirementImport()
   * @generated
   */
  EAttribute getRequirementImport_ImportURI();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  WBSFactory getWBSFactory();

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
     * The meta object literal for the '{@link com.lowcoupling.mdpm.lng.wbs.wBS.impl.WBSImpl <em>WBS</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.lowcoupling.mdpm.lng.wbs.wBS.impl.WBSImpl
     * @see com.lowcoupling.mdpm.lng.wbs.wBS.impl.WBSPackageImpl#getWBS()
     * @generated
     */
    EClass WBS = eINSTANCE.getWBS();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WBS__DESCRIPTION = eINSTANCE.getWBS_Description();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WBS__NAME = eINSTANCE.getWBS_Name();

    /**
     * The meta object literal for the '<em><b>Requirements Model</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WBS__REQUIREMENTS_MODEL = eINSTANCE.getWBS_RequirementsModel();

    /**
     * The meta object literal for the '<em><b>Requirements</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WBS__REQUIREMENTS = eINSTANCE.getWBS_Requirements();

    /**
     * The meta object literal for the '{@link com.lowcoupling.mdpm.lng.wbs.wBS.impl.WBSProgramImpl <em>Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.lowcoupling.mdpm.lng.wbs.wBS.impl.WBSProgramImpl
     * @see com.lowcoupling.mdpm.lng.wbs.wBS.impl.WBSPackageImpl#getWBSProgram()
     * @generated
     */
    EClass WBS_PROGRAM = eINSTANCE.getWBSProgram();

    /**
     * The meta object literal for the '<em><b>Projects</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WBS_PROGRAM__PROJECTS = eINSTANCE.getWBSProgram_Projects();

    /**
     * The meta object literal for the '{@link com.lowcoupling.mdpm.lng.wbs.wBS.impl.WBSProjectImpl <em>Project</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.lowcoupling.mdpm.lng.wbs.wBS.impl.WBSProjectImpl
     * @see com.lowcoupling.mdpm.lng.wbs.wBS.impl.WBSPackageImpl#getWBSProject()
     * @generated
     */
    EClass WBS_PROJECT = eINSTANCE.getWBSProject();

    /**
     * The meta object literal for the '<em><b>Wbs Nodes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WBS_PROJECT__WBS_NODES = eINSTANCE.getWBSProject_WbsNodes();

    /**
     * The meta object literal for the '{@link com.lowcoupling.mdpm.lng.wbs.wBS.impl.WBSNodeImpl <em>Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.lowcoupling.mdpm.lng.wbs.wBS.impl.WBSNodeImpl
     * @see com.lowcoupling.mdpm.lng.wbs.wBS.impl.WBSPackageImpl#getWBSNode()
     * @generated
     */
    EClass WBS_NODE = eINSTANCE.getWBSNode();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WBS_NODE__DESCRIPTION = eINSTANCE.getWBSNode_Description();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WBS_NODE__NAME = eINSTANCE.getWBSNode_Name();

    /**
     * The meta object literal for the '<em><b>Wbs Nodes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WBS_NODE__WBS_NODES = eINSTANCE.getWBSNode_WbsNodes();

    /**
     * The meta object literal for the '<em><b>Requirements</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WBS_NODE__REQUIREMENTS = eINSTANCE.getWBSNode_Requirements();

    /**
     * The meta object literal for the '{@link com.lowcoupling.mdpm.lng.wbs.wBS.impl.WBSActivityImpl <em>Activity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.lowcoupling.mdpm.lng.wbs.wBS.impl.WBSActivityImpl
     * @see com.lowcoupling.mdpm.lng.wbs.wBS.impl.WBSPackageImpl#getWBSActivity()
     * @generated
     */
    EClass WBS_ACTIVITY = eINSTANCE.getWBSActivity();

    /**
     * The meta object literal for the '{@link com.lowcoupling.mdpm.lng.wbs.wBS.impl.WBSWorkPackageImpl <em>Work Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.lowcoupling.mdpm.lng.wbs.wBS.impl.WBSWorkPackageImpl
     * @see com.lowcoupling.mdpm.lng.wbs.wBS.impl.WBSPackageImpl#getWBSWorkPackage()
     * @generated
     */
    EClass WBS_WORK_PACKAGE = eINSTANCE.getWBSWorkPackage();

    /**
     * The meta object literal for the '{@link com.lowcoupling.mdpm.lng.wbs.wBS.impl.WBSDeliverableImpl <em>Deliverable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.lowcoupling.mdpm.lng.wbs.wBS.impl.WBSDeliverableImpl
     * @see com.lowcoupling.mdpm.lng.wbs.wBS.impl.WBSPackageImpl#getWBSDeliverable()
     * @generated
     */
    EClass WBS_DELIVERABLE = eINSTANCE.getWBSDeliverable();

    /**
     * The meta object literal for the '{@link com.lowcoupling.mdpm.lng.wbs.wBS.impl.RequirementImportImpl <em>Requirement Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.lowcoupling.mdpm.lng.wbs.wBS.impl.RequirementImportImpl
     * @see com.lowcoupling.mdpm.lng.wbs.wBS.impl.WBSPackageImpl#getRequirementImport()
     * @generated
     */
    EClass REQUIREMENT_IMPORT = eINSTANCE.getRequirementImport();

    /**
     * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIREMENT_IMPORT__IMPORT_URI = eINSTANCE.getRequirementImport_ImportURI();

  }

} //WBSPackage
