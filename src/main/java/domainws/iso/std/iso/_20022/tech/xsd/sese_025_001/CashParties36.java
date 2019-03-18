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
 * <p>Clase Java para CashParties36 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CashParties36">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Dbtr" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}PartyIdentificationAndAccount164" minOccurs="0"/>
 *         &lt;element name="DbtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}PartyIdentificationAndAccount171" minOccurs="0"/>
 *         &lt;element name="Cdtr" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}PartyIdentificationAndAccount164" minOccurs="0"/>
 *         &lt;element name="CdtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}PartyIdentificationAndAccount171" minOccurs="0"/>
 *         &lt;element name="Intrmy" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}PartyIdentificationAndAccount171" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashParties36", propOrder = {
    "dbtr",
    "dbtrAgt",
    "cdtr",
    "cdtrAgt",
    "intrmy"
})
public class CashParties36 {

    @XmlElement(name = "Dbtr")
    protected PartyIdentificationAndAccount164 dbtr;
    @XmlElement(name = "DbtrAgt")
    protected PartyIdentificationAndAccount171 dbtrAgt;
    @XmlElement(name = "Cdtr")
    protected PartyIdentificationAndAccount164 cdtr;
    @XmlElement(name = "CdtrAgt")
    protected PartyIdentificationAndAccount171 cdtrAgt;
    @XmlElement(name = "Intrmy")
    protected PartyIdentificationAndAccount171 intrmy;

    /**
     * Obtiene el valor de la propiedad dbtr.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount164 }
     *     
     */
    public PartyIdentificationAndAccount164 getDbtr() {
        return dbtr;
    }

    /**
     * Define el valor de la propiedad dbtr.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount164 }
     *     
     */
    public void setDbtr(PartyIdentificationAndAccount164 value) {
        this.dbtr = value;
    }

    /**
     * Obtiene el valor de la propiedad dbtrAgt.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount171 }
     *     
     */
    public PartyIdentificationAndAccount171 getDbtrAgt() {
        return dbtrAgt;
    }

    /**
     * Define el valor de la propiedad dbtrAgt.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount171 }
     *     
     */
    public void setDbtrAgt(PartyIdentificationAndAccount171 value) {
        this.dbtrAgt = value;
    }

    /**
     * Obtiene el valor de la propiedad cdtr.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount164 }
     *     
     */
    public PartyIdentificationAndAccount164 getCdtr() {
        return cdtr;
    }

    /**
     * Define el valor de la propiedad cdtr.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount164 }
     *     
     */
    public void setCdtr(PartyIdentificationAndAccount164 value) {
        this.cdtr = value;
    }

    /**
     * Obtiene el valor de la propiedad cdtrAgt.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount171 }
     *     
     */
    public PartyIdentificationAndAccount171 getCdtrAgt() {
        return cdtrAgt;
    }

    /**
     * Define el valor de la propiedad cdtrAgt.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount171 }
     *     
     */
    public void setCdtrAgt(PartyIdentificationAndAccount171 value) {
        this.cdtrAgt = value;
    }

    /**
     * Obtiene el valor de la propiedad intrmy.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount171 }
     *     
     */
    public PartyIdentificationAndAccount171 getIntrmy() {
        return intrmy;
    }

    /**
     * Define el valor de la propiedad intrmy.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount171 }
     *     
     */
    public void setIntrmy(PartyIdentificationAndAccount171 value) {
        this.intrmy = value;
    }

}
