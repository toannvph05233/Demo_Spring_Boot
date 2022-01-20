package com.codegym.vn.service;

import com.codegym.vn.model.Product;
import com.codegym.vn.repository.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    IProductRepo iProductRepo;

    @Override
    public List<Product> findAll() {
        return (List<Product>) iProductRepo.findAll();
    }

    @Override
    public Product findById(long id) {
        return iProductRepo.findById(id).get();
    }

    @Override
    public void save(Product product) {
        iProductRepo.save(product);
    }

    @Override
    public void delete(long id) {
        iProductRepo.deleteById(id);
    }
}
