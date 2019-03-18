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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para FinancialInstrumentAttributes91 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FinancialInstrumentAttributes91">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PlcOfListg" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}MarketIdentification3Choice" minOccurs="0"/>
 *         &lt;element name="DayCntBsis" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}InterestComputationMethodFormat4Choice" minOccurs="0"/>
 *         &lt;element name="RegnForm" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}FormOfSecurity6Choice" minOccurs="0"/>
 *         &lt;element name="PmtFrqcy" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}Frequency23Choice" minOccurs="0"/>
 *         &lt;element name="PmtSts" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}SecuritiesPaymentStatus5Choice" minOccurs="0"/>
 *         &lt;element name="VarblRateChngFrqcy" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}Frequency23Choice" minOccurs="0"/>
 *         &lt;element name="ClssfctnTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}ClassificationType32Choice" minOccurs="0"/>
 *         &lt;element name="OptnStyle" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}OptionStyle8Choice" minOccurs="0"/>
 *         &lt;element name="OptnTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}OptionType6Choice" minOccurs="0"/>
 *         &lt;element name="DnmtnCcy" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}ActiveOrHistoricCurrencyCode" minOccurs="0"/>
 *         &lt;element name="CpnDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}ISODate" minOccurs="0"/>
 *         &lt;element name="XpryDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}ISODate" minOccurs="0"/>
 *         &lt;element name="FltgRateFxgDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}ISODate" minOccurs="0"/>
 *         &lt;element name="MtrtyDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}ISODate" minOccurs="0"/>
 *         &lt;element name="IsseDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}ISODate" minOccurs="0"/>
 *         &lt;element name="NxtCllblDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}ISODate" minOccurs="0"/>
 *         &lt;element name="PutblDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}ISODate" minOccurs="0"/>
 *         &lt;element name="DtdDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}ISODate" minOccurs="0"/>
 *         &lt;element name="FrstPmtDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}ISODate" minOccurs="0"/>
 *         &lt;element name="PrvsFctr" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}BaseOneRate" minOccurs="0"/>
 *         &lt;element name="CurFctr" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}BaseOneRate" minOccurs="0"/>
 *         &lt;element name="NxtFctr" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}BaseOneRate" minOccurs="0"/>
 *         &lt;element name="IntrstRate" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}PercentageRate" minOccurs="0"/>
 *         &lt;element name="YldToMtrtyRate" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}PercentageRate" minOccurs="0"/>
 *         &lt;element name="NxtIntrstRate" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}PercentageRate" minOccurs="0"/>
 *         &lt;element name="IndxRateBsis" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}PercentageRate" minOccurs="0"/>
 *         &lt;element name="CpnAttchdNb" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}Number22Choice" minOccurs="0"/>
 *         &lt;element name="PoolNb" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}GenericIdentification37" minOccurs="0"/>
 *         &lt;element name="VarblRateInd" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}YesNoIndicator" minOccurs="0"/>
 *         &lt;element name="CllblInd" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}YesNoIndicator" minOccurs="0"/>
 *         &lt;element name="PutblInd" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}YesNoIndicator" minOccurs="0"/>
 *         &lt;element name="MktOrIndctvPric" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}PriceType4Choice" minOccurs="0"/>
 *         &lt;element name="ExrcPric" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}Price7" minOccurs="0"/>
 *         &lt;element name="SbcptPric" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}Price7" minOccurs="0"/>
 *         &lt;element name="ConvsPric" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}Price7" minOccurs="0"/>
 *         &lt;element name="StrkPric" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}Price7" minOccurs="0"/>
 *         &lt;element name="MinNmnlQty" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}FinancialInstrumentQuantity1Choice" minOccurs="0"/>
 *         &lt;element name="CtrctSz" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}FinancialInstrumentQuantity1Choice" minOccurs="0"/>
 *         &lt;element name="UndrlygFinInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}SecurityIdentification19" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FinInstrmAttrAddtlDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}Max350Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentAttributes91", propOrder = {
    "plcOfListg",
    "dayCntBsis",
    "regnForm",
    "pmtFrqcy",
    "pmtSts",
    "varblRateChngFrqcy",
    "clssfctnTp",
    "optnStyle",
    "optnTp",
    "dnmtnCcy",
    "cpnDt",
    "xpryDt",
    "fltgRateFxgDt",
    "mtrtyDt",
    "isseDt",
    "nxtCllblDt",
    "putblDt",
    "dtdDt",
    "frstPmtDt",
    "prvsFctr",
    "curFctr",
    "nxtFctr",
    "intrstRate",
    "yldToMtrtyRate",
    "nxtIntrstRate",
    "indxRateBsis",
    "cpnAttchdNb",
    "poolNb",
    "varblRateInd",
    "cllblInd",
    "putblInd",
    "mktOrIndctvPric",
    "exrcPric",
    "sbcptPric",
    "convsPric",
    "strkPric",
    "minNmnlQty",
    "ctrctSz",
    "undrlygFinInstrmId",
    "finInstrmAttrAddtlDtls"
})
public class FinancialInstrumentAttributes91 {

