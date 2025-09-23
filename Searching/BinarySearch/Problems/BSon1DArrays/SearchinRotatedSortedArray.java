// Leetcode - https://leetcode.com/problems/search-in-rotated-sorted-array/

public class SearchinRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        System.out.println(search(arr, target));
    }

    // brute - TC - O(n) SC - O(n)
    public static int search(int[] nums, int target) {
        int len = nums.length;
        int ans = -1;
        for (int i = 0; i < len; i++) {
            if (nums[i] == target) {
                ans = i;
            }
        }
        return ans;
    }

    // Time Complexity - O(Log N) SC - O(1)
    /*
     * public static int search(int[] arr,int target){
     * int n = arr.length;
     * int low = 0;
     * int high = n - 1;
     * while(low <= high)
     * {
     * int mid = (low + high) / 2;
     * if(arr[mid] == target){
     * return mid;
     * }
     * 
     // left sorted
     * else if(arr[low] <= arr[mid]){
     * if(arr[low] <= target && target <= arr[mid]){
     * high = mid - 1;
     * }
     * 
     * else{
     * low = mid + 1;
     * }
     * }
     // right sorted.
     * else{
     * if(arr[mid] <= target && target <= arr[high]){
     * low = mid + 1;
     * }
     * else{
     *  high = mid - 1;
     * }
     * }
     * }
     * return -1;
     * }
     */

}