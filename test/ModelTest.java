/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import twatssapp.TAModel;
import twatssapp.User;
import twatssapp.UserGroup;

/**
 *
 * @author chris
 */
public class ModelTest {

    TAModel testModel;
    User testUser1, testUser2, testUser3;
    UserGroup testUserGroup1, testUserGroup2;

    public ModelTest() {
        testModel = new TAModel();
        testUser1 = new User("Chris");
        testUser2 = new User("Olivia");
        testUser3 = new User("Olav");
        testUserGroup1 = new UserGroup();
        testUserGroup2 = new UserGroup();
    }

    @Before
    public void setUp() {

    }

    @Test
    public void testUser() {
        assertTrue(testUser1.getName().equals("Chris"));
    }
    
    @Test
    public void testUserGroup(){
        testUserGroup1.addUser(testUser1);
        assertTrue(testUserGroup1.getUserList().get(0).equals(testUser1));
    }
}
