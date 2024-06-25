package com.lifepill.customerservice.repo;

import com.lifepill.customerservice.model.MedicalRecord;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.MongoRepository;

@EnableJpaRepositories
public interface MedicalRecordRepository extends MongoRepository<MedicalRecord, String> {
}
