package com.example.demo.controllers;

import com.example.demo.models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api")
public class ProductController {

    @GetMapping("products")
    public List<Product> index() {
        List<Product> products = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            Product product = new Product();
            product.setId((long) i);
            product.setSku("SKU-" + i);
            product.setName("Product " + i);
            product.setDescription("Description for product " + i);
            product.setPrice(10.0 * i);
            product.setCreatedAt(LocalDateTime.now());
            product.setUpdatedAt(LocalDateTime.now());
            products.add(product);
        }

        return products;
    }
}
