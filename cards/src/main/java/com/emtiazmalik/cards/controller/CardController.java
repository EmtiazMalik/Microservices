package com.emtiazmalik.cards.controller;

import com.emtiazmalik.cards.model.Cards;
import com.emtiazmalik.cards.repo.CardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class CardController {

    @Autowired
    CardRepo cardRepo;
    @GetMapping("/card")
    ResponseEntity<List<Cards>> myCards(@RequestParam Long customerId) {
        return new ResponseEntity<>(cardRepo.findByCustomerId(customerId), HttpStatus.OK) ;
    }
}
