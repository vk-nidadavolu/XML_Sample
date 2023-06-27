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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BalanceFormat14Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BalanceFormat14Choice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Bal" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}SignedQuantityFormat12"/&gt;
 *         &lt;element name="ElgblBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}SignedQuantityFormat13"/&gt;
 *         &lt;element name="NotElgblBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}SignedQuantityFormat13"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceFormat14Choice", propOrder = {
    "bal",
    "elgblBal",
    "notElgblBal"
})
public class BalanceFormat14Choice {

    @XmlElement(name = "Bal")
    protected SignedQuantityFormat12 bal;
    @XmlElement(name = "ElgblBal")
    protected SignedQuantityFormat13 elgblBal;
    @XmlElement(name = "NotElgblBal")
    protected SignedQuantityFormat13 notElgblBal;

    /**
     * Gets the value of the bal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat12 }
     *     
     */
    public SignedQuantityFormat12 getBal() {
        return bal;
    }

    /**
     * Sets the value of the bal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat12 }
     *     
     */
    public void setBal(SignedQuantityFormat12 value) {
        this.bal = value;
    }

    /**
     * Gets the value of the elgblBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat13 }
     *     
     */
    public SignedQuantityFormat13 getElgblBal() {
        return elgblBal;
    }

    /**
     * Sets the value of the elgblBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat13 }
     *     
     */
    public void setElgblBal(SignedQuantityFormat13 value) {
        this.elgblBal = value;
    }

    /**
     * Gets the value of the notElgblBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat13 }
     *     
     */
    public SignedQuantityFormat13 getNotElgblBal() {
        return notElgblBal;
    }

    /**
     * Sets the value of the notElgblBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat13 }
     *     
     */
    public void setNotElgblBal(SignedQuantityFormat13 value) {
        this.notElgblBal = value;
    }

}