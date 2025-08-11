package classloading;
public class index {
    static boolean a = true;
    static{
        System.out.println("Hi Bro");
    }
    public void display() {
        System.out.println("Hello, World!");
    }

    public static void main(String[] args) {
        System.out.println("Hi");
        System.out.println(a);
        System.out.println(d);
        System.out.println("Bye");
    }
    static double d = 10.5;
    static {
        System.out.println("Static block executed");
    }
}
