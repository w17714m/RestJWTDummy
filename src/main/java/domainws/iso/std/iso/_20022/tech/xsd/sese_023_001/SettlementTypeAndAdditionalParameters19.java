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
 * <p>Clase Java para SettlementTypeAndAdditionalParameters19 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SettlementTypeAndAdditionalParameters19">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SctiesMvmntTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}ReceiveDelivery1Code"/>
 *         &lt;element name="Pmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}DeliveryReceiptType2Code"/>
 *         &lt;element name="CmonId" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}Max35Text" minOccurs="0"/>
 *         &lt;element name="CorpActnEvtId" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}Max35Text" minOccurs="0"/>
 *         &lt;element name="RcncltnInd" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}YesNoIndicator" minOccurs="0"/>
 *         &lt;element name="ClntCollInstrId" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}Max35Text" minOccurs="0"/>
 *         &lt;element name="ClntCollTxId" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}Max35Text" minOccurs="0"/>
 *         &lt;element name="TrptyAgtSvcPrvdrCollTxId" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}Max35Text" minOccurs="0"/>
 *         &lt;element name="TrptyAgtSvcPrvdrCollInstrId" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}Max35Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementTypeAndAdditionalParameters19", propOrder = {
    "sctiesMvmntTp",
    "pmt",
    "cmonId",
    "corpActnEvtId",
    "rcncltnInd",
    "clntCollInstrId",
    "clntCollTxId",
    "trptyAgtSvcPrvdrCollTxId",
    "trptyAgtSvcPrvdrCollInstrId"
})
public class SettlementTypeAndAdditionalParameters19 {

    @XmlElement(name = "SctiesMvmntTp", required = true)
    protected ReceiveDelivery1Code sctiesMvmntTp;
    @XmlElement(name = "Pmt", required = true)
    protected DeliveryReceiptType2Code pmt;
    @XmlElement(name = "CmonId")
    protected String cmonId;
    @XmlElement(name = "CorpActnEvtId")
    protected String corpActnEvtId;
    @XmlElement(name = "RcncltnInd")
    protected Boolean rcncltnInd;
    @XmlElement(name = "ClntCollInstrId")
    protected String clntCollInstrId;
    @XmlElement(name = "ClntCollTxId")
    protected String clntCollTxId;
    @XmlElement(name = "TrptyAgtSvcPrvdrCollTxId")
    protected String trptyAgtSvcPrvdrCollTxId;
    @XmlElement(name = "TrptyAgtSvcPrvdrCollInstrId")
    protected String trptyAgtSvcPrvdrCollInstrId;

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
     * Obtiene el valor de la propiedad cmonId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmonId() {
        return cmonId;
    }

    /**
     * Define el valor de la propiedad cmonId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmonId(String value) {
        this.cmonId = value;
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
     * Obtiene el valor de la propiedad rcncltnInd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRcncltnInd() {
        return rcncltnInd;
    }

    /**
     * Define el valor de la propiedad rcncltnInd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRcncltnInd(Boolean value) {
        this.rcncltnInd = value;
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
     * Obtiene el valor de la propiedad clntCollTxId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntCollTxId() {
        return clntCollTxId;
    }

    /**
     * Define el valor de la propiedad clntCollTxId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClntCollTxId(String value) {
        this.clntCollTxId = value;
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

}
