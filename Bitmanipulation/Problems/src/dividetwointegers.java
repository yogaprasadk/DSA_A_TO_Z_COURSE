import java.util.Scanner;

public class dividetwointegers {
    static Scanner Sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Dividend: ");
        int N = Sc.nextInt();
        System.out.print("Divisor: ");
        int S = Sc.nextInt();
        brute(N,S);
        int ans = divide(N,S);
        System.out.println(ans);
    }

    // Time Complexity:O(N/S)
    private static void brute(int N, int S) {
        int ans = 0;
        while (N-S>=0){
            ans++;
            if(N==1){
                break;
            }
            N=N-S;
        }
        System.out.println(ans);
    }

    public static int divide(int dividend, int divisor)
    {
        // edge cases
        if(dividend==Integer.MIN_VALUE&&divisor==-1){
            return Integer.MAX_VALUE;
        }

        int res = 0;
        int sign = (dividend>0) == (divisor>0) ? 1:-1;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        while(dividend-divisor>=0)
        {
            int temp = divisor;
            int count = 1;
            while(dividend - (temp<<1)>=0){
                temp <<= 1;
                count <<= 1;
            }
            res = res + count;
            dividend = dividend - temp;
        }
        return res*sign;
    }


}
