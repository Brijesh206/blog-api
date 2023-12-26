package com.blog.services;

import com.blog.payloads.CategoryDto;

import java.util.List;

public interface CategoryServices {

    CategoryDto createCategory(CategoryDto categoryDto);
    CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);
    CategoryDto getCategoryById(Integer categoryId);

    List<CategoryDto> getAllCategories();
    void deleteCategory(Integer categoryId);
}
