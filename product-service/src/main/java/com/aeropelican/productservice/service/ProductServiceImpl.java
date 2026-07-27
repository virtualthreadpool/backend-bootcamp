package com.aeropelican.productservice.service;

import com.aeropelican.productservice.dto.Response.CreateProductRequest;
import com.aeropelican.productservice.dto.Response.UpdateProduct;
import com.aeropelican.productservice.entity.product;
import com.aeropelican.productservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public product createProduct(CreateProductRequest request) {

        product product = com.aeropelican.productservice.entity.product.builder()
                .categoryId(request.getCategoryId())
                .productName(request.getProductName())
                .description(request.getDescription())
                .brand(request.getBrand())
                .isActive(request.getIsActive())
                .build();

        return productRepository.save(product);
    }

    @Override
    public product getProduct(Long productId) {

        return productRepository.findById(productId)
                .orElseThrow(() ->
                        new RuntimeException("Product not found"));
    }

    @Override
    public List<product> getAllProducts() {

        return productRepository.findAll();
    }

    @Override
    public product updateProduct(Long productId, UpdateProduct request) {

        product product = productRepository.findById(productId)
                .orElseThrow(() ->
                        new RuntimeException("Product not found"));

        product.setCategoryId(request.getCategoryId());
        product.setProductName(request.getProductName());
        product.setDescription(request.getDescription());
        product.setBrand(request.getBrand());
        product.setIsActive(request.getIsActive());

        return productRepository.save(product);
    }

    @Override
    public product deleteProduct(Long productId) {

        product product = productRepository.findById(productId)
                .orElseThrow(() ->
                        new RuntimeException("Product not found"));

        productRepository.delete(product);

        return product;
    }
}