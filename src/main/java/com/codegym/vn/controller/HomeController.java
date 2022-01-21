package com.codegym.vn.controller;

import com.codegym.vn.model.Product;
import com.codegym.vn.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@CrossOrigin("*")
public class HomeController {
    @Autowired
    IProductService productService;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> show() {
        return new ResponseEntity<>(productService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/products")
    public ResponseEntity<Product> create(@RequestBody Product product) {
        productService.save(product);
        return new ResponseEntity<>(product,HttpStatus.OK);

    }

    @DeleteMapping("/products/{id}")
    public void delete(@PathVariable long id) {
        productService.delete(id);
    }

    @PutMapping("/products/{id}")
    public void update(@RequestBody Product product) {
        productService.save(product);
    }
}
