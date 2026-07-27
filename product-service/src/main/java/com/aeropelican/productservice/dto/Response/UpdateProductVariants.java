package com.aeropelican.productservice.dto.Response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpdateProductVariants {

    private String sku;
    private String color;
    private String storageCapacity;
    private BigDecimal price;
    private Boolean isActive;

}