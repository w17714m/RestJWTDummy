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
 * <p>Clase Java para ExposureType4Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ExposureType4Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BFWD"/>
 *     &lt;enumeration value="PAYM"/>
 *     &lt;enumeration value="CCPC"/>
 *     &lt;enumeration value="COMM"/>
 *     &lt;enumeration value="CRDS"/>
 *     &lt;enumeration value="CRTL"/>
 *     &lt;enumeration value="CRSP"/>
 *     &lt;enumeration value="CCIR"/>
 *     &lt;enumeration value="CRPR"/>
 *     &lt;enumeration value="EQPT"/>
 *     &lt;enumeration value="EXTD"/>
 *     &lt;enumeration value="EQUS"/>
 *     &lt;enumeration value="EXPT"/>
 *     &lt;enumeration value="FIXI"/>
 *     &lt;enumeration value="FORX"/>
 *     &lt;enumeration value="FORW"/>
 *     &lt;enumeration value="FUTR"/>
 *     &lt;enumeration value="OPTN"/>
 *     &lt;enumeration value="LIQU"/>
 *     &lt;enumeration value="OTCD"/>
 *     &lt;enumeration value="REPO"/>
 *     &lt;enumeration value="RVPO"/>
 *     &lt;enumeration value="SLOA"/>
 *     &lt;enumeration value="SBSC"/>
 *     &lt;enumeration value="SCRP"/>
 *     &lt;enumeration value="SLEB"/>
 *     &lt;enumeration value="SHSL"/>
 *     &lt;enumeration value="SCIR"/>
 *     &lt;enumeration value="SCIE"/>
 *     &lt;enumeration value="SWPT"/>
 *     &lt;enumeration value="TBAS"/>
 *     &lt;enumeration value="TRCP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExposureType4Code")
@XmlEnum
public enum ExposureType4Code {

    BFWD,
    PAYM,
    CCPC,
    COMM,
    CRDS,
    CRTL,
    CRSP,
    CCIR,
    CRPR,
    EQPT,
    EXTD,
    EQUS,
    EXPT,
    FIXI,
    FORX,
    FORW,
    FUTR,
    OPTN,
    LIQU,
    OTCD,
    REPO,
    RVPO,
    SLOA,
    SBSC,
    SCRP,
    SLEB,
    SHSL,
    SCIR,
    SCIE,
    SWPT,
    TBAS,
    TRCP;

    public String value() {
        return name();
    }

    public static ExposureType4Code fromValue(String v) {
        return valueOf(v);
    }

}
