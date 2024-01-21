package com.payment.payment.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @GetMapping("/customerHome")
    public void customerHome() {
        System.out.println("welcome to customer's home");
    }

}
