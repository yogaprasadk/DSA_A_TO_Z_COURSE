import java.util.*;
public class MaximumSubArraySum{
    static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter Size: ");
        int size = S.nextInt();
        System.out.print("Enter array elements");
        int[] arr = new int[size];
        int ans  =  MaximumSubArray(arr);
        System.out.println("The answer is" + ans);
    }
    // brute
    public static int MaximumSubArray(int[] arr){
        //brute - Time Complexity: O(n3) Sc(O(1))
        int ans = 0;
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length;j++){
                int sum = 0;
                for(int k = i;k<=j;k++){
                    sum += arr[i];
                    ans = Math.max(ans,sum);
                }
            }
        }
        return ans;
        /*
        Better => Tc: O(n2) Sc:O(1)
        int ans = 0;
        for(int i = 0;i<arr.length;i++){
        int sum = 0;    
        for(int j = 0;j<arr.length;j++){
                
                    sum += arr[j];
                    ans = Math.max(ans,sum);
                
            }
        }
        return ans;
         */

         /*
          optimal - Kadane Algorithm
          */
    }
}