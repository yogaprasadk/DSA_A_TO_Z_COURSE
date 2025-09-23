// Leetcode -  

public class SearchinRotatedSortedArrayII {
    public static void main(String[] args) {
        int nums[] = {2,5,6,0,0,1,2};
        int target = 0;
        System.out.println(search(nums,target));
    }

    //brute tc - O(n) sc -O(1)
    public static boolean search(int[] nums,int target){
        int len = nums.length;
        for(int i = 0;i<len;i++){
            if(nums[i] == target){
                return true;
            }
        }
        return false;
    }

    /*
    Binary Search TC :- O(Log2 N)  (average Case) SC :- O(1)
    // if there are more duplicates we shrink then Tc - O(n/2) (Worst Case) SC O(1)   
    public static boolean search(int[] nums,int target){
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        while(low <= high)
        {
            int mid = (low + high)/2;
            if(nums[mid] == target){
                return true;
            }   

            // if array contains duplicates just shrink
            if(nums[low] == nums[mid] && nums[mid] == nums[high]){
                low = low + 1;
                high = high - 1;
                continue;
            }

            // check if array is sorted on left.
            if(nums[low] <= nums[mid]){
                if(nums[low] <= target && target <= nums[mid]){
                    high = mid - 1;
                }
                else{
                
                    low = mid + 1;
                }
            }

            else {
                if(nums[mid] <= target && target <= nums[high]){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
        
        }
    
    
        return false;
    
    
    
    
    }
    */
}
