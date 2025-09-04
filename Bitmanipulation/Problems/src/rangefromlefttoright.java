import java.util.Scanner;

public class rangefromlefttoright {
    // GFG => https://www.geeksforgeeks.org/problems/find-xor-of-numbers-from-l-to-r/1
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter L:");
        int l = S.nextInt();
        System.out.print("Enter R:");
        int r = S.nextInt();
        //Brute
        brute(l,r);
        S.close();
    }

    private static void brute(int l, int r) {
        int ans =0;
        for (int i = l; i <=r ; i++) {
            ans = ans ^ i;
        }
        System.out.println(ans);
    }

    public static int findXOR(int l, int r) {
        return range(l-1)^range(r);
    }

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
