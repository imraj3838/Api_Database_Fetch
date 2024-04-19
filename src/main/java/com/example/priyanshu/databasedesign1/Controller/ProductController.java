package com.example.priyanshu.databasedesign1.Controller;

import com.example.priyanshu.databasedesign1.Models.Product;
import com.example.priyanshu.databasedesign1.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RequestMapping("/product")
@RestController
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping("/{id}")
    Optional<Product> getProductById( @PathVariable("id") long id) {
        Optional<Product> productDTO = productService.getProductById(id);
        return productDTO;
    }
}
