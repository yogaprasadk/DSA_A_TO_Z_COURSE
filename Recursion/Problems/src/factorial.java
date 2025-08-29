import java.util.Scanner;

// GFG - https://www.geeksforgeeks.org/problems/factorial5739/1
public class factorial {
    static Scanner S = new Scanner(System.in);
    public static void main(String[] args){
        int n = S.nextInt();
        System.out.println(factorial(n));
    }

   public static int factorial(int n) {
    // code here
    if(n==0){
        return 1;
    }
    return n * factorial(n-1);
    }
}
