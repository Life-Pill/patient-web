package com.lifepill.customerservice.controller;

import com.lifepill.customerservice.model.Customer;
import com.lifepill.customerservice.model.SubCustomer;
import com.lifepill.customerservice.service.SubCustomerService;
import com.lifepill.customerservice.util.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/subCustomers")
public class SubCustomerController {
    @Autowired
    private SubCustomerService subCustomerService;

    //get all the sub customers for a particular parent
    @GetMapping("/{parentId}")
    public List<SubCustomer> getAllSubCustomers(@PathVariable Long parentId){
        return subCustomerService.getAllSubCustomers(parentId);
    }

    //get a specific sub customer for a particular parent
    @GetMapping("/{parentId}/{childId}")
    public SubCustomer getSubCustomer(@PathVariable Long parentId,@PathVariable Long childId){
        return subCustomerService.getSubCustomer(parentId, childId);
    }

    //add new sub customer
    @PostMapping
    public SubCustomer addNewSubCustomer(@RequestBody SubCustomer newSubCustomer){
        return subCustomerService.addNewSubCustomer(newSubCustomer);
    }

    //update a sub customer
    @PutMapping("/{parentId}/{childId}")
    public SubCustomer updateSubCustomer(@PathVariable Long parentId,@PathVariable Long childId,@RequestBody SubCustomer updatedSubCustomer){
        return subCustomerService.updateSubCustomer(parentId, childId, updatedSubCustomer);
    }

    //delete a sub customer
    @DeleteMapping("/{parentId}/{childId}")
    public String deleteSubCustomer(@PathVariable Long parentId,@PathVariable Long childId){
        subCustomerService.deleteSubCustomer(parentId, childId);

        return "Sub Customer Deleted Successfully";
    }
}
