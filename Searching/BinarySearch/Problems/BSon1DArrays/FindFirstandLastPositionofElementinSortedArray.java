import java.util.Arrays;

public class FindFirstandLastPositionofElementinSortedArray {
    // https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 8;
        int[] ans = searchRange(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] searchRange(int[] nums, int target){
        int low= 0;
        int high = nums.length - 1;
        while(low<=high){
            int mid = (low + high) / 2;
            if(nums[mid] == target){
                return new int[]{mid,mid+1};
            }

            else if(nums[mid] > target){
                low = mid + 1;
            }

            else{
                high = mid - 1;
            }
        }
        return new int[]{-1,-1};
    }
}
