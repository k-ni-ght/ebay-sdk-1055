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
 * Store theme.
 *
 *
 * <p>Java class for StoreThemeType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="StoreThemeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ThemeID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ColorScheme" type="{urn:ebay:apis:eBLBaseComponents}StoreColorSchemeType" minOccurs="0"/>
 *         &lt;any/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoreThemeType", propOrder = {
        "themeID",
        "name",
        "colorScheme",
        "any"
})
public class StoreThemeType
        implements Serializable {

  private final static long serialVersionUID = 12343L;
  @XmlElement(name = "ThemeID")
  protected Integer themeID;
  @XmlElement(name = "Name")
  protected String name;
  @XmlElement(name = "ColorScheme")
  protected StoreColorSchemeType colorScheme;
  @XmlAnyElement(lax = true)
  protected List<Object> any;

  /**
   * Gets the value of the themeID property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getThemeID() {
    return themeID;
  }

  /**
   * Sets the value of the themeID property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setThemeID(Integer value) {
    this.themeID = value;
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

  /**
   * Gets the value of the colorScheme property.
   *
   * @return possible object is
   * {@link StoreColorSchemeType }
   */
  public StoreColorSchemeType getColorScheme() {
    return colorScheme;
  }

  /**
   * Sets the value of the colorScheme property.
   *
   * @param value allowed object is
   *              {@link StoreColorSchemeType }
   */
  public void setColorScheme(StoreColorSchemeType value) {
    this.colorScheme = value;
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