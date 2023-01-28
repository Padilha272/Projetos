package com.dev.userdept.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.userdept.dto.DepartmentDto;
import com.dev.userdept.dto.UserDto;
import com.dev.userdept.entities.Department;
import com.dev.userdept.entities.User;
import com.dev.userdept.repositories.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository repository;
	
	public DepartmentDto update(Long id, DepartmentDto dto) {
		Department entity = repository.getReferenceById(id);
		copyToDto(entity,dto);
		entity = repository.save(entity);
		return new DepartmentDto(entity);
		
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	
	 private void copyToDto(Department entity, DepartmentDto dto) {
		entity.setName(dto.getName());
										
	}
	 
	
}
