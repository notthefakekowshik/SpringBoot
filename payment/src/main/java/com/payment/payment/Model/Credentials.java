package com.payment.payment.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Credentials {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String userName;

    private String passWord;

    @OneToOne
    @JoinColumn(name = "customer_credentials_id", referencedColumnName = "id")
    private Customer customer;

    @OneToOne
    @JoinColumn(name = "biller_credentials_id", referencedColumnName = "id")
    private Biller biller;
}
