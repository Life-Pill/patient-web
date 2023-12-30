package com.lifepill.customerservice.service;

import com.lifepill.customerservice.model.PrescriptionOrder;
import com.lifepill.customerservice.repo.PrescriptionOrderRepository;
import com.lifepill.customerservice.util.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PrescriptionOrderService {
    @Autowired
    private GridFsTemplate template;

    @Autowired
    private PrescriptionOrderRepository prescriptionOrderRepository;

//    @Autowired
//    private PrescriptionService prescriptionService;

    //get all the orders
    public List<PrescriptionOrder> getAllPrescriptionOrders(){
        return prescriptionOrderRepository.findAll();
    }

    //get a specific order
    public Optional<PrescriptionOrder> getPrescriptionOrder(String prescriptionOrderId){
        Optional<PrescriptionOrder> prescriptionOrder = prescriptionOrderRepository.findById(prescriptionOrderId);

        if(prescriptionOrder.isEmpty()){
            throw new ResourceNotFoundException("Order with ID " + prescriptionOrderId + " not found.");
        }else{
            return prescriptionOrder;
        }
    }

    //add new oder and link the related prescription in the database
    //this will be called inside the PrescriptionService class when adding a new prescription
    public void addNewPrescriptionOrder(PrescriptionOrder newPrescriptionOrder){
        prescriptionOrderRepository.save(newPrescriptionOrder);
    }

    //update the status of the order
    public PrescriptionOrder updatePrescriptionOrderStatus(String prescriptionOrderId, PrescriptionOrder updatedPrescriptionOrder){
        Optional<PrescriptionOrder> prescriptionOrder = prescriptionOrderRepository.findById(prescriptionOrderId);

        if(prescriptionOrder.isEmpty()){
            throw new ResourceNotFoundException("Order with ID " + prescriptionOrderId + " not found.");
        }

        PrescriptionOrder existingPrescriptionOrder = prescriptionOrder.get();

        existingPrescriptionOrder.setOrderStatus(updatedPrescriptionOrder.getOrderStatus());

        prescriptionOrderRepository.save(existingPrescriptionOrder);

        return existingPrescriptionOrder;
    }

    //delete an order
    public void deletePrescriptionOrder(String prescriptionOrderId){
        Optional<PrescriptionOrder> prescriptionOrder = prescriptionOrderRepository.findById(prescriptionOrderId);

        if(prescriptionOrder.isEmpty()){
            throw new ResourceNotFoundException("Order with ID " + prescriptionOrderId + " not found.");
        }

        PrescriptionOrder existingPrescriptionOrder = prescriptionOrder.get();

        prescriptionOrderRepository.deleteById(prescriptionOrderId);

        template.delete(new Query(Criteria.where("_id").is(existingPrescriptionOrder.getPrescriptionId())));
//        prescriptionService.deletePrescription(existingPrescriptionOrder.getPrescriptionId());
    }
}
