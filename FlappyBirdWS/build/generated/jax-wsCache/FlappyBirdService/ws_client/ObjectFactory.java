
package ws_client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws_client package. 
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

    private final static QName _CheckLogin_QNAME = new QName("http://ws/", "checkLogin");
    private final static QName _CheckLoginResponse_QNAME = new QName("http://ws/", "checkLoginResponse");
    private final static QName _GetScoreHistory_QNAME = new QName("http://ws/", "getScoreHistory");
    private final static QName _GetScoreHistoryResponse_QNAME = new QName("http://ws/", "getScoreHistoryResponse");
    private final static QName _SaveRegister_QNAME = new QName("http://ws/", "saveRegister");
    private final static QName _SaveRegisterResponse_QNAME = new QName("http://ws/", "saveRegisterResponse");
    private final static QName _SaveScore_QNAME = new QName("http://ws/", "saveScore");
    private final static QName _SaveScoreResponse_QNAME = new QName("http://ws/", "saveScoreResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws_client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CheckLogin }
     * 
     */
    public CheckLogin createCheckLogin() {
        return new CheckLogin();
    }

    /**
     * Create an instance of {@link CheckLoginResponse }
     * 
     */
    public CheckLoginResponse createCheckLoginResponse() {
        return new CheckLoginResponse();
    }

    /**
     * Create an instance of {@link GetScoreHistory }
     * 
     */
    public GetScoreHistory createGetScoreHistory() {
        return new GetScoreHistory();
    }

    /**
     * Create an instance of {@link GetScoreHistoryResponse }
     * 
     */
    public GetScoreHistoryResponse createGetScoreHistoryResponse() {
        return new GetScoreHistoryResponse();
    }

    /**
     * Create an instance of {@link SaveRegister }
     * 
     */
    public SaveRegister createSaveRegister() {
        return new SaveRegister();
    }

    /**
     * Create an instance of {@link SaveRegisterResponse }
     * 
     */
    public SaveRegisterResponse createSaveRegisterResponse() {
        return new SaveRegisterResponse();
    }

    /**
     * Create an instance of {@link SaveScore }
     * 
     */
    public SaveScore createSaveScore() {
        return new SaveScore();
    }

    /**
     * Create an instance of {@link SaveScoreResponse }
     * 
     */
    public SaveScoreResponse createSaveScoreResponse() {
        return new SaveScoreResponse();
    }

    /**
     * Create an instance of {@link Score }
     * 
     */
    public Score createScore() {
        return new Score();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "checkLogin")
    public JAXBElement<CheckLogin> createCheckLogin(CheckLogin value) {
        return new JAXBElement<CheckLogin>(_CheckLogin_QNAME, CheckLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "checkLoginResponse")
    public JAXBElement<CheckLoginResponse> createCheckLoginResponse(CheckLoginResponse value) {
        return new JAXBElement<CheckLoginResponse>(_CheckLoginResponse_QNAME, CheckLoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetScoreHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getScoreHistory")
    public JAXBElement<GetScoreHistory> createGetScoreHistory(GetScoreHistory value) {
        return new JAXBElement<GetScoreHistory>(_GetScoreHistory_QNAME, GetScoreHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetScoreHistoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getScoreHistoryResponse")
    public JAXBElement<GetScoreHistoryResponse> createGetScoreHistoryResponse(GetScoreHistoryResponse value) {
        return new JAXBElement<GetScoreHistoryResponse>(_GetScoreHistoryResponse_QNAME, GetScoreHistoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveRegister }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "saveRegister")
    public JAXBElement<SaveRegister> createSaveRegister(SaveRegister value) {
        return new JAXBElement<SaveRegister>(_SaveRegister_QNAME, SaveRegister.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveRegisterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "saveRegisterResponse")
    public JAXBElement<SaveRegisterResponse> createSaveRegisterResponse(SaveRegisterResponse value) {
        return new JAXBElement<SaveRegisterResponse>(_SaveRegisterResponse_QNAME, SaveRegisterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveScore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "saveScore")
    public JAXBElement<SaveScore> createSaveScore(SaveScore value) {
        return new JAXBElement<SaveScore>(_SaveScore_QNAME, SaveScore.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveScoreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "saveScoreResponse")
    public JAXBElement<SaveScoreResponse> createSaveScoreResponse(SaveScoreResponse value) {
        return new JAXBElement<SaveScoreResponse>(_SaveScoreResponse_QNAME, SaveScoreResponse.class, null, value);
    }

}
