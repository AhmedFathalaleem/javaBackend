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

    


}
