package com.teste.pessoa.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.teste.pessoa.entities.Pessoa;



public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
	
	
}
