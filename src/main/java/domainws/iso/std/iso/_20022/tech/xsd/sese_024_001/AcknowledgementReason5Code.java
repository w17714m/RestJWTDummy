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
 * <p>Clase Java para AcknowledgementReason5Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="AcknowledgementReason5Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ADEA"/>
 *     &lt;enumeration value="SMPG"/>
 *     &lt;enumeration value="OTHR"/>
 *     &lt;enumeration value="CDCY"/>
 *     &lt;enumeration value="CDRG"/>
 *     &lt;enumeration value="CDRE"/>
 *     &lt;enumeration value="NSTP"/>
 *     &lt;enumeration value="RQWV"/>
 *     &lt;enumeration value="LATE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AcknowledgementReason5Code")
@XmlEnum
public enum AcknowledgementReason5Code {

    ADEA,
    SMPG,
    OTHR,
    CDCY,
    CDRG,
    CDRE,
    NSTP,
    RQWV,
    LATE;

    public String value() {
        return name();
    }

    public static AcknowledgementReason5Code fromValue(String v) {
        return valueOf(v);
    }

}
