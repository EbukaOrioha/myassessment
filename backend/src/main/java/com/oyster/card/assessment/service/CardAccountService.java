package com.oyster.card.assessment.service;

import com.oyster.card.assessment.model.CardAccount;
import com.oyster.card.assessment.repository.CardAccountRepository;
import com.oyster.card.assessment.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CardAccountService {
    private CardAccountRepository cardAccountRepository;

    public CardAccount createcardAccount(CardAccount cardAccount){
        return  cardAccountRepository.save(cardAccount);
    }
    public CardAccount creditMyCard (CardAccount cardAccount){
        CardAccount getSaveCustomerCard = cardAccountRepository.findByCardPin(cardAccount.getCardPin());
        getSaveCustomerCard.setAmountCredit(cardAccount.getAmountCredit());
        getSaveCustomerCard.setBalance(cardAccount.getBalance()+cardAccount.getAmountCredit());
        return  cardAccountRepository.save(getSaveCustomerCard);
    }

    public CardAccount takeAjouney (CardAccount cardAccount) {
        CardAccount getSaveCustomerCard = cardAccountRepository.findByCardPin(cardAccount.getCardPin());
        getSaveCustomerCard.setAmountDebit(cardAccount.getAmountDebit());
        getSaveCustomerCard.setBalance(cardAccount.getBalance()-cardAccount.getAmountDebit());
        return  cardAccountRepository.save(getSaveCustomerCard);

    }




}
