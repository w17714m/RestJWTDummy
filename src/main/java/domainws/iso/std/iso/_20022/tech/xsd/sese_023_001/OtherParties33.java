//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.02.26 a las 05:19:56 PM COT 
//


package iso.std.iso._20022.tech.xsd.sese_023_001;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OtherParties33 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OtherParties33">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Invstr" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}PartyIdentificationAndAccount167" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="QlfdFrgnIntrmy" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}PartyIdentificationAndAccount166" minOccurs="0"/>
 *         &lt;element name="StockXchg" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}PartyIdentificationAndAccount165" minOccurs="0"/>
 *         &lt;element name="TradRgltr" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}PartyIdentificationAndAccount165" minOccurs="0"/>
 *         &lt;element name="TrptyAgt" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}PartyIdentificationAndAccount166" minOccurs="0"/>
 *         &lt;element name="Brkr" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}PartyIdentificationAndAccount166" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherParties33", propOrder = {
    "invstr",
    "qlfdFrgnIntrmy",
    "stockXchg",
    "tradRgltr",
    "trptyAgt",
    "brkr"
})
public class OtherParties33 {

    @XmlElement(name = "Invstr")
    protected List<PartyIdentificationAndAccount167> invstr;
    @XmlElement(name = "QlfdFrgnIntrmy")
    protected PartyIdentificationAndAccount166 qlfdFrgnIntrmy;
    @XmlElement(name = "StockXchg")
    protected PartyIdentificationAndAccount165 stockXchg;
    @XmlElement(name = "TradRgltr")
    protected PartyIdentificationAndAccount165 tradRgltr;
    @XmlElement(name = "TrptyAgt")
    protected PartyIdentificationAndAccount166 trptyAgt;
    @XmlElement(name = "Brkr")
    protected PartyIdentificationAndAccount166 brkr;

    /**
     * Gets the value of the invstr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invstr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvstr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentificationAndAccount167 }
     * 
     * 
     */
    public List<PartyIdentificationAndAccount167> getInvstr() {
        if (invstr == null) {
            invstr = new ArrayList<PartyIdentificationAndAccount167>();
        }
        return this.invstr;
    }

    /**
     * Obtiene el valor de la propiedad qlfdFrgnIntrmy.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount166 }
     *     
     */
    public PartyIdentificationAndAccount166 getQlfdFrgnIntrmy() {
        return qlfdFrgnIntrmy;
    }

    /**
     * Define el valor de la propiedad qlfdFrgnIntrmy.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount166 }
     *     
     */
    public void setQlfdFrgnIntrmy(PartyIdentificationAndAccount166 value) {
        this.qlfdFrgnIntrmy = value;
    }

    /**
     * Obtiene el valor de la propiedad stockXchg.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount165 }
     *     
     */
    public PartyIdentificationAndAccount165 getStockXchg() {
        return stockXchg;
    }

    /**
     * Define el valor de la propiedad stockXchg.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount165 }
     *     
     */
    public void setStockXchg(PartyIdentificationAndAccount165 value) {
        this.stockXchg = value;
    }

    /**
     * Obtiene el valor de la propiedad tradRgltr.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount165 }
     *     
     */
    public PartyIdentificationAndAccount165 getTradRgltr() {
        return tradRgltr;
    }

    /**
     * Define el valor de la propiedad tradRgltr.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount165 }
     *     
     */
    public void setTradRgltr(PartyIdentificationAndAccount165 value) {
        this.tradRgltr = value;
    }

    /**
     * Obtiene el valor de la propiedad trptyAgt.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount166 }
     *     
     */
    public PartyIdentificationAndAccount166 getTrptyAgt() {
        return trptyAgt;
    }

    /**
     * Define el valor de la propiedad trptyAgt.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount166 }
     *     
     */
    public void setTrptyAgt(PartyIdentificationAndAccount166 value) {
        this.trptyAgt = value;
    }

    /**
     * Obtiene el valor de la propiedad brkr.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount166 }
     *     
     */
    public PartyIdentificationAndAccount166 getBrkr() {
        return brkr;
    }

    /**
     * Define el valor de la propiedad brkr.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount166 }
     *     
     */
    public void setBrkr(PartyIdentificationAndAccount166 value) {
        this.brkr = value;
    }

}
