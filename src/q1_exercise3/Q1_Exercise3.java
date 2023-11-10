/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package q1_exercise3;

/**
 *
 * @author Matty
 */
public class Q1_Exercise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //class Agent obj instantation
        Agent raze=new Agent("Raze","Duelist",8);
        Agent kj=new Agent("Killjoy","Sentinel",9);
        Agent omen=new Agent("Omen","Controller",7);
        //class Song obj instantiation
        Song favSong1=new Song("Basketball Shoes");
        Song favSong2=new Song("The Place Where He Inserted The Blade");
        //class Singer obj instantiation
        Singer singer1 = new Singer("Isaac");
        Singer singer2 = new Singer("May");
        singer1.setFavoriteSong(favSong1);//set fav song
        
        singer1.performForAudience(12);
        singer1.changeFavSong(favSong2);
        
        singer1.performForAudience(singer2,120);
    }
    
}
