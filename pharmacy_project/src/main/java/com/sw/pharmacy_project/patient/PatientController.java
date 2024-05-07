package com.sw.pharmacy_project.patient;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patient")
public class PatientController {
    
    @Autowired
    private PatientService PatientService;


    @GetMapping("/GetPatients")
    public List<PatientModel> GetPatient(){
        return PatientService.GetPatient();
    }

    @GetMapping("/GetPatientById/{id}")
    public PatientModel GetPatientById(@PathVariable Integer id){
        return PatientService.GetPatientById(id);
    }

    @PostMapping("/AddPatient")
    public PatientModel AddPatient(@RequestBody PatientModel patientModel){
        return PatientService.AddPatient(patientModel);
    }

    @PutMapping("/UpdatePatient")
    public PatientModel UpdatePatient(@RequestBody PatientModel patientModel, Integer id){
       return PatientService.UpdatePatient(id, patientModel);
        
    }

    @DeleteMapping("/DeletePatient/{id}")
    public boolean DeletePatient(@PathVariable Integer id){
        return PatientService.DeletePatient(id);
    }

}
