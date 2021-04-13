/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

import BusinessLayer.BankAccount;
import java.util.ArrayList;

/**
 *
 * @author johnk
 */
public class BankAccountDataManager {
    
    private ArrayList<BankAccount> database;
    
    public BankAccountDataManager() {
        database = new ArrayList<BankAccount>();
    }
    
    public ArrayList<BankAccount> getAll() {
        return database;
    }
    
    public ArrayList<BankAccount> getByUserId(int userId) {
        
        ArrayList<BankAccount> output = new ArrayList<BankAccount>();
        
        for (BankAccount bankAccount : database) {
            if (bankAccount.getUserId() == userId) {
                output.add(bankAccount);
            }
        }
        
        return output;
    }
    
    public void create(BankAccount account) {
        database.add(account);
    }
   
    
    public void delete(BankAccount bankAccountToDelete) {
        database.remove(bankAccountToDelete);
    }
}
