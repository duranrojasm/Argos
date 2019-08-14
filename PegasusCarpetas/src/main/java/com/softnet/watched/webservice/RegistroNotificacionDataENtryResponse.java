
package com.softnet.watched.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para registroNotificacionDataENtryResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="registroNotificacionDataENtryResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultadoBean" type="{http://notificacion.softnet.com}resultado" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registroNotificacionDataENtryResponse", propOrder = {
    "resultadoBean"
})
public class RegistroNotificacionDataENtryResponse {

    protected Resultado resultadoBean;

    /**
     * Obtiene el valor de la propiedad resultadoBean.
     * 
     * @return
     *     possible object is
     *     {@link Resultado }
     *     
     */
    public Resultado getResultadoBean() {
        return resultadoBean;
    }

    /**
     * Define el valor de la propiedad resultadoBean.
     * 
     * @param value
     *     allowed object is
     *     {@link Resultado }
     *     
     */
    public void setResultadoBean(Resultado value) {
        this.resultadoBean = value;
    }

}
