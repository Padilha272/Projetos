package com.teste.pessoa.entities;



import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_pessoa")
public class Pessoa implements Serializable{
	
	public static final Long serialVersionID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	public String nome;
	public LocalDate dataDeNascimento;
	
	@ManyToOne
	@JoinColumn(name = "endereco_id")
	public Endereco endereco;
	
	public Pessoa() {
		
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

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	
/*
 * INSERT INTO tb_pessoa(endereco_id, nome, dataDeNascimento) VALUES (1, 'Maria', TIMESTAMP WITH TIME ZONE '1994-06-02');
   INSERT INTO tb_pessoa(endereco_id, nome, dataDeNascimento) VALUES (2, 'luis', TIMESTAMP WITH TIME ZONE '1990-12-04');
 * 
 */
	
	
}
