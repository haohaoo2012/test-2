package com.haohao.haostore.service.impl;

import com.haohao.haostore.model.Category;
import com.haohao.haostore.repository.CategoryRepository;
import com.haohao.haostore.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    public List<Category> getAllCategory(){
        return categoryRepository.findAll();
    }//findAll

    public void updateCategory(Category category){categoryRepository.save(category); }//add or update (tuy vao pri-key)

    public void removeCategoryById(int id){
        categoryRepository.deleteById(id);
    }//delete dua vao pri-key

    public Optional<Category> getCategoryById(int id){
        return categoryRepository.findById(id);
    }//search theo id
}
