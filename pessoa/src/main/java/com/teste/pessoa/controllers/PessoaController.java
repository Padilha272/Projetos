package com.teste.pessoa.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teste.pessoa.dto.PessoaDto;
import com.teste.pessoa.entities.Pessoa;
import com.teste.pessoa.resources.PessoaResource;
import com.teste.pessoa.service.PessoaService;



@RestController
@RequestMapping(value = "/pessoas")
public class PessoaController {
	
	@Autowired
	private PessoaResource resource;
	
	@Autowired
	private PessoaService service;
	
	@GetMapping
	public ResponseEntity<List<Pessoa>> findAll(){
		List<Pessoa> result = resource.findAll();
		return ResponseEntity.ok().body(result);
	}
	
	@GetMapping(value = "/{id}")
	public Pessoa findById(@PathVariable Long id) {
		Pessoa result =  resource.findById(id).get();
		return result;
	}

	@PostMapping
	public Pessoa insert(@Valid @RequestBody Pessoa pessoa) {
		Pessoa result = resource.save(pessoa);
		return result;
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<PessoaDto> update(@Valid @PathVariable Long id ,@RequestBody PessoaDto dto ) {
	dto = service.update(id, dto);
	
	return ResponseEntity.ok().body(dto);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<PessoaDto> delete(@Valid @PathVariable Long id){
		 service.delete(id);
		
		return ResponseEntity.noContent().build();
	}
	
	
}
