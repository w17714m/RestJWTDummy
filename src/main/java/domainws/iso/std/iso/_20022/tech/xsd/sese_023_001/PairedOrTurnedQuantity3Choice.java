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
 * <p>Clase Java para PairedOrTurnedQuantity3Choice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PairedOrTurnedQuantity3Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="PairdOffQty" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}FinancialInstrumentQuantity1Choice" minOccurs="0"/>
 *         &lt;element name="TrndQty" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}FinancialInstrumentQuantity1Choice" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PairedOrTurnedQuantity3Choice", propOrder = {
    "pairdOffQty",
    "trndQty"
})
public class PairedOrTurnedQuantity3Choice {

    @XmlElement(name = "PairdOffQty")
    protected FinancialInstrumentQuantity1Choice pairdOffQty;
    @XmlElement(name = "TrndQty")
    protected FinancialInstrumentQuantity1Choice trndQty;

    /**
     * Obtiene el valor de la propiedad pairdOffQty.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getPairdOffQty() {
        return pairdOffQty;
    }

    /**
     * Define el valor de la propiedad pairdOffQty.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public void setPairdOffQty(FinancialInstrumentQuantity1Choice value) {
        this.pairdOffQty = value;
    }

    /**
     * Obtiene el valor de la propiedad trndQty.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getTrndQty() {
        return trndQty;
    }

    /**
     * Define el valor de la propiedad trndQty.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public void setTrndQty(FinancialInstrumentQuantity1Choice value) {
        this.trndQty = value;
    }

}
