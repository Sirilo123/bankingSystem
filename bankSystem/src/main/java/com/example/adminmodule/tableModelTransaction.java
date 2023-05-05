package com.example.adminmodule;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class tableModelTransaction {

    private int transactionID;
    private int accountID;
    private String transactionType;
    private double amount;
    private LocalDateTime dateTime;

    public tableModelTransaction(int transactionID, int accountID, String transactionType, double amount, LocalDateTime dateTime){

        this.transactionID= transactionID;
        this.accountID= accountID;
        this.transactionType= transactionType;
        this.amount= amount;
        this.dateTime= dateTime;

    }

    public int getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {

    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
