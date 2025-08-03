import java.util.Scanner;

public class Sumofnaturalnumbers {
    public static int findsum(int n){
        if(n<1){
            return 0;
        }
        return n + findsum(n - 1);
    }

    static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter N:");
        int N  = S.nextInt();
        System.out.print(findsum(N));
    }
}
