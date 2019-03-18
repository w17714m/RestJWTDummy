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
 * <p>Clase Java para Linkages41 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Linkages41">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrcgPos" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}ProcessingPosition9Choice" minOccurs="0"/>
 *         &lt;element name="SctiesSttlmTxId" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}Max35Text"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Linkages41", propOrder = {
    "prcgPos",
    "sctiesSttlmTxId"
})
public class Linkages41 {

    @XmlElement(name = "PrcgPos")
    protected ProcessingPosition9Choice prcgPos;
    @XmlElement(name = "SctiesSttlmTxId", required = true)
    protected String sctiesSttlmTxId;

    /**
     * Obtiene el valor de la propiedad prcgPos.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingPosition9Choice }
     *     
     */
    public ProcessingPosition9Choice getPrcgPos() {
        return prcgPos;
    }

    /**
     * Define el valor de la propiedad prcgPos.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingPosition9Choice }
     *     
     */
    public void setPrcgPos(ProcessingPosition9Choice value) {
        this.prcgPos = value;
    }

    /**
     * Obtiene el valor de la propiedad sctiesSttlmTxId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSctiesSttlmTxId() {
        return sctiesSttlmTxId;
    }

    /**
     * Define el valor de la propiedad sctiesSttlmTxId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSctiesSttlmTxId(String value) {
        this.sctiesSttlmTxId = value;
    }

}
