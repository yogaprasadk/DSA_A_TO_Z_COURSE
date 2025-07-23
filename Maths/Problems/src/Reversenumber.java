import java.util.Scanner;

// Leetcode => https://leetcode.com/problems/reverse-integer/description/
public class Reversenumber {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter N: ");
        int N  = sc.nextInt();
        int ans  = Reverse(N);
        System.out.println(ans);
    }

    private static int Reverse(int n) {
        int ans = 0;
        while(n!=0){
            int last = n%10;
            // why here using /10 means
            // when reversing a number it should not greater than the Integer.maxvalue and Integer.Mminvalue
            if(ans<Integer.MIN_VALUE/10 || ans>Integer.MAX_VALUE/10){
                return 0;
            }
            ans = ans*10 + last;
            n = n / 10;
        }
        return ans;
    }

}
