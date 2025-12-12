package com.devxpo.farmerapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devxpo.farmerapp.entity.Farmer;

import java.util.Optional;

public interface FarmerRepository extends JpaRepository<Farmer, Long> {
    Optional<Farmer> findByMobile(String mobile);
}
