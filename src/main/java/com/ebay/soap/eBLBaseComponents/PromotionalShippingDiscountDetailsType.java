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
 * Details of a promotional shipping discount.
 *
 *
 * <p>Java class for PromotionalShippingDiscountDetailsType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PromotionalShippingDiscountDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DiscountName" type="{urn:ebay:apis:eBLBaseComponents}DiscountNameCodeType" minOccurs="0"/>
 *         &lt;element name="ShippingCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="OrderAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ItemCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;any/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionalShippingDiscountDetailsType", propOrder = {
        "discountName",
        "shippingCost",
        "orderAmount",
        "itemCount",
        "any"
})
public class PromotionalShippingDiscountDetailsType
        implements Serializable {

  private final static long serialVersionUID = 12343L;
  @XmlElement(name = "DiscountName")
  protected DiscountNameCodeType discountName;
  @XmlElement(name = "ShippingCost")
  protected AmountType shippingCost;
  @XmlElement(name = "OrderAmount")
  protected AmountType orderAmount;
  @XmlElement(name = "ItemCount")
  protected Integer itemCount;
  @XmlAnyElement(lax = true)
  protected List<Object> any;

  /**
   * Gets the value of the discountName property.
   *
   * @return possible object is
   * {@link DiscountNameCodeType }
   */
  public DiscountNameCodeType getDiscountName() {
    return discountName;
  }

  /**
   * Sets the value of the discountName property.
   *
   * @param value allowed object is
   *              {@link DiscountNameCodeType }
   */
  public void setDiscountName(DiscountNameCodeType value) {
    this.discountName = value;
  }

  /**
   * Gets the value of the shippingCost property.
   *
   * @return possible object is
   * {@link AmountType }
   */
  public AmountType getShippingCost() {
    return shippingCost;
  }

  /**
   * Sets the value of the shippingCost property.
   *
   * @param value allowed object is
   *              {@link AmountType }
   */
  public void setShippingCost(AmountType value) {
    this.shippingCost = value;
  }

  /**
   * Gets the value of the orderAmount property.
   *
   * @return possible object is
   * {@link AmountType }
   */
  public AmountType getOrderAmount() {
    return orderAmount;
  }

  /**
   * Sets the value of the orderAmount property.
   *
   * @param value allowed object is
   *              {@link AmountType }
   */
  public void setOrderAmount(AmountType value) {
    this.orderAmount = value;
  }

  /**
   * Gets the value of the itemCount property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getItemCount() {
    return itemCount;
  }

  /**
   * Sets the value of the itemCount property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setItemCount(Integer value) {
    this.itemCount = value;
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
