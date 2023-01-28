package com.teste.pessoa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teste.pessoa.entities.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco,Long> {

}
