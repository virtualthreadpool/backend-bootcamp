package com.aeropelican.productservice.dto.Response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpdateCategories {

    private String categoryName;

    private String description;

    private Long parentCategoryId;

    private Boolean isActive;

}