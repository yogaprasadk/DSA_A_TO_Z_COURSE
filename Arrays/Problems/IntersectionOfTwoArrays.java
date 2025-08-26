import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class IntersectionOfTwoArrays {
    // https://leetcode.com/problems/intersection-of-two-arrays/
    static Scanner S = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.println("Enter Array Size ");
            int arrSize = S.nextInt();
            if (arrSize <= 0) {
                System.out.println("Enter arrSize greater than 0");
                return;
            }

            // dynamic array
            int[] arr = new int[arrSize];

            System.out.print("Enter Array Elements: ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = S.nextInt();
            }

            int arrSize2 = S.nextInt();
            if (arrSize2 <= 0) {
                System.out.println("Enter arrSize greater than 0");
                return;
            }

            // dynamic array
            int[] arr2 = new int[arrSize2];

            System.out.print("Enter Array2 Elements: ");
            for (int i = 0; i < arr2.length; i++) {
                arr2[i] = S.nextInt();
            }
            int[] ans = Intersection(arr, arr2);
            System.out.println(Arrays.toString(ans));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter integers only.");
        }

        finally {
            S.close();
        }
    }

    public static int[] Intersection(int[] nums1, int[] nums2) {
        //TC -O(N2) Sc : O(n)
        /*
         * int[] temp = new int[Math.min(nums1.length, nums2.length)];
         * int index = 0;
         * 
         * for (int i = 0; i < nums1.length; i++) {
         * for (int j = 0; j < nums2.length; j++) {
         * if (nums1[i] == nums2[j]) {
         * // Check if already in temp (avoid duplicates)
         * boolean alreadyAdded = false;
         * for (int k = 0; k < index; k++) {
         * if (temp[k] == nums1[i]) {
         * alreadyAdded = true;
         * break;
         * }
         * }
         * 
         * if (!alreadyAdded) {
         * temp[index++] = nums1[i];
         * }
         * 
         * break; // break inner loop to avoid counting duplicates
         * }
         * }
         * }
         * 
         * return Arrays.copyOf(temp, index);
         */

        // Better Solution TC - O(M LogM + N LogN) Sc : O(N+M) 
        int len1 = nums1.length;
        int len2 = nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int[] nums = new int[Math.min(len1, len2)];
        int i = 0, j = 0, k = 0;
        while (i < len1 && j < len2) {
            if (nums1[i] == nums2[j]) {
                // Only Add if it'S not a duplicate in result
                if (k == 0 || nums[k - 1] != nums[i]) {
                    nums[k] = nums1[i];
                    k++;
                }
                i++;
                j++;
            } else if (nums[i] < nums[j]) {
                i++;
            } else {
                j++;
            }
        }
        return Arrays.copyOf(nums, k);
        /*

        // Optimal Solution - O(M+N) SC - O(1)
         * class Solution {
         * public int[] intersection(int[] nums1, int[] nums2) {
         * boolean[] seen = new boolean[1001];
         * for (int num : nums1)
         * seen[num] = true;
         * 
         * int[] res = new int[nums1.length];
         * int k = 0;
         * 
         * for (int num : nums2)
         * if (seen[num] == true) {
         * seen[num] = false;
         * res[k++] = num;
         * }
         * 
         * return Arrays.copyOfRange(res, 0, k);
         * }
         * }
         * 
         */
    }
}
