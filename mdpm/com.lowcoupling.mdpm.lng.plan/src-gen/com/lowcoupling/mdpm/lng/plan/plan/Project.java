/**
 */
package com.lowcoupling.mdpm.lng.plan.plan;

import com.lowcoupling.mdpm.lng.wbs.wBS.WBSProject;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.lowcoupling.mdpm.lng.plan.plan.Project#getDescription <em>Description</em>}</li>
 *   <li>{@link com.lowcoupling.mdpm.lng.plan.plan.Project#getName <em>Name</em>}</li>
 *   <li>{@link com.lowcoupling.mdpm.lng.plan.plan.Project#getLongName <em>Long Name</em>}</li>
 *   <li>{@link com.lowcoupling.mdpm.lng.plan.plan.Project#getWbs <em>Wbs</em>}</li>
 *   <li>{@link com.lowcoupling.mdpm.lng.plan.plan.Project#getWbsProject <em>Wbs Project</em>}</li>
 *   <li>{@link com.lowcoupling.mdpm.lng.plan.plan.Project#getResources <em>Resources</em>}</li>
 *   <li>{@link com.lowcoupling.mdpm.lng.plan.plan.Project#getPlans <em>Plans</em>}</li>
 *   <li>{@link com.lowcoupling.mdpm.lng.plan.plan.Project#getAssumptions <em>Assumptions</em>}</li>
 *   <li>{@link com.lowcoupling.mdpm.lng.plan.plan.Project#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link com.lowcoupling.mdpm.lng.plan.plan.Project#getActivities <em>Activities</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.lowcoupling.mdpm.lng.plan.plan.PlanPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject
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
   * @see com.lowcoupling.mdpm.lng.plan.plan.PlanPackage#getProject_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link com.lowcoupling.mdpm.lng.plan.plan.Project#getDescription <em>Description</em>}' attribute.
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
   * @see com.lowcoupling.mdpm.lng.plan.plan.PlanPackage#getProject_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.lowcoupling.mdpm.lng.plan.plan.Project#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Long Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Long Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Long Name</em>' attribute.
   * @see #setLongName(String)
   * @see com.lowcoupling.mdpm.lng.plan.plan.PlanPackage#getProject_LongName()
   * @model
   * @generated
   */
  String getLongName();

  /**
   * Sets the value of the '{@link com.lowcoupling.mdpm.lng.plan.plan.Project#getLongName <em>Long Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Long Name</em>' attribute.
   * @see #getLongName()
   * @generated
   */
  void setLongName(String value);

  /**
   * Returns the value of the '<em><b>Wbs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wbs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Wbs</em>' containment reference.
   * @see #setWbs(WBSImport)
   * @see com.lowcoupling.mdpm.lng.plan.plan.PlanPackage#getProject_Wbs()
   * @model containment="true"
   * @generated
   */
  WBSImport getWbs();

  /**
   * Sets the value of the '{@link com.lowcoupling.mdpm.lng.plan.plan.Project#getWbs <em>Wbs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Wbs</em>' containment reference.
   * @see #getWbs()
   * @generated
   */
  void setWbs(WBSImport value);

  /**
   * Returns the value of the '<em><b>Wbs Project</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wbs Project</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Wbs Project</em>' reference.
   * @see #setWbsProject(WBSProject)
   * @see com.lowcoupling.mdpm.lng.plan.plan.PlanPackage#getProject_WbsProject()
   * @model
   * @generated
   */
  WBSProject getWbsProject();

  /**
   * Sets the value of the '{@link com.lowcoupling.mdpm.lng.plan.plan.Project#getWbsProject <em>Wbs Project</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Wbs Project</em>' reference.
   * @see #getWbsProject()
   * @generated
   */
  void setWbsProject(WBSProject value);

  /**
   * Returns the value of the '<em><b>Resources</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resources</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resources</em>' containment reference.
   * @see #setResources(ResourcesImport)
   * @see com.lowcoupling.mdpm.lng.plan.plan.PlanPackage#getProject_Resources()
   * @model containment="true"
   * @generated
   */
  ResourcesImport getResources();

  /**
   * Sets the value of the '{@link com.lowcoupling.mdpm.lng.plan.plan.Project#getResources <em>Resources</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Resources</em>' containment reference.
   * @see #getResources()
   * @generated
   */
  void setResources(ResourcesImport value);

  /**
   * Returns the value of the '<em><b>Plans</b></em>' containment reference list.
   * The list contents are of type {@link com.lowcoupling.mdpm.lng.plan.plan.PlanImport}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Plans</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Plans</em>' containment reference list.
   * @see com.lowcoupling.mdpm.lng.plan.plan.PlanPackage#getProject_Plans()
   * @model containment="true"
   * @generated
   */
  EList<PlanImport> getPlans();

  /**
   * Returns the value of the '<em><b>Assumptions</b></em>' containment reference list.
   * The list contents are of type {@link com.lowcoupling.mdpm.lng.plan.plan.Assumption}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assumptions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assumptions</em>' containment reference list.
   * @see com.lowcoupling.mdpm.lng.plan.plan.PlanPackage#getProject_Assumptions()
   * @model containment="true"
   * @generated
   */
  EList<Assumption> getAssumptions();

  /**
   * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
   * The list contents are of type {@link com.lowcoupling.mdpm.lng.plan.plan.Constraint}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraints</em>' containment reference list.
   * @see com.lowcoupling.mdpm.lng.plan.plan.PlanPackage#getProject_Constraints()
   * @model containment="true"
   * @generated
   */
  EList<Constraint> getConstraints();

  /**
   * Returns the value of the '<em><b>Activities</b></em>' containment reference list.
   * The list contents are of type {@link com.lowcoupling.mdpm.lng.plan.plan.ActivityElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Activities</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Activities</em>' containment reference list.
   * @see com.lowcoupling.mdpm.lng.plan.plan.PlanPackage#getProject_Activities()
   * @model containment="true"
   * @generated
   */
  EList<ActivityElement> getActivities();

} // Project
