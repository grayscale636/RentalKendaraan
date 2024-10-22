package com.rental.model;
import javax.persistence.Entity;

@Entity
public class Motor extends Kendaraan {
    private boolean adaRemCakram;

    public boolean isAdaRemCakram() {
        return adaRemCakram;
    }

    public void setAdaRemCakram(boolean adaRemCakram) {
        this.adaRemCakram = adaRemCakram;
    }
}