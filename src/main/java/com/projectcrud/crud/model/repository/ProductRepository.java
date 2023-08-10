package com.projectcrud.crud.model.repository;

import org.springframework.data.repository.CrudRepository;

import com.projectcrud.crud.model.entitie.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{

}
