import java.util.Scanner;
// GFG - https://www.geeksforgeeks.org/problems/check-whether-k-th-bit-is-set-or-not-1587115620/1

// Time cOmplexity: O(Log N)
public class ithbitsetornot {

    static Scanner S = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter N:");
        int N = S.nextInt();
        System.out.print("Enter ith bit: ");
        int i = S.nextInt();
        boolean ans = solve(N, i);
        System.out.println(ans);
    }

    public static boolean solve(int N, int i) {
        int binary = binaryconversion(N);
        return (binary & (1 << i)) != 0;
        /*
        or using >> - right shift
        return (1 & (binary >> i)) != 0;
         */
    }

    public static int binaryconversion(int N) {
        int ans = 0;
        int pow = 1;
        while (N > 0) {
            int last = N % 2;
            N = N / 2;
            ans = ans + (last * pow);
            pow = pow * 10;
        }
        System.out.println("Binary:" + ans);
        return ans;
    }

    // Time complexity: O(1)

    /*
    public static boolean solve(int N,int i){
        int binary = binaryconversion(N);
        return (binary & (1 << i)) != 0;

        or using >> - right shift
        return (1 & (binary >> i)) != 0;
    */
}
