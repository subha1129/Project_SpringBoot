package com.devxpo.farmerapp.exception;

public class FarmerNotFoundException extends RuntimeException {
    public FarmerNotFoundException(Long id) {
        super("Farmer not found with ID: " + id);
    }
    public FarmerNotFoundException(String message) {
        super(message);
    }
}
