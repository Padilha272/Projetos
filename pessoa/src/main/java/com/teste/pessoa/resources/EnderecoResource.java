package com.teste.pessoa.resources;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teste.pessoa.entities.Endereco;

public interface EnderecoResource extends JpaRepository<Endereco,Long> {

}
