/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q1_exercise4;
import java.util.*;
/**
 *
 * @author Matty
 */
public class PC {
    int firstTo;
    PC (int firstTo){
        this.firstTo=firstTo;
    }
    
    public void opt(){
        System.out.println("Welcome to Rock, Paper, Scissors. Please choose an option:\n" +
                            "1. Start game\n" +
                            "2. Change number of rounds\n" +
                            "3. Exit application\n" +
                            "> ");
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        switch(choice){
            case "1"://start game
                game();
                break;
            case "2"://change rounds
                changeRounds();
                break;
            case "3"://exit
                System.out.println("Thank you for playing!");
                System.exit(0);
                break;
        }
    }
    
    public void game(){
        Scanner sc = new Scanner(System.in);
        Player player = new Player();
        String[] moves={"rock","paper","scissors"};
        boolean gameEnd=false;
        String verdict;//verdict for EACH ROUND: if player wins/PC wins/tie for EACH ROUND
        
        int playerRoundWins=0;
        int PCroundWins=0;
        System.out.printf("This match will be first to %s wins.\n",this.firstTo);
        
        while (gameEnd==false){ //while playing rounds
            System.out.println("=======================================================");
            System.out.println("The computer has selected its move. Select your move:\n"
                            + "1. Rock\n" +
                            "2. Paper\n" +
                            "3. Scissors\n"
                            + "> ");
            int playerMove = sc.nextInt();
            int PCmove=genMove();
            String verdictCopy = "";
            switch (playerMove){
                case 1://rock
                    verdict=player.moveRock(PCmove);
                    verdictCopy=verdict;
                    System.out.printf("Player chose rock. Computer chose %s. %s!",moves[PCmove-1],verdict);
                    break;
                case 2://paper
                    verdict=player.movePaper(PCmove);
                    verdictCopy=verdict;
                    System.out.printf("Player chose paper. Computer chose %s. %s!",moves[PCmove-1],verdict);
                    break;
                case 3://scissors
                    verdict=player.moveScissors(PCmove);
                    verdictCopy=verdict;
                    System.out.printf("Player chose scissors. Computer chose %s. %s!",moves[PCmove-1],verdict);
                    break;
                default:
                    System.out.println("Invalid input. Must be 1, 2, or 3");
            }
            System.out.println("");
            if (verdictCopy.equals("Player wins round")){
                playerRoundWins++;
            }
            else if (verdictCopy.equals("Computer wins round")){
                PCroundWins++;
            }
            System.out.printf("Player: %d - Computer: %d",playerRoundWins,PCroundWins);
            System.out.println("");
            
            if (playerRoundWins==this.firstTo || PCroundWins==this.firstTo){
                gameEnd=true;
            }
        }//end of while loop
        if (playerRoundWins>PCroundWins){
            System.out.println("Player wins!\n");
        }
        else if (PCroundWins>playerRoundWins){
            System.out.println("Computer wins!\n");
        }
        else{//tie
            System.out.println("It's a tie!\n");
        }
    }
    
    public void changeRounds(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Game currently set as first to "+this.firstTo);
        System.out.println("How many wins do you want to win a match?\n" +
                            "> ");
        int newFirstTo = sc.nextInt();
        this.firstTo=newFirstTo;
        System.out.println("New setting has been saved!\n");
    }
    
    public int genMove(){//returns int where 1:rock, 2:paper, 3:scissors
        Random rand = new Random();
        int max=2;
        int min=0;
        int randInt=(int)Math.floor((Math.random() * 3))+1;
        return randInt;
    }
}
