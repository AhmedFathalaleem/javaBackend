package com.sw.pharmacy_project.category;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/category")
public class CategoryController {
    
    @Autowired
    private CategoryService CategoryService;

    @GetMapping("/GetCategories")
    public List<CategoryModel> GetCategory(){
        return CategoryService.GetCategory();
    }

    @GetMapping("/GetCategoryById/{id}")
    public CategoryModel GetPatientById(@PathVariable Integer id){
        return CategoryService.GetCategoryById(id);
    }


    @PostMapping("/AddCategory")
    public CategoryModel AddCategory(@RequestBody CategoryModel categoryModel){
        return CategoryService.AddCategory(categoryModel);
    }

    @PutMapping("/UpdateCategory/{id}")
    public boolean UpdateCategory(@RequestBody CategoryModel categoryModel, @PathVariable Integer id){
        CategoryService.UpdateCategory(id, categoryModel);
        return true;
    }

    @DeleteMapping("/DeleteCategory/{id}")
    public boolean DeleteCategory(@PathVariable Integer id){
        return CategoryService.DeleteCategory(id);
    }

}
