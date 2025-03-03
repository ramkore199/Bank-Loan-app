package com.customer.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class KYCDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long kYCId;

    private String customerName;

    private String aadharNumber;

    private String panNumber;

    private String  phoneNumber;
    private String mail;
    private String DOB;

    @OneToOne(mappedBy = "KYCDetails")

    private Customer customer;
}
