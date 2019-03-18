//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.02.26 a las 05:19:56 PM COT 
//


package iso.std.iso._20022.tech.xsd.sese_023_001;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SecuritiesSettlementTransactionInstructionV09 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SecuritiesSettlementTransactionInstructionV09">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}Max35Text"/>
 *         &lt;element name="SttlmTpAndAddtlParams" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}SettlementTypeAndAdditionalParameters19"/>
 *         &lt;element name="NbCounts" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}NumberCount1Choice" minOccurs="0"/>
 *         &lt;element name="Lnkgs" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}Linkages54" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TradDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}SecuritiesTradeDetails97"/>
 *         &lt;element name="FinInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}SecurityIdentification19"/>
 *         &lt;element name="FinInstrmAttrbts" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}FinancialInstrumentAttributes91" minOccurs="0"/>
 *         &lt;element name="QtyAndAcctDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}QuantityAndAccount79"/>
 *         &lt;element name="SttlmParams" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}SettlementDetails164"/>
 *         &lt;element name="StgSttlmInstrDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}StandingSettlementInstruction16" minOccurs="0"/>
 *         &lt;element name="DlvrgSttlmPties" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}SettlementParties76" minOccurs="0"/>
 *         &lt;element name="RcvgSttlmPties" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}SettlementParties76" minOccurs="0"/>
 *         &lt;element name="CshPties" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}CashParties36" minOccurs="0"/>
 *         &lt;element name="SttlmAmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}AmountAndDirection94" minOccurs="0"/>
 *         &lt;element name="OthrAmts" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}OtherAmounts39" minOccurs="0"/>
 *         &lt;element name="OthrBizPties" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}OtherParties33" minOccurs="0"/>
 *         &lt;element name="AddtlPhysOrRegnDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}RegistrationParameters6" minOccurs="0"/>
 *         &lt;element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesSettlementTransactionInstructionV09", propOrder = {
    "txId",
    "sttlmTpAndAddtlParams",
    "nbCounts",
    "lnkgs",
    "tradDtls",
    "finInstrmId",
    "finInstrmAttrbts",
    "qtyAndAcctDtls",
    "sttlmParams",
    "stgSttlmInstrDtls",
    "dlvrgSttlmPties",
    "rcvgSttlmPties",
    "cshPties",
    "sttlmAmt",
    "othrAmts",
    "othrBizPties",
    "addtlPhysOrRegnDtls",
    "splmtryData"
})
public class SecuritiesSettlementTransactionInstructionV09 {

