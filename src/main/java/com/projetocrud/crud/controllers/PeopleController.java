package com.projetocrud.crud.controllers;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projetocrud.crud.models.People;
import com.projetocrud.crud.models.repositories.PeopleRepositorie;

import jakarta.validation.Valid;

@RestController
@RequestMapping(path = "/people")
public class PeopleController {
	
//	@Autowired
	private PeopleRepositorie repository = new PeopleRepositorie() {
		
		@Override
		public <S extends People> Iterable<S> saveAll(Iterable<S> entities) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public <S extends People> S save(S entity) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Optional<People> findById(Integer id) {
			// TODO Auto-generated method stub
			return Optional.empty();
		}
		
		@Override
		public Iterable<People> findAllById(Iterable<Integer> ids) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Iterable<People> findAll() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public boolean existsById(Integer id) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public void deleteById(Integer id) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void deleteAllById(Iterable<? extends Integer> ids) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void deleteAll(Iterable<? extends People> entities) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void deleteAll() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void delete(People entity) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public long count() {
			// TODO Auto-generated method stub
			return 0;
		}
	};
	
	@GetMapping
	public Iterable<People> getPeople(){
		return repository.findAll();
	}
	
	@RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
	public People postPeople(@Valid People people) {
		repository.save(people);
		return people;
	}
	
	
}
