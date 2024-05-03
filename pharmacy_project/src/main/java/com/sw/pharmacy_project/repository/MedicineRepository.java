package com.sw.pharmacy_project.repository;

import com.sw.pharmacy_project.MedicineModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MedicineRepository extends JpaRepository<MedicineModel, Integer>{
    
}
