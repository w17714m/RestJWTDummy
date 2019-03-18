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
 * <p>Clase Java para TotalNumber1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TotalNumber1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurInstrNb" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}Exact3NumericText"/>
 *         &lt;element name="TtlOfLkdInstrs" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}Exact3NumericText"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalNumber1", propOrder = {
    "curInstrNb",
    "ttlOfLkdInstrs"
})
public class TotalNumber1 {

    @XmlElement(name = "CurInstrNb", required = true)
    protected String curInstrNb;
    @XmlElement(name = "TtlOfLkdInstrs", required = true)
    protected String ttlOfLkdInstrs;

    /**
     * Obtiene el valor de la propiedad curInstrNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurInstrNb() {
        return curInstrNb;
    }

    /**
     * Define el valor de la propiedad curInstrNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurInstrNb(String value) {
        this.curInstrNb = value;
    }

    /**
     * Obtiene el valor de la propiedad ttlOfLkdInstrs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtlOfLkdInstrs() {
        return ttlOfLkdInstrs;
    }

    /**
     * Define el valor de la propiedad ttlOfLkdInstrs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTtlOfLkdInstrs(String value) {
        this.ttlOfLkdInstrs = value;
    }

}
