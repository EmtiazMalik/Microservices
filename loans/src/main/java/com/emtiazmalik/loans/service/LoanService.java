package com.emtiazmalik.loans.service;

import com.emtiazmalik.loans.model.Loan;
import com.emtiazmalik.loans.repo.LoanRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanService {
    @Autowired
    LoanRepo loanRepo;
    public ResponseEntity<List<Loan>> myLoan(Long customerId) {
          return new ResponseEntity<>(loanRepo.findByCustomerIdOrderByStartDtDesc(customerId), HttpStatus.OK);
    }
}
