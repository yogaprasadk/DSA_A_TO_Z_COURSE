package Fruits;

public class Fruitsdetails {
    public static void main(String[] args) {
        Fruits apple   = new Fruits("Apple",1,40.0);
        Fruits orange  = new Fruits("Orange", 2, 70.0);
        Fruits papali  = new Fruits("Papali", 1, 30);
        Fruits Guava   = new Fruits("Guava", 1/2, 30);
        
        Fruits[] bill  = {apple,orange,papali,Guava};
        for(int i = 0;i<bill.length;i++){
            bill[i].details();
        } 

    }
}
