/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twatssapp;

/**
 *
 * @author chris
 */
public class TwatssApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to TW@SS");
        User chris = new User("Chris");
        User flav = new User("Flav");
        User olivia = new User("Olivia");
        TAModel workingModel = new TAModel(chris);
        workingModel.getCurrentGroup().addUser(chris);
        workingModel.getCurrentGroup().addUser(flav);
        workingModel.getCurrentGroup().addUser(olivia);
        GameFrame gameFrame = new GameFrame(workingModel);
    }

}
