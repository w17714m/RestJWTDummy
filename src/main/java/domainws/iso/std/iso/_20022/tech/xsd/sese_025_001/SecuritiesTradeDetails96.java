//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.02.26 a las 05:19:56 PM COT 
//


package iso.std.iso._20022.tech.xsd.sese_025_001;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SecuritiesTradeDetails96 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SecuritiesTradeDetails96">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TradId" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}Max52Text" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CollTxId" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}Max35Text" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PlcOfTrad" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}PlaceOfTradeIdentification1" minOccurs="0"/>
 *         &lt;element name="PlcOfClr" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}PlaceOfClearingIdentification2" minOccurs="0"/>
 *         &lt;element name="TradDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}TradeDate8Choice" minOccurs="0"/>
 *         &lt;element name="SttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}SettlementDate17Choice" minOccurs="0"/>
 *         &lt;element name="FctvSttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}SettlementDate18Choice"/>
 *         &lt;element name="DealPric" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}Price7" minOccurs="0"/>
 *         &lt;element name="NbOfDaysAcrd" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}Max3Number" minOccurs="0"/>
 *         &lt;element name="OpngClsg" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}OpeningClosing3Choice" minOccurs="0"/>
 *         &lt;element name="Rptg" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}Reporting10Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TradTxCond" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}TradeTransactionCondition5Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InvstrCpcty" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}InvestorCapacity4Choice" minOccurs="0"/>
 *         &lt;element name="TradOrgtrRole" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}TradeOriginator3Choice" minOccurs="0"/>
 *         &lt;element name="TpOfPric" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}TypeOfPrice29Choice" minOccurs="0"/>
 *         &lt;element name="FxAddtlDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}Max350Text" minOccurs="0"/>
 *         &lt;element name="SttlmInstrPrcgAddtlDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}Max350Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesTradeDetails96", propOrder = {
    "tradId",
    "collTxId",
    "plcOfTrad",
    "plcOfClr",
    "tradDt",
    "sttlmDt",
    "fctvSttlmDt",
    "dealPric",
    "nbOfDaysAcrd",
    "opngClsg",
    "rptg",
    "tradTxCond",
    "invstrCpcty",
    "tradOrgtrRole",
    "tpOfPric",
    "fxAddtlDtls",
    "sttlmInstrPrcgAddtlDtls"
})
public class SecuritiesTradeDetails96 {

    @XmlElement(name = "TradId")
    protected List<String> tradId;
    @XmlElement(name = "CollTxId")
    protected List<String> collTxId;
    @XmlElement(name = "PlcOfTrad")
    protected PlaceOfTradeIdentification1 plcOfTrad;
    @XmlElement(name = "PlcOfClr")
    protected PlaceOfClearingIdentification2 plcOfClr;
    @XmlElement(name = "TradDt")
    protected TradeDate8Choice tradDt;
    @XmlElement(name = "SttlmDt")
    protected SettlementDate17Choice sttlmDt;
    @XmlElement(name = "FctvSttlmDt", required = true)
    protected SettlementDate18Choice fctvSttlmDt;
    @XmlElement(name = "DealPric")
    protected Price7 dealPric;
    @XmlElement(name = "NbOfDaysAcrd")
    protected BigDecimal nbOfDaysAcrd;
    @XmlElement(name = "OpngClsg")
    protected OpeningClosing3Choice opngClsg;
    @XmlElement(name = "Rptg")
    protected List<Reporting10Choice> rptg;
    @XmlElement(name = "TradTxCond")
    protected List<TradeTransactionCondition5Choice> tradTxCond;
    @XmlElement(name = "InvstrCpcty")
    protected InvestorCapacity4Choice invstrCpcty;
    @XmlElement(name = "TradOrgtrRole")
    protected TradeOriginator3Choice tradOrgtrRole;
    @XmlElement(name = "TpOfPric")
    protected TypeOfPrice29Choice tpOfPric;
    @XmlElement(name = "FxAddtlDtls")
    protected String fxAddtlDtls;
    @XmlElement(name = "SttlmInstrPrcgAddtlDtls")
    protected String sttlmInstrPrcgAddtlDtls;

    /**
     * Gets the value of the tradId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTradId() {
        if (tradId == null) {
            tradId = new ArrayList<String>();
        }
        return this.tradId;
    }

    /**
     * Gets the value of the collTxId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collTxId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollTxId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCollTxId() {
        if (collTxId == null) {
            collTxId = new ArrayList<String>();
        }
        return this.collTxId;
    }

    /**
     * Obtiene el valor de la propiedad plcOfTrad.
     * 
     * @return
     *     possible object is
     *     {@link PlaceOfTradeIdentification1 }
     *     
     */
    public PlaceOfTradeIdentification1 getPlcOfTrad() {
        return plcOfTrad;
    }

    /**
     * Define el valor de la propiedad plcOfTrad.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceOfTradeIdentification1 }
     *     
     */
    public void setPlcOfTrad(PlaceOfTradeIdentification1 value) {
        this.plcOfTrad = value;
    }

    /**
     * Obtiene el valor de la propiedad plcOfClr.
     * 
     * @return
     *     possible object is
     *     {@link PlaceOfClearingIdentification2 }
     *     
     */
    public PlaceOfClearingIdentification2 getPlcOfClr() {
        return plcOfClr;
    }

    /**
     * Define el valor de la propiedad plcOfClr.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceOfClearingIdentification2 }
     *     
     */
    public void setPlcOfClr(PlaceOfClearingIdentification2 value) {
        this.plcOfClr = value;
    }

