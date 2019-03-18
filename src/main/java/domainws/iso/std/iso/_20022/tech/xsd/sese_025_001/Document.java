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
 * <p>Clase Java para Document complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Document">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SctiesSttlmTxConf" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}SecuritiesSettlementTransactionConfirmationV09"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesSttlmTxConf"
})
public class Document {

    @XmlElement(name = "SctiesSttlmTxConf", required = true)
    protected SecuritiesSettlementTransactionConfirmationV09 sctiesSttlmTxConf;

    /**
     * Obtiene el valor de la propiedad sctiesSttlmTxConf.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementTransactionConfirmationV09 }
     *     
     */
    public SecuritiesSettlementTransactionConfirmationV09 getSctiesSttlmTxConf() {
        return sctiesSttlmTxConf;
    }

    /**
     * Define el valor de la propiedad sctiesSttlmTxConf.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementTransactionConfirmationV09 }
     *     
     */
    public void setSctiesSttlmTxConf(SecuritiesSettlementTransactionConfirmationV09 value) {
        this.sctiesSttlmTxConf = value;
    }

}
