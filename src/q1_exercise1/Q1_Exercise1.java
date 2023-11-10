/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package q1_exercise1;

/**
 *
 * @author Matty
 */
public class Q1_Exercise1 {
        /*
        1: Raze
        2: Killjoy
        3: Omen
        */
        String name1 = "Raze";
        String agentClass1 = "Deulist";
        int ultPnts1 = 8;
        
        String name2 = "Killjoy";
        String agentClass2 = "Sentinel";
        int ultPnts2 = 9;
        
        String name3 = "Omen";
        String agentClass3 = "Controller";
        int ultPnts3 = 7;
        
        int totPnts = ultPnts1+ultPnts2+ultPnts3;//total ult points (of raze, kj, and omen)
        boolean razeKjClass = (agentClass1==agentClass2);//if raze and kj have the same agent class
        boolean kjMorePntsOmen = (ultPnts2>ultPnts3);//if kj has more ult points than omen
        
        //print statements
        System.out.println("Agent 1");
        System.out.println("Name: "+name1);
        System.out.println("Agent Class: "+agentClass1);
        System.out.println("Ult points cost: "+ultPnts1);
        System.out.println("-=====================-");
        System.out.println("Agent 2");
        System.out.println("Name: "+name2);
        System.out.println("Agent Class: "+agentClass2);
        System.out.println("Ult points cost: "+ultPnts2);
        System.out.println("-=====================-");
        System.out.println("Agent 3");
        System.out.println("Name: "+name3);
        System.out.println("Agent Class: "+agentClass3);
        System.out.println("Ult points cost: "+ultPnts3);
        System.out.println("-=====================-");
        System.out.println("Total ult points: "+totPnts);
        System.out.println("If Raze and Killjoy have the same agent class: "+razeKjClass);
        System.out.println("If Killjoy has more ult points than omen: "+kjMorePntsOmen);
        
        
    }
    
}
