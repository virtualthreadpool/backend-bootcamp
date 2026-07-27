package com.aeropelican.productservice.dto.Response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateProductRequest {

    private Long categoryId;

    private String productName;

    private String description;

    private String brand;

    private Boolean isActive;

}