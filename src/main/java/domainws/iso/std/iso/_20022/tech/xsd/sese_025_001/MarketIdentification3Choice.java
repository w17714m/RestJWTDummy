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
 * <p>Clase Java para MarketIdentification3Choice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MarketIdentification3Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="MktIdrCd" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}MICIdentifier"/>
 *         &lt;element name="Desc" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}Max35Text"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketIdentification3Choice", propOrder = {
    "mktIdrCd",
    "desc"
})
public class MarketIdentification3Choice {

    @XmlElement(name = "MktIdrCd")
    protected String mktIdrCd;
    @XmlElement(name = "Desc")
    protected String desc;

    /**
     * Obtiene el valor de la propiedad mktIdrCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMktIdrCd() {
        return mktIdrCd;
    }

    /**
     * Define el valor de la propiedad mktIdrCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMktIdrCd(String value) {
        this.mktIdrCd = value;
    }

    /**
     * Obtiene el valor de la propiedad desc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Define el valor de la propiedad desc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

}
