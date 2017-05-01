/*
 * Classe Dispositivo
 * 
 * Esta classe é utilizada para mapaeamento e uso 
 * dos frameworks JPA e Hibernate e é utilizado
 * as suas anotações.
 * 
 */

package com.projeto.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dispositivo")
public class Dispositivo {

	@Id
	private Integer id;
	
	@Column
	private String nome;
	
	@Column
	private String status;
	
	@Column(name="numero_ip")
	private String numeroIp;
	
	@Column(name="nome_proprietario")
	private String nomeProprietario;
	
	@Column(name="nome_fabricante")
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

	@Override
	public String toString() {
		return "Dispositivo [id=" + id + ", nome=" + nome + ", status="
				+ status + ", numeroIp=" + numeroIp + ", nomeProprietario="
				+ nomeProprietario + ", nomeFabricante=" + nomeFabricante + "]";
	}
	
}
