//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.06.21 at 04:07:04 PM IST 
//


package com.ck.framework.pojo.cano;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AmountPriceType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="AmountPriceType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACTU"/&gt;
 *     &lt;enumeration value="DISC"/&gt;
 *     &lt;enumeration value="PLOT"/&gt;
 *     &lt;enumeration value="PREM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AmountPriceType1Code")
@XmlEnum
public enum AmountPriceType1Code {

    ACTU,
    DISC,
    PLOT,
    PREM;

    public String value() {
        return name();
    }

    public static AmountPriceType1Code fromValue(String v) {
        return valueOf(v);
    }

}