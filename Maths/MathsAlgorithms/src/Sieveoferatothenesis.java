import java.util.Scanner;

public class Sieveoferatothenesis {
    static Scanner S = new Scanner(System.in);
    /*
    1.First index need to be changed to become i*i
    2.prime numbers of its multiple must be changed to true;
     */
    public static void main(String[] args) {
        int N = S.nextInt();
        int ans = algorithm(N);
        System.out.println(ans);
    }
    private static int algorithm(int n) {
        if(n<=2){
            return 0;
        }
        boolean[] composite = new boolean[n];
        for(int i = 2;i*i<=n;i++)
        {
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
// Time Complexity: O(Log Log N)
// Space Complexity: O(N)