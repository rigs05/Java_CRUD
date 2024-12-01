package com.crud.mcsl_222_crud.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class WorkshopRegistration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String phone;
    private Double feePaid;

    @Column(name = "registration_date")
    private LocalDate registrationDate = LocalDate.now();

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Double getFeePaid() {
        return feePaid;
    }

    public void setFeePaid(Double feePaid) {
        this.feePaid = feePaid;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }
}

