import java.util.Scanner;

public class Harshadnumber {
    //Leetcode - https://leetcode.com/problems/harshad-number/description/

    static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter N: ");
        int n = S.nextInt();
        int ans = harshad(n);
        System.out.println(ans);
    }

    private static int harshad(int n) {
        int dup = n;
        int sum = 0;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        if(dup%sum==0){
            return sum;
        }
        return -1;

    }

}
