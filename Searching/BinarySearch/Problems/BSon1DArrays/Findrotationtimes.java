public class Findrotationtimes {
    // GFG - https://www.geeksforgeeks.org/problems/rotation4723/1
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(findKRotation(arr));
    }

    // Brute Tc - O(N) Sc - O(1) 
    public static int findKRotation(int[] arr){
        int n = arr.length;
        int index = 0;
        int ans = arr[0];
        for(int i = 1;i<= n - 1;i++){
            if(arr[i] < ans){
                ans = arr[i];
                index = i;
            }
        }
        return index;
    }

    //optimal tc- O(Log N) Sc - O(1)
    /*
    int n = nums.length;
     int low = 0;
     int high = n - 1;
     int ans = nums[0]; 
     int index = 0;
     while(low <= high)
     {
        int mid = (low + high) / 2;
        if(nums[low] <= nums[mid])
        {
            if(nums[low] < ans){
            ans = nums[low];
            index = low;
            }
            low = mid + 1;
        }
        else
        {
                if(nums[mid] < ans){
                    ans = nums[mid];
                    index = mid;
                }   
                    high = mid - 1;   
        }      
    } 
        return index;
    }

    */

}
