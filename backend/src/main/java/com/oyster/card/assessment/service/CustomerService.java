package com.oyster.card.assessment.service;

import com.oyster.card.assessment.model.CardAccount;
import com.oyster.card.assessment.model.Customer;
import com.oyster.card.assessment.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@AllArgsConstructor

public class CustomerService {

    private CustomerRepository customerRepository;
    private CardAccountService cardAccountService;

    public Customer addCustomer(Customer customer){
        String cardpin = generatepin();
        customer.setCardPin(cardpin);
       Customer saveCusromer =  customerRepository.save(customer);
        CardAccount cardAccount = new CardAccount();
        cardAccount.setCustomerID(saveCusromer.getId().intValue());
        cardAccount.setCardPin(cardpin);
        cardAccount.setBalance(0);
        cardAccount.setAmountDebit(0);
        cardAccount.setAmountCredit(0);
        cardAccountService.createcardAccount(cardAccount);

       return  saveCusromer;

    }

    public String generatepin() {
        Random random = new Random();
        long randomNumber = Math.abs(random.nextLong());
        String randomString = Long.toString(randomNumber);
        String tenDigitNumber = randomString.substring(0, 10);
        return tenDigitNumber;
    }
}
