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
 * <p>Java class for FractionDispositionType11Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="FractionDispositionType11Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BUYU"/&gt;
 *     &lt;enumeration value="CINL"/&gt;
 *     &lt;enumeration value="DIST"/&gt;
 *     &lt;enumeration value="RDDN"/&gt;
 *     &lt;enumeration value="STAN"/&gt;
 *     &lt;enumeration value="RDUP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FractionDispositionType11Code")
@XmlEnum
public enum FractionDispositionType11Code {

    BUYU,
    CINL,
    DIST,
    RDDN,
    STAN,
    RDUP;

    public String value() {
        return name();
    }

    public static FractionDispositionType11Code fromValue(String v) {
        return valueOf(v);
    }

}