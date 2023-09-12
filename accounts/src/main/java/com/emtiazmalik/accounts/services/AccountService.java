package com.emtiazmalik.accounts.services;

import com.emtiazmalik.accounts.models.Account;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AccountService {
    List<Account> getAccounts();
}
