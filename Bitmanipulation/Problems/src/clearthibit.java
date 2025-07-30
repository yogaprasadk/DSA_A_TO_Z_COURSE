import java.util.Scanner;

public class clearthibit {

    static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {System.out.print("Enter N:");
        int N = S.nextInt();
        System.out.print("Enter ith bit: ");
        int i = S.nextInt();
        int ans = solve1(N, i);
        System.out.println(ans);
    }

    private static int solve1(int n, int i) {
        return (n&(~(1<<i)));
    }
}
