/**
 */
package com.lowcoupling.mdpm.lng.wbs.wBS.impl;

import com.lowcoupling.mdpm.lng.wbs.wBS.WBSNode;
import com.lowcoupling.mdpm.lng.wbs.wBS.WBSPackage;
import com.lowcoupling.mdpm.lng.wbs.wBS.WBSProject;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.lowcoupling.mdpm.lng.wbs.wBS.impl.WBSProjectImpl#getWbsNodes <em>Wbs Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WBSProjectImpl extends WBSImpl implements WBSProject
{
  /**
   * The cached value of the '{@link #getWbsNodes() <em>Wbs Nodes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWbsNodes()
   * @generated
   * @ordered
   */
  protected EList<WBSNode> wbsNodes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WBSProjectImpl()
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
    return WBSPackage.Literals.WBS_PROJECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<WBSNode> getWbsNodes()
  {
    if (wbsNodes == null)
    {
      wbsNodes = new EObjectContainmentEList<WBSNode>(WBSNode.class, this, WBSPackage.WBS_PROJECT__WBS_NODES);
    }
    return wbsNodes;
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
      case WBSPackage.WBS_PROJECT__WBS_NODES:
        return ((InternalEList<?>)getWbsNodes()).basicRemove(otherEnd, msgs);
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
      case WBSPackage.WBS_PROJECT__WBS_NODES:
        return getWbsNodes();
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
      case WBSPackage.WBS_PROJECT__WBS_NODES:
        getWbsNodes().clear();
        getWbsNodes().addAll((Collection<? extends WBSNode>)newValue);
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
      case WBSPackage.WBS_PROJECT__WBS_NODES:
        getWbsNodes().clear();
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
      case WBSPackage.WBS_PROJECT__WBS_NODES:
        return wbsNodes != null && !wbsNodes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //WBSProjectImpl
