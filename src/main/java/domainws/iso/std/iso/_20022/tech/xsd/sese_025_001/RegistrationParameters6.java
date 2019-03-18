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
 * <p>Clase Java para RegistrationParameters6 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RegistrationParameters6">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CertfctnId" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}Max35Text" minOccurs="0"/>
 *         &lt;element name="CertfctnDtTm" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}DateAndDateTime2Choice" minOccurs="0"/>
 *         &lt;element name="RegarAcct" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}Max35Text" minOccurs="0"/>
 *         &lt;element name="CertNb" type="{urn:iso:std:iso:20022:tech:xsd:sese.025.001.09}SecuritiesCertificate4" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistrationParameters6", propOrder = {
    "certfctnId",
    "certfctnDtTm",
    "regarAcct",
    "certNb"
})
public class RegistrationParameters6 {

    @XmlElement(name = "CertfctnId")
    protected String certfctnId;
    @XmlElement(name = "CertfctnDtTm")
    protected DateAndDateTime2Choice certfctnDtTm;
    @XmlElement(name = "RegarAcct")
    protected String regarAcct;
    @XmlElement(name = "CertNb")
    protected List<SecuritiesCertificate4> certNb;

    /**
     * Obtiene el valor de la propiedad certfctnId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertfctnId() {
        return certfctnId;
    }

    /**
     * Define el valor de la propiedad certfctnId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertfctnId(String value) {
        this.certfctnId = value;
    }

    /**
     * Obtiene el valor de la propiedad certfctnDtTm.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getCertfctnDtTm() {
        return certfctnDtTm;
    }

    /**
     * Define el valor de la propiedad certfctnDtTm.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setCertfctnDtTm(DateAndDateTime2Choice value) {
        this.certfctnDtTm = value;
    }

    /**
     * Obtiene el valor de la propiedad regarAcct.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegarAcct() {
        return regarAcct;
    }

    /**
     * Define el valor de la propiedad regarAcct.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegarAcct(String value) {
        this.regarAcct = value;
    }

    /**
     * Gets the value of the certNb property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certNb property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertNb().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecuritiesCertificate4 }
     * 
     * 
     */
    public List<SecuritiesCertificate4> getCertNb() {
        if (certNb == null) {
            certNb = new ArrayList<SecuritiesCertificate4>();
        }
        return this.certNb;
    }

}
