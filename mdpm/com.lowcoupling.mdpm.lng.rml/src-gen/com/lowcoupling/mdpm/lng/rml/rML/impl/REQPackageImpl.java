/**
 */
package com.lowcoupling.mdpm.lng.rml.rML.impl;

import com.lowcoupling.mdpm.lng.rml.rML.REQPackage;
import com.lowcoupling.mdpm.lng.rml.rML.REQRequirement;
import com.lowcoupling.mdpm.lng.rml.rML.RMLPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>REQ Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.lowcoupling.mdpm.lng.rml.rML.impl.REQPackageImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link com.lowcoupling.mdpm.lng.rml.rML.impl.REQPackageImpl#getRequirements <em>Requirements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class REQPackageImpl extends REQNodeImpl implements REQPackage
{
  /**
   * The cached value of the '{@link #getPackage() <em>Package</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackage()
   * @generated
   * @ordered
   */
  protected EList<REQPackage> package_;

  /**
   * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequirements()
   * @generated
   * @ordered
   */
  protected EList<REQRequirement> requirements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected REQPackageImpl()
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
    return RMLPackage.Literals.REQ_PACKAGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<REQPackage> getPackage()
  {
    if (package_ == null)
    {
      package_ = new EObjectContainmentEList<REQPackage>(REQPackage.class, this, RMLPackage.REQ_PACKAGE__PACKAGE);
    }
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<REQRequirement> getRequirements()
  {
    if (requirements == null)
    {
      requirements = new EObjectContainmentEList<REQRequirement>(REQRequirement.class, this, RMLPackage.REQ_PACKAGE__REQUIREMENTS);
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
      case RMLPackage.REQ_PACKAGE__PACKAGE:
        return ((InternalEList<?>)getPackage()).basicRemove(otherEnd, msgs);
      case RMLPackage.REQ_PACKAGE__REQUIREMENTS:
        return ((InternalEList<?>)getRequirements()).basicRemove(otherEnd, msgs);
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
      case RMLPackage.REQ_PACKAGE__PACKAGE:
        return getPackage();
      case RMLPackage.REQ_PACKAGE__REQUIREMENTS:
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
      case RMLPackage.REQ_PACKAGE__PACKAGE:
        getPackage().clear();
        getPackage().addAll((Collection<? extends REQPackage>)newValue);
        return;
      case RMLPackage.REQ_PACKAGE__REQUIREMENTS:
        getRequirements().clear();
        getRequirements().addAll((Collection<? extends REQRequirement>)newValue);
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
      case RMLPackage.REQ_PACKAGE__PACKAGE:
        getPackage().clear();
        return;
      case RMLPackage.REQ_PACKAGE__REQUIREMENTS:
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
      case RMLPackage.REQ_PACKAGE__PACKAGE:
        return package_ != null && !package_.isEmpty();
      case RMLPackage.REQ_PACKAGE__REQUIREMENTS:
        return requirements != null && !requirements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //REQPackageImpl
