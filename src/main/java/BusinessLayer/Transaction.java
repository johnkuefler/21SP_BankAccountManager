/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLayer;

import java.util.Date;

/**
 *
 * @author johnk
 */
public class Transaction {
    private int transactionNumber;
    private Date date;
    private double amount;
    private String description;
    private int bankAccountId;

    public Transaction(int transactionNumber, Date date, double amount, String description, int bankAccountId) {
        this.transactionNumber = transactionNumber;
        this.date = date;
        this.amount = amount;
        this.description = description;
        this.bankAccountId = bankAccountId;
    }
  

    public int getTransactionNumber() {
        return transactionNumber;
    }

    public void setTransactionNumber(int transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getBankAccountId() {
        return bankAccountId;
    }

    public void setBankAccountId(int bankAccountId) {
        this.bankAccountId = bankAccountId;
    }

    @Override
    public String toString() {
        return "Transaction{" + "transactionNumber=" + transactionNumber + ", date=" + date + ", amount=" + amount + ", description=" + description + ", bankAccountId=" + bankAccountId + '}';
    }
    
    
}
