package classloader;

public class B {
    static{
        System.out.println("Static block in B class executed");
    }

    static double e = 2.71;
    public static void main(String[] args) {
        System.out.println("Main method in B class executed");
        System.out.println(A.pi);
        System.out.println(A.name);
        System.out.println("Bye from B");
    } 
}
