package com.sw.pharmacy_project;

import java.util.List;
//import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@CrossOrigin
@RequestMapping("/meds")
public class MedicineController {

    @Autowired
    private MedicineService MedicineService;
    
    @GetMapping("/GetMedicine")
    public List<MedicineModel> GetMedicine(){
        return MedicineService.GetMedicine();
    }

    @GetMapping("/GetMedicineById/{id}")
    public MedicineModel GetMedicineById(@PathVariable Integer id){
        return MedicineService.GetMedicineById(id);
    }



    @PostMapping("/AddMedicine")
    public boolean AddMedicine(@RequestBody MedicineModel medicineModel){
        MedicineService.AddMedicine(medicineModel);
        return true;
    }

    @PutMapping("/UpdateMedicine")
    public boolean UpdateMedicine(@RequestBody MedicineModel medicineModel) {
        MedicineService.UpdateMedicine(medicineModel);
        return true;
    }

    @DeleteMapping("/DeleteMedicine/{id}")
    
    public boolean DeleteMedicine(@PathVariable Integer id){
        return MedicineService.DeleteMedicine(id);
    }


    

}
