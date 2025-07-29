import java.util.Scanner;

public class Swaptwonumbers {
    static Scanner S = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter A:");
        int a = S.nextInt();
        System.out.print("Enter B:");
        int b = S.nextInt();
        swap(a,b);
    }

    // using third variable
    /*private static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.print("Swap: "+a +" "+b);
    }*/

    //without using third variable
    private static void swap(int a, int b) {
        a = a^b; // 1
        b = a^b; // a denotes this -> (a^b) ^ b = a^a ^ b^b = a
        a = a^b; // b denotes this -> a is a^b now (a^b)^b = b => a^b b^b(b^a)
        System.out.print("Swap: "+a +" "+b);
    }



}
