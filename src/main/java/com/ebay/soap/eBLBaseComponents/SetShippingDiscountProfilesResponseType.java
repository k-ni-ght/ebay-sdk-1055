package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;


/**
 * The response of a <b>SetShippingDiscountProfiles</b> call only includes the standard response fields for Trading API calls, such as the <b>Ack</b>  field (to indicate the success or failure of the call), the timestamp, and an <b>Errors</b> container (if there were any errors and/or warnings).
 *
 *
 * <p>Java class for SetShippingDiscountProfilesResponseType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SetShippingDiscountProfilesResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetShippingDiscountProfilesResponseType")
public class SetShippingDiscountProfilesResponseType
        extends AbstractResponseType
        implements Serializable {

  private final static long serialVersionUID = 12343L;

}
