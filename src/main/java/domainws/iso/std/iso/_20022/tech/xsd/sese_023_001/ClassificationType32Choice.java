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
 * <p>Clase Java para ClassificationType32Choice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ClassificationType32Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="ClssfctnFinInstrm" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}CFIOct2015Identifier"/>
 *         &lt;element name="AltrnClssfctn" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}GenericIdentification36"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassificationType32Choice", propOrder = {
    "clssfctnFinInstrm",
    "altrnClssfctn"
})
public class ClassificationType32Choice {

    @XmlElement(name = "ClssfctnFinInstrm")
    protected String clssfctnFinInstrm;
    @XmlElement(name = "AltrnClssfctn")
    protected GenericIdentification36 altrnClssfctn;

    /**
     * Obtiene el valor de la propiedad clssfctnFinInstrm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClssfctnFinInstrm() {
        return clssfctnFinInstrm;
    }

    /**
     * Define el valor de la propiedad clssfctnFinInstrm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClssfctnFinInstrm(String value) {
        this.clssfctnFinInstrm = value;
    }

    /**
     * Obtiene el valor de la propiedad altrnClssfctn.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification36 }
     *     
     */
    public GenericIdentification36 getAltrnClssfctn() {
        return altrnClssfctn;
    }

    /**
     * Define el valor de la propiedad altrnClssfctn.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification36 }
     *     
     */
    public void setAltrnClssfctn(GenericIdentification36 value) {
        this.altrnClssfctn = value;
    }

}
