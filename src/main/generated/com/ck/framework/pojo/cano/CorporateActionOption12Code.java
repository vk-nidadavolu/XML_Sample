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
 * <p>Java class for CorporateActionOption12Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CorporateActionOption12Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ABST"/&gt;
 *     &lt;enumeration value="BSPL"/&gt;
 *     &lt;enumeration value="BUYA"/&gt;
 *     &lt;enumeration value="CASE"/&gt;
 *     &lt;enumeration value="CASH"/&gt;
 *     &lt;enumeration value="CEXC"/&gt;
 *     &lt;enumeration value="CONN"/&gt;
 *     &lt;enumeration value="CONY"/&gt;
 *     &lt;enumeration value="CTEN"/&gt;
 *     &lt;enumeration value="EXER"/&gt;
 *     &lt;enumeration value="LAPS"/&gt;
 *     &lt;enumeration value="MKDW"/&gt;
 *     &lt;enumeration value="MKUP"/&gt;
 *     &lt;enumeration value="MPUT"/&gt;
 *     &lt;enumeration value="NOAC"/&gt;
 *     &lt;enumeration value="NOQU"/&gt;
 *     &lt;enumeration value="OFFR"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="OVER"/&gt;
 *     &lt;enumeration value="QINV"/&gt;
 *     &lt;enumeration value="SECU"/&gt;
 *     &lt;enumeration value="SLLE"/&gt;
 *     &lt;enumeration value="PRUN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CorporateActionOption12Code")
@XmlEnum
public enum CorporateActionOption12Code {

    ABST,
    BSPL,
    BUYA,
    CASE,
    CASH,
    CEXC,
    CONN,
    CONY,
    CTEN,
    EXER,
    LAPS,
    MKDW,
    MKUP,
    MPUT,
    NOAC,
    NOQU,
    OFFR,
    OTHR,
    OVER,
    QINV,
    SECU,
    SLLE,
    PRUN;

    public String value() {
        return name();
    }

    public static CorporateActionOption12Code fromValue(String v) {
        return valueOf(v);
    }

}