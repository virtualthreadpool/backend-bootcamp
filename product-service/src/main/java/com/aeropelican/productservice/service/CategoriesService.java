package com.aeropelican.productservice.service;

import com.aeropelican.productservice.dto.Response.CreateCategoriesRequest;
import com.aeropelican.productservice.dto.Response.UpdateCategories;
import com.aeropelican.productservice.entity.Category;

import java.util.List;

public interface CategoriesService {

    Category createCategory(CreateCategoriesRequest request);

    Category getCategory(Long categoryId);

    List<Category> getAllCategories();

    Category updateCategory(Long categoryId, UpdateCategories request);

    Category deleteCategory(Long categoryId);

}