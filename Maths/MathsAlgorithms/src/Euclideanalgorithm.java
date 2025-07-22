import java.util.Scanner;

public class Euclideanalgorithm {
    static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("A: ");
        int A = S.nextInt();
        System.out.print("B: ");
        int B = S.nextInt();
        System.out.println(gcdorhcf(A,B));
    }

    private static int gcdorhcf(int a, int b) {
        while (a>0&&b>0){
            if(a>b){
                a = a%b;
            }
            else{
                b= b%a;
            }
        }
        if(a==0){
            return b;
        }
        return a;
    }
}
