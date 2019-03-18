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
 * <p>Clase Java para Linkages54 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Linkages54">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrcgPos" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}ProcessingPosition7Choice" minOccurs="0"/>
 *         &lt;element name="MsgNb" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}DocumentNumber5Choice" minOccurs="0"/>
 *         &lt;element name="Ref" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}References41Choice"/>
 *         &lt;element name="LkdQty" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}PairedOrTurnedQuantity3Choice" minOccurs="0"/>
 *         &lt;element name="RefOwnr" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}PartyIdentification127Choice" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Linkages54", propOrder = {
    "prcgPos",
    "msgNb",
    "ref",
    "lkdQty",
    "refOwnr"
})
public class Linkages54 {

    @XmlElement(name = "PrcgPos")
    protected ProcessingPosition7Choice prcgPos;
    @XmlElement(name = "MsgNb")
    protected DocumentNumber5Choice msgNb;
    @XmlElement(name = "Ref", required = true)
    protected References41Choice ref;
    @XmlElement(name = "LkdQty")
    protected PairedOrTurnedQuantity3Choice lkdQty;
    @XmlElement(name = "RefOwnr")
    protected PartyIdentification127Choice refOwnr;

    /**
     * Obtiene el valor de la propiedad prcgPos.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingPosition7Choice }
     *     
     */
    public ProcessingPosition7Choice getPrcgPos() {
        return prcgPos;
    }

    /**
     * Define el valor de la propiedad prcgPos.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingPosition7Choice }
     *     
     */
    public void setPrcgPos(ProcessingPosition7Choice value) {
        this.prcgPos = value;
    }

    /**
     * Obtiene el valor de la propiedad msgNb.
     * 
     * @return
     *     possible object is
     *     {@link DocumentNumber5Choice }
     *     
     */
    public DocumentNumber5Choice getMsgNb() {
        return msgNb;
    }

    /**
     * Define el valor de la propiedad msgNb.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentNumber5Choice }
     *     
     */
    public void setMsgNb(DocumentNumber5Choice value) {
        this.msgNb = value;
    }

    /**
     * Obtiene el valor de la propiedad ref.
     * 
     * @return
     *     possible object is
     *     {@link References41Choice }
     *     
     */
    public References41Choice getRef() {
        return ref;
    }

    /**
     * Define el valor de la propiedad ref.
     * 
     * @param value
     *     allowed object is
     *     {@link References41Choice }
     *     
     */
    public void setRef(References41Choice value) {
        this.ref = value;
    }

    /**
     * Obtiene el valor de la propiedad lkdQty.
     * 
     * @return
     *     possible object is
     *     {@link PairedOrTurnedQuantity3Choice }
     *     
     */
    public PairedOrTurnedQuantity3Choice getLkdQty() {
        return lkdQty;
    }

    /**
     * Define el valor de la propiedad lkdQty.
     * 
     * @param value
     *     allowed object is
     *     {@link PairedOrTurnedQuantity3Choice }
     *     
     */
    public void setLkdQty(PairedOrTurnedQuantity3Choice value) {
        this.lkdQty = value;
    }

    /**
     * Obtiene el valor de la propiedad refOwnr.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification127Choice }
     *     
     */
    public PartyIdentification127Choice getRefOwnr() {
        return refOwnr;
    }

    /**
     * Define el valor de la propiedad refOwnr.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification127Choice }
     *     
     */
    public void setRefOwnr(PartyIdentification127Choice value) {
        this.refOwnr = value;
    }

}
