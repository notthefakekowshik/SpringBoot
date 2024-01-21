package com.payment.payment.Controller;

import com.payment.payment.Model.Credentials;
import com.payment.payment.Model.Customer;
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

    @GetMapping
    public void wish() {
        System.out.println("hello nasty boosty");
    }

    @GetMapping("/login")
    public void login(@RequestParam String userName, @RequestParam String passWord) {
        Optional<Customer> customer = customerRepo.findByUserNameAndPassWord(userName, passWord);
        if (customer.isPresent()) {
            System.out.println("wow! welcome back. you're logged in!!");
        } else {
            System.out.println("mundu sign up avvara poomka");
        }
    }

    @PostMapping("/signup")
    public void signUp(@RequestParam String userName, @RequestParam String passWord) {
        Customer customer = new Customer();
        customer.setUserName(userName);
        customer.setPassWord(passWord);
        if (customerRepo.findByUserName(customer.getUserName()).isPresent()) {
            System.out.println("nasty boosty, you're an old customer. go login.");
            return;
        }
        Credentials credentials = new Credentials();
        customer.setCredentials(credentials);
        credentials.setCustomer(customer);

        customerRepo.save(customer);
        System.out.println("Congrats!! you're signed up.");
    }
}
