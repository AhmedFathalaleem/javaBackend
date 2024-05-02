package com.sw.pharmacy_project.category;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;




@Component
public class CategoryModel {
    

    public List <Category> categories = new ArrayList<>();

   public CategoryModel(){
    categories.add(new Category(1, "Chest meds"));
    categories.add(new Category(2, "Head meds"));
   }

   public List<Category> GetCategory(){
    return this.categories;
   }

   public Category GetCategoryById(Integer id){
        return categories.get(id-1);
    }

    public boolean AddCategory(Integer id, String categoryName){
       categories.add(new Category(id, categoryName));
        return true;
    }
  
    public boolean UpdateCategory(Integer id, String categoryName){
        for(int i = 0; i < categories.size(); i++){
            if(id == this.categories.get(i).getId()){
                this.categories.get(i).setCategoryName(categoryName);
                return true;
            }
        }
        return false;
    }


    public boolean DeleteCategory(Integer id){
        for(int i=0; i< this.categories.size(); i++){
            if(this.categories.get(i).getId() == id){
                this.categories.remove(i);
                return true;
            }
        }
        return false;
    }


}
