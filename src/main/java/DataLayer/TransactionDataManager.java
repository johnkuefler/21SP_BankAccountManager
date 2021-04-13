/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

import BusinessLayer.Transaction;
import java.util.ArrayList;

/**
 *
 * @author johnk
 */
public class TransactionDataManager {
    
    private ArrayList<Transaction> database;
    
    public TransactionDataManager() {
        database = new ArrayList<Transaction>();
    }
    
    public ArrayList<Transaction> getAll() {
        return database;
    }
    
    public ArrayList<Transaction> getByBankAccountId(int bankAccountId) {
        
        ArrayList<Transaction> output = new ArrayList<Transaction>();
        
        for (Transaction transaction : database) {
            if (transaction.getBankAccountId()== bankAccountId) {
                output.add(transaction);
            }
        }
        
        return output;
    }
    
    public void create(Transaction transaction) {
        database.add(transaction);
    }
   
    
    public void delete(Transaction transactionToDelete) {
        database.remove(transactionToDelete);
    }
}