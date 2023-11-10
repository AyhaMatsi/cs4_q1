/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q1_exercise4;

/**
 *
 * @author Matty
 */
public class Player {
    String move;
    
    public String moveRock(int PCMove){
        this.move="rock";
        switch (PCMove){
            case 1://PC rock
                return "Round is tied";
            case 2://PC paper
                return "Computer wins round";
            case 3://PC scissors
                return "Player wins round";
        }
        return "Invalid input. Must be 1, 2, or 3";
    }
    
    public String movePaper(int PCMove){
        this.move="paper";
        switch (PCMove){
            case 1://PC rock
                return "Player wins round";
            case 2://PC paper
                return "Round is tied";
            case 3://PC scissors
                return "Computer wins round";
        }
        return "Invalid input. Must be 1, 2, or 3";
    }
    
    public String moveScissors(int PCMove){
        this.move="scissors";
        switch (PCMove){
            case 1://PC rock
                return "Computer wins round";
            case 2://PC paper
                return "Player wins round";
            case 3://PC scissors
                return "Round is tied";
        }
        return "Invalid input. Must be 1, 2, or 3";
    }
}
