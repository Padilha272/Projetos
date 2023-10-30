package com.example.demo.database;


import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.models.Animal;
import com.example.demo.repositories.AnimalRepository;

@Component
public class DatabaseLoader implements CommandLineRunner{

	@Autowired
	private AnimalRepository animalRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Animal animal1 = new Animal(null,"Cachorro", "Canis lupus familiaris", 12);
	    Animal animal2 = new Animal(null,"Gato", "Felis catus", 18);
	    Animal animal3 = new Animal(null,"Leão", "Panthera leo", 16);
	    
	    animalRepository.saveAll(Arrays.asList(animal1,animal2,animal3));
		
		
	}

}
