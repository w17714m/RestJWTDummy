//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.02.26 a las 05:19:56 PM COT 
//


package iso.std.iso._20022.tech.xsd.sese_024_001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para UnmatchedReason15 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="UnmatchedReason15">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Cd" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}UnmatchedReason21Choice"/>
 *         &lt;element name="AddtlRsnInf" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}Max210Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnmatchedReason15", propOrder = {
    "cd",
    "addtlRsnInf"
})
public class UnmatchedReason15 {

    @XmlElement(name = "Cd", required = true)
    protected UnmatchedReason21Choice cd;
    @XmlElement(name = "AddtlRsnInf")
    protected String addtlRsnInf;

    /**
     * Obtiene el valor de la propiedad cd.
     * 
     * @return
     *     possible object is
     *     {@link UnmatchedReason21Choice }
     *     
     */
    public UnmatchedReason21Choice getCd() {
        return cd;
    }

    /**
     * Define el valor de la propiedad cd.
     * 
     * @param value
     *     allowed object is
     *     {@link UnmatchedReason21Choice }
     *     
     */
    public void setCd(UnmatchedReason21Choice value) {
        this.cd = value;
    }

    /**
     * Obtiene el valor de la propiedad addtlRsnInf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlRsnInf() {
        return addtlRsnInf;
    }

    /**
     * Define el valor de la propiedad addtlRsnInf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlRsnInf(String value) {
        this.addtlRsnInf = value;
    }

}
