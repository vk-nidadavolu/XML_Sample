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
 * <p>Java class for GrossDividendRateType7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="GrossDividendRateType7Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CAPO"/&gt;
 *     &lt;enumeration value="CDFI"/&gt;
 *     &lt;enumeration value="FUPU"/&gt;
 *     &lt;enumeration value="FLFR"/&gt;
 *     &lt;enumeration value="INCO"/&gt;
 *     &lt;enumeration value="INTR"/&gt;
 *     &lt;enumeration value="LTCG"/&gt;
 *     &lt;enumeration value="PAPU"/&gt;
 *     &lt;enumeration value="REES"/&gt;
 *     &lt;enumeration value="STCG"/&gt;
 *     &lt;enumeration value="SOIC"/&gt;
 *     &lt;enumeration value="TXBL"/&gt;
 *     &lt;enumeration value="TXDF"/&gt;
 *     &lt;enumeration value="TXFR"/&gt;
 *     &lt;enumeration value="UNFR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GrossDividendRateType7Code")
@XmlEnum
public enum GrossDividendRateType7Code {

    CAPO,
    CDFI,
    FUPU,
    FLFR,
    INCO,
    INTR,
    LTCG,
    PAPU,
    REES,
    STCG,
    SOIC,
    TXBL,
    TXDF,
    TXFR,
    UNFR;

    public String value() {
        return name();
    }

    public static GrossDividendRateType7Code fromValue(String v) {
        return valueOf(v);
    }

}
