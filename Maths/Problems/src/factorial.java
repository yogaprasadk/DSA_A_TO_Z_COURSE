import java.util.Scanner;

public class factorial {
    // gfg - https://www.geeksforgeeks.org/problems/factorial5739/1
    public static void main(String[] args) {
        Scanner S = new Scanner (System.in);
        System.out.print("Enter N: ");
        int N = S.nextInt();
        int fact = 1;
        for (int i = 1; i <=N ; i++) {
            fact *= i;
        }
        System.out.println(fact);
        S.close();
    }
}
