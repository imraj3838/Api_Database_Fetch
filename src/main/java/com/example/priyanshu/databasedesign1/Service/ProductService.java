package com.example.priyanshu.databasedesign1.Service;

import com.example.priyanshu.databasedesign1.Models.Product;

import java.util.List;

public interface ProductService {

    public List<Product> getAllProducts();
    Product getProductById(int id);
    Product replaceProduct(Long is, Product product);
    Product addProduct(Product product);
    Product updateProduct(Long id, Product product);
    boolean deleteProduct(Long id);
}
