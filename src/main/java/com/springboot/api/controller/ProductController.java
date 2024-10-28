package com.springboot.api.controller;


import com.springboot.api.models.Product;
import com.springboot.api.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1")
public class ProductController {

    @Autowired
    private ProductServiceImpl service;

    @GetMapping("product/{id}")
    public Product getProduct(@PathVariable("id") Long id){
        return service.findById(id);
    }

    @GetMapping("products")
    public List<Product> getProducts(){
        return service.findAll();
    }

    @PostMapping("product")
    public Product save(@RequestBody Product product){
        return service.save(product);
    }

    @PutMapping("product")
    public Product update(@RequestBody Product product){
        return service.update(product);
    }

    @DeleteMapping("product/{id}")
    public String remove(@PathVariable("id") Long id){
        return service.remove(id);
    }
}
