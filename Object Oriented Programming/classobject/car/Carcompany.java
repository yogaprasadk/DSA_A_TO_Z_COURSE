package classobject.car;

public class Carcompany {
    String name;
    String brand;
    double price = 0.0d;
    static String owner = "Prasad";

    public void start(){
        System.out.println("Car is starting");
    }

    public void stop(){
        System.out.println("Car is stopping");
    }
}
