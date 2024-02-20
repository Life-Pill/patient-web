package com.lifepill.pharmacyservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lifepill.pharmacyservice.model.Pharmacy;
import com.lifepill.pharmacyservice.repo.PharmacyRepository;
import com.lifepill.pharmacyservice.util.ResourceNotFoundException;

@Service
public class PharmacyService {
    @Autowired
    private PharmacyRepository pharmacyRepository;

    // get all pharmacies
    public List<Pharmacy> getAllPharmacies() {
        return pharmacyRepository.findAll();
    }

    // get all pharmacies by district
    public List<Pharmacy> getPharmacyByDistrict(String district) {
        return pharmacyRepository.findByPharmacyAddressDistrict(district);
    }

    // get all pharmacies by city
    public List<Pharmacy> getPharmacyByCity(String city) {
        return pharmacyRepository.findByPharmacyAddressCity(city);
    }

    // get pharmacy by id
    public Optional<Pharmacy> getPharmacy(Long id) {
        Optional<Pharmacy> pharmacy = pharmacyRepository.findById(id);

        if (pharmacy.isEmpty()) {
            throw new ResourceNotFoundException("Pharmacy with ID " + id + " not found.");
        } else {
            return pharmacy;
        }
    }

    // add new pharmacy

    // update pharmacy

    // delete pharmacy
    public void deletePharmacy(Long id) {
        Optional<Pharmacy> pharmacy = pharmacyRepository.findById(id);

        // Customer Id not found error handling
        if (pharmacy.isEmpty()) {
            throw new ResourceNotFoundException("Pharmacy with ID " + id + " not found.");
        }

        pharmacyRepository.deleteById(id);
    }

    // delete all pharmacies
    public void deleteAllPharmacies() {
        pharmacyRepository.deleteAll();
    }
}
