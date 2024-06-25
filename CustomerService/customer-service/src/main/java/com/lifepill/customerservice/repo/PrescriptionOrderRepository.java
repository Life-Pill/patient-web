package com.lifepill.customerservice.repo;

import com.lifepill.customerservice.model.PrescriptionOrder;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
@EnableJpaRepositories
public interface PrescriptionOrderRepository extends MongoRepository<PrescriptionOrder, String> {
    List<PrescriptionOrder> findByCustomerId(Long customerId);
}
