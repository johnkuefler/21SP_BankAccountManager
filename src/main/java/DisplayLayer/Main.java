/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DisplayLayer;

import BusinessLayer.BankAccount;
import BusinessLayer.BankAccountType;
import BusinessLayer.User;
import DataLayer.BankAccountDataManager;
import DataLayer.TransactionDataManager;
import DataLayer.UserDataManager;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author johnk
 */
public class Main {

    public static void main(String[] args) throws SQLException {

        UserDataManager userDm = new UserDataManager();
        BankAccountDataManager bankAccountDm = new BankAccountDataManager();
        TransactionDataManager transactionDm = new TransactionDataManager();

        User myUser = new User(1, "John", "Smith", "john@test.com", "password");
        User myUser2 = new User(2, "Bob", "Smith", "bob@test.com", "password");

        BankAccount johnsAccount = new BankAccount(1, "John Checking", 500, BankAccountType.CHECKING, 1);
        BankAccount bobsAccount = new BankAccount(2, "Bob Checking", 200, BankAccountType.CHECKING, 2);
        BankAccount bobsSavings = new BankAccount(3, "Bob Savings", 600, BankAccountType.SAVINGS, 2);

        userDm.create(myUser);
        userDm.create(myUser2);

        bankAccountDm.create(johnsAccount);
        bankAccountDm.create(bobsAccount);
        bankAccountDm.create(bobsSavings);

        ArrayList<User> allUsers = userDm.getAll();
        System.out.println(allUsers.size());

        System.out.println(allUsers);

        ArrayList<BankAccount> bobsAccounts = bankAccountDm.getByUserId(2);
        System.out.println(bobsAccounts);
    }
}
