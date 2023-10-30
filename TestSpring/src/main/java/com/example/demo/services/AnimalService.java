package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Animal;
import com.example.demo.repositories.AnimalRepository;

@Service
public class AnimalService {

	@Autowired
	private AnimalRepository animalRepository;
	
	public List<Animal> getAllAnimals(){
		List<Animal>list=animalRepository.findAll();
		return list;
	}

}
