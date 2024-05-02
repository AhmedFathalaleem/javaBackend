package com.sw.pharmacy_project.category;

import java.util.List;
import java.util.Map;

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
    public List<Category> GetCategory(){
        return CategoryService.GetCategory();
    }

    @GetMapping("/GetCategoryById/{id}")
    public Category GetPatientById(@PathVariable Integer id){
        return CategoryService.GetCategoryById(id);
    }


    @PostMapping("/AddCategory")
    public boolean AddCategory(@RequestBody Map<String, String> request){
        return CategoryService.AddCategory(request.get("id"), request.get("categoryName"));
    }

    @PutMapping("/UpdateCategory")
    public boolean UpdateCategory(@RequestBody Map<String, String> request){
        return CategoryService.UpdateCategory(request.get("id"), request.get("categoryName"));
    }

    @DeleteMapping("/DeleteCategory/{id}")
    public boolean DeleteCategory(@PathVariable Integer id){
        return CategoryService.DeleteCategory(id);
    }

}
