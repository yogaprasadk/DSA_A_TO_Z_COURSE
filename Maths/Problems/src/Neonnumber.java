import java.util.Scanner;

public class Neonnumber {
    static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter N: ");
        int n = S.nextInt();
        neon(n);

    }

    private static void neon(int n) {
        int pow = n * n;
        int sum = 0;
        while (pow!=0){
            sum += pow%10;
            pow/=10;
        }
        if (n==sum){
            System.out.println("Neon");
        }
        else {
            System.out.println("Not neon");
        }
    }
}
