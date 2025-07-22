
import java.util.*;
public class gcdorhcf {
    // gfg https://www.geeksforgeeks.org/problems/gcd-of-two-numbers3459/1
    public static void main(String[] args) {
        int a = 24;
        int b = 12;
        int c =1;
        for (int i = 1;i<=a&&i<=b;i++){
            if(a%i==0 && b%i==0){
                c=i;
            }
        }
        System.out.println(c);
    }
}
