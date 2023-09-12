package com.emtiazmalik.loans.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
@Entity
@Getter @Setter
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long loanNumber;
    private Long customerId;
    private Date startDt;
    private String loanType;
    private Long totalLoan;
    private Long amountPaid;
    private Long outStandingAmount;
    private String createDt;

}
