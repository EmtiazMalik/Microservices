package com.emtiazmalik.loans.controller;

import com.emtiazmalik.loans.model.Loan;
import com.emtiazmalik.loans.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LoanController {
    @Autowired
    LoanService loanService;
    @GetMapping("/loan/{customerId}")
    public ResponseEntity<List<Loan>> getLoan(@PathVariable Long customerId) {
        return loanService.myLoan(customerId);
    }
}
