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
 * <p>Clase Java para ProcessingStatus74Choice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ProcessingStatus74Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="AckdAccptd" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}AcknowledgedAcceptedStatus21Choice"/>
 *         &lt;element name="PdgPrcg" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}PendingProcessingStatus11Choice"/>
 *         &lt;element name="Rjctd" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}RejectionStatus21Choice"/>
 *         &lt;element name="Rpr" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}RepairStatus12Choice"/>
 *         &lt;element name="Canc" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}CancellationStatus24Choice"/>
 *         &lt;element name="PdgCxl" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}PendingStatus38Choice"/>
 *         &lt;element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}ProprietaryStatusAndReason6"/>
 *         &lt;element name="CxlReqd" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}ProprietaryReason4"/>
 *         &lt;element name="ModReqd" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.10}ProprietaryReason4"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessingStatus74Choice", propOrder = {
    "ackdAccptd",
    "pdgPrcg",
    "rjctd",
    "rpr",
    "canc",
    "pdgCxl",
    "prtry",
    "cxlReqd",
    "modReqd"
})
public class ProcessingStatus74Choice {

    @XmlElement(name = "AckdAccptd")
    protected AcknowledgedAcceptedStatus21Choice ackdAccptd;
    @XmlElement(name = "PdgPrcg")
    protected PendingProcessingStatus11Choice pdgPrcg;
    @XmlElement(name = "Rjctd")
    protected RejectionStatus21Choice rjctd;
    @XmlElement(name = "Rpr")
    protected RepairStatus12Choice rpr;
    @XmlElement(name = "Canc")
    protected CancellationStatus24Choice canc;
    @XmlElement(name = "PdgCxl")
    protected PendingStatus38Choice pdgCxl;
    @XmlElement(name = "Prtry")
    protected ProprietaryStatusAndReason6 prtry;
    @XmlElement(name = "CxlReqd")
    protected ProprietaryReason4 cxlReqd;
    @XmlElement(name = "ModReqd")
    protected ProprietaryReason4 modReqd;

    /**
     * Obtiene el valor de la propiedad ackdAccptd.
     * 
     * @return
     *     possible object is
     *     {@link AcknowledgedAcceptedStatus21Choice }
     *     
     */
    public AcknowledgedAcceptedStatus21Choice getAckdAccptd() {
        return ackdAccptd;
    }

    /**
     * Define el valor de la propiedad ackdAccptd.
     * 
     * @param value
     *     allowed object is
     *     {@link AcknowledgedAcceptedStatus21Choice }
     *     
     */
    public void setAckdAccptd(AcknowledgedAcceptedStatus21Choice value) {
        this.ackdAccptd = value;
    }

    /**
     * Obtiene el valor de la propiedad pdgPrcg.
     * 
     * @return
     *     possible object is
     *     {@link PendingProcessingStatus11Choice }
     *     
     */
    public PendingProcessingStatus11Choice getPdgPrcg() {
        return pdgPrcg;
    }

    /**
     * Define el valor de la propiedad pdgPrcg.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingProcessingStatus11Choice }
     *     
     */
    public void setPdgPrcg(PendingProcessingStatus11Choice value) {
        this.pdgPrcg = value;
    }

    /**
     * Obtiene el valor de la propiedad rjctd.
     * 
     * @return
     *     possible object is
     *     {@link RejectionStatus21Choice }
     *     
     */
    public RejectionStatus21Choice getRjctd() {
        return rjctd;
    }

    /**
     * Define el valor de la propiedad rjctd.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionStatus21Choice }
     *     
     */
    public void setRjctd(RejectionStatus21Choice value) {
        this.rjctd = value;
    }

    /**
     * Obtiene el valor de la propiedad rpr.
     * 
     * @return
     *     possible object is
     *     {@link RepairStatus12Choice }
     *     
     */
    public RepairStatus12Choice getRpr() {
        return rpr;
    }

    /**
     * Define el valor de la propiedad rpr.
     * 
     * @param value
     *     allowed object is
     *     {@link RepairStatus12Choice }
     *     
     */
    public void setRpr(RepairStatus12Choice value) {
        this.rpr = value;
    }

    /**
     * Obtiene el valor de la propiedad canc.
     * 
     * @return
     *     possible object is
     *     {@link CancellationStatus24Choice }
     *     
     */
    public CancellationStatus24Choice getCanc() {
        return canc;
    }

    /**
     * Define el valor de la propiedad canc.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationStatus24Choice }
     *     
     */
    public void setCanc(CancellationStatus24Choice value) {
        this.canc = value;
    }

    /**
     * Obtiene el valor de la propiedad pdgCxl.
     * 
     * @return
     *     possible object is
     *     {@link PendingStatus38Choice }
     *     
     */
    public PendingStatus38Choice getPdgCxl() {
        return pdgCxl;
    }

    /**
     * Define el valor de la propiedad pdgCxl.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingStatus38Choice }
     *     
     */
    public void setPdgCxl(PendingStatus38Choice value) {
        this.pdgCxl = value;
    }

    /**
     * Obtiene el valor de la propiedad prtry.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryStatusAndReason6 }
     *     
     */
    public ProprietaryStatusAndReason6 getPrtry() {
        return prtry;
    }

    /**
     * Define el valor de la propiedad prtry.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryStatusAndReason6 }
     *     
     */
    public void setPrtry(ProprietaryStatusAndReason6 value) {
        this.prtry = value;
    }

    /**
     * Obtiene el valor de la propiedad cxlReqd.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getCxlReqd() {
        return cxlReqd;
    }

    /**
     * Define el valor de la propiedad cxlReqd.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public void setCxlReqd(ProprietaryReason4 value) {
        this.cxlReqd = value;
    }

    /**
     * Obtiene el valor de la propiedad modReqd.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getModReqd() {
        return modReqd;
    }

    /**
     * Define el valor de la propiedad modReqd.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public void setModReqd(ProprietaryReason4 value) {
        this.modReqd = value;
    }

}
