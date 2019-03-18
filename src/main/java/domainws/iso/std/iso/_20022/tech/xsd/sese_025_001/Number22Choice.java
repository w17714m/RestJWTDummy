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
 * <p>Clase Java para Number22Choice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Number22Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Shrt" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}Exact3NumericText"/>
 *         &lt;element name="Lng" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}GenericIdentification1"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Number22Choice", propOrder = {
    "shrt",
    "lng"
})
public class Number22Choice {

    @XmlElement(name = "Shrt")
    protected String shrt;
    @XmlElement(name = "Lng")
    protected GenericIdentification1 lng;

    /**
     * Obtiene el valor de la propiedad shrt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShrt() {
        return shrt;
    }

    /**
     * Define el valor de la propiedad shrt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShrt(String value) {
        this.shrt = value;
    }

    /**
     * Obtiene el valor de la propiedad lng.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification1 }
     *     
     */
    public GenericIdentification1 getLng() {
        return lng;
    }

    /**
     * Define el valor de la propiedad lng.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification1 }
     *     
     */
    public void setLng(GenericIdentification1 value) {
        this.lng = value;
    }

}
