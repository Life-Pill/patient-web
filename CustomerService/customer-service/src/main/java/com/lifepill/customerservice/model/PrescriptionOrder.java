package com.lifepill.customerservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "prescriptionOrders")
public class PrescriptionOrder {
    @Id
    private String id;
    private Long customerId;
    private String prescriptionId;
    private boolean orderStatus;
    private LocalDateTime createdOn;

    public PrescriptionOrder() {
        this.createdOn = LocalDateTime.now();
    }

    public PrescriptionOrder(Long customerId, String prescriptionId, boolean orderStatus) {
        this.customerId = customerId;
        this.prescriptionId = prescriptionId;
        this.orderStatus = orderStatus;
        this.createdOn = LocalDateTime.now();
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

    public String getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(String prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    public boolean isOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(boolean orderStatus) {
        this.orderStatus = orderStatus;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }
}
