package com.devxpo.farmerapp.service;

import com.devxpo.farmerapp.entity.Farmer;
import com.devxpo.farmerapp.exception.FarmerNotFoundException;
import com.devxpo.farmerapp.repository.FarmerRepository;
import org.springframework.stereotype.Service;

@Service
public class FarmerService {

    private final FarmerRepository farmerRepository;

    public FarmerService(FarmerRepository farmerRepository) {
        this.farmerRepository = farmerRepository;
    }

    public Farmer getFarmerById(Long id) {
        return farmerRepository.findById(id)
                .orElseThrow(() -> new FarmerNotFoundException("Farmer not found with id: " + id));
    }

    public Farmer createFarmer(Farmer farmer) {
        return farmerRepository.save(farmer);
    }

    public Farmer getFarmerByMobile(String mobile) {
        return farmerRepository.findByMobile(mobile)
                .orElseThrow(() ->
                        new FarmerNotFoundException("Farmer not found with mobile: " + mobile)
                );
    }
}
