package com.sw.pharmacy_project.patient;

import org.springframework.data.jpa.repository.JpaRepository;



public interface PatientRepository extends JpaRepository<PatientModel, Integer>{
    
}
