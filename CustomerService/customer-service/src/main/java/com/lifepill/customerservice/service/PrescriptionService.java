package com.lifepill.customerservice.service;

import com.lifepill.customerservice.model.Prescription;
import com.lifepill.customerservice.repo.PrescriptionRepository;
import org.bson.BsonBinarySubType;
import org.bson.types.Binary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class PrescriptionService {
    @Autowired
    private PrescriptionRepository prescriptionRepository;

    public String addPrescription(String title, MultipartFile file) throws IOException {
        Prescription prescription = new Prescription();
        prescription.setPrescriptionImage(
                new Binary(BsonBinarySubType.BINARY, file.getBytes()));
        prescription = prescriptionRepository.insert(prescription); return prescription.getId();
    }

    public Prescription getPrescription(String id) {
        return prescriptionRepository.findById(id).get();
    }
}
