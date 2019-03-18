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
 * <p>Clase Java para MatchingStatus24Choice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MatchingStatus24Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Mtchd" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}ProprietaryReason4"/>
 *         &lt;element name="Umtchd" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}UnmatchedStatus16Choice"/>
 *         &lt;element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}ProprietaryStatusAndReason6"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatchingStatus24Choice", propOrder = {
    "mtchd",
    "umtchd",
    "prtry"
})
public class MatchingStatus24Choice {

    @XmlElement(name = "Mtchd")
    protected ProprietaryReason4 mtchd;
    @XmlElement(name = "Umtchd")
    protected UnmatchedStatus16Choice umtchd;
    @XmlElement(name = "Prtry")
    protected ProprietaryStatusAndReason6 prtry;

    /**
     * Obtiene el valor de la propiedad mtchd.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getMtchd() {
        return mtchd;
    }

    /**
     * Define el valor de la propiedad mtchd.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public void setMtchd(ProprietaryReason4 value) {
        this.mtchd = value;
    }

    /**
     * Obtiene el valor de la propiedad umtchd.
     * 
     * @return
     *     possible object is
     *     {@link UnmatchedStatus16Choice }
     *     
     */
    public UnmatchedStatus16Choice getUmtchd() {
        return umtchd;
    }

    /**
     * Define el valor de la propiedad umtchd.
     * 
     * @param value
     *     allowed object is
     *     {@link UnmatchedStatus16Choice }
     *     
     */
    public void setUmtchd(UnmatchedStatus16Choice value) {
        this.umtchd = value;
    }

    /**
     * Obtiene el valor de la propiedad prtry.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryStatusAndReason6 }
     *     
     */
    public ProprietaryStatusAndReason6 getPrtry() {
        return prtry;
    }

    /**
     * Define el valor de la propiedad prtry.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryStatusAndReason6 }
     *     
     */
    public void setPrtry(ProprietaryStatusAndReason6 value) {
        this.prtry = value;
    }

}
