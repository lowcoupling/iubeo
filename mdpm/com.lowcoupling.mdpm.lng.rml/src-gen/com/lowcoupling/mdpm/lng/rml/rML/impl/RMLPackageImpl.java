/**
 */
package com.lowcoupling.mdpm.lng.rml.rML.impl;

import com.lowcoupling.mdpm.lng.rml.rML.Model;
import com.lowcoupling.mdpm.lng.rml.rML.REQNode;
import com.lowcoupling.mdpm.lng.rml.rML.REQPackage;
import com.lowcoupling.mdpm.lng.rml.rML.REQRequirement;
import com.lowcoupling.mdpm.lng.rml.rML.RMLFactory;
import com.lowcoupling.mdpm.lng.rml.rML.RMLPackage;

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
public class RMLPackageImpl extends EPackageImpl implements RMLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass reqPackageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass reqRequirementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass reqNodeEClass = null;

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
   * @see com.lowcoupling.mdpm.lng.rml.rML.RMLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private RMLPackageImpl()
  {
    super(eNS_URI, RMLFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link RMLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static RMLPackage init()
  {
    if (isInited) return (RMLPackage)EPackage.Registry.INSTANCE.getEPackage(RMLPackage.eNS_URI);

    // Obtain or create and register package
    RMLPackageImpl theRMLPackage = (RMLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RMLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RMLPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theRMLPackage.createPackageContents();

    // Initialize created meta-data
    theRMLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theRMLPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(RMLPackage.eNS_URI, theRMLPackage);
    return theRMLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Packages()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getREQPackage()
  {
    return reqPackageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getREQPackage_Package()
  {
    return (EReference)reqPackageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getREQPackage_Requirements()
  {
    return (EReference)reqPackageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getREQRequirement()
  {
    return reqRequirementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getREQRequirement_Text()
  {
    return (EAttribute)reqRequirementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getREQNode()
  {
    return reqNodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getREQNode_Name()
  {
    return (EAttribute)reqNodeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RMLFactory getRMLFactory()
  {
    return (RMLFactory)getEFactoryInstance();
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
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__PACKAGES);

    reqPackageEClass = createEClass(REQ_PACKAGE);
    createEReference(reqPackageEClass, REQ_PACKAGE__PACKAGE);
    createEReference(reqPackageEClass, REQ_PACKAGE__REQUIREMENTS);

    reqRequirementEClass = createEClass(REQ_REQUIREMENT);
    createEAttribute(reqRequirementEClass, REQ_REQUIREMENT__TEXT);

    reqNodeEClass = createEClass(REQ_NODE);
    createEAttribute(reqNodeEClass, REQ_NODE__NAME);
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

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    reqPackageEClass.getESuperTypes().add(this.getREQNode());
    reqRequirementEClass.getESuperTypes().add(this.getREQNode());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Packages(), this.getREQPackage(), null, "packages", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(reqPackageEClass, REQPackage.class, "REQPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getREQPackage_Package(), this.getREQPackage(), null, "package", null, 0, -1, REQPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getREQPackage_Requirements(), this.getREQRequirement(), null, "requirements", null, 0, -1, REQPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(reqRequirementEClass, REQRequirement.class, "REQRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getREQRequirement_Text(), ecorePackage.getEString(), "text", null, 0, 1, REQRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(reqNodeEClass, REQNode.class, "REQNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getREQNode_Name(), ecorePackage.getEString(), "name", null, 0, 1, REQNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //RMLPackageImpl
