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

import com.teste.pessoa.dto.EnderecoDto;
import com.teste.pessoa.entities.Endereco;
import com.teste.pessoa.entities.Endereco;
import com.teste.pessoa.resources.EnderecoResource;
import com.teste.pessoa.service.EnderecoService;

@RestController
@RequestMapping(value ="/endereco")
public class EnderecoController {
	
	@Autowired
	private EnderecoResource resource;
	
	
	
	  @Autowired
	private EnderecoService service;
	
	  @GetMapping
	public ResponseEntity<List<Endereco>> findAll(){
		List<Endereco> result = resource.findAll();
		return ResponseEntity.ok().body(result);
	}
	  @GetMapping(value = "/{id}")
	public Endereco findById(@PathVariable Long id) {
		Endereco result =  resource.findById(id).get();
		return result;
	}
	
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<EnderecoDto> update(@Valid @PathVariable Long id ,@RequestBody EnderecoDto dto ) {
	dto = service.update(id, dto);
	
	return ResponseEntity.ok().body(dto);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<EnderecoDto> delete(@Valid @PathVariable Long id){
		 service.delete(id);
		
		return ResponseEntity.noContent().build();
	}
	
	
	
	
	
	
	
	
	
	@PostMapping
	public Endereco insert (@Valid @RequestBody Endereco endereco) {
		Endereco result = resource.save(endereco);
		return result;
	}
	
	

}
