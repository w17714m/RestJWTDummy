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
 * <p>Clase Java para PriceType4Choice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PriceType4Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Mkt" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}Price7"/>
 *         &lt;element name="Indctv" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}Price7"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceType4Choice", propOrder = {
    "mkt",
    "indctv"
})
public class PriceType4Choice {

    @XmlElement(name = "Mkt")
    protected Price7 mkt;
    @XmlElement(name = "Indctv")
    protected Price7 indctv;

    /**
     * Obtiene el valor de la propiedad mkt.
     * 
     * @return
     *     possible object is
     *     {@link Price7 }
     *     
     */
    public Price7 getMkt() {
        return mkt;
    }

    /**
     * Define el valor de la propiedad mkt.
     * 
     * @param value
     *     allowed object is
     *     {@link Price7 }
     *     
     */
    public void setMkt(Price7 value) {
        this.mkt = value;
    }

    /**
     * Obtiene el valor de la propiedad indctv.
     * 
     * @return
     *     possible object is
     *     {@link Price7 }
     *     
     */
    public Price7 getIndctv() {
        return indctv;
    }

    /**
     * Define el valor de la propiedad indctv.
     * 
     * @param value
     *     allowed object is
     *     {@link Price7 }
     *     
     */
    public void setIndctv(Price7 value) {
        this.indctv = value;
    }

}
