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
 * <p>Clase Java para References41Choice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="References41Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="SctiesSttlmTxId" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}Max35Text"/>
 *         &lt;element name="IntraPosMvmntId" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}Max35Text"/>
 *         &lt;element name="IntraBalMvmntId" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}Max35Text"/>
 *         &lt;element name="AcctSvcrTxId" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}Max35Text"/>
 *         &lt;element name="MktInfrstrctrTxId" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}Max35Text"/>
 *         &lt;element name="PoolId" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}Max35Text"/>
 *         &lt;element name="OthrTxId" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}Max35Text"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "References41Choice", propOrder = {
    "sctiesSttlmTxId",
    "intraPosMvmntId",
    "intraBalMvmntId",
    "acctSvcrTxId",
    "mktInfrstrctrTxId",
    "poolId",
    "othrTxId"
})
public class References41Choice {

    @XmlElement(name = "SctiesSttlmTxId")
    protected String sctiesSttlmTxId;
    @XmlElement(name = "IntraPosMvmntId")
    protected String intraPosMvmntId;
    @XmlElement(name = "IntraBalMvmntId")
    protected String intraBalMvmntId;
    @XmlElement(name = "AcctSvcrTxId")
    protected String acctSvcrTxId;
    @XmlElement(name = "MktInfrstrctrTxId")
    protected String mktInfrstrctrTxId;
    @XmlElement(name = "PoolId")
    protected String poolId;
    @XmlElement(name = "OthrTxId")
    protected String othrTxId;

    /**
     * Obtiene el valor de la propiedad sctiesSttlmTxId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSctiesSttlmTxId() {
        return sctiesSttlmTxId;
    }

    /**
     * Define el valor de la propiedad sctiesSttlmTxId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSctiesSttlmTxId(String value) {
        this.sctiesSttlmTxId = value;
    }

    /**
     * Obtiene el valor de la propiedad intraPosMvmntId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntraPosMvmntId() {
        return intraPosMvmntId;
    }

    /**
     * Define el valor de la propiedad intraPosMvmntId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntraPosMvmntId(String value) {
        this.intraPosMvmntId = value;
    }

    /**
     * Obtiene el valor de la propiedad intraBalMvmntId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntraBalMvmntId() {
        return intraBalMvmntId;
    }

    /**
     * Define el valor de la propiedad intraBalMvmntId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntraBalMvmntId(String value) {
        this.intraBalMvmntId = value;
    }

    /**
     * Obtiene el valor de la propiedad acctSvcrTxId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctSvcrTxId() {
        return acctSvcrTxId;
    }

    /**
     * Define el valor de la propiedad acctSvcrTxId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctSvcrTxId(String value) {
        this.acctSvcrTxId = value;
    }

    /**
     * Obtiene el valor de la propiedad mktInfrstrctrTxId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMktInfrstrctrTxId() {
        return mktInfrstrctrTxId;
    }

    /**
     * Define el valor de la propiedad mktInfrstrctrTxId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMktInfrstrctrTxId(String value) {
        this.mktInfrstrctrTxId = value;
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
     * Obtiene el valor de la propiedad othrTxId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrTxId() {
        return othrTxId;
    }

    /**
     * Define el valor de la propiedad othrTxId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrTxId(String value) {
        this.othrTxId = value;
    }

}
