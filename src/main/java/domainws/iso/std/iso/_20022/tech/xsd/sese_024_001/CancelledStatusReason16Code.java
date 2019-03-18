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
 * <p>Clase Java para CancelledStatusReason16Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="CancelledStatusReason16Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;minLength value="1"/>
 *     &lt;maxLength value="4"/>
 *     &lt;enumeration value="SCEX"/>
 *     &lt;enumeration value="OTHR"/>
 *     &lt;enumeration value="CXLR"/>
 *     &lt;enumeration value="BYIY"/>
 *     &lt;enumeration value="CTHP"/>
 *     &lt;enumeration value="CANZ"/>
 *     &lt;enumeration value="CANT"/>
 *     &lt;enumeration value="CSUB"/>
 *     &lt;enumeration value="CANS"/>
 *     &lt;enumeration value="CANI"/>
 *     &lt;enumeration value="CORP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CancelledStatusReason16Code")
@XmlEnum
public enum CancelledStatusReason16Code {

    SCEX,
    OTHR,
    CXLR,
    BYIY,
    CTHP,
    CANZ,
    CANT,
    CSUB,
    CANS,
    CANI,
    CORP;

    public String value() {
        return name();
    }

    public static CancelledStatusReason16Code fromValue(String v) {
        return valueOf(v);
    }

}
