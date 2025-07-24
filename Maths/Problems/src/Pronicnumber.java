import java.util.Scanner;
// gfg = https://www.geeksforgeeks.org/problems/pronic-number0729/0
public class Pronicnumber {
    static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter N: ");
        int n = S.nextInt();
        int i = 0;
        int j = 1;
        for (;i*j<=n;i++,j++)
        {
            System.out.print(i*j+" ");
        }
    }
}
