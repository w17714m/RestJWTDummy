//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.02.26 a las 05:19:56 PM COT 
//


package iso.std.iso._20022.tech.xsd.sese_023_001;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OwnershipLegalRestrictions1Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="OwnershipLegalRestrictions1Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="A144"/>
 *     &lt;enumeration value="NRST"/>
 *     &lt;enumeration value="RSTR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OwnershipLegalRestrictions1Code")
@XmlEnum
public enum OwnershipLegalRestrictions1Code {

    @XmlEnumValue("A144")
    A_144("A144"),
    NRST("NRST"),
    RSTR("RSTR");
    private final String value;

    OwnershipLegalRestrictions1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OwnershipLegalRestrictions1Code fromValue(String v) {
        for (OwnershipLegalRestrictions1Code c: OwnershipLegalRestrictions1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
