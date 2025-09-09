import java.util.*;
public class LeaderInAnArray {

   // GFG = https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1
    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2};
        ArrayList<Integer> ans = leaders(arr);
        System.out.println(ans);
    }

    private static ArrayList<Integer> leaders(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        // brute -TC(O(N2)) Sc- (O(1)) 
        /*
            boolean leader = true;
           for(int i = 0;i<arr.length;i++){
               for(int j = i+1;j<arr.length;j++){
                if(arr[i] > arr[j]){
                    leader = false;
                }
               }
            if(leader == true){
                ans.add(arr[i]);
            }    
           }
        return ans;
        */
        // optimal - Time Complexity : O(N) Space Complexity: O(1)
        int max = Integer.MIN_VALUE;
        for(int i = arr.length - 1;i>=0;i--){
            if(arr[i] >= max){
                ans.add(arr[i]);
            }
            max = Math.max(max,arr[i]);
        }
        return ans;
    }
}
