package com.example.demo.resources;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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

}
