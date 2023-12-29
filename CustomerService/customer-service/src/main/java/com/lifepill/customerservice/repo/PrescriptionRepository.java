package com.lifepill.customerservice.repo;

import com.lifepill.customerservice.model.Prescription;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PrescriptionRepository extends MongoRepository<Prescription, String> {
}
