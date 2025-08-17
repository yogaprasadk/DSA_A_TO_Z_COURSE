package Bike;
public class Bike {
    String name;
    String color;
    double price;
    static String owner = "Prasad";

    public void start(){
        System.out.println("Bike Started");
    }

    public void stop(){
        System.out.println("bike Stopped");
    }

    public Bike(){
        name="Yamaha";
        color = "Yellow";
        price = 15000.0d;
        
    }

    public void displaydetails(){
        System.out.println("Bike name: "+name);
        System.out.println("Bike color: "+color);
        System.out.println("Bike price: "+price);
        System.out.println("Bike owner: "+owner); 
    }
}