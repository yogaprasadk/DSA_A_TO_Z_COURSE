package Introduction.Jaggedarrays;
// Java Program Demonstrating use of Jagged Arrays (2D Arrays with different column sizes)
import java.util.Scanner;

class input {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter number of rows: ");
        int n = s.nextInt(); // Number of rows

        int[][] arr = new int[n][]; // Declare jagged array

        // Input for each row
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number of columns for row " + (i + 1) + ": ");
            int m = s.nextInt(); // Number of columns in this row

            arr[i] = new int[m]; // Initialize the row

            for (int j = 0; j < m; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                arr[i][j] = s.nextInt(); // Input element
            }
        }

        int odd = 0, even = 0;

        System.out.println("\nElements of the Jagged Array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");

                // Count even and odd numbers
                if (arr[i][j] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
            System.out.println(); // Newline after each row
        }

        // Output even and odd count
        System.out.println("\nTotal Even numbers: " + even);
        System.out.println("Total Odd numbers: " + odd);

        s.close();
    }
}
