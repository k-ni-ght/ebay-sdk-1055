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
 * This type defines the <b>BuyerTaxIdentifier</b> container that is returned in order management calls. This container consists of taxpayer identification information for the buyer and it is currently used by sellers selling on the Italy or Spain site to retrieve the taxpayer ID of buyers registered on the Italy or Spain sites.
 *
 *
 * <p>Java class for TaxIdentifierType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TaxIdentifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{urn:ebay:apis:eBLBaseComponents}ValueTypeCodeType" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attribute" type="{urn:ebay:apis:eBLBaseComponents}TaxIdentifierAttributeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;any/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxIdentifierType", propOrder = {
        "type",
        "id",
        "attribute",
        "any"
})
public class TaxIdentifierType
        implements Serializable {

  private final static long serialVersionUID = 12343L;
  @XmlElement(name = "Type")
  protected ValueTypeCodeType type;
  @XmlElement(name = "ID")
  protected String id;
  @XmlElement(name = "Attribute")
  protected List<TaxIdentifierAttributeType> attribute;
  @XmlAnyElement(lax = true)
  protected List<Object> any;

  /**
   * Gets the value of the type property.
   *
   * @return possible object is
   * {@link ValueTypeCodeType }
   */
  public ValueTypeCodeType getType() {
    return type;
  }

  /**
   * Sets the value of the type property.
   *
   * @param value allowed object is
   *              {@link ValueTypeCodeType }
   */
  public void setType(ValueTypeCodeType value) {
    this.type = value;
  }

  /**
   * Gets the value of the id property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getID() {
    return id;
  }

  /**
   * Sets the value of the id property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setID(String value) {
    this.id = value;
  }

  /**
   * @return array of
   * {@link TaxIdentifierAttributeType }
   */
  public TaxIdentifierAttributeType[] getAttribute() {
    if (this.attribute == null) {
      return new TaxIdentifierAttributeType[0];
    }
    return ((TaxIdentifierAttributeType[]) this.attribute.toArray(new TaxIdentifierAttributeType[this.attribute.size()]));
  }

  /**
   * @param values allowed objects are
   *               {@link TaxIdentifierAttributeType }
   */
  public void setAttribute(TaxIdentifierAttributeType[] values) {
    this._getAttribute().clear();
    int len = values.length;
    for (int i = 0; (i < len); i++) {
      this.attribute.add(values[i]);
    }
  }

  /**
   * @return one of
   * {@link TaxIdentifierAttributeType }
   */
  public TaxIdentifierAttributeType getAttribute(int idx) {
    if (this.attribute == null) {
      throw new IndexOutOfBoundsException();
    }
    return this.attribute.get(idx);
  }

  public int getAttributeLength() {
    if (this.attribute == null) {
      return 0;
    }
    return this.attribute.size();
  }

  protected List<TaxIdentifierAttributeType> _getAttribute() {
    if (attribute == null) {
      attribute = new ArrayList<TaxIdentifierAttributeType>();
    }
    return attribute;
  }

  /**
   * @param value allowed object is
   *              {@link TaxIdentifierAttributeType }
   */
  public TaxIdentifierAttributeType setAttribute(int idx, TaxIdentifierAttributeType value) {
    return this.attribute.set(idx, value);
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
