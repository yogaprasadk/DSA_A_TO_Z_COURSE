package Introduction.Jaggedarrays;

import java.util.Scanner;

public class Jaggedarraysthreearraysuserinput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define a 3D jagged array
        int[][][] jaggedArray = new int[3][][]; // 3 layers

        // Initialize each layer with jagged 2D arrays
        for (int i = 0; i < jaggedArray.length; i++) {
            System.out.println("Enter the number of rows for layer " + (i + 1) + ": ");
            int rows = scanner.nextInt();
            jaggedArray[i] = new int[rows][];

            for (int j = 0; j < rows; j++) {
                System.out.println("Enter the number of columns for row " + (j + 1) + " in layer " + (i + 1) + ": ");
                int cols = scanner.nextInt();
                jaggedArray[i][j] = new int[cols];

                // Input elements for the current row
                System.out.println("Enter " + cols + " elements for row " + (j + 1) + " in layer " + (i + 1) + ": ");
                for (int k = 0; k < cols; k++) {
                    jaggedArray[i][j][k] = scanner.nextInt();
                }
            }
        }

        // Display the 3D jagged array
        System.out.println("The 3D jagged array is: ");
        for (int i = 0; i < jaggedArray.length; i++) {
            System.out.println("Layer " + (i + 1) + ":");
            for (int j = 0; j < jaggedArray[i].length; j++) {
                for (int k = 0; k < jaggedArray[i][j].length; k++) {
                    System.out.print(jaggedArray[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        scanner.close();
    }
}
