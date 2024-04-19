package com.example.priyanshu.databasedesign1.Service;

import com.example.priyanshu.databasedesign1.Models.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    public List<Product> getAllProducts();
//    Optional<Product> getProductById(int id);

    Optional<Product> getProductById(long id);

    Product replaceProduct(Long is, Product product);
    Product addProduct(Product product);
    Product updateProduct(Long id, Product product);
    boolean deleteProduct(Long id);
}
