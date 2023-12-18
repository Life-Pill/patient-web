package com.lifepill.customerservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collection = "medicalRecords")
public class MedicalRecord {
    @Id
    private String id;
    private int patientId;
    private int patientAge;
    private List<HealthCondition> healthConditions;
    private List<String> allergies;
    private List<LaboratoryTest> laboratories;
    private Date createdDate;
    private Date updatedDate;

    public MedicalRecord() {

    }

    public MedicalRecord(int patientId, int patientAge, List<HealthCondition> healthConditions, List<String> allergies, List<LaboratoryTest> laboratories, Date createdDate, Date updatedDate) {
        this.patientId = patientId;
        this.patientAge = patientAge;
        this.healthConditions = healthConditions;
        this.allergies = allergies;
        this.laboratories = laboratories;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public String getId() {
        return id;
    }

    public int getPatientId() {
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

    public Date getCreatedDate() {
        return createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPatientId(int patientId) {
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

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
}
