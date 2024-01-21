package com.payment.payment.Repository;

import com.payment.payment.Model.Credentials;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CredsRepo extends JpaRepository<Credentials,Long> {
}
