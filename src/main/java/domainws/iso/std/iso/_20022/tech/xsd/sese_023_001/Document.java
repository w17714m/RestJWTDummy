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
 * <p>Clase Java para Document complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Document">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SctiesSttlmTxInstr" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}SecuritiesSettlementTransactionInstructionV09"/>
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
    "sctiesSttlmTxInstr"
})
public class Document {

    @XmlElement(name = "SctiesSttlmTxInstr", required = true)
    protected SecuritiesSettlementTransactionInstructionV09 sctiesSttlmTxInstr;

    /**
     * Obtiene el valor de la propiedad sctiesSttlmTxInstr.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementTransactionInstructionV09 }
     *     
     */
    public SecuritiesSettlementTransactionInstructionV09 getSctiesSttlmTxInstr() {
        return sctiesSttlmTxInstr;
    }

    /**
     * Define el valor de la propiedad sctiesSttlmTxInstr.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementTransactionInstructionV09 }
     *     
     */
    public void setSctiesSttlmTxInstr(SecuritiesSettlementTransactionInstructionV09 value) {
        this.sctiesSttlmTxInstr = value;
    }

}
