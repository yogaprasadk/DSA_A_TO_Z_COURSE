package Pattern.SlidingWindow;

import java.util.*;

public class SlidingWindow {
    private static Scanner S = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            // Windows Size
            System.out.print("Enter K Size (window size): ");
            int kSize = S.nextInt();
            // Array Size
            System.out.print("Enter Array Size: ");
            int arrSize = S.nextInt();

            // edge case for array size
            if (arrSize <= 0) {
                System.out.println("Array size must be greater than 0.");
                return;
            }

            // edge case for window size
            if (kSize <= 0 || kSize > arrSize) {
                System.out.println("Window size must be > 0 and <= arrSize");
                return ;
            }

            // Dynamic Array
            int[] arr = new int[arrSize];

            // Array Values Input
            System.out.println("Enter Array Elements: ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = S.nextInt();
            }

            int maxSubArraySum = maxSum(arr, kSize);
            System.out.println("Maximum subArray sum of size: " + kSize + ": " + maxSubArraySum);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input type. Please enter Integers only ");
        }

        // After all work is done
        S.close();
    }

    public static int maxSum(int[] arr, int size) {
        int windowSum = 0;
        
        // Calculate sum of the first window
        for (int i = 0; i < size; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        for (int i = size; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - size];
            maxSum = Math.max(windowSum, maxSum);
        }

        return maxSum;

    }
}
