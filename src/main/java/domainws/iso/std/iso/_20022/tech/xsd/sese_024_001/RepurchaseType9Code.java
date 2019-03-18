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
 * <p>Clase Java para RepurchaseType9Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="RepurchaseType9Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PAIR"/>
 *     &lt;enumeration value="PADJ"/>
 *     &lt;enumeration value="RATE"/>
 *     &lt;enumeration value="CALL"/>
 *     &lt;enumeration value="ROLP"/>
 *     &lt;enumeration value="CADJ"/>
 *     &lt;enumeration value="TOPU"/>
 *     &lt;enumeration value="WTHD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RepurchaseType9Code")
@XmlEnum
public enum RepurchaseType9Code {

    PAIR,
    PADJ,
    RATE,
    CALL,
    ROLP,
    CADJ,
    TOPU,
    WTHD;

    public String value() {
        return name();
    }

    public static RepurchaseType9Code fromValue(String v) {
        return valueOf(v);
    }

}
