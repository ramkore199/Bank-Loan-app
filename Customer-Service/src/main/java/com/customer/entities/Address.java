package com.customer.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;
    private String street;
    private String landmark;
    private String city;
    private String state;
    private  String country;
    private String pin;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
