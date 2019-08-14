
package com.softnet.watched.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para registroNotificacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="registroNotificacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="usuario_admin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pass_admin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empresa" type="{http://notificacion.softnet.com}empresaBean" minOccurs="0"/>
 *         &lt;element name="usuarios" type="{http://notificacion.softnet.com}usuarioBean" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="documentos" type="{http://notificacion.softnet.com}documentoBean" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nombre_proceso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="minimo_firmantes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="timeout" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="unidad_tiempo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="comentario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registroNotificacion", propOrder = {
    "usuarioAdmin",
    "passAdmin",
    "empresa",
    "usuarios",
    "documentos",
    "nombreProceso",
    "minimoFirmantes",
    "timeout",
    "unidadTiempo",
    "comentario"
})
public class RegistroNotificacion {

    @XmlElement(name = "usuario_admin")
    protected String usuarioAdmin;
    @XmlElement(name = "pass_admin")
    protected String passAdmin;
    protected EmpresaBean empresa;
    protected List<UsuarioBean> usuarios;
    protected List<DocumentoBean> documentos;
    @XmlElement(name = "nombre_proceso")
    protected String nombreProceso;
    @XmlElement(name = "minimo_firmantes")
    protected int minimoFirmantes;
    protected int timeout;
    @XmlElement(name = "unidad_tiempo")
    protected int unidadTiempo;
    protected String comentario;

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
     * Obtiene el valor de la propiedad empresa.
     * 
     * @return
     *     possible object is
     *     {@link EmpresaBean }
     *     
     */
    public EmpresaBean getEmpresa() {
        return empresa;
    }

    /**
     * Define el valor de la propiedad empresa.
     * 
     * @param value
     *     allowed object is
     *     {@link EmpresaBean }
     *     
     */
    public void setEmpresa(EmpresaBean value) {
        this.empresa = value;
    }

    /**
     * Gets the value of the usuarios property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usuarios property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsuarios().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UsuarioBean }
     * 
     * 
     */
    public List<UsuarioBean> getUsuarios() {
        if (usuarios == null) {
            usuarios = new ArrayList<UsuarioBean>();
        }
        return this.usuarios;
    }

    /**
     * Gets the value of the documentos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentoBean }
     * 
     * 
     */
    public List<DocumentoBean> getDocumentos() {
        if (documentos == null) {
            documentos = new ArrayList<DocumentoBean>();
        }
        return this.documentos;
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
     * Obtiene el valor de la propiedad minimoFirmantes.
     * 
     */
    public int getMinimoFirmantes() {
        return minimoFirmantes;
    }

    /**
     * Define el valor de la propiedad minimoFirmantes.
     * 
     */
    public void setMinimoFirmantes(int value) {
        this.minimoFirmantes = value;
    }

    /**
     * Obtiene el valor de la propiedad timeout.
     * 
     */
    public int getTimeout() {
        return timeout;
    }

    /**
     * Define el valor de la propiedad timeout.
     * 
     */
    public void setTimeout(int value) {
        this.timeout = value;
    }

    /**
     * Obtiene el valor de la propiedad unidadTiempo.
     * 
     */
    public int getUnidadTiempo() {
        return unidadTiempo;
    }

    /**
     * Define el valor de la propiedad unidadTiempo.
     * 
     */
    public void setUnidadTiempo(int value) {
        this.unidadTiempo = value;
    }

    /**
     * Obtiene el valor de la propiedad comentario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComentario() {
        return comentario;
    }

    /**
     * Define el valor de la propiedad comentario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComentario(String value) {
        this.comentario = value;
    }

}
