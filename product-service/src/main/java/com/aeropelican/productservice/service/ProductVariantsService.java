package com.aeropelican.productservice.service;

import com.aeropelican.productservice.entity.ProductVariant;
import com.aeropelican.productservice.dto.Response.CreateProductVariantsRequest;
import com.aeropelican.productservice.dto.Response.UpdateProductVariants;

import java.util.List;

public interface ProductVariantsService {

    ProductVariant createProductVariant(CreateProductVariantsRequest request);

    ProductVariant getProductVariant(Long variantId);

    List<ProductVariant> getAllProductVariants();

    ProductVariant updateProductVariant(Long variantId, UpdateProductVariants request);

    ProductVariant deleteProductVariant(Long variantId);
}