/**
 */
package com.lowcoupling.mdpm.lng.resources.resources.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import com.lowcoupling.mdpm.lng.resources.resources.ResourceGroup;
import com.lowcoupling.mdpm.lng.resources.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.lowcoupling.mdpm.lng.resources.resources.impl.ResourceGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.lowcoupling.mdpm.lng.resources.resources.impl.ResourceGroupImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.lowcoupling.mdpm.lng.resources.resources.impl.ResourceGroupImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link com.lowcoupling.mdpm.lng.resources.resources.impl.ResourceGroupImpl#getCostLabel <em>Cost Label</em>}</li>
 *   <li>{@link com.lowcoupling.mdpm.lng.resources.resources.impl.ResourceGroupImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceGroupImpl extends MinimalEObjectImpl.Container implements ResourceGroup
{
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
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCost()
   * @generated
   * @ordered
   */
  protected static final int COST_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCost()
   * @generated
   * @ordered
   */
  protected int cost = COST_EDEFAULT;

  /**
   * The default value of the '{@link #getCostLabel() <em>Cost Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCostLabel()
   * @generated
   * @ordered
   */
  protected static final String COST_LABEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCostLabel() <em>Cost Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCostLabel()
   * @generated
   * @ordered
   */
  protected String costLabel = COST_LABEL_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ResourceGroupImpl()
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
    return ResourcesPackage.Literals.RESOURCE_GROUP;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESOURCE_GROUP__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESOURCE_GROUP__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getCost()
  {
    return cost;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCost(int newCost)
  {
    int oldCost = cost;
    cost = newCost;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESOURCE_GROUP__COST, oldCost, cost));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCostLabel()
  {
    return costLabel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCostLabel(String newCostLabel)
  {
    String oldCostLabel = costLabel;
    costLabel = newCostLabel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESOURCE_GROUP__COST_LABEL, oldCostLabel, costLabel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESOURCE_GROUP__TYPE, oldType, type));
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
      case ResourcesPackage.RESOURCE_GROUP__NAME:
        return getName();
      case ResourcesPackage.RESOURCE_GROUP__ID:
        return getId();
      case ResourcesPackage.RESOURCE_GROUP__COST:
        return getCost();
      case ResourcesPackage.RESOURCE_GROUP__COST_LABEL:
        return getCostLabel();
      case ResourcesPackage.RESOURCE_GROUP__TYPE:
        return getType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ResourcesPackage.RESOURCE_GROUP__NAME:
        setName((String)newValue);
        return;
      case ResourcesPackage.RESOURCE_GROUP__ID:
        setId((String)newValue);
        return;
      case ResourcesPackage.RESOURCE_GROUP__COST:
        setCost((Integer)newValue);
        return;
      case ResourcesPackage.RESOURCE_GROUP__COST_LABEL:
        setCostLabel((String)newValue);
        return;
      case ResourcesPackage.RESOURCE_GROUP__TYPE:
        setType((String)newValue);
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
      case ResourcesPackage.RESOURCE_GROUP__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ResourcesPackage.RESOURCE_GROUP__ID:
        setId(ID_EDEFAULT);
        return;
      case ResourcesPackage.RESOURCE_GROUP__COST:
        setCost(COST_EDEFAULT);
        return;
      case ResourcesPackage.RESOURCE_GROUP__COST_LABEL:
        setCostLabel(COST_LABEL_EDEFAULT);
        return;
      case ResourcesPackage.RESOURCE_GROUP__TYPE:
        setType(TYPE_EDEFAULT);
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
      case ResourcesPackage.RESOURCE_GROUP__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ResourcesPackage.RESOURCE_GROUP__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case ResourcesPackage.RESOURCE_GROUP__COST:
        return cost != COST_EDEFAULT;
      case ResourcesPackage.RESOURCE_GROUP__COST_LABEL:
        return COST_LABEL_EDEFAULT == null ? costLabel != null : !COST_LABEL_EDEFAULT.equals(costLabel);
      case ResourcesPackage.RESOURCE_GROUP__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
    result.append(" (name: ");
    result.append(name);
    result.append(", id: ");
    result.append(id);
    result.append(", cost: ");
    result.append(cost);
    result.append(", costLabel: ");
    result.append(costLabel);
    result.append(", type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //ResourceGroupImpl
