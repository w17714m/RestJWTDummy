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
 * <p>Clase Java para SettlementStatus17Choice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SettlementStatus17Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Pdg" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}PendingStatus37Choice"/>
 *         &lt;element name="Flng" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}FailingStatus10Choice"/>
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
@XmlType(name = "SettlementStatus17Choice", propOrder = {
    "pdg",
    "flng",
    "prtry"
})
public class SettlementStatus17Choice {

    @XmlElement(name = "Pdg")
    protected PendingStatus37Choice pdg;
    @XmlElement(name = "Flng")
    protected FailingStatus10Choice flng;
    @XmlElement(name = "Prtry")
    protected ProprietaryStatusAndReason6 prtry;

    /**
     * Obtiene el valor de la propiedad pdg.
     * 
     * @return
     *     possible object is
     *     {@link PendingStatus37Choice }
     *     
     */
    public PendingStatus37Choice getPdg() {
        return pdg;
    }

    /**
     * Define el valor de la propiedad pdg.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingStatus37Choice }
     *     
     */
    public void setPdg(PendingStatus37Choice value) {
        this.pdg = value;
    }

    /**
     * Obtiene el valor de la propiedad flng.
     * 
     * @return
     *     possible object is
     *     {@link FailingStatus10Choice }
     *     
     */
    public FailingStatus10Choice getFlng() {
        return flng;
    }

    /**
     * Define el valor de la propiedad flng.
     * 
     * @param value
     *     allowed object is
     *     {@link FailingStatus10Choice }
     *     
     */
    public void setFlng(FailingStatus10Choice value) {
        this.flng = value;
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
