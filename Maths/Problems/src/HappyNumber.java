import java.util.Scanner;

//leetcode - https://leetcode.com/problems/happy-number/description/
public class HappyNumber {
    static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter N: ");
        int n = S.nextInt();
        if(happynum(n)){
            System.out.println("Happy");
        }
        else {
            System.out.println("Not Happy");
        }
    }

    private static boolean happynum(int n) {


        while(n!=1 && n!=4)
        {
            int last = 0,sum = 0;
            while (n != 0) {
                last = n % 10;
                sum = sum + (last*last);
                n = n / 10;
            }
            n = sum;
        }
        if(n == 1){
            return true;
        }
        return false;
    }


}
