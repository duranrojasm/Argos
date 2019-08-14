
package com.softnet.watched.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para estadoFirmanteBean complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="estadoFirmanteBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="correo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="doc_identidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fecha_envio_notificacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fecha_firma_digital" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fecha_recepcion_notificacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fecha_visualizacion_contrato" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="nombre_usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipo_usuario" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="val_tipo_usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "estadoFirmanteBean", propOrder = {
    "correo",
    "docIdentidad",
    "empresa",
    "fechaEnvioNotificacion",
    "fechaFirmaDigital",
    "fechaRecepcionNotificacion",
    "fechaVisualizacionContrato",
    "nombreUsuario",
    "tipoUsuario",
    "valTipoUsuario"
})
public class EstadoFirmanteBean {

    protected String correo;
    @XmlElement(name = "doc_identidad")
    protected String docIdentidad;
    protected String empresa;
    @XmlElement(name = "fecha_envio_notificacion")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaEnvioNotificacion;
    @XmlElement(name = "fecha_firma_digital")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaFirmaDigital;
    @XmlElement(name = "fecha_recepcion_notificacion")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaRecepcionNotificacion;
    @XmlElement(name = "fecha_visualizacion_contrato")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaVisualizacionContrato;
    @XmlElement(name = "nombre_usuario")
    protected String nombreUsuario;
    @XmlElement(name = "tipo_usuario")
    protected int tipoUsuario;
    @XmlElement(name = "val_tipo_usuario")
    protected String valTipoUsuario;

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
     * Obtiene el valor de la propiedad empresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpresa() {
        return empresa;
    }

    /**
     * Define el valor de la propiedad empresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpresa(String value) {
        this.empresa = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEnvioNotificacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaEnvioNotificacion() {
        return fechaEnvioNotificacion;
    }

    /**
     * Define el valor de la propiedad fechaEnvioNotificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaEnvioNotificacion(XMLGregorianCalendar value) {
        this.fechaEnvioNotificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaFirmaDigital.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaFirmaDigital() {
        return fechaFirmaDigital;
    }

    /**
     * Define el valor de la propiedad fechaFirmaDigital.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaFirmaDigital(XMLGregorianCalendar value) {
        this.fechaFirmaDigital = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaRecepcionNotificacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaRecepcionNotificacion() {
        return fechaRecepcionNotificacion;
    }

    /**
     * Define el valor de la propiedad fechaRecepcionNotificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaRecepcionNotificacion(XMLGregorianCalendar value) {
        this.fechaRecepcionNotificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaVisualizacionContrato.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaVisualizacionContrato() {
        return fechaVisualizacionContrato;
    }

    /**
     * Define el valor de la propiedad fechaVisualizacionContrato.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaVisualizacionContrato(XMLGregorianCalendar value) {
        this.fechaVisualizacionContrato = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * Define el valor de la propiedad nombreUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreUsuario(String value) {
        this.nombreUsuario = value;
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
     * Obtiene el valor de la propiedad valTipoUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValTipoUsuario() {
        return valTipoUsuario;
    }

    /**
     * Define el valor de la propiedad valTipoUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValTipoUsuario(String value) {
        this.valTipoUsuario = value;
    }

}