    @XmlElement(name = "PlcOfListg")
    protected MarketIdentification3Choice plcOfListg;
    @XmlElement(name = "DayCntBsis")
    protected InterestComputationMethodFormat4Choice dayCntBsis;
    @XmlElement(name = "RegnForm")
    protected FormOfSecurity6Choice regnForm;
    @XmlElement(name = "PmtFrqcy")
    protected Frequency23Choice pmtFrqcy;
    @XmlElement(name = "PmtSts")
    protected SecuritiesPaymentStatus5Choice pmtSts;
    @XmlElement(name = "VarblRateChngFrqcy")
    protected Frequency23Choice varblRateChngFrqcy;
    @XmlElement(name = "ClssfctnTp")
    protected ClassificationType32Choice clssfctnTp;
    @XmlElement(name = "OptnStyle")
    protected OptionStyle8Choice optnStyle;
    @XmlElement(name = "OptnTp")
    protected OptionType6Choice optnTp;
    @XmlElement(name = "DnmtnCcy")
    protected String dnmtnCcy;
    @XmlElement(name = "CpnDt")
    protected XMLGregorianCalendar cpnDt;
    @XmlElement(name = "XpryDt")
    protected XMLGregorianCalendar xpryDt;
    @XmlElement(name = "FltgRateFxgDt")
    protected XMLGregorianCalendar fltgRateFxgDt;
    @XmlElement(name = "MtrtyDt")
    protected XMLGregorianCalendar mtrtyDt;
    @XmlElement(name = "IsseDt")
    protected XMLGregorianCalendar isseDt;
    @XmlElement(name = "NxtCllblDt")
    protected XMLGregorianCalendar nxtCllblDt;
    @XmlElement(name = "PutblDt")
    protected XMLGregorianCalendar putblDt;
    @XmlElement(name = "DtdDt")
    protected XMLGregorianCalendar dtdDt;
    @XmlElement(name = "FrstPmtDt")
    protected XMLGregorianCalendar frstPmtDt;
    @XmlElement(name = "PrvsFctr")
    protected BigDecimal prvsFctr;
    @XmlElement(name = "CurFctr")
    protected BigDecimal curFctr;
    @XmlElement(name = "NxtFctr")
    protected BigDecimal nxtFctr;
    @XmlElement(name = "IntrstRate")
    protected BigDecimal intrstRate;
    @XmlElement(name = "YldToMtrtyRate")
    protected BigDecimal yldToMtrtyRate;
    @XmlElement(name = "NxtIntrstRate")
    protected BigDecimal nxtIntrstRate;
    @XmlElement(name = "IndxRateBsis")
    protected BigDecimal indxRateBsis;
    @XmlElement(name = "CpnAttchdNb")
    protected Number22Choice cpnAttchdNb;
    @XmlElement(name = "PoolNb")
    protected GenericIdentification37 poolNb;
    @XmlElement(name = "VarblRateInd")
    protected Boolean varblRateInd;
    @XmlElement(name = "CllblInd")
    protected Boolean cllblInd;
    @XmlElement(name = "PutblInd")
    protected Boolean putblInd;
    @XmlElement(name = "MktOrIndctvPric")
    protected PriceType4Choice mktOrIndctvPric;
    @XmlElement(name = "ExrcPric")
    protected Price7 exrcPric;
    @XmlElement(name = "SbcptPric")
    protected Price7 sbcptPric;
    @XmlElement(name = "ConvsPric")
    protected Price7 convsPric;
    @XmlElement(name = "StrkPric")
    protected Price7 strkPric;
    @XmlElement(name = "MinNmnlQty")
    protected FinancialInstrumentQuantity1Choice minNmnlQty;
    @XmlElement(name = "CtrctSz")
    protected FinancialInstrumentQuantity1Choice ctrctSz;
    @XmlElement(name = "UndrlygFinInstrmId")
    protected List<SecurityIdentification19> undrlygFinInstrmId;
    @XmlElement(name = "FinInstrmAttrAddtlDtls")
    protected String finInstrmAttrAddtlDtls;

