package classloading;

public class index1 {
    static{
        int a = 60;
        System.out.println("JAVASCRIPT" +a);    
    }

    static boolean a = true;
    static double d = 10.5;

    static{
        System.out.println("Hi Bro"+a);
    }

    public static void main(String[] args) {
        System.out.println("D");
        display();
    }

    public static void display() {
        System.out.println("Hello, World!");
    }

    static {
        System.out.println("Static block executed");
    }
}
