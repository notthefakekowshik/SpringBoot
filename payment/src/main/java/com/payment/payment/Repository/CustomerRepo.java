package com.payment.payment.Repository;

import com.payment.payment.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import java.util.Optional;

@org.springframework.stereotype.Repository
public interface CustomerRepo extends JpaRepository<Customer, Long> {

    Optional<Customer> findByUserNameAndPassWord(String userName, String passWord);

    Optional<Customer> findByUserName(String userName);

}
