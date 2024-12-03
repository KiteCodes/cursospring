package com.jordi.springboot.di.app.springboot_di.repositories;

import com.jordi.springboot.di.app.springboot_di.models.Product;

import java.util.Arrays;
import java.util.List;

public class ProductRepository {

    List<Product> data;

    public ProductRepository() {
        this.data = Arrays.asList(
            new Product(1L, "Memoria corsair 32", 300L),
            new Product(2L, "Ratón Logitech", 40L),
            new Product(3L, "Ryzen Processor", 300L),
            new Product(4L, "Motherboard Geforce", 200L)
        );
    }

    public List<Product> findAll() {
        return this.data;
    }

    public Product findById(Long id) {
        return this.data.stream()
                .filter(product -> product.getId().equals(id))
                .findFirst()
                .orElseThrow();
    }
}
