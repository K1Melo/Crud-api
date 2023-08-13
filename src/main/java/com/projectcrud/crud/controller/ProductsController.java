package com.projectcrud.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.projectcrud.crud.model.entitie.Product;
import com.projectcrud.crud.model.repository.ProductRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping(path = "/api/products")
public class ProductsController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@GetMapping
	public Iterable<Product> getAllProducts() {
		return productRepository.findAll();
	}
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@GetMapping(path = "/{id}")
	public void getElementById(@PathVariable int id) {
		productRepository.findById(id);
	}
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
	public Product saveProduct(@Valid Product product) {
		productRepository.save(product);
		return product;
	}
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@DeleteMapping
	public void deleteProduct(@RequestParam int id) {
		productRepository.deleteById(id);
	}
}
