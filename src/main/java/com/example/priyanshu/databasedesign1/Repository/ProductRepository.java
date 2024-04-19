package com.example.priyanshu.databasedesign1.Repository;

import com.example.priyanshu.databasedesign1.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {


    //1st Method done by me first later i gone through naman bhalla sir
    // here the method might be return null so we can make it Optional as above parameter
    //  Product findById(long id);
    Optional<Product> findById(Long id);

    // 2nd method i have to work on is addNewProduct
//    Product AddnewProduct(Product product);

List<Product> findByTitle(String title);
List<Product> deleteByTitle(String title);
}
