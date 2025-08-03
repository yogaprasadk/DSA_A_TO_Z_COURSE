import java.util.Scanner;
// GFG - https://www.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1&selectedLang=python3
public class Print1ToN {
    static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter N:");
        int N = S.nextInt();
        display(N);
    }

    public static void display(int N){

        if(N < 1){
            return;
        }
        display(N-1);// 9
        System.out.print(N+" ");
    }
}
