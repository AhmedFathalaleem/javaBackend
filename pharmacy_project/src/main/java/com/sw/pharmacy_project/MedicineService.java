package com.sw.pharmacy_project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicineService {
    
    @Autowired
    private MedicineModel meds;

    
    public List<Medicine> GetMedicine(){
        return meds.GetMedicine();
    }



}
