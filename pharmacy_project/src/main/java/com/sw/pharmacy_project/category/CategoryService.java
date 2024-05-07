package com.sw.pharmacy_project.category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CategoryService {
    
    @Autowired
    private CategoryRepository CategoryRepository;

    public List<CategoryModel> GetCategory(){
        return CategoryRepository.findAll();
    }

    public CategoryModel GetCategoryById(Integer id){
        return CategoryRepository.findById(id).get();
    }

    public CategoryModel AddCategory(CategoryModel categoryModel){
        return CategoryRepository.save(categoryModel);
    }


 
    public CategoryModel UpdateCategory(Integer id, CategoryModel categoryModel){
        CategoryModel temp = CategoryRepository.findById(id).orElse(null);
        temp.setCategoryName(categoryModel.getCategoryName());
        return CategoryRepository.save(temp);
    }

    public boolean DeleteCategory(Integer id){
        CategoryRepository.deleteById(id);
        return true;
    }


}
