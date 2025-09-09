
import java.util.*;

public class LongestConsecutiveOnes {
    // Leetcode -
    // https://leetcode.com/problems/longest-consecutive-sequence/description/

    static Scanner S = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter Size: ");
        int arrSize = S.nextInt();
        if (arrSize <= 0) {
            return;
        }
        System.out.print("Enter Array Elements: ");
        int[] arr = new int[arrSize];
        int result = longest(arr);
        System.out.println(result);
    }

    public static int longest(int[] arr) {
        // brute force TC - O(N2) SC - O(1)
        /*
         * public static int longest(int[] arr){
         * // arr[] = {102,4,100,1,101,3,2,1}
         * int longest = 1;
         * for(int i = 0;i<arr.length;i++){
         * int currValue = arr[i];
         * int count = 1;
         * while(LinearSearch(arr,currValue + 1 == true)){
         * currValue = currValue + 1;
         * count = count + 1;
         * }
         * longest = Math.max(count,longest);
         * }
         * return longest;
         * }
         * public static boolean LinearSearch(int[] arr,int value){
         * 
         * for(int i = 0;i<arr.length;i++){
         * 
         * if(arr[i] == value){
         * return true;
         * }
         * 
         * }
         * return false;
         * }
         Better Solution - TC O(N Log N) SC - O(1) 
         int longest = 1;
         int lastSmaller = Integer.MIN_VALUE;
         Arrays.Sort(arr);
         for(int i = 0;i<arr.length;i++){
            if(arr[i] - 1 == lastSmaller){
               longest = longest + 1;
               lastSmaller = arr[i];
            }

            else if(arr[i] != lastSmaller)
            {
                longest = 1;
                lastSmaller = arr[i];
            }
            longest = Math.max(longest,lastSmaller);    
         }
            return longest;
         */

        // Optimal Solution - TC : O(3N) SC - O(N)
        // why HashSet is used ? -> HashSet is used to check the element is present or
        // not in constant time.
        Set<Integer> set = new HashSet<>();

        if(arr.length == 0) return 0;

        for (int num : arr) {
            set.add(num);
        }

        int maxLen = 0;
        for(int nums: set)
        {    
            if(!set.contains(nums - 1))
            {
                int currNum = nums;
                int currStreak = 1;
                while (set.contains(currNum+1)) {
                currNum = currNum + 1;
                currStreak = currStreak + 1;
            }
            maxLen = Math.max(maxLen, currStreak);
            }
        }
        return maxLen;
    }
}
