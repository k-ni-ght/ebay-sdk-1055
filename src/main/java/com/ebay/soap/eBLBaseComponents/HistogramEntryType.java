package com.ebay.soap.eBLBaseComponents;

import org.w3c.dom.Element;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * This type is deprecated.
 *
 *
 * <p>Java class for HistogramEntryType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="HistogramEntryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;any/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HistogramEntryType", propOrder = {
        "count",
        "any"
})
public class HistogramEntryType
        implements Serializable {

  private final static long serialVersionUID = 12343L;
  @XmlElement(name = "Count")
  protected Integer count;
  @XmlAnyElement(lax = true)
  protected List<Object> any;
  @XmlAttribute
  protected String id;
  @XmlAttribute
  protected String name;

  /**
   * Gets the value of the count property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getCount() {
    return count;
  }

  /**
   * Sets the value of the count property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setCount(Integer value) {
    this.count = value;
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

  /**
   * Gets the value of the id property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getId() {
    return id;
  }

  /**
   * Sets the value of the id property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setId(String value) {
    this.id = value;
  }

  /**
   * Gets the value of the name property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the value of the name property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setName(String value) {
    this.name = value;
  }

}