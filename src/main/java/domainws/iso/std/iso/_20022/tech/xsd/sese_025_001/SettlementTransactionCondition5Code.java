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
 * <p>Clase Java para SettlementTransactionCondition5Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="SettlementTransactionCondition5Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PART"/>
 *     &lt;enumeration value="NPAR"/>
 *     &lt;enumeration value="PARC"/>
 *     &lt;enumeration value="PARQ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SettlementTransactionCondition5Code")
@XmlEnum
public enum SettlementTransactionCondition5Code {

    PART,
    NPAR,
    PARC,
    PARQ;

    public String value() {
        return name();
    }

    public static SettlementTransactionCondition5Code fromValue(String v) {
        return valueOf(v);
    }

}
