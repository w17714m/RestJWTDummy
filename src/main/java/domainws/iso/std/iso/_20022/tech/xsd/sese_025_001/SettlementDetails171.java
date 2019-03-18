//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.02.26 a las 05:19:56 PM COT 
//


package iso.std.iso._20022.tech.xsd.sese_025_001;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SettlementDetails171 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SettlementDetails171">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Prty" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}PriorityNumeric4Choice" minOccurs="0"/>
 *         &lt;element name="SctiesTxTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}SecuritiesTransactionType43Choice"/>
 *         &lt;element name="SttlmTxCond" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}SettlementTransactionCondition16Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PrtlSttlmInd" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}SettlementTransactionCondition5Code" minOccurs="0"/>
 *         &lt;element name="BnfclOwnrsh" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}BeneficialOwnership4Choice" minOccurs="0"/>
 *         &lt;element name="BlckTrad" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}BlockTrade4Choice" minOccurs="0"/>
 *         &lt;element name="CCPElgblty" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}CentralCounterPartyEligibility4Choice" minOccurs="0"/>
 *         &lt;element name="CshClrSys" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}CashSettlementSystem4Choice" minOccurs="0"/>
 *         &lt;element name="XpsrTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}ExposureType16Choice" minOccurs="0"/>
 *         &lt;element name="MktClntSd" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}MarketClientSide6Choice" minOccurs="0"/>
 *         &lt;element name="NetgElgblty" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}NettingEligibility4Choice" minOccurs="0"/>
 *         &lt;element name="Regn" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}Registration9Choice" minOccurs="0"/>
 *         &lt;element name="RpTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}RepurchaseType22Choice" minOccurs="0"/>
 *         &lt;element name="LglRstrctns" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}Restriction5Choice" minOccurs="0"/>
 *         &lt;element name="SctiesRTGS" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}SecuritiesRTGS4Choice" minOccurs="0"/>
 *         &lt;element name="SttlgCpcty" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}SettlingCapacity7Choice" minOccurs="0"/>
 *         &lt;element name="SttlmSysMtd" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}SettlementSystemMethod4Choice" minOccurs="0"/>
 *         &lt;element name="TaxCpcty" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}TaxCapacityParty4Choice" minOccurs="0"/>
 *         &lt;element name="StmpDtyTaxBsis" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}GenericIdentification30" minOccurs="0"/>
 *         &lt;element name="AutomtcBrrwg" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}AutomaticBorrowing6Choice" minOccurs="0"/>
 *         &lt;element name="LttrOfGrnt" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}LetterOfGuarantee4Choice" minOccurs="0"/>
 *         &lt;element name="ElgblForColl" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}YesNoIndicator" minOccurs="0"/>
 *         &lt;element name="SctiesSubBalTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}GenericIdentification30" minOccurs="0"/>
 *         &lt;element name="CshSubBalTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}GenericIdentification30" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementDetails171", propOrder = {
    "prty",
    "sctiesTxTp",
    "sttlmTxCond",
    "prtlSttlmInd",
    "bnfclOwnrsh",
    "blckTrad",
    "ccpElgblty",
    "cshClrSys",
    "xpsrTp",
    "mktClntSd",
    "netgElgblty",
    "regn",
    "rpTp",
    "lglRstrctns",
    "sctiesRTGS",
    "sttlgCpcty",
    "sttlmSysMtd",
    "taxCpcty",
    "stmpDtyTaxBsis",
    "automtcBrrwg",
    "lttrOfGrnt",
    "elgblForColl",
    "sctiesSubBalTp",
    "cshSubBalTp"
})
public class SettlementDetails171 {

