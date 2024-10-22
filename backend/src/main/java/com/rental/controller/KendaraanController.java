package com.rental.controller;

import com.rental.model.Kendaraan;
import com.rental.service.KendaraanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class KendaraanController {

    @Autowired
    private KendaraanService kendaraanService;

    @GetMapping("/kendaraan")
    public List<Kendaraan> getAllKendaraan() {
        return kendaraanService.getAllKendaraan();
    }
}