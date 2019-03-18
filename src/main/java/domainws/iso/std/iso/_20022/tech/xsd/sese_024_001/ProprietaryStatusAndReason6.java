//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.02.26 a las 05:19:56 PM COT 
//


package iso.std.iso._20022.tech.xsd.sese_024_001;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ProprietaryStatusAndReason6 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ProprietaryStatusAndReason6">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrtrySts" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}GenericIdentification30"/>
 *         &lt;element name="PrtryRsn" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}ProprietaryReason4" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProprietaryStatusAndReason6", propOrder = {
    "prtrySts",
    "prtryRsn"
})
public class ProprietaryStatusAndReason6 {

    @XmlElement(name = "PrtrySts", required = true)
    protected GenericIdentification30 prtrySts;
    @XmlElement(name = "PrtryRsn")
    protected List<ProprietaryReason4> prtryRsn;

    /**
     * Obtiene el valor de la propiedad prtrySts.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification30 }
     *     
     */
    public GenericIdentification30 getPrtrySts() {
        return prtrySts;
    }

    /**
     * Define el valor de la propiedad prtrySts.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification30 }
     *     
     */
    public void setPrtrySts(GenericIdentification30 value) {
        this.prtrySts = value;
    }

    /**
     * Gets the value of the prtryRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prtryRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrtryRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProprietaryReason4 }
     * 
     * 
     */
    public List<ProprietaryReason4> getPrtryRsn() {
        if (prtryRsn == null) {
            prtryRsn = new ArrayList<ProprietaryReason4>();
        }
        return this.prtryRsn;
    }

}
