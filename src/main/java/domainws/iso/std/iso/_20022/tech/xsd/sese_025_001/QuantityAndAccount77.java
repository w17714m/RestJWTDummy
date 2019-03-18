//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.02.26 a las 05:19:56 PM COT 
//


package iso.std.iso._20022.tech.xsd.sese_025_001;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para QuantityAndAccount77 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="QuantityAndAccount77">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SttldQty" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}Quantity6Choice"/>
 *         &lt;element name="PrevslySttldQty" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}FinancialInstrumentQuantity1Choice" minOccurs="0"/>
 *         &lt;element name="RmngToBeSttldQty" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}FinancialInstrumentQuantity1Choice" minOccurs="0"/>
 *         &lt;element name="PrevslySttldAmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}AmountAndDirection52" minOccurs="0"/>
 *         &lt;element name="RmngToBeSttldAmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}AmountAndDirection52" minOccurs="0"/>
 *         &lt;element name="DnmtnChc" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}Max210Text" minOccurs="0"/>
 *         &lt;element name="AcctOwnr" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}PartyIdentification144" minOccurs="0"/>
 *         &lt;element name="SfkpgAcct" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}SecuritiesAccount19"/>
 *         &lt;element name="CshAcct" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}CashAccountIdentification5Choice" minOccurs="0"/>
 *         &lt;element name="QtyBrkdwn" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}QuantityBreakdown47" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SfkpgPlc" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}SafeKeepingPlace3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantityAndAccount77", propOrder = {
    "sttldQty",
    "prevslySttldQty",
    "rmngToBeSttldQty",
    "prevslySttldAmt",
    "rmngToBeSttldAmt",
    "dnmtnChc",
    "acctOwnr",
    "sfkpgAcct",
    "cshAcct",
    "qtyBrkdwn",
    "sfkpgPlc"
})
public class QuantityAndAccount77 {

    @XmlElement(name = "SttldQty", required = true)
    protected Quantity6Choice sttldQty;
    @XmlElement(name = "PrevslySttldQty")
    protected FinancialInstrumentQuantity1Choice prevslySttldQty;
    @XmlElement(name = "RmngToBeSttldQty")
    protected FinancialInstrumentQuantity1Choice rmngToBeSttldQty;
    @XmlElement(name = "PrevslySttldAmt")
    protected AmountAndDirection52 prevslySttldAmt;
    @XmlElement(name = "RmngToBeSttldAmt")
    protected AmountAndDirection52 rmngToBeSttldAmt;
    @XmlElement(name = "DnmtnChc")
    protected String dnmtnChc;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification144 acctOwnr;
    @XmlElement(name = "SfkpgAcct", required = true)
    protected SecuritiesAccount19 sfkpgAcct;
    @XmlElement(name = "CshAcct")
    protected CashAccountIdentification5Choice cshAcct;
    @XmlElement(name = "QtyBrkdwn")
    protected List<QuantityBreakdown47> qtyBrkdwn;
    @XmlElement(name = "SfkpgPlc")
    protected SafeKeepingPlace3 sfkpgPlc;

    /**
     * Obtiene el valor de la propiedad sttldQty.
     * 
     * @return
     *     possible object is
     *     {@link Quantity6Choice }
     *     
     */
    public Quantity6Choice getSttldQty() {
        return sttldQty;
    }

    /**
     * Define el valor de la propiedad sttldQty.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity6Choice }
     *     
     */
    public void setSttldQty(Quantity6Choice value) {
        this.sttldQty = value;
    }

    /**
     * Obtiene el valor de la propiedad prevslySttldQty.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getPrevslySttldQty() {
        return prevslySttldQty;
    }

    /**
     * Define el valor de la propiedad prevslySttldQty.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public void setPrevslySttldQty(FinancialInstrumentQuantity1Choice value) {
        this.prevslySttldQty = value;
    }

    /**
     * Obtiene el valor de la propiedad rmngToBeSttldQty.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getRmngToBeSttldQty() {
        return rmngToBeSttldQty;
    }

    /**
     * Define el valor de la propiedad rmngToBeSttldQty.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public void setRmngToBeSttldQty(FinancialInstrumentQuantity1Choice value) {
        this.rmngToBeSttldQty = value;
    }

    /**
     * Obtiene el valor de la propiedad prevslySttldAmt.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection52 }
     *     
     */
    public AmountAndDirection52 getPrevslySttldAmt() {
        return prevslySttldAmt;
    }

    /**
     * Define el valor de la propiedad prevslySttldAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection52 }
     *     
     */
    public void setPrevslySttldAmt(AmountAndDirection52 value) {
        this.prevslySttldAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad rmngToBeSttldAmt.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection52 }
     *     
     */
    public AmountAndDirection52 getRmngToBeSttldAmt() {
        return rmngToBeSttldAmt;
    }

    /**
     * Define el valor de la propiedad rmngToBeSttldAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection52 }
     *     
     */
    public void setRmngToBeSttldAmt(AmountAndDirection52 value) {
        this.rmngToBeSttldAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad dnmtnChc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDnmtnChc() {
        return dnmtnChc;
    }

    /**
     * Define el valor de la propiedad dnmtnChc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDnmtnChc(String value) {
        this.dnmtnChc = value;
    }

    /**
     * Obtiene el valor de la propiedad acctOwnr.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification144 }
     *     
     */
    public PartyIdentification144 getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Define el valor de la propiedad acctOwnr.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification144 }
     *     
     */
    public void setAcctOwnr(PartyIdentification144 value) {
        this.acctOwnr = value;
    }

    /**
     * Obtiene el valor de la propiedad sfkpgAcct.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesAccount19 getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Define el valor de la propiedad sfkpgAcct.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public void setSfkpgAcct(SecuritiesAccount19 value) {
        this.sfkpgAcct = value;
    }

    /**
     * Obtiene el valor de la propiedad cshAcct.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountIdentification5Choice }
     *     
     */
    public CashAccountIdentification5Choice getCshAcct() {
        return cshAcct;
    }

    /**
     * Define el valor de la propiedad cshAcct.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountIdentification5Choice }
     *     
     */
    public void setCshAcct(CashAccountIdentification5Choice value) {
        this.cshAcct = value;
    }

    /**
     * Gets the value of the qtyBrkdwn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qtyBrkdwn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQtyBrkdwn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuantityBreakdown47 }
     * 
     * 
     */
    public List<QuantityBreakdown47> getQtyBrkdwn() {
        if (qtyBrkdwn == null) {
            qtyBrkdwn = new ArrayList<QuantityBreakdown47>();
        }
        return this.qtyBrkdwn;
    }

    /**
     * Obtiene el valor de la propiedad sfkpgPlc.
     * 
     * @return
     *     possible object is
     *     {@link SafeKeepingPlace3 }
     *     
     */
    public SafeKeepingPlace3 getSfkpgPlc() {
        return sfkpgPlc;
    }

    /**
     * Define el valor de la propiedad sfkpgPlc.
     * 
     * @param value
     *     allowed object is
     *     {@link SafeKeepingPlace3 }
     *     
     */
    public void setSfkpgPlc(SafeKeepingPlace3 value) {
        this.sfkpgPlc = value;
    }

}
