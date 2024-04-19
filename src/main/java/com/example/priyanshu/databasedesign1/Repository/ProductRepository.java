package com.example.priyanshu.databasedesign1.Repository;

import com.example.priyanshu.databasedesign1.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {


    Optional<Product> findById(Long id);
    // here the method might be return null so we can make it Optional as above parameter
    //  Product findById(long id);
List<Product> findByTitle(String title);
List<Product> deleteByTitle(String title);
}
