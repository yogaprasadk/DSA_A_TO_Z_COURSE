package classloader;

public class A {
    static{
        System.out.println("Static block in A class executed");
    }

    static double pi = 3.14;
    static String name = "Pranav";
    public static void main(String[] args) {
        System.out.println("Main method in A class executed");       
    }

    static{
        System.out.println("Another static block in A class executed");        
    }
}
