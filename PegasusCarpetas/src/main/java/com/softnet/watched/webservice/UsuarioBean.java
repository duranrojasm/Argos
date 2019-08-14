
package com.softnet.watched.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para usuarioBean complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="usuarioBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="apellidos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="doc_identidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flag_empresa" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nombres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nro_secuencia_firma" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="num_telefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="posicion_firma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipo_doc_identidad" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tipo_usuario" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usuarioBean", propOrder = {
    "apellidos",
    "correo",
    "docIdentidad",
    "flagEmpresa",
    "nombres",
    "nroSecuenciaFirma",
    "numTelefono",
    "posicionFirma",
    "tipoDocIdentidad",
    "tipoUsuario"
})
public class UsuarioBean {

    protected String apellidos;
    protected String correo;
    @XmlElement(name = "doc_identidad")
    protected String docIdentidad;
    @XmlElement(name = "flag_empresa")
    protected int flagEmpresa;
    protected String nombres;
    @XmlElement(name = "nro_secuencia_firma")
    protected int nroSecuenciaFirma;
    @XmlElement(name = "num_telefono")
    protected String numTelefono;
    @XmlElement(name = "posicion_firma")
    protected String posicionFirma;
    @XmlElement(name = "tipo_doc_identidad")
    protected int tipoDocIdentidad;
    @XmlElement(name = "tipo_usuario")
    protected int tipoUsuario;

    /**
     * Obtiene el valor de la propiedad apellidos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Define el valor de la propiedad apellidos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidos(String value) {
        this.apellidos = value;
    }

    /**
     * Obtiene el valor de la propiedad correo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Define el valor de la propiedad correo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorreo(String value) {
        this.correo = value;
    }

    /**
     * Obtiene el valor de la propiedad docIdentidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocIdentidad() {
        return docIdentidad;
    }

    /**
     * Define el valor de la propiedad docIdentidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocIdentidad(String value) {
        this.docIdentidad = value;
    }

    /**
     * Obtiene el valor de la propiedad flagEmpresa.
     * 
     */
    public int getFlagEmpresa() {
        return flagEmpresa;
    }

    /**
     * Define el valor de la propiedad flagEmpresa.
     * 
     */
    public void setFlagEmpresa(int value) {
        this.flagEmpresa = value;
    }

    /**
     * Obtiene el valor de la propiedad nombres.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * Define el valor de la propiedad nombres.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombres(String value) {
        this.nombres = value;
    }

    /**
     * Obtiene el valor de la propiedad nroSecuenciaFirma.
     * 
     */
    public int getNroSecuenciaFirma() {
        return nroSecuenciaFirma;
    }

    /**
     * Define el valor de la propiedad nroSecuenciaFirma.
     * 
     */
    public void setNroSecuenciaFirma(int value) {
        this.nroSecuenciaFirma = value;
    }

    /**
     * Obtiene el valor de la propiedad numTelefono.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumTelefono() {
        return numTelefono;
    }

    /**
     * Define el valor de la propiedad numTelefono.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumTelefono(String value) {
        this.numTelefono = value;
    }

    /**
     * Obtiene el valor de la propiedad posicionFirma.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosicionFirma() {
        return posicionFirma;
    }

    /**
     * Define el valor de la propiedad posicionFirma.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosicionFirma(String value) {
        this.posicionFirma = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDocIdentidad.
     * 
     */
    public int getTipoDocIdentidad() {
        return tipoDocIdentidad;
    }

    /**
     * Define el valor de la propiedad tipoDocIdentidad.
     * 
     */
    public void setTipoDocIdentidad(int value) {
        this.tipoDocIdentidad = value;
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

}
