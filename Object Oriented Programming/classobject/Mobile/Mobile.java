package Mobile;

public class Mobile {
    String name;
    double price;
    String color;
    static String owner = "Yoga";
    
    public Mobile(){
        name = "Samsung F12";
        price = 9500.0d;
        color = "Blue";
    }

    public Mobile(String name,double price,String color){
        this.name = name;
        this.price = price;
        this.color = color;
    }

    public void display(){
        System.out.println("Name : "+ name);
        System.out.println("Price: "+ price);
        System.out.println("Color: "+ color);
        System.out.println("Owner: "+ owner);
    }

    public static void main(String[] args) {
        Mobile mobile1 = new Mobile();
        mobile1.display();
        Mobile mobile2 = new Mobile("Iphone 16",50000.0d,"Red");
        mobile2.display();
    }
}