    @XmlElement(name = "Prty")
    protected PriorityNumeric4Choice prty;
    @XmlElement(name = "SctiesTxTp", required = true)
    protected SecuritiesTransactionType43Choice sctiesTxTp;
    @XmlElement(name = "SttlmTxCond")
    protected List<SettlementTransactionCondition16Choice> sttlmTxCond;
    @XmlElement(name = "PrtlSttlmInd")
    protected SettlementTransactionCondition5Code prtlSttlmInd;
    @XmlElement(name = "BnfclOwnrsh")
    protected BeneficialOwnership4Choice bnfclOwnrsh;
    @XmlElement(name = "BlckTrad")
    protected BlockTrade4Choice blckTrad;
    @XmlElement(name = "CCPElgblty")
    protected CentralCounterPartyEligibility4Choice ccpElgblty;
    @XmlElement(name = "CshClrSys")
    protected CashSettlementSystem4Choice cshClrSys;
    @XmlElement(name = "XpsrTp")
    protected ExposureType16Choice xpsrTp;
    @XmlElement(name = "MktClntSd")
    protected MarketClientSide6Choice mktClntSd;
    @XmlElement(name = "NetgElgblty")
    protected NettingEligibility4Choice netgElgblty;
    @XmlElement(name = "Regn")
    protected Registration9Choice regn;
    @XmlElement(name = "RpTp")
    protected RepurchaseType22Choice rpTp;
    @XmlElement(name = "LglRstrctns")
    protected Restriction5Choice lglRstrctns;
    @XmlElement(name = "SctiesRTGS")
    protected SecuritiesRTGS4Choice sctiesRTGS;
    @XmlElement(name = "SttlgCpcty")
    protected SettlingCapacity7Choice sttlgCpcty;
    @XmlElement(name = "SttlmSysMtd")
    protected SettlementSystemMethod4Choice sttlmSysMtd;
    @XmlElement(name = "TaxCpcty")
    protected TaxCapacityParty4Choice taxCpcty;
    @XmlElement(name = "StmpDtyTaxBsis")
    protected GenericIdentification30 stmpDtyTaxBsis;
    @XmlElement(name = "AutomtcBrrwg")
    protected AutomaticBorrowing6Choice automtcBrrwg;
    @XmlElement(name = "LttrOfGrnt")
    protected LetterOfGuarantee4Choice lttrOfGrnt;
    @XmlElement(name = "ElgblForColl")
    protected Boolean elgblForColl;
    @XmlElement(name = "SctiesSubBalTp")
    protected GenericIdentification30 sctiesSubBalTp;
    @XmlElement(name = "CshSubBalTp")
    protected GenericIdentification30 cshSubBalTp;

    /**
     * Obtiene el valor de la propiedad prty.
     * 
     * @return
     *     possible object is
     *     {@link PriorityNumeric4Choice }
     *     
     */
    public PriorityNumeric4Choice getPrty() {
        return prty;
    }

    /**
     * Define el valor de la propiedad prty.
     * 
     * @param value
     *     allowed object is
     *     {@link PriorityNumeric4Choice }
     *     
     */
    public void setPrty(PriorityNumeric4Choice value) {
        this.prty = value;
    }

    /**
     * Obtiene el valor de la propiedad sctiesTxTp.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionType43Choice }
     *     
     */
    public SecuritiesTransactionType43Choice getSctiesTxTp() {
        return sctiesTxTp;
    }

    /**
     * Define el valor de la propiedad sctiesTxTp.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionType43Choice }
     *     
     */
    public void setSctiesTxTp(SecuritiesTransactionType43Choice value) {
        this.sctiesTxTp = value;
    }

    /**
     * Gets the value of the sttlmTxCond property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sttlmTxCond property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSttlmTxCond().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlementTransactionCondition16Choice }
     * 
     * 
     */
    public List<SettlementTransactionCondition16Choice> getSttlmTxCond() {
        if (sttlmTxCond == null) {
            sttlmTxCond = new ArrayList<SettlementTransactionCondition16Choice>();
        }
        return this.sttlmTxCond;
    }

    /**
     * Obtiene el valor de la propiedad prtlSttlmInd.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTransactionCondition5Code }
     *     
     */
    public SettlementTransactionCondition5Code getPrtlSttlmInd() {
        return prtlSttlmInd;
    }

    /**
     * Define el valor de la propiedad prtlSttlmInd.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTransactionCondition5Code }
     *     
     */
    public void setPrtlSttlmInd(SettlementTransactionCondition5Code value) {
        this.prtlSttlmInd = value;
    }

    /**
     * Obtiene el valor de la propiedad bnfclOwnrsh.
     * 
     * @return
     *     possible object is
     *     {@link BeneficialOwnership4Choice }
     *     
     */
    public BeneficialOwnership4Choice getBnfclOwnrsh() {
        return bnfclOwnrsh;
    }

    /**
     * Define el valor de la propiedad bnfclOwnrsh.
     * 
     * @param value
     *     allowed object is
     *     {@link BeneficialOwnership4Choice }
     *     
     */
    public void setBnfclOwnrsh(BeneficialOwnership4Choice value) {
        this.bnfclOwnrsh = value;
    }

    /**
     * Obtiene el valor de la propiedad blckTrad.
     * 
     * @return
     *     possible object is
     *     {@link BlockTrade4Choice }
     *     
     */
    public BlockTrade4Choice getBlckTrad() {
        return blckTrad;
    }

    /**
     * Define el valor de la propiedad blckTrad.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockTrade4Choice }
     *     
     */
    public void setBlckTrad(BlockTrade4Choice value) {
        this.blckTrad = value;
    }

