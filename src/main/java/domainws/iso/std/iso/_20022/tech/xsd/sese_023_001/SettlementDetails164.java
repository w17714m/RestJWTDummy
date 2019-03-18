//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.02.26 a las 05:19:56 PM COT 
//


package iso.std.iso._20022.tech.xsd.sese_023_001;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SettlementDetails164 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SettlementDetails164">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HldInd" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}HoldIndicator6" minOccurs="0"/>
 *         &lt;element name="Prty" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}PriorityNumeric4Choice" minOccurs="0"/>
 *         &lt;element name="SctiesTxTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}SecuritiesTransactionType47Choice"/>
 *         &lt;element name="SttlmTxCond" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}SettlementTransactionCondition16Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PrtlSttlmInd" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}SettlementTransactionCondition5Code" minOccurs="0"/>
 *         &lt;element name="BnfclOwnrsh" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}BeneficialOwnership4Choice" minOccurs="0"/>
 *         &lt;element name="BlckTrad" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}BlockTrade4Choice" minOccurs="0"/>
 *         &lt;element name="CCPElgblty" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}CentralCounterPartyEligibility4Choice" minOccurs="0"/>
 *         &lt;element name="DlvryRtrRsn" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}DeliveryReturn3Choice" minOccurs="0"/>
 *         &lt;element name="CshClrSys" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}CashSettlementSystem4Choice" minOccurs="0"/>
 *         &lt;element name="XpsrTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}ExposureType16Choice" minOccurs="0"/>
 *         &lt;element name="FxStgInstr" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}FXStandingInstruction4Choice" minOccurs="0"/>
 *         &lt;element name="MktClntSd" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}MarketClientSide6Choice" minOccurs="0"/>
 *         &lt;element name="NetgElgblty" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}NettingEligibility4Choice" minOccurs="0"/>
 *         &lt;element name="Regn" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}Registration9Choice" minOccurs="0"/>
 *         &lt;element name="RpTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}RepurchaseType23Choice" minOccurs="0"/>
 *         &lt;element name="LglRstrctns" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}Restriction5Choice" minOccurs="0"/>
 *         &lt;element name="SctiesRTGS" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}SecuritiesRTGS4Choice" minOccurs="0"/>
 *         &lt;element name="SttlgCpcty" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}SettlingCapacity7Choice" minOccurs="0"/>
 *         &lt;element name="SttlmSysMtd" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}SettlementSystemMethod4Choice" minOccurs="0"/>
 *         &lt;element name="TaxCpcty" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}TaxCapacityParty4Choice" minOccurs="0"/>
 *         &lt;element name="StmpDtyTaxBsis" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}GenericIdentification30" minOccurs="0"/>
 *         &lt;element name="Trckg" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}Tracking4Choice" minOccurs="0"/>
 *         &lt;element name="AutomtcBrrwg" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}AutomaticBorrowing6Choice" minOccurs="0"/>
 *         &lt;element name="LttrOfGrnt" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}LetterOfGuarantee4Choice" minOccurs="0"/>
 *         &lt;element name="RtrLeg" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}YesNoIndicator" minOccurs="0"/>
 *         &lt;element name="ModCxlAllwd" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}ModificationCancellationAllowed4Choice" minOccurs="0"/>
 *         &lt;element name="ElgblForColl" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}YesNoIndicator" minOccurs="0"/>
 *         &lt;element name="DlvrgSctiesSubBalTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}GenericIdentification30" minOccurs="0"/>
 *         &lt;element name="RcvgSctiesSubBalTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}GenericIdentification30" minOccurs="0"/>
 *         &lt;element name="CshSubBalTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.001.09}GenericIdentification30" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementDetails164", propOrder = {
    "hldInd",
    "prty",
    "sctiesTxTp",
    "sttlmTxCond",
    "prtlSttlmInd",
    "bnfclOwnrsh",
    "blckTrad",
    "ccpElgblty",
    "dlvryRtrRsn",
    "cshClrSys",
    "xpsrTp",
    "fxStgInstr",
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
    "trckg",
    "automtcBrrwg",
    "lttrOfGrnt",
    "rtrLeg",
    "modCxlAllwd",
    "elgblForColl",
    "dlvrgSctiesSubBalTp",
    "rcvgSctiesSubBalTp",
    "cshSubBalTp"
})
public class SettlementDetails164 {

    @XmlElement(name = "HldInd")
    protected HoldIndicator6 hldInd;
    @XmlElement(name = "Prty")
    protected PriorityNumeric4Choice prty;
    @XmlElement(name = "SctiesTxTp", required = true)
    protected SecuritiesTransactionType47Choice sctiesTxTp;
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
    @XmlElement(name = "DlvryRtrRsn")
    protected DeliveryReturn3Choice dlvryRtrRsn;
    @XmlElement(name = "CshClrSys")
    protected CashSettlementSystem4Choice cshClrSys;
    @XmlElement(name = "XpsrTp")
    protected ExposureType16Choice xpsrTp;
    @XmlElement(name = "FxStgInstr")
    protected FXStandingInstruction4Choice fxStgInstr;
    @XmlElement(name = "MktClntSd")
    protected MarketClientSide6Choice mktClntSd;
    @XmlElement(name = "NetgElgblty")
    protected NettingEligibility4Choice netgElgblty;
    @XmlElement(name = "Regn")
    protected Registration9Choice regn;
    @XmlElement(name = "RpTp")
    protected RepurchaseType23Choice rpTp;
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
    @XmlElement(name = "Trckg")
    protected Tracking4Choice trckg;
    @XmlElement(name = "AutomtcBrrwg")
    protected AutomaticBorrowing6Choice automtcBrrwg;
    @XmlElement(name = "LttrOfGrnt")
    protected LetterOfGuarantee4Choice lttrOfGrnt;
    @XmlElement(name = "RtrLeg")
    protected Boolean rtrLeg;
    @XmlElement(name = "ModCxlAllwd")
    protected ModificationCancellationAllowed4Choice modCxlAllwd;
    @XmlElement(name = "ElgblForColl")
    protected Boolean elgblForColl;
    @XmlElement(name = "DlvrgSctiesSubBalTp")
    protected GenericIdentification30 dlvrgSctiesSubBalTp;
    @XmlElement(name = "RcvgSctiesSubBalTp")
    protected GenericIdentification30 rcvgSctiesSubBalTp;
    @XmlElement(name = "CshSubBalTp")
    protected GenericIdentification30 cshSubBalTp;

