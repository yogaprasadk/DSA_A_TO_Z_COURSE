import java.util.Scanner;
public class settherightmostunsetbit {
    static Scanner S = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter N:");
        int N = S.nextInt();
        int ans = set(N);
        System.out.println(ans);
    }

    private static int set(int n) {
        int ans = n|(Math.abs(~n));
        return ans;
    }

    private static int convert(int i) {
        int ans=0,pow=1;
        while (i>0){
                ans = ans + (pow*i%10);
                i = i/10;
                pow = pow * 2;
        }
        System.out.println(ans);
        return ans;
    }

}


