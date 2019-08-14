
package com.softnet.watched.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerDocumentos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerDocumentos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="usuario_admin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pass_admin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cod_notificacion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerDocumentos", propOrder = {
    "usuarioAdmin",
    "passAdmin",
    "codNotificacion"
})
public class ObtenerDocumentos {

    @XmlElement(name = "usuario_admin")
    protected String usuarioAdmin;
    @XmlElement(name = "pass_admin")
    protected String passAdmin;
    @XmlElement(name = "cod_notificacion")
    protected int codNotificacion;

    /**
     * Obtiene el valor de la propiedad usuarioAdmin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuarioAdmin() {
        return usuarioAdmin;
    }

    /**
     * Define el valor de la propiedad usuarioAdmin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuarioAdmin(String value) {
        this.usuarioAdmin = value;
    }

    /**
     * Obtiene el valor de la propiedad passAdmin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassAdmin() {
        return passAdmin;
    }

    /**
     * Define el valor de la propiedad passAdmin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassAdmin(String value) {
        this.passAdmin = value;
    }

    /**
     * Obtiene el valor de la propiedad codNotificacion.
     * 
     */
    public int getCodNotificacion() {
        return codNotificacion;
    }

    /**
     * Define el valor de la propiedad codNotificacion.
     * 
     */
    public void setCodNotificacion(int value) {
        this.codNotificacion = value;
    }

}
