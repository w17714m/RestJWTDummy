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
 * <p>Clase Java para AdditionalParameters29 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AdditionalParameters29">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PreConf" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}PreConfirmation1Code" minOccurs="0"/>
 *         &lt;element name="PrtlSttlm" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}PartialSettlement2Code" minOccurs="0"/>
 *         &lt;element name="PrvsPrtlConfId" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}Max35Text" minOccurs="0"/>
 *         &lt;element name="TrptyAgtSvcPrvdrCollTxId" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}Max35Text" minOccurs="0"/>
 *         &lt;element name="ClntTrptyCollTxId" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}Max35Text" minOccurs="0"/>
 *         &lt;element name="ClntCollInstrId" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}Max35Text" minOccurs="0"/>
 *         &lt;element name="TrptyAgtSvcPrvdrCollInstrId" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}Max35Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalParameters29", propOrder = {
    "preConf",
    "prtlSttlm",
    "prvsPrtlConfId",
    "trptyAgtSvcPrvdrCollTxId",
    "clntTrptyCollTxId",
    "clntCollInstrId",
    "trptyAgtSvcPrvdrCollInstrId"
})
public class AdditionalParameters29 {

    @XmlElement(name = "PreConf")
    protected PreConfirmation1Code preConf;
    @XmlElement(name = "PrtlSttlm")
    protected PartialSettlement2Code prtlSttlm;
    @XmlElement(name = "PrvsPrtlConfId")
    protected String prvsPrtlConfId;
    @XmlElement(name = "TrptyAgtSvcPrvdrCollTxId")
    protected String trptyAgtSvcPrvdrCollTxId;
    @XmlElement(name = "ClntTrptyCollTxId")
    protected String clntTrptyCollTxId;
    @XmlElement(name = "ClntCollInstrId")
    protected String clntCollInstrId;
    @XmlElement(name = "TrptyAgtSvcPrvdrCollInstrId")
    protected String trptyAgtSvcPrvdrCollInstrId;

    /**
     * Obtiene el valor de la propiedad preConf.
     * 
     * @return
     *     possible object is
     *     {@link PreConfirmation1Code }
     *     
     */
    public PreConfirmation1Code getPreConf() {
        return preConf;
    }

    /**
     * Define el valor de la propiedad preConf.
     * 
     * @param value
     *     allowed object is
     *     {@link PreConfirmation1Code }
     *     
     */
    public void setPreConf(PreConfirmation1Code value) {
        this.preConf = value;
    }

    /**
     * Obtiene el valor de la propiedad prtlSttlm.
     * 
     * @return
     *     possible object is
     *     {@link PartialSettlement2Code }
     *     
     */
    public PartialSettlement2Code getPrtlSttlm() {
        return prtlSttlm;
    }

    /**
     * Define el valor de la propiedad prtlSttlm.
     * 
     * @param value
     *     allowed object is
     *     {@link PartialSettlement2Code }
     *     
     */
    public void setPrtlSttlm(PartialSettlement2Code value) {
        this.prtlSttlm = value;
    }

    /**
     * Obtiene el valor de la propiedad prvsPrtlConfId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrvsPrtlConfId() {
        return prvsPrtlConfId;
    }

    /**
     * Define el valor de la propiedad prvsPrtlConfId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrvsPrtlConfId(String value) {
        this.prvsPrtlConfId = value;
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

}
