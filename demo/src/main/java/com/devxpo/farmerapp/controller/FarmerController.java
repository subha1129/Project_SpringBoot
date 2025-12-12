package com.devxpo.farmerapp.controller;

import com.devxpo.farmerapp.entity.Farmer;
import com.devxpo.farmerapp.service.FarmerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "*") 
@RequestMapping("/farmer")
public class FarmerController {

    private final FarmerService farmerService;

    public FarmerController(FarmerService farmerService) {
        this.farmerService = farmerService;
    }

    // 🔹 GET /farmer/{id}
    @GetMapping("/id/{id}")
    public ResponseEntity<Farmer> getFarmerById(@PathVariable Long id) {
        Farmer farmer = farmerService.getFarmerById(id);
        return ResponseEntity.ok(farmer);
    }

     @PostMapping("/create")
    public ResponseEntity<Farmer> createFarmer(@RequestBody Farmer farmer) {
        Farmer savedFarmer = farmerService.createFarmer(farmer);
        return ResponseEntity.ok(savedFarmer);
    }


    @GetMapping("/mobile/{mobile}")
    public ResponseEntity<Farmer> getFarmerByMobile(@PathVariable String mobile) {
        Farmer farmer = farmerService.getFarmerByMobile(mobile);
        return ResponseEntity.ok(farmer);
    }
}

