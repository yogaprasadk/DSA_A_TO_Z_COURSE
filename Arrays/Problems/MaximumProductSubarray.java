// https://leetcode.com/problems/maximum-product-subarray/description/

public class MaximumProductSubarray {
    public static void main(String[] args) {
        int[] arr = {2,3,-2,4};
        int ans = maxProduct(arr);
        System.out.println(ans);
    }

    public static int maxProduct(int[] nums){
        // TC -O(N2) Sc - O(1)
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            int product = 1;
            for (int j = i; j < n; j++) {
                product = product * nums[i];
                max = Math.max(max,product);
            }
        }
        return max;
    }

    /*
     Product subarray sum optimal solution using prefix and suffix pattern
     public static int maxProduct(int[] nums){
            int n = nums.length;
            int prefix = 1;
            int suffix = 1;
            int max = Integer.MIN_VALUE;    
            for(int i = 0;i<n;i++){
               if(prefix == 0) prefix = 1;
               if(suffix == 0) suffix = 1; 
               prefix = prefix * nums[i]; 
               suffix = suffix * nums[n - i - 1];
               max = Math.max(max,Math.max(prefix,suffix));
            }
            return max;
     
     
     }
     */
}
