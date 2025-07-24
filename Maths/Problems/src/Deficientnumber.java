import java.util.Scanner;

// gfg -  https://www.geeksforgeeks.org/problems/deficient-number1612/1
public class Deficientnumber {
    static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter N: ");
        int n = S.nextInt();
        deficient(n);

    }

    private static void deficient(long n) {
        long pro = n * 2;
        long sum = 0;
        for (long i = 1; i <=n ; i++) {
            if(n%i==0){
                sum = sum + i;
            }
        }
        if(sum<pro){
            System.out.println("Deficient");
        }
        else{
            System.out.println("Not Deficient");
        }
    }
}
