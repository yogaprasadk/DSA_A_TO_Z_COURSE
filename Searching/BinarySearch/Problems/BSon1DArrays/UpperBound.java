public class UpperBound {
    // GFG  => https://www.geeksforgeeks.org/problems/implement-upper-bound/1
    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 10, 11, 11, 25};
        int target = 9;
        System.out.println(upperBound(arr,target));
    }

    public static int upperBound(int[] arr, int target) {
        // code here
        // TC - O(LOG N) SC => O(1)
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int ans = n;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] > target){
                ans  = mid;
                high = mid - 1;
            }
            else{
                low  = mid + 1;
            }
        }
        return ans;
    }

    /*
        public static int upperBound(int[] arr,int target){
        
        int n = arr.length;
        int ans = n;
        for(int i = 0;i<n;i++){
        if(arr[i]>target)
            return i;
        }
        }
        return ans;
     */
}
