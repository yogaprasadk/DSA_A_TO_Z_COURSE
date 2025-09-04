import java.util.*;

public class LongestSubarrayWithSum {
    // GFG -
    // https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1

    static Scanner S = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter Size: ");
        int arrSize = S.nextInt();
        if (arrSize <= 0) {
            return;
        }
        System.out.print("Enter Array Elements: ");
        int[] arr = new int[arrSize];

        System.out.println("Enter K Elements: ");
        int k = S.nextInt();

        int result = longestSubarray(arr, k);
        System.out.println(result);
    }

    public static int longestSubarray(int[] arr, int k) {
        // code here
        // TC - O(n2) SC- O(1)
        int len = arr.length;
        int longest = 0;
        for (int i = 0; i < len; i++) {
            int sum = 0;
            for (int j = i; j < len; j++) {
                sum = sum + arr[j];
                if (sum == k) {
                    longest = Math.max(longest, j - i + 1);
                }
            }
        }
        return longest;
        /*
         * Better Solution
         * TC - O(N) SC - O(N)
         * public int longestSubarray(int[] arr, int k) {
         * // code here
         * long sum = 0;
         * int len = 0;
         * HashMap<Long,Integer> map = new HashMap<>();
         * for(int i = 0;i<arr.length;i++){
         * sum += arr[i];
         * if(sum == k){
         * len = Math.max(len,i+1);
         * }
         * long rem = sum - k;
         * if(map.containsKey(rem)){
         * len = Math.max(i - map.get(rem),len);
         * }
         * if(!map.containsKey(sum)){
         * map.put(sum,i);
         * }
         * }
         * return len;
         * }
         * 
         * Optimal solution - TC O(2n) Sc:O(1)
            long sum = arr[0];
            int maxLen = 0;
            int l en = arr.length;
            int left = 0; 
            int right = 0;
            while(right < len)
            {
                while(left <= right && sum > k){
                    sum = sum - arr[left];
                    left++;
                }
                if(sum == k){
                    maxLen = Math.max(maxLen,right - left + 1);
                }    
                right++;
                if(right < len){
                sum = sum + arr[right];
                }
            }
         */
    }

}