import java.util.*;
public class Perfectnumber {
    static Scanner S = new Scanner(System.in);
    // Leetcode Problem 157 - https://leetcode.com/problems/perfect-number/description/
    public static void main(String[] args) {
        System.out.print("Enter N:");
        int N = S.nextInt();
        boolean ans = perfectnum(N);
        System.out.println(ans);
    }

    public static boolean perfectnum(int N){
        int sum = 0;
        for (int i = 1; i < N ; i++) {
            if(N%i==0){
                sum += i;
            }
        }

        if(sum == N) {
            return true;
        }
        return false;
    }
}
