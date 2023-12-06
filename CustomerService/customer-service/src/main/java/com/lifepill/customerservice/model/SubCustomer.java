package com.lifepill.customerservice.model;

import jakarta.persistence.*;

@Entity
@Table(name = "subCustomer")
public class SubCustomer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subCus_id")
    private Long subCustomerId;
    @Column(name = "parent_id", nullable = false)
    private Long parentId;
    @Column(name = "full_name", nullable = false, length = 200)
    private String subCustomerFullName;
    @Column(name = "nic", nullable = true, unique = true, length = 20)
    private String subCustomerNIC;

    public SubCustomer(){

    }

    public SubCustomer(Long parentId, String subCustomerFullName, String subCustomerNIC) {
        this.parentId = parentId;
        this.subCustomerFullName = subCustomerFullName;
        this.subCustomerNIC = subCustomerNIC;
    }

    public Long getSubCustomerId() {
        return subCustomerId;
    }

    public Long getParentId() {
        return parentId;
    }

    public String getSubCustomerFullName() {
        return subCustomerFullName;
    }

    public String getSubCustomerNIC() {
        return subCustomerNIC;
    }

    public void setSubCustomerId(Long subCustomerId) {
        this.subCustomerId = subCustomerId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public void setSubCustomerFullName(String subCustomerFullName) {
        this.subCustomerFullName = subCustomerFullName;
    }

    public void setSubCustomerNIC(String subCustomerNIC) {
        this.subCustomerNIC = subCustomerNIC;
    }
}
