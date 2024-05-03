package com.sw.pharmacy_project;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.sw.pharmacy_project.repository.MedicineRepository;

@Service
public class MedicineService {

    @Autowired
    private MedicineRepository MedicineRepository;
    
    public List <MedicineModel> meds = new ArrayList<>();

    public MedicineService(){
        meds.add(new MedicineModel(1, "CovidCure", 5000, "Covid"));
        meds.add(new MedicineModel(2, "CancerCure", 50000, "Cancer"));
    }

    public List<MedicineModel> GetMedicine(){
        return MedicineRepository.findAll();
    }

    public MedicineModel GetMedicineById(Integer id){
        return MedicineRepository.findById(id).get();
    }

 
    public MedicineModel AddMedicine(MedicineModel medicine){
        return MedicineRepository.save(medicine);
    }
  
    public MedicineModel UpdateMedicine(MedicineModel medicine){

        MedicineModel tempMedicine = MedicineRepository.findById(medicine.getId()).get();
        tempMedicine.setName(medicine.getName());
        tempMedicine.setPrice(medicine.getPrice());
        tempMedicine.setCategory(medicine.getCategory());
        MedicineRepository.save(tempMedicine);

        return tempMedicine;
    }

    public boolean UpdateMedicineName(Integer id, String name){
        for(int i = 0; i < meds.size(); i++){
            if(id == this.meds.get(i).getId()){
                this.meds.get(i).setName(name);
                return true;
            }
        }
        return false;
    }

    public boolean UpdateMedicinePrice(Integer id, Integer price){
        for(int i = 0; i < meds.size(); i++){
            if(id == this.meds.get(i).getId()){
                this.meds.get(i).setPrice(price);
                return true;
            }
        }
        return false;
    }


    public boolean UpdateMedicineCategory(Integer id, String category){
        for(int i = 0; i < meds.size(); i++){
            if(id == this.meds.get(i).getId()){
                this.meds.get(i).setCategory(category);
                return true;
            }
        }
        return false;
    }

    public boolean DeleteMedicine(Integer id){
        MedicineRepository.deleteById(id);
        return false;
    }
    


}
