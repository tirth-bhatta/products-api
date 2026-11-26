package com.techbizz.westminster.classpractise.demo.productapi;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class InMemoryProductRepository implements ProductRepository {
    private final List<Product> products = new ArrayList<>();
    private int nextId = 112;

    @Override
    public List<Product> findAll() {
        return this.products;
    }

    @Override
    public List<Product> findByName(String name) {
        return products.stream()
                .filter(p -> p.getName().contains(name)).toList();
    }


    @Override
    public Optional<Product> findById(int id) {
        return products.stream()
                .filter(p -> p.getId() == id)
                .findFirst();
    }

    @Override
    public Product save(Product product) {
        if (product.getId() == 0)
            product.setId(nextId++);
        products.add(product);
        return product;
    }

    @Override
    public boolean delete(int id) {
        return products.removeIf(p -> p.getId() == id);
    }
}
