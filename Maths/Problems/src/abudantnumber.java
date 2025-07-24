import java.util.Scanner;
/*
Consider the number 12. Its proper divisors are 1, 2, 3, 4, and 6.
The sum of these proper divisors is 1 + 2 + 3 + 4 + 6 = 16.
Since 16 > 12, the number 12 is an abundant number.
 */
public class abudantnumber {
    static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter N: ");
        int n = S.nextInt();
        abudant(n);
    }

    private static void abudant(int n) {
        int sum = 0;
        for (int i = 1; i <=n ; i++) {
                if(n%i==0){
                    sum = sum + i;
                }
        }
        if(sum>n){
            System.out.println("Abudant number");
        }
        else{
            System.out.println("Not abudant number");
        }
    }
}
