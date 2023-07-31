package com.example.criteointerview;

import com.example.criteointerview.data.models.Product;
import com.example.criteointerview.data.repositories.ProductRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CriteoInterviewApplication implements ApplicationRunner {
    private final ProductRepository productRepository;

    public CriteoInterviewApplication(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(CriteoInterviewApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) {
        productRepository.save(new Product("Apple", "Food", 2.0f, "111"));
        productRepository.save(new Product("Banana", "Food", 3.0f, "222"));

        productRepository.save(new Product("iPhone 14", "Electronics", 1000.0f, "333"));
        productRepository.save(new Product("Samsung Galaxy S23", "Electronics", 900.0f, "444"));

        productRepository.save(new Product("Table", "Furniture", 300.0f, "555"));
        productRepository.save(new Product("Chair", "Furniture", 150.0f, "666"));
    }
}
