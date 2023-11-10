/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q1_exercise2;

/**
 *
 * @author Matty
 */
public class Singer {
    String name;
    int noOfPerformances;
    double earnings;
    Song favoriteSong;
    Singer (String name){
        this.name = name;
    }
    
    public void performForAudience(int numOfPpl){
        this.noOfPerformances+=1;
        this.earnings+=(100*numOfPpl);
    }
    
    public void changeFavSong(Song newFavSong){
        this.favoriteSong=newFavSong;
    }
}
