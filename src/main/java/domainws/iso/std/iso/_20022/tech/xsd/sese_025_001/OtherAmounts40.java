//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.02.26 a las 05:19:56 PM COT 
//


package iso.std.iso._20022.tech.xsd.sese_025_001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OtherAmounts40 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OtherAmounts40">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcrdIntrstAmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}AmountAndDirection44" minOccurs="0"/>
 *         &lt;element name="ChrgsFees" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}AmountAndDirection44" minOccurs="0"/>
 *         &lt;element name="CtryNtlFdrlTax" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}AmountAndDirection44" minOccurs="0"/>
 *         &lt;element name="TradAmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}AmountAndDirection44" minOccurs="0"/>
 *         &lt;element name="ExctgBrkrAmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}AmountAndDirection44" minOccurs="0"/>
 *         &lt;element name="IsseDscntAllwnc" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}AmountAndDirection44" minOccurs="0"/>
 *         &lt;element name="PmtLevyTax" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}AmountAndDirection44" minOccurs="0"/>
 *         &lt;element name="LclTax" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}AmountAndDirection44" minOccurs="0"/>
 *         &lt;element name="LclTaxCtrySpcfc" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}AmountAndDirection44" minOccurs="0"/>
 *         &lt;element name="LclBrkrComssn" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}AmountAndDirection44" minOccurs="0"/>
 *         &lt;element name="Mrgn" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}AmountAndDirection44" minOccurs="0"/>
 *         &lt;element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}AmountAndDirection44" minOccurs="0"/>
 *         &lt;element name="RgltryAmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}AmountAndDirection44" minOccurs="0"/>
 *         &lt;element name="ShppgAmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}AmountAndDirection44" minOccurs="0"/>
 *         &lt;element name="SpclCncssn" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}AmountAndDirection44" minOccurs="0"/>
 *         &lt;element name="StmpDty" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}AmountAndDirection44" minOccurs="0"/>
 *         &lt;element name="StockXchgTax" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}AmountAndDirection44" minOccurs="0"/>
 *         &lt;element name="TrfTax" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}AmountAndDirection44" minOccurs="0"/>
 *         &lt;element name="TxTax" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}AmountAndDirection44" minOccurs="0"/>
 *         &lt;element name="ValAddedTax" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}AmountAndDirection44" minOccurs="0"/>
 *         &lt;element name="WhldgTax" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}AmountAndDirection44" minOccurs="0"/>
 *         &lt;element name="NetGnLoss" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}AmountAndDirection44" minOccurs="0"/>
 *         &lt;element name="CsmptnTax" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}AmountAndDirection44" minOccurs="0"/>
 *         &lt;element name="AcrdCptlstnAmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}AmountAndDirection44" minOccurs="0"/>
 *         &lt;element name="BookVal" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}AmountAndDirection44" minOccurs="0"/>
 *         &lt;element name="CollMntrAmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}AmountAndDirection44" minOccurs="0"/>
 *         &lt;element name="RsrchFee" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}AmountAndDirection44" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherAmounts40", propOrder = {
    "acrdIntrstAmt",
    "chrgsFees",
    "ctryNtlFdrlTax",
    "tradAmt",
    "exctgBrkrAmt",
    "isseDscntAllwnc",
    "pmtLevyTax",
    "lclTax",
    "lclTaxCtrySpcfc",
    "lclBrkrComssn",
    "mrgn",
    "othr",
    "rgltryAmt",
    "shppgAmt",
    "spclCncssn",
    "stmpDty",
    "stockXchgTax",
    "trfTax",
    "txTax",
    "valAddedTax",
    "whldgTax",
    "netGnLoss",
    "csmptnTax",
    "acrdCptlstnAmt",
    "bookVal",
    "collMntrAmt",
    "rsrchFee"
})
public class OtherAmounts40 {

