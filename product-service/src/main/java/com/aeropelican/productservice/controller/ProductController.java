package com.aeropelican.productservice.controller;

import com.aeropelican.productservice.dto.Response.APIResponse;
import com.aeropelican.productservice.dto.Response.CreateProductRequest;
import com.aeropelican.productservice.dto.Response.UpdateProduct;
import com.aeropelican.productservice.entity.product;
import com.aeropelican.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/{product_id}")
    public ResponseEntity<APIResponse<product>> getProduct(
            @PathVariable Long product_id) {

        product product = productService.getProduct(product_id);

        APIResponse<product> response = APIResponse.<product>builder()
                .success(true)
                .message("Product fetched successfully")
                .data(product)
                .timestamp(LocalDateTime.now())
                .build();

        return ResponseEntity.ok(response);
    }

    @GetMapping
    public ResponseEntity<APIResponse<List<product>>> getAllProducts() {

        List<product> products = productService.getAllProducts();

        APIResponse<List<product>> response = APIResponse.<List<product>>builder()
                .success(true)
                .message("Products fetched successfully")
                .data(products)
                .timestamp(LocalDateTime.now())
                .build();

        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<APIResponse<product>> createProduct(
            @RequestBody CreateProductRequest request) {

        product product = productService.createProduct(request);

        APIResponse<product> response = APIResponse.<product>builder()
                .success(true)
                .message("Product created successfully")
                .data(product)
                .timestamp(LocalDateTime.now())
                .build();

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PutMapping("/{product_id}")
    public ResponseEntity<APIResponse<product>> updateProduct(
            @PathVariable Long product_id,
            @RequestBody UpdateProduct request) {

        product product = productService.updateProduct(product_id, request);

        APIResponse<product> response = APIResponse.<product>builder()
                .success(true)
                .message("Product updated successfully")
                .data(product)
                .timestamp(LocalDateTime.now())
                .build();

        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{product_id}")
    public ResponseEntity<APIResponse<product>> deleteProduct(
            @PathVariable Long product_id) {

        product product = productService.deleteProduct(product_id);

        APIResponse<product> response = APIResponse.<product>builder()
                .success(true)
                .message("Product deleted successfully")
                .data(product)
                .timestamp(LocalDateTime.now())
                .build();

        return ResponseEntity.ok(response);
    }
}