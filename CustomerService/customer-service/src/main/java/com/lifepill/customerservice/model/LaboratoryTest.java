package com.lifepill.customerservice.model;

import java.util.Date;

public class LaboratoryTest {
    private String laboratoryTestName;
    private Date laboratoryTestDate;
    private Date nextlaboratoryTestDate;

    // constructor
    public LaboratoryTest() {

    }

    public LaboratoryTest(String laboratoryTestName, Date laboratoryTestDate, Date nextlaboratoryTestDate) {
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

    public Date getLaboratoryTestDate() {
        return laboratoryTestDate;
    }

    public void setLaboratoryTestDate(Date laboratoryTestDate) {
        this.laboratoryTestDate = laboratoryTestDate;
    }

    public Date getNextlaboratoryTestDate() {
        return nextlaboratoryTestDate;
    }

    public void setNextlaboratoryTestDate(Date nextlaboratoryTestDate) {
        this.nextlaboratoryTestDate = nextlaboratoryTestDate;
    }
}
