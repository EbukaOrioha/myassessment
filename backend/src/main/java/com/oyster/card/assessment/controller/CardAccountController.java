package com.oyster.card.assessment.controller;

import com.oyster.card.assessment.model.CardAccount;
import com.oyster.card.assessment.model.Customer;
import com.oyster.card.assessment.service.CardAccountService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cardaccount")
@AllArgsConstructor
public class CardAccountController {
    private CardAccountService cardAccountService;

    @PostMapping("/fundaccount")
    public ResponseEntity<CardAccount> fundAccount(@RequestBody CardAccount cardAccount){
        CardAccount saveNewAccount = cardAccountService.creditMyCard(cardAccount);
        return new ResponseEntity<>(saveNewAccount, HttpStatus.CREATED);
    }
    @PostMapping("/travel")
    public ResponseEntity<CardAccount> travelJourney(@RequestBody CardAccount cardAccount){
        CardAccount saveNewAccount = cardAccountService.creditMyCard(cardAccount);
        return new ResponseEntity<>(saveNewAccount, HttpStatus.CREATED);
    }
}
