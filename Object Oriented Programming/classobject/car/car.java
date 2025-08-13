package classobject.car;
public class car {
    public static void main(String[] args) {
        Carcompany myCar = new Carcompany();
        System.out.println("Car object created: " + myCar);
        myCar.start();
        myCar.stop();
        System.out.println("Car owner: " + Carcompany.owner);
    }  
}
