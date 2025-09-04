import java.util.Scanner;

public class rangefrom1TON {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter N:");
        int N = S.nextInt();
        //Brute
        brute(N);
        int ans = range(N);
        System.out.println(ans);
        S.close();
    }

    // Brute - O(N)
    private static void brute(int r) {
        int ans =0;
        for (int i = 1; i <=r ; i++) {
            ans = ans ^ i;
        }
        System.out.println(ans);
    }

    // Optimal - O(1)
    /*
    Remember this Pattern:
    n=1 => 0^1 = 1
    n=2 => 1^2 = 3
    n=3 => 1^2^3 = 0
    n=4 -> 1^2^3^4 = 4

    n=5 => 1^2^3^4^5^6^7 = 1
    n=6 => 1^2^4^5^6 = 7(N+1)
    n=7 => 1^2^3^4^5^6^7 = 0
    n=8 -> 1^2^3^4^5^6^7^8 = 8

     */
    public static int range(int N){
        if(N%4==1){
            return 1;
        }
        else if (N%4==2){
            return N+1;
        } else if (N%4==3) {
            return 0;
        }
        // N%4==0
        return N;
    }
}
