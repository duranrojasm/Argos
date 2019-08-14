
package com.softnet.watched.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para generarCargo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="generarCargo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="usuario_admin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pass_admin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cod_notificacion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cod_empresa" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cod_usuario" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tipo_usuario" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tipo_control" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "generarCargo", propOrder = {
    "usuarioAdmin",
    "passAdmin",
    "codNotificacion",
    "codEmpresa",
    "codUsuario",
    "tipoUsuario",
    "tipoControl"
})
public class GenerarCargo {

    @XmlElement(name = "usuario_admin")
    protected String usuarioAdmin;
    @XmlElement(name = "pass_admin")
    protected String passAdmin;
    @XmlElement(name = "cod_notificacion")
    protected int codNotificacion;
    @XmlElement(name = "cod_empresa")
    protected int codEmpresa;
    @XmlElement(name = "cod_usuario")
    protected int codUsuario;
    @XmlElement(name = "tipo_usuario")
    protected int tipoUsuario;
    @XmlElement(name = "tipo_control")
    protected int tipoControl;

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

    /**
     * Obtiene el valor de la propiedad codEmpresa.
     * 
     */
    public int getCodEmpresa() {
        return codEmpresa;
    }

    /**
     * Define el valor de la propiedad codEmpresa.
     * 
     */
    public void setCodEmpresa(int value) {
        this.codEmpresa = value;
    }

    /**
     * Obtiene el valor de la propiedad codUsuario.
     * 
     */
    public int getCodUsuario() {
        return codUsuario;
    }

    /**
     * Define el valor de la propiedad codUsuario.
     * 
     */
    public void setCodUsuario(int value) {
        this.codUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoUsuario.
     * 
     */
    public int getTipoUsuario() {
        return tipoUsuario;
    }

    /**
     * Define el valor de la propiedad tipoUsuario.
     * 
     */
    public void setTipoUsuario(int value) {
        this.tipoUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoControl.
     * 
     */
    public int getTipoControl() {
        return tipoControl;
    }

    /**
     * Define el valor de la propiedad tipoControl.
     * 
     */
    public void setTipoControl(int value) {
        this.tipoControl = value;
    }

}
