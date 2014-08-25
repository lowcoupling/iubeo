/**
 */
package com.lowcoupling.mdpm.lng.wbs.wBS.impl;

import com.lowcoupling.mdpm.lng.rml.rML.RMLPackage;

import com.lowcoupling.mdpm.lng.wbs.wBS.RequirementImport;
import com.lowcoupling.mdpm.lng.wbs.wBS.WBSActivity;
import com.lowcoupling.mdpm.lng.wbs.wBS.WBSDeliverable;
import com.lowcoupling.mdpm.lng.wbs.wBS.WBSFactory;
import com.lowcoupling.mdpm.lng.wbs.wBS.WBSNode;
import com.lowcoupling.mdpm.lng.wbs.wBS.WBSPackage;
import com.lowcoupling.mdpm.lng.wbs.wBS.WBSProgram;
import com.lowcoupling.mdpm.lng.wbs.wBS.WBSProject;
import com.lowcoupling.mdpm.lng.wbs.wBS.WBSWorkPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WBSPackageImpl extends EPackageImpl implements WBSPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wbsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wbsProgramEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wbsProjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wbsNodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wbsActivityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wbsWorkPackageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wbsDeliverableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass requirementImportEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.lowcoupling.mdpm.lng.wbs.wBS.WBSPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private WBSPackageImpl()
  {
    super(eNS_URI, WBSFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link WBSPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static WBSPackage init()
  {
    if (isInited) return (WBSPackage)EPackage.Registry.INSTANCE.getEPackage(WBSPackage.eNS_URI);

    // Obtain or create and register package
    WBSPackageImpl theWBSPackage = (WBSPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WBSPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WBSPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    RMLPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theWBSPackage.createPackageContents();

    // Initialize created meta-data
    theWBSPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theWBSPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(WBSPackage.eNS_URI, theWBSPackage);
    return theWBSPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWBS()
  {
    return wbsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWBS_Description()
  {
    return (EAttribute)wbsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWBS_Name()
  {
    return (EAttribute)wbsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWBS_RequirementsModel()
  {
    return (EReference)wbsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWBS_Requirements()
  {
    return (EReference)wbsEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWBSProgram()
  {
    return wbsProgramEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWBSProgram_Projects()
  {
    return (EReference)wbsProgramEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWBSProject()
  {
    return wbsProjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWBSProject_WbsNodes()
  {
    return (EReference)wbsProjectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWBSNode()
  {
    return wbsNodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWBSNode_Description()
  {
    return (EAttribute)wbsNodeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWBSNode_Name()
  {
    return (EAttribute)wbsNodeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWBSNode_WbsNodes()
  {
    return (EReference)wbsNodeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWBSNode_Requirements()
  {
    return (EReference)wbsNodeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWBSActivity()
  {
    return wbsActivityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWBSWorkPackage()
  {
    return wbsWorkPackageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWBSDeliverable()
  {
    return wbsDeliverableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRequirementImport()
  {
    return requirementImportEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRequirementImport_ImportURI()
  {
    return (EAttribute)requirementImportEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WBSFactory getWBSFactory()
  {
    return (WBSFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    wbsEClass = createEClass(WBS);
    createEAttribute(wbsEClass, WBS__DESCRIPTION);
    createEAttribute(wbsEClass, WBS__NAME);
    createEReference(wbsEClass, WBS__REQUIREMENTS_MODEL);
    createEReference(wbsEClass, WBS__REQUIREMENTS);

    wbsProgramEClass = createEClass(WBS_PROGRAM);
    createEReference(wbsProgramEClass, WBS_PROGRAM__PROJECTS);

    wbsProjectEClass = createEClass(WBS_PROJECT);
    createEReference(wbsProjectEClass, WBS_PROJECT__WBS_NODES);

    wbsNodeEClass = createEClass(WBS_NODE);
    createEAttribute(wbsNodeEClass, WBS_NODE__DESCRIPTION);
    createEAttribute(wbsNodeEClass, WBS_NODE__NAME);
    createEReference(wbsNodeEClass, WBS_NODE__WBS_NODES);
    createEReference(wbsNodeEClass, WBS_NODE__REQUIREMENTS);

    wbsActivityEClass = createEClass(WBS_ACTIVITY);

    wbsWorkPackageEClass = createEClass(WBS_WORK_PACKAGE);

    wbsDeliverableEClass = createEClass(WBS_DELIVERABLE);

    requirementImportEClass = createEClass(REQUIREMENT_IMPORT);
    createEAttribute(requirementImportEClass, REQUIREMENT_IMPORT__IMPORT_URI);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    RMLPackage theRMLPackage = (RMLPackage)EPackage.Registry.INSTANCE.getEPackage(RMLPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    wbsProgramEClass.getESuperTypes().add(this.getWBS());
    wbsProjectEClass.getESuperTypes().add(this.getWBS());
    wbsActivityEClass.getESuperTypes().add(this.getWBSNode());
    wbsWorkPackageEClass.getESuperTypes().add(this.getWBSNode());
    wbsDeliverableEClass.getESuperTypes().add(this.getWBSNode());

    // Initialize classes and features; add operations and parameters
    initEClass(wbsEClass, com.lowcoupling.mdpm.lng.wbs.wBS.WBS.class, "WBS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWBS_Description(), ecorePackage.getEString(), "description", null, 0, 1, com.lowcoupling.mdpm.lng.wbs.wBS.WBS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWBS_Name(), ecorePackage.getEString(), "name", null, 0, 1, com.lowcoupling.mdpm.lng.wbs.wBS.WBS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWBS_RequirementsModel(), this.getRequirementImport(), null, "requirementsModel", null, 0, -1, com.lowcoupling.mdpm.lng.wbs.wBS.WBS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWBS_Requirements(), theRMLPackage.getREQNode(), null, "requirements", null, 0, -1, com.lowcoupling.mdpm.lng.wbs.wBS.WBS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wbsProgramEClass, WBSProgram.class, "WBSProgram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWBSProgram_Projects(), this.getWBSProject(), null, "projects", null, 0, -1, WBSProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wbsProjectEClass, WBSProject.class, "WBSProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWBSProject_WbsNodes(), this.getWBSNode(), null, "wbsNodes", null, 0, -1, WBSProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wbsNodeEClass, WBSNode.class, "WBSNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWBSNode_Description(), ecorePackage.getEString(), "description", null, 0, 1, WBSNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWBSNode_Name(), ecorePackage.getEString(), "name", null, 0, 1, WBSNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWBSNode_WbsNodes(), this.getWBSNode(), null, "wbsNodes", null, 0, -1, WBSNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWBSNode_Requirements(), theRMLPackage.getREQNode(), null, "requirements", null, 0, -1, WBSNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wbsActivityEClass, WBSActivity.class, "WBSActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(wbsWorkPackageEClass, WBSWorkPackage.class, "WBSWorkPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(wbsDeliverableEClass, WBSDeliverable.class, "WBSDeliverable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(requirementImportEClass, RequirementImport.class, "RequirementImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRequirementImport_ImportURI(), ecorePackage.getEString(), "importURI", null, 0, 1, RequirementImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //WBSPackageImpl
