
// Leetcode - https://leetcode.com/problems/merge-sorted-array/description/

import java.util.*;

public class Mergesortarraywithoutextraspace {
    static Scanner S = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter Size: ");
        int arrSize = S.nextInt();

        System.out.print("Enter Size: ");
        int numSize = S.nextInt();

        if (arrSize < 0) {
            System.out.println("Array size must be greater than 0.");
            return;
        }

        int[] arr = new int[arrSize+numSize];
        System.out.print("Enter Array1 Elements: ");

        for (int index = 0; index < arr.length; index++) {
            arr[index] = S.nextInt();
        }

        if (numSize < 0) {
            System.out.println("Array size must be greater than 0.");
            return;
        }

        int[] nums = new int[numSize];
        System.out.print("Enter Array2 Elements: ");
        
        for (int index = 0; index < nums.length; index++) {
            nums[index] = S.nextInt();
        }

        merge(arr,nums);
        S.close();
    }
    // Time Complexity: O(N Log N)
    private static void merge(int[] arr, int[] nums) {
        System.out.print("Enter m: ");
        int m = S.nextInt();

        System.out.print("Enter n: ");
        int n = S.nextInt();
        int left = 0,right = 0;

        for (int i = 0; i < arr.length; i++) {
            if(left<m){
                arr[left] = arr[i];
                left++;
            }
            else if(right<n){
                arr[i] = nums[right];
                right++;  
            }
        }

        /*
        short version code
         * for (int j = 0, i = m; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
         */
        
        System.out.println("Before Sorting: "+ Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("After Sorting: "+Arrays.toString(arr));
    }

    // O(M+N)
    /*
         public static void merge(int[] arr,int m,int[] nums,int n){
                int i = m - 1;
                int j = n - 1;
                int k = arr.length - 1;

                while(j>=0){
                
                    if(i>=0 && arr[i]>nums[j])
                    {
                        arr[k] = arr[i];
                        i--;
                        k--;
                    }

                    else{
                        arr[k] = nums[j];    
                        j--;
                        k--;
                    }
                }         
         }
     */


}