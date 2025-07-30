import java.util.Scanner;

public class toggleithbit {
    static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        int N = S.nextInt();
        System.out.print("Enter ith bit: ");
        int i = S.nextInt();
        int ans = solve2(N, i);
        System.out.println(ans);
    }

    private static int solve2(int n, int i) {
        return n^(1<<i);
    }

}
