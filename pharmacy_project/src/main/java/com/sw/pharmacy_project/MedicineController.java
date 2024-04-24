package com.sw.pharmacy_project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/meds")
public class MedicineController {

    @Autowired
    private MedicineService meds;
    
    @GetMapping("/GetMedicine")
    public List<Medicine> GetMedicine(){
        return meds.GetMedicine();
    }

}
