/**
 */
package com.lowcoupling.mdpm.lng.pbs.pBS;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.lowcoupling.mdpm.lng.pbs.pBS.PBSFactory
 * @model kind="package"
 * @generated
 */
public interface PBSPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "pBS";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.lowcoupling.com/mdpm/lng/pbs/PBS";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "pBS";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PBSPackage eINSTANCE = com.lowcoupling.mdpm.lng.pbs.pBS.impl.PBSPackageImpl.init();

  /**
   * The meta object id for the '{@link com.lowcoupling.mdpm.lng.pbs.pBS.impl.PBSImpl <em>PBS</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.lowcoupling.mdpm.lng.pbs.pBS.impl.PBSImpl
   * @see com.lowcoupling.mdpm.lng.pbs.pBS.impl.PBSPackageImpl#getPBS()
   * @generated
   */
  int PBS = 0;

  /**
   * The number of structural features of the '<em>PBS</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PBS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.lowcoupling.mdpm.lng.pbs.pBS.impl.ProductImpl <em>Product</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.lowcoupling.mdpm.lng.pbs.pBS.impl.ProductImpl
   * @see com.lowcoupling.mdpm.lng.pbs.pBS.impl.PBSPackageImpl#getProduct()
   * @generated
   */
  int PRODUCT = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT__DESCRIPTION = PBS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT__NAME = PBS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Parts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT__PARTS = PBS_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Product</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT_FEATURE_COUNT = PBS_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.lowcoupling.mdpm.lng.pbs.pBS.impl.PartImpl <em>Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.lowcoupling.mdpm.lng.pbs.pBS.impl.PartImpl
   * @see com.lowcoupling.mdpm.lng.pbs.pBS.impl.PBSPackageImpl#getPart()
   * @generated
   */
  int PART = 2;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART__DESCRIPTION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART__NAME = 1;

  /**
   * The feature id for the '<em><b>Parts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART__PARTS = 2;

  /**
   * The number of structural features of the '<em>Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link com.lowcoupling.mdpm.lng.pbs.pBS.PBS <em>PBS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PBS</em>'.
   * @see com.lowcoupling.mdpm.lng.pbs.pBS.PBS
   * @generated
   */
  EClass getPBS();

  /**
   * Returns the meta object for class '{@link com.lowcoupling.mdpm.lng.pbs.pBS.Product <em>Product</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Product</em>'.
   * @see com.lowcoupling.mdpm.lng.pbs.pBS.Product
   * @generated
   */
  EClass getProduct();

  /**
   * Returns the meta object for the attribute '{@link com.lowcoupling.mdpm.lng.pbs.pBS.Product#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see com.lowcoupling.mdpm.lng.pbs.pBS.Product#getDescription()
   * @see #getProduct()
   * @generated
   */
  EAttribute getProduct_Description();

  /**
   * Returns the meta object for the attribute '{@link com.lowcoupling.mdpm.lng.pbs.pBS.Product#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.lowcoupling.mdpm.lng.pbs.pBS.Product#getName()
   * @see #getProduct()
   * @generated
   */
  EAttribute getProduct_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.lowcoupling.mdpm.lng.pbs.pBS.Product#getParts <em>Parts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parts</em>'.
   * @see com.lowcoupling.mdpm.lng.pbs.pBS.Product#getParts()
   * @see #getProduct()
   * @generated
   */
  EReference getProduct_Parts();

  /**
   * Returns the meta object for class '{@link com.lowcoupling.mdpm.lng.pbs.pBS.Part <em>Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Part</em>'.
   * @see com.lowcoupling.mdpm.lng.pbs.pBS.Part
   * @generated
   */
  EClass getPart();

  /**
   * Returns the meta object for the attribute '{@link com.lowcoupling.mdpm.lng.pbs.pBS.Part#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see com.lowcoupling.mdpm.lng.pbs.pBS.Part#getDescription()
   * @see #getPart()
   * @generated
   */
  EAttribute getPart_Description();

  /**
   * Returns the meta object for the attribute '{@link com.lowcoupling.mdpm.lng.pbs.pBS.Part#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.lowcoupling.mdpm.lng.pbs.pBS.Part#getName()
   * @see #getPart()
   * @generated
   */
  EAttribute getPart_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.lowcoupling.mdpm.lng.pbs.pBS.Part#getParts <em>Parts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parts</em>'.
   * @see com.lowcoupling.mdpm.lng.pbs.pBS.Part#getParts()
   * @see #getPart()
   * @generated
   */
  EReference getPart_Parts();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PBSFactory getPBSFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.lowcoupling.mdpm.lng.pbs.pBS.impl.PBSImpl <em>PBS</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.lowcoupling.mdpm.lng.pbs.pBS.impl.PBSImpl
     * @see com.lowcoupling.mdpm.lng.pbs.pBS.impl.PBSPackageImpl#getPBS()
     * @generated
     */
    EClass PBS = eINSTANCE.getPBS();

    /**
     * The meta object literal for the '{@link com.lowcoupling.mdpm.lng.pbs.pBS.impl.ProductImpl <em>Product</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.lowcoupling.mdpm.lng.pbs.pBS.impl.ProductImpl
     * @see com.lowcoupling.mdpm.lng.pbs.pBS.impl.PBSPackageImpl#getProduct()
     * @generated
     */
    EClass PRODUCT = eINSTANCE.getProduct();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRODUCT__DESCRIPTION = eINSTANCE.getProduct_Description();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRODUCT__NAME = eINSTANCE.getProduct_Name();

    /**
     * The meta object literal for the '<em><b>Parts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRODUCT__PARTS = eINSTANCE.getProduct_Parts();

    /**
     * The meta object literal for the '{@link com.lowcoupling.mdpm.lng.pbs.pBS.impl.PartImpl <em>Part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.lowcoupling.mdpm.lng.pbs.pBS.impl.PartImpl
     * @see com.lowcoupling.mdpm.lng.pbs.pBS.impl.PBSPackageImpl#getPart()
     * @generated
     */
    EClass PART = eINSTANCE.getPart();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PART__DESCRIPTION = eINSTANCE.getPart_Description();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PART__NAME = eINSTANCE.getPart_Name();

    /**
     * The meta object literal for the '<em><b>Parts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PART__PARTS = eINSTANCE.getPart_Parts();

  }

} //PBSPackage
