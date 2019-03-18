//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.02.26 a las 05:19:56 PM COT 
//


package iso.std.iso._20022.tech.xsd.sese_023_001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AmountAndDirection94 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AmountAndDirection94">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcrdIntrstInd" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}YesNoIndicator" minOccurs="0"/>
 *         &lt;element name="StmpDtyInd" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}YesNoIndicator" minOccurs="0"/>
 *         &lt;element name="BrkrgAmtInd" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}YesNoIndicator" minOccurs="0"/>
 *         &lt;element name="RsrchFeeInd" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}YesNoIndicator" minOccurs="0"/>
 *         &lt;element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}ActiveCurrencyAndAmount"/>
 *         &lt;element name="CdtDbtInd" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}CreditDebitCode"/>
 *         &lt;element name="OrgnlCcyAndOrdrdAmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         &lt;element name="FXDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}ForeignExchangeTerms23" minOccurs="0"/>
 *         &lt;element name="ValDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}DateAndDateTime2Choice" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountAndDirection94", propOrder = {
    "acrdIntrstInd",
    "stmpDtyInd",
    "brkrgAmtInd",
    "rsrchFeeInd",
    "amt",
    "cdtDbtInd",
    "orgnlCcyAndOrdrdAmt",
    "fxDtls",
    "valDt"
})
public class AmountAndDirection94 {

    @XmlElement(name = "AcrdIntrstInd")
    protected Boolean acrdIntrstInd;
    @XmlElement(name = "StmpDtyInd")
    protected Boolean stmpDtyInd;
    @XmlElement(name = "BrkrgAmtInd")
    protected Boolean brkrgAmtInd;
    @XmlElement(name = "RsrchFeeInd")
    protected Boolean rsrchFeeInd;
    @XmlElement(name = "Amt", required = true)
    protected ActiveCurrencyAndAmount amt;
    @XmlElement(name = "CdtDbtInd", required = true)
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "OrgnlCcyAndOrdrdAmt")
    protected ActiveOrHistoricCurrencyAndAmount orgnlCcyAndOrdrdAmt;
    @XmlElement(name = "FXDtls")
    protected ForeignExchangeTerms23 fxDtls;
    @XmlElement(name = "ValDt")
    protected DateAndDateTime2Choice valDt;

    /**
     * Obtiene el valor de la propiedad acrdIntrstInd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcrdIntrstInd() {
        return acrdIntrstInd;
    }

    /**
     * Define el valor de la propiedad acrdIntrstInd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcrdIntrstInd(Boolean value) {
        this.acrdIntrstInd = value;
    }

    /**
     * Obtiene el valor de la propiedad stmpDtyInd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStmpDtyInd() {
        return stmpDtyInd;
    }

    /**
     * Define el valor de la propiedad stmpDtyInd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStmpDtyInd(Boolean value) {
        this.stmpDtyInd = value;
    }

    /**
     * Obtiene el valor de la propiedad brkrgAmtInd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBrkrgAmtInd() {
        return brkrgAmtInd;
    }

    /**
     * Define el valor de la propiedad brkrgAmtInd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBrkrgAmtInd(Boolean value) {
        this.brkrgAmtInd = value;
    }

    /**
     * Obtiene el valor de la propiedad rsrchFeeInd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRsrchFeeInd() {
        return rsrchFeeInd;
    }

    /**
     * Define el valor de la propiedad rsrchFeeInd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRsrchFeeInd(Boolean value) {
        this.rsrchFeeInd = value;
    }

    /**
     * Obtiene el valor de la propiedad amt.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Define el valor de la propiedad amt.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setAmt(ActiveCurrencyAndAmount value) {
        this.amt = value;
    }

    /**
     * Obtiene el valor de la propiedad cdtDbtInd.
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
     * Define el valor de la propiedad cdtDbtInd.
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
     * Obtiene el valor de la propiedad orgnlCcyAndOrdrdAmt.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getOrgnlCcyAndOrdrdAmt() {
        return orgnlCcyAndOrdrdAmt;
    }

    /**
     * Define el valor de la propiedad orgnlCcyAndOrdrdAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setOrgnlCcyAndOrdrdAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.orgnlCcyAndOrdrdAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad fxDtls.
     * 
     * @return
     *     possible object is
     *     {@link ForeignExchangeTerms23 }
     *     
     */
    public ForeignExchangeTerms23 getFXDtls() {
        return fxDtls;
    }

    /**
     * Define el valor de la propiedad fxDtls.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignExchangeTerms23 }
     *     
     */
    public void setFXDtls(ForeignExchangeTerms23 value) {
        this.fxDtls = value;
    }

    /**
     * Obtiene el valor de la propiedad valDt.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getValDt() {
        return valDt;
    }

    /**
     * Define el valor de la propiedad valDt.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setValDt(DateAndDateTime2Choice value) {
        this.valDt = value;
    }

}
