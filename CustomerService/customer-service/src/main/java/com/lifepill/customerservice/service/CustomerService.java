package com.lifepill.customerservice.service;

import com.lifepill.customerservice.model.Customer;
import com.lifepill.customerservice.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    //get all customers
    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }

    //get customer by id
    public Optional<Customer> getCustomer(Long id){
        return customerRepository.findById(id);
    }

    //add new customer
    public Customer addNewCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    //update customer
    public Customer updateCustomer(Long id, Customer updatedCustomer){
        Optional<Customer> customer = customerRepository.findById(id);

        if(customer.isPresent()){
            Customer existingCustomer = customer.get();

            existingCustomer.setCustomerFullName(updatedCustomer.getCustomerFullName());
            existingCustomer.setCustomerEmail(updatedCustomer.getCustomerEmail());
            existingCustomer.setCustomerMobileNumber(updatedCustomer.getCustomerMobileNumber());
            existingCustomer.setCustomerPassword(updatedCustomer.getCustomerPassword());
            existingCustomer.setCustomerAddressStreet(updatedCustomer.getCustomerAddressStreet());
            existingCustomer.setCustomerAddressCity(updatedCustomer.getCustomerAddressCity());
            existingCustomer.setCustomerAddressDistrict(updatedCustomer.getCustomerAddressDistrict());
            existingCustomer.setCustomerNIC(updatedCustomer.getCustomerNIC());
            existingCustomer.setCustomerDateOfBirth(updatedCustomer.getCustomerDateOfBirth());

            return customerRepository.save(existingCustomer);
        }

        return null;
    }

    //delete customer
    public void deleteCustomer(Long id){
        customerRepository.deleteById(id);
    }

    //delete all customers
    public void deleteAllCustomers(){
        customerRepository.deleteAll();
    }
}
