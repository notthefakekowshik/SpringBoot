package com.payment.payment.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Biller {

    @Id
    private Long id;

    private String name;

    public Biller(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "biller_credentials_id", referencedColumnName = "id")
    private Credentials credentials;

}
