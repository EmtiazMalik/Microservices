package com.emtiazmalik.accounts.controllers;

import com.emtiazmalik.accounts.configurations.AppProperties;
import com.emtiazmalik.accounts.models.Account;
import com.emtiazmalik.accounts.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Properties;

@RestController
public class AccountsController {
    @Autowired
    AccountService accountService;

    @Autowired
    AppProperties appProperties;

    @RequestMapping("/accounts")
    public ResponseEntity<List<Account>> getAccounts(){
        return new ResponseEntity<>(accountService.getAccounts(), HttpStatus.OK);
    }

    @PostMapping("/accounts")
    public String saveAccount(@RequestBody Account account){
        return "Account saved";
    }

    @GetMapping("/prop")
    public String getProp() {
       return appProperties.toString();
    }


}
