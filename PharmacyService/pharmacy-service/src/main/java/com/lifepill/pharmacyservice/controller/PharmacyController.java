package com.lifepill.pharmacyservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lifepill.pharmacyservice.model.Pharmacy;
import com.lifepill.pharmacyservice.service.PharmacyService;

@RestController
@RequestMapping("/pharmacies")
public class PharmacyController {
    @Autowired
    private PharmacyService pharmacyService;

    // get all pharmacies
    @GetMapping
    public List<Pharmacy> getAllPharmacies() {
        return pharmacyService.getAllPharmacies();
    }

    // get all pharmacies by district
    @GetMapping("/{district}")
    public List<Pharmacy> getPharmacyByDistrict(@PathVariable String district) {
        return pharmacyService.getPharmacyByDistrict(district);
    }

    // get all pharmacies by city
    @GetMapping("/{city}")
    public List<Pharmacy> getPharmacyByCity(@PathVariable String city) {
        return pharmacyService.getPharmacyByCity(city);
    }

    // get pharmacy by id
    @GetMapping("/{id}")
    public Optional<Pharmacy> getPharmacy(@PathVariable Long id) {
        return pharmacyService.getPharmacy(id);
    }

    // add new pharmacy
    @PostMapping
    public Pharmacy addPharmacy(@RequestBody Pharmacy newPharmacy) {
        return pharmacyService.addPharmacy(newPharmacy);
    }

    // update pharmacy open status
    @PutMapping("/{id}")
    public Pharmacy updatePharmacyOpenStatus(@PathVariable Long id, @RequestBody Pharmacy updatedPharmacy) {
        return pharmacyService.updatePharmacyOpenStatus(id, updatedPharmacy);
    }

    // delete pharmacy
    @DeleteMapping("/{id}")
    public void deletePharmacy(@PathVariable Long id) {
        pharmacyService.deletePharmacy(id);
    }

    // delete all pharmacies
    @DeleteMapping
    public void deleteAllPharmacies() {
        pharmacyService.deleteAllPharmacies();
    }
}
