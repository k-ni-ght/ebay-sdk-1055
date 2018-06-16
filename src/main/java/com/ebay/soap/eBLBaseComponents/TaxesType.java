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
 * Type defining the Taxes container, which contains detailed sales tax information for an
 * order line item. The Taxes container is only returned if the seller is using the Vertex-
 * based Premium Sales Tax Engine solution. The information in this container
 * supercedes/overrides the sales tax information in the ShippingDetails.SalesTax container.
 *
 *
 * <p>Java class for TaxesType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TaxesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalTaxAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="TaxDetails" type="{urn:ebay:apis:eBLBaseComponents}TaxDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;any/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxesType", propOrder = {
        "totalTaxAmount",
        "taxDetails",
        "any"
})
public class TaxesType
        implements Serializable {

  private final static long serialVersionUID = 12343L;
  @XmlElement(name = "TotalTaxAmount")
  protected AmountType totalTaxAmount;
  @XmlElement(name = "TaxDetails")
  protected List<TaxDetailsType> taxDetails;
  @XmlAnyElement(lax = true)
  protected List<Object> any;

  /**
   * Gets the value of the totalTaxAmount property.
   *
   * @return possible object is
   * {@link AmountType }
   */
  public AmountType getTotalTaxAmount() {
    return totalTaxAmount;
  }

  /**
   * Sets the value of the totalTaxAmount property.
   *
   * @param value allowed object is
   *              {@link AmountType }
   */
  public void setTotalTaxAmount(AmountType value) {
    this.totalTaxAmount = value;
  }

  /**
   * @return array of
   * {@link TaxDetailsType }
   */
  public TaxDetailsType[] getTaxDetails() {
    if (this.taxDetails == null) {
      return new TaxDetailsType[0];
    }
    return ((TaxDetailsType[]) this.taxDetails.toArray(new TaxDetailsType[this.taxDetails.size()]));
  }

  /**
   * @param values allowed objects are
   *               {@link TaxDetailsType }
   */
  public void setTaxDetails(TaxDetailsType[] values) {
    this._getTaxDetails().clear();
    int len = values.length;
    for (int i = 0; (i < len); i++) {
      this.taxDetails.add(values[i]);
    }
  }

  /**
   * @return one of
   * {@link TaxDetailsType }
   */
  public TaxDetailsType getTaxDetails(int idx) {
    if (this.taxDetails == null) {
      throw new IndexOutOfBoundsException();
    }
    return this.taxDetails.get(idx);
  }

  public int getTaxDetailsLength() {
    if (this.taxDetails == null) {
      return 0;
    }
    return this.taxDetails.size();
  }

  protected List<TaxDetailsType> _getTaxDetails() {
    if (taxDetails == null) {
      taxDetails = new ArrayList<TaxDetailsType>();
    }
    return taxDetails;
  }

  /**
   * @param value allowed object is
   *              {@link TaxDetailsType }
   */
  public TaxDetailsType setTaxDetails(int idx, TaxDetailsType value) {
    return this.taxDetails.set(idx, value);
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
