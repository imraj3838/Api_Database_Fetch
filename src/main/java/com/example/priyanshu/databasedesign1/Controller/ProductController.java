package com.example.priyanshu.databasedesign1.Controller;

import java.util.*;
import com.example.priyanshu.databasedesign1.Models.Product;
import com.example.priyanshu.databasedesign1.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping("/product")
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/{id}")
    Optional<Product> getProductById( @PathVariable("id") long id) {
        Optional<Product> productDTO = productService.getProductById(id);
        return productDTO;
    }

    @PostMapping("/save")
    public Product addProduct(@RequestBody Product product) {
        System.out.println("Hello Hello");

        return productService.addProduct(product);
    }

    @PatchMapping("/{id}")
    public Product updateProduct(@PathVariable("id") long id, @RequestBody Product product){
        return productService.updateProduct(id,product);
    }

    @GetMapping("/getall")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @DeleteMapping("/{id}")
    public boolean deleteProduct( @PathVariable("id") long id) {
       Boolean b = productService.deleteProduct(id);
       return b;
    }
}
