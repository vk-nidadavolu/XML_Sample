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
 * <p>Java class for CorporateActionEventType31Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CorporateActionEventType31Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACTV"/&gt;
 *     &lt;enumeration value="ATTI"/&gt;
 *     &lt;enumeration value="BRUP"/&gt;
 *     &lt;enumeration value="DFLT"/&gt;
 *     &lt;enumeration value="BONU"/&gt;
 *     &lt;enumeration value="EXRI"/&gt;
 *     &lt;enumeration value="CAPD"/&gt;
 *     &lt;enumeration value="CAPG"/&gt;
 *     &lt;enumeration value="CAPI"/&gt;
 *     &lt;enumeration value="DRCA"/&gt;
 *     &lt;enumeration value="DVCA"/&gt;
 *     &lt;enumeration value="CHAN"/&gt;
 *     &lt;enumeration value="COOP"/&gt;
 *     &lt;enumeration value="CLSA"/&gt;
 *     &lt;enumeration value="CONS"/&gt;
 *     &lt;enumeration value="CONV"/&gt;
 *     &lt;enumeration value="CREV"/&gt;
 *     &lt;enumeration value="DECR"/&gt;
 *     &lt;enumeration value="DETI"/&gt;
 *     &lt;enumeration value="DSCL"/&gt;
 *     &lt;enumeration value="DVOP"/&gt;
 *     &lt;enumeration value="DRIP"/&gt;
 *     &lt;enumeration value="DRAW"/&gt;
 *     &lt;enumeration value="DTCH"/&gt;
 *     &lt;enumeration value="EXOF"/&gt;
 *     &lt;enumeration value="REDM"/&gt;
 *     &lt;enumeration value="MCAL"/&gt;
 *     &lt;enumeration value="INCR"/&gt;
 *     &lt;enumeration value="PPMT"/&gt;
 *     &lt;enumeration value="INTR"/&gt;
 *     &lt;enumeration value="RHDI"/&gt;
 *     &lt;enumeration value="LIQU"/&gt;
 *     &lt;enumeration value="EXTM"/&gt;
 *     &lt;enumeration value="MRGR"/&gt;
 *     &lt;enumeration value="NOOF"/&gt;
 *     &lt;enumeration value="CERT"/&gt;
 *     &lt;enumeration value="ODLT"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="PARI"/&gt;
 *     &lt;enumeration value="PCAL"/&gt;
 *     &lt;enumeration value="PRED"/&gt;
 *     &lt;enumeration value="PINK"/&gt;
 *     &lt;enumeration value="PLAC"/&gt;
 *     &lt;enumeration value="PDEF"/&gt;
 *     &lt;enumeration value="PRIO"/&gt;
 *     &lt;enumeration value="BPUT"/&gt;
 *     &lt;enumeration value="REDO"/&gt;
 *     &lt;enumeration value="REMK"/&gt;
 *     &lt;enumeration value="BIDS"/&gt;
 *     &lt;enumeration value="SPLR"/&gt;
 *     &lt;enumeration value="RHTS"/&gt;
 *     &lt;enumeration value="DVSC"/&gt;
 *     &lt;enumeration value="SHPR"/&gt;
 *     &lt;enumeration value="SMAL"/&gt;
 *     &lt;enumeration value="SOFF"/&gt;
 *     &lt;enumeration value="DVSE"/&gt;
 *     &lt;enumeration value="SPLF"/&gt;
 *     &lt;enumeration value="TREC"/&gt;
 *     &lt;enumeration value="TEND"/&gt;
 *     &lt;enumeration value="DLST"/&gt;
 *     &lt;enumeration value="SUSP"/&gt;
 *     &lt;enumeration value="EXWA"/&gt;
 *     &lt;enumeration value="WTRC"/&gt;
 *     &lt;enumeration value="WRTH"/&gt;
 *     &lt;enumeration value="ACCU"/&gt;
 *     &lt;enumeration value="INFO"/&gt;
 *     &lt;enumeration value="TNDP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CorporateActionEventType31Code")
@XmlEnum
public enum CorporateActionEventType31Code {

    ACTV,
    ATTI,
    BRUP,
    DFLT,
    BONU,
    EXRI,
    CAPD,
    CAPG,
    CAPI,
    DRCA,
    DVCA,
    CHAN,
    COOP,
    CLSA,
    CONS,
    CONV,
    CREV,
    DECR,
    DETI,
    DSCL,
    DVOP,
    DRIP,
    DRAW,
    DTCH,
    EXOF,
    REDM,
    MCAL,
    INCR,
    PPMT,
    INTR,
    RHDI,
    LIQU,
    EXTM,
    MRGR,
    NOOF,
    CERT,
    ODLT,
    OTHR,
    PARI,
    PCAL,
    PRED,
    PINK,
    PLAC,
    PDEF,
    PRIO,
    BPUT,
    REDO,
    REMK,
    BIDS,
    SPLR,
    RHTS,
    DVSC,
    SHPR,
    SMAL,
    SOFF,
    DVSE,
    SPLF,
    TREC,
    TEND,
    DLST,
    SUSP,
    EXWA,
    WTRC,
    WRTH,
    ACCU,
    INFO,
    TNDP;

    public String value() {
        return name();
    }

    public static CorporateActionEventType31Code fromValue(String v) {
        return valueOf(v);
    }

}
