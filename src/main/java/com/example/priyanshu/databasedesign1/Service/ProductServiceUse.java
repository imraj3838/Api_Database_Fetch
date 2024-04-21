package com.example.priyanshu.databasedesign1.Service;

import com.example.priyanshu.databasedesign1.Models.Product;
import com.example.priyanshu.databasedesign1.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceUse implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() { // This is done by naman bhalla sir
        return List.of();
    }

    @Override
    public Optional<Product> getProductById(long id) { // This is done by naman bhalla sir
         Optional<Product> producto = productRepository.findById(id);
         Product p = producto.get();
         return Optional.of(p);
    }

    @Override
    public Product replaceProduct(Long is, Product product) {
        return null;
    }

    @Override
    public Product addProduct(Product product) {
        Product p = productRepository.save(product);
        return p;
    }


    @Override
    public Product updateProduct(Long id, Product product) {  // This is done by naman bhalla sir
        Optional<Product> producto = productRepository.findById(id);
        if(producto.isEmpty()) {
            throw new RuntimeException();
        }
        Product saveProduct = producto.get();

        if(product.getTitle()!=null){
            saveProduct.setTitle(product.getTitle());
        }
        if(product.getDescription()!=null){
            saveProduct.setDescription(product.getDescription());
        }
        if(product.getPrice()!=null){
            saveProduct.setPrice(product.getPrice());
        }
        return saveProduct;
    }

    @Override
    public boolean deleteProduct(Long id) {
        return false;
    }
}
