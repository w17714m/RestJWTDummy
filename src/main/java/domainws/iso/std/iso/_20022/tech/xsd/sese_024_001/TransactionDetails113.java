//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.02.26 a las 05:19:56 PM COT 
//


package iso.std.iso._20022.tech.xsd.sese_024_001;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para TransactionDetails113 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TransactionDetails113">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TradId" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}Max52Text" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PoolId" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}Max35Text" minOccurs="0"/>
 *         &lt;element name="CorpActnEvtId" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}Max35Text" minOccurs="0"/>
 *         &lt;element name="TrptyAgtSvcPrvdrCollTxId" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}Max35Text" minOccurs="0"/>
 *         &lt;element name="ClntTrptyCollTxId" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}Max35Text" minOccurs="0"/>
 *         &lt;element name="ClntCollInstrId" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}Max35Text" minOccurs="0"/>
 *         &lt;element name="TrptyAgtSvcPrvdrCollInstrId" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}Max35Text" minOccurs="0"/>
 *         &lt;element name="AcctOwnr" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}PartyIdentification144" minOccurs="0"/>
 *         &lt;element name="SfkpgAcct" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}SecuritiesAccount19"/>
 *         &lt;element name="SfkpgPlc" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}SafeKeepingPlace3" minOccurs="0"/>
 *         &lt;element name="PlcOfTrad" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}PlaceOfTradeIdentification1" minOccurs="0"/>
 *         &lt;element name="PlcOfClr" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}PlaceOfClearingIdentification2" minOccurs="0"/>
 *         &lt;element name="FinInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}SecurityIdentification19"/>
 *         &lt;element name="SttlmQty" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}Quantity6Choice"/>
 *         &lt;element name="SttlmAmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}AmountAndDirection51" minOccurs="0"/>
 *         &lt;element name="LateDlvryDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}DateAndDateTime2Choice" minOccurs="0"/>
 *         &lt;element name="XpctdSttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}DateAndDateTime2Choice" minOccurs="0"/>
 *         &lt;element name="XpctdValDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}DateAndDateTime2Choice" minOccurs="0"/>
 *         &lt;element name="SttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}SettlementDate19Choice"/>
 *         &lt;element name="TradDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}TradeDate8Choice" minOccurs="0"/>
 *         &lt;element name="AckdStsTmStmp" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}ISODateTime" minOccurs="0"/>
 *         &lt;element name="MtchdStsTmStmp" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}ISODateTime" minOccurs="0"/>
 *         &lt;element name="SctiesMvmntTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}ReceiveDelivery1Code"/>
 *         &lt;element name="Pmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}DeliveryReceiptType2Code"/>
 *         &lt;element name="SttlmParams" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}SettlementDetails166"/>
 *         &lt;element name="RcvgSttlmPties" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}SettlementParties78" minOccurs="0"/>
 *         &lt;element name="DlvrgSttlmPties" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}SettlementParties78" minOccurs="0"/>
 *         &lt;element name="Invstr" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}PartyIdentification149" minOccurs="0"/>
 *         &lt;element name="QlfdFrgnIntrmy" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}PartyIdentification136" minOccurs="0"/>
 *         &lt;element name="SttlmInstrPrcgAddtlDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}Max350Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionDetails113", propOrder = {
    "tradId",
    "poolId",
    "corpActnEvtId",
    "trptyAgtSvcPrvdrCollTxId",
    "clntTrptyCollTxId",
    "clntCollInstrId",
    "trptyAgtSvcPrvdrCollInstrId",
    "acctOwnr",
    "sfkpgAcct",
    "sfkpgPlc",
    "plcOfTrad",
    "plcOfClr",
    "finInstrmId",
    "sttlmQty",
    "sttlmAmt",
    "lateDlvryDt",
    "xpctdSttlmDt",
    "xpctdValDt",
    "sttlmDt",
    "tradDt",
    "ackdStsTmStmp",
    "mtchdStsTmStmp",
    "sctiesMvmntTp",
    "pmt",
    "sttlmParams",
    "rcvgSttlmPties",
    "dlvrgSttlmPties",
    "invstr",
    "qlfdFrgnIntrmy",
    "sttlmInstrPrcgAddtlDtls"
})
public class TransactionDetails113 {

