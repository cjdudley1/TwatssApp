/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twatssapp;

import java.util.ArrayList;

/**
 *
 * @author chris
 */
public class UserGroup {
    
    ArrayList<User> usersInGroup;
    
    public UserGroup(){
        usersInGroup = new ArrayList<>();
    }

    public void addUser(User u) {
        usersInGroup.add(u);
    }
    
    public ArrayList<User> getUserList(){
        return usersInGroup;
    }
            
}
