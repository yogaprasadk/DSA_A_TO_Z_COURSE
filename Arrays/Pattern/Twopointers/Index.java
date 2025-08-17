package Pattern.Twopointers;

public class Index
{

    public static boolean hasPairWithSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return true;  // Pair found
            } else if (sum < target) {
                left++;  // Need a larger sum
            } else {
                right--;  // Need a smaller sum
            }
        }

        return false;  // No pair found
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 6, 8};
        int target = 10;
        System.out.println(hasPairWithSum(nums, target));  // true
    }
}
