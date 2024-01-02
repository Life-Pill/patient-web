package com.lifepill.customerservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
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
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String customerNIC;
}
