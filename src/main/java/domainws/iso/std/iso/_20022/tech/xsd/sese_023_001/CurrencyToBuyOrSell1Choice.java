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
 * <p>Clase Java para CurrencyToBuyOrSell1Choice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CurrencyToBuyOrSell1Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="CcyToBuy" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}ActiveCurrencyCode"/>
 *         &lt;element name="CcyToSell" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}ActiveCurrencyCode"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyToBuyOrSell1Choice", propOrder = {
    "ccyToBuy",
    "ccyToSell"
})
public class CurrencyToBuyOrSell1Choice {

    @XmlElement(name = "CcyToBuy")
    protected String ccyToBuy;
    @XmlElement(name = "CcyToSell")
    protected String ccyToSell;

    /**
     * Obtiene el valor de la propiedad ccyToBuy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcyToBuy() {
        return ccyToBuy;
    }

    /**
     * Define el valor de la propiedad ccyToBuy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcyToBuy(String value) {
        this.ccyToBuy = value;
    }

    /**
     * Obtiene el valor de la propiedad ccyToSell.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcyToSell() {
        return ccyToSell;
    }

    /**
     * Define el valor de la propiedad ccyToSell.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcyToSell(String value) {
        this.ccyToSell = value;
    }

}
