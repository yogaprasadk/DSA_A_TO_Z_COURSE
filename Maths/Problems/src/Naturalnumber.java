import java.util.*;
public class Naturalnumber {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter N:");
        int n = sc.nextInt();
        System.out.print("Natural Numbers are: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        return;
    }
}
