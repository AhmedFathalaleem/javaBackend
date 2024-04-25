package com.sw.pharmacy_project;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/meds")
public class MedicineController {

    @Autowired
    private MedicineService meds;
    
    @GetMapping("/GetMedicine")
    public List<Medicine> GetMedicine(){
        return meds.GetMedicine();
    }

    @GetMapping("/GetMedicineById/{id}")
    public Medicine GetMedicineById(@PathVariable Integer id){
        return meds.GetMedicineById(id);
    }

    @PostMapping("/AddMedicine")
    public boolean AddMedicine(@RequestBody Map<String, String> request){
        return meds.AddMedicine(request.get("id"), request.get("name"), request.get("price"), request.get("category"));
        
    }

    @PutMapping("/UpdateMedicine")
    public boolean UpdateMedicine(@RequestBody Map<String, String> request) {
        return meds.UpdateMedicine(request.get("id"), request.get("name"), request.get("price"), request.get("category"));
    }

    @DeleteMapping("/DeleteMedicine/{id}")
    
    public boolean DeleteMedicine(@PathVariable Integer id){
        return meds.DeleteMedicine(id);
    }


    

}
