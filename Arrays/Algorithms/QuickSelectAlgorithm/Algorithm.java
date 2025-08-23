package QuickSelectAlgorithm;

/*
 * For Kth Smallest in Sorted Array - arr[k-1]  O(1)
 * For Kth Largest  in Sorted Array - arr[arr.length - K] O(1)
 * For Kth Smallest / Largest in Unsorted Array - QuickSelect Algorithm O(n) Or Sort +    index - O(n Logn) 
 */

import java.util.*;

public class Algorithm {
    static Scanner S = new Scanner(System.in);

    public static void main(String[] args) {
        try {

            // To find Kth element in array
            System.out.print("Enter K Element: ");

            int K = S.nextInt();
            if (K < 0) {
                System.out.println("Enter K greater than zero");
                return;
            }

            System.out.print("Enter Array Size: ");
            int arrSize = S.nextInt();

            if (arrSize <= 0) {
                System.out.println("Enter Array Size greater than Zero");
                return;
            }

            // if array size is 0 or K is greater than arraySize
            if (arrSize < 0 || K >= arrSize) {
                return;
            }

            int[] arr = new int[arrSize];
            System.out.print("Enter Array Elements: ");

            for (int i = 0; i < arr.length; i++) {
                arr[i] = S.nextInt();
            }

            // Kth Smallest
            // K is 1-based index for Kth Smallest
            int smallestAns = KthSmallest(arr, 0, arr.length - 1, K - 1);
            System.out.println(smallestAns);

            // Kth Largest
            // K is N-based index for Kth Largest
            int largestAns = KthLargest(arr, 0, arr.length - 1, arr.length - K);
            System.out.println(largestAns);

        } catch (InputMismatchException e) {
            System.out.print("Try to Enter The Input Correctly");
        }

        finally {
            S.close();
        }
    }

    private static int KthLargest(int[] arr, int left, int right, int kIndex) {
        while (left <= right) {
            int pivotIndex = partition(arr, left, right);

            if (pivotIndex == kIndex) {
                return arr[kIndex];
            }

            else if (pivotIndex < kIndex) {
                left = pivotIndex + 1;
            }

            else {
                right = pivotIndex - 1;
            }
        }
        return -1;
    }

    private static int KthSmallest(int[] arr, int left, int right, int kIndex) {
        while (left <= right) {
            int pivotIndex = partition(arr, left, right);

            if (pivotIndex == kIndex) {
                return arr[kIndex];
            }

            else if (pivotIndex < kIndex) {
                left = pivotIndex + 1;
            }

            else {
                right = pivotIndex - 1;
            }
        }
        return -1;
    }

    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left;

        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, right);
        return i;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