    /**
     * Obtiene el valor de la propiedad plcOfListg.
     * 
     * @return
     *     possible object is
     *     {@link MarketIdentification3Choice }
     *     
     */
    public MarketIdentification3Choice getPlcOfListg() {
        return plcOfListg;
    }

    /**
     * Define el valor de la propiedad plcOfListg.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketIdentification3Choice }
     *     
     */
    public void setPlcOfListg(MarketIdentification3Choice value) {
        this.plcOfListg = value;
    }

    /**
     * Obtiene el valor de la propiedad dayCntBsis.
     * 
     * @return
     *     possible object is
     *     {@link InterestComputationMethodFormat4Choice }
     *     
     */
    public InterestComputationMethodFormat4Choice getDayCntBsis() {
        return dayCntBsis;
    }

    /**
     * Define el valor de la propiedad dayCntBsis.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestComputationMethodFormat4Choice }
     *     
     */
    public void setDayCntBsis(InterestComputationMethodFormat4Choice value) {
        this.dayCntBsis = value;
    }

    /**
     * Obtiene el valor de la propiedad regnForm.
     * 
     * @return
     *     possible object is
     *     {@link FormOfSecurity6Choice }
     *     
     */
    public FormOfSecurity6Choice getRegnForm() {
        return regnForm;
    }

    /**
     * Define el valor de la propiedad regnForm.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfSecurity6Choice }
     *     
     */
    public void setRegnForm(FormOfSecurity6Choice value) {
        this.regnForm = value;
    }

    /**
     * Obtiene el valor de la propiedad pmtFrqcy.
     * 
     * @return
     *     possible object is
     *     {@link Frequency23Choice }
     *     
     */
    public Frequency23Choice getPmtFrqcy() {
        return pmtFrqcy;
    }

    /**
     * Define el valor de la propiedad pmtFrqcy.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency23Choice }
     *     
     */
    public void setPmtFrqcy(Frequency23Choice value) {
        this.pmtFrqcy = value;
    }

    /**
     * Obtiene el valor de la propiedad pmtSts.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesPaymentStatus5Choice }
     *     
     */
    public SecuritiesPaymentStatus5Choice getPmtSts() {
        return pmtSts;
    }

    /**
     * Define el valor de la propiedad pmtSts.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesPaymentStatus5Choice }
     *     
     */
    public void setPmtSts(SecuritiesPaymentStatus5Choice value) {
        this.pmtSts = value;
    }

    /**
     * Obtiene el valor de la propiedad varblRateChngFrqcy.
     * 
     * @return
     *     possible object is
     *     {@link Frequency23Choice }
     *     
     */
    public Frequency23Choice getVarblRateChngFrqcy() {
        return varblRateChngFrqcy;
    }

