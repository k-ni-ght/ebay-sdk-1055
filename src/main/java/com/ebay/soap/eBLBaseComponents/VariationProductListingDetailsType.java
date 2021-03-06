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
 * This type defines the <b>VariationProductListingDetails</b> container that is used to specify an EAN, an ISBN, or a UPC value to identify a specific product variation in a multi-variation listing. For multi-variation listings, the same product identifier type must be used for all product variations within the listing. For instance, if one product variation uses ISBNs, all product variations must use ISBN values.
 *
 *
 * <p>Java class for VariationProductListingDetailsType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="VariationProductListingDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ISBN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UPC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NameValueList" type="{urn:ebay:apis:eBLBaseComponents}NameValueListType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;any/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VariationProductListingDetailsType", propOrder = {
        "isbn",
        "upc",
        "ean",
        "nameValueList",
        "any"
})
public class VariationProductListingDetailsType
        implements Serializable {

  private final static long serialVersionUID = 12343L;
  @XmlElement(name = "ISBN")
  protected String isbn;
  @XmlElement(name = "UPC")
  protected String upc;
  @XmlElement(name = "EAN")
  protected String ean;
  @XmlElement(name = "NameValueList")
  protected List<NameValueListType> nameValueList;
  @XmlAnyElement(lax = true)
  protected List<Object> any;

  /**
   * Gets the value of the isbn property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getISBN() {
    return isbn;
  }

  /**
   * Sets the value of the isbn property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setISBN(String value) {
    this.isbn = value;
  }

  /**
   * Gets the value of the upc property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getUPC() {
    return upc;
  }

  /**
   * Sets the value of the upc property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setUPC(String value) {
    this.upc = value;
  }

  /**
   * Gets the value of the ean property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getEAN() {
    return ean;
  }

  /**
   * Sets the value of the ean property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setEAN(String value) {
    this.ean = value;
  }

  /**
   * @return array of
   * {@link NameValueListType }
   */
  public NameValueListType[] getNameValueList() {
    if (this.nameValueList == null) {
      return new NameValueListType[0];
    }
    return ((NameValueListType[]) this.nameValueList.toArray(new NameValueListType[this.nameValueList.size()]));
  }

  /**
   * @param values allowed objects are
   *               {@link NameValueListType }
   */
  public void setNameValueList(NameValueListType[] values) {
    this._getNameValueList().clear();
    int len = values.length;
    for (int i = 0; (i < len); i++) {
      this.nameValueList.add(values[i]);
    }
  }

  /**
   * @return one of
   * {@link NameValueListType }
   */
  public NameValueListType getNameValueList(int idx) {
    if (this.nameValueList == null) {
      throw new IndexOutOfBoundsException();
    }
    return this.nameValueList.get(idx);
  }

  public int getNameValueListLength() {
    if (this.nameValueList == null) {
      return 0;
    }
    return this.nameValueList.size();
  }

  protected List<NameValueListType> _getNameValueList() {
    if (nameValueList == null) {
      nameValueList = new ArrayList<NameValueListType>();
    }
    return nameValueList;
  }

  /**
   * @param value allowed object is
   *              {@link NameValueListType }
   */
  public NameValueListType setNameValueList(int idx, NameValueListType value) {
    return this.nameValueList.set(idx, value);
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
