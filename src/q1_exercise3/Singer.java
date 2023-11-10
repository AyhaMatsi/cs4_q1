/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q1_exercise3;

/**
 *
 * @author Matty
 */
public class Singer {
    private String name;
    private int noOfPerformances;
    private double earnings;
    private Song favoriteSong;
    private static int totalPerformances;
    Singer (String name){
        this.name = name;
    }
    
    public void performForAudience(Singer coperformer,int numOfPpl){
        coperformer.setNoOfPerformances(coperformer.getNoOfPerformances()+1);
        this.setNoOfPerformances(this.getNoOfPerformances() + 1);
        coperformer.setEarnings(coperformer.getEarnings() + (50*numOfPpl));
        this.setEarnings(this.getEarnings() + (50*numOfPpl));
        coperformer.setTotalPerformances(coperformer.getTotalPerformances()+1);
        setTotalPerformances(getTotalPerformances() + 1);
    }
    
    public void performForAudience(int numOfPpl){
        this.setNoOfPerformances(this.getNoOfPerformances() + 1);
        this.setEarnings(this.getEarnings() + (100*numOfPpl));
        setTotalPerformances(getTotalPerformances() + 1);
    }
    
    public void changeFavSong(Song newFavSong){
        this.setFavoriteSong(newFavSong);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfPerformances() {
        return noOfPerformances;
    }

    public void setNoOfPerformances(int noOfPerformances) {
        this.noOfPerformances = noOfPerformances;
    }

    public double getEarnings() {
        return earnings;
    }

    public void setEarnings(double earnings) {
        this.earnings = earnings;
    }

    public Song getFavoriteSong() {
        return favoriteSong;
    }

    public void setFavoriteSong(Song favoriteSong) {
        this.favoriteSong = favoriteSong;
    }

    public static int getTotalPerformances() {
        return totalPerformances;
    }

    public static void setTotalPerformances(int aTotalPerformances) {
        totalPerformances = aTotalPerformances;
    }
}
