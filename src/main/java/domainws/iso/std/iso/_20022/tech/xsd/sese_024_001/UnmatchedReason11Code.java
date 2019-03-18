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
 * <p>Clase Java para UnmatchedReason11Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="UnmatchedReason11Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ADEA"/>
 *     &lt;enumeration value="ACRU"/>
 *     &lt;enumeration value="IIND"/>
 *     &lt;enumeration value="CPCA"/>
 *     &lt;enumeration value="CLAT"/>
 *     &lt;enumeration value="NCRR"/>
 *     &lt;enumeration value="DDEA"/>
 *     &lt;enumeration value="DMCT"/>
 *     &lt;enumeration value="DCMX"/>
 *     &lt;enumeration value="DSEC"/>
 *     &lt;enumeration value="DQUA"/>
 *     &lt;enumeration value="INVE"/>
 *     &lt;enumeration value="LEOG"/>
 *     &lt;enumeration value="LATE"/>
 *     &lt;enumeration value="MIME"/>
 *     &lt;enumeration value="CMIS"/>
 *     &lt;enumeration value="NMAS"/>
 *     &lt;enumeration value="DTRA"/>
 *     &lt;enumeration value="OTHR"/>
 *     &lt;enumeration value="FRAP"/>
 *     &lt;enumeration value="PHYS"/>
 *     &lt;enumeration value="PLIS"/>
 *     &lt;enumeration value="INPS"/>
 *     &lt;enumeration value="PLCE"/>
 *     &lt;enumeration value="PODU"/>
 *     &lt;enumeration value="DEPT"/>
 *     &lt;enumeration value="ICAG"/>
 *     &lt;enumeration value="ICUS"/>
 *     &lt;enumeration value="IEXE"/>
 *     &lt;enumeration value="REGD"/>
 *     &lt;enumeration value="RTGS"/>
 *     &lt;enumeration value="SAFE"/>
 *     &lt;enumeration value="DMON"/>
 *     &lt;enumeration value="DDAT"/>
 *     &lt;enumeration value="SETS"/>
 *     &lt;enumeration value="SETR"/>
 *     &lt;enumeration value="TXST"/>
 *     &lt;enumeration value="DTRD"/>
 *     &lt;enumeration value="DELN"/>
 *     &lt;enumeration value="UNBR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UnmatchedReason11Code")
@XmlEnum
public enum UnmatchedReason11Code {

    ADEA,
    ACRU,
    IIND,
    CPCA,
    CLAT,
    NCRR,
    DDEA,
    DMCT,
    DCMX,
    DSEC,
    DQUA,
    INVE,
    LEOG,
    LATE,
    MIME,
    CMIS,
    NMAS,
    DTRA,
    OTHR,
    FRAP,
    PHYS,
    PLIS,
    INPS,
    PLCE,
    PODU,
    DEPT,
    ICAG,
    ICUS,
    IEXE,
    REGD,
    RTGS,
    SAFE,
    DMON,
    DDAT,
    SETS,
    SETR,
    TXST,
    DTRD,
    DELN,
    UNBR;

    public String value() {
        return name();
    }

    public static UnmatchedReason11Code fromValue(String v) {
        return valueOf(v);
    }

}
