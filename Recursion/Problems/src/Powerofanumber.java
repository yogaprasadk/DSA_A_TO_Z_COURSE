import java.util.Scanner;

public class Powerofanumber {

    // GFG - https://www.geeksforgeeks.org/problems/power-of-numbers-1587115620/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
    static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter N:");
        int N = S.nextInt();
        System.out.print(reverseExponentiation(N));
    }
    /*

    // TIME COMPLEXITY:O(N)
    private static int powernum(int n) {
        int temp = n;
        int ans = 0;
        int power = 1;
        for(int i = 1;i<=n;i++){
            power = power * n;
        }
        while(n>0){
            int last = n%10;
            ans = ans+ last;
            n=n/10;
        }
        if(ans==temp){
            return power;
        }
        return temp;
    }*/

    // by using recursion Time Complexity - O(Log N)
    public static int reverseExponentiation(int n) {

        int reversed = reverse(n);
        return power(n, reversed);
        // Handle negative exponent

    }

    public static int reverse(int n){
        int ans = 0;
        while(n>0){
            ans = ans + n%10;
            n = n/10;
        }
        return ans;
    }

    public static int power(int n,int x){

        if(n==0){
            return 1;
        }

        int half = power(n,x/2);
        if(n%2==0){
            return half*half;
        }
        return x*half*half;
    }
}