    /**
     * Obtiene el valor de la propiedad tradDt.
     * 
     * @return
     *     possible object is
     *     {@link TradeDate8Choice }
     *     
     */
    public TradeDate8Choice getTradDt() {
        return tradDt;
    }

    /**
     * Define el valor de la propiedad tradDt.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeDate8Choice }
     *     
     */
    public void setTradDt(TradeDate8Choice value) {
        this.tradDt = value;
    }

    /**
     * Obtiene el valor de la propiedad sttlmDt.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDate17Choice }
     *     
     */
    public SettlementDate17Choice getSttlmDt() {
        return sttlmDt;
    }

    /**
     * Define el valor de la propiedad sttlmDt.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDate17Choice }
     *     
     */
    public void setSttlmDt(SettlementDate17Choice value) {
        this.sttlmDt = value;
    }

    /**
     * Obtiene el valor de la propiedad fctvSttlmDt.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDate18Choice }
     *     
     */
    public SettlementDate18Choice getFctvSttlmDt() {
        return fctvSttlmDt;
    }

    /**
     * Define el valor de la propiedad fctvSttlmDt.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDate18Choice }
     *     
     */
    public void setFctvSttlmDt(SettlementDate18Choice value) {
        this.fctvSttlmDt = value;
    }

    /**
     * Obtiene el valor de la propiedad dealPric.
     * 
     * @return
     *     possible object is
     *     {@link Price7 }
     *     
     */
    public Price7 getDealPric() {
        return dealPric;
    }

    /**
     * Define el valor de la propiedad dealPric.
     * 
     * @param value
     *     allowed object is
     *     {@link Price7 }
     *     
     */
    public void setDealPric(Price7 value) {
        this.dealPric = value;
    }

    /**
     * Obtiene el valor de la propiedad nbOfDaysAcrd.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfDaysAcrd() {
        return nbOfDaysAcrd;
    }

    /**
     * Define el valor de la propiedad nbOfDaysAcrd.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNbOfDaysAcrd(BigDecimal value) {
        this.nbOfDaysAcrd = value;
    }

    /**
     * Obtiene el valor de la propiedad opngClsg.
     * 
     * @return
     *     possible object is
     *     {@link OpeningClosing3Choice }
     *     
     */
    public OpeningClosing3Choice getOpngClsg() {
        return opngClsg;
    }

    /**
     * Define el valor de la propiedad opngClsg.
     * 
     * @param value
     *     allowed object is
     *     {@link OpeningClosing3Choice }
     *     
     */
    public void setOpngClsg(OpeningClosing3Choice value) {
        this.opngClsg = value;
    }

    /**
     * Gets the value of the rptg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rptg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRptg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reporting10Choice }
     * 
     * 
     */
    public List<Reporting10Choice> getRptg() {
        if (rptg == null) {
            rptg = new ArrayList<Reporting10Choice>();
        }
        return this.rptg;
    }

    /**
     * Gets the value of the tradTxCond property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradTxCond property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradTxCond().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeTransactionCondition5Choice }
     * 
     * 
     */
    public List<TradeTransactionCondition5Choice> getTradTxCond() {
        if (tradTxCond == null) {
            tradTxCond = new ArrayList<TradeTransactionCondition5Choice>();
        }
        return this.tradTxCond;
    }

    /**
     * Obtiene el valor de la propiedad invstrCpcty.
     * 
     * @return
     *     possible object is
     *     {@link InvestorCapacity4Choice }
     *     
     */
    public InvestorCapacity4Choice getInvstrCpcty() {
        return invstrCpcty;
    }

    /**
     * Define el valor de la propiedad invstrCpcty.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestorCapacity4Choice }
     *     
     */
    public void setInvstrCpcty(InvestorCapacity4Choice value) {
        this.invstrCpcty = value;
    }

    /**
     * Obtiene el valor de la propiedad tradOrgtrRole.
     * 
     * @return
     *     possible object is
     *     {@link TradeOriginator3Choice }
     *     
     */
    public TradeOriginator3Choice getTradOrgtrRole() {
        return tradOrgtrRole;
    }

    /**
     * Define el valor de la propiedad tradOrgtrRole.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeOriginator3Choice }
     *     
     */
    public void setTradOrgtrRole(TradeOriginator3Choice value) {
        this.tradOrgtrRole = value;
    }

    /**
     * Obtiene el valor de la propiedad tpOfPric.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfPrice29Choice }
     *     
     */
    public TypeOfPrice29Choice getTpOfPric() {
        return tpOfPric;
    }

    /**
     * Define el valor de la propiedad tpOfPric.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfPrice29Choice }
     *     
     */
    public void setTpOfPric(TypeOfPrice29Choice value) {
        this.tpOfPric = value;
    }

    /**
     * Obtiene el valor de la propiedad fxAddtlDtls.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFxAddtlDtls() {
        return fxAddtlDtls;
    }

    /**
     * Define el valor de la propiedad fxAddtlDtls.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFxAddtlDtls(String value) {
        this.fxAddtlDtls = value;
    }

    /**
     * Obtiene el valor de la propiedad sttlmInstrPrcgAddtlDtls.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSttlmInstrPrcgAddtlDtls() {
        return sttlmInstrPrcgAddtlDtls;
    }

    /**
     * Define el valor de la propiedad sttlmInstrPrcgAddtlDtls.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSttlmInstrPrcgAddtlDtls(String value) {
        this.sttlmInstrPrcgAddtlDtls = value;
    }

}
