package com.rental.repository;

import com.rental.model.Kendaraan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KendaraanRepository extends JpaRepository<Kendaraan, String> {
    // func