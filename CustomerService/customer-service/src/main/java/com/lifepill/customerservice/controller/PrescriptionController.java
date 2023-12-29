package com.lifepill.customerservice.controller;

import com.lifepill.customerservice.model.Prescription;
import com.lifepill.customerservice.service.PrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;

@RestController
@RequestMapping("/prescriptions")
public class PrescriptionController {
    @Autowired
    private PrescriptionService prescriptionService;

    @PostMapping("/{customerId}/{title}")
    public String addPrescription(@PathVariable Long customerId, @PathVariable String title, @RequestBody MultipartFile image) throws IOException {
        String id = prescriptionService.addPrescription(customerId, title, image);
        return "redirect:/photos/" + id;
    }

    @GetMapping
    public Prescription getPrescription(@PathVariable String id) {
        Prescription prescription = prescriptionService.getPrescription(id);
        return prescription;
    }
}