    /**
     * Obtiene el valor de la propiedad ccpElgblty.
     * 
     * @return
     *     possible object is
     *     {@link CentralCounterPartyEligibility4Choice }
     *     
     */
    public CentralCounterPartyEligibility4Choice getCCPElgblty() {
        return ccpElgblty;
    }

    /**
     * Define el valor de la propiedad ccpElgblty.
     * 
     * @param value
     *     allowed object is
     *     {@link CentralCounterPartyEligibility4Choice }
     *     
     */
    public void setCCPElgblty(CentralCounterPartyEligibility4Choice value) {
        this.ccpElgblty = value;
    }

    /**
     * Obtiene el valor de la propiedad cshClrSys.
     * 
     * @return
     *     possible object is
     *     {@link CashSettlementSystem4Choice }
     *     
     */
    public CashSettlementSystem4Choice getCshClrSys() {
        return cshClrSys;
    }

    /**
     * Define el valor de la propiedad cshClrSys.
     * 
     * @param value
     *     allowed object is
     *     {@link CashSettlementSystem4Choice }
     *     
     */
    public void setCshClrSys(CashSettlementSystem4Choice value) {
        this.cshClrSys = value;
    }

    /**
     * Obtiene el valor de la propiedad xpsrTp.
     * 
     * @return
     *     possible object is
     *     {@link ExposureType16Choice }
     *     
     */
    public ExposureType16Choice getXpsrTp() {
        return xpsrTp;
    }

    /**
     * Define el valor de la propiedad xpsrTp.
     * 
     * @param value
     *     allowed object is
     *     {@link ExposureType16Choice }
     *     
     */
    public void setXpsrTp(ExposureType16Choice value) {
        this.xpsrTp = value;
    }

    /**
     * Obtiene el valor de la propiedad mktClntSd.
     * 
     * @return
     *     possible object is
     *     {@link MarketClientSide6Choice }
     *     
     */
    public MarketClientSide6Choice getMktClntSd() {
        return mktClntSd;
    }

    /**
     * Define el valor de la propiedad mktClntSd.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketClientSide6Choice }
     *     
     */
    public void setMktClntSd(MarketClientSide6Choice value) {
        this.mktClntSd = value;
    }

    /**
     * Obtiene el valor de la propiedad netgElgblty.
     * 
     * @return
     *     possible object is
     *     {@link NettingEligibility4Choice }
     *     
     */
    public NettingEligibility4Choice getNetgElgblty() {
        return netgElgblty;
    }

    /**
     * Define el valor de la propiedad netgElgblty.
     * 
     * @param value
     *     allowed object is
     *     {@link NettingEligibility4Choice }
     *     
     */
    public void setNetgElgblty(NettingEligibility4Choice value) {
        this.netgElgblty = value;
    }

    /**
     * Obtiene el valor de la propiedad regn.
     * 
     * @return
     *     possible object is
     *     {@link Registration9Choice }
     *     
     */
    public Registration9Choice getRegn() {
        return regn;
    }

    /**
     * Define el valor de la propiedad regn.
     * 
     * @param value
     *     allowed object is
     *     {@link Registration9Choice }
     *     
     */
    public void setRegn(Registration9Choice value) {
        this.regn = value;
    }

    /**
     * Obtiene el valor de la propiedad rpTp.
     * 
     * @return
     *     possible object is
     *     {@link RepurchaseType22Choice }
     *     
     */
    public RepurchaseType22Choice getRpTp() {
        return rpTp;
    }

    /**
     * Define el valor de la propiedad rpTp.
     * 
     * @param value
     *     allowed object is
     *     {@link RepurchaseType22Choice }
     *     
     */
    public void setRpTp(RepurchaseType22Choice value) {
        this.rpTp = value;
    }

    /**
     * Obtiene el valor de la propiedad lglRstrctns.
     * 
     * @return
     *     possible object is
     *     {@link Restriction5Choice }
     *     
     */
    public Restriction5Choice getLglRstrctns() {
        return lglRstrctns;
    }

    /**
     * Define el valor de la propiedad lglRstrctns.
     * 
     * @param value
     *     allowed object is
     *     {@link Restriction5Choice }
     *     
     */
    public void setLglRstrctns(Restriction5Choice value) {
        this.lglRstrctns = value;
    }

    /**
     * Obtiene el valor de la propiedad sctiesRTGS.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesRTGS4Choice }
     *     
     */
    public SecuritiesRTGS4Choice getSctiesRTGS() {
        return sctiesRTGS;
    }