    @XmlElement(name = "TradId")
    protected List<String> tradId;
    @XmlElement(name = "PoolId")
    protected String poolId;
    @XmlElement(name = "CorpActnEvtId")
    protected String corpActnEvtId;
    @XmlElement(name = "TrptyAgtSvcPrvdrCollTxId")
    protected String trptyAgtSvcPrvdrCollTxId;
    @XmlElement(name = "ClntTrptyCollTxId")
    protected String clntTrptyCollTxId;
    @XmlElement(name = "ClntCollInstrId")
    protected String clntCollInstrId;
    @XmlElement(name = "TrptyAgtSvcPrvdrCollInstrId")
    protected String trptyAgtSvcPrvdrCollInstrId;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification144 acctOwnr;
    @XmlElement(name = "SfkpgAcct", required = true)
    protected SecuritiesAccount19 sfkpgAcct;
    @XmlElement(name = "SfkpgPlc")
    protected SafeKeepingPlace3 sfkpgPlc;
    @XmlElement(name = "PlcOfTrad")
    protected PlaceOfTradeIdentification1 plcOfTrad;
    @XmlElement(name = "PlcOfClr")
    protected PlaceOfClearingIdentification2 plcOfClr;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "SttlmQty", required = true)
    protected Quantity6Choice sttlmQty;
    @XmlElement(name = "SttlmAmt")
    protected AmountAndDirection51 sttlmAmt;
    @XmlElement(name = "LateDlvryDt")
    protected DateAndDateTime2Choice lateDlvryDt;
    @XmlElement(name = "XpctdSttlmDt")
    protected DateAndDateTime2Choice xpctdSttlmDt;
    @XmlElement(name = "XpctdValDt")
    protected DateAndDateTime2Choice xpctdValDt;
    @XmlElement(name = "SttlmDt", required = true)
    protected SettlementDate19Choice sttlmDt;
    @XmlElement(name = "TradDt")
    protected TradeDate8Choice tradDt;
    @XmlElement(name = "AckdStsTmStmp")
    protected XMLGregorianCalendar ackdStsTmStmp;
    @XmlElement(name = "MtchdStsTmStmp")
    protected XMLGregorianCalendar mtchdStsTmStmp;
    @XmlElement(name = "SctiesMvmntTp", required = true)
    protected ReceiveDelivery1Code sctiesMvmntTp;
    @XmlElement(name = "Pmt", required = true)
    protected DeliveryReceiptType2Code pmt;
    @XmlElement(name = "SttlmParams", required = true)
    protected SettlementDetails166 sttlmParams;
    @XmlElement(name = "RcvgSttlmPties")
    protected SettlementParties78 rcvgSttlmPties;
    @XmlElement(name = "DlvrgSttlmPties")
    protected SettlementParties78 dlvrgSttlmPties;
    @XmlElement(name = "Invstr")
    protected PartyIdentification149 invstr;
    @XmlElement(name = "QlfdFrgnIntrmy")
    protected PartyIdentification136 qlfdFrgnIntrmy;
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
     * Obtiene el valor de la propiedad poolId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoolId() {
        return poolId;
    }

    /**
     * Define el valor de la propiedad poolId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoolId(String value) {
        this.poolId = value;
    }

    /**
     * Obtiene el valor de la propiedad corpActnEvtId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorpActnEvtId() {
        return corpActnEvtId;
    }

    /**
     * Define el valor de la propiedad corpActnEvtId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorpActnEvtId(String value) {
        this.corpActnEvtId = value;
    }

    /**
     * Obtiene el valor de la propiedad trptyAgtSvcPrvdrCollTxId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrptyAgtSvcPrvdrCollTxId() {
        return trptyAgtSvcPrvdrCollTxId;
    }

    /**
     * Define el valor de la propiedad trptyAgtSvcPrvdrCollTxId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrptyAgtSvcPrvdrCollTxId(String value) {
        this.trptyAgtSvcPrvdrCollTxId = value;
    }

    /**
     * Obtiene el valor de la propiedad clntTrptyCollTxId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntTrptyCollTxId() {
        return clntTrptyCollTxId;
    }

    /**
     * Define el valor de la propiedad clntTrptyCollTxId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClntTrptyCollTxId(String value) {
        this.clntTrptyCollTxId = value;
    }

    /**
     * Obtiene el valor de la propiedad clntCollInstrId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntCollInstrId() {
        return clntCollInstrId;
    }

    /**
     * Define el valor de la propiedad clntCollInstrId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClntCollInstrId(String value) {
        this.clntCollInstrId = value;
    }

    /**
     * Obtiene el valor de la propiedad trptyAgtSvcPrvdrCollInstrId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrptyAgtSvcPrvdrCollInstrId() {
        return trptyAgtSvcPrvdrCollInstrId;
    }

    /**
     * Define el valor de la propiedad trptyAgtSvcPrvdrCollInstrId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrptyAgtSvcPrvdrCollInstrId(String value) {
        this.trptyAgtSvcPrvdrCollInstrId = value;
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
     * Obtiene el valor de la propiedad sttlmQty.
     * 
     * @return
     *     possible object is
     *     {@link Quantity6Choice }
     *     
     */
    public Quantity6Choice getSttlmQty() {
        return sttlmQty;
    }

    /**
     * Define el valor de la propiedad sttlmQty.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity6Choice }
     *     
     */
    public void setSttlmQty(Quantity6Choice value) {
        this.sttlmQty = value;
    }

    /**
     * Obtiene el valor de la propiedad sttlmAmt.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection51 }
     *     
     */
    public AmountAndDirection51 getSttlmAmt() {
        return sttlmAmt;
    }

    /**
     * Define el valor de la propiedad sttlmAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection51 }
     *     
     */
    public void setSttlmAmt(AmountAndDirection51 value) {
        this.sttlmAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad lateDlvryDt.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getLateDlvryDt() {
        return lateDlvryDt;
    }

    /**
     * Define el valor de la propiedad lateDlvryDt.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setLateDlvryDt(DateAndDateTime2Choice value) {
        this.lateDlvryDt = value;
    }

    /**
     * Obtiene el valor de la propiedad xpctdSttlmDt.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getXpctdSttlmDt() {
        return xpctdSttlmDt;
    }

    /**
     * Define el valor de la propiedad xpctdSttlmDt.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setXpctdSttlmDt(DateAndDateTime2Choice value) {
        this.xpctdSttlmDt = value;
    }

    /**
     * Obtiene el valor de la propiedad xpctdValDt.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getXpctdValDt() {
        return xpctdValDt;
    }

    /**
     * Define el valor de la propiedad xpctdValDt.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setXpctdValDt(DateAndDateTime2Choice value) {
        this.xpctdValDt = value;
    }

    /**
     * Obtiene el valor de la propiedad sttlmDt.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDate19Choice }
     *     
     */
    public SettlementDate19Choice getSttlmDt() {
        return sttlmDt;
    }

    /**
     * Define el valor de la propiedad sttlmDt.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDate19Choice }
     *     
     */
    public void setSttlmDt(SettlementDate19Choice value) {
        this.sttlmDt = value;
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
     * Obtiene el valor de la propiedad ackdStsTmStmp.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAckdStsTmStmp() {
        return ackdStsTmStmp;
    }

    /**
     * Define el valor de la propiedad ackdStsTmStmp.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAckdStsTmStmp(XMLGregorianCalendar value) {
        this.ackdStsTmStmp = value;
    }

    /**
     * Obtiene el valor de la propiedad mtchdStsTmStmp.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMtchdStsTmStmp() {
        return mtchdStsTmStmp;
    }

    /**
     * Define el valor de la propiedad mtchdStsTmStmp.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMtchdStsTmStmp(XMLGregorianCalendar value) {
        this.mtchdStsTmStmp = value;
    }

    /**
     * Obtiene el valor de la propiedad sctiesMvmntTp.
     * 
     * @return
     *     possible object is
     *     {@link ReceiveDelivery1Code }
     *     
     */
    public ReceiveDelivery1Code getSctiesMvmntTp() {
        return sctiesMvmntTp;
    }

    /**
     * Define el valor de la propiedad sctiesMvmntTp.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiveDelivery1Code }
     *     
     */
    public void setSctiesMvmntTp(ReceiveDelivery1Code value) {
        this.sctiesMvmntTp = value;
    }

    /**
     * Obtiene el valor de la propiedad pmt.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryReceiptType2Code }
     *     
     */
    public DeliveryReceiptType2Code getPmt() {
        return pmt;
    }

    /**
     * Define el valor de la propiedad pmt.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryReceiptType2Code }
     *     
     */
    public void setPmt(DeliveryReceiptType2Code value) {
        this.pmt = value;
    }

    /**
     * Obtiene el valor de la propiedad sttlmParams.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDetails166 }
     *     
     */
    public SettlementDetails166 getSttlmParams() {
        return sttlmParams;
    }

    /**
     * Define el valor de la propiedad sttlmParams.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDetails166 }
     *     
     */
    public void setSttlmParams(SettlementDetails166 value) {
        this.sttlmParams = value;
    }

    /**
     * Obtiene el valor de la propiedad rcvgSttlmPties.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties78 }
     *     
     */
    public SettlementParties78 getRcvgSttlmPties() {
        return rcvgSttlmPties;
    }

    /**
     * Define el valor de la propiedad rcvgSttlmPties.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties78 }
     *     
     */
    public void setRcvgSttlmPties(SettlementParties78 value) {
        this.rcvgSttlmPties = value;
    }

    /**
     * Obtiene el valor de la propiedad dlvrgSttlmPties.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties78 }
     *     
     */
    public SettlementParties78 getDlvrgSttlmPties() {
        return dlvrgSttlmPties;
    }

    /**
     * Define el valor de la propiedad dlvrgSttlmPties.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties78 }
     *     
     */
    public void setDlvrgSttlmPties(SettlementParties78 value) {
        this.dlvrgSttlmPties = value;
    }

    /**
     * Obtiene el valor de la propiedad invstr.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification149 }
     *     
     */
    public PartyIdentification149 getInvstr() {
        return invstr;
    }

    /**
     * Define el valor de la propiedad invstr.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification149 }
     *     
     */
    public void setInvstr(PartyIdentification149 value) {
        this.invstr = value;
    }

    /**
     * Obtiene el valor de la propiedad qlfdFrgnIntrmy.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification136 }
     *     
     */
    public PartyIdentification136 getQlfdFrgnIntrmy() {
        return qlfdFrgnIntrmy;
    }

    /**
     * Define el valor de la propiedad qlfdFrgnIntrmy.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification136 }
     *     
     */
    public void setQlfdFrgnIntrmy(PartyIdentification136 value) {
        this.qlfdFrgnIntrmy = value;
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
