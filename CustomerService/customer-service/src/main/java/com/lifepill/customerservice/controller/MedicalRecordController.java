package com.lifepill.customerservice.controller;

import com.lifepill.customerservice.model.MedicalRecord;
import com.lifepill.customerservice.service.MedicalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("medicalRecords")
public class MedicalRecordController {
    @Autowired
    private MedicalRecordService medicalRecordService;

    //add new medical record
    @PostMapping
    public MedicalRecord addNewMedicalRecord(@RequestBody MedicalRecord newMedicalRecord){
        return medicalRecordService.addNewMedicalRecord(newMedicalRecord);
    }
}