    @XmlElement(name = "AcrdIntrstAmt")
    protected AmountAndDirection44 acrdIntrstAmt;
    @XmlElement(name = "ChrgsFees")
    protected AmountAndDirection44 chrgsFees;
    @XmlElement(name = "CtryNtlFdrlTax")
    protected AmountAndDirection44 ctryNtlFdrlTax;
    @XmlElement(name = "TradAmt")
    protected AmountAndDirection44 tradAmt;
    @XmlElement(name = "ExctgBrkrAmt")
    protected AmountAndDirection44 exctgBrkrAmt;
    @XmlElement(name = "IsseDscntAllwnc")
    protected AmountAndDirection44 isseDscntAllwnc;
    @XmlElement(name = "PmtLevyTax")
    protected AmountAndDirection44 pmtLevyTax;
    @XmlElement(name = "LclTax")
    protected AmountAndDirection44 lclTax;
    @XmlElement(name = "LclTaxCtrySpcfc")
    protected AmountAndDirection44 lclTaxCtrySpcfc;
    @XmlElement(name = "LclBrkrComssn")
    protected AmountAndDirection44 lclBrkrComssn;
    @XmlElement(name = "Mrgn")
    protected AmountAndDirection44 mrgn;
    @XmlElement(name = "Othr")
    protected AmountAndDirection44 othr;
    @XmlElement(name = "RgltryAmt")
    protected AmountAndDirection44 rgltryAmt;
    @XmlElement(name = "ShppgAmt")
    protected AmountAndDirection44 shppgAmt;
    @XmlElement(name = "SpclCncssn")
    protected AmountAndDirection44 spclCncssn;
    @XmlElement(name = "StmpDty")
    protected AmountAndDirection44 stmpDty;
    @XmlElement(name = "StockXchgTax")
    protected AmountAndDirection44 stockXchgTax;
    @XmlElement(name = "TrfTax")
    protected AmountAndDirection44 trfTax;
    @XmlElement(name = "TxTax")
    protected AmountAndDirection44 txTax;
    @XmlElement(name = "ValAddedTax")
    protected AmountAndDirection44 valAddedTax;
    @XmlElement(name = "WhldgTax")
    protected AmountAndDirection44 whldgTax;
    @XmlElement(name = "NetGnLoss")
    protected AmountAndDirection44 netGnLoss;
    @XmlElement(name = "CsmptnTax")
    protected AmountAndDirection44 csmptnTax;
    @XmlElement(name = "AcrdCptlstnAmt")
    protected AmountAndDirection44 acrdCptlstnAmt;
    @XmlElement(name = "BookVal")
    protected AmountAndDirection44 bookVal;
    @XmlElement(name = "CollMntrAmt")
    protected AmountAndDirection44 collMntrAmt;
    @XmlElement(name = "RsrchFee")
    protected AmountAndDirection44 rsrchFee;

