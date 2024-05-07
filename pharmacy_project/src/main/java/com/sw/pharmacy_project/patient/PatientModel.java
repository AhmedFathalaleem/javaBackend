package com.sw.pharmacy_project.patient;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "javaPatient")
public class PatientModel {

    @Id
    @Column(name = "id")
    private Integer Id;
    @Column (name = "fName")
    private String fName;
    @Column (name = "lName")
    private String lName;


    public PatientModel(Integer id, String fName, String lName) {
        Id = id;
        this.fName = fName;
        this.lName = lName;
    }


    public Integer getId() {
        return Id;
    }


    public void setId(Integer id) {
        Id = id;
    }


    public String getfName() {
        return fName;
    }


    public void setfName(String fName) {
        this.fName = fName;
    }


    public String getlName() {
        return lName;
    }


    public void setlName(String lName) {
        this.lName = lName;
    }
    
    
    
}
