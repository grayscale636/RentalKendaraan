package com.rental.model;

import javax.persistence.Entity;

@Entity
public class Penyewa extends User {
    // Tidak perlu mendeklarasikan id lagi, karena sudah ada di User
    private String alamat;
    private String nomorTelepon;

    // Constructor
    public Penyewa() {
    }

    // Getter dan Setter
    @Override
    public String getId() {
        return super.getId(); // Menggunakan getId() dari User
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    // Metode tambahan jika diperlukan
    @Override
    public String toString() {
        return "Penyewa{" +
                "id='" + getId() + '\'' +
                ", nama='" + getNama() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", alamat='" + alamat + '\'' +
                ", nomorTelepon='" + nomorTelepon + '\'' +
                '}';
    }
}