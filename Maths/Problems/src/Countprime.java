import java.util.*;
public class Countprime {
    static Scanner S = new Scanner(System.in);

    // Leetcode Problem 204 - https://leetcode.com/problems/count-primes/
    // 0 & 1 => 0
    // 2 => 0
    // 3 => 1
    public static void main(String[] args) {
        System.out.print("Enter N:");
        int N = S.nextInt();
        brute(N);
//        int ans = optimal(N);
//        System.out.println(ans);
    }

    public static void brute(int n){
        // Time Complexity: O(N2)
        int count = 0;
        for (int i = 1; i <n ; i++) {
            int primecount = 0;
            for (int j = 1; j <= i; j++) {
                if(i%j==0){
                    primecount++;
                }
            }
            if (primecount==2){
                count++;
            }
        }
        System.out.println(count);
    }

    public static int optimal(int n){

        // use algorithm sieve of eratothenesis
        if(n<=2){
            return 0;
        }

        boolean[] composite = new boolean[n];
        for(int i = 2;i*i<=n;i++){
            if(!composite[i]){
                for (int j = i*i; j < n; j=j+i) {
                    composite[j] = true;
                }
            }
        }

        int count  = 0;
        for (int i = 2; i < n; i++) {
            if(!composite[i]){ // false
                count++;
            }
        }
        return count;
    }
}

