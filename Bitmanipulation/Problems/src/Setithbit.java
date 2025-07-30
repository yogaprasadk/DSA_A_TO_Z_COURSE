import java.util.Scanner;

public class Setithbit {
    static Scanner S = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter N:");
        int N = S.nextInt();
        System.out.print("Enter ith bit: ");
        int i = S.nextInt();
        System.out.println(setbit(N, i));
    }

    // Time Complexity: O(log n)
    private static int setbit(int n, int i) {
        int binary = binaryconversion(n);
        int ans = binary|(1<<i);
        return convert_decimal(ans);
    }

    private static int convert_decimal(int binary) {
        int rem = 0, pow = 1, ans = 0;
        while(binary >0)
        {
            rem = binary % 10;
            ans = ans + (rem * pow);
            binary = binary / 10;
            pow = pow * 2;  // change the divisor according to the base given if binary - 2 octal -8  hexadecimal -16
        }
        return ans;
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
        return ans;
    }

    //bettersolution

    /*
    //Time Complexity : O(1)
    private static int setbit(int n, int i) {
        int binary = binaryconversion(n);
        return (n|(1<<i));
    }
     */
}
