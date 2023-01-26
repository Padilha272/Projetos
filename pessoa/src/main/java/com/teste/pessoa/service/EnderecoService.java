package com.teste.pessoa.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.pessoa.dto.EnderecoDto;
import com.teste.pessoa.dto.PessoaDto;
import com.teste.pessoa.entities.Endereco;
import com.teste.pessoa.entities.Pessoa;
import com.teste.pessoa.resources.EnderecoResource;

@Service
public class EnderecoService {
	
	@Autowired
	private EnderecoResource resource;
	
	
	
	 @Transactional
	public EnderecoDto update(Long id, EnderecoDto dto) {
		Endereco entity = resource.getReferenceById(id);
		copyDtoToEntity(dto,entity);
		entity = resource.save(entity);
		return new EnderecoDto(entity);
				
	}
	 
	
	
	
	
	public void delete(Long id) {
		resource.deleteById(id);
	}
	
	private void copyDtoToEntity(EnderecoDto dto, Endereco entity) {
		entity.setId(dto.getId());
		entity.setLogradouro(dto.getLogradouro());
		entity.setCep(dto.getCep());
		entity.setNumero(dto.getNumero());
		
	}
}
