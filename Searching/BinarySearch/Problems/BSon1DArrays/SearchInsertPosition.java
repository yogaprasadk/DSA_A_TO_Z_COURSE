public class SearchInsertPosition {
    // https://leetcode.com/problems/search-insert-position/description/
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target = 5;
        System.out.println(searchInsert(arr,target));
    }

    /*
    Tc - O(n) Sc - O(1)
     public static int searchInsert(int[] nums,int target){
        int n = nums.length;
        int ans = n;
        for(int i = 0;i<n;i++){
            if(nusm[i]>=target){
                return i;
            }    
        }
        return ans;    
     }
     */
    // Tc - O(LOG N) Sc- O(1)
    public static int searchInsert(int[] nums, int target) { 
        int n = nums.length;
        int ans = n;
        int low = 0;
        int high = n - 1;
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] >= target){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
}
