package com.sw.pharmacy_project.category;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "javaCategory")
public class CategoryModel {
    
    @Id
    @Column(name = "id")
    private int Id;
    @Column(name = "categoryName")
    private String categoryName;

    
    public CategoryModel(int id, String categoryName) {
        Id = id;
        this.categoryName = categoryName;
    }


    public int getId() {
        return Id;
    }


    public void setId(int id) {
        Id = id;
    }


    public String getCategoryName() {
        return categoryName;
    }


    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    

}
