//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.06.28 at 09:19:55 PM MDT 
//


package com.ck.framework.pojo.canoe;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionMandatoryVoluntary1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CorporateActionMandatoryVoluntary1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MAND"/&gt;
 *     &lt;enumeration value="CHOS"/&gt;
 *     &lt;enumeration value="VOLU"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CorporateActionMandatoryVoluntary1Code")
@XmlEnum
public enum CorporateActionMandatoryVoluntary1Code {

    MAND,
    CHOS,
    VOLU;

    public String value() {
        return name();
    }

    public static CorporateActionMandatoryVoluntary1Code fromValue(String v) {
        return valueOf(v);
    }

}
