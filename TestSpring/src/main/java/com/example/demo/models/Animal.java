package com.example.demo.models;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Animal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String scientificName;
	private Integer expectedLifeTime;
	
	public Animal() {
		
	}

	public Animal(Integer id, String name, String scientificName, Integer expectedLifeTime) {
		this.id = id;
		this.name = name;
		this.scientificName = scientificName;
		this.expectedLifeTime = expectedLifeTime;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getScientificName() {
		return scientificName;
	}

	public void setScientificName(String scientificName) {
		this.scientificName = scientificName;
	}

	public Integer getExpectedLifeTime() {
		return expectedLifeTime;
	}

	public void setExpectedLifeTime(Integer expectedLifeTime) {
		this.expectedLifeTime = expectedLifeTime;
	}

	@Override
	public int hashCode() {
		return Objects.hash(expectedLifeTime, id, name, scientificName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return Objects.equals(expectedLifeTime, other.expectedLifeTime) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name) && Objects.equals(scientificName, other.scientificName);
	}
	
	
	
	
	
}
