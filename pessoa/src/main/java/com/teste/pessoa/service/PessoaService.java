package com.teste.pessoa.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.pessoa.dto.PessoaDto;
import com.teste.pessoa.entities.Pessoa;
import com.teste.pessoa.repositories.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository resource;
		
	@Transactional
	public PessoaDto update(Long id, PessoaDto dto) {
		Pessoa entity = resource.getReferenceById(id);
		copyDtoToEntity(dto,entity);
		entity = resource.save(entity);
		return new PessoaDto(entity);
				
	}
	
	
	public void delete(Long id) {
		resource.deleteById(id);
	}
	
	private void copyDtoToEntity(PessoaDto dto, Pessoa entity) {
		entity.setId(dto.getId());
		entity.setNome(dto.getNome());
		entity.setDataDeNascimento(dto.getDataDeNascimento());
		entity.setEndereco(dto.getEndereco());
		
	}
	
	
	
}
