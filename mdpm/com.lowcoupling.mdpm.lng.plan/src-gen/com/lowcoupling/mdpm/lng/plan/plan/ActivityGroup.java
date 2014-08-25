/**
 */
package com.lowcoupling.mdpm.lng.plan.plan;

import com.lowcoupling.mdpm.lng.wbs.wBS.WBSActivity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.lowcoupling.mdpm.lng.plan.plan.ActivityGroup#getWbsActivity <em>Wbs Activity</em>}</li>
 *   <li>{@link com.lowcoupling.mdpm.lng.plan.plan.ActivityGroup#getActivities <em>Activities</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.lowcoupling.mdpm.lng.plan.plan.PlanPackage#getActivityGroup()
 * @model
 * @generated
 */
public interface ActivityGroup extends ActivityElement
{
  /**
   * Returns the value of the '<em><b>Wbs Activity</b></em>' reference list.
   * The list contents are of type {@link com.lowcoupling.mdpm.lng.wbs.wBS.WBSActivity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wbs Activity</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Wbs Activity</em>' reference list.
   * @see com.lowcoupling.mdpm.lng.plan.plan.PlanPackage#getActivityGroup_WbsActivity()
   * @model
   * @generated
   */
  EList<WBSActivity> getWbsActivity();

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
   * @see com.lowcoupling.mdpm.lng.plan.plan.PlanPackage#getActivityGroup_Activities()
   * @model containment="true"
   * @generated
   */
  EList<ActivityElement> getActivities();

} // ActivityGroup
