/*
 * Classe DispositivoEntity 
 * É a classe utilizada pelo Jersey para fazer 
 * o envio das informações coletadas do banco de dados
 * e passar para o cliente.
 * 
 */
package com.projeto.http;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DispositivoEntity {
		
	private Integer id;
		
	private String nome;
		
	private String status;
		
	private String numeroIp;
		
	private String nomeProprietario;
	
	private String nomeFabricante;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getNumeroIp() {
		return numeroIp;
	}

	public void setNumeroIp(String numeroIp) {
		this.numeroIp = numeroIp;
	}

	public String getNomeProprietario() {
		return nomeProprietario;
	}

	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}

	public String getNomeFabricante() {
		return nomeFabricante;
	}

	public void setNomeFabricante(String nomeFabricante) {
		this.nomeFabricante = nomeFabricante;
	}
	
}
