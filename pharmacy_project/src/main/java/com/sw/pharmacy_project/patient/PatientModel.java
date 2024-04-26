package com.sw.pharmacy_project.patient;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;


@Component
public class PatientModel {
    
   public List <Patient> patients = new ArrayList<>();

   public PatientModel(){
    patients.add(new Patient(1, "Ross", "Geller"));
    patients.add(new Patient(2, "Chandler", "Bing"));
   }

   public List<Patient> GetPatient(){
        return this.patients;
    }

    public Patient GetPatientById(Integer id){
        return patients.get(id-1);
    }

    public boolean AddPatient(Integer id, String fName, String lName){
       patients.add(new Patient(id, fName, lName));
        return true;
    }
  
    public boolean UpdatePatient(Integer id, String fName, String lName){
        for(int i = 0; i < patients.size(); i++){
            if(id == this.patients.get(i).getId()){
                this.patients.get(i).setfName(fName);
                this.patients.get(i).setlName(lName);
                return true;
            }
        }
        return false;
    }


    public boolean DeletePatient(Integer id){
        for(int i=0; i< this.patients.size(); i++){
            if(this.patients.get(i).getId() == id){
                this.patients.remove(i);
                return true;
            }
        }
        return false;
    }


}
