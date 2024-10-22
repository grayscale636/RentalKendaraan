package com.rental.model;

import javax.persistence.*;

@Entity
@DiscriminatorValue("mobil")
public class Mobil extends Kendaraan {
    private int jumlahPintu; // Jumlah pintu
    private boolean adaRemCakram; // Apakah ada rem cakram

    // Getter dan Setter
    public int getJumlahPintu() {
        return jumlahPintu;
    }

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    public boolean isAdaRemCakram() {
        return adaRemCakram;
    }

    public void setAdaRemCakram(boolean adaRemCakram) {
        this.adaRemCakram = adaRemCakram;
    }
}