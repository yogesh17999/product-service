package com.productservice.productservice.repository;

import com.productservice.productservice.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String> {
}
