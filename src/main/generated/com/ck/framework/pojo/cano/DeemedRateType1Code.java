//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.06.28 at 09:19:55 PM MDT 
//


package com.ck.framework.pojo.cano;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeemedRateType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DeemedRateType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DEDI"/&gt;
 *     &lt;enumeration value="DEFP"/&gt;
 *     &lt;enumeration value="DEIT"/&gt;
 *     &lt;enumeration value="DERY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DeemedRateType1Code")
@XmlEnum
public enum DeemedRateType1Code {

    DEDI,
    DEFP,
    DEIT,
    DERY;

    public String value() {
        return name();
    }

    public static DeemedRateType1Code fromValue(String v) {
        return valueOf(v);
    }

}
