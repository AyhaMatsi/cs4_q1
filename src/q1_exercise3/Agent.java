/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q1_exercise3;

/**
 *
 * @author Matty
 */
public class Agent {
    private String name;
    private String agentClass;
    private int ultPnts;
    Agent (String name, String agentClass, int ultPnts){
        this.name=name;
        this.agentClass=agentClass;
        this.ultPnts=ultPnts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAgentClass() {
        return agentClass;
    }

    public void setAgentClass(String agentClass) {
        this.agentClass = agentClass;
    }

    public int getUltPnts() {
        return ultPnts;
    }

    public void setUltPnts(int ultPnts) {
        this.ultPnts = ultPnts;
    }
}
