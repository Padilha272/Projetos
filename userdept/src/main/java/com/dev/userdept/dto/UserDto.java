package com.dev.userdept.dto;

import java.io.Serializable;

import com.dev.userdept.entities.Department;
import com.dev.userdept.entities.User;

public class UserDto implements Serializable {

	public static final Long serialVersionID = 1L;
	
	private Long id;
	private String name;
	private String email;
	private Department department;
	
	
	public UserDto() {
		
	}


	public UserDto(Long id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.department = department;
	}
	
	public UserDto(User entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.email = entity.getEmail();
		this.department = entity.getDepartment();
	}

	
	
	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
}
