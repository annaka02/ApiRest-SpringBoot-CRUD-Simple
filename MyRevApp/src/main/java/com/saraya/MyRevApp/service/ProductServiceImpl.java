package com.saraya.MyRevApp.service;

import com.saraya.MyRevApp.Model.Product;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.saraya.MyRevApp.repository.ProductRepo;
import java.util.List;
@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService{

    private final ProductRepo productRepo;
    @Override
    public Product create(Product product) {
        return productRepo.save(product);
    }

    @Override
    public List<Product> getAll() {
        return productRepo.findAll();
    }

    @Override
    public Product update(Long id, Product product) {
        return productRepo.findById(id).map(p->{
            p.setPrice(p.getPrice());
            p.setName(p.getName());
            p.setDescription(p.getDescription());
            return productRepo.save(p);
        }).orElseThrow(() -> new RuntimeException("Product not found"));
    }

    @Override
    public String delete(Long id) {
        productRepo.deleteById(id);
        return "Product deleted successfully";
    }
}
