package com.oyster.card.assessment.controller;


import com.oyster.card.assessment.model.CardAccount;
import com.oyster.card.assessment.model.Customer;
import com.oyster.card.assessment.service.CardAccountService;
import com.oyster.card.assessment.service.CustomerService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")

public class CustomerController {
    @Autowired
    private CustomerService customerService;
    private CardAccountService cardAccountService;



    @PostMapping("/createcustomer")
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer){
        Customer saveCusromer = customerService.addCustomer(customer);

        return new ResponseEntity<>(saveCusromer, HttpStatus.CREATED);


    }
}
