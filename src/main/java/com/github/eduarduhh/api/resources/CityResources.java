package com.github.eduarduhh.api.resources;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.eduarduhh.api.entitiy.City;
import com.github.eduarduhh.api.repository.CityRepository;

@RestController
@RequestMapping("/city")
public class CityResources {
	
	@Autowired
	private CityRepository repository;
	
	
	@GetMapping
	public Page<City> countries(Pageable page){
		return repository.findAll(page);
	}
	@GetMapping("/{id}")
	public ResponseEntity getOne(@PathVariable("id") Long id) {
		
		Optional<City> option = repository.findById(id);
		
		if(option.isPresent()) {
			return ResponseEntity.ok().body(option.get());
		}else {
			return ResponseEntity.notFound().build();
		}
		 
	}
	
	
}
