package com.projetocrud.crud.model.repository;

import org.springframework.data.repository.CrudRepository;

import com.projetocrud.crud.model.entitie.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer>{

}
