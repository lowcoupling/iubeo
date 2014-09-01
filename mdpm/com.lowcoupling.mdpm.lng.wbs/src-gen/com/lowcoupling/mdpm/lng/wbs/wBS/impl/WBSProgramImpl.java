/**
 */
package com.lowcoupling.mdpm.lng.wbs.wBS.impl;

import com.lowcoupling.mdpm.lng.wbs.wBS.WBSPackage;
import com.lowcoupling.mdpm.lng.wbs.wBS.WBSProgram;
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
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.lowcoupling.mdpm.lng.wbs.wBS.impl.WBSProgramImpl#getProjects <em>Projects</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WBSProgramImpl extends WBSImpl implements WBSProgram
{
  /**
   * The cached value of the '{@link #getProjects() <em>Projects</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProjects()
   * @generated
   * @ordered
   */
  protected EList<WBSProject> projects;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WBSProgramImpl()
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
    return WBSPackage.Literals.WBS_PROGRAM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<WBSProject> getProjects()
  {
    if (projects == null)
    {
      projects = new EObjectContainmentEList<WBSProject>(WBSProject.class, this, WBSPackage.WBS_PROGRAM__PROJECTS);
    }
    return projects;
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
      case WBSPackage.WBS_PROGRAM__PROJECTS:
        return ((InternalEList<?>)getProjects()).basicRemove(otherEnd, msgs);
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
      case WBSPackage.WBS_PROGRAM__PROJECTS:
        return getProjects();
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
      case WBSPackage.WBS_PROGRAM__PROJECTS:
        getProjects().clear();
        getProjects().addAll((Collection<? extends WBSProject>)newValue);
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
      case WBSPackage.WBS_PROGRAM__PROJECTS:
        getProjects().clear();
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
      case WBSPackage.WBS_PROGRAM__PROJECTS:
        return projects != null && !projects.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //WBSProgramImpl
