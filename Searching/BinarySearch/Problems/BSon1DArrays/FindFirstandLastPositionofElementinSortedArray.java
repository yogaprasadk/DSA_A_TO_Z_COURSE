import java.util.Arrays;

public class FindFirstandLastPositionofElementinSortedArray {
    // https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
    public static void main(String[] args) {
        int[] arr = { 5, 7, 7, 8, 8, 10 };
        int target = 8;
        int[] ans = searchRange(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    
    public static int[] searchRange(int[] nums, int target) {
        int first = firstBS(nums, target);
        if (first == -1) {
            return new int[] {-1, -1};
        }
        int last = secondBS(nums, target);
        return new int[] { first, last };
    }

    public static int firstBS(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int first = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                first = mid;
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return first;
    }

    public static int secondBS(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int last = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                last = mid;
                low = mid + 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return last;
    }

    // brute
    /*
     * public static int[] searchRange(int[] nums, int target){
     * int len = nums.length;
     * int first = -1;
     * int last = -1;
     * for(int i = 0;i<len;i++)
     * {
     * if(nums[i] == target)
     * {
     * if(first == -1){
     * first = i;
     * }
     * last = i;
     * }
     * }
     * return new int[]{first,last};
     */

    /*
     * TC - O(2 Log2N) Sc - O(1);
     * public int searchRange(int[] nums,int target){
     * int low = lowerBound(nums,target);
     * int high = upperBound(nums,target);
     * if(low == nums.length || nums[low] != target){
     * return new int[]{-1,-1}
     * }
     * return new int[]{low,high-1};
     * 
     * }
     * 
     * public static int lowerBound(int[] arr,int target,int n){
     * int low = 0;
     * int high = n - 1;
     * int ans = n;
     * while(low <= high){
     * int mid = (low + high)/2;
     * if(arr[mid] >= target){
     * ans = mid;
     * high = mid - 1;
     * }
     * else{
     * low = mid + 1;
     * }
     * }
     * return ans;
     * }
     * 
     * public static int upperBound(int[] arr, int target) {
     * // code here
     * int n = arr.length;
     * int low = 0;
     * int high = n-1;
     * int ans = n;
     * while(low <= high){
     * int mid = (low + high) / 2;
     * if(arr[mid] > target){
     * ans = mid;
     * high = mid - 1;
     * }
     * else{
     * low = mid + 1;
     * }
     * }
     * return ans;
     * }
     */
}
