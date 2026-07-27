package com.aeropelican.productservice.controller;

import com.aeropelican.productservice.dto.Response.APIResponse;
import com.aeropelican.productservice.dto.Response.CreateCategoriesRequest;
import com.aeropelican.productservice.dto.Response.UpdateCategories;
import com.aeropelican.productservice.entity.Category;
import com.aeropelican.productservice.service.CategoriesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/v1/category")
@RequiredArgsConstructor
public class CategoriesController {

    private final CategoriesService categoryService;

    @GetMapping("/{category_id}")
    public ResponseEntity<APIResponse<Category>> getCategory(
            @PathVariable Long category_id) {

        Category category = categoryService.getCategory(category_id);

        APIResponse<Category> response = APIResponse.<Category>builder()
                .success(true)
                .message("Category fetched successfully")
                .data(category)
                .timestamp(LocalDateTime.now())
                .build();

        return ResponseEntity.ok(response);
    }

    @GetMapping
    public ResponseEntity<APIResponse<List<Category>>> getAllCategories() {

        List<Category> categories = categoryService.getAllCategories();

        APIResponse<List<Category>> response = APIResponse.<List<Category>>builder()
                .success(true)
                .message("Categories fetched successfully")
                .data(categories)
                .timestamp(LocalDateTime.now())
                .build();

        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<APIResponse<Category>> createCategory(
            @RequestBody CreateCategoriesRequest request) {

        Category category = categoryService.createCategory(request);

        APIResponse<Category> response = APIResponse.<Category>builder()
                .success(true)
                .message("Category created successfully")
                .data(category)
                .timestamp(LocalDateTime.now())
                .build();

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PutMapping("/{category_id}")
    public ResponseEntity<APIResponse<Category>> updateCategory(
            @PathVariable Long category_id,
            @RequestBody UpdateCategories request) {

        Category category = categoryService.updateCategory(category_id, request);

        APIResponse<Category> response = APIResponse.<Category>builder()
                .success(true)
                .message("Category updated successfully")
                .data(category)
                .timestamp(LocalDateTime.now())
                .build();

        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{category_id}")
    public ResponseEntity<APIResponse<Category>> deleteCategory(
            @PathVariable Long category_id) {

        Category category = categoryService.deleteCategory(category_id);

        APIResponse<Category> response = APIResponse.<Category>builder()
                .success(true)
                .message("Category deleted successfully")
                .data(category)
                .timestamp(LocalDateTime.now())
                .build();

        return ResponseEntity.ok(response);
    }
}