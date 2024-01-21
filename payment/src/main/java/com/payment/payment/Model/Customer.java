package com.payment.payment.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String userName;
    private String passWord;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "credentials_id", referencedColumnName = "id")
    private Credentials credentials;
}
