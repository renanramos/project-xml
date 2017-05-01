//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2017.04.29 às 11:40:37 PM BRT 
//


package com.projeto.entity.generated;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.thoughtworks.xstream.XStream;


/**
 * <p>Classe Java de Dispositivo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Dispositivo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numeroIp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="nomePropietario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nomeFabricante" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@Entity
@Table(name="dispositivo")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dispositivo", propOrder = {
    "id",
    "nome",
    "numeroIp",
    "status",
    "nomeProprietario",
    "nomeFabricante"
})
public class Dispositivo {

	@Id
	private Integer id;
	
	@Column(nullable=false)
	@XmlElement(required = true)
	private String nome;
	
	@Column(name="numero_ip",nullable=false)
	@XmlElement(required = true)
	private String numeroIp;
	
	@Column(nullable=false)
	@XmlElement
	private String status;
	
	@Column(name="nome_proprietario", nullable=false)
	@XmlElement(required = true)
	private String nomeProprietario;
	
	@Column(name="nome_fabricante", nullable=false)
	@XmlElement(required = true)
	private String nomeFabricante;
	
    /**
     * Obtém o valor da propriedade id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o valor da propriedade nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Obtém o valor da propriedade numeroIp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroIp() {
        return numeroIp;
    }

    /**
     * Define o valor da propriedade numeroIp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroIp(String value) {
        this.numeroIp = value;
    }

    /**
     * Obtém o valor da propriedade status.
     * 
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define o valor da propriedade status.
     * 
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Obtém o valor da propriedade nomePropietario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomePropietario() {
        return nomeProprietario;
    }

    /**
     * Define o valor da propriedade nomePropietario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomePropietario(String value) {
        this.nomeProprietario = value;
    }

    /**
     * Obtém o valor da propriedade nomeFabricante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeFabricante() {
        return nomeFabricante;
    }

    /**
     * Define o valor da propriedade nomeFabricante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeFabricante(String value) {
        this.nomeFabricante = value;
    }

    public String toXml(){
    	return new XStream().toXML(this);
    }
    
}
