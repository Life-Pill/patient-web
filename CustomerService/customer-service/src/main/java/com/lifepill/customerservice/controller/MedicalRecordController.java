package com.lifepill.customerservice.controller;

import com.lifepill.customerservice.model.MedicalRecord;
import com.lifepill.customerservice.service.MedicalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("medicalRecords")
public class MedicalRecordController {
    @Autowired
    private MedicalRecordService medicalRecordService;

    //get a medical record
    @GetMapping("/{patientId}/{recordId}")
    public Optional<MedicalRecord> getMedicalRecord(@PathVariable Long patientId, @PathVariable String recordId){
        return medicalRecordService.getMedicalRecord(patientId, recordId);
    }

    //add new medical record
    @PostMapping
    public MedicalRecord addNewMedicalRecord(@RequestBody MedicalRecord newMedicalRecord){
        return medicalRecordService.addNewMedicalRecord(newMedicalRecord);
    }

    //update a medical record
    @PutMapping("/{patientId}/{recordId}")
    public MedicalRecord updateMedicalRecord(@PathVariable Long patientId,@PathVariable String recordId,@RequestBody MedicalRecord updatedMedicalRecord){
        return medicalRecordService.updateMedicalRecord(patientId, recordId, updatedMedicalRecord);
    }

    //delete a medical record
    @DeleteMapping("/{patientId}/{recordId}")
    public String deleteMedicalRecord(@PathVariable Long patientId,@PathVariable String recordId){
        medicalRecordService.deleteMedicalRecord(patientId, recordId);

        return "Medical Record Deleted Successfully";
    }
}
