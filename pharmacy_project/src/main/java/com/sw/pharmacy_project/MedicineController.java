package com.sw.pharmacy_project;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping("/AddMedicine")
    public boolean AddMedicine(@RequestBody Map<String, String> request){
        meds.AddMedicine(request.get("id"), request.get("name"), request.get("price"), request.get("category"));
        return true;
    }

    

}
