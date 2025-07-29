import java.util.Scanner;

public class Fibonaccinumber {
// Leetcode - https://leetcode.com/problems/fibonacci-number/
    static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter N:");
        int N = S.nextInt();
        System.out.print(fibonnaci(N));
    }

    private static int fibonnaci(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibonnaci(n-1)+fibonnaci(n-2);
    }
}
