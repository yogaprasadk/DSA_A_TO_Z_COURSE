import java.util.Scanner;

// Leetcode 367 - https://leetcode.com/problems/valid-perfect-square/
public class Perfectsquare {
    static Scanner S = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter N:");
        int N = S.nextInt();
        System.out.println(validsquare(N));
    }

    private static boolean validsquare(int n) {
        int sum = 0;
        for (int i = 1; i <n/2; i++) {
            if(i*i == n){
                return true;
            }
        }
        return false;
    }
}
