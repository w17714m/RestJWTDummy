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
 * <p>Clase Java para PartyIdentificationAndAccount171 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PartyIdentificationAndAccount171">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}PartyIdentification133Choice"/>
 *         &lt;element name="LEI" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}LEIIdentifier" minOccurs="0"/>
 *         &lt;element name="AltrnId" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}AlternatePartyIdentification7" minOccurs="0"/>
 *         &lt;element name="CshAcct" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}CashAccountIdentification5Choice" minOccurs="0"/>
 *         &lt;element name="ChrgsAcct" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}CashAccountIdentification5Choice" minOccurs="0"/>
 *         &lt;element name="ComssnAcct" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}CashAccountIdentification5Choice" minOccurs="0"/>
 *         &lt;element name="TaxAcct" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}CashAccountIdentification5Choice" minOccurs="0"/>
 *         &lt;element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}PartyTextInformation2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentificationAndAccount171", propOrder = {
    "id",
    "lei",
    "altrnId",
    "cshAcct",
    "chrgsAcct",
    "comssnAcct",
    "taxAcct",
    "addtlInf"
})
public class PartyIdentificationAndAccount171 {

    @XmlElement(name = "Id", required = true)
    protected PartyIdentification133Choice id;
    @XmlElement(name = "LEI")
    protected String lei;
    @XmlElement(name = "AltrnId")
    protected AlternatePartyIdentification7 altrnId;
    @XmlElement(name = "CshAcct")
    protected CashAccountIdentification5Choice cshAcct;
    @XmlElement(name = "ChrgsAcct")
    protected CashAccountIdentification5Choice chrgsAcct;
    @XmlElement(name = "ComssnAcct")
    protected CashAccountIdentification5Choice comssnAcct;
    @XmlElement(name = "TaxAcct")
    protected CashAccountIdentification5Choice taxAcct;
    @XmlElement(name = "AddtlInf")
    protected PartyTextInformation2 addtlInf;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification133Choice }
     *     
     */
    public PartyIdentification133Choice getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification133Choice }
     *     
     */
    public void setId(PartyIdentification133Choice value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad lei.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLEI() {
        return lei;
    }

    /**
     * Define el valor de la propiedad lei.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLEI(String value) {
        this.lei = value;
    }

    /**
     * Obtiene el valor de la propiedad altrnId.
     * 
     * @return
     *     possible object is
     *     {@link AlternatePartyIdentification7 }
     *     
     */
    public AlternatePartyIdentification7 getAltrnId() {
        return altrnId;
    }

    /**
     * Define el valor de la propiedad altrnId.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternatePartyIdentification7 }
     *     
     */
    public void setAltrnId(AlternatePartyIdentification7 value) {
        this.altrnId = value;
    }

    /**
     * Obtiene el valor de la propiedad cshAcct.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountIdentification5Choice }
     *     
     */
    public CashAccountIdentification5Choice getCshAcct() {
        return cshAcct;
    }

    /**
     * Define el valor de la propiedad cshAcct.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountIdentification5Choice }
     *     
     */
    public void setCshAcct(CashAccountIdentification5Choice value) {
        this.cshAcct = value;
    }

    /**
     * Obtiene el valor de la propiedad chrgsAcct.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountIdentification5Choice }
     *     
     */
    public CashAccountIdentification5Choice getChrgsAcct() {
        return chrgsAcct;
    }

    /**
     * Define el valor de la propiedad chrgsAcct.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountIdentification5Choice }
     *     
     */
    public void setChrgsAcct(CashAccountIdentification5Choice value) {
        this.chrgsAcct = value;
    }

    /**
     * Obtiene el valor de la propiedad comssnAcct.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountIdentification5Choice }
     *     
     */
    public CashAccountIdentification5Choice getComssnAcct() {
        return comssnAcct;
    }

    /**
     * Define el valor de la propiedad comssnAcct.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountIdentification5Choice }
     *     
     */
    public void setComssnAcct(CashAccountIdentification5Choice value) {
        this.comssnAcct = value;
    }

    /**
     * Obtiene el valor de la propiedad taxAcct.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountIdentification5Choice }
     *     
     */
    public CashAccountIdentification5Choice getTaxAcct() {
        return taxAcct;
    }

    /**
     * Define el valor de la propiedad taxAcct.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountIdentification5Choice }
     *     
     */
    public void setTaxAcct(CashAccountIdentification5Choice value) {
        this.taxAcct = value;
    }

    /**
     * Obtiene el valor de la propiedad addtlInf.
     * 
     * @return
     *     possible object is
     *     {@link PartyTextInformation2 }
     *     
     */
    public PartyTextInformation2 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Define el valor de la propiedad addtlInf.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyTextInformation2 }
     *     
     */
    public void setAddtlInf(PartyTextInformation2 value) {
        this.addtlInf = value;
    }

}
