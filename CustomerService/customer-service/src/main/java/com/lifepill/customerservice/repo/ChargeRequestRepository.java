package com.lifepill.customerservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lifepill.customerservice.model.ChargeRequest;

public interface ChargeRequestRepository extends JpaRepository<ChargeRequest, Long> {

}
