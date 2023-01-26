package com.teste.pessoa.dto;

import java.io.Serializable;

import com.teste.pessoa.entities.Endereco;

public class EnderecoDto implements Serializable{
	
	public static final Long serialVersionID = 1L;
	
	public Long id;
	public String logradouro;
	public String cep;
	public int numero;
	
	public EnderecoDto() {
		
	}

	public EnderecoDto(Long id, String logradouro, String cep, int numero) {
		this.id = id;
		this.logradouro = logradouro;
		this.cep = cep;
		this.numero = numero;
	}
	public EnderecoDto(Endereco entity) {
		this.id = entity.getId();
		this.logradouro = entity.getLogradouro();
		this.cep = entity.getCep();
		this.numero = entity.getNumero();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	

}
