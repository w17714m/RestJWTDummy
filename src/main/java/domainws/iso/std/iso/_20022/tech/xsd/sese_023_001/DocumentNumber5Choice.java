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
 * <p>Clase Java para DocumentNumber5Choice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DocumentNumber5Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="ShrtNb" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}Exact3NumericText"/>
 *         &lt;element name="LngNb" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}ISO20022MessageIdentificationText"/>
 *         &lt;element name="PrtryNb" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}GenericIdentification36"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentNumber5Choice", propOrder = {
    "shrtNb",
    "lngNb",
    "prtryNb"
})
public class DocumentNumber5Choice {

    @XmlElement(name = "ShrtNb")
    protected String shrtNb;
    @XmlElement(name = "LngNb")
    protected String lngNb;
    @XmlElement(name = "PrtryNb")
    protected GenericIdentification36 prtryNb;

    /**
     * Obtiene el valor de la propiedad shrtNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShrtNb() {
        return shrtNb;
    }

    /**
     * Define el valor de la propiedad shrtNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShrtNb(String value) {
        this.shrtNb = value;
    }

    /**
     * Obtiene el valor de la propiedad lngNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLngNb() {
        return lngNb;
    }

    /**
     * Define el valor de la propiedad lngNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLngNb(String value) {
        this.lngNb = value;
    }

    /**
     * Obtiene el valor de la propiedad prtryNb.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification36 }
     *     
     */
    public GenericIdentification36 getPrtryNb() {
        return prtryNb;
    }

    /**
     * Define el valor de la propiedad prtryNb.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification36 }
     *     
     */
    public void setPrtryNb(GenericIdentification36 value) {
        this.prtryNb = value;
    }

}
