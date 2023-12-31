//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.06.28 at 09:19:55 PM MDT 
//


package com.ck.framework.pojo.cano;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashOption87 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CashOption87"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CdtDbtInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}CreditDebitCode"/&gt;
 *         &lt;element name="CtrctlPmtInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}Payment1Code" minOccurs="0"/&gt;
 *         &lt;element name="IssrOfferrTaxbltyInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}IssuerOfferorTaxabilityIndicator1Choice" minOccurs="0"/&gt;
 *         &lt;element name="IncmTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}GenericIdentification47" minOccurs="0"/&gt;
 *         &lt;element name="OthrIncmTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}GenericIdentification47" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="XmptnTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}GenericIdentification47" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CtryOfIncmSrc" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}CountryCode" minOccurs="0"/&gt;
 *         &lt;element name="Acct" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}Account9Choice" minOccurs="0"/&gt;
 *         &lt;element name="CshPties" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}CashParties37" minOccurs="0"/&gt;
 *         &lt;element name="AmtDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}CorporateActionAmounts57"/&gt;
 *         &lt;element name="DtDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}CorporateActionDate87"/&gt;
 *         &lt;element name="FXDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}ForeignExchangeTerms27" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TaxVchrDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}TaxVoucher5" minOccurs="0"/&gt;
 *         &lt;element name="RateAndAmtDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}Rate37" minOccurs="0"/&gt;
 *         &lt;element name="PricDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}PriceDetails33" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashOption87", propOrder = {
    "cdtDbtInd",
    "ctrctlPmtInd",
    "issrOfferrTaxbltyInd",
    "incmTp",
    "othrIncmTp",
    "xmptnTp",
    "ctryOfIncmSrc",
    "acct",
    "cshPties",
    "amtDtls",
    "dtDtls",
    "fxDtls",
    "taxVchrDtls",
    "rateAndAmtDtls",
    "pricDtls"
})
public class CashOption87 {

