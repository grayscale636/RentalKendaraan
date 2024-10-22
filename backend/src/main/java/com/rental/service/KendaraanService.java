package com.rental.service;

import com.rental.model.Kendaraan;
import com.rental.repository.KendaraanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KendaraanService {

    @Autowired
    private KendaraanRepository kendaraanRepository;

    public List<Kendaraan> getAllKendaraan() {
        return kendaraanRepository.findAll();
    }
}