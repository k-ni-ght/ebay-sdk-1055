package com.ebay.soap.eBLBaseComponents;

import org.w3c.dom.Element;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * Indicates which address option the site supports for
 * Classified Ad format listings.
 * Added for EbayMotors Pro users.
 *
 *
 * <p>Java class for eBayMotorsProStreetCountDefinitionType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="eBayMotorsProStreetCountDefinitionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;any/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eBayMotorsProStreetCountDefinitionType", propOrder = {
        "any"
})
public class EBayMotorsProStreetCountDefinitionType
        implements Serializable {

  private final static long serialVersionUID = 12343L;
  @XmlAnyElement(lax = true)
  protected List<Object> any;

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
