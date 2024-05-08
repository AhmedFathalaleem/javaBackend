package com.sw.pharmacy_project.patient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
    
    @Autowired
    private PatientModel PatientModel;

    public List<Patient> GetPatient(){
        return PatientModel.GetPatient();
    }

    public Patient GetPatientById(Integer id){
        return PatientModel.GetPatientById(id);
    }

    public boolean AddPatient(String id, String fName, String lName){
        return PatientModel.AddPatient(Integer.valueOf(id), fName, lName);
    }

    public boolean UpdatePatient(String id, String fName, String lName){
        return PatientModel.UpdatePatient(Integer.valueOf(id), fName, lName);
    }

    public boolean DeletePatient(Integer id){
        return PatientModel.DeletePatient(id);
    }
    
}
