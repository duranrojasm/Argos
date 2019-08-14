
package com.softnet.watched.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultaNotificacionResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultaNotificacionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="consultaBean" type="{http://notificacion.softnet.com}resultadoNotificacion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaNotificacionResponse", propOrder = {
    "consultaBean"
})
public class ConsultaNotificacionResponse {

    protected ResultadoNotificacion consultaBean;

    /**
     * Obtiene el valor de la propiedad consultaBean.
     * 
     * @return
     *     possible object is
     *     {@link ResultadoNotificacion }
     *     
     */
    public ResultadoNotificacion getConsultaBean() {
        return consultaBean;
    }

    /**
     * Define el valor de la propiedad consultaBean.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultadoNotificacion }
     *     
     */
    public void setConsultaBean(ResultadoNotificacion value) {
        this.consultaBean = value;
    }

}
