import java.util.Scanner;

public class Removethelastsetbitrightmost {
    static Scanner S = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter N:");
        int N = S.nextInt();
        int ans = setbit(N);
        System.out.println(ans);
    }

    private static int setbit(int n) {
        return n&(n-1);
    }
}
