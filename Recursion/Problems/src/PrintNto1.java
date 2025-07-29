import java.util.Scanner;
// GFG - https://www.geeksforgeeks.org/problems/print-n-to-1-without-loop/1
public class PrintNto1 {
    static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter N:");
        int N = S.nextInt();
        display(N);

    }

    public static void display(int N) {
        if (N == 0) {
            return;
        }
        System.out.print(N + " ");
        display(N - 1);
    }
}