    /**
     * Define el valor de la propiedad varblRateChngFrqcy.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency23Choice }
     *     
     */
    public void setVarblRateChngFrqcy(Frequency23Choice value) {
        this.varblRateChngFrqcy = value;
    }

    /**
     * Obtiene el valor de la propiedad clssfctnTp.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationType32Choice }
     *     
     */
    public ClassificationType32Choice getClssfctnTp() {
        return clssfctnTp;
    }

    /**
     * Define el valor de la propiedad clssfctnTp.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationType32Choice }
     *     
     */
    public void setClssfctnTp(ClassificationType32Choice value) {
        this.clssfctnTp = value;
    }

    /**
     * Obtiene el valor de la propiedad optnStyle.
     * 
     * @return
     *     possible object is
     *     {@link OptionStyle8Choice }
     *     
     */
    public OptionStyle8Choice getOptnStyle() {
        return optnStyle;
    }

    /**
     * Define el valor de la propiedad optnStyle.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionStyle8Choice }
     *     
     */
    public void setOptnStyle(OptionStyle8Choice value) {
        this.optnStyle = value;
    }

    /**
     * Obtiene el valor de la propiedad optnTp.
     * 
     * @return
     *     possible object is
     *     {@link OptionType6Choice }
     *     
     */
    public OptionType6Choice getOptnTp() {
        return optnTp;
    }

    /**
     * Define el valor de la propiedad optnTp.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionType6Choice }
     *     
     */
    public void setOptnTp(OptionType6Choice value) {
        this.optnTp = value;
    }

