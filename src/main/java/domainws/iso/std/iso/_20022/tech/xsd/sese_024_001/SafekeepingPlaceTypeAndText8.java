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
 * <p>Clase Java para SafekeepingPlaceTypeAndText8 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SafekeepingPlaceTypeAndText8">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SfkpgPlcTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}SafekeepingPlace3Code"/>
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}Max35Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SafekeepingPlaceTypeAndText8", propOrder = {
    "sfkpgPlcTp",
    "id"
})
public class SafekeepingPlaceTypeAndText8 {

    @XmlElement(name = "SfkpgPlcTp", required = true)
    protected SafekeepingPlace3Code sfkpgPlcTp;
    @XmlElement(name = "Id")
    protected String id;

    /**
     * Obtiene el valor de la propiedad sfkpgPlcTp.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlace3Code }
     *     
     */
    public SafekeepingPlace3Code getSfkpgPlcTp() {
        return sfkpgPlcTp;
    }

    /**
     * Define el valor de la propiedad sfkpgPlcTp.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlace3Code }
     *     
     */
    public void setSfkpgPlcTp(SafekeepingPlace3Code value) {
        this.sfkpgPlcTp = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
