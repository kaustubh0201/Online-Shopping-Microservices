package com.practice.springboot.productservice.repository;

import com.practice.springboot.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {



}
