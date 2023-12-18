package com.lifepill.customerservice.model;

import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "medicalRecords")
public class MedicalRecord {
    @Id
    private String recordID;
}
