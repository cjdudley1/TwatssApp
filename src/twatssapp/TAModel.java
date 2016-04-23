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
public class TAModel {

    User currentUser;
    ArrayList<UserGroup> userGroups;
    UserGroup currentUserGroup;

    public TAModel(User u) {
        currentUserGroup = new UserGroup();
        currentUser = u;
    }

    public void score() {
        currentUser.scorePoint();
    }
    
    public UserGroup getCurrentGroup(){
        return currentUserGroup;
    }

}
