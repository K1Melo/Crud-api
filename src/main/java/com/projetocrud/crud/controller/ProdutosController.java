package com.projetocrud.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projetocrud.crud.model.entitie.Produto;
import com.projetocrud.crud.model.repository.ProdutoRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping(path = "/api/produtos")
public class ProdutosController {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@GetMapping
	public Iterable<Produto> getAllProducts() {
		return produtoRepository.findAll();
	}
	
	@RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
	public Produto postProduct(@Valid Produto produto) {
		produtoRepository.save(produto);
		return produto;
	}
	
	@DeleteMapping(path = "/{id}")
	public void deleteProduct(@PathVariable int id) {
		produtoRepository.deleteById(id);
	}
}
