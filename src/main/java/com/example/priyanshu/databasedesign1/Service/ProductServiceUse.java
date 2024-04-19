package com.example.priyanshu.databasedesign1.Service;

import com.example.priyanshu.databasedesign1.Models.Product;
import com.example.priyanshu.databasedesign1.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceUse implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() { // This is done by naman bhalla sir
        return List.of();
    }

    @Override
    public Product getProductById(int id) { // This is done by naman bhalla sir
         return productRepository.findById(id);
    }

    @Override
    public Product replaceProduct(Long is, Product product) {
        return null;
    }

    @Override
    public Product addProduct(Product product) {
        return null;
    }

    @Override
    public Product updateProduct(Long id, Product product) {  // This is done by naman bhalla sir
        return null;
    }

    @Override
    public boolean deleteProduct(Long id) {
        return false;
    }
}
