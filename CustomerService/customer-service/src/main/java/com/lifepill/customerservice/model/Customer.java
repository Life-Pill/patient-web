package com.lifepill.customerservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cus_id")
    private Long customerId;
    @Column(name = "full_name", nullable = false, length = 200)
    private String customerFullName;
    @Column(name = "email", nullable = false, unique = true, length = 200)
    private String customerEmail;
    @Column(name = "mobile_number", nullable = false, unique = true, length = 50)
    private String customerMobileNumber;
    @Column(name = "cus_password", nullable = false, length = 200)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String customerPassword;
    @Column(name = "address_street", nullable = false, length = 200)
    private String customerAddressStreet;
    @Column(name = "address_city", nullable = false, length = 200)
    private String customerAddressCity;
    @Column(name = "address_district", nullable = false, length = 100)
    private String customerAddressDistrict;
    @Column(name = "nic", nullable = false, unique = true, length = 20)
    private String customerNIC;

    public Customer(){}

    public Customer(String customerFullName, String customerEmail, String customerMobileNumber, String customerPassword, String customerAddressStreet, String customerAddressCity, String customerAddressDistrict, String customerNIC) {
        this.customerFullName = customerFullName;
        this.customerEmail = customerEmail;
        this.customerMobileNumber = customerMobileNumber;
        this.customerPassword = customerPassword;
        this.customerAddressStreet = customerAddressStreet;
        this.customerAddressCity = customerAddressCity;
        this.customerAddressDistrict = customerAddressDistrict;
        this.customerNIC = customerNIC;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public String getCustomerFullName() {
        return customerFullName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerMobileNumber() {
        return customerMobileNumber;
    }

    public String getCustomerPassword() {
        return customerPassword;
    }

    public String getCustomerAddressStreet() {
        return customerAddressStreet;
    }

    public String getCustomerAddressCity() {
        return customerAddressCity;
    }

    public String getCustomerAddressDistrict() {
        return customerAddressDistrict;
    }

    public String getCustomerNIC() {
        return customerNIC;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public void setCustomerFullName(String customerFullName) {
        this.customerFullName = customerFullName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerMobileNumber(String customerMobileNumber) {
        this.customerMobileNumber = customerMobileNumber;
    }

    public void setCustomerPassword(String customerPassword) {
        this.customerPassword = customerPassword;
    }

    public void setCustomerAddressStreet(String customerAddressStreet) {
        this.customerAddressStreet = customerAddressStreet;
    }

    public void setCustomerAddressCity(String customerAddressCity) {
        this.customerAddressCity = customerAddressCity;
    }

    public void setCustomerAddressDistrict(String customerAddressDistrict) {
        this.customerAddressDistrict = customerAddressDistrict;
    }

    public void setCustomerNIC(String customerNIC) {
        this.customerNIC = customerNIC;
    }
}
