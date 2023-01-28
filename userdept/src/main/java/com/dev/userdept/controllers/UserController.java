package com.dev.userdept.controllers;

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

import com.dev.userdept.dto.UserDto;
import com.dev.userdept.entities.User;
import com.dev.userdept.repositories.UserRepository;
import com.dev.userdept.service.UserService;


@RestController
@RequestMapping(value = "/users")
public class UserController {

	@Autowired
	private UserRepository repository;
	
	@Autowired
	private UserService service;
	
	@GetMapping
	public List<User> findAll(){
		List<User>result =  repository.findAll();
		return result;
	}
	
	@GetMapping(value = "/{id}")
	public User findById(@PathVariable Long id){
		User result =  repository.findById(id).get();
		return result;
	}
	
	@PostMapping
	public User insert(@RequestBody User user){
		User result =  repository.save(user);
		return result;
	}
	@PutMapping(value = "/{id}")
	public ResponseEntity<UserDto> update(@Valid @PathVariable Long id, @RequestBody UserDto dto){
		dto = service.update(id, dto);		
		return ResponseEntity.ok().body(dto);
	}
	
	 @DeleteMapping(value = "/{id}")
	public ResponseEntity<UserDto> delete(@Valid @PathVariable Long id){
		 service.delete(id);	
		return ResponseEntity.noContent().build();
	}
	 
	
	
	
}
