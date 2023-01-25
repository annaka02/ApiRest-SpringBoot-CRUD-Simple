package com.saraya.MyRevApp.repository;

import com.saraya.MyRevApp.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long> {
}
