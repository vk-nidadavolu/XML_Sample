//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.06.28 at 09:19:55 PM MDT 
//


package com.ck.framework.pojo.cano;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RatioFormat21Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RatioFormat21Choice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="QtyToQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}QuantityToQuantityRatio2"/&gt;
 *         &lt;element name="AmtToAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}AmountToAmountRatio3"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RatioFormat21Choice", propOrder = {
    "qtyToQty",
    "amtToAmt"
})
public class RatioFormat21Choice {

    @XmlElement(name = "QtyToQty")
    protected QuantityToQuantityRatio2 qtyToQty;
    @XmlElement(name = "AmtToAmt")
    protected AmountToAmountRatio3 amtToAmt;

    /**
     * Gets the value of the qtyToQty property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityToQuantityRatio2 }
     *     
     */
    public QuantityToQuantityRatio2 getQtyToQty() {
        return qtyToQty;
    }

    /**
     * Sets the value of the qtyToQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityToQuantityRatio2 }
     *     
     */
    public void setQtyToQty(QuantityToQuantityRatio2 value) {
        this.qtyToQty = value;
    }

    /**
     * Gets the value of the amtToAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountToAmountRatio3 }
     *     
     */
    public AmountToAmountRatio3 getAmtToAmt() {
        return amtToAmt;
    }

    /**
     * Sets the value of the amtToAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountToAmountRatio3 }
     *     
     */
    public void setAmtToAmt(AmountToAmountRatio3 value) {
        this.amtToAmt = value;
    }

}
