import java.util.Scanner;

public class findevenorodd {

    static Scanner S = new Scanner(System.in);
    private static boolean evenorodd(int n){// code here
            if(n%2==0) return true;
            return false;
    }

    // GFG- https://www.geeksforgeeks.org/problems/odd-or-even3618/1
    public static void main(String[] args) {
        int n = S.nextInt();
        System.out.println(evenorodd(n));
    }

}
