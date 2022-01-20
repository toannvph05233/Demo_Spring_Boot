package com.codegym.vn.service;

import com.codegym.vn.model.Product;

import java.util.List;

public interface IProductService {
    public List<Product> findAll();
    public Product findById(long id);
    public void save(Product product);
    public void delete(long id);
}
