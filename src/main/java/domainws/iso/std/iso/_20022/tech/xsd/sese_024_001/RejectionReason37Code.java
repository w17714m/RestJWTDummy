//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.02.26 a las 05:19:56 PM COT 
//


package iso.std.iso._20022.tech.xsd.sese_024_001;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RejectionReason37Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="RejectionReason37Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SAFE"/>
 *     &lt;enumeration value="DQUA"/>
 *     &lt;enumeration value="ADEA"/>
 *     &lt;enumeration value="DSEC"/>
 *     &lt;enumeration value="LATE"/>
 *     &lt;enumeration value="CASH"/>
 *     &lt;enumeration value="DDEA"/>
 *     &lt;enumeration value="DTRD"/>
 *     &lt;enumeration value="PLCE"/>
 *     &lt;enumeration value="RTGS"/>
 *     &lt;enumeration value="NCRR"/>
 *     &lt;enumeration value="PHYS"/>
 *     &lt;enumeration value="REFE"/>
 *     &lt;enumeration value="DMON"/>
 *     &lt;enumeration value="MINO"/>
 *     &lt;enumeration value="BATC"/>
 *     &lt;enumeration value="MUNO"/>
 *     &lt;enumeration value="TXST"/>
 *     &lt;enumeration value="SETS"/>
 *     &lt;enumeration value="IIND"/>
 *     &lt;enumeration value="CAEV"/>
 *     &lt;enumeration value="CASY"/>
 *     &lt;enumeration value="DDAT"/>
 *     &lt;enumeration value="SETR"/>
 *     &lt;enumeration value="SDUT"/>
 *     &lt;enumeration value="INPS"/>
 *     &lt;enumeration value="OTHR"/>
 *     &lt;enumeration value="ICUS"/>
 *     &lt;enumeration value="ICAG"/>
 *     &lt;enumeration value="DEPT"/>
 *     &lt;enumeration value="IEXE"/>
 *     &lt;enumeration value="INVB"/>
 *     &lt;enumeration value="INVL"/>
 *     &lt;enumeration value="INVN"/>
 *     &lt;enumeration value="VALR"/>
 *     &lt;enumeration value="INVE"/>
 *     &lt;enumeration value="PLIS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RejectionReason37Code")
@XmlEnum
public enum RejectionReason37Code {

    SAFE,
    DQUA,
    ADEA,
    DSEC,
    LATE,
    CASH,
    DDEA,
    DTRD,
    PLCE,
    RTGS,
    NCRR,
    PHYS,
    REFE,
    DMON,
    MINO,
    BATC,
    MUNO,
    TXST,
    SETS,
    IIND,
    CAEV,
    CASY,
    DDAT,
    SETR,
    SDUT,
    INPS,
    OTHR,
    ICUS,
    ICAG,
    DEPT,
    IEXE,
    INVB,
    INVL,
    INVN,
    VALR,
    INVE,
    PLIS;

    public String value() {
        return name();
    }

    public static RejectionReason37Code fromValue(String v) {
        return valueOf(v);
    }

}
