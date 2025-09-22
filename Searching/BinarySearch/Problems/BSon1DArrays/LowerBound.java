
// GFG = https://www.geeksforgeeks.org/problems/implement-lower-bound/1
public class LowerBound {
    public static void main(String[] args) {
        int arr[] = {2, 3, 7, 10, 11, 11, 25}; 
        int target = 9;
        int n = arr.length;
        int ans =  lowerBound(arr,target,n);
        System.out.println(ans);
    }
    // TC - O(Log N) Sc- O(1)
    public static int lowerBound(int[] arr,int target,int n){
        int low  = 0;
        int high = n - 1;
        int ans = n;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] >= target){
                ans  = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }


    /*
     brute force - TC O(N) SC O(1)
     public static void main(String args[]){
     
        int[] arr = {3,4,5,12,15};
        int target = 9;
        int n = arr.length;
        System.out.print(lowerBound(arr,target,n));
     }
     public static int lowerBound(int[] arr,int target,int n){
        int ans = target;
        for(int i = 0;i<n;i++){
            if(arr[i]>=x){
            return i;
            }
        }
        return n;
     }
     */
}