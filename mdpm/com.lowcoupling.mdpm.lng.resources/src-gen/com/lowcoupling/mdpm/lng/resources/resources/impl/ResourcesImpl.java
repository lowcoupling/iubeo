/**
 */
package com.lowcoupling.mdpm.lng.resources.resources.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.lowcoupling.mdpm.lng.resources.resources.Resource;
import com.lowcoupling.mdpm.lng.resources.resources.ResourceGroup;
import com.lowcoupling.mdpm.lng.resources.resources.Resources;
import com.lowcoupling.mdpm.lng.resources.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resources</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.lowcoupling.mdpm.lng.resources.resources.impl.ResourcesImpl#getResourceGroups <em>Resource Groups</em>}</li>
 *   <li>{@link com.lowcoupling.mdpm.lng.resources.resources.impl.ResourcesImpl#getResources <em>Resources</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourcesImpl extends MinimalEObjectImpl.Container implements Resources
{
  /**
   * The cached value of the '{@link #getResourceGroups() <em>Resource Groups</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResourceGroups()
   * @generated
   * @ordered
   */
  protected EList<ResourceGroup> resourceGroups;

  /**
   * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResources()
   * @generated
   * @ordered
   */
  protected EList<Resource> resources;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ResourcesImpl()
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
    return ResourcesPackage.Literals.RESOURCES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ResourceGroup> getResourceGroups()
  {
    if (resourceGroups == null)
    {
      resourceGroups = new EObjectContainmentEList<ResourceGroup>(ResourceGroup.class, this, ResourcesPackage.RESOURCES__RESOURCE_GROUPS);
    }
    return resourceGroups;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Resource> getResources()
  {
    if (resources == null)
    {
      resources = new EObjectContainmentEList<Resource>(Resource.class, this, ResourcesPackage.RESOURCES__RESOURCES);
    }
    return resources;
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
      case ResourcesPackage.RESOURCES__RESOURCE_GROUPS:
        return ((InternalEList<?>)getResourceGroups()).basicRemove(otherEnd, msgs);
      case ResourcesPackage.RESOURCES__RESOURCES:
        return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
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
      case ResourcesPackage.RESOURCES__RESOURCE_GROUPS:
        return getResourceGroups();
      case ResourcesPackage.RESOURCES__RESOURCES:
        return getResources();
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
      case ResourcesPackage.RESOURCES__RESOURCE_GROUPS:
        getResourceGroups().clear();
        getResourceGroups().addAll((Collection<? extends ResourceGroup>)newValue);
        return;
      case ResourcesPackage.RESOURCES__RESOURCES:
        getResources().clear();
        getResources().addAll((Collection<? extends Resource>)newValue);
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
      case ResourcesPackage.RESOURCES__RESOURCE_GROUPS:
        getResourceGroups().clear();
        return;
      case ResourcesPackage.RESOURCES__RESOURCES:
        getResources().clear();
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
      case ResourcesPackage.RESOURCES__RESOURCE_GROUPS:
        return resourceGroups != null && !resourceGroups.isEmpty();
      case ResourcesPackage.RESOURCES__RESOURCES:
        return resources != null && !resources.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ResourcesImpl
