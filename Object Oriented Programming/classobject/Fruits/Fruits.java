package Fruits;
// Write a java program to create a blueprint of fruit with their name,quantity,price and create 5 objects based on blueprint and print the bill.
public class Fruits {
    String name;
    double price;
    int quantity;
    static String fruitshop = "Kathiresan PALA KADAI";

    
    public Fruits(String name,int quantity,double price){
        this.name  = name;
        this.quantity = quantity;
        this.price = price;
    }
    public void details(){
        System.out.println("\t      "+ fruitshop +" \t ");
        System.out.println("Name : " + name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price of "+quantity+"kg : " + price);
    }
}
