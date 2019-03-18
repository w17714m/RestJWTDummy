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
 * <p>Clase Java para PartyIdentification133Choice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PartyIdentification133Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="BICFI" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}BICFIDec2014Identifier"/>
 *         &lt;element name="NmAndAdr" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}NameAndAddress5"/>
 *         &lt;element name="PrtryId" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}GenericIdentification36"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification133Choice", propOrder = {
    "bicfi",
    "nmAndAdr",
    "prtryId"
})
public class PartyIdentification133Choice {

    @XmlElement(name = "BICFI")
    protected String bicfi;
    @XmlElement(name = "NmAndAdr")
    protected NameAndAddress5 nmAndAdr;
    @XmlElement(name = "PrtryId")
    protected GenericIdentification36 prtryId;

    /**
     * Obtiene el valor de la propiedad bicfi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBICFI() {
        return bicfi;
    }

    /**
     * Define el valor de la propiedad bicfi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBICFI(String value) {
        this.bicfi = value;
    }

    /**
     * Obtiene el valor de la propiedad nmAndAdr.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddress5 }
     *     
     */
    public NameAndAddress5 getNmAndAdr() {
        return nmAndAdr;
    }

    /**
     * Define el valor de la propiedad nmAndAdr.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddress5 }
     *     
     */
    public void setNmAndAdr(NameAndAddress5 value) {
        this.nmAndAdr = value;
    }

    /**
     * Obtiene el valor de la propiedad prtryId.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification36 }
     *     
     */
    public GenericIdentification36 getPrtryId() {
        return prtryId;
    }

    /**
     * Define el valor de la propiedad prtryId.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification36 }
     *     
     */
    public void setPrtryId(GenericIdentification36 value) {
        this.prtryId = value;
    }

}
