//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.02.26 a las 05:19:56 PM COT 
//


package iso.std.iso._20022.tech.xsd.head_001_001;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the iso.std.iso._20022.tech.xsd.head_001_001 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AppHdr_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:head.001.001.01", "AppHdr");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: iso.std.iso._20022.tech.xsd.head_001_001
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BusinessApplicationHeaderV01 }
     * 
     */
    public BusinessApplicationHeaderV01 createBusinessApplicationHeaderV01() {
        return new BusinessApplicationHeaderV01();
    }

    /**
     * Create an instance of {@link ContactDetails2 }
     * 
     */
    public ContactDetails2 createContactDetails2() {
        return new ContactDetails2();
    }

    /**
     * Create an instance of {@link BranchAndFinancialInstitutionIdentification5 }
     * 
     */
    public BranchAndFinancialInstitutionIdentification5 createBranchAndFinancialInstitutionIdentification5() {
        return new BranchAndFinancialInstitutionIdentification5();
    }

    /**
     * Create an instance of {@link GenericOrganisationIdentification1 }
     * 
     */
    public GenericOrganisationIdentification1 createGenericOrganisationIdentification1() {
        return new GenericOrganisationIdentification1();
    }

    /**
     * Create an instance of {@link PartyIdentification42 }
     * 
     */
    public PartyIdentification42 createPartyIdentification42() {
        return new PartyIdentification42();
    }

    /**
     * Create an instance of {@link ClearingSystemMemberIdentification2 }
     * 
     */
    public ClearingSystemMemberIdentification2 createClearingSystemMemberIdentification2() {
        return new ClearingSystemMemberIdentification2();
    }

    /**
     * Create an instance of {@link PersonIdentificationSchemeName1Choice }
     * 
     */
    public PersonIdentificationSchemeName1Choice createPersonIdentificationSchemeName1Choice() {
        return new PersonIdentificationSchemeName1Choice();
    }

    /**
     * Create an instance of {@link FinancialInstitutionIdentification8 }
     * 
     */
    public FinancialInstitutionIdentification8 createFinancialInstitutionIdentification8() {
        return new FinancialInstitutionIdentification8();
    }

    /**
     * Create an instance of {@link SignatureEnvelope }
     * 
     */
    public SignatureEnvelope createSignatureEnvelope() {
        return new SignatureEnvelope();
    }

    /**
     * Create an instance of {@link BranchData2 }
     * 
     */
    public BranchData2 createBranchData2() {
        return new BranchData2();
    }

    /**
     * Create an instance of {@link Party9Choice }
     * 
     */
    public Party9Choice createParty9Choice() {
        return new Party9Choice();
    }

    /**
     * Create an instance of {@link BusinessApplicationHeader1 }
     * 
     */
    public BusinessApplicationHeader1 createBusinessApplicationHeader1() {
        return new BusinessApplicationHeader1();
    }

    /**
     * Create an instance of {@link Party10Choice }
     * 
     */
    public Party10Choice createParty10Choice() {
        return new Party10Choice();
    }

    /**
     * Create an instance of {@link DateAndPlaceOfBirth }
     * 
     */
    public DateAndPlaceOfBirth createDateAndPlaceOfBirth() {
        return new DateAndPlaceOfBirth();
    }

    /**
     * Create an instance of {@link ClearingSystemIdentification2Choice }
     * 
     */
    public ClearingSystemIdentification2Choice createClearingSystemIdentification2Choice() {
        return new ClearingSystemIdentification2Choice();
    }

    /**
     * Create an instance of {@link GenericFinancialIdentification1 }
     * 
     */
    public GenericFinancialIdentification1 createGenericFinancialIdentification1() {
        return new GenericFinancialIdentification1();
    }

    /**
     * Create an instance of {@link OrganisationIdentification7 }
     * 
     */
    public OrganisationIdentification7 createOrganisationIdentification7() {
        return new OrganisationIdentification7();
    }

    /**
     * Create an instance of {@link OrganisationIdentificationSchemeName1Choice }
     * 
     */
    public OrganisationIdentificationSchemeName1Choice createOrganisationIdentificationSchemeName1Choice() {
        return new OrganisationIdentificationSchemeName1Choice();
    }

    /**
     * Create an instance of {@link GenericPersonIdentification1 }
     * 
     */
    public GenericPersonIdentification1 createGenericPersonIdentification1() {
        return new GenericPersonIdentification1();
    }

    /**
     * Create an instance of {@link PersonIdentification5 }
     * 
     */
    public PersonIdentification5 createPersonIdentification5() {
        return new PersonIdentification5();
    }

    /**
     * Create an instance of {@link FinancialIdentificationSchemeName1Choice }
     * 
     */
    public FinancialIdentificationSchemeName1Choice createFinancialIdentificationSchemeName1Choice() {
        return new FinancialIdentificationSchemeName1Choice();
    }

    /**
     * Create an instance of {@link PostalAddress6 }
     * 
     */
    public PostalAddress6 createPostalAddress6() {
        return new PostalAddress6();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessApplicationHeaderV01 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:head.001.001.01", name = "AppHdr")
    public JAXBElement<BusinessApplicationHeaderV01> createAppHdr(BusinessApplicationHeaderV01 value) {
        return new JAXBElement<BusinessApplicationHeaderV01>(_AppHdr_QNAME, BusinessApplicationHeaderV01 .class, null, value);
    }

}
