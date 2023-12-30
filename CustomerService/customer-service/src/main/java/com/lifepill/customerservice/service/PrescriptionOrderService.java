package com.lifepill.customerservice.service;

import com.lifepill.customerservice.model.PrescriptionOrder;
import com.lifepill.customerservice.repo.PrescriptionOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrescriptionOrderService {
    @Autowired
    private PrescriptionOrderRepository prescriptionOrderRepository;

    //get all the orders


    //get a specific order


    //add new oder and link the related prescription in the database
    public PrescriptionOrder addNewPrescriptionOrder(PrescriptionOrder newPrescriptionOrder){
        prescriptionOrderRepository.save(newPrescriptionOrder);

        return newPrescriptionOrder;
    }

    //update the status of the order

    //delete an order

}
