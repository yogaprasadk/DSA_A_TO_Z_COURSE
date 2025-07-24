import java.util.Scanner;

public class sunnynumber {
    static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter N: ");
        int n = S.nextInt();
        if(sunnynum(n)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }

    //O(N)
    private static boolean sunnynum(int n) {
        for (int i = 1; i <=n ; i++) {
                if(i*i==n+1){
                    return true;
                }
        }
        return false;
    }
}
