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
 * <p>Clase Java para SettlementParties76 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SettlementParties76">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Dpstry" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}PartyIdentification146" minOccurs="0"/>
 *         &lt;element name="Pty1" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}PartyIdentificationAndAccount168" minOccurs="0"/>
 *         &lt;element name="Pty2" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}PartyIdentificationAndAccount168" minOccurs="0"/>
 *         &lt;element name="Pty3" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}PartyIdentificationAndAccount168" minOccurs="0"/>
 *         &lt;element name="Pty4" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}PartyIdentificationAndAccount168" minOccurs="0"/>
 *         &lt;element name="Pty5" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}PartyIdentificationAndAccount168" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementParties76", propOrder = {
    "dpstry",
    "pty1",
    "pty2",
    "pty3",
    "pty4",
    "pty5"
})
public class SettlementParties76 {

    @XmlElement(name = "Dpstry")
    protected PartyIdentification146 dpstry;
    @XmlElement(name = "Pty1")
    protected PartyIdentificationAndAccount168 pty1;
    @XmlElement(name = "Pty2")
    protected PartyIdentificationAndAccount168 pty2;
    @XmlElement(name = "Pty3")
    protected PartyIdentificationAndAccount168 pty3;
    @XmlElement(name = "Pty4")
    protected PartyIdentificationAndAccount168 pty4;
    @XmlElement(name = "Pty5")
    protected PartyIdentificationAndAccount168 pty5;

    /**
     * Obtiene el valor de la propiedad dpstry.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification146 }
     *     
     */
    public PartyIdentification146 getDpstry() {
        return dpstry;
    }

    /**
     * Define el valor de la propiedad dpstry.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification146 }
     *     
     */
    public void setDpstry(PartyIdentification146 value) {
        this.dpstry = value;
    }

    /**
     * Obtiene el valor de la propiedad pty1.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount168 }
     *     
     */
    public PartyIdentificationAndAccount168 getPty1() {
        return pty1;
    }

    /**
     * Define el valor de la propiedad pty1.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount168 }
     *     
     */
    public void setPty1(PartyIdentificationAndAccount168 value) {
        this.pty1 = value;
    }

    /**
     * Obtiene el valor de la propiedad pty2.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount168 }
     *     
     */
    public PartyIdentificationAndAccount168 getPty2() {
        return pty2;
    }

    /**
     * Define el valor de la propiedad pty2.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount168 }
     *     
     */
    public void setPty2(PartyIdentificationAndAccount168 value) {
        this.pty2 = value;
    }

    /**
     * Obtiene el valor de la propiedad pty3.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount168 }
     *     
     */
    public PartyIdentificationAndAccount168 getPty3() {
        return pty3;
    }

    /**
     * Define el valor de la propiedad pty3.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount168 }
     *     
     */
    public void setPty3(PartyIdentificationAndAccount168 value) {
        this.pty3 = value;
    }

    /**
     * Obtiene el valor de la propiedad pty4.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount168 }
     *     
     */
    public PartyIdentificationAndAccount168 getPty4() {
        return pty4;
    }

    /**
     * Define el valor de la propiedad pty4.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount168 }
     *     
     */
    public void setPty4(PartyIdentificationAndAccount168 value) {
        this.pty4 = value;
    }

    /**
     * Obtiene el valor de la propiedad pty5.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount168 }
     *     
     */
    public PartyIdentificationAndAccount168 getPty5() {
        return pty5;
    }

    /**
     * Define el valor de la propiedad pty5.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount168 }
     *     
     */
    public void setPty5(PartyIdentificationAndAccount168 value) {
        this.pty5 = value;
    }

}
