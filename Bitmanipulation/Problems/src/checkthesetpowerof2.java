import java.util.Scanner;

public class checkthesetpowerof2 {
    // Leetcode - https://leetcode.com/problems/power-of-two/description/
    static Scanner S = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter N:");
        int N = S.nextInt();

        boolean ans = ispoweroftwo(N);

        System.out.println(ans);
    }

    private static boolean ispoweroftwo(int n) {

        // if(n<0) return false;
        if((n&n-1) == 0){
            return true;
        }
        return false;
    }
}
