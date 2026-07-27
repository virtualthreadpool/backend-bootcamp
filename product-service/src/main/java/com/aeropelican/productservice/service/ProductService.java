package com.aeropelican.productservice.service;

import com.aeropelican.productservice.dto.Response.CreateProductRequest;
import com.aeropelican.productservice.dto.Response.UpdateProduct;
import com.aeropelican.productservice.entity.product;

import java.util.List;

public interface ProductService {

    product createProduct(CreateProductRequest request);

    product getProduct(Long productId);

    List<product> getAllProducts();

    product updateProduct(Long productId, UpdateProduct request);

    product deleteProduct(Long productId);

}