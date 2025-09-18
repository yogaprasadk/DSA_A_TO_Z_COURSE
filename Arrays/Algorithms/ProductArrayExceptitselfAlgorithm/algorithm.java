public class Algorithm{
    
        public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] ans =  productExceptSelf(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] productExceptSelf(int[] nums)
    {
        // Tc - O(N) SC - O(N)
        int n = nums.length;
        // Array to store all left multiplication
        int[] left = new int[n];
        // Array to store all right multiplication
        int[] right = new int[n];

        left[0] = 1;
        for (int i = 1;i<n;i++){
            left[i] = left[i-1] * nums[i-1];
        }

        right[n-1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i+1] * nums[i+1];         
        }

        int[] ans = new int[n];
        for (int index = 0; index < n; index++) {
            ans[index] = left[index] * right[index];
        }
        return ans;
    }

}