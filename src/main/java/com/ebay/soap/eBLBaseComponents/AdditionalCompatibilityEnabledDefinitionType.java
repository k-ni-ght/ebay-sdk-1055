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
 * Type defining the <b>AdditionalCompatibilityEnabled</b> field that is
 * returned under the <b>FeatureDefinitions</b> container of the
 * <b>GetCategoryFeatures</b> response (as long as
 * <code>AdditionalCompatibilityEnabled</code> is included as a <b>FeatureID</b> value in
 * the call request or no <b>FeatureID</b> values are passed into the call
 * request). This field is returned as an
 * empty element (a boolean value is not returned) if one or more eBay API-enabled sites
 * support the Boats Parts Compatibility feature.
 * <br/><br/>
 * To verify if a specific eBay site supports Boats Parts Compatibility (for most
 * categories), look for a <code>true</code> value in the
 * <b>SiteDefaults.AdditionalCompatibilityEnabled</b> field.
 * <br/><br/>
 * To verify if a specific category on a specific eBay site supports Boats Parts
 * Compatibility, pass in a <b>CategoryID</b> value in the request, and then
 * look for a <code>true</code> value in the <b>AdditionalCompatibilityEnabled</b> field
 * of the corresponding Category node (match up the <b>CategoryID</b> values
 * if more than one Category IDs were passed in the request).
 *
 *
 * <p>Java class for AdditionalCompatibilityEnabledDefinitionType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AdditionalCompatibilityEnabledDefinitionType">
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
@XmlType(name = "AdditionalCompatibilityEnabledDefinitionType", propOrder = {
        "any"
})
public class AdditionalCompatibilityEnabledDefinitionType
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
