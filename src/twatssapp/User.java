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
public class User {

    String name;
    int score;

    public User(String nm) {
        name = nm;
        score = 0;
    }

    public Object getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void scorePoint() {
       score++;
    }

}
