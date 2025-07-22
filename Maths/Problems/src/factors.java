import java.util.*;
public class factors {
    static Scanner S = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter N:");
        int N = S.nextInt();
        System.out.print("Factor of "+N+" are: ");
        for (int i = 1; i < N ; i++) {
            if(N%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
