/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package q1_exercise2;

/**
 *
 * @author Matty
 */
public class Q1_Exercise2 {

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
        Singer singer = new Singer("Isaac");
        singer.favoriteSong = favSong1;//set fav song
        
        singer.performForAudience(12);
        singer.changeFavSong(favSong2);
    }
    
}