    /**
     * Define el valor de la propiedad sctiesRTGS.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesRTGS4Choice }
     *     
     */
    public void setSctiesRTGS(SecuritiesRTGS4Choice value) {
        this.sctiesRTGS = value;
    }

    /**
     * Obtiene el valor de la propiedad sttlgCpcty.
     * 
     * @return
     *     possible object is
     *     {@link SettlingCapacity7Choice }
     *     
     */
    public SettlingCapacity7Choice getSttlgCpcty() {
        return sttlgCpcty;
    }

    /**
     * Define el valor de la propiedad sttlgCpcty.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlingCapacity7Choice }
     *     
     */
    public void setSttlgCpcty(SettlingCapacity7Choice value) {
        this.sttlgCpcty = value;
    }

    /**
     * Obtiene el valor de la propiedad sttlmSysMtd.
     * 
     * @return
     *     possible object is
     *     {@link SettlementSystemMethod4Choice }
     *     
     */
    public SettlementSystemMethod4Choice getSttlmSysMtd() {
        return sttlmSysMtd;
    }

    /**
     * Define el valor de la propiedad sttlmSysMtd.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementSystemMethod4Choice }
     *     
     */
    public void setSttlmSysMtd(SettlementSystemMethod4Choice value) {
        this.sttlmSysMtd = value;
    }

    /**
     * Obtiene el valor de la propiedad taxCpcty.
     * 
     * @return
     *     possible object is
     *     {@link TaxCapacityParty4Choice }
     *     
     */
    public TaxCapacityParty4Choice getTaxCpcty() {
        return taxCpcty;
    }

    /**
     * Define el valor de la propiedad taxCpcty.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxCapacityParty4Choice }
     *     
     */
    public void setTaxCpcty(TaxCapacityParty4Choice value) {
        this.taxCpcty = value;
    }

    /**
     * Obtiene el valor de la propiedad stmpDtyTaxBsis.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification30 }
     *     
     */
    public GenericIdentification30 getStmpDtyTaxBsis() {
        return stmpDtyTaxBsis;
    }

    /**
     * Define el valor de la propiedad stmpDtyTaxBsis.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification30 }
     *     
     */
    public void setStmpDtyTaxBsis(GenericIdentification30 value) {
        this.stmpDtyTaxBsis = value;
    }

    /**
     * Obtiene el valor de la propiedad automtcBrrwg.
     * 
     * @return
     *     possible object is
     *     {@link AutomaticBorrowing6Choice }
     *     
     */
    public AutomaticBorrowing6Choice getAutomtcBrrwg() {
        return automtcBrrwg;
    }

    /**
     * Define el valor de la propiedad automtcBrrwg.
     * 
     * @param value
     *     allowed object is
     *     {@link AutomaticBorrowing6Choice }
     *     
     */
    public void setAutomtcBrrwg(AutomaticBorrowing6Choice value) {
        this.automtcBrrwg = value;
    }

    /**
     * Obtiene el valor de la propiedad lttrOfGrnt.
     * 
     * @return
     *     possible object is
     *     {@link LetterOfGuarantee4Choice }
     *     
     */
    public LetterOfGuarantee4Choice getLttrOfGrnt() {
        return lttrOfGrnt;
    }

    /**
     * Define el valor de la propiedad lttrOfGrnt.
     * 
     * @param value
     *     allowed object is
     *     {@link LetterOfGuarantee4Choice }
     *     
     */
    public void setLttrOfGrnt(LetterOfGuarantee4Choice value) {
        this.lttrOfGrnt = value;
    }

    /**
     * Obtiene el valor de la propiedad elgblForColl.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isElgblForColl() {
        return elgblForColl;
    }

    /**
     * Define el valor de la propiedad elgblForColl.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setElgblForColl(Boolean value) {
        this.elgblForColl = value;
    }

    /**
     * Obtiene el valor de la propiedad sctiesSubBalTp.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification30 }
     *     
     */
    public GenericIdentification30 getSctiesSubBalTp() {
        return sctiesSubBalTp;
    }

    /**
     * Define el valor de la propiedad sctiesSubBalTp.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification30 }
     *     
     */
    public void setSctiesSubBalTp(GenericIdentification30 value) {
        this.sctiesSubBalTp = value;
    }

    /**
     * Obtiene el valor de la propiedad cshSubBalTp.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification30 }
     *     
     */
    public GenericIdentification30 getCshSubBalTp() {
        return cshSubBalTp;
    }

    /**
     * Define el valor de la propiedad cshSubBalTp.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification30 }
     *     
     */
    public void setCshSubBalTp(GenericIdentification30 value) {
        this.cshSubBalTp = value;
    }

}
