package com.saraya.MyRevApp.service;

import com.saraya.MyRevApp.Model.Product;

import java.util.List;

public interface ProductService {
    Product create(Product product);
    List<Product> getAll();
    Product update(Long id, Product product);
    String delete(Long id);
}
