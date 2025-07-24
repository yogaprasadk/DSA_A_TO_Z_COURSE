import java.util.Scanner;
// gfg - https://www.geeksforgeeks.org/problems/strong-numbers3315/1
public class strongnumber
{
    static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter N: ");
        int n = S.nextInt();
        strongnum(n);

    }

    private static void strongnum(int n)
    {

        int dup = n;
        int sum = 0;
        while (n!=0)
        {
        int fact = 1;
        for (int i = 1;i<=n%10;i++)
        {
            fact = fact * i;
        }
        sum = sum + fact;
        n /= 10;
        }
        if(sum == dup){
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }
    }
}
