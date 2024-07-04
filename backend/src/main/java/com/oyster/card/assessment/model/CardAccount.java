package com.oyster.card.assessment.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "CardAccount")
@AllArgsConstructor
@NoArgsConstructor

public class CardAccount implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private double amountDebit;
    private double AmountCredit;
    private int customerID;
    private double balance;
    private String cardPin;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public double getAmountDebit() {
        return amountDebit;
    }

    public void setAmountDebit(double amountDebit) {
        this.amountDebit = amountDebit;
    }


    public double getAmountCredit() {
        return AmountCredit;
    }

    public void setAmountCredit(double amountCredit) {
        AmountCredit = amountCredit;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCardPin() {
        return cardPin;
    }

    public void setCardPin(String cardPin) {
        this.cardPin = cardPin;
    }
}
