import java.util.Scanner;

public class Newtonrapsonmethod {
    static Scanner S = new Scanner(System.in);

    public static void main(String[] args) {
        double t = S.nextInt();
        System.out.println(sqrt(t));
    }

    public static double sqrt(double n){
        double x = n;
        double root = 0;
        while(true) {
            root = 0.5 * (x + (n / x));
            if ((Math.abs(root) - x) < 1) {
                break;
            }
            x = root;
        }
        return root;

        // if need to find precision

        /*
            int p =3;

        double inc = 0.1;
        for(int i = 0;i<p;i++){
            while(root*root<=n){
            root=root+inc
            }
            root = root - inc;
            inc=inc/10;
        }
         */
    }
}
