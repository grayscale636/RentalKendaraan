package com.rental.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public abstract class User {
    @Id
    private String id;
    private String nama;
    private String email;

    // Getter dan Setter
    public String getId() {
        return id; 
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}