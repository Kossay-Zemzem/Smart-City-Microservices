
package com.example.proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.proxy package. 
 * <p>An ObjectFactory allows you to programmatically 
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

    private static final QName _Client_QNAME = new QName("http://services.facture.smartcity.com/", "client");
    private static final QName _FactureDTO_QNAME = new QName("http://services.facture.smartcity.com/", "factureDTO");
    private static final QName _FactureParking_QNAME = new QName("http://services.facture.smartcity.com/", "factureParking");
    private static final QName _FactureRequest_QNAME = new QName("http://services.facture.smartcity.com/", "factureRequest");
    private static final QName _GenerateFacture_QNAME = new QName("http://services.facture.smartcity.com/", "generateFacture");
    private static final QName _GenerateFactureResponse_QNAME = new QName("http://services.facture.smartcity.com/", "generateFactureResponse");
    private static final QName _GetAllClients_QNAME = new QName("http://services.facture.smartcity.com/", "getAllClients");
    private static final QName _GetAllClientsResponse_QNAME = new QName("http://services.facture.smartcity.com/", "getAllClientsResponse");
    private static final QName _GetAllFactureParType_QNAME = new QName("http://services.facture.smartcity.com/", "getAllFactureParType");
    private static final QName _GetAllFactureParTypeResponse_QNAME = new QName("http://services.facture.smartcity.com/", "getAllFactureParTypeResponse");
    private static final QName _GetClientCount_QNAME = new QName("http://services.facture.smartcity.com/", "getClientCount");
    private static final QName _GetClientCountResponse_QNAME = new QName("http://services.facture.smartcity.com/", "getClientCountResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Client }
     * 
     * @return
     *     the new instance of {@link Client }
     */
    public Client createClient() {
        return new Client();
    }

    /**
     * Create an instance of {@link FactureDTO }
     * 
     * @return
     *     the new instance of {@link FactureDTO }
     */
    public FactureDTO createFactureDTO() {
        return new FactureDTO();
    }

    /**
     * Create an instance of {@link FactureParking }
     * 
     * @return
     *     the new instance of {@link FactureParking }
     */
    public FactureParking createFactureParking() {
        return new FactureParking();
    }

    /**
     * Create an instance of {@link FactureRequest }
     * 
     * @return
     *     the new instance of {@link FactureRequest }
     */
    public FactureRequest createFactureRequest() {
        return new FactureRequest();
    }

    /**
     * Create an instance of {@link GenerateFacture }
     * 
     * @return
     *     the new instance of {@link GenerateFacture }
     */
    public GenerateFacture createGenerateFacture() {
        return new GenerateFacture();
    }

    /**
     * Create an instance of {@link GenerateFactureResponse }
     * 
     * @return
     *     the new instance of {@link GenerateFactureResponse }
     */
    public GenerateFactureResponse createGenerateFactureResponse() {
        return new GenerateFactureResponse();
    }

    /**
     * Create an instance of {@link GetAllClients }
     * 
     * @return
     *     the new instance of {@link GetAllClients }
     */
    public GetAllClients createGetAllClients() {
        return new GetAllClients();
    }

    /**
     * Create an instance of {@link GetAllClientsResponse }
     * 
     * @return
     *     the new instance of {@link GetAllClientsResponse }
     */
    public GetAllClientsResponse createGetAllClientsResponse() {
        return new GetAllClientsResponse();
    }

    /**
     * Create an instance of {@link GetAllFactureParType }
     * 
     * @return
     *     the new instance of {@link GetAllFactureParType }
     */
    public GetAllFactureParType createGetAllFactureParType() {
        return new GetAllFactureParType();
    }

    /**
     * Create an instance of {@link GetAllFactureParTypeResponse }
     * 
     * @return
     *     the new instance of {@link GetAllFactureParTypeResponse }
     */
    public GetAllFactureParTypeResponse createGetAllFactureParTypeResponse() {
        return new GetAllFactureParTypeResponse();
    }

    /**
     * Create an instance of {@link GetClientCount }
     * 
     * @return
     *     the new instance of {@link GetClientCount }
     */
    public GetClientCount createGetClientCount() {
        return new GetClientCount();
    }

    /**
     * Create an instance of {@link GetClientCountResponse }
     * 
     * @return
     *     the new instance of {@link GetClientCountResponse }
     */
    public GetClientCountResponse createGetClientCountResponse() {
        return new GetClientCountResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Client }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Client }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.facture.smartcity.com/", name = "client")
    public JAXBElement<Client> createClient(Client value) {
        return new JAXBElement<>(_Client_QNAME, Client.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FactureDTO }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FactureDTO }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.facture.smartcity.com/", name = "factureDTO")
    public JAXBElement<FactureDTO> createFactureDTO(FactureDTO value) {
        return new JAXBElement<>(_FactureDTO_QNAME, FactureDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FactureParking }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FactureParking }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.facture.smartcity.com/", name = "factureParking")
    public JAXBElement<FactureParking> createFactureParking(FactureParking value) {
        return new JAXBElement<>(_FactureParking_QNAME, FactureParking.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FactureRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FactureRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.facture.smartcity.com/", name = "factureRequest")
    public JAXBElement<FactureRequest> createFactureRequest(FactureRequest value) {
        return new JAXBElement<>(_FactureRequest_QNAME, FactureRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateFacture }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GenerateFacture }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.facture.smartcity.com/", name = "generateFacture")
    public JAXBElement<GenerateFacture> createGenerateFacture(GenerateFacture value) {
        return new JAXBElement<>(_GenerateFacture_QNAME, GenerateFacture.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateFactureResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GenerateFactureResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.facture.smartcity.com/", name = "generateFactureResponse")
    public JAXBElement<GenerateFactureResponse> createGenerateFactureResponse(GenerateFactureResponse value) {
        return new JAXBElement<>(_GenerateFactureResponse_QNAME, GenerateFactureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllClients }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllClients }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.facture.smartcity.com/", name = "getAllClients")
    public JAXBElement<GetAllClients> createGetAllClients(GetAllClients value) {
        return new JAXBElement<>(_GetAllClients_QNAME, GetAllClients.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllClientsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllClientsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.facture.smartcity.com/", name = "getAllClientsResponse")
    public JAXBElement<GetAllClientsResponse> createGetAllClientsResponse(GetAllClientsResponse value) {
        return new JAXBElement<>(_GetAllClientsResponse_QNAME, GetAllClientsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllFactureParType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllFactureParType }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.facture.smartcity.com/", name = "getAllFactureParType")
    public JAXBElement<GetAllFactureParType> createGetAllFactureParType(GetAllFactureParType value) {
        return new JAXBElement<>(_GetAllFactureParType_QNAME, GetAllFactureParType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllFactureParTypeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllFactureParTypeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.facture.smartcity.com/", name = "getAllFactureParTypeResponse")
    public JAXBElement<GetAllFactureParTypeResponse> createGetAllFactureParTypeResponse(GetAllFactureParTypeResponse value) {
        return new JAXBElement<>(_GetAllFactureParTypeResponse_QNAME, GetAllFactureParTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClientCount }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetClientCount }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.facture.smartcity.com/", name = "getClientCount")
    public JAXBElement<GetClientCount> createGetClientCount(GetClientCount value) {
        return new JAXBElement<>(_GetClientCount_QNAME, GetClientCount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClientCountResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetClientCountResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.facture.smartcity.com/", name = "getClientCountResponse")
    public JAXBElement<GetClientCountResponse> createGetClientCountResponse(GetClientCountResponse value) {
        return new JAXBElement<>(_GetClientCountResponse_QNAME, GetClientCountResponse.class, null, value);
    }

}
