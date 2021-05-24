/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

/**
 * REST Web Service
 *
 * @author KHAI-PC
 */
@Path("flappybirdserviceport")
public class FlappyBirdServicePort {

    private ws_client.FlappyBirdService port;

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of FlappyBirdServicePort
     */
    public FlappyBirdServicePort() {
        port = getPort();
    }

    /**
     * Invokes the SOAP method checkLogin
     * @param arg0 resource URI parameter
     * @param arg1 resource URI parameter
     * @return an instance of javax.xml.bind.JAXBElement<ws_client.User>
     */
    @GET
    @Produces("application/xml")
    @Consumes("text/plain")
    @Path("checklogin/")
    public JAXBElement<ws_client.User> getCheckLogin(@QueryParam("arg0") String arg0, @QueryParam("arg1") String arg1) {
        try {
            // Call Web Service Operation
            if (port != null) {
                ws_client.User result = port.checkLogin(arg0, arg1);
                return new JAXBElement<ws_client.User>(new QName("http//ws_client/", "user"), ws_client.User.class, result);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method saveScore
     * @param arg0 resource URI parameter
     * @param arg1 resource URI parameter
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    @Consumes("text/plain")
    @Path("savescore/")
    public String getSaveScore(@QueryParam("arg0")
            @DefaultValue("0") int arg0, @QueryParam("arg1")
            @DefaultValue("0") int arg1) {
        try {
            // Call Web Service Operation
            if (port != null) {
                boolean result = port.saveScore(arg0, arg1);
                return new java.lang.Boolean(result).toString();
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method saveRegister
     * @param arg0 resource URI parameter
     * @param arg1 resource URI parameter
     * @param arg2 resource URI parameter
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    @Consumes("text/plain")
    @Path("saveregister/")
    public String getSaveRegister(@QueryParam("arg0") String arg0, @QueryParam("arg1") String arg1, @QueryParam("arg2") String arg2) {
        try {
            // Call Web Service Operation
            if (port != null) {
                boolean result = port.saveRegister(arg0, arg1, arg2);
                return new java.lang.Boolean(result).toString();
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method getScoreHistory
     * @param arg0 resource URI parameter
     * @return an instance of javax.xml.bind.JAXBElement<ws_client.GetScoreHistoryResponse>
     */
    @GET
    @Produces("application/xml")
    @Consumes("text/plain")
    @Path("getscorehistory/")
    public JAXBElement<ws_client.GetScoreHistoryResponse> getScoreHistory(@QueryParam("arg0")
            @DefaultValue("0") int arg0) {
        try {
            // Call Web Service Operation
            if (port != null) {
                java.util.List<ws_client.Score> result = port.getScoreHistory(arg0);

                class GetScoreHistoryResponse_1 extends ws_client.GetScoreHistoryResponse {

                    GetScoreHistoryResponse_1(java.util.List<ws_client.Score> _return) {
                        this._return = _return;
                    }
                }
                ws_client.GetScoreHistoryResponse response = new GetScoreHistoryResponse_1(result);
                return new ws_client.ObjectFactory().createGetScoreHistoryResponse(response);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     *
     */
    private ws_client.FlappyBirdService getPort() {
        try {
            // Call Web Service Operation
            ws_client.FlappyBirdService_Service service = new ws_client.FlappyBirdService_Service();
            ws_client.FlappyBirdService p = service.getFlappyBirdServicePort();
            return p;
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }
}
