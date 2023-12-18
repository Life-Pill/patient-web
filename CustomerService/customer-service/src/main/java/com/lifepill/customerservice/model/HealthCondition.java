package com.lifepill.customerservice.model;

import java.util.Date;
import java.util.List;

public class HealthCondition {
    private String healthConditionName;
    private Date treatmentStartedDate;
    private List<Medication> medication;
    private ChannelingDetails channelingDetails;

    // constructor
    public HealthCondition() {

    }

    public HealthCondition(String healthConditionName, Date treatmentStartedDate, List<Medication> medication, ChannelingDetails channelingDetails) {
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

    public Date getTreatmentStartedDate() {
        return treatmentStartedDate;
    }

    public void setTreatmentStartedDate(Date treatmentStartedDate) {
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
        private Date startedDate;
        private Date stoppedDate;

        // constructor
        public Medication() {

        }

        public Medication(String drugName, String dosage, String frequency, boolean drugUsageStatus, Date startedDate, Date stoppedDate) {
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

        public Date getStartedDate() {
            return startedDate;
        }

        public void setStartedDate(Date startedDate) {
            this.startedDate = startedDate;
        }

        public Date getStoppedDate() {
            return stoppedDate;
        }

        public void setStoppedDate(Date stoppedDate) {
            this.stoppedDate = stoppedDate;
        }
    }

    //ChannelingDetails class used in HealthCondition class
    public static class ChannelingDetails {
        private String doctorName;
        private Date lastDoctorVisit;
        private Date nextDoctorVisit;

        // constructor
        public ChannelingDetails() {

        }

        public ChannelingDetails(String doctorName, Date lastDoctorVisit, Date nextDoctorVisit) {
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

        public Date getLastDoctorVisit() {
            return lastDoctorVisit;
        }

        public void setLastDoctorVisit(Date lastDoctorVisit) {
            this.lastDoctorVisit = lastDoctorVisit;
        }

        public Date getNextDoctorVisit() {
            return nextDoctorVisit;
        }

        public void setNextDoctorVisit(Date nextDoctorVisit) {
            this.nextDoctorVisit = nextDoctorVisit;
        }
    }
}
