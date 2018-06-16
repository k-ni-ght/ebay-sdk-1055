package com.ebay.soap.eBLBaseComponents;

import org.w3c.dom.Element;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * This type is deprecated.
 *
 *
 * <p>Java class for AttributeRecommendationsType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AttributeRecommendationsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AttributeSetArray" type="{urn:ebay:apis:eBLBaseComponents}AttributeSetArrayType" minOccurs="0"/>
 *         &lt;any/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributeRecommendationsType", propOrder = {
        "attributeSetArray",
        "any"
})
public class AttributeRecommendationsType
        implements Serializable {

  private final static long serialVersionUID = 12343L;
  @XmlElement(name = "AttributeSetArray")
  protected AttributeSetArrayType attributeSetArray;
  @XmlAnyElement(lax = true)
  protected List<Object> any;

  /**
   * Gets the value of the attributeSetArray property.
   *
   * @return possible object is
   * {@link AttributeSetArrayType }
   */
  public AttributeSetArrayType getAttributeSetArray() {
    return attributeSetArray;
  }

  /**
   * Sets the value of the attributeSetArray property.
   *
   * @param value allowed object is
   *              {@link AttributeSetArrayType }
   */
  public void setAttributeSetArray(AttributeSetArrayType value) {
    this.attributeSetArray = value;
  }

  /**
   * @return array of
   * {@link Object }
   * {@link Element }
   */
  public Object[] getAny() {
    if (this.any == null) {
      return new Object[0];
    }
    return ((Object[]) this.any.toArray(new Object[this.any.size()]));
  }

  /**
   * @param values allowed objects are
   *               {@link Object }
   *               {@link Element }
   */
  public void setAny(Object[] values) {
    this._getAny().clear();
    int len = values.length;
    for (int i = 0; (i < len); i++) {
      this.any.add(values[i]);
    }
  }

  /**
   * @return one of
   * {@link Object }
   * {@link Element }
   */
  public Object getAny(int idx) {
    if (this.any == null) {
      throw new IndexOutOfBoundsException();
    }
    return this.any.get(idx);
  }

  public int getAnyLength() {
    if (this.any == null) {
      return 0;
    }
    return this.any.size();
  }

  protected List<Object> _getAny() {
    if (any == null) {
      any = new ArrayList<Object>();
    }
    return any;
  }

  /**
   * @param value allowed object is
   *              {@link Object }
   *              {@link Element }
   */
  public Object setAny(int idx, Object value) {
    return this.any.set(idx, value);
  }

}