    /**
     * Obtiene el valor de la propiedad dnmtnCcy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDnmtnCcy() {
        return dnmtnCcy;
    }

    /**
     * Define el valor de la propiedad dnmtnCcy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDnmtnCcy(String value) {
        this.dnmtnCcy = value;
    }

    /**
     * Obtiene el valor de la propiedad cpnDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCpnDt() {
        return cpnDt;
    }

    /**
     * Define el valor de la propiedad cpnDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCpnDt(XMLGregorianCalendar value) {
        this.cpnDt = value;
    }

    /**
     * Obtiene el valor de la propiedad xpryDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getXpryDt() {
        return xpryDt;
    }

    /**
     * Define el valor de la propiedad xpryDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setXpryDt(XMLGregorianCalendar value) {
        this.xpryDt = value;
    }

    /**
     * Obtiene el valor de la propiedad fltgRateFxgDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFltgRateFxgDt() {
        return fltgRateFxgDt;
    }

    /**
     * Define el valor de la propiedad fltgRateFxgDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFltgRateFxgDt(XMLGregorianCalendar value) {
        this.fltgRateFxgDt = value;
    }

    /**
     * Obtiene el valor de la propiedad mtrtyDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMtrtyDt() {
        return mtrtyDt;
    }

    /**
     * Define el valor de la propiedad mtrtyDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMtrtyDt(XMLGregorianCalendar value) {
        this.mtrtyDt = value;
    }

    /**
     * Obtiene el valor de la propiedad isseDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIsseDt() {
        return isseDt;
    }

    /**
     * Define el valor de la propiedad isseDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIsseDt(XMLGregorianCalendar value) {
        this.isseDt = value;
    }

    /**
     * Obtiene el valor de la propiedad nxtCllblDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNxtCllblDt() {
        return nxtCllblDt;
    }

    /**
     * Define el valor de la propiedad nxtCllblDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNxtCllblDt(XMLGregorianCalendar value) {
        this.nxtCllblDt = value;
    }

    /**
     * Obtiene el valor de la propiedad putblDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPutblDt() {
        return putblDt;
    }

    /**
     * Define el valor de la propiedad putblDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPutblDt(XMLGregorianCalendar value) {
        this.putblDt = value;
    }

    /**
     * Obtiene el valor de la propiedad dtdDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtdDt() {
        return dtdDt;
    }

    /**
     * Define el valor de la propiedad dtdDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtdDt(XMLGregorianCalendar value) {
        this.dtdDt = value;
    }

    /**
     * Obtiene el valor de la propiedad frstPmtDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFrstPmtDt() {
        return frstPmtDt;
    }

    /**
     * Define el valor de la propiedad frstPmtDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFrstPmtDt(XMLGregorianCalendar value) {
        this.frstPmtDt = value;
    }

    /**
     * Obtiene el valor de la propiedad prvsFctr.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrvsFctr() {
        return prvsFctr;
    }

    /**
     * Define el valor de la propiedad prvsFctr.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrvsFctr(BigDecimal value) {
        this.prvsFctr = value;
    }

    /**
     * Obtiene el valor de la propiedad curFctr.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurFctr() {
        return curFctr;
    }

    /**
     * Define el valor de la propiedad curFctr.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurFctr(BigDecimal value) {
        this.curFctr = value;
    }

    /**
     * Obtiene el valor de la propiedad nxtFctr.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNxtFctr() {
        return nxtFctr;
    }

    /**
     * Define el valor de la propiedad nxtFctr.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNxtFctr(BigDecimal value) {
        this.nxtFctr = value;
    }

    /**
     * Obtiene el valor de la propiedad intrstRate.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIntrstRate() {
        return intrstRate;
    }

    /**
     * Define el valor de la propiedad intrstRate.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIntrstRate(BigDecimal value) {
        this.intrstRate = value;
    }

    /**
     * Obtiene el valor de la propiedad yldToMtrtyRate.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getYldToMtrtyRate() {
        return yldToMtrtyRate;
    }

    /**
     * Define el valor de la propiedad yldToMtrtyRate.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setYldToMtrtyRate(BigDecimal value) {
        this.yldToMtrtyRate = value;
    }

    /**
     * Obtiene el valor de la propiedad nxtIntrstRate.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNxtIntrstRate() {
        return nxtIntrstRate;
    }

    /**
     * Define el valor de la propiedad nxtIntrstRate.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNxtIntrstRate(BigDecimal value) {
        this.nxtIntrstRate = value;
    }

    /**
     * Obtiene el valor de la propiedad indxRateBsis.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIndxRateBsis() {
        return indxRateBsis;
    }

    /**
     * Define el valor de la propiedad indxRateBsis.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIndxRateBsis(BigDecimal value) {
        this.indxRateBsis = value;
    }

    /**
     * Obtiene el valor de la propiedad cpnAttchdNb.
     * 
     * @return
     *     possible object is
     *     {@link Number22Choice }
     *     
     */
    public Number22Choice getCpnAttchdNb() {
        return cpnAttchdNb;
    }

    /**
     * Define el valor de la propiedad cpnAttchdNb.
     * 
     * @param value
     *     allowed object is
     *     {@link Number22Choice }
     *     
     */
    public void setCpnAttchdNb(Number22Choice value) {
        this.cpnAttchdNb = value;
    }

    /**
     * Obtiene el valor de la propiedad poolNb.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification37 }
     *     
     */
    public GenericIdentification37 getPoolNb() {
        return poolNb;
    }

    /**
     * Define el valor de la propiedad poolNb.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification37 }
     *     
     */
    public void setPoolNb(GenericIdentification37 value) {
        this.poolNb = value;
    }

    /**
     * Obtiene el valor de la propiedad varblRateInd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVarblRateInd() {
        return varblRateInd;
    }

    /**
     * Define el valor de la propiedad varblRateInd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVarblRateInd(Boolean value) {
        this.varblRateInd = value;
    }

    /**
     * Obtiene el valor de la propiedad cllblInd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCllblInd() {
        return cllblInd;
    }

    /**
     * Define el valor de la propiedad cllblInd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCllblInd(Boolean value) {
        this.cllblInd = value;
    }

    /**
     * Obtiene el valor de la propiedad putblInd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPutblInd() {
        return putblInd;
    }

    /**
     * Define el valor de la propiedad putblInd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPutblInd(Boolean value) {
        this.putblInd = value;
    }

    /**
     * Obtiene el valor de la propiedad mktOrIndctvPric.
     * 
     * @return
     *     possible object is
     *     {@link PriceType4Choice }
     *     
     */
    public PriceType4Choice getMktOrIndctvPric() {
        return mktOrIndctvPric;
    }

