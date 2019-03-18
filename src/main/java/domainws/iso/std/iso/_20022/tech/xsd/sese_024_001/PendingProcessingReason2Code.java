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
 * <p>Clase Java para PendingProcessingReason2Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="PendingProcessingReason2Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ADEA"/>
 *     &lt;enumeration value="CAIS"/>
 *     &lt;enumeration value="DOCY"/>
 *     &lt;enumeration value="NOFX"/>
 *     &lt;enumeration value="BLOC"/>
 *     &lt;enumeration value="MUNO"/>
 *     &lt;enumeration value="GLOB"/>
 *     &lt;enumeration value="YCOL"/>
 *     &lt;enumeration value="COLL"/>
 *     &lt;enumeration value="FLIM"/>
 *     &lt;enumeration value="NEXT"/>
 *     &lt;enumeration value="LACK"/>
 *     &lt;enumeration value="LALO"/>
 *     &lt;enumeration value="MONY"/>
 *     &lt;enumeration value="MINO"/>
 *     &lt;enumeration value="OTHR"/>
 *     &lt;enumeration value="DENO"/>
 *     &lt;enumeration value="LIQU"/>
 *     &lt;enumeration value="CERT"/>
 *     &lt;enumeration value="CSDH"/>
 *     &lt;enumeration value="CVAL"/>
 *     &lt;enumeration value="CDEL"/>
 *     &lt;enumeration value="CDLR"/>
 *     &lt;enumeration value="CDAC"/>
 *     &lt;enumeration value="INBC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PendingProcessingReason2Code")
@XmlEnum
public enum PendingProcessingReason2Code {

    ADEA,
    CAIS,
    DOCY,
    NOFX,
    BLOC,
    MUNO,
    GLOB,
    YCOL,
    COLL,
    FLIM,
    NEXT,
    LACK,
    LALO,
    MONY,
    MINO,
    OTHR,
    DENO,
    LIQU,
    CERT,
    CSDH,
    CVAL,
    CDEL,
    CDLR,
    CDAC,
    INBC;

    public String value() {
        return name();
    }

    public static PendingProcessingReason2Code fromValue(String v) {
        return valueOf(v);
    }

}
