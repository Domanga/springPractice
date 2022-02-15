package com.inho.prac02.controller;

import com.inho.prac02.models.Product;
import com.inho.prac02.models.ProductMypriceRequestDto;
import com.inho.prac02.models.ProductRepository;
import com.inho.prac02.models.ProductRequestDto;
import com.inho.prac02.service.ProductService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class ProductRestController {

    private final ProductService productService;
    private final ProductRepository productRepository;

    @GetMapping("/api/products")
    public List<Product>  readProduct() {

        return productRepository.findAll();
    }

    @PostMapping("/api/products")
    public Product createProduct(@RequestBody ProductRequestDto requestDto) {
        Product product = new Product(requestDto);
        return productRepository.save(product);
    }

    @PutMapping("api/products/{id}")
    public Long updateProduct(@PathVariable Long id, @RequestBody ProductMypriceRequestDto requestDto) {
        return productService.update(id, requestDto);
    }

    @DeleteMapping("/api/products/{id}")
    public Long deleteProduct(@PathVariable Long id) {
        productRepository.deleteById(id);
        return id;
    }
}

