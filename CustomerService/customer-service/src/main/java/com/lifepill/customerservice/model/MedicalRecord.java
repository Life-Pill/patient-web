package com.lifepill.customerservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "medicalRecords")
public class MedicalRecord {
    @Id
    private String id;
    private boolean subAccount;
    private Long patientId;
    private int patientAge;
    private List<HealthCondition> healthConditions;
    private List<String> allergies;
    private List<LaboratoryTest> laboratories;
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;

    public MedicalRecord() {
        this.createdOn = LocalDateTime.now();
        this.updatedOn = LocalDateTime.now();
    }

    public MedicalRecord(boolean subAccount, Long patientId, int patientAge, List<HealthCondition> healthConditions, List<String> allergies, List<LaboratoryTest> laboratories) {
        this.subAccount = subAccount;
        this.patientId = patientId;
        this.patientAge = patientAge;
        this.healthConditions = healthConditions;
        this.allergies = allergies;
        this.laboratories = laboratories;
        this.createdOn = LocalDateTime.now();
        this.updatedOn = LocalDateTime.now();
    }

    public String getId() {
        return id;
    }

    public boolean getSubAccount() {
        return subAccount;
    }

    public Long getPatientId() {
        return patientId;
    }

    public int getPatientAge() {
        return patientAge;
    }

    public List<HealthCondition> getHealthConditions() {
        return healthConditions;
    }

    public List<String> getAllergies() {
        return allergies;
    }

    public List<LaboratoryTest> getLaboratories() {
        return laboratories;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public LocalDateTime getUpdatedOn() {
        return updatedOn;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSubAccount(boolean isSubAccount) {
        subAccount = isSubAccount;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }

    public void setHealthConditions(List<HealthCondition> healthConditions) {
        this.healthConditions = healthConditions;
    }

    public void setAllergies(List<String> allergies) {
        this.allergies = allergies;
    }

    public void setLaboratories(List<LaboratoryTest> laboratories) {
        this.laboratories = laboratories;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = LocalDateTime.now();
    }

    public void setUpdatedOn(LocalDateTime updatedOn) {
        this.updatedOn = LocalDateTime.now();
    }
}
