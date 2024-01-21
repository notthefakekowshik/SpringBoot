package com.payment.payment.Repository;

import com.payment.payment.Model.Credentials;
import com.payment.payment.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CredsRepo extends JpaRepository<Credentials,Long> {

    Optional<Credentials> findByUserName(String userName);

    Optional<Credentials> findByUserNameAndPassWord(String userName, String passWord);
}
