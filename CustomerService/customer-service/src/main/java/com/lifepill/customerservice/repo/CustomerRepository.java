package com.lifepill.customerservice.repo;

import com.lifepill.customerservice.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
