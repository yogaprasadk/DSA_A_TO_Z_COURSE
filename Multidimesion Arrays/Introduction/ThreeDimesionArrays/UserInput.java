package Introduction.ThreeDimesionArrays;
import java.util.*;
public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get dimensions from user
        System.out.print("Enter number of blocks (depth): ");
        int x = scanner.nextInt();

        System.out.print("Enter number of rows per block: ");
        int y = scanner.nextInt();

        System.out.print("Enter number of columns per row: ");
        int z = scanner.nextInt();

        // Initialize 3D array
        int[][][] arr = new int[x][y][z];

        // Input elements
        for (int i = 0; i < x; i++) {
            System.out.println("Block " + (i + 1) + ":");
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    System.out.print("Enter element at [" + i + "][" + j + "][" + k + "]: ");
                    arr[i][j][k] = scanner.nextInt();
                }
            }
        }

        // Output array and count even/odd
        int even = 0, odd = 0;
        System.out.println("\nElements in the 3D array:");
        for (int i = 0; i < x; i++) {
            System.out.println("Block " + (i + 1) + ":");
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    System.out.print(arr[i][j][k] + " ");
                    if (arr[i][j][k] % 2 == 0)
                        even++;
                    else
                        odd++;
                }
                System.out.println();
            }
            System.out.println();
        }

        // Output counts
        System.out.println("Total Even Numbers: " + even);
        System.out.println("Total Odd Numbers: " + odd);

        scanner.close();
    }
}