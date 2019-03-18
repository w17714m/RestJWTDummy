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
 * <p>Clase Java para HoldIndicator6 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="HoldIndicator6">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Ind" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}YesNoIndicator"/>
 *         &lt;element name="Rsn" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}RegistrationReason5" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HoldIndicator6", propOrder = {
    "ind",
    "rsn"
})
public class HoldIndicator6 {

    @XmlElement(name = "Ind")
    protected boolean ind;
    @XmlElement(name = "Rsn")
    protected List<RegistrationReason5> rsn;

    /**
     * Obtiene el valor de la propiedad ind.
     * 
     */
    public boolean isInd() {
        return ind;
    }

    /**
     * Define el valor de la propiedad ind.
     * 
     */
    public void setInd(boolean value) {
        this.ind = value;
    }

    /**
     * Gets the value of the rsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegistrationReason5 }
     * 
     * 
     */
    public List<RegistrationReason5> getRsn() {
        if (rsn == null) {
            rsn = new ArrayList<RegistrationReason5>();
        }
        return this.rsn;
    }

}