    /**
     * Obtiene el valor de la propiedad acrdIntrstAmt.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getAcrdIntrstAmt() {
        return acrdIntrstAmt;
    }

    /**
     * Define el valor de la propiedad acrdIntrstAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setAcrdIntrstAmt(AmountAndDirection44 value) {
        this.acrdIntrstAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad chrgsFees.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getChrgsFees() {
        return chrgsFees;
    }

    /**
     * Define el valor de la propiedad chrgsFees.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setChrgsFees(AmountAndDirection44 value) {
        this.chrgsFees = value;
    }

    /**
     * Obtiene el valor de la propiedad ctryNtlFdrlTax.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getCtryNtlFdrlTax() {
        return ctryNtlFdrlTax;
    }

    /**
     * Define el valor de la propiedad ctryNtlFdrlTax.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setCtryNtlFdrlTax(AmountAndDirection44 value) {
        this.ctryNtlFdrlTax = value;
    }

    /**
     * Obtiene el valor de la propiedad tradAmt.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getTradAmt() {
        return tradAmt;
    }

    /**
     * Define el valor de la propiedad tradAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setTradAmt(AmountAndDirection44 value) {
        this.tradAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad exctgBrkrAmt.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getExctgBrkrAmt() {
        return exctgBrkrAmt;
    }

    /**
     * Define el valor de la propiedad exctgBrkrAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setExctgBrkrAmt(AmountAndDirection44 value) {
        this.exctgBrkrAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad isseDscntAllwnc.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getIsseDscntAllwnc() {
        return isseDscntAllwnc;
    }

    /**
     * Define el valor de la propiedad isseDscntAllwnc.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setIsseDscntAllwnc(AmountAndDirection44 value) {
        this.isseDscntAllwnc = value;
    }

    /**
     * Obtiene el valor de la propiedad pmtLevyTax.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getPmtLevyTax() {
        return pmtLevyTax;
    }

    /**
     * Define el valor de la propiedad pmtLevyTax.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setPmtLevyTax(AmountAndDirection44 value) {
        this.pmtLevyTax = value;
    }

    /**
     * Obtiene el valor de la propiedad lclTax.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getLclTax() {
        return lclTax;
    }

    /**
     * Define el valor de la propiedad lclTax.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setLclTax(AmountAndDirection44 value) {
        this.lclTax = value;
    }

    /**
     * Obtiene el valor de la propiedad lclTaxCtrySpcfc.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getLclTaxCtrySpcfc() {
        return lclTaxCtrySpcfc;
    }

    /**
     * Define el valor de la propiedad lclTaxCtrySpcfc.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setLclTaxCtrySpcfc(AmountAndDirection44 value) {
        this.lclTaxCtrySpcfc = value;
    }

    /**
     * Obtiene el valor de la propiedad lclBrkrComssn.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getLclBrkrComssn() {
        return lclBrkrComssn;
    }

    /**
     * Define el valor de la propiedad lclBrkrComssn.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setLclBrkrComssn(AmountAndDirection44 value) {
        this.lclBrkrComssn = value;
    }

    /**
     * Obtiene el valor de la propiedad mrgn.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getMrgn() {
        return mrgn;
    }

    /**
     * Define el valor de la propiedad mrgn.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setMrgn(AmountAndDirection44 value) {
        this.mrgn = value;
    }

    /**
     * Obtiene el valor de la propiedad othr.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getOthr() {
        return othr;
    }

    /**
     * Define el valor de la propiedad othr.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setOthr(AmountAndDirection44 value) {
        this.othr = value;
    }

    /**
     * Obtiene el valor de la propiedad rgltryAmt.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getRgltryAmt() {
        return rgltryAmt;
    }

    /**
     * Define el valor de la propiedad rgltryAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setRgltryAmt(AmountAndDirection44 value) {
        this.rgltryAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad shppgAmt.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getShppgAmt() {
        return shppgAmt;
    }

    /**
     * Define el valor de la propiedad shppgAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setShppgAmt(AmountAndDirection44 value) {
        this.shppgAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad spclCncssn.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getSpclCncssn() {
        return spclCncssn;
    }

    /**
     * Define el valor de la propiedad spclCncssn.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setSpclCncssn(AmountAndDirection44 value) {
        this.spclCncssn = value;
    }

    /**
     * Obtiene el valor de la propiedad stmpDty.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getStmpDty() {
        return stmpDty;
    }

    /**
     * Define el valor de la propiedad stmpDty.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setStmpDty(AmountAndDirection44 value) {
        this.stmpDty = value;
    }

    /**
     * Obtiene el valor de la propiedad stockXchgTax.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getStockXchgTax() {
        return stockXchgTax;
    }

    /**
     * Define el valor de la propiedad stockXchgTax.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setStockXchgTax(AmountAndDirection44 value) {
        this.stockXchgTax = value;
    }

    /**
     * Obtiene el valor de la propiedad trfTax.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getTrfTax() {
        return trfTax;
    }

    /**
     * Define el valor de la propiedad trfTax.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setTrfTax(AmountAndDirection44 value) {
        this.trfTax = value;
    }

    /**
     * Obtiene el valor de la propiedad txTax.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getTxTax() {
        return txTax;
    }

    /**
     * Define el valor de la propiedad txTax.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setTxTax(AmountAndDirection44 value) {
        this.txTax = value;
    }

    /**
     * Obtiene el valor de la propiedad valAddedTax.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getValAddedTax() {
        return valAddedTax;
    }

    /**
     * Define el valor de la propiedad valAddedTax.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setValAddedTax(AmountAndDirection44 value) {
        this.valAddedTax = value;
    }

    /**
     * Obtiene el valor de la propiedad whldgTax.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getWhldgTax() {
        return whldgTax;
    }

    /**
     * Define el valor de la propiedad whldgTax.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setWhldgTax(AmountAndDirection44 value) {
        this.whldgTax = value;
    }

    /**
     * Obtiene el valor de la propiedad netGnLoss.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getNetGnLoss() {
        return netGnLoss;
    }

    /**
     * Define el valor de la propiedad netGnLoss.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setNetGnLoss(AmountAndDirection44 value) {
        this.netGnLoss = value;
    }

    /**
     * Obtiene el valor de la propiedad csmptnTax.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getCsmptnTax() {
        return csmptnTax;
    }

    /**
     * Define el valor de la propiedad csmptnTax.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setCsmptnTax(AmountAndDirection44 value) {
        this.csmptnTax = value;
    }

    /**
     * Obtiene el valor de la propiedad acrdCptlstnAmt.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getAcrdCptlstnAmt() {
        return acrdCptlstnAmt;
    }

    /**
     * Define el valor de la propiedad acrdCptlstnAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setAcrdCptlstnAmt(AmountAndDirection44 value) {
        this.acrdCptlstnAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad bookVal.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getBookVal() {
        return bookVal;
    }

    /**
     * Define el valor de la propiedad bookVal.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setBookVal(AmountAndDirection44 value) {
        this.bookVal = value;
    }

    /**
     * Obtiene el valor de la propiedad collMntrAmt.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getCollMntrAmt() {
        return collMntrAmt;
    }

    /**
     * Define el valor de la propiedad collMntrAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setCollMntrAmt(AmountAndDirection44 value) {
        this.collMntrAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad rsrchFee.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getRsrchFee() {
        return rsrchFee;
    }

    /**
     * Define el valor de la propiedad rsrchFee.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setRsrchFee(AmountAndDirection44 value) {
        this.rsrchFee = value;
    }

}
