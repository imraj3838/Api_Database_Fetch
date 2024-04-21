package com.example.priyanshu.databasedesign1.Service;

import com.example.priyanshu.databasedesign1.Models.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    public List<Product> getAllProducts();

    // first implementation done by naman bhalla sir
    Optional<Product> getProductById(long id);

    //second implemantation done by naman bhalla sir but first by me
    Product addProduct(Product product);

    Product updateProduct(Long id, Product product);

    boolean deleteProduct(Long id);
}
