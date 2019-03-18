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
 * <p>Clase Java para RepairReason4Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="RepairReason4Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BATC"/>
 *     &lt;enumeration value="CAEV"/>
 *     &lt;enumeration value="CASH"/>
 *     &lt;enumeration value="CASY"/>
 *     &lt;enumeration value="DDAT"/>
 *     &lt;enumeration value="DDEA"/>
 *     &lt;enumeration value="DMON"/>
 *     &lt;enumeration value="DQUA"/>
 *     &lt;enumeration value="DSEC"/>
 *     &lt;enumeration value="DTRD"/>
 *     &lt;enumeration value="IIND"/>
 *     &lt;enumeration value="MINO"/>
 *     &lt;enumeration value="MUNO"/>
 *     &lt;enumeration value="NCRR"/>
 *     &lt;enumeration value="PHYS"/>
 *     &lt;enumeration value="PLCE"/>
 *     &lt;enumeration value="REFE"/>
 *     &lt;enumeration value="RTGS"/>
 *     &lt;enumeration value="SAFE"/>
 *     &lt;enumeration value="SETR"/>
 *     &lt;enumeration value="SETS"/>
 *     &lt;enumeration value="TXST"/>
 *     &lt;enumeration value="INPS"/>
 *     &lt;enumeration value="SDUT"/>
 *     &lt;enumeration value="OTHR"/>
 *     &lt;enumeration value="IEXE"/>
 *     &lt;enumeration value="ICAG"/>
 *     &lt;enumeration value="DEPT"/>
 *     &lt;enumeration value="ICUS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RepairReason4Code")
@XmlEnum
public enum RepairReason4Code {

    BATC,
    CAEV,
    CASH,
    CASY,
    DDAT,
    DDEA,
    DMON,
    DQUA,
    DSEC,
    DTRD,
    IIND,
    MINO,
    MUNO,
    NCRR,
    PHYS,
    PLCE,
    REFE,
    RTGS,
    SAFE,
    SETR,
    SETS,
    TXST,
    INPS,
    SDUT,
    OTHR,
    IEXE,
    ICAG,
    DEPT,
    ICUS;

    public String value() {
        return name();
    }

    public static RepairReason4Code fromValue(String v) {
        return valueOf(v);
    }

}
