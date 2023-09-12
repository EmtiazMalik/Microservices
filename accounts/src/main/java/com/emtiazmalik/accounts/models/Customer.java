package com.emtiazmalik.accounts.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter @Setter
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;
    @OneToMany(mappedBy = "customer",fetch = FetchType.LAZY)
    @JsonIgnoreProperties("customer")
    private Set<Account> accounts;
    private String name;
    private String email;
    private String mobileNumber;
    private LocalDate createdAt;
}
