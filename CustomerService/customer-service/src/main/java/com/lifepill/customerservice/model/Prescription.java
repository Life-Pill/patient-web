package com.lifepill.customerservice.model;

import org.bson.types.Binary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "prescriptions")
public class Prescription {
    @Id
    private String id;
    private Long customerId;
    private String prescriptionTitle;

    private Binary prescriptionImage;

    public Prescription() {

    }

    public Prescription(Long customerId, String title, Binary image) {
        this.customerId = customerId;
        this.prescriptionTitle = title;
        this.prescriptionImage = image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getPrescriptionTitle() {
        return prescriptionTitle;
    }

    public void setPrescriptionTitle(String prescriptionTitle) {
        this.prescriptionTitle = prescriptionTitle;
    }

    public Binary getPrescriptionImage() {
        return prescriptionImage;
    }

    public void setPrescriptionImage(Binary prescriptionImage) {
        this.prescriptionImage = prescriptionImage;
    }
}
