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
 * <p>Clase Java para Counterparty13Choice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Counterparty13Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Sellr" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}PartyIdentificationAndAccount168"/>
 *         &lt;element name="Buyr" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}PartyIdentificationAndAccount168"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Counterparty13Choice", propOrder = {
    "sellr",
    "buyr"
})
public class Counterparty13Choice {

    @XmlElement(name = "Sellr")
    protected PartyIdentificationAndAccount168 sellr;
    @XmlElement(name = "Buyr")
    protected PartyIdentificationAndAccount168 buyr;

    /**
     * Obtiene el valor de la propiedad sellr.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount168 }
     *     
     */
    public PartyIdentificationAndAccount168 getSellr() {
        return sellr;
    }

    /**
     * Define el valor de la propiedad sellr.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount168 }
     *     
     */
    public void setSellr(PartyIdentificationAndAccount168 value) {
        this.sellr = value;
    }

    /**
     * Obtiene el valor de la propiedad buyr.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount168 }
     *     
     */
    public PartyIdentificationAndAccount168 getBuyr() {
        return buyr;
    }

    /**
     * Define el valor de la propiedad buyr.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount168 }
     *     
     */
    public void setBuyr(PartyIdentificationAndAccount168 value) {
        this.buyr = value;
    }

}
