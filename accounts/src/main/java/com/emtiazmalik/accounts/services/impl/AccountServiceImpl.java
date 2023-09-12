package com.emtiazmalik.accounts.services.impl;

import com.emtiazmalik.accounts.models.Account;
import com.emtiazmalik.accounts.repos.AccountRepo;
import com.emtiazmalik.accounts.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountRepo accountRepo;

    @Override
    public List<Account> getAccounts() {
        return (List<Account>) accountRepo.findAll();
    }
}
