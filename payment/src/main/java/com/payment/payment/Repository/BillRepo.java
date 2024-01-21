package com.payment.payment.Repository;

import com.payment.payment.Model.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

@org.springframework.stereotype.Repository
public interface BillRepo extends JpaRepository<Bill,Long> {
}