    /**
     * Define el valor de la propiedad mktOrIndctvPric.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceType4Choice }
     *     
     */
    public void setMktOrIndctvPric(PriceType4Choice value) {
        this.mktOrIndctvPric = value;
    }

    /**
     * Obtiene el valor de la propiedad exrcPric.
     * 
     * @return
     *     possible object is
     *     {@link Price7 }
     *     
     */
    public Price7 getExrcPric() {
        return exrcPric;
    }

    /**
     * Define el valor de la propiedad exrcPric.
     * 
     * @param value
     *     allowed object is
     *     {@link Price7 }
     *     
     */
    public void setExrcPric(Price7 value) {
        this.exrcPric = value;
    }

    /**
     * Obtiene el valor de la propiedad sbcptPric.
     * 
     * @return
     *     possible object is
     *     {@link Price7 }
     *     
     */
    public Price7 getSbcptPric() {
        return sbcptPric;
    }

    /**
     * Define el valor de la propiedad sbcptPric.
     * 
     * @param value
     *     allowed object is
     *     {@link Price7 }
     *     
     */
    public void setSbcptPric(Price7 value) {
        this.sbcptPric = value;
    }

    /**
     * Obtiene el valor de la propiedad convsPric.
     * 
     * @return
     *     possible object is
     *     {@link Price7 }
     *     
     */
    public Price7 getConvsPric() {
        return convsPric;
    }

    /**
     * Define el valor de la propiedad convsPric.
     * 
     * @param value
     *     allowed object is
     *     {@link Price7 }
     *     
     */
    public void setConvsPric(Price7 value) {
        this.convsPric = value;
    }

    /**
     * Obtiene el valor de la propiedad strkPric.
     * 
     * @return
     *     possible object is
     *     {@link Price7 }
     *     
     */
    public Price7 getStrkPric() {
        return strkPric;
    }

    /**
     * Define el valor de la propiedad strkPric.
     * 
     * @param value
     *     allowed object is
     *     {@link Price7 }
     *     
     */
    public void setStrkPric(Price7 value) {
        this.strkPric = value;
    }

    /**
     * Obtiene el valor de la propiedad minNmnlQty.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getMinNmnlQty() {
        return minNmnlQty;
    }

    /**
     * Define el valor de la propiedad minNmnlQty.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public void setMinNmnlQty(FinancialInstrumentQuantity1Choice value) {
        this.minNmnlQty = value;
    }

    /**
     * Obtiene el valor de la propiedad ctrctSz.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getCtrctSz() {
        return ctrctSz;
    }

    /**
     * Define el valor de la propiedad ctrctSz.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public void setCtrctSz(FinancialInstrumentQuantity1Choice value) {
        this.ctrctSz = value;
    }

    /**
     * Gets the value of the undrlygFinInstrmId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the undrlygFinInstrmId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUndrlygFinInstrmId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityIdentification19 }
     * 
     * 
     */
    public List<SecurityIdentification19> getUndrlygFinInstrmId() {
        if (undrlygFinInstrmId == null) {
            undrlygFinInstrmId = new ArrayList<SecurityIdentification19>();
        }
        return this.undrlygFinInstrmId;
    }

    /**
     * Obtiene el valor de la propiedad finInstrmAttrAddtlDtls.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinInstrmAttrAddtlDtls() {
        return finInstrmAttrAddtlDtls;
    }

    /**
     * Define el valor de la propiedad finInstrmAttrAddtlDtls.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinInstrmAttrAddtlDtls(String value) {
        this.finInstrmAttrAddtlDtls = value;
    }

}
