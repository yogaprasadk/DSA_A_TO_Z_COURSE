import java.util.*;
public class LCM {
    static Scanner sc = new Scanner(System.in);
    /*
    12 - 1 2 3 4 6 12
    24 - 1 2 3 4 6 12
    */
    public static void main(String[] args) {
        System.out.print("Enter N1:");
        int n = sc.nextInt();
        System.out.print("Enter N2: ");
        int m = sc.nextInt();
        System.out.print("LCM of "+n+" and "+m+" Are: ");
        int lcm = 1;
        for (int i = 1; i < m && i<n; i++) {
                if(i%m==0 && i%n==0){
                    lcm = i;
                    break;
                }
        }
        System.out.print(lcm);
        return ;
    }
}
