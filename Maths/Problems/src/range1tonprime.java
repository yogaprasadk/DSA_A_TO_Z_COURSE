import java.util.ArrayList;
import java.util.Scanner;

// GFG - https://www.geeksforgeeks.org/problems/find-prime-numbers-in-a-range4718/1
public class range1tonprime {
    static Scanner S = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter M: ");
        int M = S.nextInt();
        System.out.print("Enter N: ");
        int N = S.nextInt();
        System.out.println(range(M,N));
    }

    //TC O(N2)
    /*
    private static ArrayList<Integer> range(int M,int N) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = M; i <=N; i++) {
            for (int j = 2; j <=N ; j++) {
                if (i%j == 0)
                {
                    if(isprime(i)){
                        ans.add(i);
                    }
                }
            }
        }
        return ans;
    }

    private static boolean isprime(int i) {
        int count = 0;
        for (int j = 1; j <=i ; j++) {
            if(i%j==0){
                count++;
            }
        }
        if(count == 2) return true;
        return false;
    }
    */

    // TC O(N*SQRT(N))
    /*
    static ArrayList<Integer> range(int M, int N)
    {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = M; i <=N; i++) {

            if(isprime(i))
            {
                ans.add(i);
            }
        }
        return ans;
    }

    private static boolean isprime(int i) {
        if(i<=1){
            return false;
        }
        for (int j = 2; j<= Math.sqrt(i) ; j++) {
            if(i%j==0){
                return false;
            }
        }

        return true;
    }
    */

    //optimizied approach: TC O(LOG LOGN)
    static ArrayList<Integer> range(int M, int N)
    {
        // refer the article for creating an array - https://www.geeksforgeeks.org/dsa/program-to-find-prime-numbers-between-given-interval/
        boolean[] isPrime = sieveoferato(N);
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = M; i <= N ; i++) {
                if(!isPrime[i]){
                    ans.add(i);
                }
        }
        return ans;
    }

    private static boolean[] sieveoferato(int n) {
        boolean[] composite = new boolean[n+1];
        composite[0] = true;
        composite[1] = true;

        for(int i = 2;i*i<=n;i++)
        {
            if(!composite[i]){
                for (int j = i*i; j <= n; j=j+i) {
                    composite[j] = true;
                }
            }
        }

//        for (int i = 2; i <= n; i++) {
//            if(!composite[i]) {
//                return composite[i];
//            }
//        }
        return composite;
    }

}
