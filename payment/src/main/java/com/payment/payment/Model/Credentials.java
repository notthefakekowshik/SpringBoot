package com.payment.payment.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Credentials {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @OneToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Customer customer;
}
