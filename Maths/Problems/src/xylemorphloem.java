import java.util.Scanner;

public class xylemorphloem {
    static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter N: ");
        int n = S.nextInt();
        if(xylumphlo(n)){
            System.out.println("Xylem");
        }
        else {
            System.out.println("Phloem");
        }

    }

    private static boolean xylumphlo(int n) {

        int last = n%10;
        int rem = n/10;
        while (n>10){
            n=n/10;
        }
        int firstandlast = last + n;
        int sum = 0;
        while (rem>10){
            sum = sum + rem%10;
            rem/=10;
        }
        if(sum == firstandlast){
            return true;
        }
        return false;
    }
}
