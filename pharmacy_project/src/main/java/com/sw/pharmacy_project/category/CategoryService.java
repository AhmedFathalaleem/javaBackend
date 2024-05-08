package com.sw.pharmacy_project.category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CategoryService {
    
    @Autowired
    private CategoryModel CategoryModel;

    public List<Category> GetCategory(){
        return CategoryModel.GetCategory();
    }

    public Category GetCategoryById(Integer id){
        return CategoryModel.GetCategoryById(id);
    }

    public boolean AddCategory(String id, String categoryName){
        return CategoryModel.AddCategory(Integer.valueOf(id), categoryName);
    }

    public boolean UpdateCategory(String id, String categoryName){
        return CategoryModel.UpdateCategory(Integer.valueOf(id), categoryName);
    }

    public boolean DeleteCategory(Integer id){
        return CategoryModel.DeleteCategory(id);
    }


}
