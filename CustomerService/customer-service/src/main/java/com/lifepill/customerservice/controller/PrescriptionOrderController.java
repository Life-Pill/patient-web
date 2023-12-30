package com.lifepill.customerservice.controller;

import com.lifepill.customerservice.model.PrescriptionOrder;
import com.lifepill.customerservice.service.PrescriptionOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("orders")
public class PrescriptionOrderController {
    @Autowired
    private PrescriptionOrderService prescriptionOrderService;

    //get all orders
    @GetMapping
    public List<PrescriptionOrder> getAllPrescriptionOrders(){
        return prescriptionOrderService.getAllPrescriptionOrders();
    }

    //get a specific order
    @GetMapping("/{prescriptionOrderId}")
    public Optional<PrescriptionOrder> getPrescriptionOrders(@PathVariable String prescriptionOrderId){
        return prescriptionOrderService.getPrescriptionOrder(prescriptionOrderId);
    }

    //update the order status
    @PutMapping("/{prescriptionOrderId}")
    public PrescriptionOrder updatePrescriptionOrderStatus(@PathVariable String prescriptionOrderId, @RequestBody PrescriptionOrder updatedPrescriptionOrder){
        return prescriptionOrderService.updatePrescriptionOrderStatus(prescriptionOrderId, updatedPrescriptionOrder);
    }

    //delete an order
    @DeleteMapping("/{prescriptionOrderId}")
    public String deletePrescriptionOrder(@PathVariable String prescriptionOrderId){
        prescriptionOrderService.deletePrescriptionOrder(prescriptionOrderId);

        return "Order deleted successfully";
    }
}
