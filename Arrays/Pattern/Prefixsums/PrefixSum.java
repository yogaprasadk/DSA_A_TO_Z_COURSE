package Pattern.Prefixsums;

import java.util.*;

/*
 | 🧩 Phrase in Problem Description    | 💡 Pattern Likely            |
| ----------------------------------- | ---------------------------- |
| "Sum of subarray from index i to j" | Prefix Sum                   |
| "Range sum query"                   | Prefix Sum                   |
| "Find total sum in a range"         | Prefix Sum                   |
| "Subarray sum equals target"        | Prefix Sum + Map             |
| "Count subarrays with sum = k"      | Prefix Sum + Hash            |
| "Immutable array, multiple queries" | Prefix Sum                   |
| "Sum of rectangle in matrix"        | 2D Prefix Sum                |
| "Cumulative sum"                    | Prefix Sum                   |
| "Running total"                     | Prefix Sum                   |
| "Sum of sliding window"             | Prefix Sum or Sliding Window |
| "Sum of elements less than x"       | Prefix or Sort               |
| "Number of subarrays with..."       | Prefix Sum + Map             |
| "Apply updates to ranges"           | Difference Array             |

📌 LeetCode Problem Titles That Suggest Prefix Sum

These actual LeetCode problem titles show how prefix sum problems are labeled:

Range Sum Query - Immutable

Subarray Sum Equals K

Range Sum of Sorted Subarray Sums

Sum of Even Numbers After Queries

Count Number of Nice Subarrays

Maximum Sum of Rectangle No Larger Than K

Range Sum Query 2D - Immutable

Maximum Size Subarray Sum Equals k

Contiguous Array

Number of Subarrays With Bounded Maximum

🛠 How to Use This

When you're reading a problem:

Scan the description for keywords like range, sum, subarray, multiple queries, or prefix.

1.If the array isn't changing and you're asked to do many queries → very likely a prefix sum problem1.
Ex: Code 
import java.util.Scanner;

public class RangeSumQueries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array
        int[] nums = {2, 4, 6, 8, 10};

        // Precompute prefix sums
        int[] prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }

        // Example queries
        int[][] queries = {
            {0, 2},  // sum from index 0 to 2 → 2 + 4 + 6 = 12
            {1, 3},  // 4 + 6 + 8 = 18
            {2, 4}   // 6 + 8 + 10 = 24
        };

        for (int[] query : queries) {
            int l = query[0];
            int r = query[1];

            int sum = prefixSum[r] - (l > 0 ? prefixSum[l - 1] : 0);
            System.out.println("Sum from index " + l + " to " + r + " = " + sum);
        }

        sc.close();
    }
}

2.If you're asked to count something (like number of subarrays that meet a condition) → prefix sum + hashmap is likely.
Ex: code

import java.util.HashMap;

public class SubarraySumEqualsK {
    public static int subarraySum(int[] nums, int k) {
        // Map to store the frequency of prefix sums
        HashMap<Integer, Integer> prefixSumCount = new HashMap<>();
        prefixSumCount.put(0, 1); // For subarrays that start from index 0

        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {
            prefixSum += num;

            // Check if there is a prefix sum that matches current - k
            if (prefixSumCount.containsKey(prefixSum - k)) {
                count += prefixSumCount.get(prefixSum - k);
            }

            // Store/update current prefix sum frequency
            prefixSumCount.put(prefixSum, prefixSumCount.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, -1, 1, 2};
        int k = 3;

        int result = subarraySum(nums, k);
        System.out.println("Number of subarrays with sum " + k + ": " + result);
    }
}

 */
public class PrefixSum {
    private static Scanner S = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            // Array Size
            System.out.print("Enter Array Size: ");
            int arrSize = S.nextInt();

            // edge case for array size
            if (arrSize <= 0) {
                System.out.println("Array size must be greater than 0.");
                return;
            }

            // Dynamic Array
            int[] arr = new int[arrSize];

            // Array Values Input
            System.out.println("Enter Array Elements: ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = S.nextInt();
            }

            int[] res = prefixSum(arr);
            System.out.println(Arrays.toString(res));

        } catch (InputMismatchException e) {
            System.out.println("Invalid input type. Please enter Correctly");
        }

        // After all work is done
        S.close();
    }

    public static int[] prefixSum(int[] arr) {

        /*
         * In IPL MATCH 20 OVERS
         * FIRST TEN OVERS
         * 1 2 3 4 5 6 7 8 9 10
         * Runs: 3 2 5 3 1 5 7 2 4 30
         * Prefixsum apply array will become => {3,5,10,13,14,19,26,28,32,62}
         */

        // Calculate prefix sums for the input array.
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];

        for (int i = 1; i <= prefixSum.length - 1; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        return prefixSum;
        // Time Complexity: O(N);
        // Space Complexity: O(N);
    }
}