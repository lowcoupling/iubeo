/**
 */
package com.lowcoupling.mdpm.lng.wbs.wBS.impl;

import com.lowcoupling.mdpm.lng.rml.rML.REQNode;

import com.lowcoupling.mdpm.lng.wbs.wBS.WBSNode;
import com.lowcoupling.mdpm.lng.wbs.wBS.WBSPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.lowcoupling.mdpm.lng.wbs.wBS.impl.WBSNodeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.lowcoupling.mdpm.lng.wbs.wBS.impl.WBSNodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.lowcoupling.mdpm.lng.wbs.wBS.impl.WBSNodeImpl#getWbsNodes <em>Wbs Nodes</em>}</li>
 *   <li>{@link com.lowcoupling.mdpm.lng.wbs.wBS.impl.WBSNodeImpl#getRequirements <em>Requirements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WBSNodeImpl extends MinimalEObjectImpl.Container implements WBSNode
{
  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

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
   * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequirements()
   * @generated
   * @ordered
   */
  protected EList<REQNode> requirements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WBSNodeImpl()
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
    return WBSPackage.Literals.WBS_NODE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WBSPackage.WBS_NODE__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WBSPackage.WBS_NODE__NAME, oldName, name));
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
      wbsNodes = new EObjectContainmentEList<WBSNode>(WBSNode.class, this, WBSPackage.WBS_NODE__WBS_NODES);
    }
    return wbsNodes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<REQNode> getRequirements()
  {
    if (requirements == null)
    {
      requirements = new EObjectResolvingEList<REQNode>(REQNode.class, this, WBSPackage.WBS_NODE__REQUIREMENTS);
    }
    return requirements;
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
      case WBSPackage.WBS_NODE__WBS_NODES:
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
      case WBSPackage.WBS_NODE__DESCRIPTION:
        return getDescription();
      case WBSPackage.WBS_NODE__NAME:
        return getName();
      case WBSPackage.WBS_NODE__WBS_NODES:
        return getWbsNodes();
      case WBSPackage.WBS_NODE__REQUIREMENTS:
        return getRequirements();
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
      case WBSPackage.WBS_NODE__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case WBSPackage.WBS_NODE__NAME:
        setName((String)newValue);
        return;
      case WBSPackage.WBS_NODE__WBS_NODES:
        getWbsNodes().clear();
        getWbsNodes().addAll((Collection<? extends WBSNode>)newValue);
        return;
      case WBSPackage.WBS_NODE__REQUIREMENTS:
        getRequirements().clear();
        getRequirements().addAll((Collection<? extends REQNode>)newValue);
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
      case WBSPackage.WBS_NODE__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case WBSPackage.WBS_NODE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case WBSPackage.WBS_NODE__WBS_NODES:
        getWbsNodes().clear();
        return;
      case WBSPackage.WBS_NODE__REQUIREMENTS:
        getRequirements().clear();
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
      case WBSPackage.WBS_NODE__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case WBSPackage.WBS_NODE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case WBSPackage.WBS_NODE__WBS_NODES:
        return wbsNodes != null && !wbsNodes.isEmpty();
      case WBSPackage.WBS_NODE__REQUIREMENTS:
        return requirements != null && !requirements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (description: ");
    result.append(description);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //WBSNodeImpl
