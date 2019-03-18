//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.02.26 a las 05:19:56 PM COT 
//


package iso.std.iso._20022.tech.xsd.sese_024_001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TransactionIdentifications31 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TransactionIdentifications31">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcctOwnrTxId" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}Max35Text"/>
 *         &lt;element name="AcctSvcrTxId" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}Max35Text" minOccurs="0"/>
 *         &lt;element name="MktInfrstrctrTxId" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}Max35Text" minOccurs="0"/>
 *         &lt;element name="PrcrTxId" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}Max35Text" minOccurs="0"/>
 *         &lt;element name="CmonId" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}Max35Text" minOccurs="0"/>
 *         &lt;element name="NetgSvcPrvdrId" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}Max35Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionIdentifications31", propOrder = {
    "acctOwnrTxId",
    "acctSvcrTxId",
    "mktInfrstrctrTxId",
    "prcrTxId",
    "cmonId",
    "netgSvcPrvdrId"
})
public class TransactionIdentifications31 {

    @XmlElement(name = "AcctOwnrTxId", required = true)
    protected String acctOwnrTxId;
    @XmlElement(name = "AcctSvcrTxId")
    protected String acctSvcrTxId;
    @XmlElement(name = "MktInfrstrctrTxId")
    protected String mktInfrstrctrTxId;
    @XmlElement(name = "PrcrTxId")
    protected String prcrTxId;
    @XmlElement(name = "CmonId")
    protected String cmonId;
    @XmlElement(name = "NetgSvcPrvdrId")
    protected String netgSvcPrvdrId;

    /**
     * Obtiene el valor de la propiedad acctOwnrTxId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctOwnrTxId() {
        return acctOwnrTxId;
    }

    /**
     * Define el valor de la propiedad acctOwnrTxId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctOwnrTxId(String value) {
        this.acctOwnrTxId = value;
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
     * Obtiene el valor de la propiedad prcrTxId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrcrTxId() {
        return prcrTxId;
    }

    /**
     * Define el valor de la propiedad prcrTxId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrcrTxId(String value) {
        this.prcrTxId = value;
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
     * Obtiene el valor de la propiedad netgSvcPrvdrId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetgSvcPrvdrId() {
        return netgSvcPrvdrId;
    }

    /**
     * Define el valor de la propiedad netgSvcPrvdrId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetgSvcPrvdrId(String value) {
        this.netgSvcPrvdrId = value;
    }

}
