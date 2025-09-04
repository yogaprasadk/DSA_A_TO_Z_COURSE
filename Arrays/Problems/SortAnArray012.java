import java.util.*;
// LeetCode - https://leetcode.com/problems/sort-colors/
public class SortAnArray012 {
    
    static Scanner S = new Scanner(System.in);
    
    public static void main(String[] args){
        System.out.println("Enter Size: ");
        int size = S.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter array elements");
        for(int i = 0;i<arr.length;i++){
            arr[i] = S.nextInt();
        }
        SortColors(arr);
    }

    // Brute Force - use Arrays.sort() - TC O(n logn) SC - O(1)

    // Better Solution - TC: O(n) Sc: o(n)
    public static void SortColors(int[] arr){
        int len = arr.length;
        int[] ans = new int[len];
        int j = 0;
        for(int i = 0;i<ans.length;i++){
            if(arr[i] == 0){
                ans[j] = arr[i];
                j++;    
            }
        }

        for(int i = 0;i<ans.length;i++){
            if(arr[i] == 1){
                ans[j] = arr[i];
                j++;    
            }
        }

        for(int i = 0;i<ans.length;i++){
            if(arr[i] == 2){
                ans[j] = arr[i];
                j++;    
            }
        }

        System.out.println(Arrays.toString(ans));
        // Optimal Solution : DNF - (DUTCH NATIONAL FLAG ALGORITHM)
    }
}
