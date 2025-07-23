import java.util.Scanner;
// gfg - http://geeksforgeeks.org/problems/sum-of-series2811/1
public class Sumofnnatualnumbers {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter N: ");
        int N  = sc.nextInt();
        int ans  = sumofnnatural(N);
        System.out.println(ans);
    }

    private static int sumofnnatural(int n) {
        // brute approach - O(N)
        if(n == 0){
            return 0;
        }

        /*
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
        */

        // optimal - O(1)
        // use formula - n * (n+1) / 2;
        return (n*(n+1)/2);
    }
}
