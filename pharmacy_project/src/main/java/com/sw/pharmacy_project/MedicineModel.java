package com.sw.pharmacy_project;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class MedicineModel {

    
    public List <Medicine> meds = new ArrayList<>();

    public MedicineModel(){
        meds.add(new Medicine(1, "CovidCure", 5000, "Covid"));
        meds.add(new Medicine(2, "CancerCure", 50000, "Cancer"));
    }

    public List<Medicine> GetMedicine(){
        return this.meds;
    }

    public Medicine GetMedicineById(Integer id){
        return meds.get(id-1);
    }

    public boolean AddMedicine(Integer id, String name, Integer price, String category){
       meds.add(new Medicine(id, name, price, category));
        return true;
    }
  
    public boolean UpdateMedicine(Integer id, String name, Integer price, String category){
        for(int i = 0; i < meds.size(); i++){
            if(id == this.meds.get(i).getId()){
                this.meds.get(i).setName(name);
                this.meds.get(i).setPrice(price);
                this.meds.get(i).setCategory(category);
                return true;
            }
        }
        return false;
    }

    public boolean UpdateMedicineName(Integer id, String name){
        for(int i = 0; i < meds.size(); i++){
            if(id == this.meds.get(i).getId()){
                this.meds.get(i).setName(name);
                return true;
            }
        }
        return false;
    }

    public boolean UpdateMedicinePrice(Integer id, Integer price){
        for(int i = 0; i < meds.size(); i++){
            if(id == this.meds.get(i).getId()){
                this.meds.get(i).setPrice(price);
                return true;
            }
        }
        return false;
    }


    public boolean UpdateMedicineCategory(Integer id, String category){
        for(int i = 0; i < meds.size(); i++){
            if(id == this.meds.get(i).getId()){
                this.meds.get(i).setCategory(category);
                return true;
            }
        }
        return false;
    }

    public boolean DeleteMedicine(Integer id){
        for(int i=0; i< this.meds.size(); i++){
            if(this.meds.get(i).getId() == id){
                this.meds.remove(i);
                return true;
            }
        }
        return false;
    }
    


}
