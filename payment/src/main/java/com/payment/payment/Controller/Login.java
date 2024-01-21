package com.payment.payment.Controller;

import com.payment.payment.Model.Biller;
import com.payment.payment.Model.Credentials;
import com.payment.payment.Model.Customer;
import com.payment.payment.Repository.BillRepo;
import com.payment.payment.Repository.CredsRepo;
import com.payment.payment.Repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/")
public class Login {

    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private CredsRepo credsRepo;

    @Autowired
    private BillRepo billRepo;

    @GetMapping
    public void wish() {
        Biller biller1 = new Biller(1L,"kowshik");
        Biller biller2 = new Biller(2L,"one more kowshik");
        Credentials credentials1 = new Credentials();
        credentials1.setUserName("kowshikU");
        credentials1.setPassWord("kowshikP");

        Credentials credentials2 = new Credentials();
        credentials2.setUserName("kowshikUU");
        credentials2.setPassWord("kowshikPP");

        biller1.setCredentials(credentials1);
        biller2.setCredentials(credentials2);

        credentials1.setBiller(biller1);
        credentials2.setBiller(biller2);

        billRepo.save(biller1);
        billRepo.save(biller2);

        credsRepo.save(credentials1);
        credsRepo.save(credentials2);

        System.out.println("hello nasty boosty");
    }

    /* A flag has to be implemented here. we will use the same controller for both Customer and login. */
    @GetMapping("/login")
    public void login(@RequestParam String userName, @RequestParam String passWord) {
        Optional<Credentials> customer = credsRepo.findByUserNameAndPassWord(userName, passWord);
        if (customer.isPresent()) {
            System.out.println("wow! welcome back. you're logged in!!");
        } else {
            System.out.println("mundu sign up avvara poomka");
        }
    }

    @PostMapping("/signup")
    public void signUp(@RequestParam String userName, @RequestParam String passWord) {
        if (credsRepo.findByUserName(userName).isPresent()) {
            System.out.println("Nasty boosty, you're an old customer. Go login.");
            return;
        }

        // Create new customer
        Customer customer = new Customer();

        // Create new credentials
        Credentials credentials = new Credentials();
        credentials.setUserName(userName);
        credentials.setPassWord(passWord);

        // Link credentials to the customer
        credentials.setCustomer(customer);
        customer.setCredentials(credentials);

        customerRepo.save(customer);

        System.out.println("Congrats!! You're signed up.");
    }

}
