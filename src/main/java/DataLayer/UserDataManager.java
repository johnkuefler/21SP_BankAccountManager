/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

import BusinessLayer.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author johnk
 */
public class UserDataManager extends DataManager {

    private ArrayList<User> database;

    public UserDataManager() {
        super();
        database = new ArrayList<User>();
    }

    public ArrayList<User> getAll() throws SQLException {

        PreparedStatement sqlStatement = super.getConnection()
                .prepareStatement("SELECT [userId], [firstName], [lastName], [emailAddress], [password] FROM [BANK_User]");

        ResultSet resultSet = sqlStatement.executeQuery();

        ArrayList<User> output = new ArrayList<User>();

        while (resultSet.next()) {
            User user = new User(resultSet.getInt(1),
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getString(4),
                    resultSet.getString(5));

            output.add(user);
        }

        return output;
    }

    public User getById(int userId) {
        for (User user : database) {
            if (user.getUserID() == userId) {
                return user;
            }
        }

        return null;
    }

    public void create(User newUser) throws SQLException {

        PreparedStatement sqlStatement = super.getConnection()
                .prepareStatement("INSERT INTO BANK_User (firstName, lastName, emailAddress, password) VALUES(?, ?, ?, ?)");

        sqlStatement.setString(1, newUser.getFirstName());
        sqlStatement.setString(2, newUser.getLastName());
        sqlStatement.setString(3, newUser.getEmailAddress());
        sqlStatement.setString(4, newUser.getPassword());
        
        sqlStatement.executeUpdate();

    }

    public void update(User userToUpdate) {
        for (User user : database) {
            if (user.getUserID() == userToUpdate.getUserID()) {

                // copy attributes from user to update to user in loop
            }
        }
    }

    public void delete(User userToDelete) {
        database.remove(userToDelete);
    }
}
