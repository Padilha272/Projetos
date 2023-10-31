package com.example.demo.resources;

import java.net.URI;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.models.Animal;
import com.example.demo.services.AnimalService;

@Controller
@RequestMapping(value = "/animals")
public class AnimalResource {
	
	@Autowired
	private AnimalService animalService;
	
	@GetMapping
	public ResponseEntity<Map<String,Object>> findAllAnimals(){
		List<Animal> list = animalService.getAllAnimals();
		
		Map<String, Object>response = new LinkedHashMap<>();				
		response.put("message","Lista de animais recuperada com sucesso");
		response.put("animals", list);
		return ResponseEntity.ok().body(response);
	}
	
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Optional<Animal>> findById(@PathVariable Integer id) {
		Optional<Animal> animal = animalService.findById(id);
		return ResponseEntity.ok().body(animal);
	}

	@PostMapping
	public ResponseEntity<Animal> insert (@RequestBody Animal obj){
		obj = animalService.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).body(obj);
	}
}
