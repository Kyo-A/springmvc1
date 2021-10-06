package org.eclipse.firstspringmvc.controller;

import java.util.List;

import org.eclipse.firstspringmvc.dao.PersonneRepository;
import org.eclipse.firstspringmvc.model.Personne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restapi")
public class PersonneRestController {
	
	@Autowired
	private PersonneRepository personneRepository;
	
	@GetMapping("/personnes")
	public String getPersonnes(){
		return personneRepository.findAll().toString();
	}
	
	@GetMapping("/personnes/{id}")
	public String getPersonne(@PathVariable("id") long id) {
		return personneRepository.findById(id).orElse(null).toString();
	}
	
	@DeleteMapping("/personnes/{id}")
	public boolean deletePersonne(@PathVariable("id") long id) {
		personneRepository.deleteById(id);
		return true;
	}
}
