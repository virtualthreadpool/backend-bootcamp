package com.aeropelican.productservice.repository;

import com.aeropelican.productservice.entity.product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<product, Long> {

    List<product> findByCategoryId(Long categoryId);

    List<product> findByIsActiveTrue();

    List<product> findByBrand(String brand);

    boolean existsByProductName(String productName);

}