
package com.softnet.watched.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para resultadoNotificacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultadoNotificacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cod_not_referencia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="comentario_proceso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcion_cierre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcion_estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentos_firmados" type="{http://notificacion.softnet.com}documentoBean" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fecha_cierre" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fecha_registro" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="firmantes" type="{http://notificacion.softnet.com}estadoFirmanteBean" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nombre_proceso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipo_cierre" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultadoNotificacion", propOrder = {
    "codNotReferencia",
    "comentarioProceso",
    "descripcionCierre",
    "descripcionEstado",
    "documentosFirmados",
    "estado",
    "fechaCierre",
    "fechaRegistro",
    "firmantes",
    "nombreProceso",
    "tipoCierre"
})
public class ResultadoNotificacion {

    @XmlElement(name = "cod_not_referencia")
    protected int codNotReferencia;
    @XmlElement(name = "comentario_proceso")
    protected String comentarioProceso;
    @XmlElement(name = "descripcion_cierre")
    protected String descripcionCierre;
    @XmlElement(name = "descripcion_estado")
    protected String descripcionEstado;
    @XmlElement(name = "documentos_firmados", nillable = true)
    protected List<DocumentoBean> documentosFirmados;
    protected int estado;
    @XmlElement(name = "fecha_cierre")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaCierre;
    @XmlElement(name = "fecha_registro")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaRegistro;
    @XmlElement(nillable = true)
    protected List<EstadoFirmanteBean> firmantes;
    @XmlElement(name = "nombre_proceso")
    protected String nombreProceso;
    @XmlElement(name = "tipo_cierre")
    protected int tipoCierre;

    /**
     * Obtiene el valor de la propiedad codNotReferencia.
     * 
     */
    public int getCodNotReferencia() {
        return codNotReferencia;
    }

    /**
     * Define el valor de la propiedad codNotReferencia.
     * 
     */
    public void setCodNotReferencia(int value) {
        this.codNotReferencia = value;
    }

    /**
     * Obtiene el valor de la propiedad comentarioProceso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComentarioProceso() {
        return comentarioProceso;
    }

    /**
     * Define el valor de la propiedad comentarioProceso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComentarioProceso(String value) {
        this.comentarioProceso = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionCierre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionCierre() {
        return descripcionCierre;
    }

    /**
     * Define el valor de la propiedad descripcionCierre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionCierre(String value) {
        this.descripcionCierre = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionEstado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionEstado() {
        return descripcionEstado;
    }

    /**
     * Define el valor de la propiedad descripcionEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionEstado(String value) {
        this.descripcionEstado = value;
    }

    /**
     * Gets the value of the documentosFirmados property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentosFirmados property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentosFirmados().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentoBean }
     * 
     * 
     */
    public List<DocumentoBean> getDocumentosFirmados() {
        if (documentosFirmados == null) {
            documentosFirmados = new ArrayList<DocumentoBean>();
        }
        return this.documentosFirmados;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     */
    public int getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     */
    public void setEstado(int value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaCierre.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaCierre() {
        return fechaCierre;
    }

    /**
     * Define el valor de la propiedad fechaCierre.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaCierre(XMLGregorianCalendar value) {
        this.fechaCierre = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaRegistro.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaRegistro() {
        return fechaRegistro;
    }

    /**
     * Define el valor de la propiedad fechaRegistro.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaRegistro(XMLGregorianCalendar value) {
        this.fechaRegistro = value;
    }

    /**
     * Gets the value of the firmantes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the firmantes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFirmantes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EstadoFirmanteBean }
     * 
     * 
     */
    public List<EstadoFirmanteBean> getFirmantes() {
        if (firmantes == null) {
            firmantes = new ArrayList<EstadoFirmanteBean>();
        }
        return this.firmantes;
    }

    /**
     * Obtiene el valor de la propiedad nombreProceso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreProceso() {
        return nombreProceso;
    }

    /**
     * Define el valor de la propiedad nombreProceso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreProceso(String value) {
        this.nombreProceso = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCierre.
     * 
     */
    public int getTipoCierre() {
        return tipoCierre;
    }

    /**
     * Define el valor de la propiedad tipoCierre.
     * 
     */
    public void setTipoCierre(int value) {
        this.tipoCierre = value;
    }

}
