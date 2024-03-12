package com.lifepill.customerservice.controller;

import com.lifepill.customerservice.model.PrescriptionOrder;
import com.lifepill.customerservice.service.PrescriptionOrderService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("myOrders")
public class PrescriptionOrderController {
    @Autowired
    private PrescriptionOrderService prescriptionOrderService;

    // get all my prescription orders
    @GetMapping("/{customerId}")
    public List<PrescriptionOrder> getAllPrescriptionOrders(@PathVariable Long customerId) {
        return prescriptionOrderService.getAllPrescriptionOrders(customerId);
    }

    // get a specific order
    @GetMapping("/{customerId}/{prescriptionOrderId}")
    public Optional<PrescriptionOrder> getPrescriptionOrder(@PathVariable Long customerId,
            @PathVariable String prescriptionOrderId) {
        return prescriptionOrderService.getPrescriptionOrder(customerId, prescriptionOrderId);
    }

    // add new oder
    @PostMapping
    public PrescriptionOrder addNewPrescriptionOrder(@RequestBody PrescriptionOrder newPrescriptionOrder) {
        return prescriptionOrderService.addNewPrescriptionOrder(newPrescriptionOrder);
    }

    // update the selected pharmacy of the order
    @PutMapping("/{customerId}/{prescriptionOrderId}/{selectedPharmacyId}")
    public PrescriptionOrder updatePrescriptionOrderSelectedPharmacy(@PathVariable Long customerId,
            @PathVariable String prescriptionOrderId,
            @PathVariable String selectedPharmacyId) {
        return prescriptionOrderService.updatePrescriptionOrderSelectedPharmacy(customerId, prescriptionOrderId,
                selectedPharmacyId);
    }

    // delete my prescription order
    @DeleteMapping("{customerId}/{prescriptionOrderId}")
    public String deletePrescriptionOrder(@PathVariable Long customerId, @PathVariable String prescriptionOrderId) {
        prescriptionOrderService.deletePrescriptionOrder(customerId, prescriptionOrderId);

        return "Prescription order deleted successfully";
    }
}
