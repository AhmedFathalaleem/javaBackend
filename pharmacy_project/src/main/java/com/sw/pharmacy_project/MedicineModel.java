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

    public boolean AddMedicine(Integer id, String name, Integer price, String category){
       meds.add(new Medicine(id, name, price, category));
        return true;
    }

    public void updateMedicineName(Integer id, String name){
        for(int i = 0; i < meds.size(); i++){
            if(id == this.meds.get(i).getId()){
                this.meds.get(i).setName(name);
                
            }
        }
    }

    public void updateMedicinePrice(Integer id, Integer price){
        for(int i = 0; i < meds.size(); i++){
            if(id == this.meds.get(i).getId()){
                this.meds.get(i).setPrice(price);
                
            }
        }
    }


    public void updateMedicineCategory(Integer id, String category){
        for(int i = 0; i < meds.size(); i++){
            if(id == this.meds.get(i).getId()){
                this.meds.get(i).setCategory(category);
                
            }
        }
    }


    


}
