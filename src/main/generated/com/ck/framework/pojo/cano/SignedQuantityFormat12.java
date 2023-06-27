//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.06.21 at 04:07:04 PM IST 
//


package com.ck.framework.pojo.cano;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SignedQuantityFormat12 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignedQuantityFormat12"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ShrtLngPos" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}ShortLong1Code"/&gt;
 *         &lt;element name="QtyChc" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}Quantity53Choice"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignedQuantityFormat12", propOrder = {
    "shrtLngPos",
    "qtyChc"
})
public class SignedQuantityFormat12 {

    @XmlElement(name = "ShrtLngPos", required = true)
    @XmlSchemaType(name = "string")
    protected ShortLong1Code shrtLngPos;
    @XmlElement(name = "QtyChc", required = true)
    protected Quantity53Choice qtyChc;

    /**
     * Gets the value of the shrtLngPos property.
     * 
     * @return
     *     possible object is
     *     {@link ShortLong1Code }
     *     
     */
    public ShortLong1Code getShrtLngPos() {
        return shrtLngPos;
    }

    /**
     * Sets the value of the shrtLngPos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShortLong1Code }
     *     
     */
    public void setShrtLngPos(ShortLong1Code value) {
        this.shrtLngPos = value;
    }

    /**
     * Gets the value of the qtyChc property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity53Choice }
     *     
     */
    public Quantity53Choice getQtyChc() {
        return qtyChc;
    }

    /**
     * Sets the value of the qtyChc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity53Choice }
     *     
     */
    public void setQtyChc(Quantity53Choice value) {
        this.qtyChc = value;
    }

}