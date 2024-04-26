package com.sw.pharmacy_project.patient;



public class Patient {
    
    private Integer Id;
    private String fName;
    private String lName;


    public Patient(Integer id, String fName, String lName) {
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
