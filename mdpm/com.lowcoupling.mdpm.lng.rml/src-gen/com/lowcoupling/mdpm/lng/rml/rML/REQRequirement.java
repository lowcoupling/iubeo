/**
 */
package com.lowcoupling.mdpm.lng.rml.rML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>REQ Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.lowcoupling.mdpm.lng.rml.rML.REQRequirement#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.lowcoupling.mdpm.lng.rml.rML.RMLPackage#getREQRequirement()
 * @model
 * @generated
 */
public interface REQRequirement extends REQNode
{
  /**
   * Returns the value of the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' attribute.
   * @see #setText(String)
   * @see com.lowcoupling.mdpm.lng.rml.rML.RMLPackage#getREQRequirement_Text()
   * @model
   * @generated
   */
  String getText();

  /**
   * Sets the value of the '{@link com.lowcoupling.mdpm.lng.rml.rML.REQRequirement#getText <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' attribute.
   * @see #getText()
   * @generated
   */
  void setText(String value);

} // REQRequirement
