package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import java.io.Serializable;


/**
 * This type is used to display the value of the <b>type</b> attribute of the <b>AddressAttribute</b> field.
 *
 *
 * <p>Java class for AddressAttributeType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AddressAttributeType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="type" type="{urn:ebay:apis:eBLBaseComponents}AddressAttributeCodeType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressAttributeType", propOrder = {
        "value"
})
public class AddressAttributeType
        implements Serializable {

  private final static long serialVersionUID = 12343L;
  @XmlValue
  protected String value;
  @XmlAttribute
  protected AddressAttributeCodeType type;

  /**
   * Gets the value of the value property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getValue() {
    return value;
  }

  /**
   * Sets the value of the value property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * Gets the value of the type property.
   *
   * @return possible object is
   * {@link AddressAttributeCodeType }
   */
  public AddressAttributeCodeType getType() {
    return type;
  }

  /**
   * Sets the value of the type property.
   *
   * @param value allowed object is
   *              {@link AddressAttributeCodeType }
   */
  public void setType(AddressAttributeCodeType value) {
    this.type = value;
  }

}
