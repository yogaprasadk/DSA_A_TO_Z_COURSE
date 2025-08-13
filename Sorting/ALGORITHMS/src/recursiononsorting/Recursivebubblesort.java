import java.util.*;
public class Recursivebubblesort {
    static Scanner S = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter Size: ");
        int n = S.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = S.nextInt();
        }
        System.out.print("Array Before Sorting: " + Arrays.toString(arr));
        System.out.println();
        recursivebubble(arr, arr.length - 1, 0);
        System.out.println("Arrays After Sorting: " + Arrays.toString(arr));
    }

    public static void recursivebubble(int[] arr, int end, int start) {
        // base condition
        if (end == 0) {
            return;
        }

        // condition
        if (start < end) {
            if (arr[start] > arr[start+ 1]) {
                swap(arr, start, start + 1);
            }
            // move to the next element
            recursivebubble(arr, end,start + 1);
        } else {
            recursivebubble(arr, end - 1, 0);
        }
    }

    private static void swap(int[] arr, int end, int i) {
        int temp = arr[end];
        arr[end] = arr[i];
        arr[i] = temp;
    }
}


// Recursive bubble: TC:O(N2) SC: O(N2)