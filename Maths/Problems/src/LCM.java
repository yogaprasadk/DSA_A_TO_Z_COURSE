import java.util.*;
// gfg -
public class LCM {
    static Scanner sc = new Scanner(System.in);
    /*
    12 - 1 2 3 4 6 12
    24 - 1 2 3 4 6 12
    */
    public static void main(String[] args) {
        System.out.print("Enter N1:");
        int n = sc.nextInt();
        System.out.print("Enter N2: ");
        int m = sc.nextInt();
        System.out.print("LCM of "+n+" and "+m+" Are: ");
        int lcm = 1;
        // TC O(M*N)
        for (int i = 1; i < m*n; i++) {
                if(i%m==0 && i%n==0){
                    lcm = i;
                    break;
                }
        }
        System.out.print(lcm);
        return ;
    }
    //another solution in O(N)
    /*
            public static int lcmFor(int a, int b) {
    int max = Math.max(a, b);
    for (int lcm = max; ; lcm++) {
        if (lcm % a == 0 && lcm % b == 0) {
            return lcm;
        }
    }
}

     */

    // optimal using euclidean algorithm - O(Log(Min(a,b))
    /*
    static int lcm(int a,int b){
        return a*b/gcd(a,b);
    }
     */

}