    @XmlElement(name = "CdtDbtInd", required = true)
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "CtrctlPmtInd")
    @XmlSchemaType(name = "string")
    protected Payment1Code ctrctlPmtInd;
    @XmlElement(name = "IssrOfferrTaxbltyInd")
    protected IssuerOfferorTaxabilityIndicator1Choice issrOfferrTaxbltyInd;
    @XmlElement(name = "IncmTp")
    protected GenericIdentification47 incmTp;
    @XmlElement(name = "OthrIncmTp")
    protected List<GenericIdentification47> othrIncmTp;
    @XmlElement(name = "XmptnTp")
    protected List<GenericIdentification47> xmptnTp;
    @XmlElement(name = "CtryOfIncmSrc")
    protected String ctryOfIncmSrc;
    @XmlElement(name = "Acct")
    protected Account9Choice acct;
    @XmlElement(name = "CshPties")
    protected CashParties37 cshPties;
    @XmlElement(name = "AmtDtls", required = true)
    protected CorporateActionAmounts57 amtDtls;
    @XmlElement(name = "DtDtls", required = true)
    protected CorporateActionDate87 dtDtls;
    @XmlElement(name = "FXDtls")
    protected List<ForeignExchangeTerms27> fxDtls;
    @XmlElement(name = "TaxVchrDtls")
    protected TaxVoucher5 taxVchrDtls;
    @XmlElement(name = "RateAndAmtDtls")
    protected Rate37 rateAndAmtDtls;
    @XmlElement(name = "PricDtls")
    protected PriceDetails33 pricDtls;

    /**
     * Gets the value of the cdtDbtInd property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebitCode }
     *     
     */
    public CreditDebitCode getCdtDbtInd() {
        return cdtDbtInd;
    }

    /**
     * Sets the value of the cdtDbtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebitCode }
     *     
     */
    public void setCdtDbtInd(CreditDebitCode value) {
        this.cdtDbtInd = value;
    }

    /**
     * Gets the value of the ctrctlPmtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Payment1Code }
     *     
     */
    public Payment1Code getCtrctlPmtInd() {
        return ctrctlPmtInd;
    }

    /**
     * Sets the value of the ctrctlPmtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Payment1Code }
     *     
     */
    public void setCtrctlPmtInd(Payment1Code value) {
        this.ctrctlPmtInd = value;
    }

    /**
     * Gets the value of the issrOfferrTaxbltyInd property.
     * 
     * @return
     *     possible object is
     *     {@link IssuerOfferorTaxabilityIndicator1Choice }
     *     
     */
    public IssuerOfferorTaxabilityIndicator1Choice getIssrOfferrTaxbltyInd() {
        return issrOfferrTaxbltyInd;
    }

    /**
     * Sets the value of the issrOfferrTaxbltyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuerOfferorTaxabilityIndicator1Choice }
     *     
     */
    public void setIssrOfferrTaxbltyInd(IssuerOfferorTaxabilityIndicator1Choice value) {
        this.issrOfferrTaxbltyInd = value;
    }

    /**
     * Gets the value of the incmTp property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification47 }
     *     
     */
    public GenericIdentification47 getIncmTp() {
        return incmTp;
    }

    /**
     * Sets the value of the incmTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification47 }
     *     
     */
    public void setIncmTp(GenericIdentification47 value) {
        this.incmTp = value;
    }

    /**
     * Gets the value of the othrIncmTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the othrIncmTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrIncmTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericIdentification47 }
     * 
     * 
     */
    public List<GenericIdentification47> getOthrIncmTp() {
        if (othrIncmTp == null) {
            othrIncmTp = new ArrayList<GenericIdentification47>();
        }
        return this.othrIncmTp;
    }

    /**
     * Gets the value of the xmptnTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the xmptnTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXmptnTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericIdentification47 }
     * 
     * 
     */
    public List<GenericIdentification47> getXmptnTp() {
        if (xmptnTp == null) {
            xmptnTp = new ArrayList<GenericIdentification47>();
        }
        return this.xmptnTp;
    }

    /**
     * Gets the value of the ctryOfIncmSrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtryOfIncmSrc() {
        return ctryOfIncmSrc;
    }

    /**
     * Sets the value of the ctryOfIncmSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtryOfIncmSrc(String value) {
        this.ctryOfIncmSrc = value;
    }

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link Account9Choice }
     *     
     */
    public Account9Choice getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account9Choice }
     *     
     */
    public void setAcct(Account9Choice value) {
        this.acct = value;
    }

    /**
     * Gets the value of the cshPties property.
     * 
     * @return
     *     possible object is
     *     {@link CashParties37 }
     *     
     */
    public CashParties37 getCshPties() {
        return cshPties;
    }

    /**
     * Sets the value of the cshPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashParties37 }
     *     
     */
    public void setCshPties(CashParties37 value) {
        this.cshPties = value;
    }

    /**
     * Gets the value of the amtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionAmounts57 }
     *     
     */
    public CorporateActionAmounts57 getAmtDtls() {
        return amtDtls;
    }

    /**
     * Sets the value of the amtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionAmounts57 }
     *     
     */
    public void setAmtDtls(CorporateActionAmounts57 value) {
        this.amtDtls = value;
    }

    /**
     * Gets the value of the dtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionDate87 }
     *     
     */
    public CorporateActionDate87 getDtDtls() {
        return dtDtls;
    }

    /**
     * Sets the value of the dtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionDate87 }
     *     
     */
    public void setDtDtls(CorporateActionDate87 value) {
        this.dtDtls = value;
    }

    /**
     * Gets the value of the fxDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the fxDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFXDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ForeignExchangeTerms27 }
     * 
     * 
     */
    public List<ForeignExchangeTerms27> getFXDtls() {
        if (fxDtls == null) {
            fxDtls = new ArrayList<ForeignExchangeTerms27>();
        }
        return this.fxDtls;
    }

    /**
     * Gets the value of the taxVchrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TaxVoucher5 }
     *     
     */
    public TaxVoucher5 getTaxVchrDtls() {
        return taxVchrDtls;
    }

    /**
     * Sets the value of the taxVchrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxVoucher5 }
     *     
     */
    public void setTaxVchrDtls(TaxVoucher5 value) {
        this.taxVchrDtls = value;
    }

    /**
     * Gets the value of the rateAndAmtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Rate37 }
     *     
     */
    public Rate37 getRateAndAmtDtls() {
        return rateAndAmtDtls;
    }

    /**
     * Sets the value of the rateAndAmtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rate37 }
     *     
     */
    public void setRateAndAmtDtls(Rate37 value) {
        this.rateAndAmtDtls = value;
    }

    /**
     * Gets the value of the pricDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PriceDetails33 }
     *     
     */
    public PriceDetails33 getPricDtls() {
        return pricDtls;
    }

    /**
     * Sets the value of the pricDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceDetails33 }
     *     
     */
    public void setPricDtls(PriceDetails33 value) {
        this.pricDtls = value;
    }

}
