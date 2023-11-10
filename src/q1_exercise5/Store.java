/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q1_exercise5;
import q1_exercise5.Item;
import java.util.*;
/**
 *
 * @author Matty
 */
public class Store {
    private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
    // Initialize name to parameter and earnings to zero
    this.name=name;
    earnings=0;
    // Initialize itemList as a new ArrayList
    this.itemList = new ArrayList();
    // add 'this' store to storeList
    storeList.add(this);
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
    // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
    if (index>=itemList.size()){
        System.out.printf("\nThere are only &d items in itemList",itemList.size());
    }
    // get Item at index from itemList and add its cost to earnings
    else{
        earnings+=itemList.get(index).getCost();
        // print statement indicating the sale
        System.out.println("Sale done, cost added to earnings.");
    }
    
  }
  public void sellItem(String name){
    // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
    boolean inLst=false;
    int ind=-1;
    for (Item el : itemList){
        ind++;
        if (el.getName().equals(name)){
            inLst=true;
        }
    }
    if (!inLst){
        System.out.println("Sorry, the store doesn't sell that");
    }
    // get Item from itemList and add its cost to earnings
    else{
        earnings+=itemList.get(ind).getCost();
    }
    // print statement indicating the sale
    System.out.println("Sale done, cost added to earnings.");
  }
  public void sellItem(Item i){
    // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
    boolean inLst=false;
    int ind=-1;
    for (Item el : itemList){
        ind++;
        if (el.equals(i)){
            inLst=true;
        }
    }
    if (!inLst){
        System.out.println("Sorry, the store doesn't sell that");
    }
    // get Item i from itemList and add its cost to earnings
    else{
        earnings+=itemList.get(ind).getCost();
    }
    // print statement indicating the sale
    System.out.println("Sale done, cost added to earnings.");
  }
  public void addItem(Item i){
    // add Item i to store's itemList
    itemList.add(i);
  }
  public void filterType(String type){
    // loop over itemList and print all items with the specified type
    for (Item el : itemList){
        if (el.getType().equals(type)){
            System.out.println(el.getName());
        }
    }
  }
  public void filterCheap(double maxCost){
    // loop over itemList and print all items with a cost lower than or equal to the specified value
    for (Item el : itemList){
        if (el.getCost()<=(maxCost)){
            System.out.println(el.getName());
        }
    }
  }
  public void filterExpensive(double minCost){
    // loop over itemList and print all items with a cost higher than or equal to the specified value
    for (Item el : itemList){
        if (el.getCost()>=(minCost)){
            System.out.println(el.getName());
        }
    }
  }
  public static void printStats(){
    // loop over storeList and print the name and the earnings'Store.java'
    System.out.println("Stores and their earnings:");
    for (Store el : storeList){
        System.out.println("Store: "+el.getName()+", Earnings: "+el.getEarnings());
    }
  }
}
