package com.aeropelican.productservice.service;

import com.aeropelican.productservice.dto.Response.CreateProductVariantsRequest;
import com.aeropelican.productservice.dto.Response.UpdateProductVariants;
import com.aeropelican.productservice.entity.ProductVariant;
import com.aeropelican.productservice.repository.ProductVariantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductVariantsServiceImpl implements ProductVariantsService {

    private final ProductVariantRepository productVariantRepository;

    @Override
    public ProductVariant createProductVariant(CreateProductVariantsRequest request) {

        ProductVariant variant = ProductVariant.builder()
                .productId(request.getProductId())
                .sku(request.getSku())
                .color(request.getColor())
                .storageCapacity(request.getStorageCapacity())
                .price(request.getPrice())
                .isActive(request.getIsActive())
                .build();

        return productVariantRepository.save(variant);
    }

    @Override
    public ProductVariant getProductVariant(Long variantId) {

        return productVariantRepository.findById(variantId)
                .orElseThrow(() ->
                        new RuntimeException("Product Variant not found"));
    }

    @Override
    public List<ProductVariant> getAllProductVariants() {

        return productVariantRepository.findAll();
    }

    @Override
    public ProductVariant updateProductVariant(Long variantId,
                                               UpdateProductVariants request) {

        ProductVariant variant = productVariantRepository.findById(variantId)
                .orElseThrow(() ->
                        new RuntimeException("Product Variant not found"));

        variant.setSku(request.getSku());
        variant.setColor(request.getColor());
        variant.setStorageCapacity(request.getStorageCapacity());
        variant.setPrice(request.getPrice());
        variant.setIsActive(request.getIsActive());

        return productVariantRepository.save(variant);
    }

    @Override
    public ProductVariant deleteProductVariant(Long variantId) {

        ProductVariant variant = productVariantRepository.findById(variantId)
                .orElseThrow(() ->
                        new RuntimeException("Product Variant not found"));

        productVariantRepository.delete(variant);

        return variant;
    }
}