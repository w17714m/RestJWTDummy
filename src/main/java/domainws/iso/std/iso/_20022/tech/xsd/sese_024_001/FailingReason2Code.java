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
 * <p>Clase Java para FailingReason2Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="FailingReason2Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AWMO"/>
 *     &lt;enumeration value="BYIY"/>
 *     &lt;enumeration value="CLAT"/>
 *     &lt;enumeration value="ADEA"/>
 *     &lt;enumeration value="CANR"/>
 *     &lt;enumeration value="CAIS"/>
 *     &lt;enumeration value="OBJT"/>
 *     &lt;enumeration value="AWSH"/>
 *     &lt;enumeration value="PHSE"/>
 *     &lt;enumeration value="STCD"/>
 *     &lt;enumeration value="DOCY"/>
 *     &lt;enumeration value="MLAT"/>
 *     &lt;enumeration value="DOCC"/>
 *     &lt;enumeration value="BLOC"/>
 *     &lt;enumeration value="CHAS"/>
 *     &lt;enumeration value="NEWI"/>
 *     &lt;enumeration value="CLAC"/>
 *     &lt;enumeration value="MUNO"/>
 *     &lt;enumeration value="GLOB"/>
 *     &lt;enumeration value="PREA"/>
 *     &lt;enumeration value="PART"/>
 *     &lt;enumeration value="NOFX"/>
 *     &lt;enumeration value="CMON"/>
 *     &lt;enumeration value="YCOL"/>
 *     &lt;enumeration value="COLL"/>
 *     &lt;enumeration value="DEPO"/>
 *     &lt;enumeration value="FLIM"/>
 *     &lt;enumeration value="INCA"/>
 *     &lt;enumeration value="LINK"/>
 *     &lt;enumeration value="LACK"/>
 *     &lt;enumeration value="LALO"/>
 *     &lt;enumeration value="MONY"/>
 *     &lt;enumeration value="NCON"/>
 *     &lt;enumeration value="REFS"/>
 *     &lt;enumeration value="SDUT"/>
 *     &lt;enumeration value="BATC"/>
 *     &lt;enumeration value="CYCL"/>
 *     &lt;enumeration value="SBLO"/>
 *     &lt;enumeration value="CPEC"/>
 *     &lt;enumeration value="MINO"/>
 *     &lt;enumeration value="IAAD"/>
 *     &lt;enumeration value="OTHR"/>
 *     &lt;enumeration value="PHCK"/>
 *     &lt;enumeration value="BENO"/>
 *     &lt;enumeration value="BOTH"/>
 *     &lt;enumeration value="CLHT"/>
 *     &lt;enumeration value="DENO"/>
 *     &lt;enumeration value="DISA"/>
 *     &lt;enumeration value="DKNY"/>
 *     &lt;enumeration value="FROZ"/>
 *     &lt;enumeration value="LAAW"/>
 *     &lt;enumeration value="LATE"/>
 *     &lt;enumeration value="LIQU"/>
 *     &lt;enumeration value="PRCY"/>
 *     &lt;enumeration value="REGT"/>
 *     &lt;enumeration value="SETS"/>
 *     &lt;enumeration value="CERT"/>
 *     &lt;enumeration value="PRSY"/>
 *     &lt;enumeration value="CDLR"/>
 *     &lt;enumeration value="CSDH"/>
 *     &lt;enumeration value="CVAL"/>
 *     &lt;enumeration value="INBC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FailingReason2Code")
@XmlEnum
public enum FailingReason2Code {

    AWMO,
    BYIY,
    CLAT,
    ADEA,
    CANR,
    CAIS,
    OBJT,
    AWSH,
    PHSE,
    STCD,
    DOCY,
    MLAT,
    DOCC,
    BLOC,
    CHAS,
    NEWI,
    CLAC,
    MUNO,
    GLOB,
    PREA,
    PART,
    NOFX,
    CMON,
    YCOL,
    COLL,
    DEPO,
    FLIM,
    INCA,
    LINK,
    LACK,
    LALO,
    MONY,
    NCON,
    REFS,
    SDUT,
    BATC,
    CYCL,
    SBLO,
    CPEC,
    MINO,
    IAAD,
    OTHR,
    PHCK,
    BENO,
    BOTH,
    CLHT,
    DENO,
    DISA,
    DKNY,
    FROZ,
    LAAW,
    LATE,
    LIQU,
    PRCY,
    REGT,
    SETS,
    CERT,
    PRSY,
    CDLR,
    CSDH,
    CVAL,
    INBC;

    public String value() {
        return name();
    }

    public static FailingReason2Code fromValue(String v) {
        return valueOf(v);
    }

}
