import java.util.Scanner;
// refer these articles

/*
https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/
https://justwritecode.in/25-star-pattern-printing-in-java-every-beginner-should-know%e2%9a%a1/#2091
 */
public class Pattern {
    static Scanner S = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter N:");
        int N = S.nextInt();
        pattern30(N);
    }
    //1.Rectangular Star Pattern
    public static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //2.Right-Angled Triangle Pattern

    public static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //3.Right-Angled Triangle Number Pattern

    public static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    //4.Right-Angled Triangle Number Pattern II

    public static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    // 5.inverted star Right Pyramid
    public static void pattern5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //6. Inverted Numbered Right Pyramid

    public static void pattern6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // 7.Star Pyramid
    public static void pattern7(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }

            // star
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    // 8.Inverted Star Pyramid
    public static void pattern8(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void pattern9(int n) {
        for (int i = 1; i < n; i++) {
            // spaces
            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }

            // star
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    // 10.Half Diamond Star Pattern
    public static void pattern10(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    // binary number triangle
    public static void pattern11(int n) {
        int start = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                start = 1;
            } else {
                start = 0;
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();
        }
    }

    // number crown patter
    public static void pattern12(int n) {
        int spaces = 2 * (n - 1);
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
            spaces = spaces - 2;
        }
    }

    // increasing number triangle pattern
    public static void pattern13(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num = num + 1;
            }
            System.out.println();
        }
    }

    // increasing letter triangle pattern
    public static void pattern14(int n) {
        for (int i = 1; i <= n; i++) {
            char c = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(c + " ");
                c++;
            }
            System.out.println();
        }
    }

    // reverse letter triangle pattern
    public static void pattern15(int n) {
        for (int i = 1; i <= n; i++) {
            char c = 'A';
            for (int j = i; j <= n; j++) {
                System.out.print(c + " ");
                c++;
            }
            System.out.println();
        }
    }

    // alpha ramp pattern
    public static void pattern16(int n) {
        char c = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
            c++;
        }
    }

    // alpha hill pattern
    public static void pattern17(int n) {

        for (int i = 1; i <= n; i++) {
            char c = 'A';
            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print(c + " ");
                c++;
            }

            for (char d = c ;d>='A';d--) {
                System.out.print(d+" ");
            }
            System.out.println();

        }
    }

    // alpha triangle pattern
    public static void pattern18(int n){
        for (char c = 'E'; c >= 'A'; c--) {
            for (char j = c; j <= 'E'; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    // symmetric void pattern
    public static void pattern19(int n){
        int spaces = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n ; j++) {
                System.out.print("* ");
            }
            for(int j = 0;j<spaces;j++){
                System.out.print("  ");
            }
            for (int j = i; j <=n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
            spaces = spaces + 2;
        }
        int space = 2*(n-1);
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }

            for (int j = 0; j <space ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
            space = space - 2;
        }
    }

    // symmetric butterfly pattern
    public static void pattern20(int n) {
        int spaces = 2*(n-1);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }

            for (int j = 1; j <=spaces ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
            spaces = spaces - 2;
        }

        int space = 2;
        for (int i = 1; i <=n; i++) {
            for (int j = i; j <n ; j++) {
                System.out.print("* ");
            }

            for (int j = 0; j <space ; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
            space = space + 2;
        }
    }

    public static void pattern21(int n){
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++)
            {
                if(i==0||i==n-1||j==0||j==n-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // the number pattern
    public static void pattern22(int n){
        int originalN = n;
        n = 2*n;
        for (int row = 0; row <=n; row++) {
            for (int col = 0; col <= n ; col++) {
                int eIndex = originalN -  Math.min(Math.min(n - row,n-col),Math.min(row,col));
                System.out.print(eIndex+" ");
            }
            System.out.println();
        }
    }
    
    // K Pattern
    public static void pattern23(int n){
        for(int i = 1;i<=n;i++){
            for (int j = i; j <= n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 2;i<=n;i++){
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Palindrome Pattern
    public static void pattern24(int n){
        for (int i = 1; i<=n ; i++) {
            //spaces
            for(int j=i;j<=n;j++){
                System.out.print("  ");
            }
            //number
            for (int j = i; j >1; j--) {
                System.out.print(j+" ");
            }
            //number
            for (int j = 1; j <= i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    // Rhombus Pattern
    public static void pattern25(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = i; j <n ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Mirror Image triangle Pattern
    public static void pattern26(int n){

        for (int i = 1; i <n ; i++) {
            // spaces
            for (int j = 1; j <i ; j++) {
                System.out.print(" ");
            }

            for (int j = i; j <=n ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            for(int j = i-1;j>=1;j--){
                System.out.print(" ");
            }

            for (int j = i; j <=n ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    // Hollow Triangle Pattern
    public static void pattern27(int n){
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <n; j++) {
                if(i==n||i==j&&i>n/2||i+j==n&&j<=n/2){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // X Pattern
    public static void pattern28(int n){
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if(i==j|| i+j==n+1){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // Hollow Hourglass Pattern
    public static void pattern29(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if(i==1||i==j||i==n||i+j==n+1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    // hollow diamond pattern
    public static void pattern30(int n){
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < n; j++) {
                if (i==j&&i>=n/2||i+j==n-1&&i>=n/2){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==j&&i<=n/2||i+j==n-1&&i<=n/2){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}