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
 * <p>Clase Java para PartyTextInformation1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PartyTextInformation1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DclrtnDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}Max350Text" minOccurs="0"/>
 *         &lt;element name="PtyCtctDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}Max140Text" minOccurs="0"/>
 *         &lt;element name="RegnDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}Max350Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyTextInformation1", propOrder = {
    "dclrtnDtls",
    "ptyCtctDtls",
    "regnDtls"
})
public class PartyTextInformation1 {

    @XmlElement(name = "DclrtnDtls")
    protected String dclrtnDtls;
    @XmlElement(name = "PtyCtctDtls")
    protected String ptyCtctDtls;
    @XmlElement(name = "RegnDtls")
    protected String regnDtls;

    /**
     * Obtiene el valor de la propiedad dclrtnDtls.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDclrtnDtls() {
        return dclrtnDtls;
    }

    /**
     * Define el valor de la propiedad dclrtnDtls.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDclrtnDtls(String value) {
        this.dclrtnDtls = value;
    }

    /**
     * Obtiene el valor de la propiedad ptyCtctDtls.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPtyCtctDtls() {
        return ptyCtctDtls;
    }

    /**
     * Define el valor de la propiedad ptyCtctDtls.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPtyCtctDtls(String value) {
        this.ptyCtctDtls = value;
    }

    /**
     * Obtiene el valor de la propiedad regnDtls.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegnDtls() {
        return regnDtls;
    }

    /**
     * Define el valor de la propiedad regnDtls.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegnDtls(String value) {
        this.regnDtls = value;
    }

}
