import java.util.Scanner;

public class countthesetbit {
    static Scanner S = new Scanner(System.in);
    // GFG - https://www.geeksforgeeks.org/problems/set-bits0143/1
    public static void main(String[] args) {
        System.out.print("Enter N:");
        int N = S.nextInt();

    }

    // Brute Force solution
    /*public static int setbticount(int n){
        int count = 0;
        // lcm
        while(n>1){
            if(n%2==1){
                count++;
            }
            n=n/2;
        }
        if(n==1){
            count++;
        }
        return count;
    }*/

    // better solution - O(Log N)
    /*
    public static int setbitcount(int n){
        int count = 0;
        // lcm
        while(n>1){
            count += n&1; // 
            n=n>>1; // similar to n/2
        }
        if(n==1){
            count++;
        }
        return count;
    }
    */

    // optimal solution - O(Log n)
    public static int setbitcount(int n){
        int count = 0;
        while(n!=0){
           n = n&(n-1);
           count++;
        }
        return count;
    }
}
