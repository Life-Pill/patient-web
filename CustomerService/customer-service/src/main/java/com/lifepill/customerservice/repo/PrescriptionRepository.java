package com.lifepill.customerservice.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lifepill.customerservice.model.Prescription;

public interface PrescriptionRepository extends MongoRepository<Prescription, String> {

}
