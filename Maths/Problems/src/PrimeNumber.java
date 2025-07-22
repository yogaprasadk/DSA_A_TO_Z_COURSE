import java.util.*;
public class PrimeNumber {
    //GFG - https://www.geeksforgeeks.org/problems/prime-number2314/1
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter N:");
        int n = sc.nextInt();
        int count = 0;
        // brute Force - O(N)
        for (int i = 1; i <= n; i++)
        {
            if(n%i==0) {
                count++;
            }
        }
        if(count == 2){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
        return;
    }

    // optimal solution - O(SQRT(N))
    static boolean isPrime(int n) {
        // code here
        int count = 0;
        for (int i = 1; i*i <= n; i++)
        {
            if(n%i==0) {
                count++;
                if((n/i)!=i){
                    count++;
                }
            }
        }

        if(count == 2){
            return true;
        }
        return false;
    }
}
