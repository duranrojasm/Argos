
package com.softnet.watched.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para documento complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="documento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cod_documento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cod_notificacion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="documento" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="id_regu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nom_tipo_documento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombre_documento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ruta_origen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipo_documento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "documento", propOrder = {
    "codDocumento",
    "codNotificacion",
    "documento",
    "idRegu",
    "nomTipoDocumento",
    "nombreDocumento",
    "rutaOrigen",
    "tipoDocumento"
})
public class Documento {

    @XmlElement(name = "cod_documento")
    protected int codDocumento;
    @XmlElement(name = "cod_notificacion")
    protected int codNotificacion;
    protected byte[] documento;
    @XmlElement(name = "id_regu")
    protected Integer idRegu;
    @XmlElement(name = "nom_tipo_documento")
    protected String nomTipoDocumento;
    @XmlElement(name = "nombre_documento")
    protected String nombreDocumento;
    @XmlElement(name = "ruta_origen")
    protected String rutaOrigen;
    @XmlElement(name = "tipo_documento")
    protected int tipoDocumento;

    /**
     * Obtiene el valor de la propiedad codDocumento.
     * 
     */
    public int getCodDocumento() {
        return codDocumento;
    }

    /**
     * Define el valor de la propiedad codDocumento.
     * 
     */
    public void setCodDocumento(int value) {
        this.codDocumento = value;
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
     * Obtiene el valor de la propiedad documento.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDocumento() {
        return documento;
    }

    /**
     * Define el valor de la propiedad documento.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDocumento(byte[] value) {
        this.documento = value;
    }

    /**
     * Obtiene el valor de la propiedad idRegu.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdRegu() {
        return idRegu;
    }

    /**
     * Define el valor de la propiedad idRegu.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdRegu(Integer value) {
        this.idRegu = value;
    }

    /**
     * Obtiene el valor de la propiedad nomTipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomTipoDocumento() {
        return nomTipoDocumento;
    }

    /**
     * Define el valor de la propiedad nomTipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomTipoDocumento(String value) {
        this.nomTipoDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreDocumento() {
        return nombreDocumento;
    }

    /**
     * Define el valor de la propiedad nombreDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreDocumento(String value) {
        this.nombreDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad rutaOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRutaOrigen() {
        return rutaOrigen;
    }

    /**
     * Define el valor de la propiedad rutaOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRutaOrigen(String value) {
        this.rutaOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDocumento.
     * 
     */
    public int getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Define el valor de la propiedad tipoDocumento.
     * 
     */
    public void setTipoDocumento(int value) {
        this.tipoDocumento = value;
    }

}