    /**
     * Obtiene el valor de la propiedad hldInd.
     * 
     * @return
     *     possible object is
     *     {@link HoldIndicator6 }
     *     
     */
    public HoldIndicator6 getHldInd() {
        return hldInd;
    }

    /**
     * Define el valor de la propiedad hldInd.
     * 
     * @param value
     *     allowed object is
     *     {@link HoldIndicator6 }
     *     
     */
    public void setHldInd(HoldIndicator6 value) {
        this.hldInd = value;
    }

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
     *     {@link SecuritiesTransactionType47Choice }
     *     
     */
    public SecuritiesTransactionType47Choice getSctiesTxTp() {
        return sctiesTxTp;
    }

    /**
     * Define el valor de la propiedad sctiesTxTp.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionType47Choice }
     *     
     */
    public void setSctiesTxTp(SecuritiesTransactionType47Choice value) {
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
     * Obtiene el valor de la propiedad dlvryRtrRsn.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryReturn3Choice }
     *     
     */
    public DeliveryReturn3Choice getDlvryRtrRsn() {
        return dlvryRtrRsn;
    }

    /**
     * Define el valor de la propiedad dlvryRtrRsn.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryReturn3Choice }
     *     
     */
    public void setDlvryRtrRsn(DeliveryReturn3Choice value) {
        this.dlvryRtrRsn = value;
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
     * Obtiene el valor de la propiedad fxStgInstr.
     * 
     * @return
     *     possible object is
     *     {@link FXStandingInstruction4Choice }
     *     
     */
    public FXStandingInstruction4Choice getFxStgInstr() {
        return fxStgInstr;
    }

    /**
     * Define el valor de la propiedad fxStgInstr.
     * 
     * @param value
     *     allowed object is
     *     {@link FXStandingInstruction4Choice }
     *     
     */
    public void setFxStgInstr(FXStandingInstruction4Choice value) {
        this.fxStgInstr = value;
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
     *     {@link RepurchaseType23Choice }
     *     
     */
    public RepurchaseType23Choice getRpTp() {
        return rpTp;
    }

    /**
     * Define el valor de la propiedad rpTp.
     * 
     * @param value
     *     allowed object is
     *     {@link RepurchaseType23Choice }
     *     
     */
    public void setRpTp(RepurchaseType23Choice value) {
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
     * Obtiene el valor de la propiedad trckg.
     * 
     * @return
     *     possible object is
     *     {@link Tracking4Choice }
     *     
     */
    public Tracking4Choice getTrckg() {
        return trckg;
    }

    /**
     * Define el valor de la propiedad trckg.
     * 
     * @param value
     *     allowed object is
     *     {@link Tracking4Choice }
     *     
     */
    public void setTrckg(Tracking4Choice value) {
        this.trckg = value;
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
     * Obtiene el valor de la propiedad rtrLeg.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRtrLeg() {
        return rtrLeg;
    }

    /**
     * Define el valor de la propiedad rtrLeg.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRtrLeg(Boolean value) {
        this.rtrLeg = value;
    }

    /**
     * Obtiene el valor de la propiedad modCxlAllwd.
     * 
     * @return
     *     possible object is
     *     {@link ModificationCancellationAllowed4Choice }
     *     
     */
    public ModificationCancellationAllowed4Choice getModCxlAllwd() {
        return modCxlAllwd;
    }

    /**
     * Define el valor de la propiedad modCxlAllwd.
     * 
     * @param value
     *     allowed object is
     *     {@link ModificationCancellationAllowed4Choice }
     *     
     */
    public void setModCxlAllwd(ModificationCancellationAllowed4Choice value) {
        this.modCxlAllwd = value;
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
     * Obtiene el valor de la propiedad dlvrgSctiesSubBalTp.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification30 }
     *     
     */
    public GenericIdentification30 getDlvrgSctiesSubBalTp() {
        return dlvrgSctiesSubBalTp;
    }

    /**
     * Define el valor de la propiedad dlvrgSctiesSubBalTp.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification30 }
     *     
     */
    public void setDlvrgSctiesSubBalTp(GenericIdentification30 value) {
        this.dlvrgSctiesSubBalTp = value;
    }

    /**
     * Obtiene el valor de la propiedad rcvgSctiesSubBalTp.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification30 }
     *     
     */
    public GenericIdentification30 getRcvgSctiesSubBalTp() {
        return rcvgSctiesSubBalTp;
    }

    /**
     * Define el valor de la propiedad rcvgSctiesSubBalTp.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification30 }
     *     
     */
    public void setRcvgSctiesSubBalTp(GenericIdentification30 value) {
        this.rcvgSctiesSubBalTp = value;
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
