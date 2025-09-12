
import java.util.*;

public class UserInput {
    static Scanner S = new Scanner(System.in);    public static void main(String[] args) {
        System.out.print("Enter number of rows: ");
        int row = S.nextInt();

        System.out.print("Enter number of columns: ");
        int col = S.nextInt();

        int[][] arr = new int[row][col];

        System.out.println("Enter elements of array: ");

        // Taking input from user for each element of array
        // using nested for loop
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = S.nextInt();
            }
        }

        System.out.println("Elements of array are: ");
        // Printing Elements of Arrays
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
        S.close();
    }
}
