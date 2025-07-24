import java.util.Scanner;

// refer the article - https://www.geeksforgeeks.org/dsa/spy-number-sum-and-products-of-digits-are-same/
public class SpyNumber {
    static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter N: ");
        int n = S.nextInt();
        spynum(n);
    }
    //TC - O(log n)
    static void spynum(int n){

        int sum = 0,pro = 1;
        while (n!=0) {
            int last = n % 10;
            sum = sum + last;
            pro = pro * last;
            n = n / 10;
        }
        if (sum==pro){
            System.out.println("Spy");
        }
        else {
            System.out.println("Not a spy");
        }
    }
}
