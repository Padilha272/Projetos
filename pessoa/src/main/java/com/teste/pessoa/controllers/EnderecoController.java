package com.teste.pessoa.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teste.pessoa.entities.Endereco;
import com.teste.pessoa.resources.EnderecoResource;

@RestController
@RequestMapping(value ="/endereco")
public class EnderecoController {
	
	@Autowired
	private EnderecoResource resource;
	
	@PostMapping
	public Endereco insert (@Valid @RequestBody Endereco endereco) {
		Endereco result = resource.save(endereco);
		return result;
	}

}
