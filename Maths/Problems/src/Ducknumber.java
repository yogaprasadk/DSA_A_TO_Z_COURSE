import java.util.Scanner;
//gfg - https://www.geeksforgeeks.org/problems/zero-number2158/0

public class Ducknumber {
    static Scanner S = new Scanner(System.in);

    public static void main(String[] args) {
        String N =S.next();
        System.out.println(duckno(N));
    }

    private static boolean duckno(String n) {
        char c = n.charAt(0);
        // base condition
        if(c=='0'){
            return false;
        }
        for (int i = 1; i <n.length() ; i++) {
            if(n.charAt(i)=='0'){
                return true;
            }
        }
        return false;
    }
}
