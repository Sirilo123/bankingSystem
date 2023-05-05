package com.example.adminmodule;

import java.time.LocalDate;

public class tableModelLoan {

    private int loanID;
    private int id;
    private int userID;
    private String loanType;
    private double amount;
    private double interestRate;
    private LocalDate dateApproved;

    public tableModelLoan(int loanID, int id, int userID, String loanType, double amount, double interestRate, LocalDate dateApproved){

        this.loanID= loanID;
        this.id= id;
        this.userID= userID;
        this.loanType= loanType;
        this.amount= amount;
        this.interestRate= interestRate;
        this.dateApproved= dateApproved;
    }

    public int getLoanID() {
        return loanID;
    }

    public void setLoanID(int loanID) {
        this.loanID = loanID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public LocalDate getDateApproved() {
        return dateApproved;
    }

    public void setDateApproved(LocalDate dateApproved) {
        this.dateApproved = dateApproved;
    }
}
