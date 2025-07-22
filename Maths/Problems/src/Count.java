import java.util.*;
public class Count {
    static Scanner S = new Scanner(System.in);

    // GFG - https://www.geeksforgeeks.org/problems/count-digits5716/1
    public static void main(String[] args) {
        System.out.print("Enter N:");
        int N = S.nextInt();
        int ans = count(N);
        System.out.println(ans);
    }

    private static int count(int n) {
        int countnum = 0;
        int dup = n;
        while (n>0){
            int last = n % 10;
            if(last!=0 && (dup%last==0)){
                countnum++;
            }
            n /= 10;
        }
        return countnum;
    }
}