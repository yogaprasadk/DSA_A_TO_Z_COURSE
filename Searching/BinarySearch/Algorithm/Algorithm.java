package BinarySearch.Algorithm;

// Leetcode = 
public class Algorithm {
    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 6, 7, 12, 16, 18 };
        int target = 13;
        // iterative approach
        BinarySearch(arr, 0, arr.length - 1, target);
        // recursive approach
        BinarySearchRecursive(arr, 0, arr.length - 1, target);
    }

    public static void BinarySearch(int[] arr, int start, int end, int target) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                System.out.println(mid);
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println("-1");
    }

    // Recursive Approach
    public static void BinarySearchRecursive(int[] arr, int start, int end, int target) {
        if (start > end) {
            System.out.println("-1");
        }

        int mid = start + end / 2;
        if (arr[mid] == target) {
            System.out.println(arr[mid]);
        } else if (target > arr[mid]) {
            BinarySearchRecursive(arr, mid + 1, end, target);
        } else {
            BinarySearchRecursive(arr, start, mid - 1, target);
        }
    }
}
