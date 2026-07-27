package com.aeropelican.productservice.controller;

import com.aeropelican.productservice.dto.Response.APIResponse;
import com.aeropelican.productservice.dto.Response.CreateProductVariantsRequest;
import com.aeropelican.productservice.dto.Response.UpdateProductVariants;
import com.aeropelican.productservice.entity.ProductVariant;
import com.aeropelican.productservice.service.ProductVariantsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/v1/product-variant")
@RequiredArgsConstructor
public class ProductVariantsController {

    private final ProductVariantsService productVariantsService;

    @GetMapping("/{variant_id}")
    public ResponseEntity<APIResponse<ProductVariant>> getProductVariant(
            @PathVariable Long variant_id) {

        ProductVariant variant = productVariantsService.getProductVariant(variant_id);

        APIResponse<ProductVariant> response = APIResponse.<ProductVariant>builder()
                .success(true)
                .message("Product Variant fetched successfully")
                .data(variant)
                .timestamp(LocalDateTime.now())
                .build();

        return ResponseEntity.ok(response);
    }

    @GetMapping
    public ResponseEntity<APIResponse<List<ProductVariant>>> getAllProductVariants() {

        List<ProductVariant> variants = productVariantsService.getAllProductVariants();

        APIResponse<List<ProductVariant>> response = APIResponse.<List<ProductVariant>>builder()
                .success(true)
                .message("Product Variants fetched successfully")
                .data(variants)
                .timestamp(LocalDateTime.now())
                .build();

        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<APIResponse<ProductVariant>> createProductVariant(
            @RequestBody CreateProductVariantsRequest request) {

        ProductVariant variant = productVariantsService.createProductVariant(request);

        APIResponse<ProductVariant> response = APIResponse.<ProductVariant>builder()
                .success(true)
                .message("Product Variant created successfully")
                .data(variant)
                .timestamp(LocalDateTime.now())
                .build();

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PutMapping("/{variant_id}")
    public ResponseEntity<APIResponse<ProductVariant>> updateProductVariant(
            @PathVariable Long variant_id,
            @RequestBody UpdateProductVariants request) {

        ProductVariant variant = productVariantsService.updateProductVariant(variant_id, request);

        APIResponse<ProductVariant> response = APIResponse.<ProductVariant>builder()
                .success(true)
                .message("Product Variant updated successfully")
                .data(variant)
                .timestamp(LocalDateTime.now())
                .build();

        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{variant_id}")
    public ResponseEntity<APIResponse<ProductVariant>> deleteProductVariant(
            @PathVariable Long variant_id) {

        ProductVariant variant = productVariantsService.deleteProductVariant(variant_id);

        APIResponse<ProductVariant> response = APIResponse.<ProductVariant>builder()
                .success(true)
                .message("Product Variant deleted successfully")
                .data(variant)
                .timestamp(LocalDateTime.now())
                .build();

        return ResponseEntity.ok(response);
    }
}