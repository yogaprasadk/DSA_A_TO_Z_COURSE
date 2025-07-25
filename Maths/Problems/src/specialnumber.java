import java.util.Scanner;
//gfg-https://www.geeksforgeeks.org/problems/special-numbers4116/1
public class specialnumber {

    static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter N: ");
        long n = S.nextLong();
        specnum(n);
    }
    // brute
    public long getSpecialNumber(int N) {
        // code here
        long num = 0,count=0;
        // tofind Nth number means - N-1
        while(count < N-1){
            num++;
            if(isspecial(num)){
                count++;
            }
        }
        return num;
    }
    static boolean isspecial(long num){
        while(num > 0){
            long digit = num%10;
            if(digit > 5){
                return false;
            }
            num = num / 10;
        }
        return true;
    }
    
    // optimal - use base conversion method (base 10 to base 6);
    public static long specnum(long num){
        // nth number n -1
        num--;

        long base6 = 0;
        long pbase10 = 1;

        while(num!=0){

            base6 = base6 + pbase10*(num%6);
            pbase10 = pbase10 * 10;
            num/=6;
        }

        return base6;
    }
}
