
package com.softnet.watched.webservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "NotificacionElectronicaWs", targetNamespace = "http://notificacion.softnet.com", wsdlLocation = "http://192.168.0.53:8190/pmi-ie/NotificacionElectronicaWs?wsdl")
public class NotificacionElectronicaWs_Service
    extends Service
{

    private final static URL NOTIFICACIONELECTRONICAWS_WSDL_LOCATION;
    private final static WebServiceException NOTIFICACIONELECTRONICAWS_EXCEPTION;
    private final static QName NOTIFICACIONELECTRONICAWS_QNAME = new QName("http://notificacion.softnet.com", "NotificacionElectronicaWs");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.0.53:8190/pmi-ie/NotificacionElectronicaWs?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        NOTIFICACIONELECTRONICAWS_WSDL_LOCATION = url;
        NOTIFICACIONELECTRONICAWS_EXCEPTION = e;
    }

    public NotificacionElectronicaWs_Service() {
        super(__getWsdlLocation(), NOTIFICACIONELECTRONICAWS_QNAME);
    }

    public NotificacionElectronicaWs_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), NOTIFICACIONELECTRONICAWS_QNAME, features);
    }

    public NotificacionElectronicaWs_Service(URL wsdlLocation) {
        super(wsdlLocation, NOTIFICACIONELECTRONICAWS_QNAME);
    }

    public NotificacionElectronicaWs_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, NOTIFICACIONELECTRONICAWS_QNAME, features);
    }

    public NotificacionElectronicaWs_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public NotificacionElectronicaWs_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns NotificacionElectronicaWs
     */
    @WebEndpoint(name = "NotificacionElectronicaWsPort")
    public NotificacionElectronicaWs getNotificacionElectronicaWsPort() {
        return super.getPort(new QName("http://notificacion.softnet.com", "NotificacionElectronicaWsPort"), NotificacionElectronicaWs.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns NotificacionElectronicaWs
     */
    @WebEndpoint(name = "NotificacionElectronicaWsPort")
    public NotificacionElectronicaWs getNotificacionElectronicaWsPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://notificacion.softnet.com", "NotificacionElectronicaWsPort"), NotificacionElectronicaWs.class, features);
    }

    private static URL __getWsdlLocation() {
        if (NOTIFICACIONELECTRONICAWS_EXCEPTION!= null) {
            throw NOTIFICACIONELECTRONICAWS_EXCEPTION;
        }
        return NOTIFICACIONELECTRONICAWS_WSDL_LOCATION;
    }

}