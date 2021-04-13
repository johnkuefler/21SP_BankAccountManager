/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

import BusinessLayer.User;
import java.util.ArrayList;

/**
 *
 * @author johnk
 */
public class UserDataManager {
    
    private ArrayList<User> database;
    
    public UserDataManager() {
        database = new ArrayList<User>();
    }
    
    public ArrayList<User> getAll() {
        return database;
    }
    
    public User getById(int userId) {
        for (User user : database) {
            if (user.getUserID() == userId) {
                return user;
            }
        }
        
        return null;
    }
    
    public void create(User newUser) {
        database.add(newUser);
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
