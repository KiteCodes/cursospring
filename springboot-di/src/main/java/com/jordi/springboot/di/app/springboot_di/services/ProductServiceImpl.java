package com.jordi.springboot.di.app.springboot_di.services;

import com.jordi.springboot.di.app.springboot_di.models.Product;
import com.jordi.springboot.di.app.springboot_di.repositories.ProductRepositoryImpl;

import java.util.List;
import java.util.stream.Collectors;

public class ProductServiceImpl implements ProductService{

    private ProductRepositoryImpl productRepository = new ProductRepositoryImpl();

    @Override
    public List<Product> findAll() {
        return productRepository.findAll().stream().map(product -> {
            Double price = product.getPrice() * 1.25d;
            Product newProduct = (Product) product.clone();
            newProduct.setPrice(price.longValue());
            return newProduct;
        }).collect(Collectors.toList());
    }

    @Override
    public Product findById(Long id) {
        return productRepository.findById(id);
    }
}
