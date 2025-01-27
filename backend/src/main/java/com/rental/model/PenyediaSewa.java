package com.rental.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PenyediaSewa {
    @Id
    private Long id;
    private String nama;
    private String alamat;
    private String kendaraan;

    // Getter dan Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}