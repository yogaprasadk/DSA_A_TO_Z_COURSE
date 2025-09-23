public class FindMinimumrotartedSortedArray {
    // Leetcode -
    // https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 1, 2 };
        System.out.println(findMin(arr));
    }

    // Brute Tc - o(N) Sc - O(1)
    public static int findMin(int[] nums) {
        int len = nums.length;
        int ans = nums[0];
        for (int index = 1; index <= len - 1; index++) {
            if (nums[index] < ans) {
                ans = nums[index];
            }
        }
        return ans;
    }

    /* TC - O(log N) Sc -O(1)
     * public static int findMin(int[] nums){
     * int n = nums.length;
     * int low = 0;
     * int high = n - 1;
     * int ans = nums[0];
     * while(low <= high)
     * {
     * int mid = (low + high) / 2;
     * if(nums[low] <= nums[mid])
     * {
     * if(nums[low] < ans){
     * ans = nums[low];
     * }
     * low = mid + 1;
     * }
     * else
     * {
     * if(nums[mid] < ans){
     * ans = nums[mid];
     * }
     * high = mid - 1;
     * }
     * }
     * return ans;
     * }
     */
}
