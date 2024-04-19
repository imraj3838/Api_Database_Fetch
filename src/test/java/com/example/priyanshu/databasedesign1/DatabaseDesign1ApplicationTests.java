package com.example.priyanshu.databasedesign1;

import com.example.priyanshu.databasedesign1.Repository.ProductRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;

@SpringBootTest
class DatabaseDesign1ApplicationTests {

	// taking the instance of productRepository
	@Autowired
	private ProductRepository productRepository;

	@Test
	void contextLoads() {
	}

	@Transactional
	@Test
	@Commit
	void testQueries(){

//		productRepository.findByTitle("Priyanshu");
		productRepository.deleteByTitle("priyanshu");
	}

}
