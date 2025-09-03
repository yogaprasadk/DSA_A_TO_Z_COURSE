import java.util.*;
//Leetcode - https://leetcode.com/problems/two-sum/
public class TwoSum {
    static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter Size: ");
        int size = S.nextInt();
        System.out.print("Enter Target: ");
        int target = S.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter Array Elements: ");
        for (int index = 0; index < arr.length; index++) {
            arr[index] = S.nextInt();
        }
        int[] ans = TwoSum(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] TwoSum(int[] arr,int target){
        //brute
        for (int i = 0; i < arr.length; i++) {
            for (int index = i+1; index < arr.length; index++) {
                if(arr[i] + arr[index] == target){
                    return new int[]{i,index};
                }
            }
        }
        return new int[]{};
        /* 
        better solution - 
         Map<Integer,Integer> ans = new Hashmap<Integer,Integer>();
          for(int i = 0;i<arr.length;i++){
              int nums = arr[i];
              int diff = target - nums;

              if(nums.containsKey(diff)){
                  return new int[]{ans.get(diff),i};
              }   
            ans.put(num,i);
          } 
           return new int[]{};



        */
    
    }

}
