package com.projetocrud.crud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetocrud.crud.models.People;
import com.projetocrud.crud.models.repositories.PeopleRepositorie;

@RestController
@RequestMapping(path = "/api/people")
public class PeopleController {
	
	@Autowired
	private PeopleRepositorie peopleRepositorie;
	
	@GetMapping(path = "/get")
	public Iterable<People> getPeople() {
		return peopleRepositorie.findAll();
	}
	
	@PostMapping(path = "/post")
	public People postPeople(People people) {
		peopleRepositorie.save(people);
		return people;
	}
}
