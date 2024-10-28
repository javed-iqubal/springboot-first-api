package com.springboot.api.service;

import com.springboot.api.models.Product;

import java.util.List;

public interface ProductService {
    Product save(Product product);
    Product update(Product product);
    String remove(Long id);
    Product findById(Long id);
    List<Product> findAll();
}
