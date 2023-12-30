package com.lifepill.customerservice.repo;

import com.lifepill.customerservice.model.PrescriptionOrder;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PrescriptionOrderRepository extends MongoRepository<PrescriptionOrder, String> {
}
