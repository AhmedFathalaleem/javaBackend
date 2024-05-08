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
    public List<Patient> GetPatient(){
        return PatientService.GetPatient();
    }

    @GetMapping("/GetPatientById/{id}")
    public Patient GetPatientById(@PathVariable Integer id){
        return PatientService.GetPatientById(id);
    }

    @PostMapping("/AddPatient")
    public boolean AddPatient(@RequestBody Map<String, String> request){
        return PatientService.AddPatient(request.get("id"), request.get("fName"), request.get("lName"));
    }

    @PutMapping("/UpdatePatient")
    public boolean UpdatePatient(@RequestBody Map<String, String> request){
        return PatientService.UpdatePatient(request.get("id"), request.get("fName"), request.get("lName"));
    }

    @DeleteMapping("/DeletePatient/{id}")
    public boolean DeletePatient(@PathVariable Integer id){
        return PatientService.DeletePatient(id);
    }

}
