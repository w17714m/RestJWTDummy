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
 * <p>Clase Java para SafekeepingPlaceFormat29Choice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SafekeepingPlaceFormat29Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}SafekeepingPlaceTypeAndText8"/>
 *         &lt;element name="Ctry" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}CountryCode"/>
 *         &lt;element name="TpAndId" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}SafekeepingPlaceTypeAndIdentification1"/>
 *         &lt;element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}GenericIdentification78"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SafekeepingPlaceFormat29Choice", propOrder = {
    "id",
    "ctry",
    "tpAndId",
    "prtry"
})
public class SafekeepingPlaceFormat29Choice {

    @XmlElement(name = "Id")
    protected SafekeepingPlaceTypeAndText8 id;
    @XmlElement(name = "Ctry")
    protected String ctry;
    @XmlElement(name = "TpAndId")
    protected SafekeepingPlaceTypeAndIdentification1 tpAndId;
    @XmlElement(name = "Prtry")
    protected GenericIdentification78 prtry;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlaceTypeAndText8 }
     *     
     */
    public SafekeepingPlaceTypeAndText8 getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlaceTypeAndText8 }
     *     
     */
    public void setId(SafekeepingPlaceTypeAndText8 value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad ctry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Define el valor de la propiedad ctry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtry(String value) {
        this.ctry = value;
    }

    /**
     * Obtiene el valor de la propiedad tpAndId.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlaceTypeAndIdentification1 }
     *     
     */
    public SafekeepingPlaceTypeAndIdentification1 getTpAndId() {
        return tpAndId;
    }

    /**
     * Define el valor de la propiedad tpAndId.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlaceTypeAndIdentification1 }
     *     
     */
    public void setTpAndId(SafekeepingPlaceTypeAndIdentification1 value) {
        this.tpAndId = value;
    }

    /**
     * Obtiene el valor de la propiedad prtry.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification78 }
     *     
     */
    public GenericIdentification78 getPrtry() {
        return prtry;
    }

    /**
     * Define el valor de la propiedad prtry.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification78 }
     *     
     */
    public void setPrtry(GenericIdentification78 value) {
        this.prtry = value;
    }

}
