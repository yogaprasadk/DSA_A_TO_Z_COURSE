import java.util.Scanner;

public class Numberoffactors {
    static Scanner sc = new Scanner(System.in);
    // gfg - https://www.geeksforgeeks.org/problems/number-of-factors1435/1
    public static void main(String[] args) {
        System.out.print("Enter N: ");
            int N = sc.nextInt();
        System.out.println(factorscount(N));
    }

    private static int factorscount(int n) {
        // base condition
        if(n == 0){
            return 0;
        }
        // TC: O(N) - Too slow for large n (like 10^9)

        /*
        int count = 0;
        for (int i = 1; i <=n ; i++) {
            if (n%i==0){
                count++;
            }
        }
        return count;
        */


        // TC : O(SQRT(N))
        int count = 0;
        for(int i = 1;i*i<=n;i++){
            if(n%i==0){
                count++;
                if((n/i)!=i){
                    count++;
                }
            }
        }
        return count;


    }
}
