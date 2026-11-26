package com.techbizz.westminster.classpractise.demo.productapi;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<Product> findAll();
    List<Product> findByName(String name);
    Optional<Product> findById(int id);
    Product save(Product product);
    boolean delete(int id);
}
