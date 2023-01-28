package com.dev.userdept.dto;

import java.io.Serializable;

import com.dev.userdept.entities.Department;

public class DepartmentDto implements Serializable {

	public static final Long serialVersionID = 1L;
	
	private Long id;
	private String name;
	
	public DepartmentDto() {
		
	}

	public DepartmentDto(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public DepartmentDto(Department entity) {
		this.id = entity.getId();
		this.name = entity.getName();
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
	
	
	
	
	
	
	
	
	
	
	
}
