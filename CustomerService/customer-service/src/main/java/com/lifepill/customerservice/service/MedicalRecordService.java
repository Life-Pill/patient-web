package com.lifepill.customerservice.service;

import com.lifepill.customerservice.model.MedicalRecord;
import com.lifepill.customerservice.repo.MedicalRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicalRecordService {
    @Autowired
    private MedicalRecordRepository medicalRecordRepository;

    //add new medical record
    public MedicalRecord addNewMedicalRecord(MedicalRecord newMedicalRecord){
        return medicalRecordRepository.save(newMedicalRecord);
    }
}
