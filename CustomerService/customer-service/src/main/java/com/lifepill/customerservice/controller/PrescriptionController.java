package com.lifepill.customerservice.controller;

import com.lifepill.customerservice.model.Prescription;
import com.lifepill.customerservice.service.PrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;

@RestController
@CrossOrigin("*")
@RequestMapping("prescriptions")
public class PrescriptionController {
    @Autowired
    private PrescriptionService prescriptionService;

    @PostMapping("/{customerId}")
    public ResponseEntity<?> upload(@RequestParam("file")MultipartFile file,@PathVariable Long customerId) throws IOException {
        return new ResponseEntity<>(prescriptionService.addPrescription(file, customerId), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ByteArrayResource> download(@PathVariable String id) throws IOException {
        Prescription prescription = prescriptionService.getPrescription(id);

        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(prescription.getFileType() ))
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + prescription.getFileName() + "\"")
                .body(new ByteArrayResource(prescription.getFile()));
    }
}
