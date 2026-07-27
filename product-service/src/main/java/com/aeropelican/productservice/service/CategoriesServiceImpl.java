package com.aeropelican.productservice.service;

import com.aeropelican.productservice.dto.Response.CreateCategoriesRequest;
import com.aeropelican.productservice.dto.Response.UpdateCategories;
import com.aeropelican.productservice.entity.Category;
import com.aeropelican.productservice.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoriesServiceImpl implements CategoriesService {

    private final CategoryRepository categoryRepository;

    @Override
    public Category createCategory(CreateCategoriesRequest request) {
        return null;
    }

    @Override
    public Category getCategory(Long categoryId) {
        return null;
    }

    @Override
    public List<Category> getAllCategories() {
        return null;
    }

    @Override
    public Category updateCategory(Long categoryId, UpdateCategories request) {
        return null;
    }

    @Override
    public Category deleteCategory(Long categoryId) {
        return null;
    }
}