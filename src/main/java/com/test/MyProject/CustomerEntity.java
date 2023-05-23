package com.test.MyProject;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
///For CRUD
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Table(name = "customers")
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String lastname;
    private String country;
    private String city;
    private String address;
    // Add additional fields as per your table structure

    // Constructors, getters, and setters

    public CustomerEntity() {
    }

    public CustomerEntity(Long id, String name, String email, String lastname, String country, String city, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.lastname = lastname;
        this.country = country;
        this.city = city;
        this.address = address;
    }

// Getters and setters

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

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

    public void setEmail(String Email) {
        this.email = email;
    }
}
