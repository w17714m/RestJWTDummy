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
 * <p>Clase Java para StandingSettlementInstruction16 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="StandingSettlementInstruction16">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SttlmStgInstrDB" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}SettlementStandingInstructionDatabase4Choice"/>
 *         &lt;element name="CtrPty" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}Counterparty13Choice"/>
 *         &lt;element name="Vndr" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}PartyIdentification136" minOccurs="0"/>
 *         &lt;element name="OthrDlvrgSttlmPties" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}SettlementParties76" minOccurs="0"/>
 *         &lt;element name="OthrRcvgSttlmPties" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}SettlementParties76" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandingSettlementInstruction16", propOrder = {
    "sttlmStgInstrDB",
    "ctrPty",
    "vndr",
    "othrDlvrgSttlmPties",
    "othrRcvgSttlmPties"
})
public class StandingSettlementInstruction16 {

    @XmlElement(name = "SttlmStgInstrDB", required = true)
    protected SettlementStandingInstructionDatabase4Choice sttlmStgInstrDB;
    @XmlElement(name = "CtrPty", required = true)
    protected Counterparty13Choice ctrPty;
    @XmlElement(name = "Vndr")
    protected PartyIdentification136 vndr;
    @XmlElement(name = "OthrDlvrgSttlmPties")
    protected SettlementParties76 othrDlvrgSttlmPties;
    @XmlElement(name = "OthrRcvgSttlmPties")
    protected SettlementParties76 othrRcvgSttlmPties;

    /**
     * Obtiene el valor de la propiedad sttlmStgInstrDB.
     * 
     * @return
     *     possible object is
     *     {@link SettlementStandingInstructionDatabase4Choice }
     *     
     */
    public SettlementStandingInstructionDatabase4Choice getSttlmStgInstrDB() {
        return sttlmStgInstrDB;
    }

    /**
     * Define el valor de la propiedad sttlmStgInstrDB.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementStandingInstructionDatabase4Choice }
     *     
     */
    public void setSttlmStgInstrDB(SettlementStandingInstructionDatabase4Choice value) {
        this.sttlmStgInstrDB = value;
    }

    /**
     * Obtiene el valor de la propiedad ctrPty.
     * 
     * @return
     *     possible object is
     *     {@link Counterparty13Choice }
     *     
     */
    public Counterparty13Choice getCtrPty() {
        return ctrPty;
    }

    /**
     * Define el valor de la propiedad ctrPty.
     * 
     * @param value
     *     allowed object is
     *     {@link Counterparty13Choice }
     *     
     */
    public void setCtrPty(Counterparty13Choice value) {
        this.ctrPty = value;
    }

    /**
     * Obtiene el valor de la propiedad vndr.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification136 }
     *     
     */
    public PartyIdentification136 getVndr() {
        return vndr;
    }

    /**
     * Define el valor de la propiedad vndr.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification136 }
     *     
     */
    public void setVndr(PartyIdentification136 value) {
        this.vndr = value;
    }

    /**
     * Obtiene el valor de la propiedad othrDlvrgSttlmPties.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties76 }
     *     
     */
    public SettlementParties76 getOthrDlvrgSttlmPties() {
        return othrDlvrgSttlmPties;
    }

    /**
     * Define el valor de la propiedad othrDlvrgSttlmPties.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties76 }
     *     
     */
    public void setOthrDlvrgSttlmPties(SettlementParties76 value) {
        this.othrDlvrgSttlmPties = value;
    }

    /**
     * Obtiene el valor de la propiedad othrRcvgSttlmPties.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties76 }
     *     
     */
    public SettlementParties76 getOthrRcvgSttlmPties() {
        return othrRcvgSttlmPties;
    }

    /**
     * Define el valor de la propiedad othrRcvgSttlmPties.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties76 }
     *     
     */
    public void setOthrRcvgSttlmPties(SettlementParties76 value) {
        this.othrRcvgSttlmPties = value;
    }

}
