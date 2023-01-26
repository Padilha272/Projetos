package com.teste.pessoa.resources;
import org.springframework.data.jpa.repository.JpaRepository;
import com.teste.pessoa.entities.Pessoa;



public interface PessoaResource extends JpaRepository<Pessoa, Long> {
	
	
	
	
}
