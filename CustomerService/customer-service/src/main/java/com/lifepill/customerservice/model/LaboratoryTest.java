package com.lifepill.customerservice.model;


import java.time.LocalDate;

public class LaboratoryTest {
    private String laboratoryTestName;
    private LocalDate laboratoryTestDate;
    private LocalDate nextlaboratoryTestDate;

    // constructor
    public LaboratoryTest() {

    }

    public LaboratoryTest(String laboratoryTestName, LocalDate laboratoryTestDate, LocalDate nextlaboratoryTestDate) {
        this.laboratoryTestName = laboratoryTestName;
        this.laboratoryTestDate = laboratoryTestDate;
        this.nextlaboratoryTestDate = nextlaboratoryTestDate;
    }

    // getters and setters
    public String getLaboratoryTestName() {
        return laboratoryTestName;
    }

    public void setLaboratoryTestName(String laboratoryTestName) {
        this.laboratoryTestName = laboratoryTestName;
    }

    public LocalDate getLaboratoryTestDate() {
        return laboratoryTestDate;
    }

    public void setLaboratoryTestDate(LocalDate laboratoryTestDate) {
        this.laboratoryTestDate = laboratoryTestDate;
    }

    public LocalDate getNextlaboratoryTestDate() {
        return nextlaboratoryTestDate;
    }

    public void setNextlaboratoryTestDate(LocalDate nextlaboratoryTestDate) {
        this.nextlaboratoryTestDate = nextlaboratoryTestDate;
    }
}
