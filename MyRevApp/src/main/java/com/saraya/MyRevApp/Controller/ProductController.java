package com.saraya.MyRevApp.Controller;

import com.saraya.MyRevApp.Model.Product;
import com.saraya.MyRevApp.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@RestController
@RequestMapping("/product")
@AllArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping("/create")
    public Product create(@RequestBody Product product){
        return productService.create(product);
    }

    @GetMapping
    public List<Product> getAll(){
        return productService.getAll();
    }

    @PutMapping("/update/{id}")
    public Product update(@PathVariable Long id,@RequestBody Product product){
        return productService.update(id, product);
    }

    @DeleteMapping("/delete")
    public String delete(@PathVariable Long id){
        return productService.delete(id);
    }



}
