package com.lifepill.customerservice.controller;

import com.lifepill.customerservice.model.Customer;
import com.lifepill.customerservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    //get all customers
    @GetMapping
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    //get customer by id
    @GetMapping("/{id}")
    public Optional<Customer> getCustomer(@PathVariable Long id){
        return customerService.getCustomer(id);
    }

    //add new customer
    @PostMapping
    public Customer addNewCustomer(@RequestBody Customer newCustomer){
        return customerService.addNewCustomer(newCustomer);
    }

    //update customer
    @PutMapping("/{id}")
    public Customer updateCustomer(@PathVariable Long id,@RequestBody Customer updatedCustomer){
        return customerService.updateCustomer(id, updatedCustomer);
    }

    //delete customer
    @DeleteMapping("/{id}")
    public String deleteCustomer(@PathVariable Long id){
        customerService.deleteCustomer(id);

        return "Customer deleted successfully";
    }

    //delete all customers
    @DeleteMapping
    public String deleteAllCustomers(){
        customerService.deleteAllCustomers();

        return "All the customers deleted successfully";
    }
}
