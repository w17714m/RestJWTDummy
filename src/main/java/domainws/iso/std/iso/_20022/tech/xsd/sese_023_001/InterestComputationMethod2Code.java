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
 * <p>Clase Java para InterestComputationMethod2Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="InterestComputationMethod2Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="A001"/>
 *     &lt;enumeration value="A002"/>
 *     &lt;enumeration value="A003"/>
 *     &lt;enumeration value="A004"/>
 *     &lt;enumeration value="A005"/>
 *     &lt;enumeration value="A006"/>
 *     &lt;enumeration value="A007"/>
 *     &lt;enumeration value="A008"/>
 *     &lt;enumeration value="A009"/>
 *     &lt;enumeration value="A010"/>
 *     &lt;enumeration value="A011"/>
 *     &lt;enumeration value="A012"/>
 *     &lt;enumeration value="A013"/>
 *     &lt;enumeration value="A014"/>
 *     &lt;enumeration value="NARR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InterestComputationMethod2Code")
@XmlEnum
public enum InterestComputationMethod2Code {

    @XmlEnumValue("A001")
    A_001("A001"),
    @XmlEnumValue("A002")
    A_002("A002"),
    @XmlEnumValue("A003")
    A_003("A003"),
    @XmlEnumValue("A004")
    A_004("A004"),
    @XmlEnumValue("A005")
    A_005("A005"),
    @XmlEnumValue("A006")
    A_006("A006"),
    @XmlEnumValue("A007")
    A_007("A007"),
    @XmlEnumValue("A008")
    A_008("A008"),
    @XmlEnumValue("A009")
    A_009("A009"),
    @XmlEnumValue("A010")
    A_010("A010"),
    @XmlEnumValue("A011")
    A_011("A011"),
    @XmlEnumValue("A012")
    A_012("A012"),
    @XmlEnumValue("A013")
    A_013("A013"),
    @XmlEnumValue("A014")
    A_014("A014"),
    NARR("NARR");
    private final String value;

    InterestComputationMethod2Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InterestComputationMethod2Code fromValue(String v) {
        for (InterestComputationMethod2Code c: InterestComputationMethod2Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
