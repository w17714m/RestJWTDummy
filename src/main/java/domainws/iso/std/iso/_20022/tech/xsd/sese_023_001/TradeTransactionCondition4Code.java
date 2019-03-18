//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.02.26 a las 05:19:56 PM COT 
//


package iso.std.iso._20022.tech.xsd.sese_023_001;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TradeTransactionCondition4Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="TradeTransactionCondition4Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CBNS"/>
 *     &lt;enumeration value="XBNS"/>
 *     &lt;enumeration value="CCPN"/>
 *     &lt;enumeration value="XCPN"/>
 *     &lt;enumeration value="CDIV"/>
 *     &lt;enumeration value="XDIV"/>
 *     &lt;enumeration value="CRTS"/>
 *     &lt;enumeration value="XRTS"/>
 *     &lt;enumeration value="CWAR"/>
 *     &lt;enumeration value="XWAR"/>
 *     &lt;enumeration value="SPCU"/>
 *     &lt;enumeration value="SPEX"/>
 *     &lt;enumeration value="GTDL"/>
 *     &lt;enumeration value="BCRO"/>
 *     &lt;enumeration value="BCRP"/>
 *     &lt;enumeration value="BCFD"/>
 *     &lt;enumeration value="BCBL"/>
 *     &lt;enumeration value="BCBN"/>
 *     &lt;enumeration value="MAPR"/>
 *     &lt;enumeration value="NEGO"/>
 *     &lt;enumeration value="NMPR"/>
 *     &lt;enumeration value="BCPD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TradeTransactionCondition4Code")
@XmlEnum
public enum TradeTransactionCondition4Code {

    CBNS,
    XBNS,
    CCPN,
    XCPN,
    CDIV,
    XDIV,
    CRTS,
    XRTS,
    CWAR,
    XWAR,
    SPCU,
    SPEX,
    GTDL,
    BCRO,
    BCRP,
    BCFD,
    BCBL,
    BCBN,
    MAPR,
    NEGO,
    NMPR,
    BCPD;

    public String value() {
        return name();
    }

    public static TradeTransactionCondition4Code fromValue(String v) {
        return valueOf(v);
    }

}
