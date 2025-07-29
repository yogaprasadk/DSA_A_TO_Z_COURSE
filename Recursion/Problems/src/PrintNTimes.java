import java.util.Scanner;
// GFG - https://www.geeksforgeeks.org/problems/print-gfg-n-times/1&selectedLang=python3
public class PrintNTimes {
    static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter N:");
        int N = S.nextInt();
        display(N);
    }

    public static void display(int N){

        if(N==0){
            return;
        }
        System.out.print("GFG"+" ");
        display(N-1);
    }
}