    @XmlElement(name = "TxId", required = true)
    protected String txId;
    @XmlElement(name = "SttlmTpAndAddtlParams", required = true)
    protected SettlementTypeAndAdditionalParameters19 sttlmTpAndAddtlParams;
    @XmlElement(name = "NbCounts")
    protected NumberCount1Choice nbCounts;
    @XmlElement(name = "Lnkgs")
    protected List<Linkages54> lnkgs;
    @XmlElement(name = "TradDtls", required = true)
    protected SecuritiesTradeDetails97 tradDtls;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "FinInstrmAttrbts")
    protected FinancialInstrumentAttributes91 finInstrmAttrbts;
    @XmlElement(name = "QtyAndAcctDtls", required = true)
    protected QuantityAndAccount79 qtyAndAcctDtls;
    @XmlElement(name = "SttlmParams", required = true)
    protected SettlementDetails164 sttlmParams;
    @XmlElement(name = "StgSttlmInstrDtls")
    protected StandingSettlementInstruction16 stgSttlmInstrDtls;
    @XmlElement(name = "DlvrgSttlmPties")
    protected SettlementParties76 dlvrgSttlmPties;
    @XmlElement(name = "RcvgSttlmPties")
    protected SettlementParties76 rcvgSttlmPties;
    @XmlElement(name = "CshPties")
    protected CashParties36 cshPties;
    @XmlElement(name = "SttlmAmt")
    protected AmountAndDirection94 sttlmAmt;
    @XmlElement(name = "OthrAmts")
    protected OtherAmounts39 othrAmts;
    @XmlElement(name = "OthrBizPties")
    protected OtherParties33 othrBizPties;
    @XmlElement(name = "AddtlPhysOrRegnDtls")
    protected RegistrationParameters6 addtlPhysOrRegnDtls;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Obtiene el valor de la propiedad txId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxId() {
        return txId;
    }

    /**
     * Define el valor de la propiedad txId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxId(String value) {
        this.txId = value;
    }

    /**
     * Obtiene el valor de la propiedad sttlmTpAndAddtlParams.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTypeAndAdditionalParameters19 }
     *     
     */
    public SettlementTypeAndAdditionalParameters19 getSttlmTpAndAddtlParams() {
        return sttlmTpAndAddtlParams;
    }

    /**
     * Define el valor de la propiedad sttlmTpAndAddtlParams.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTypeAndAdditionalParameters19 }
     *     
     */
    public void setSttlmTpAndAddtlParams(SettlementTypeAndAdditionalParameters19 value) {
        this.sttlmTpAndAddtlParams = value;
    }

    /**
     * Obtiene el valor de la propiedad nbCounts.
     * 
     * @return
     *     possible object is
     *     {@link NumberCount1Choice }
     *     
     */
    public NumberCount1Choice getNbCounts() {
        return nbCounts;
    }

    /**
     * Define el valor de la propiedad nbCounts.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberCount1Choice }
     *     
     */
    public void setNbCounts(NumberCount1Choice value) {
        this.nbCounts = value;
    }

    /**
     * Gets the value of the lnkgs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lnkgs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLnkgs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Linkages54 }
     * 
     * 
     */
    public List<Linkages54> getLnkgs() {
        if (lnkgs == null) {
            lnkgs = new ArrayList<Linkages54>();
        }
        return this.lnkgs;
    }

    /**
     * Obtiene el valor de la propiedad tradDtls.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTradeDetails97 }
     *     
     */
    public SecuritiesTradeDetails97 getTradDtls() {
        return tradDtls;
    }

    /**
     * Define el valor de la propiedad tradDtls.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTradeDetails97 }
     *     
     */
    public void setTradDtls(SecuritiesTradeDetails97 value) {
        this.tradDtls = value;
    }

    /**
     * Obtiene el valor de la propiedad finInstrmId.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Define el valor de la propiedad finInstrmId.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public void setFinInstrmId(SecurityIdentification19 value) {
        this.finInstrmId = value;
    }

    /**
     * Obtiene el valor de la propiedad finInstrmAttrbts.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributes91 }
     *     
     */
    public FinancialInstrumentAttributes91 getFinInstrmAttrbts() {
        return finInstrmAttrbts;
    }

    /**
     * Define el valor de la propiedad finInstrmAttrbts.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributes91 }
     *     
     */
    public void setFinInstrmAttrbts(FinancialInstrumentAttributes91 value) {
        this.finInstrmAttrbts = value;
    }

    /**
     * Obtiene el valor de la propiedad qtyAndAcctDtls.
     * 
     * @return
     *     possible object is
     *     {@link QuantityAndAccount79 }
     *     
     */
    public QuantityAndAccount79 getQtyAndAcctDtls() {
        return qtyAndAcctDtls;
    }

    /**
     * Define el valor de la propiedad qtyAndAcctDtls.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityAndAccount79 }
     *     
     */
    public void setQtyAndAcctDtls(QuantityAndAccount79 value) {
        this.qtyAndAcctDtls = value;
    }

    /**
     * Obtiene el valor de la propiedad sttlmParams.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDetails164 }
     *     
     */
    public SettlementDetails164 getSttlmParams() {
        return sttlmParams;
    }

    /**
     * Define el valor de la propiedad sttlmParams.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDetails164 }
     *     
     */
    public void setSttlmParams(SettlementDetails164 value) {
        this.sttlmParams = value;
    }

    /**
     * Obtiene el valor de la propiedad stgSttlmInstrDtls.
     * 
     * @return
     *     possible object is
     *     {@link StandingSettlementInstruction16 }
     *     
     */
    public StandingSettlementInstruction16 getStgSttlmInstrDtls() {
        return stgSttlmInstrDtls;
    }

    /**
     * Define el valor de la propiedad stgSttlmInstrDtls.
     * 
     * @param value
     *     allowed object is
     *     {@link StandingSettlementInstruction16 }
     *     
     */
    public void setStgSttlmInstrDtls(StandingSettlementInstruction16 value) {
        this.stgSttlmInstrDtls = value;
    }

    /**
     * Obtiene el valor de la propiedad dlvrgSttlmPties.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties76 }
     *     
     */
    public SettlementParties76 getDlvrgSttlmPties() {
        return dlvrgSttlmPties;
    }

    /**
     * Define el valor de la propiedad dlvrgSttlmPties.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties76 }
     *     
     */
    public void setDlvrgSttlmPties(SettlementParties76 value) {
        this.dlvrgSttlmPties = value;
    }

    /**
     * Obtiene el valor de la propiedad rcvgSttlmPties.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties76 }
     *     
     */
    public SettlementParties76 getRcvgSttlmPties() {
        return rcvgSttlmPties;
    }

    /**
     * Define el valor de la propiedad rcvgSttlmPties.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties76 }
     *     
     */
    public void setRcvgSttlmPties(SettlementParties76 value) {
        this.rcvgSttlmPties = value;
    }

    /**
     * Obtiene el valor de la propiedad cshPties.
     * 
     * @return
     *     possible object is
     *     {@link CashParties36 }
     *     
     */
    public CashParties36 getCshPties() {
        return cshPties;
    }

    /**
     * Define el valor de la propiedad cshPties.
     * 
     * @param value
     *     allowed object is
     *     {@link CashParties36 }
     *     
     */
    public void setCshPties(CashParties36 value) {
        this.cshPties = value;
    }

    /**
     * Obtiene el valor de la propiedad sttlmAmt.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection94 }
     *     
     */
    public AmountAndDirection94 getSttlmAmt() {
        return sttlmAmt;
    }

    /**
     * Define el valor de la propiedad sttlmAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection94 }
     *     
     */
    public void setSttlmAmt(AmountAndDirection94 value) {
        this.sttlmAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad othrAmts.
     * 
     * @return
     *     possible object is
     *     {@link OtherAmounts39 }
     *     
     */
    public OtherAmounts39 getOthrAmts() {
        return othrAmts;
    }

    /**
     * Define el valor de la propiedad othrAmts.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherAmounts39 }
     *     
     */
    public void setOthrAmts(OtherAmounts39 value) {
        this.othrAmts = value;
    }

    /**
     * Obtiene el valor de la propiedad othrBizPties.
     * 
     * @return
     *     possible object is
     *     {@link OtherParties33 }
     *     
     */
    public OtherParties33 getOthrBizPties() {
        return othrBizPties;
    }

    /**
     * Define el valor de la propiedad othrBizPties.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherParties33 }
     *     
     */
    public void setOthrBizPties(OtherParties33 value) {
        this.othrBizPties = value;
    }

    /**
     * Obtiene el valor de la propiedad addtlPhysOrRegnDtls.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationParameters6 }
     *     
     */
    public RegistrationParameters6 getAddtlPhysOrRegnDtls() {
        return addtlPhysOrRegnDtls;
    }

    /**
     * Define el valor de la propiedad addtlPhysOrRegnDtls.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationParameters6 }
     *     
     */
    public void setAddtlPhysOrRegnDtls(RegistrationParameters6 value) {
        this.addtlPhysOrRegnDtls = value;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
    }

}
