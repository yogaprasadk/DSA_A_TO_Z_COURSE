

import java.util.*;

// Leetcode - https://leetcode.com/problems/contains-duplicate/
public class Countduplicates {
    static Scanner S = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter Size: ");
        int size = S.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter Array Elements: ");
        for (int index = 0; index < arr.length; index++) {
            arr[index] = S.nextInt();
        }
        boolean ans = containsDuplicate(arr);
        System.out.println(ans);
    }

    private static boolean containsDuplicate(int[] arr) {

        if (arr.length <= 1) {
            return false;
        }

        // Arrays.sort(arr);
        // for (int i = 1; i < arr.length; i++) {
        // if (arr[i] == arr[i - 1]) {
        // return true; // Duplicate found
        // }
        // }
        // return false;

        // using two pointer
        if (arr.length <= 1) {
            return false;
        }

        // Step 1: Sort the array
        Arrays.sort(arr);

        // Step 2: Use two pointers to check adjacent elements
        int left = 0;
        int right = 1;

        while (right < arr.length) {
            if (arr[left] == arr[right]) {
                return true; // Duplicate found
            }
            left++;
            right++;
        }
        return false;
    }
    // TC - O(N Log N) Space: O(1);

    /*
     * Better Solution - O(N)
     * 
     * import java.util.HashSet;
     * 
     * public boolean containsDuplicate(int[] arr) {
     * HashSet<Integer> seen = new HashSet<>();
     * for (int num : arr) {
     * if (seen.contains(num)) {
     *    return true; // Duplicate found
     * }
     * seen.add(num);
     * }
     * return false; // All distinct
     * }
     */
}
