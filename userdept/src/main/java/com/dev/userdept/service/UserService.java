package com.dev.userdept.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.userdept.dto.UserDto;
import com.dev.userdept.entities.User;
import com.dev.userdept.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	@Transactional
	public UserDto update(Long id,UserDto dto) {
		User entity = repository.getReferenceById(id);
		copyToDto(entity,dto);
		entity = repository.save(entity);
		return new UserDto(entity);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
		
	
	private void copyToDto(User entity, UserDto dto) {
		entity.setDepartment(dto.getDepartment());
		entity.setId(dto.getId());
		entity.setName(dto.getName());
		entity.setEmail(dto.getEmail());
								
		
	}
	
}
