package com.jordi.springboot.di.app.springboot_di.repositories;

import com.jordi.springboot.di.app.springboot_di.models.Product;

import java.util.Arrays;
import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {

    List<Product> data;

    public ProductRepositoryImpl() {
        this.data = Arrays.asList(
            new Product(1L, "Memoria corsair 32", 300L),
            new Product(2L, "Ratón Logitech", 40L),
            new Product(3L, "Ryzen Processor", 300L),
            new Product(4L, "Motherboard Geforce", 200L)
        );
    }

    @Override
    public List<Product> findAll() {
        return this.data;
    }

    @Override
    public Product findById(Long id) {
        return this.data.stream()
                .filter(product -> product.getId().equals(id))
                .findFirst()
                .orElseThrow();
    }
}
