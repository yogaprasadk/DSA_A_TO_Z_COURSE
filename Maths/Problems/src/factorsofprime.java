import java.util.*;
// GFG - https://www.geeksforgeeks.org/problems/prime-factors5052/1
public class factorsofprime {
    static Scanner S = new Scanner(System.in);
    // prime factors of a number
    public static void main(String[] args) {
        System.out.print("enter N:");
        int N = S.nextInt();
        brute(N); //Time complexity: O(SQRT(N))
        optimal(N); // Time Complexity: O(SQRT(N)
        better(N); // Time complexity: O(SQRT(N))
        return ;
    }

    private static void better(int n) {

        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 2; i*i <=n ; i++) {
            // factors
            if (n %i==0)
            {
                if(isprime(i)) {
                    ans.add(i);
                }

                if(isprime(n/i)){
                    ans.add(n/i);
                }
            }
        }
        System.out.println(ans);
    }

    private static void optimal(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 2; i*i <=n ; i++) {
            // factors
            if (n %i==0)
            {
                ans.add(i);
                while (n%i==0){
                    n=n/i;
                }
            }
        }
        if (n!=1){
            ans.add(n);
        }
        System.out.println(ans);
    }

    private static void brute(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 2; i*i <=n ; i++) {
            // factors
            if (n %i==0)
            {
                    if(isprime(i)) {
                        ans.add(i);
                    }
            }
        }
        System.out.println(ans);
    }

    private static boolean isprime(int n) {
        boolean isprimenot = false;
        int count = 0;
        for (int i = 1; i <=n ; i++) {
                if(n%i==0){
                    count++;
                }
        }
        if (count == 2){
            return true;
        }
        return isprimenot;
    }
}
