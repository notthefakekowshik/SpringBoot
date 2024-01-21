package com.payment.payment.Repository;

import com.payment.payment.Model.Bill;
import com.payment.payment.Model.Biller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

@org.springframework.stereotype.Repository
public interface BillRepo extends JpaRepository<Biller,Long> {
}
