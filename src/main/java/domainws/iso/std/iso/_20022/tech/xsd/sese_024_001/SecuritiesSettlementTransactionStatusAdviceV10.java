//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.02.26 a las 05:19:56 PM COT 
//


package iso.std.iso._20022.tech.xsd.sese_024_001;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SecuritiesSettlementTransactionStatusAdviceV10 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SecuritiesSettlementTransactionStatusAdviceV10">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}TransactionIdentifications31"/>
 *         &lt;element name="Lnkgs" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}Linkages41" minOccurs="0"/>
 *         &lt;element name="PrcgSts" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}ProcessingStatus74Choice" minOccurs="0"/>
 *         &lt;element name="IfrrdMtchgSts" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}MatchingStatus24Choice" minOccurs="0"/>
 *         &lt;element name="MtchgSts" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}MatchingStatus24Choice" minOccurs="0"/>
 *         &lt;element name="SttlmSts" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}SettlementStatus17Choice" minOccurs="0"/>
 *         &lt;element name="TxDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}TransactionDetails113" minOccurs="0"/>
 *         &lt;element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesSettlementTransactionStatusAdviceV10", propOrder = {
    "txId",
    "lnkgs",
    "prcgSts",
    "ifrrdMtchgSts",
    "mtchgSts",
    "sttlmSts",
    "txDtls",
    "splmtryData"
})
public class SecuritiesSettlementTransactionStatusAdviceV10 {

    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentifications31 txId;
    @XmlElement(name = "Lnkgs")
    protected Linkages41 lnkgs;
    @XmlElement(name = "PrcgSts")
    protected ProcessingStatus74Choice prcgSts;
    @XmlElement(name = "IfrrdMtchgSts")
    protected MatchingStatus24Choice ifrrdMtchgSts;
    @XmlElement(name = "MtchgSts")
    protected MatchingStatus24Choice mtchgSts;
    @XmlElement(name = "SttlmSts")
    protected SettlementStatus17Choice sttlmSts;
    @XmlElement(name = "TxDtls")
    protected TransactionDetails113 txDtls;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Obtiene el valor de la propiedad txId.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifications31 }
     *     
     */
    public TransactionIdentifications31 getTxId() {
        return txId;
    }

    /**
     * Define el valor de la propiedad txId.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifications31 }
     *     
     */
    public void setTxId(TransactionIdentifications31 value) {
        this.txId = value;
    }

    /**
     * Obtiene el valor de la propiedad lnkgs.
     * 
     * @return
     *     possible object is
     *     {@link Linkages41 }
     *     
     */
    public Linkages41 getLnkgs() {
        return lnkgs;
    }

    /**
     * Define el valor de la propiedad lnkgs.
     * 
     * @param value
     *     allowed object is
     *     {@link Linkages41 }
     *     
     */
    public void setLnkgs(Linkages41 value) {
        this.lnkgs = value;
    }

    /**
     * Obtiene el valor de la propiedad prcgSts.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingStatus74Choice }
     *     
     */
    public ProcessingStatus74Choice getPrcgSts() {
        return prcgSts;
    }

    /**
     * Define el valor de la propiedad prcgSts.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingStatus74Choice }
     *     
     */
    public void setPrcgSts(ProcessingStatus74Choice value) {
        this.prcgSts = value;
    }

    /**
     * Obtiene el valor de la propiedad ifrrdMtchgSts.
     * 
     * @return
     *     possible object is
     *     {@link MatchingStatus24Choice }
     *     
     */
    public MatchingStatus24Choice getIfrrdMtchgSts() {
        return ifrrdMtchgSts;
    }

    /**
     * Define el valor de la propiedad ifrrdMtchgSts.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingStatus24Choice }
     *     
     */
    public void setIfrrdMtchgSts(MatchingStatus24Choice value) {
        this.ifrrdMtchgSts = value;
    }

    /**
     * Obtiene el valor de la propiedad mtchgSts.
     * 
     * @return
     *     possible object is
     *     {@link MatchingStatus24Choice }
     *     
     */
    public MatchingStatus24Choice getMtchgSts() {
        return mtchgSts;
    }

    /**
     * Define el valor de la propiedad mtchgSts.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingStatus24Choice }
     *     
     */
    public void setMtchgSts(MatchingStatus24Choice value) {
        this.mtchgSts = value;
    }

    /**
     * Obtiene el valor de la propiedad sttlmSts.
     * 
     * @return
     *     possible object is
     *     {@link SettlementStatus17Choice }
     *     
     */
    public SettlementStatus17Choice getSttlmSts() {
        return sttlmSts;
    }

    /**
     * Define el valor de la propiedad sttlmSts.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementStatus17Choice }
     *     
     */
    public void setSttlmSts(SettlementStatus17Choice value) {
        this.sttlmSts = value;
    }

    /**
     * Obtiene el valor de la propiedad txDtls.
     * 
     * @return
     *     possible object is
     *     {@link TransactionDetails113 }
     *     
     */
    public TransactionDetails113 getTxDtls() {
        return txDtls;
    }

    /**
     * Define el valor de la propiedad txDtls.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionDetails113 }
     *     
     */
    public void setTxDtls(TransactionDetails113 value) {
        this.txDtls = value;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
    }

}
