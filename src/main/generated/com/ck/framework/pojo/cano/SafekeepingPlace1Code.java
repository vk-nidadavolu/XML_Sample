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
 * <p>Java class for SafekeepingPlace1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SafekeepingPlace1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CUST"/&gt;
 *     &lt;enumeration value="ICSD"/&gt;
 *     &lt;enumeration value="NCSD"/&gt;
 *     &lt;enumeration value="SHHE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SafekeepingPlace1Code")
@XmlEnum
public enum SafekeepingPlace1Code {

    CUST,
    ICSD,
    NCSD,
    SHHE;

    public String value() {
        return name();
    }

    public static SafekeepingPlace1Code fromValue(String v) {
        return valueOf(v);
    }

}
