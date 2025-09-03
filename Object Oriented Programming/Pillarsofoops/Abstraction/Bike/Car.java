public class Car extends Vehicle {

    @Override
    public void start(){
        System.out.print("Bike Started");
    }

    @Override
    public void stop(){
        System.out.print("Bike Stopped");
    }

    @Override
    public void gear(){
        System.out.print("Gear Shift");
    }
}
