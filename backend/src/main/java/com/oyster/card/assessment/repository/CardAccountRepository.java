package com.oyster.card.assessment.repository;

import com.oyster.card.assessment.model.CardAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardAccountRepository extends JpaRepository<CardAccount, Long> {

    CardAccount findByCardPin(String cardPin);


}
