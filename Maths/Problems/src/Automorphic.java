import java.util.Scanner;
//https://www.geeksforgeeks.org/problems/automorphic-number4721/1
public class Automorphic {
    static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter N: ");
        int n = S.nextInt();
        String res = is_AutomorphicNumber(n);
        System.out.println(res);
    }

    private static String is_AutomorphicNumber(int n) {
        int mul = n*n;
        int last = n%10;
        int mulast = mul%10;
        if(last == mulast){
            return "Automorphic";
        }
        return "Not Automorphic";
    }
}
