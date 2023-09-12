package com.emtiazmalik.accounts.controllers;

import com.emtiazmalik.accounts.models.Customer;
import com.emtiazmalik.accounts.repos.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerRepo customerRepo;
    @RequestMapping("/customers")
    public ResponseEntity<List<Customer>> getAllCustomers() {
        return new ResponseEntity<>((List<Customer>)customerRepo.findAll(), HttpStatus.OK);
    }
}
