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
 * <p>Clase Java para SecuritiesTransactionType25Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="SecuritiesTransactionType25Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BSBK"/>
 *     &lt;enumeration value="BYIY"/>
 *     &lt;enumeration value="CNCB"/>
 *     &lt;enumeration value="COLI"/>
 *     &lt;enumeration value="COLO"/>
 *     &lt;enumeration value="CONV"/>
 *     &lt;enumeration value="FCTA"/>
 *     &lt;enumeration value="INSP"/>
 *     &lt;enumeration value="ISSU"/>
 *     &lt;enumeration value="MKDW"/>
 *     &lt;enumeration value="MKUP"/>
 *     &lt;enumeration value="NETT"/>
 *     &lt;enumeration value="NSYN"/>
 *     &lt;enumeration value="OWNE"/>
 *     &lt;enumeration value="OWNI"/>
 *     &lt;enumeration value="PAIR"/>
 *     &lt;enumeration value="PLAC"/>
 *     &lt;enumeration value="PORT"/>
 *     &lt;enumeration value="REAL"/>
 *     &lt;enumeration value="REDI"/>
 *     &lt;enumeration value="REDM"/>
 *     &lt;enumeration value="RELE"/>
 *     &lt;enumeration value="REPU"/>
 *     &lt;enumeration value="RODE"/>
 *     &lt;enumeration value="RVPO"/>
 *     &lt;enumeration value="SBBK"/>
 *     &lt;enumeration value="SBRE"/>
 *     &lt;enumeration value="SECB"/>
 *     &lt;enumeration value="SECL"/>
 *     &lt;enumeration value="SLRE"/>
 *     &lt;enumeration value="SUBS"/>
 *     &lt;enumeration value="SYND"/>
 *     &lt;enumeration value="TBAC"/>
 *     &lt;enumeration value="TRAD"/>
 *     &lt;enumeration value="TRPO"/>
 *     &lt;enumeration value="TRVO"/>
 *     &lt;enumeration value="TURN"/>
 *     &lt;enumeration value="CLAI"/>
 *     &lt;enumeration value="CORP"/>
 *     &lt;enumeration value="AUTO"/>
 *     &lt;enumeration value="SWIF"/>
 *     &lt;enumeration value="SWIT"/>
 *     &lt;enumeration value="ETFT"/>
 *     &lt;enumeration value="REBL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SecuritiesTransactionType25Code")
@XmlEnum
public enum SecuritiesTransactionType25Code {

    BSBK,
    BYIY,
    CNCB,
    COLI,
    COLO,
    CONV,
    FCTA,
    INSP,
    ISSU,
    MKDW,
    MKUP,
    NETT,
    NSYN,
    OWNE,
    OWNI,
    PAIR,
    PLAC,
    PORT,
    REAL,
    REDI,
    REDM,
    RELE,
    REPU,
    RODE,
    RVPO,
    SBBK,
    SBRE,
    SECB,
    SECL,
    SLRE,
    SUBS,
    SYND,
    TBAC,
    TRAD,
    TRPO,
    TRVO,
    TURN,
    CLAI,
    CORP,
    AUTO,
    SWIF,
    SWIT,
    ETFT,
    REBL;

    public String value() {
        return name();
    }

    public static SecuritiesTransactionType25Code fromValue(String v) {
        return valueOf(v);
    }

}
