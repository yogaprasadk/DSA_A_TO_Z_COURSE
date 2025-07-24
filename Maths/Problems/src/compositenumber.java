import java.util.Scanner;
// gfg - https://www.geeksforgeeks.org/problems/composite-and-prime0359/1
public class compositenumber {
    static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter m:");
        int m = S.nextInt();
        System.out.println("Enter n:");
        int n = S.nextInt();

        if(m==1){
            m=m+1;
        }

        int  primecount =0,compositecount=0;
        for (int i = m; i <= n; i++) {
            if (isprime(i)) {
                primecount++;
            }
            else{
                compositecount++;
            }
        }
        System.out.println(compositecount - primecount);

    }
    public static boolean isprime(int n){
        if(n<=1){
            return false;
        }
        for (int i = 1; i <=Math.sqrt(n) ; i++) {
            if(n%i==0){
                return false;
            }
        }

        return true;
    }
}
