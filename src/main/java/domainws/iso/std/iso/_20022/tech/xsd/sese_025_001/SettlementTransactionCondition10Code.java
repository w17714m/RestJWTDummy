//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.02.26 a las 05:19:56 PM COT 
//


package iso.std.iso._20022.tech.xsd.sese_025_001;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SettlementTransactionCondition10Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="SettlementTransactionCondition10Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ADEA"/>
 *     &lt;enumeration value="ASGN"/>
 *     &lt;enumeration value="BUTC"/>
 *     &lt;enumeration value="CLEN"/>
 *     &lt;enumeration value="DLWM"/>
 *     &lt;enumeration value="DIRT"/>
 *     &lt;enumeration value="DRAW"/>
 *     &lt;enumeration value="EXER"/>
 *     &lt;enumeration value="EXPI"/>
 *     &lt;enumeration value="FRCL"/>
 *     &lt;enumeration value="KNOC"/>
 *     &lt;enumeration value="NOMC"/>
 *     &lt;enumeration value="NACT"/>
 *     &lt;enumeration value="PENS"/>
 *     &lt;enumeration value="PHYS"/>
 *     &lt;enumeration value="RHYP"/>
 *     &lt;enumeration value="RPTO"/>
 *     &lt;enumeration value="RESI"/>
 *     &lt;enumeration value="SHOR"/>
 *     &lt;enumeration value="SPDL"/>
 *     &lt;enumeration value="SPST"/>
 *     &lt;enumeration value="TRAN"/>
 *     &lt;enumeration value="TRIP"/>
 *     &lt;enumeration value="UNEX"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SettlementTransactionCondition10Code")
@XmlEnum
public enum SettlementTransactionCondition10Code {

    ADEA,
    ASGN,
    BUTC,
    CLEN,
    DLWM,
    DIRT,
    DRAW,
    EXER,
    EXPI,
    FRCL,
    KNOC,
    NOMC,
    NACT,
    PENS,
    PHYS,
    RHYP,
    RPTO,
    RESI,
    SHOR,
    SPDL,
    SPST,
    TRAN,
    TRIP,
    UNEX;

    public String value() {
        return name();
    }

    public static SettlementTransactionCondition10Code fromValue(String v) {
        return valueOf(v);
    }

}
