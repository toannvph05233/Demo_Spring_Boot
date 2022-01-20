package com.codegym.vn.repository;

import com.codegym.vn.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface IProductRepo extends CrudRepository<Product,Long> {
}
