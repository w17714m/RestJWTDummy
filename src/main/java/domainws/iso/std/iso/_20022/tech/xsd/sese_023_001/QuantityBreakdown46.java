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
 * <p>Clase Java para QuantityBreakdown46 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="QuantityBreakdown46">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LotNb" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}GenericIdentification37" minOccurs="0"/>
 *         &lt;element name="LotQty" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}FinancialInstrumentQuantity1Choice" minOccurs="0"/>
 *         &lt;element name="LotDtTm" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}DateAndDateTime2Choice" minOccurs="0"/>
 *         &lt;element name="LotPric" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}Price7" minOccurs="0"/>
 *         &lt;element name="TpOfPric" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}TypeOfPrice29Choice" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantityBreakdown46", propOrder = {
    "lotNb",
    "lotQty",
    "lotDtTm",
    "lotPric",
    "tpOfPric"
})
public class QuantityBreakdown46 {

    @XmlElement(name = "LotNb")
    protected GenericIdentification37 lotNb;
    @XmlElement(name = "LotQty")
    protected FinancialInstrumentQuantity1Choice lotQty;
    @XmlElement(name = "LotDtTm")
    protected DateAndDateTime2Choice lotDtTm;
    @XmlElement(name = "LotPric")
    protected Price7 lotPric;
    @XmlElement(name = "TpOfPric")
    protected TypeOfPrice29Choice tpOfPric;

    /**
     * Obtiene el valor de la propiedad lotNb.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification37 }
     *     
     */
    public GenericIdentification37 getLotNb() {
        return lotNb;
    }

    /**
     * Define el valor de la propiedad lotNb.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification37 }
     *     
     */
    public void setLotNb(GenericIdentification37 value) {
        this.lotNb = value;
    }

    /**
     * Obtiene el valor de la propiedad lotQty.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getLotQty() {
        return lotQty;
    }

    /**
     * Define el valor de la propiedad lotQty.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public void setLotQty(FinancialInstrumentQuantity1Choice value) {
        this.lotQty = value;
    }

    /**
     * Obtiene el valor de la propiedad lotDtTm.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getLotDtTm() {
        return lotDtTm;
    }

    /**
     * Define el valor de la propiedad lotDtTm.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setLotDtTm(DateAndDateTime2Choice value) {
        this.lotDtTm = value;
    }

    /**
     * Obtiene el valor de la propiedad lotPric.
     * 
     * @return
     *     possible object is
     *     {@link Price7 }
     *     
     */
    public Price7 getLotPric() {
        return lotPric;
    }

    /**
     * Define el valor de la propiedad lotPric.
     * 
     * @param value
     *     allowed object is
     *     {@link Price7 }
     *     
     */
    public void setLotPric(Price7 value) {
        this.lotPric = value;
    }

    /**
     * Obtiene el valor de la propiedad tpOfPric.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfPrice29Choice }
     *     
     */
    public TypeOfPrice29Choice getTpOfPric() {
        return tpOfPric;
    }

    /**
     * Define el valor de la propiedad tpOfPric.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfPrice29Choice }
     *     
     */
    public void setTpOfPric(TypeOfPrice29Choice value) {
        this.tpOfPric = value;
    }

}
