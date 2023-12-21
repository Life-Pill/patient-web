package com.lifepill.customerservice.model;

import java.time.LocalDate;
import java.util.List;

public class HealthCondition {
    private String healthConditionName;
    private LocalDate treatmentStartedDate;
    private List<Medication> medication;
    private ChannelingDetails channelingDetails;

    // constructor
    public HealthCondition() {

    }

    public HealthCondition(String healthConditionName, LocalDate treatmentStartedDate, List<Medication> medication, ChannelingDetails channelingDetails) {
        this.healthConditionName = healthConditionName;
        this.treatmentStartedDate = treatmentStartedDate;
        this.medication = medication;
        this.channelingDetails = channelingDetails;
    }

    // getters and setters
    public String getHealthConditionName() {
        return healthConditionName;
    }

    public void setHealthConditionName(String healthConditionName) {
        this.healthConditionName = healthConditionName;
    }

    public LocalDate getTreatmentStartedDate() {
        return treatmentStartedDate;
    }

    public void setTreatmentStartedDate(LocalDate treatmentStartedDate) {
        this.treatmentStartedDate = treatmentStartedDate;
    }

    public List<Medication> getMedication() {
        return medication;
    }

    public void setMedication(List<Medication> medication) {
        this.medication = medication;
    }

    public ChannelingDetails getChannelingDetails() {
        return channelingDetails;
    }

    public void setChannelingDetails(ChannelingDetails channelingDetails) {
        this.channelingDetails = channelingDetails;
    }

    //Medication class used in HealthCondition class
    public static class Medication {
        private String drugName;
        private String dosage;
        private String frequency;
        private boolean drugUsageStatus;
        private LocalDate startedDate;
        private LocalDate stoppedDate;

        // constructor
        public Medication() {

        }

        public Medication(String drugName, String dosage, String frequency, boolean drugUsageStatus, LocalDate startedDate, LocalDate stoppedDate) {
            this.drugName = drugName;
            this.dosage = dosage;
            this.frequency = frequency;
            this.drugUsageStatus = drugUsageStatus;
            this.startedDate = startedDate;
            this.stoppedDate = stoppedDate;
        }

        // getters and setters
        public String getDrugName() {
            return drugName;
        }

        public void setDrugName(String drugName) {
            this.drugName = drugName;
        }

        public String getDosage() {
            return dosage;
        }

        public void setDosage(String dosage) {
            this.dosage = dosage;
        }

        public String getFrequency() {
            return frequency;
        }

        public void setFrequency(String frequency) {
            this.frequency = frequency;
        }

        public boolean isDrugUsageStatus() {
            return drugUsageStatus;
        }

        public void setDrugUsageStatus(boolean drugUsageStatus) {
            this.drugUsageStatus = drugUsageStatus;
        }

        public LocalDate getStartedDate() {
            return startedDate;
        }

        public void setStartedDate(LocalDate startedDate) {
            this.startedDate = startedDate;
        }

        public LocalDate getStoppedDate() {
            return stoppedDate;
        }

        public void setStoppedDate(LocalDate stoppedDate) {
            this.stoppedDate = stoppedDate;
        }
    }

    //ChannelingDetails class used in HealthCondition class
    public static class ChannelingDetails {
        private String doctorName;
        private LocalDate lastDoctorVisit;
        private LocalDate nextDoctorVisit;

        // constructor
        public ChannelingDetails() {

        }

        public ChannelingDetails(String doctorName, LocalDate lastDoctorVisit, LocalDate nextDoctorVisit) {
            this.doctorName = doctorName;
            this.lastDoctorVisit = lastDoctorVisit;
            this.nextDoctorVisit = nextDoctorVisit;
        }

        // getters and setters
        public String getDoctorName() {
            return doctorName;
        }

        public void setDoctorName(String doctorName) {
            this.doctorName = doctorName;
        }

        public LocalDate getLastDoctorVisit() {
            return lastDoctorVisit;
        }

        public void setLastDoctorVisit(LocalDate lastDoctorVisit) {
            this.lastDoctorVisit = lastDoctorVisit;
        }

        public LocalDate getNextDoctorVisit() {
            return nextDoctorVisit;
        }

        public void setNextDoctorVisit(LocalDate nextDoctorVisit) {
            this.nextDoctorVisit = nextDoctorVisit;
        }
    }
}
