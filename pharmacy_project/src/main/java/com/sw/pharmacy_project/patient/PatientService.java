package com.sw.pharmacy_project.patient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
    
    @Autowired
    private PatientRepository PatientRepository;

    public List<PatientModel> GetPatient(){
        return PatientRepository.findAll();
    }

    public PatientModel GetPatientById(Integer id){
        return PatientRepository.findById(id).get();
    }

    public PatientModel AddPatient(PatientModel patientModel){
        return PatientRepository.save(patientModel);
    }

    public PatientModel UpdatePatient(Integer id,PatientModel patientModel){
        PatientModel temp = PatientRepository.findById(id).orElse(null);
        temp.setfName(patientModel.getfName());
        temp.setlName(patientModel.getlName());
        return PatientRepository.save(temp);
    }

    public boolean DeletePatient(Integer id){
        PatientRepository.deleteById(id);
        return true;
    }
    
}
