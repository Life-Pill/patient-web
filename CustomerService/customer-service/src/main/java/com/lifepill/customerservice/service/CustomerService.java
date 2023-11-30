package com.lifepill.customerservice.service;

import com.lifepill.customerservice.model.Customer;
import com.lifepill.customerservice.repo.CustomerRepository;
import com.lifepill.customerservice.util.ResourceNotFoundException;
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
        Optional<Customer> customer = customerRepository.findById(id);
        if(customer.isEmpty()){
            throw new ResourceNotFoundException("Customer with ID " + id + " not found.");
        }else{
            return customer;
        }
    }

    //add new customer
    public Customer addNewCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    //update customer
    public Customer updateCustomer(Long id, Customer updatedCustomer){
        Optional<Customer> customer = customerRepository.findById(id);

        if(customer.isEmpty()){
            throw new ResourceNotFoundException("Customer with ID " + id + " not found.");
        }else{
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
    }

    //delete customer
    public void deleteCustomer(Long id){
        Optional<Customer> customer = customerRepository.findById(id);

        if(customer.isEmpty()){
            throw new ResourceNotFoundException("Customer with ID " + id + " not found.");
        }

        customerRepository.deleteById(id);
    }

    //delete all customers
    public void deleteAllCustomers(){
        customerRepository.deleteAll();
    }
}
