package com.teste.pessoa.dto;

import java.io.Serializable;


import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.teste.pessoa.entities.Endereco;
import com.teste.pessoa.entities.Pessoa;

public class PessoaDto implements Serializable{

	public static final Long serialVersionID = 1L;
	
	public Long id;
	public String nome;
	public String dataDeNascimento;
	public Endereco endereco;
	
	public PessoaDto() {

	}

	public PessoaDto(Long id, String nome, String dataDeNascimento, Endereco endereco) {
		this.id = id;
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.endereco = endereco;
	}

	public PessoaDto(Pessoa entity) {
		this.id = entity.getId();
		this.nome = entity.getNome();
		this.dataDeNascimento = entity.getDataDeNascimento();
		this.endereco = entity.getEndereco();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
	
	
	
}
