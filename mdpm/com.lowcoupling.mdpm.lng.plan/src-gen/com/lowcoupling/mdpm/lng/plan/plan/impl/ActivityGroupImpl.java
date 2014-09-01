/**
 */
package com.lowcoupling.mdpm.lng.plan.plan.impl;

import com.lowcoupling.mdpm.lng.plan.plan.ActivityElement;
import com.lowcoupling.mdpm.lng.plan.plan.ActivityGroup;
import com.lowcoupling.mdpm.lng.plan.plan.PlanPackage;

import com.lowcoupling.mdpm.lng.wbs.wBS.WBSNode;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.lowcoupling.mdpm.lng.plan.plan.impl.ActivityGroupImpl#getWbsActivity <em>Wbs Activity</em>}</li>
 *   <li>{@link com.lowcoupling.mdpm.lng.plan.plan.impl.ActivityGroupImpl#getActivities <em>Activities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityGroupImpl extends ActivityElementImpl implements ActivityGroup
{
  /**
   * The cached value of the '{@link #getWbsActivity() <em>Wbs Activity</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWbsActivity()
   * @generated
   * @ordered
   */
  protected EList<WBSNode> wbsActivity;

  /**
   * The cached value of the '{@link #getActivities() <em>Activities</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActivities()
   * @generated
   * @ordered
   */
  protected EList<ActivityElement> activities;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActivityGroupImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PlanPackage.Literals.ACTIVITY_GROUP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<WBSNode> getWbsActivity()
  {
    if (wbsActivity == null)
    {
      wbsActivity = new EObjectResolvingEList<WBSNode>(WBSNode.class, this, PlanPackage.ACTIVITY_GROUP__WBS_ACTIVITY);
    }
    return wbsActivity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ActivityElement> getActivities()
  {
    if (activities == null)
    {
      activities = new EObjectContainmentEList<ActivityElement>(ActivityElement.class, this, PlanPackage.ACTIVITY_GROUP__ACTIVITIES);
    }
    return activities;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PlanPackage.ACTIVITY_GROUP__ACTIVITIES:
        return ((InternalEList<?>)getActivities()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PlanPackage.ACTIVITY_GROUP__WBS_ACTIVITY:
        return getWbsActivity();
      case PlanPackage.ACTIVITY_GROUP__ACTIVITIES:
        return getActivities();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PlanPackage.ACTIVITY_GROUP__WBS_ACTIVITY:
        getWbsActivity().clear();
        getWbsActivity().addAll((Collection<? extends WBSNode>)newValue);
        return;
      case PlanPackage.ACTIVITY_GROUP__ACTIVITIES:
        getActivities().clear();
        getActivities().addAll((Collection<? extends ActivityElement>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PlanPackage.ACTIVITY_GROUP__WBS_ACTIVITY:
        getWbsActivity().clear();
        return;
      case PlanPackage.ACTIVITY_GROUP__ACTIVITIES:
        getActivities().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PlanPackage.ACTIVITY_GROUP__WBS_ACTIVITY:
        return wbsActivity != null && !wbsActivity.isEmpty();
      case PlanPackage.ACTIVITY_GROUP__ACTIVITIES:
        return activities != null && !activities.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ActivityGroupImpl
