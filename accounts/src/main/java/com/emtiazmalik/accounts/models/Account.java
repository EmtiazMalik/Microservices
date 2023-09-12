package com.emtiazmalik.accounts.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Account {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long accountNumber;
    @ManyToOne
    @JoinColumn(name = "customerId")
    @JsonIgnoreProperties("accounts")
    private Customer customer;
    private String accountType;
    private String branchAddress;
    private LocalDate createdAt;
}
